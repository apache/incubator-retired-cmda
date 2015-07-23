/*
 * Copyright (c) 2013 Carnegie Mellon University Silicon Valley. 
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available
 * under the terms of dual licensing(GPL V2 for Research/Education
 * purposes). GNU Public License v2.0 which accompanies this distribution
 * is available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * Please contact http://www.cmu.edu/silicon-valley/ if you have any 
 * questions.
 * 
 * */
package controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.metadata.SensorCategory;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

public class SensorCategoryController extends Controller {
	final static Form<SensorCategory> sensorCategoryForm = Form
			.form(SensorCategory.class);

	public static Result sensorCategories() {
		return ok(sensorCategories.render(SensorCategory.all(),
				sensorCategoryForm));
	}

	public static Result newSensorCategory() {
		Form<SensorCategory> dc = sensorCategoryForm.bindFromRequest();

		ObjectNode jsonData = Json.newObject();
		try {

			String sensorCategoryName = dc.field("Name").value();
			
			// name should not contain spaces
			if (sensorCategoryName != null && !sensorCategoryName.isEmpty()
					&& !sensorCategoryName.contains(" ")) {
				jsonData.put("sensorCategoryName", sensorCategoryName);
			}
			jsonData.put("purpose", dc.field("Purpose").value());

			// create the item by calling the API
			JsonNode response = SensorCategory.create(jsonData);

			// flash the response message
			Application.flashMsg(response);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return redirect("/sensorCategories");
	}

	public static Result editSensorCategory() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			String sensorCategoryName = df.field("pk").value();

			if (sensorCategoryName != null && !sensorCategoryName.isEmpty()) {
				jsonData.put("sensorCategoryName", sensorCategoryName);
			}

			String editField = df.field("name").value();  
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}

			// Call the edit() method
			JsonNode response = SensorCategory.edit(jsonData);

			// flash the response message
			Application.flashMsg(response);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok("updated");

	}

	public static Result deleteSensorCategory() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String sensorCategoryName = df.field("idHolder").value();

		// return a text message

		// Call the delete() method
		JsonNode response = SensorCategory.delete(sensorCategoryName);

		// flash the response message
		Application.flashMsg(response);

		return redirect("/sensorCategories");
	}

	public static Result downloadSensorCategory() {
		List<SensorCategory> user = SensorCategory.all();
		// 1. Convert Java object to JSON format
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("user.json");
		try {
			mapper.writeValue(file, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response().setContentType("application/x-download");
		response().setHeader("Content-disposition",
				"attachment; filename=user.json");
		return ok(file);
	}
}