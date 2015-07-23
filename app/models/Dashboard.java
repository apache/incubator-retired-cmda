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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import util.APICall;

import com.fasterxml.jackson.databind.JsonNode;

import models.metadata.Device;
import models.metadata.Sensor;

public class Dashboard {

	private ArrayList<DashboardItem> items;
	private int totalCount;
	private int activeCount;

	public Dashboard() {
		// TODO Auto-generated constructor stub
	}

	public Dashboard(ArrayList<DashboardItem> items, int totalCount,
			int activeCount) {
		this.items = items;
		this.totalCount = totalCount;
		this.activeCount = activeCount;
	}

	public int getActiveCount() {
		return activeCount;
	}

	public ArrayList<DashboardItem> getItems() {
		return items;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setActiveCount(int activeCount) {
		this.activeCount = activeCount;
	}

	public void setItems(ArrayList<DashboardItem> items) {
		this.items = items;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public static Dashboard status() {

		Dashboard dashboard = new Dashboard();

		ArrayList<DashboardItem> dashboardItems = new ArrayList<DashboardItem>();
		int totalCount = 0;
		int activeCount = 0;

		// API call for "active" devices
		JsonNode devicesNode = APICall.callAPI(formatAPIUrlWithCurrentTimestamp());
		HashSet<String> activeSensorNames = new HashSet<String>();

		if (devicesNode == null || !devicesNode.isArray()) {
			dashboard.setTotalCount(0);
			dashboard.setActiveCount(0);
		} else {
			for (int i = 0; i < devicesNode.size(); i++) {

				JsonNode json = devicesNode.path(i);
				activeSensorNames.add(json.findPath("sensorName").asText());

			}
		}

		List<Device> allDevices = Device.all();

		// build up the hashmap for sensorName and deviceUri

		HashSet<String> activeDevices = getActiveDevices(activeSensorNames,
				Sensor.allSensorNamesMap());

		for (Device device : allDevices) {
			DashboardItem dashboardItem = new DashboardItem();
			dashboardItem.setDevice(device);

			if (activeDevices.contains(device.getDeviceUri())) {

				dashboardItem.setStatus(1);
				activeCount++;
			} else {
				dashboardItem.setStatus(0);
			}
			totalCount++;
			dashboardItems.add(dashboardItem);
		}

		dashboard.setItems(dashboardItems);
		dashboard.setTotalCount(totalCount);
		dashboard.setActiveCount(activeCount);

		return dashboard;

	}

	private static HashSet<String> getActiveDevices(
			HashSet<String> activeSensorNames,
			Map<String, Sensor> allSensorNamesMap) {
		HashSet<String> set = new HashSet<String>();
		for (String sensorName : activeSensorNames) {
			if (allSensorNamesMap.containsKey(sensorName)) {
				set.add(allSensorNamesMap.get(sensorName).getDeviceUri());
			}
		}
		return set;
	}
	
	private static String formatAPIUrlWithCurrentTimestamp(){
		return util.Constants.NEW_API_URL
				+ util.Constants.NEW_GET_LAST_MINUTE_DEVICE_READINGS + System.currentTimeMillis() + "/"
				+ util.Constants.FORMAT;
	}
}
