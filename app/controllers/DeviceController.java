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

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.metadata.Device;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

public class DeviceController extends Controller {
	final static Form<Device> deviceForm = Form.form(Device.class);

	public static Result devices() {
		return ok(devices.render(Device.all(), deviceForm));
	}

	public static Result newDevice() {
		Form<Device> dc = deviceForm.bindFromRequest();

		ObjectNode jsonData = Json.newObject();
		try {

			String uri = dc.field("uri").value();
			if (uri != null && !uri.isEmpty() && !uri.contains(" ")) {
				jsonData.put("uri", dc.field("uri").value());
			}
			jsonData.put("deviceTypeName", dc.field("deviceTypeName").value());

			ObjectNode locationData = Json.newObject();
			locationData.put("representation", dc.field("representation")
					.value());

			String longitude = dc.field("longitude").value();
			if (longitude != null && !longitude.isEmpty()) {
				locationData.put("longitude", longitude);
			}
			String latitude = dc.field("latitude").value();
			if (latitude != null && !latitude.isEmpty()) {
				locationData.put("latitude", latitude);
			}
			String altitude = dc.field("altitude").value();
			if (altitude != null && !altitude.isEmpty()) {
				locationData.put("altitude", altitude);
			}

			jsonData.put("location", locationData);

			jsonData.put("deviceUserDefinedFields",
					dc.field("deviceUserDefinedFields").value());

			// create the item by calling the API
			JsonNode response = Device.create(jsonData);

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
		return redirect("/devices");
	}
	
	public static Result editDevice() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			String deviceUri = df.field("pk").value();
			
			if (deviceUri == null || deviceUri.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found device uri "+deviceUri);
			}
			// if not found, it is an empty device
			Device originalDevice = Device.findDeviceByUri(deviceUri);
			if (originalDevice == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original device uri "+deviceUri);
			}
			

			String editField = df.field("name").value();
			if (editField == null || editField.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found edit field");
			}
			
			jsonData.put("deviceUri", deviceUri);
			
			// put the original location data
			ObjectNode location = Json.newObject();
			location.put("longitude", originalDevice.getLongitude());
			location.put("latitude", originalDevice.getLatitude());
			location.put("altitude", originalDevice.getAltitude());
			location.put("representation", originalDevice.getRepresentation());
			
			if (editField.equals("deviceUserDefinedFields")) {
				jsonData.put(editField, df.field("value").value());
			}else{
				jsonData.put("deviceUserDefinedFields", originalDevice.getDeviceUserDefinedFields());
				location.put(editField, df.field("value").value());
			}
			
			// put the location
			jsonData.put("location", location);
			
			// Call the edit() method
			JsonNode response = Device.edit(deviceUri, jsonData);

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
	
	public static Result deleteDevice() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String id = df.field("idHolder").value();

		// Call the delete() method
		JsonNode response = Device.delete(id);

		// flash the response message
		Application.flashMsg(response);
		return redirect("/devices");

	}
}