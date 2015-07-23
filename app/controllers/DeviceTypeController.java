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

import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

import play.libs.Json;
import models.metadata.DeviceType;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

//@Security.Authenticated(Secured.class)
public class DeviceTypeController extends Controller {
	final static Form<DeviceType> deviceTypeForm = Form.form(DeviceType.class);

	public static Result deviceTypes() {
		// if (Secured.isLoggedIn())
		// return ok(deviceTypes.render(DeviceType.all(), deviceTypeForm));
		// else
		// return forbidden();
		return ok(deviceTypes.render(DeviceType.all(), deviceTypeForm));
	}

	public static Result newDeviceType() {
		// Form<DeviceType> dt = deviceTypeForm.bindFromRequest();
		Map<String, String[]> dtFormEncoded = request().body()
				.asFormUrlEncoded();
		try {
			ObjectNode jsonData = Json.newObject();
			String deviceTypeName = dtFormEncoded.get("deviceTypeName")[0];

			// should not contain spaces
			if (deviceTypeName != null && !deviceTypeName.isEmpty()
					&& !deviceTypeName.contains(" ")) {
				jsonData.put("deviceTypeName", deviceTypeName);
			}
			jsonData.put("manufacturer", dtFormEncoded.get("manufacturer")[0]);
			jsonData.put("version", dtFormEncoded.get("version")[0]);
			jsonData.put("deviceTypeUserDefinedFields",
					dtFormEncoded.get("deviceTypeUserDefinedFields")[0]);

			ArrayNode arrayNode = jsonData.putArray("sensorTypeNames");
			for (int i = 0; i < dtFormEncoded.get("sensorTypeNames").length; i++) {
				arrayNode.add(dtFormEncoded.get("sensorTypeNames")[i]);
			}

			// create the item by calling the API
			JsonNode response = DeviceType.create(jsonData);

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
		return redirect("/deviceTypes");
	}

	public static Result editDeviceType() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			String deviceTypeName = df.field("pk").value();

			if (deviceTypeName != null && !deviceTypeName.isEmpty()) {
				jsonData.put("deviceTypeName", deviceTypeName);
			}

			String editField = df.field("name").value();  
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}

			// Call the edit() method
			JsonNode response = DeviceType.edit(deviceTypeName, jsonData);

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

	public static Result deleteDeviceType() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String deviceTypeName = df.field("idHolder").value();

		// Call the delete() method
		JsonNode response = DeviceType.delete(deviceTypeName);

		// flash the response message
		Application.flashMsg(response);
		return redirect("/deviceTypes");

	}
}