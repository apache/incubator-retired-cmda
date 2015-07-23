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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.databind.JsonNode;

import util.APICall;

/**
 * @author lyman
 *
 */
public class Sensor {
	private String id;
	private String sensorName;
	// private SensorType sensorType;
	// private Device device;
	private String sensorTypeName;
	private String deviceUri;
	private String sensorCategoryName;
	private String sensorUserDefinedFields;

	public Sensor() {

	}

	// http://einstein.sv.cmu.edu/get_sensors/json
	private static final String GET_SENSORS_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_SENSORS + util.Constants.FORMAT;

	private static final String DELETE_SENSOR_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_DELETE_SENSOR;
	private static final String ADD_SENSOR_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_ADD_SENSOR;
	private static final String EDIT_SENSOR_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_EDIT_SENSOR;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	// public Device getDevice() {
	// return device;
	// }
	// public void setDevice(Device device) {
	// this.device = device;
	// }

	public String getDeviceUri() {
		return deviceUri;
	}

	public void setDeviceUri(String deviceUri) {
		this.deviceUri = deviceUri;
	}

	public String getSensorTypeName() {
		return sensorTypeName;
	}

	public void setSensorTypeName(String sensorTypeName) {
		this.sensorTypeName = sensorTypeName;
	}

	public String getSensorCategoryName() {
		return sensorCategoryName;
	}

	public void setSensorCategoryName(String sensorCategoryName) {
		this.sensorCategoryName = sensorCategoryName;
	}

	public String getSensorUserDefinedFields() {
		return sensorUserDefinedFields;
	}

	public void setSensorUserDefinedFields(String sensorUserDefinedFields) {
		this.sensorUserDefinedFields = sensorUserDefinedFields;
	}


	/**
	 * Method to display all sensors
	 * 
	 * @return a list of all sensors
	 */
	public static List<Sensor> all() {
		List<Sensor> allSensors = new ArrayList<Sensor>();

		// Call the API to get the json string
		JsonNode sensorsNode = APICall.callAPI(GET_SENSORS_CALL);

		// if no value is returned or error or is not json array
		if (sensorsNode == null || sensorsNode.has("error")
				|| !sensorsNode.isArray()) {
			return allSensors;
		}

		// parse the json string into object
		for (int i = 0; i < sensorsNode.size(); i++) {
			JsonNode json = sensorsNode.path(i);
			Sensor newSensor = new Sensor();

			newSensor.setId(UUID.randomUUID().toString());
			newSensor.setSensorName(json.findPath("sensorName").asText());
			newSensor.setSensorTypeName(json.findPath("sensorTypeName")
					.asText());
			newSensor.setDeviceUri(json.findPath("deviceUri").asText());
			newSensor.setSensorCategoryName(json.findPath("sensorCategoryName")
					.asText());
			newSensor.setSensorUserDefinedFields(json.findPath(
					"sensorUserDefinedFields").asText());

			allSensors.add(newSensor);
		}

		return allSensors;

	}

	/**
	 * Method to call the API to add a new sensor
	 * 
	 * @param jsonData
	 * @return the response json from the API server
	 */
	public static JsonNode create(JsonNode jsonData) {
		return APICall.postAPI(ADD_SENSOR_CALL, jsonData);
	}

	public static JsonNode edit(JsonNode jsonData) {
		return APICall.postAPI(EDIT_SENSOR_CALL, jsonData);
	}
	
	/**
	 * Method to call the API to delete a sensor with its name
	 * 
	 * @param sensorName
	 * @return the response json from the API server
	 */
	public static JsonNode delete(String sensorName) {
		return APICall.deleteAPI(DELETE_SENSOR_CALL + sensorName);
	}

	/**
	 * Generate a list of all sensor names
	 * 
	 * @return a list of all sensor names
	 */
	public static List<String> allSensorNames(){
		List<String> res = new ArrayList<String>();
		for (Sensor sensor : all()) {
			res.add(sensor.getSensorName());
		}
		return res;
	}
	
	
	
	/**
	 * Generate a map between all sensor names and sensor object
	 * @return a map
	 */
	public static Map<String, Sensor> allSensorNamesMap() {
		List<Sensor> allList = all();
		
		HashMap<String, Sensor> result = new HashMap<String, Sensor>();
		for (Sensor element : allList) {
			String elementName = element.getSensorName();
			if (elementName != null)
				result.put(elementName, element);
		}
		return result;
	}
}
