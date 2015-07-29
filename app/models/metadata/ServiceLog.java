package models.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.Logger;
import util.APICall;
import util.Constants;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import play.Logger;
import util.APICall;
import util.TimeConvert;
import scala.Console;

import com.fasterxml.jackson.databind.JsonNode;

public class ServiceLog {

	private String serviceExecutionLogId;
	private String serviceId;
	private String userId;
	private String purpose;
	private String serviceConfigurationId;
	private String datasetLogId;
	private String executionStartTime;
	private String executionEndTime;
	private String dataSetStartTime;
	private String dataSetEndTime;
	
	
	public String getServiceExecutionLogId() {
		return serviceExecutionLogId;
	}

	public void setServiceExecutionLogId(String serviceExecutionLogId) {
		this.serviceExecutionLogId = serviceExecutionLogId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getServiceConfigurationId() {
		return serviceConfigurationId;
	}

	public void setServiceConfigurationId(String serviceConfigurationId) {
		this.serviceConfigurationId = serviceConfigurationId;
	}

	public String getDatasetLogId() {
		return datasetLogId;
	}

	public void setDatasetLogId(String datasetLogId) {
		this.datasetLogId = datasetLogId;
	}

	public String getExecutionStartTime() {
		return executionStartTime;
	}

	public void setExecutionStartTime(String executionStartTime) {
		this.executionStartTime = executionStartTime;
	}
	
	public String getExecutionEndTime() {
		return executionEndTime;
	}

	public void setExecutionEndTime(String executionEndTime) {
		this.executionEndTime = executionEndTime;
	}
	
	public String getDataSetStartTime() {
		return dataSetStartTime;
	}

	public void setDataSetStartTime(String dataSetStartTime) {
		this.dataSetStartTime = dataSetStartTime;
	}
	
	public String getDataSetEndTime() {
		return dataSetEndTime;
	}

	public void setDataSetEndTime(String dataSetEndTime) {
		this.dataSetEndTime = dataSetEndTime;
	}

	

	private static final String GET_ALL_SERVICE_LOG = Constants.NEW_BACKEND + Constants.SERVICE_EXECUTION_LOG
			+ util.Constants.NEW_GET_ALL_SERVICE_LOG;

	private static final String GET_A_SERVICE_LOG = Constants.NEW_BACKEND
			+ Constants.NEW_GET_A_SERVICE_LOG;

	private static final String EXECUTION_LOG_QUERY = Constants.NEW_BACKEND + Constants.SERVICE_EXECUTION_LOG + Constants.SERVICE_EXECUTION_LOG_QUERY;

	/**
	 * Generate the list of all service log
	 *
	 * @return a list of all the service log
	 */
	public static List<ServiceLog> all() {

		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI(GET_ALL_SERVICE_LOG);

		// if no value is returned or error or is not json array
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);

			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}
	
	private static ServiceLog deserializeJsonToServiceLog(JsonNode json) {
		ServiceLog newServiceLog = new ServiceLog();
		newServiceLog.setServiceExecutionLogId(json.get(
				"id").asText());
		newServiceLog.setServiceId(json.get(
				"climateService").get("id").asText());
		newServiceLog.setPurpose(json.get("purpose").asText());
		newServiceLog.setUserId(json.get("user").get("firstName").asText()+" "+json.get("user").get("lastName").asText());
		newServiceLog.setServiceConfigurationId(json.get("serviceConfiguration").get("id").asText());
		newServiceLog.setExecutionStartTime(json.findPath("executionStartTime").asText());
		newServiceLog.setExecutionEndTime(json.findPath("executionEndTime").asText());
//		newServiceLog.setDataSetStartTime(json.findPath("datasetStudyStartTime").asText());
//		newServiceLog.setDataSetEndTime(json.findPath("datasetStudyEndTime").asText());
		
		String datasetStudyStartTime = json.findPath("datasetStudyStartTime").asText();
		String datasetStudyEndTime = json.findPath("datasetStudyEndTime").asText();
		System.out.println("get dataset Start time :  " + datasetStudyStartTime);
		System.out.println("get dataset End time :  " + datasetStudyEndTime);
		Date tmpTime = null;
		try {
			tmpTime = (new SimpleDateFormat("MMM DD, YYYY HH:MM:SS")).parse(datasetStudyStartTime);
			System.out.println("get dataset tmp time :  " + tmpTime);
			if (tmpTime != null) {
				newServiceLog.setDataSetStartTime(new SimpleDateFormat("YYYYMM").format(tmpTime));
			}
	    } catch (ParseException e){	    
	    	e.printStackTrace();
	    }
		
		try {
			tmpTime = (new SimpleDateFormat("MMM DD, YYYY HH:MM:SS")).parse(datasetStudyEndTime);
			System.out.println("get dataset tmp time :  " + tmpTime);
			if (tmpTime != null) {
				newServiceLog.setDataSetEndTime(new SimpleDateFormat("YYYYMM").format(tmpTime));
			}
	    } catch (ParseException e){	    
	    	e.printStackTrace();
	    }
		
		
//		tmptime = null;
//		try {
//			tmptime = (new SimpleDateFormat("YYYY-MM-DD HH:MM:SS")).parse(json.findPath("datasetStudyEndTime").asText());
//	    } catch (ParseException e){	    
//	    	e.printStackTrace();
//	    }
//		newServiceLog.setDataSetEndTime(new SimpleDateFormat("YYYYMM").format(tmptime));
		
		newServiceLog.setDatasetLogId(json.findPath("datasetLogId").asText());	//Not used variavle, use original code for now to set this to an empyy string

		return newServiceLog;
	}


