/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.metadata.ServiceLog;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;

public class AccountController extends Controller {

	final static Form<ServiceLog> serviceLogForm = Form
			.form(ServiceLog.class);

	public static Result getServiceLog() {
		return ok(serviceLog.render(ServiceLog.all(),
				serviceLogForm));
	}
	
	public static Result syncData(){
		return ok(serviceLog.render(ServiceLog.syncDataByPurpose(),
				serviceLogForm));
	}
	
	public static Result searchServiceLog() {
		return ok(searchServiceLog.render(serviceLogForm));
	}

	public static Result getSearchServiceLogOneDimension() {
		Form<ServiceLog> dc = serviceLogForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		String dataSource = "";
		String variableName = "";
		String executionPurpose = "";
		String userId = "";
		String startTime = "";
		String endTime = "";
		String dataSetStartTime = "";
		String dataSetEndTime = "";
		Date executionStartTime = null, executionEndTime= null;
		
		try {
			dataSource = dc.field("Data Source").value().replace("/", "_");
			variableName = dc.field("Variable Name").value();
			executionPurpose = dc.field("Execution Purpose").value();
			startTime = dc.field("Execution Start Time").value();
			endTime = dc.field("Execution End Time").value();
			dataSetStartTime = dc.field("Dataset Start Time").value();
			dataSetEndTime = dc.field("Dataset End Time").value();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

			if (!startTime.isEmpty()) {
				try {
					executionStartTime = simpleDateFormat.parse(startTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + startTime);
					return badRequest("Wrong Date Format :" + startTime);
				}
			}
			
			if (!endTime.isEmpty()) {
				try {
					executionEndTime = simpleDateFormat.parse(endTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + endTime);
					return badRequest("Wrong Date Format :" + endTime);
				}
			}

			if (variableName.equals("Air Temperature")) {
				variableName = "ta";
			} else if (variableName.equals("Cloud Ice Water Content")) {
				variableName = "cli";
			} else if (variableName.equals("Cloud Liquid Water Content")) {
				variableName = "clw";
			} else if (variableName.equals("Eastward Near-Surface Wind")) {
				variableName = "uas";
			} else if (variableName.equals("Equivalent Water Height Over Land")) {
				variableName = "zl";
			} else if (variableName
					.equals("Equivalent Water Height Over Ocean")) {
				variableName = "zo";
			} else if (variableName.equals("Leaf Area Index")) {
				variableName = "lai";
			} else if (variableName.equals("Near-Surface Air Temperature")) {
				variableName = "tas";
			} else if (variableName.equals("Near-Surface Relative Humidity")) {
				variableName = "hurs";
			} else if (variableName.equals("Near-Surface Wind Speed")) {
				variableName = "sfcWind";
			} else if (variableName.equals("Northward Near-Surface Wind")) {
				variableName = "vas";
			} else if (variableName
					.equals("Ocean Heat Content Anomaly within 2000 m Depth")) {
				variableName = "ohc2000";
			} else if (variableName
					.equals("Ocean Heat Content Anomaly within 700 m Depth")) {
				variableName = "ohc700";
			} else if (variableName.equals("Ocean Salinity")) {
				variableName = "os";
			} else if (variableName.equals("Ocean Temperature")) {
				variableName = "ot";
			} else if (variableName.equals("Precipitation Flux")) {
				variableName = "pr";
			} else if (variableName.equals("Relative Humidity")) {
				variableName = "hur";
			} else if (variableName.equals("Sea Surface Height")) {
				variableName = "zos";
			} else if (variableName.equals("Sea Surface Temperature")) {
				variableName = "tos";
			} else if (variableName.equals("Specific Humidity")) {
				variableName = "hus";
			} else if (variableName
					.equals("Surface Downwelling Clear-Sky Longwave Radiation")) {
				variableName = "rldscs";
			} else if (variableName
					.equals("Surface Downwelling Clear-Sky Shortwave Radiation")) {
				variableName = "rsdscs";
			} else if (variableName
					.equals("Surface Downwelling Longwave Radiation")) {
				variableName = "rlds";
			} else if (variableName
					.equals("Surface Downwelling Shortwave Radiation")) {
				variableName = "rsds";
			} else if (variableName.equals("Surface Temperature")) {
				variableName = "ts";
			} else if (variableName
					.equals("Surface Upwelling Clear-Sky Shortwave Radiation")) {
				variableName = "rsuscs";
			} else if (variableName
					.equals("Surface Upwelling Longwave Radiation")) {
				variableName = "rlus";
			} else if (variableName
					.equals("Surface Upwelling Shortwave Radiation")) {
				variableName = "rsus";
			} else if (variableName.equals("TOA Incident Shortwave Radiation")) {
				variableName = "rsdt";
			} else if (variableName
					.equals("TOA Outgoing Clear-Sky Longwave Radiation")) {
				variableName = "rlutcs";
			} else if (variableName
					.equals("TOA Outgoing Clear-Sky Shortwave Radiation")) {
				variableName = "rsutcs";
			} else if (variableName.equals("TOA Outgoing Longwave Radiation")) {
				variableName = "rlut";
			} else if (variableName.equals("TOA Outgoing Shortwave Radiation")) {
				variableName = "rsut";
			} else if (variableName.equals("Total Cloud Fraction")) {
				variableName = "clt";
			} else if (variableName.equals("Vertical Wind Velocity")) {
				variableName = "wap";
			}

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("model", dataSource);
		parameters.put("var", variableName);
		parameters.put("startT", dataSetStartTime);
		parameters.put("endT", dataSetEndTime);
		List<ServiceLog> response = ServiceLog.queryExecutionLogs(userId, executionStartTime, executionEndTime, executionPurpose, dataSetStartTime, dataSetEndTime, parameters);
		return ok(searchLogResult.render(response));

	}

	public static Result getSearchServiceLog() {
		Form<ServiceLog> dc = serviceLogForm.bindFromRequest();
		String userId = "", startTime = "", endTime = "";
		Date start=null, end=null;
		
		try {
			startTime = dc.field("Start Time").value();
			endTime = dc.field("End Time").value();
			Logger.info(""+startTime);
			Logger.info(""+endTime);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

			if (!startTime.isEmpty()) {
				try {
					start = simpleDateFormat.parse(startTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + startTime);
					return badRequest("Wrong Date Format :" + startTime);
				}
			}
			
			if (!endTime.isEmpty()) {
				try {
					end = simpleDateFormat.parse(endTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + endTime);
					return badRequest("Wrong Date Format :" + endTime);
				}
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		List<ServiceLog> response = ServiceLog.queryExecutionLogs(userId, start, end, null, null, null, null);
		return ok(searchLogResult.render(response));
	}
	
	public static Result getSearchServiceLogForWorkflow() {
		Form<ServiceLog> dc = serviceLogForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		String userId = "123", startTime = "", endTime = "";
		Date start=null, end=null;
		try {

			userId = dc.field("User Id").value().replace(" ", "%20");
			startTime = dc.field("Start Time").value();
			endTime = dc.field("End Time").value();
			Logger.info(""+startTime);
			Logger.info(""+endTime);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

			if (!startTime.isEmpty()) {
				try {
					start = simpleDateFormat.parse(startTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + startTime);
					return badRequest("Wrong Date Format :" + startTime);
				}
			}
			
			if (!endTime.isEmpty()) {
				try {
					end = simpleDateFormat.parse(endTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + endTime);
					return badRequest("Wrong Date Format :" + endTime);
				}
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		List<ServiceLog> response = ServiceLog.queryExecutionLogs(userId, start, end, null, null, null, null);
		return ok(searchLogResultWorkflow.render(response, userId, startTime, endTime, null));
	}
	
	public static Result getSearchAndGenerateWorkflow() {
		return ok(searchGenerateWorkflow.render(serviceLogForm));
	}
	
	public static Result getJsonData() {
		Form<ServiceLog> dc = serviceLogForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		String userId = "CCS student 1", startTime = "03/05/2015 12:30", endTime = "03/05/2015 12:41";
		Date start=null, end=null;
		try {

			userId = dc.field("User Id").value().replace(" ", "%20");
			startTime = dc.field("Start Time").value();
			endTime = dc.field("End Time").value();
			Logger.info(""+startTime);
			Logger.info(""+endTime);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

			if (!startTime.isEmpty()) {
				try {
					start = simpleDateFormat.parse(startTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + startTime);
					return badRequest("Wrong Date Format :" + startTime);
				}
			}
			
			if (!endTime.isEmpty()) {
				try {
					end = simpleDateFormat.parse(endTime);
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + endTime);
					return badRequest("Wrong Date Format :" + endTime);
				}
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();
		if (userId != null && !userId.isEmpty()) {
			queryJson.put("userId", userId);
		}
		if (start != null ) {
			queryJson.put("executionStartTime", start.getTime());
		}
		if (end != null) {
			queryJson.put("executionEndTime", end.getTime());
		}
		JsonNode response = APICall.postAPI("http://localhost:9034/workflow/generateWorkflowJson", queryJson);
		String resStr = response.toString();
		List<ServiceLog> responseList = ServiceLog.queryExecutionLogs(userId, start, end, null, null, null, null);
		return ok(searchLogResultWorkflow.render(responseList,userId, startTime, endTime, resStr));
	}
	
	public static Result getRecommend() {
		JsonNode response = APICall.callAPI("http://einstein.sv.cmu.edu:9026/api/sgraph");
		String resStr = response.toString();
		return ok(views.html.climate.recommend.render(resStr));
	}

	public static Result getLogGraph() {
		JsonNode response = APICall.callAPI("http://einstein.sv.cmu.edu:9026/api/ugraph");
		String resStr = response.toString();
		return ok(views.html.climate.recommend.render(resStr));
	}
	
	public static Result getDatasetRecommend() {
		JsonNode response = APICall.callAPI("http://einstein.sv.cmu.edu:9026/api/dgraph");
		String resStr = response.toString();
		return ok(views.html.climate.dataRecommend.render(resStr));
	}
	
	public static Result getScientistRecommend() {
		JsonNode response = APICall.callAPI("http://einstein.sv.cmu.edu:9026/api/scgraph");
		String resStr = response.toString();
		return ok(views.html.climate.dataRecommend.render(resStr));
	}
}
