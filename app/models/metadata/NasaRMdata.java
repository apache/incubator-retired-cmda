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
package models.metadata;

import java.util.*;
import util.APICall;
import com.fasterxml.jackson.databind.*;

public class NasaRMdata {

	private String userNameField;
	private String passwordField;
	private String fNameField;
	private String lNameField;
	private String mNameField;
	private String affliationField;
	private String emailField;
	private String rAreaField;
	private String goalField;
	private String algoField;
	private String bConcernsField;
	private String awsFamiliarityField;

	private List<String> sensorTypeNames = new ArrayList<String>();

	// http://einstein.sv.cmu.edu/get_devices/json
	private static final String ADD_NEW_USER_URL = util.NasaConstants.NASA_REG_URL
			+ util.NasaConstants.ADD_USER;
	private static final String GET_ALL_USER_DATA = "http://einstein.sv.cmu.edu:9000/getAllContestUsers/json";

	private static final String DELETE_USER_URL = util.NasaConstants.NASA_REG_URL
			+ util.NasaConstants.DELETE_USER;

	// Constructors
	public NasaRMdata() {
	}

	public NasaRMdata(String userNameField, String passwordField,
			String fNameField, String lNameField, String mNameField,
			String affliationField, String emailField, String rAreaField,
			String goalField, String algoField, String bConcernsField,
			String awsFamiliarityField) {
		super();
		this.userNameField = userNameField;
		this.passwordField = passwordField;
		this.fNameField = fNameField;
		this.lNameField = lNameField;
		this.mNameField = mNameField;
		this.affliationField = affliationField;
		this.emailField = emailField;
		this.rAreaField = rAreaField;
		this.goalField = goalField;
		this.algoField = algoField;
		this.bConcernsField = bConcernsField;
		this.awsFamiliarityField = awsFamiliarityField;
	}

	

	public String getUserNameField() {
		return userNameField;
	}

	public void setUserNameField(String userNameField) {
		this.userNameField = userNameField;
	}

	public String getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(String passwordField) {
		this.passwordField = passwordField;
	}

	public String getfNameField() {
		return fNameField;
	}

	public void setfNameField(String fNameField) {
		this.fNameField = fNameField;
	}

	public String getlNameField() {
		return lNameField;
	}

	public void setlNameField(String lNameField) {
		this.lNameField = lNameField;
	}

	public String getmNameField() {
		return mNameField;
	}

	public void setmNameField(String mNameField) {
		this.mNameField = mNameField;
	}

	public String getAffliationField() {
		return affliationField;
	}

	public void setAffliationField(String affliationField) {
		this.affliationField = affliationField;
	}

	public String getEmailField() {
		return emailField;
	}

	public void setEmailField(String emailField) {
		this.emailField = emailField;
	}

	public String getrAreaField() {
		return rAreaField;
	}

	public void setrAreaField(String rAreaField) {
		this.rAreaField = rAreaField;
	}

	public String getGoalField() {
		return goalField;
	}

	public void setGoalField(String goalField) {
		this.goalField = goalField;
	}

	public String getAlgoField() {
		return algoField;
	}

	public void setAlgoField(String algoField) {
		this.algoField = algoField;
	}

	public String getbConcernsField() {
		return bConcernsField;
	}

	public void setbConcernsField(String bConcernsField) {
		this.bConcernsField = bConcernsField;
	}

	public String getAwsFamiliarityField() {
		return awsFamiliarityField;
	}

	public void setAwsFamiliarityField(String awsFamiliarityField) {
		this.awsFamiliarityField = awsFamiliarityField;
	}

	public List<String> getSensorTypeNames() {
		return sensorTypeNames;
	}

	public void setSensorTypeNames(List<String> sensorTypeNames) {
		this.sensorTypeNames = sensorTypeNames;
	}

	/**
	 * Method to call the API to add a new device type
	 * 
	 * @param jsonData
	 * @return the response json from the API server
	 */
	public static JsonNode create(JsonNode jsonData) {
		return APICall.postAPI(ADD_NEW_USER_URL, jsonData);
	}

	/**
	 * Method to call the API to delete a device type with its id
	 * 
	 * @param id
	 * @return the response json from the API server
	 */
	public static JsonNode delete(String deviceTypeName) {
		return APICall.deleteAPI(DELETE_USER_URL + deviceTypeName);
	}

	public static List<NasaRMdata> all() {
		List<NasaRMdata> allUsers = new ArrayList<NasaRMdata>();

		// Call the API to get the json string
		JsonNode usersNode = APICall.callAPI(GET_ALL_USER_DATA);

		// if no value is returned or error or is not json array
		if (usersNode == null || usersNode.has("error") || !usersNode.isArray()) {
			return allUsers;
		}

		// parse the json string into object
		for (int i = 0; i < usersNode.size(); i++) {
			JsonNode json = usersNode.path(i);
			NasaRMdata newUser = new NasaRMdata();

			newUser.setUserNameField(json.findPath("userName").asText());
			newUser.setPasswordField(json.findPath("password").asText());
			newUser.setfNameField(json.findPath("firstName").asText());
			
			allUsers.add(newUser);
		}

		return allUsers;

	}

}
