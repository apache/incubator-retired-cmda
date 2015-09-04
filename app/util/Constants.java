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

	// API 1.3 URL
	public static final String NEW_API_URL = "http://localhost:9033/";

	// API Call format
	public static final String FORMAT = "json";
	
	// climate service
	public static final String NEW_GET_CLIMATE_SERVICE = "getAllClimateServices/";
	public static final String NEW_ADD_CLIMATE_SERVICE = "addClimateService";
	public static final String NEW_DELETE_CLIMATE_SERVICE = "climateService/deleteClimateService/id/";
	public static final String NEW_EDIT_CLIMATE_SERVICE = "updateClimateService";
	
	//service log
	public static final String NEW_GET_A_SERVICE_LOG = "getServiceExecutionLogs/";

    public static final String GET_DATASETLIST ="getDatasetList/";

	//New backend API (MySQL database)
	public static final String NEW_BACKEND = "http://localhost:9034/";
	//New service execution log stuff
	public static final String SERVICE_EXECUTION_LOG =	"serviceExecutionLog/";
	public static final String SERVICE_EXECUTION_LOG_QUERY =	"queryServiceExecutionLogs";
	public static final String SERVICE_EXECUTION_LOG_GET= "getServiceExecutionLog/";
	public static final String NEW_GET_ALL_SERVICE_LOG = "getAllServiceExecutionLog";

	//ServiceConfigItem
	public static final String CONFIG_ITEM =	"serviceConfigurationItem/";
	public static final String GET_CONFIG_ITEMS_BY_CONFIG= "serviceConfigurationItemByServiceConfig/";



}
