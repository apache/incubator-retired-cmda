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

import models.NasaRegistration;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.APICall.ResponseType;
import views.html.index;
import views.html.sensors;
import views.html.registration.*;
import views.html.estimator.*;
import views.html.climate.*;
import views.html.climate.tutorial;
import util.*;
import models.metadata.ClimateService;
import models.metadata.NasaRMdata;
import models.metadata.Sensor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;

public class NasaRegistrationController extends Controller {
	//final static Form<Sensor> sensorForm = Form.form(Sensor.class);
	final static Form<NasaRegistration> userForm = Form
			.form(NasaRegistration.class);

	public static Result registrationForm() {
		return ok(userRegistrationForm.render(userForm));
	}
	
	public static Result addUserForm(){
		return ok(addUserForm.render(userForm));
	}
	
	public static Result updateForm() {
		return ok(updateUserForm.render(userForm));
	}
	
	public static Result deleteForm(){
		return ok(deleteUser.render(userForm));
	}
	
	public static Result adminPage(){
		return ok(adminPage.render(NasaRegistration.all()));
	}

	public static Result getAllUsers(){
		return ok(allUsers.render(NasaRegistration.getAllUser(), userForm));
	}
	

	// Registration
	public static Result submit() {

		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
		
		//Calling method to get values from the form
		JsonObject getJsonValues = new JsonObject();
		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "submit");

		String urlStr = "http://einstein.sv.cmu.edu:9000/addContestUser";
		// Sample data
		try {
			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "register");
		}

		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		return redirect(routes.EstimateController.login());
	}
	
	public static Result addUser() {

//		Form<NasaRegistration> filledForm = userForm.bindFromRequest();
//		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
//		JsonObject getJsonValues = new JsonObject();
//		
//		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "update");
//		
//		String urlStr = "http://einstein.sv.cmu.edu:9000/updateContestUser";
//
//		try {
//			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "update");
//		}
//		 
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
//		}
		Form<NasaRegistration> dc = userForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {

			String userName = dc.field("userNameField").value();
			if (userName != null && !userName.isEmpty()) {
				jsonData.put("userName", userName);
			}
			
			String password = dc.field("passwordField").value();
			if (password != null && !password.isEmpty()) {
				jsonData.put("password", password);
			}
			jsonData.put("firstName", dc.field("fNameField").value());    //TODO, since we don't have login/account id yet use a default val
			jsonData.put("middleInitial", dc.field("mNameField").value());
			jsonData.put("lastName", dc.field("lNameField").value());
			jsonData.put("affiliation", dc.field("affliationField").value());
			jsonData.put("email", dc.field("emailField").value());
			jsonData.put("researchFields", dc.field("rAreaField").value());

			// create the item by calling the API
			JsonNode response = NasaRegistration.create(jsonData);

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

		return ok(allUsers.render(NasaRegistration.getAllUser(), userForm));
	}
	
	public static Result update() {
		DynamicForm dc = DynamicForm.form().bindFromRequest();
		String id = dc.field("pk").value();
		
		//Form<NasaRegistration> dc = userForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {
			
//			String userName = dc.field("userNameField").value();
//			System.out.println("id "+id);
//			System.out.println("username "+userName);
//			if (userName != null && !userName.isEmpty()) {
//				jsonData.put("userName", userName);
//			}
//			
//			String password = dc.field("passwordField").value();
//			if (password != null && !password.isEmpty()) {
//				jsonData.put("password", password);
//			}
//			jsonData.put("firstName", dc.field("fNameField").value());    //TODO, since we don't have login/account id yet use a default val
//			jsonData.put("middleInitial", dc.field("mNameField").value());
//			jsonData.put("lastName", dc.field("lNameField").value());
//			jsonData.put("affiliation", dc.field("affliationField").value());
//			jsonData.put("email", dc.field("emailField").value());
//			jsonData.put("researchFields", dc.field("rAreaField").value());

			NasaRegistration originalUser = NasaRegistration.findUserByName(id);
			if (originalUser == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original user " + id);
			}

			jsonData.put("userName", originalUser.getfNameField());
			jsonData.put("password", originalUser.getPasswordField());
			jsonData.put("firstName", originalUser.getfNameField());
			jsonData.put("middleInitial", originalUser.getMiddleName());
			jsonData.put("lastName", originalUser.getLastName());
			jsonData.put("affiliation", originalUser.getAffliation());
			jsonData.put("email", originalUser.getEmail());
			jsonData.put("researchFields", originalUser.getResearchArea());
			
			String editField = dc.field("name").value();
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, dc.field("value").value());
			}
			System.out.println(editField);
			// create the item by calling the API
			JsonNode response = NasaRegistration.update(id, jsonData);

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
		return ok(allUsers.render(NasaRegistration.getAllUser(), userForm));
	}
	
	public static Result delete() {

//		Form<NasaRegistration> filledForm = userForm.bindFromRequest();
//		Map<String, String[]> regFormEncoded = request().body().asFormUrlEncoded();
//	
//		JsonObject getJsonValues = new JsonObject();
//		
//		getJsonValues  = util.EstimatorGetValues.getMode(regFormEncoded, "delete");
//
//		String urlStr = "http://einstein.sv.cmu.edu:9000/deleteContestUser";
//		
//		try {
//
//			
//			
//			urlStr = urlStr + '/' + getJsonValues.get("userName").getAsString() + '/'
//			       		+ getJsonValues.get("password").getAsString();
//			
//			EstimatorAPICalls.HttpUserReg(urlStr, getJsonValues, "delete");
//						 		 
//		}
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
//		}
//
//		return redirect(routes.NasaRegistrationController.registrationForm());
		
		Form<NasaRegistration> dc = userForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {

			String userName = dc.field("userNameField").value();
//			if (userName != null && !userName.isEmpty()) {
//				jsonData.put("username", userName);
//			}
			
			String password = dc.field("passwordField").value();
//			if (password != null && !password.isEmpty()) {
//				jsonData.put("password", password);
//			}

			// create the item by calling the API
			JsonNode response = NasaRegistration.delete(jsonData, userName, password);
			System.out.println(response);
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
		return ok(allUsers.render(NasaRegistration.getAllUser(), userForm));
	}
}
