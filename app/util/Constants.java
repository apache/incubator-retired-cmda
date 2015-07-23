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
package util;

public class Constants {

	// TO DO: Read all the constant variables from a configuration file

//	// API URL
//	public static final String API_URL = "http://einstein.sv.cmu.edu/";
//
//	// API Call format
//	public static final String FORMAT = "json";

//	// Get sensor types action
//	public static final String GET_SENSOR_TYPES = "get_all_sensor_types/";
//
//	// Get devices action
//	public static final String GET_DEVICES = "get_devices/";
//
//	// Get sensors action
//	public static final String GET_SENSORS = "get_sensors/";
//
//	// Get device types action
//	public static final String GET_DEVICE_TYPES = "get_device_types/";
//
//	// NOT IMPLEMENTED!!
//	// Get device agents action
//	public static final String GET_DEVICE_AGENTS = "get_device_agents/";
//
//	// delete a sensor type
//	public static final String DELETE_SENSOR_TYPE = "delete_sensor_type/";
//	// delete a sensor
//	public static final String DELETE_SENSOR = "delete_sensor/";
//	// delete a device type
//	public static final String DELETE_DEVICE_TYPE = "delete_device_type/";
//	// delete a device
//	public static final String DELETE_DEVICE = "delete_device/";
//
//	// create a sensor type
//	public static final String ADD_SENSOR_TYPE = "add_sensor_type";
//	// create a device type
//	public static final String ADD_DEVICE_TYPE = "add_device_type";
//	// create a device
//	public static final String ADD_DEVICE = "add_device";
//	// create a sensor
//	public static final String ADD_SENSOR = "add_sensor";
//
//	// get latest device readings
//	public static final String GET_LATEST_DEVICE_READINGS = "lastest_readings_from_all_devices/temp/";

	// all device ids
//	public static final String[] DEVICE_IDS = { "17000001#Mobile test unit",
//			"17010001#Mobile test unit", "17020001#Mobile test unit",
//			"17030001#Mobile test unit", "17010002#Room 129A",
//			"17020006#Room 215B", "17020007#Room 215", "17020008#Room 217A",
//			"17020009#Room 217B", "17030009#Room 121B", "17020005#Room 214B",
//			"1703000a#Room 121", "1703000b#Room 208", "17030005#Room 126",
//			"17030006#Room 124", "17000008#Room 212", "17030007#Room 122",
//			"17000009#Room 210", "17030008#Room 120", "17000007#Room 211",
//			"17010003#Room 129", "17000002#Room 115", "17000003#Room 116",
//			"17000004#Room 110", "17000005#Room 109", "17000006#Room 107",
//			"17010004#Room 230", "17010005#Room 228", "17010006#Room 229",
//			"17020002#Room 216", "17020003#Room 213", "17020004#Room 214",
//			"17030002#Room 105B", "17030003#Room 104", "17030004#Room 123" };

	/*
	 * Starting here is the migration from calling API1.1 to API1.3
	 */

	// API 1.3 URL
	public static final String NEW_API_URL = "http://localhost:9033/";

	// API Call format
	public static final String FORMAT = "json";
	
	// sensor type
	public static final String NEW_GET_SENSOR_TYPES = "getAllSensorTypes/";
	public static final String NEW_ADD_SENSOR_TYPE = "addSensorType";
	public static final String NEW_DELETE_SENSOR_TYPE = "deleteSensorType/";
	public static final String NEW_EDIT_SENSOR_TYPE = "updateSensorType";

	// sensor
	public static final String NEW_GET_SENSORS = "getAllSensors/";
	public static final String NEW_ADD_SENSOR = "addSensor";
	public static final String NEW_DELETE_SENSOR = "deleteSensor/";
	public static final String NEW_EDIT_SENSOR = "updateSensor";
	
	// device type
	public static final String NEW_GET_DEVICE_TYPES = "getAllDeviceTypes/";
	public static final String NEW_ADD_DEVICE_TYPE = "addDeviceType";
	public static final String NEW_DELETE_DEVICE_TYPE = "deleteDeviceType/"; 
	public static final String NEW_EDIT_DEVICE_TYPE = "updateDeviceType/"; // add the trailing slash!

	// device
	public static final String NEW_GET_DEVICES = "getAllDevices/";
	public static final String NEW_ADD_DEVICE = "addDevice";
	public static final String NEW_DELETE_DEVICE = "deleteDevice/";
	public static final String NEW_EDIT_DEVICE = "updateDevice/"; // add the trailing slash!

	// sensor category
	public static final String NEW_GET_SENSOR_CATEGORY = "getAllSensorCategories/";
	public static final String NEW_ADD_SENSOR_CATEGORY = "addSensorCategory";
	public static final String NEW_DELETE_SENSOR_CATEGORY = "deleteSensorCategory/";
	public static final String NEW_EDIT_SENSOR_CATEGORY = "updateSensorCategory";
	
	// climate service
	public static final String NEW_GET_CLIMATE_SERVICE = "getAllClimateServices/";
	public static final String NEW_ADD_CLIMATE_SERVICE = "addClimateService";
	public static final String NEW_DELETE_CLIMATE_SERVICE = "climateService/deleteClimateService/id/";
	public static final String NEW_EDIT_CLIMATE_SERVICE = "updateClimateService";
	
	// get last minute reading from all devices
	// Caution! Now it calls System.currentTimeMillis(), it is not a pure constant
	public static final String NEW_GET_LAST_MINUTE_DEVICE_READINGS = "getLastMinuteReadingsFromAllDevices/";

	// get sensor reading 
	public static final String NEW_GET_SENSOR_READING_IN_RANGE = "getSensorReadingInRange/"; 
	public static final String NEW_GET_SENSOR_READING = "getSensorReading/"; 
	public static final String NEW_GET_LATEST_SENSOR_READING_IN_ALL_DEVICES ="getLatestReadingsFromAllDevices/";
	
	//service log
	public static final String NEW_GET_A_SERVICE_LOG = "getServiceExecutionLogs/";

    public static final String GET_KEYWORD_SEARCH ="getGCMDDatasetByKeyword/";
    public static final String POST_KEYWORD_LIST_SEARCH ="getGCMDDatasetByKeywordList/";
    public static final String GET_DATASETLIST ="getDatasetList/";

	//New backend API (MySQL database)
	public static final String NEW_BACKEND = "http://localhost:9020/";
	//New service execution log stuff
	public static final String SERVICE_EXECUTION_LOG =	"serviceExecutionLog/";
	public static final String SERVICE_EXECUTION_LOG_QUERY =	"queryServiceExecutionLogs";
	public static final String SERVICE_EXECUTION_LOG_GET= "getServiceExecutionLog/";
	public static final String NEW_GET_ALL_SERVICE_LOG = "getAllServiceExecutionLog";

	//ServiceConfigItem
	public static final String CONFIG_ITEM =	"serviceConfigurationItem/";
	public static final String GET_CONFIG_ITEMS_BY_CONFIG= "serviceConfigurationItemByServiceConfig/";



}
