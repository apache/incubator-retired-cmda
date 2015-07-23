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

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

import models.metadata.SensorType;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

public class SensorTypeController extends Controller {
	final static Form<SensorType> sensorTypeForm = Form.form(SensorType.class);

	public static Result sensorTypes() {
		return ok(sensorTypes.render(SensorType.all(), sensorTypeForm));
	}

	public static Result newSensorType() {
		Form<SensorType> st = sensorTypeForm.bindFromRequest();

		ObjectNode jsonData = Json.newObject();

		try {

			String sensorTypeName = st.field("sensorTypeName").value();

			// should not contain spaces
			if (sensorTypeName != null && !sensorTypeName.isEmpty()
					&& !sensorTypeName.contains(" ")) {
				jsonData.put("sensorTypeName", sensorTypeName);
			}
			jsonData.put("manufacturer", st.field("manufacturer").value());

			String version = st.field("version").value();
			if (version != null && !version.isEmpty()) {
				jsonData.put("version", Double.valueOf(version));
			}
			String maximumValue = st.field("maximumValue").value();
			if (maximumValue != null && !maximumValue.isEmpty()) {
				jsonData.put("maximumValue", Double.valueOf(maximumValue));
			}
			String minimumValue = st.field("minimumValue").value();
			if (minimumValue != null && !minimumValue.isEmpty()) {
				jsonData.put("minimumValue", Double.valueOf(minimumValue));
			}
			String unit = st.field("unit").value();
			if (unit != null && !unit.isEmpty()) {
				jsonData.put("unit", unit);
			}
			String interpreter = st.field("interpreter").value();
			if (interpreter != null && !interpreter.isEmpty()) {
				jsonData.put("interpreter", interpreter);
			}
			jsonData.put("sensorCategoryName", st.field("sensorCategoryName")
					.value());
			jsonData.put("sensorTypeUserDefinedFields",
					st.field("sensorTypeUserDefinedFields").value());

			// create the item by calling the API
			JsonNode response = SensorType.create(jsonData);

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

		return redirect("/sensorTypes");
	}

	public static Result editSensorType() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			String sensorTypeName = df.field("pk").value();

			if (sensorTypeName != null && !sensorTypeName.isEmpty()) {
				jsonData.put("sensorTypeName", sensorTypeName);
			}

			String editField = df.field("name").value();  
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			// Call the edit() method
			JsonNode response = SensorType.edit(jsonData);

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
	
	public static Result deleteSensorType() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String sensorTypeName = df.field("idHolder").value();

		// Call the delete() method
		JsonNode response = SensorType.delete(sensorTypeName);

		// flash the response message
		Application.flashMsg(response);

		return redirect("/sensorTypes");
	}
}
