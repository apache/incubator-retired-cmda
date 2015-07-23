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



package models;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import models.metadata.ClimateService;
import models.metadata.NasaRMdata;
import util.APICall;

import com.fasterxml.jackson.databind.JsonNode;

public class NasaRegistration {
	public String id;
	public String userName;
	public String password;
	public String firstName;
	public String lastName;
	public String mName;
	public String affliation;
	public String email;
	public String researchArea;
	public String goal;
	public String algo;
	public String budgetConcerns;
	public String awsFamiliarity;

	private static final String GET_ALL_USER_DATA = "http://einstein.sv.cmu.edu:9000/getAllContestUsers/json";
	private static final String GET_ALL_USER_DATA_NEW = "http://localhost:9020/users/getAllUsers/json";
	
	private static final String ADD_USER_CALL = "http://einstein.sv.cmu.edu:9020/users/add";
	private static final String UPDATE_USER_CALL = "http://einstein.sv.cmu.edu:9020/users/update/";
	private static final String DELETE_USER_CALL = "http://einstein.sv.cmu.edu:9020/users/delete/";
	
	public NasaRegistration() {

	}

	public NasaRegistration(String userNameField, String passwordField,
			String fNameField, String lNameField, String emailField,
			String rAreaField, String goalField, String algoField,
			String bConcernsField, String awsFamiliarityField,
			String mNameField, String affiliationField) {
		super();
		this.userName = userNameField;
		this.password = passwordField;
		this.firstName = fNameField;
		this.email = emailField;
		this.mName = mNameField;
		this.affliation = affiliationField;
		this.researchArea = rAreaField;
		this.goal = goalField;
		this.algo = algoField;
		this.budgetConcerns = bConcernsField;
		this.awsFamiliarity = awsFamiliarityField;

	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMiddleName(String mName){
		this.mName = mName;
	}
	
	public String getMiddleName(){
		return mName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAffliation() {
		return affliation;
	}

	public void setAffliation(String affliation) {
		this.affliation = affliation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResearchArea() {
		return researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getAlgo() {
		return algo;
	}

	public void setAlgo(String algo) {
		this.algo = algo;
	}

	public String getBudgetConcerns() {
		return budgetConcerns;
	}

	public void setBudgetConcerns(String budgetConcerns) {
		this.budgetConcerns = budgetConcerns;
	}

	public String getAwsFamiliarity() {
		return awsFamiliarity;
	}

	public void setAwsFamiliarity(String awsFamiliarity) {
		this.awsFamiliarity = awsFamiliarity;
	}

	public String getUserNameField() {
		return userName;
	}

	public void setUserNameField(String userNameField) {
		this.userName = userNameField;
	}

	public String getPasswordField() {
		return password;
	}

	public void setPasswordField(String passwordField) {
		this.password = passwordField;
	}

	public String getfNameField() {
		return firstName;
	}

	public void setfNameField(String fNameField) {
		this.firstName = fNameField;
	}

	public static List<NasaRegistration> all() {
		List<NasaRegistration> allUsers = new ArrayList<NasaRegistration>();
		
		// Call the API to get the json string
		JsonNode usersNode = APICall.callAPI(GET_ALL_USER_DATA_NEW);
		// if no value is returned or error or is not json array
		if (usersNode == null || usersNode.has("error") || !usersNode.isArray()) {
			return allUsers;
		}

		// parse the json string into object
		for (int i = 0; i < usersNode.size(); i++) {
			JsonNode json = usersNode.path(i);
			NasaRegistration getUser = new NasaRegistration();

			getUser.setUserNameField(json.findPath("userName").asText());
			getUser.setPasswordField(json.findPath("password").asText());
			getUser.setfNameField(json.findPath("firstName").asText());
			getUser.setEmail("static email");
			getUser.setGoal("static goal");

			System.out.println("UserName:" + getUser.getfNameField());

			allUsers.add(getUser);
		}

		return allUsers;

	}
	
	public static List<NasaRegistration> getAllUser() {
		List<NasaRegistration> allUsers = new ArrayList<NasaRegistration>();
		
		// Call the API to get the json string
		JsonNode usersNode = APICall.callAPI(GET_ALL_USER_DATA_NEW);
		// if no value is returned or error or is not json array
		if (usersNode == null || usersNode.has("error") || !usersNode.isArray()) {
			return allUsers;
		}

		// parse the json string into object
		for (int i = 0; i < usersNode.size(); i++) {
			JsonNode json = usersNode.path(i);
			NasaRegistration getUser = new NasaRegistration();

			getUser.setId(json.findPath("id").asText());
			getUser.setUserNameField(json.findPath("userName").asText());
			getUser.setPasswordField(json.findPath("password").asText());
			getUser.setfNameField(json.findPath("firstName").asText());
			getUser.setMiddleName(json.findPath("middleInitial").asText());
			getUser.setLastName(json.findPath("lastName").asText());
			getUser.setAffliation(json.findPath("affiliation").asText());
			getUser.setEmail(json.findPath("email").asText());
			getUser.setResearchArea(json.findPath("researchFields").asText());

			//System.out.println("UserName:" + getUser.getfNameField());

			allUsers.add(getUser);
		}

		return allUsers;

	}

	public static String getUserInfo(String userName, String password) {
		// System.out.println("Reached in getUserInfo:" + userName);
		// System.out.println("Reached in password:" + password);

		List<NasaRegistration> allUsers = new ArrayList<NasaRegistration>();
		String GET_IND_USER_DATA = "http://einstein.sv.cmu.edu:9000/getContestUser/";
		GET_IND_USER_DATA = GET_IND_USER_DATA + userName + '/' + password + '/'
				+ "json";
		// Call the API to get the json string
		JsonNode usersNode = APICall.callAPI(GET_IND_USER_DATA);

		System.out.println("Output1:" + GET_IND_USER_DATA);
		// System.out.println("Value inside getUserInfo:" +
		// usersNode.path(0).findPath("userName").asText());
		System.out.println("Check:" + usersNode.toString());
		// if no value is returned or error or is not json array
		if (usersNode == null || usersNode.has("error")) {
			System.out.println("inside userNode check");
			return null;
		}
		System.out.println("userName response:" + usersNode.get("userName"));
		System.out.println("userName:" + userName);
		System.out.println("password:" + usersNode.get("password"));

		if (usersNode.get("userName").textValue().equals(userName)
				&& usersNode.get("password").textValue().equals(password)) {
			System.out.println("Comes inside the if block");
			return usersNode.get("firstName").textValue();
		} else {
			System.out.println("Does not come inside the if clause");
			return null;
		}

		// parse the json string into object
		/*
		 * for (int i = 0; i < usersNode.size(); i++) { JsonNode json =
		 * usersNode.path(i); NasaRegistration getUser = new NasaRegistration();
		 * 
		 * getUser.setUserNameField(json.findPath("userName").asText());
		 * getUser.setPasswordField(json.findPath("password").asText());
		 * getUser.setfNameField(json.findPath("firstName").asText());
		 * 
		 * if(getUser.getUserNameField().equals(userName) &&
		 * getUser.getPasswordField().equals(password)){
		 * System.out.println("inside check of username and password"); return
		 * true; } else return false;
		 * 
		 * System.out.println("UserName:" + getUser.getfNameField());
		 * 
		 * allUsers.add(getUser); }
		 */

	}
	
	public static NasaRegistration findUserByName(String userId){
		List<NasaRegistration> allList = getAllUser();
		for (NasaRegistration element : allList) {
			String elementUri = element.getId();
			if (elementUri.equals(userId))
				return element;
		}
		return null;
	}
	
	public static JsonNode create(JsonNode jsonData) {
		return APICall.postAPI(ADD_USER_CALL, jsonData);
	}

	public static JsonNode update(String id, JsonNode jsonData) {
		System.out.println(UPDATE_USER_CALL+id);
		
		return APICall.putAPI(UPDATE_USER_CALL+id, jsonData);
	}
	
	public static JsonNode delete(JsonNode jsonData, String username, String password) throws UnsupportedEncodingException{
		System.out.println(DELETE_USER_CALL+"userName/"+ URLEncoder.encode(username, "UTF-8") +"/password/"+ URLEncoder.encode(password, "UTF-8"));
		return APICall.deleteAPI(DELETE_USER_CALL+"userName/"+ URLEncoder.encode(username, "UTF-8") +"/password/"+ URLEncoder.encode(password, "UTF-8"));
	}
}