	/**
	 * Generate a new list of all service log which sync userId according to the porpose
	 * 
	 * @return a list of all the service log
	 */
	public static List<ServiceLog> syncDataByPurpose() {
		APICall.callAPI(Constants.NEW_BACKEND+Constants.SERVICE_EXECUTION_LOG+"replaceUser");

		return all();
	}
	public static List<ServiceLog> searchDataSource(String dataSource){
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithParameter/model/"+dataSource+"/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		//Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchVariableName(String variableName) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithParameter/var/"+variableName+"/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchExecutionPurpose(String purpose) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPIParameter("http://localhost:9008/getExecutionLogByPurpose", "purpose", purpose);
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchUserId(String userId) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithParameter/" + userId + "/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchTime(String start, String end) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithParameterRange/startT/"+start+"/endT/"+end+"/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchLatitude(String start, String end) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithParameterRange/start%20lat%20(deg)/" + start + "/end%20lat%20(deg)/" + end + "/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	public static List<ServiceLog> searchMultiDimension(String dataSource, String variableName, String executionPurpose, String userId, String startTime, String endTime) {
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		if (dataSource.equals("")) {
			dataSource = "null";
		}
		if (variableName.equals("")) {
			variableName = "null";
		}
		if (executionPurpose.equals("")) {
			executionPurpose = "null";
		}
		if (userId.equals("")) {
			userId = "null";
		}
		if (startTime.equals("")) {
			startTime = "null";
		}
		if (endTime.equals("")) {
			endTime = "null";
		}
		JsonNode serviceLogNode = APICall
				.callAPI("http://localhost:9008/searchServiceLogsWithMultipleParameter/userid/" + userId + "/datasource/" + dataSource + "/variablename/" + variableName + "/startyearmonth/" + startTime + "/endyearmonth/" + endTime + "/executionpurpose/" + executionPurpose + "/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		Logger.info(serviceLogNode.toString());
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	//simple search function on top of the table of service execution log
	public static List<ServiceLog> search(String userId, long startTime, long endTime) {

		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();

		startTime = startTime / 1000;
		endTime = endTime / 1000;

		JsonNode serviceLogNode = APICall
				.callAPI(GET_A_SERVICE_LOG + userId + "/" + startTime + "" + "/" + endTime + "" + "/" + util.Constants.FORMAT);
//		JsonNode serviceLogNode = APICall
//				.callAPI("http://localhost:9008/getServiceExecutionLogs/123/1415904302/1415904357/json");
		//Logger.debug(GET_A_SERVICE_LOG + userId+ "/" +startTime + "" + "/" +endTime + "" + "/" + util.Constants.FORMAT);
		// if no value is returned or error or is not json array
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

	/**
	 * Delete a service log
	 *
	 * @return
	 */
	public static JsonNode deleteServiceLog(String confId) throws UnsupportedEncodingException {
		return APICall.deleteAPI(Constants.NEW_BACKEND + "serviceExecutionLog/deleteServiceExecutionLogs/"+confId);
	}

	/**
	 * Generate a list of climate service names
	 *
	 * @return a list of climate service names
	 */
	public static List<String> allServiceId() {
		List<ServiceLog> allList = all();
		List<String> resultList = new ArrayList<String>();
		for (ServiceLog element : allList) {
			String elementName = element.getServiceId();
			if (elementName != null)
				resultList.add(elementName);
		}
		return resultList;
	}

	/**
	 * Search Service Execution Logs in the backend. All parameters are optional
	 * Actually used in the search page
	 *
	 * @param userId
	 * @param startTime
	 * @param endTime
	 * @param executionPurpose
	 * @param parameters       A key-value pair list of all parameters that hosted by service configuration item including data source , variable name, dataset start/end time
	 * @return
	 */
	
	
	public static List<ServiceLog> queryExecutionLogs(String userId, Date startTime, Date endTime, String executionPurpose, String dataSetStartTime, String dataSetEndTime, Map<String, String> parameters) {
		
		List<ServiceLog> serviceLog = new ArrayList<ServiceLog>();
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();
		if (userId != null && !userId.isEmpty()) {
			queryJson.put("userId", userId);
		}
		if (startTime != null ) {
			queryJson.put("executionStartTime", startTime.getTime());
		}
		if (endTime != null) {
			queryJson.put("executionEndTime", endTime.getTime());
		}
		if (dataSetStartTime != null) {
			queryJson.put("dataSetStartTime", dataSetStartTime);
		}
		if (dataSetEndTime != null) {
			queryJson.put("dataSetEndTime", dataSetEndTime);
		}
		if (executionPurpose != null && !executionPurpose.isEmpty()) {
			queryJson.put("purpose", executionPurpose);
		}

		if (parameters != null) {
			ObjectNode paramsNode = mapper.createObjectNode();
			for (String paramName : parameters.keySet()) {
				String paramValue = parameters.get(paramName);
				if (paramValue != null && !paramValue.isEmpty())
					paramsNode.put(paramName, paramValue);
			}
			if (paramsNode.size() > 0) {
				queryJson.set("parameters", paramsNode);
			}
		}

		JsonNode serviceLogNode = APICall.postAPI(EXECUTION_LOG_QUERY, queryJson);
		if (serviceLogNode == null || serviceLogNode.has("error")
				|| !serviceLogNode.isArray()) {
			return serviceLog;
		}

		// parse the json string into object
		for (int i = 0; i < serviceLogNode.size(); i++) {
			JsonNode json = serviceLogNode.path(i);
			ServiceLog newServiceLog = deserializeJsonToServiceLog(json);
			serviceLog.add(newServiceLog);
		}
		return serviceLog;
	}

}
