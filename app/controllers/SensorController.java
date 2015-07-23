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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.metadata.Sensor;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

public class SensorController extends Controller {

	final static Form<Sensor> sensorForm = Form.form(Sensor.class);

	public static Result sensors() {
		return ok(sensors.render(Sensor.all(), sensorForm));
	}

	public static Result newSensor() {
		Form<Sensor> dc = sensorForm.bindFromRequest();

		ObjectNode jsonData = Json.newObject();
		try {
			String sensorName = dc.field("sensorName").value();
			
			// should not contain spaces
			if (sensorName != null && !sensorName.isEmpty()
					&& !sensorName.contains(" ")) {
				jsonData.put("sensorName", sensorName);
			}

			jsonData.put("sensorTypeName", dc.field("sensorTypeName").value());
			jsonData.put("deviceUri", dc.field("deviceUri").value());
			jsonData.put("sensorUserDefinedFields",
					dc.field("sensorUserDefinedFields").value());

			// create the item by calling the API
			JsonNode response = Sensor.create(jsonData);

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
		return redirect("/sensors");
	}
	
	public static Result editSensor() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			String sensorName = df.field("pk").value();

			if (sensorName != null && !sensorName.isEmpty()) {
				jsonData.put("sensorName", sensorName);
			}

			String editField = df.field("name").value();  
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			// Call the edit() method
			JsonNode response = Sensor.edit(jsonData);

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

	public static Result deleteSensor() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String sensorName = df.field("idHolder").value();

		// return a text message

		// Call the delete() method
		JsonNode response = Sensor.delete(sensorName);

		// flash the response message
		Application.flashMsg(response);

		return redirect("/sensors");
	}
}
