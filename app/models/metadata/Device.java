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

public class Device {

	private String id;
	private String deviceUri;
	// private DeviceType deviceType;
	private double longitude;
	private double latitude;
	private double altitude;

	// newly added
	private String deviceTypeName;
	private String representation;
	private String deviceUserDefinedFields;
	private List<String> sensorTypeNames = new ArrayList<String>();
	private List<String> sensorNames = new ArrayList<String>();

	/* The following are API */
	private static final String GET_DEVICES_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_DEVICES + util.Constants.FORMAT;
	private static final String ADD_DEVICE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_ADD_DEVICE;
	private static final String DELETE_DEVICE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_DELETE_DEVICE;
	private static final String EDIT_DEVICE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_EDIT_DEVICE;

	public Device() {
	}

	public String getId() {
		return id;
	}

	public String getDeviceUri() {
		return deviceUri;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDeviceUri(String uri) {
		this.deviceUri = uri;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public List<String> getSensorTypeNames() {
		return sensorTypeNames;
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

	public List<String> getSensorNames() {
		return sensorNames;
	}

	public void addSensorNames(String sensorName) {
		this.sensorNames.add(sensorName);
	}

	public void deleteSensorName(String sensorName) {
		for (int i = 0; i < this.sensorNames.size(); i++) {
			if (sensorName.equals(this.sensorNames.get(i))) {
				this.sensorNames.remove(i);
			}
		}
	}

	public String getDeviceUserDefinedFields() {
		return deviceUserDefinedFields;
	}

	public void setDeviceUserDefinedFields(String deviceUserDefinedFields) {
		this.deviceUserDefinedFields = deviceUserDefinedFields;
	}

	public String getRepresentation() {
		return representation;
	}

	public void setRepresentation(String representation) {
		this.representation = representation;
	}

	/**
	 * Method to call the API to add a new device
	 * 
	 * @param jsonData
	 * @return
	 */
	public static JsonNode create(JsonNode jsonData) {
		return APICall.postAPI(ADD_DEVICE_CALL, jsonData);
	}

	/**
	 * Method to call the API to edit a device
	 * 
	 * @param jsonData
	 * @return
	 */
	public static JsonNode edit(String deviceUri, JsonNode jsonData) {
		return APICall.putAPI(EDIT_DEVICE_CALL + deviceUri, jsonData);
	}

	/**
	 * Method to call the API to delete a device
	 * 
	 * @param id
	 * @return the response json node from server
	 */
	public static JsonNode delete(String deviceUri) {
		return APICall.deleteAPI(DELETE_DEVICE_CALL + deviceUri);
	}

	/**
	 * Method to display all devices
	 * 
	 * @return a list of all devices
	 */
	public static List<Device> all() {
		List<Device> allDevices = new ArrayList<Device>();

		// API Call: http://einstein.sv.cmu.edu/get_devices/json
		final JsonNode devicesNode = APICall.callAPI(GET_DEVICES_CALL);

		// If no value is returned
		if (devicesNode == null || devicesNode.has("error")
				|| !devicesNode.isArray()) {
			return allDevices;
		}

		for (int i = 0; i < devicesNode.size(); i++) {
			JsonNode json = devicesNode.path(i);
			Device newDevice = new Device();

			newDevice.setId(UUID.randomUUID().toString());

			newDevice.setDeviceUri(json.findPath("uri").asText());
			newDevice.setDeviceTypeName(json.findPath("deviceTypeName")
					.asText());

			JsonNode sensorNamesJson = json.findPath("sensorNames");
			for (int j = 0; j < sensorNamesJson.size(); j++) {
				newDevice.addSensorNames(sensorNamesJson.get(j).asText());
			}

			JsonNode sensorTypeNamesJson = json.findPath("sensorTypeNames");
			for (int j = 0; j < sensorTypeNamesJson.size(); j++) {
				newDevice
						.addSensorTypeName(sensorTypeNamesJson.get(j).asText());
			}
			JsonNode locationNode = json.findPath("location");
			newDevice.setRepresentation(locationNode.findPath("representation")
					.asText());
			newDevice.setLongitude(locationNode.findPath("longitude")
					.asDouble());
			newDevice.setLatitude(locationNode.findPath("latitude").asDouble());
			newDevice.setAltitude(locationNode.findPath("altitude").asDouble());

			newDevice.setDeviceUserDefinedFields(json.findPath(
					"deviceUserDefinedFields").asText());

			allDevices.add(newDevice);
		}

		return allDevices;
	}

	/**
	 * Method to display all devices' name with id
	 * 
	 * @return a list of all devices' name
	 */
	public static List<String> allDeviceUri() {
		List<Device> allList = all();
		List<String> resultList = new ArrayList<String>();
		for (Device element : allList) {
			String elementUri = element.getDeviceUri();
			if (elementUri != null && elementUri != "")
				resultList.add(elementUri);
		}
		return resultList;
	}
	
	/**
	 * find a device by its URI
	 * 
	 * @param deviceUri
	 * @return the founded result. If not found, return an empty device
	 */
	public static Device findDeviceByUri(String deviceUri){
		List<Device> allList = all();
		for (Device element : allList) {
			String elementUri = element.getDeviceUri();
			if (elementUri.equals(deviceUri))
				return element;
		}
		return new Device();
	}
}
