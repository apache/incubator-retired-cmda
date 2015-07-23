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

//import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.*;

public class DeviceType {

	private String id;
	private String deviceTypeName;
	private String manufacturer;
	private double version;
	private String deviceTypeUserDefinedFields;

	private List<String> sensorTypeNames = new ArrayList<String>();

	// http://einstein.sv.cmu.edu/get_devices/json
	private static final String GET_DEVICE_TYPES_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_DEVICE_TYPES + util.Constants.FORMAT;
	private static final String ADD_DEVICE_TYPE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_ADD_DEVICE_TYPE;
	private static final String DELETE_DEVICE_TYPE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_DELETE_DEVICE_TYPE;
	private static final String EDIT_DEVICE_TYPE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_EDIT_DEVICE_TYPE;

	// Constructors
	public DeviceType() {
	}

	public DeviceType(String id, String deviceTypeName, String manufacturer,
			double version, List<String> sensorTypeNames,
			String deviceTypeUserDefinedFields) {
		super();
		this.id = id;
		this.deviceTypeName = deviceTypeName;
		this.manufacturer = manufacturer;
		this.version = version;
		this.sensorTypeNames = sensorTypeNames;
		this.deviceTypeUserDefinedFields = deviceTypeUserDefinedFields;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getVersion() {
		return version;
	}

	public List<String> getSensorTypeNames() {
		return sensorTypeNames;
	}

	public String getDeviceTypeUserDefinedFields() {
		return deviceTypeUserDefinedFields;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public void setSensorTypeNames(List<String> sensorTypeNames) {
		this.sensorTypeNames = sensorTypeNames;
	}

	public void setDeviceTypeUserDefinedFields(
			String deviceTypeUserDefinedFields) {
		this.deviceTypeUserDefinedFields = deviceTypeUserDefinedFields;
	}

	public void addSensorTypeName(String sensorTypeName) {
		this.sensorTypeNames.add(sensorTypeName);
	}

	public void deleteSensorTypeName(String sensorTypeName) {
		for (int i = 0; i < this.sensorTypeNames.size(); i++) {
			if (sensorTypeName.equals(this.sensorTypeNames.get(i))) {
				this.sensorTypeNames.remove(i);
			}
		}
	}

	/**
	 * Method to call the API to add a new device type
	 * 
	 * @param jsonData
	 * @return the response json from the API server
	 */
	public static JsonNode create(JsonNode jsonData) {
		return APICall.postAPI(ADD_DEVICE_TYPE_CALL, jsonData);
	}

	/**
	 * Method to call the API to edit a device type
	 * 
	 * @param jsonData
	 * @return the response json from the API server
	 */
	public static JsonNode edit(String deviceTypeName, JsonNode jsonData) {
		return APICall.putAPI(EDIT_DEVICE_TYPE_CALL + deviceTypeName, jsonData);
	}

	/**
	 * Method to call the API to delete a device type with its id
	 * 
	 * @param id
	 * @return the response json from the API server
	 */
	public static JsonNode delete(String deviceTypeName) {
		return APICall.deleteAPI(DELETE_DEVICE_TYPE_CALL + deviceTypeName);
	}

	/**
	 * Method to display all devices
	 * 
	 * @return List of all device types
	 */
	public static List<DeviceType> all() {

		List<DeviceType> allDeviceTypes = new ArrayList<DeviceType>();

		JsonNode deviceTypesNode = APICall.callAPI(GET_DEVICE_TYPES_CALL);

		if (deviceTypesNode == null || deviceTypesNode.has("error")
				|| !deviceTypesNode.isArray())
			return allDeviceTypes;

		for (int i = 0; i < deviceTypesNode.size(); i++) {
			JsonNode json = deviceTypesNode.path(i);
			DeviceType newDeviceType = new DeviceType();

			newDeviceType.setId(UUID.randomUUID().toString());
			newDeviceType.setDeviceTypeName(json.findPath("deviceTypeName")
					.asText());
			newDeviceType.setManufacturer(json.findPath("manufacturer")
					.asText());
			newDeviceType.setVersion(json.findPath("version").asDouble());
			newDeviceType.setDeviceTypeUserDefinedFields(json.findPath(
					"deviceTypeUserDefinedFields").asText());

			JsonNode sensorTypeNamesJson = json.findPath("sensorTypeNames");
			for (int j = 0; j < sensorTypeNamesJson.size(); j++) {
				newDeviceType.addSensorTypeName(sensorTypeNamesJson.get(j)
						.asText());
			}

			allDeviceTypes.add(newDeviceType);
		}

		return allDeviceTypes;

	}

	/**
	 * Method to display all device types' name
	 * 
	 * @return a list of all device types' name
	 */
	public static List<String> allDeviceTypeName() {
		List<DeviceType> allList = all();
		List<String> resultList = new ArrayList<String>();
		for (DeviceType element : allList) {
			String elementName = element.getDeviceTypeName();
			if (elementName != null)
				resultList.add(elementName);
		}
		return resultList;
	}

}
