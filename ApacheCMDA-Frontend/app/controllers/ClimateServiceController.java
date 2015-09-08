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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.metadata.ClimateService;
import models.metadata.DiffPlotTwoTimeAveragedVar;
import models.metadata.RegridAndDownload;
import models.metadata.TwoDVarZonalMean;
import models.metadata.TwoDVarMap;
import models.metadata.TwoDVarTimeSeries;
import models.metadata.ThreeDVarZonalMean;
import models.metadata.ThreeDVar2DSlice;
import models.metadata.ThreeDVarAvgVertical4Profile;
import models.metadata.ScatterHistogramTwoVar;
import models.metadata.ConditionalSampling;
import models.metadata.ServiceLog;
import models.metadata.CorrelationMap;
import models.metadata.ConditionalSampling2Var;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Console;
import util.APICall;
import util.APICall.ResponseType;
import util.Constants;
import views.html.climate.*;
import play.data.DynamicForm;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClimateServiceController extends Controller {

	final static Form<ClimateService> climateServiceForm = Form
			.form(ClimateService.class);

	public static Result home(String email, String vfile, String dataset) {
		return ok(home.render(email, vfile, dataset));
	}

	public static Result addClimateServices() {
		return ok(addClimateServices.render(climateServiceForm));
	}

	public static Result tutorial() {
		return ok(tutorial.render());
	}

	public static Result climateServices() {
		return ok(climateServices.render(ClimateService.all(),
				climateServiceForm));
	}
	
	public static Result mostRecentlyAddedClimateServices() {
		return ok(mostRecentlyAddedServices.render(ClimateService.getMostRecentlyAdded(),
				climateServiceForm));
	}
	
	public static Result mostRecentlyUsedClimateServices() {
		return ok(mostRecentlyUsedServices.render(ClimateService.getMostRecentlyUsed(),
				climateServiceForm));
	}
	
	public static Result mostPopularClimateServices() {
		return ok(mostPopularServices.render(ClimateService.getMostPopular(),
				climateServiceForm));
	}

	public static Result newClimateService() {
		Form<ClimateService> dc = climateServiceForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {

			String originalClimateServiceName = dc.field("Name").value();
			String newClimateServiceName = originalClimateServiceName.replace(' ', '-');

			if (newClimateServiceName != null && !newClimateServiceName.isEmpty()) {
				jsonData.put("name", newClimateServiceName);
			}
			
			jsonData.put("creatorId", 1);
			jsonData.put("purpose", dc.field("Purpose").value());
			jsonData.put("url", dc.field("Url").value());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			Date date = new Date();
			jsonData.put("createTime", dateFormat.format(date));
			jsonData.put("scenario", dc.field("Scenario").value());
			jsonData.put("versionNo", dc.field("Version").value());
			jsonData.put("rootServiceId", dc.field("Root_Service").value());
			JsonNode response = ClimateService.create(jsonData);
			Application.flashMsg(response);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return redirect("/climate/climateServices");
	}

	public static Result editClimateService() {

		ObjectNode jsonData = Json.newObject();
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String climateServiceName = df.field("pk").value();

			if (climateServiceName != null && !climateServiceName.isEmpty()) {
				jsonData.put("name", climateServiceName);
			}
			ClimateService originalService = ClimateService.findServiceByName(climateServiceName);
			
			if (originalService == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original climateService " + climateServiceName);
			}

			jsonData.put("creatorId", 1);
			jsonData.put("purpose", originalService.getPurpose());
			jsonData.put("url", originalService.getUrl());
			jsonData.put("scenario", originalService.getScenario());
			jsonData.put("versionNo", originalService.getVersion());
			
			if (originalService.getRootservice() != null)
				
				jsonData.put("rootServiceId", originalService.getRootservice());
			String editField = df.field("name").value();
			
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			if (editField == null || editField.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found edit field");
			}

			JsonNode response = ClimateService.edit(climateServiceName, jsonData);
			Application.flashMsg(response);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok("updated");

	}

	public static Result getConfigurationByConfId() {
		String output = "";
		TwoDVarMap twoDVarMap = new TwoDVarMap();
		TwoDVarZonalMean twoDVarZonalMean = new TwoDVarZonalMean();
		ScatterHistogramTwoVar scatterHistogram = new ScatterHistogramTwoVar();
		ThreeDVarAvgVertical4Profile threeDVarAvgVertical = new ThreeDVarAvgVertical4Profile();
		DiffPlotTwoTimeAveragedVar diffPlotTwoTimeAvg = new DiffPlotTwoTimeAveragedVar();
		ThreeDVar2DSlice threeDVar2DSlice = new ThreeDVar2DSlice();
		TwoDVarTimeSeries twoDVarTimeSeries = new TwoDVarTimeSeries();
		ThreeDVarZonalMean threeDVarZonalMean = new ThreeDVarZonalMean();
		ConditionalSampling conditionalSampling = new ConditionalSampling();
		RegridAndDownload regridAndDownload = new RegridAndDownload();
		CorrelationMap correlationMap = new CorrelationMap();
		ConditionalSampling2Var conditionalSampling2Var = new ConditionalSampling2Var();
		
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String logId = df.field("logId").value();

			if (logId == null || logId.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("confId is null or empty");
			}

			JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + Constants.SERVICE_EXECUTION_LOG + Constants.SERVICE_EXECUTION_LOG_GET + logId);
			int configurationId = response.path("serviceConfiguration").path("id").asInt();
			JsonNode responseConfigItems = APICall.callAPI(Constants.NEW_BACKEND + Constants.CONFIG_ITEM + Constants.GET_CONFIG_ITEMS_BY_CONFIG + configurationId);
			String serviceName = response.path("climateService").path("name").asText();
			//TODO:
			if (serviceName.equals("2-D-Variable-Zonal-Mean")) {
				//TODO: DO NOT USE node.findPath(key)!!!!!  use find(key) instead to get your immediate children if you know the json structure (and we do).
				//TODO: (con't) findPath returns the first occurence of a key string, including GRANDCHILDREN
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();

					if (parameterName.equals("data source")) {
						twoDVarZonalMean.setDataSource(parameterValue);
					} else if (parameterName.equals("variable name")) {
						twoDVarZonalMean.setVariableName(parameterValue);
					} else if (parameterName.equals("start year-month")) {
						twoDVarZonalMean.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("end year-month")) {
						twoDVarZonalMean.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("select months")) {
						String[] months = parameterValue.split(",");
						for (int j = 0; j < months.length; j++) {
							if (months[j].equals("1")) {
								twoDVarZonalMean.addMonth("jan");
							} else if (months[j].equals("2")) {
								twoDVarZonalMean.addMonth("feb");
							} else if (months[j].equals("3")) {
								twoDVarZonalMean.addMonth("mar");
							} else if (months[j].equals("4")) {
								twoDVarZonalMean.addMonth("apr");
							} else if (months[j].equals("5")) {
								twoDVarZonalMean.addMonth("may");
							} else if (months[j].equals("6")) {
								twoDVarZonalMean.addMonth("jun");
							} else if (months[j].equals("7")) {
								twoDVarZonalMean.addMonth("jul");
							} else if (months[j].equals("8")) {
								twoDVarZonalMean.addMonth("aug");
							} else if (months[j].equals("9")) {
								twoDVarZonalMean.addMonth("sep");
							} else if (months[j].equals("10")) {
								twoDVarZonalMean.addMonth("oct");
							} else if (months[j].equals("11")) {
								twoDVarZonalMean.addMonth("nov");
							} else if (months[j].equals("12")) {
								twoDVarZonalMean.addMonth("dec");
							}
						}
						twoDVarZonalMean.changeSelectMonths();
					} else if (parameterName.equals("start lat (deg)")) {
						twoDVarZonalMean.setStartLat(parameterValue);
					} else if (parameterName.equals("end lat (deg)")) {
						twoDVarZonalMean.setEndLat(parameterValue);
					} else if (parameterName.equals("variable scale")) {
						twoDVarZonalMean.setVariableScale(parameterValue);
					}
				}
				twoDVarZonalMean.setExecutionPurpose(response.path("purpose").textValue());
				twoDVarZonalMean.setImage(response.path("plotUrl").textValue());
				twoDVarZonalMean.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.twoDVariableZonelMean.render(twoDVarZonalMean));
			}
			else if (serviceName.equals("2-D-Variable-Map")) {
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model")) {
						twoDVarMap.setDataSource(parameterValue);
					} else if (parameterName.equals("var")) {
						twoDVarMap.setVariableName(parameterValue);
					} else if (parameterName.equals("startT")) {
						twoDVarMap.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						twoDVarMap.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("months")) {
						String[] months = parameterValue.split(",");
						for (int j = 0; j < months.length; j++) {
							if (months[j].equals("1")) {
								twoDVarMap.addMonth("jan");
							} else if (months[j].equals("2")) {
								twoDVarMap.addMonth("feb");
							} else if (months[j].equals("3")) {
								twoDVarMap.addMonth("mar");
							} else if (months[j].equals("4")) {
								twoDVarMap.addMonth("apr");
							} else if (months[j].equals("5")) {
								twoDVarMap.addMonth("may");
							} else if (months[j].equals("6")) {
								twoDVarMap.addMonth("jun");
							} else if (months[j].equals("7")) {
								twoDVarMap.addMonth("jul");
							} else if (months[j].equals("8")) {
								twoDVarMap.addMonth("aug");
							} else if (months[j].equals("9")) {
								twoDVarMap.addMonth("sep");
							} else if (months[j].equals("10")) {
								twoDVarMap.addMonth("oct");
							} else if (months[j].equals("11")) {
								twoDVarMap.addMonth("nov");
							} else if (months[j].equals("12")) {
								twoDVarMap.addMonth("dec");
							}
						}
						twoDVarMap.changeSelectMonths();
					} else if (parameterName.equals("lat1")) {
						twoDVarMap.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						twoDVarMap.setEndLat(parameterValue);
					} else if (parameterName.equals("lon1")) {
						twoDVarMap.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						twoDVarMap.setEndLon(parameterValue);
					} else if (parameterName.equals("scale")) {
						twoDVarMap.setVariableScale(parameterValue);
						}
				}
				twoDVarMap.setExecutionPurpose(response.path("purpose").textValue());
				twoDVarMap.setImage(response.path("plotUrl").textValue());
				twoDVarMap.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.twoDVariableMap.render(twoDVarMap));
			}
			else if (serviceName.equals("Conditional-Sampling-with-One-Variable")){
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model2")) {
						conditionalSampling.setDataSourceE(parameterValue);
					} else if (parameterName.equals("model1")) {
						conditionalSampling.setDataSourceP(parameterValue);
					} else if (parameterName.equals("var2")) {
						conditionalSampling.setVariableNameE(parameterValue);
					} else if (parameterName.equals("var1")) {
						conditionalSampling.setVariableNameP(parameterValue);
					} else if (parameterName.equals("pre1")) {
						conditionalSampling.setPressureRangeP(parameterValue);
					} else if (parameterName.equals("pre2")) {
						conditionalSampling.setPressureRangeE(parameterValue);
					} else if (parameterName.equals("startT")) {
						conditionalSampling.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						conditionalSampling.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("lon1")) {
						conditionalSampling.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						conditionalSampling.setEndLon(parameterValue);
					} else if (parameterName.equals("lat1")) {
						conditionalSampling.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						conditionalSampling.setEndLat(parameterValue);
					} else if (parameterName.equals("months")) {
						String[] months = parameterValue.split(",");
						for (int j = 0; j < months.length; j++) {
							if (months[j].equals("1")) {
								conditionalSampling.addMonth("jan");
							} else if (months[j].equals("2")) {
								conditionalSampling.addMonth("feb");
							} else if (months[j].equals("3")) {
								conditionalSampling.addMonth("mar");
							} else if (months[j].equals("4")) {
								conditionalSampling.addMonth("apr");
							} else if (months[j].equals("5")) {
								conditionalSampling.addMonth("may");
							} else if (months[j].equals("6")) {
								conditionalSampling.addMonth("jun");
							} else if (months[j].equals("7")) {
								conditionalSampling.addMonth("jul");
							} else if (months[j].equals("8")) {
								conditionalSampling.addMonth("aug");
							} else if (months[j].equals("9")) {
								conditionalSampling.addMonth("sep");
							} else if (months[j].equals("10")) {
								conditionalSampling.addMonth("oct");
							} else if (months[j].equals("11")) {
								conditionalSampling.addMonth("nov");
							} else if (months[j].equals("12")) {
								conditionalSampling.addMonth("dec");
							}

						}
						conditionalSampling.changeSelectMonths();
					} else if (parameterName.equals("bin_min")) {
						conditionalSampling.setBin_min(parameterValue);
					} else if (parameterName.equals("bin_max")) {
						conditionalSampling.setBin_max(parameterValue);
					} else if (parameterName.equals("bin_n")) {
						conditionalSampling.setBin_n(parameterValue);
					} else if (parameterName.equals("displayOpt")) {
						int paramBit=Integer.parseInt(parameterValue);
						int bitmaskX = 0x1;
						int bitmaskY = 0x2;
						int bitmaskZ = 0x4;
						conditionalSampling.setX(Integer.toString(paramBit & bitmaskX, 2));
						conditionalSampling.setY(Integer.toString((paramBit & bitmaskY)>>1, 2));
						conditionalSampling.setZ(Integer.toString((paramBit & bitmaskZ)>>2, 2));
					}
				}
				conditionalSampling.setExecutionPurpose(response.path("purpose").textValue());
				conditionalSampling.setImage(response.path("plotUrl").textValue());
				conditionalSampling.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.conditionalSampling.render(conditionalSampling));
			}else if (serviceName.equals("2-D-Variable-Time-Series")){
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model")) {
						twoDVarTimeSeries.setDataSource(parameterValue);
					} else if (parameterName.equals("var")) {
						twoDVarTimeSeries.setVariableName(parameterValue);
					} else if (parameterName.equals("startT")) {
						twoDVarTimeSeries.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						twoDVarTimeSeries.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("lat1")) {
						twoDVarTimeSeries.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						twoDVarTimeSeries.setEndLat(parameterValue);
					} else if (parameterName.equals("lon1")) {
						twoDVarTimeSeries.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						twoDVarTimeSeries.setEndLon(parameterValue);
					} else if (parameterName.equals("scale")) {
						twoDVarTimeSeries.setVariableScale(parameterValue);
					}
				}
				twoDVarTimeSeries.setExecutionPurpose(response.path("purpose").textValue());
				twoDVarTimeSeries.setImage(response.path("plotUrl").textValue());
				twoDVarTimeSeries.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.twoDVariableTimeSeries.render(twoDVarTimeSeries));
			}else if (serviceName.equals("Regrid-and-Download")){
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model")) {
						regridAndDownload.setDataSource(parameterValue);
					} else if (parameterName.equals("var")) {
						regridAndDownload.setVariableName(parameterValue);
					} else if (parameterName.equals("startT")) {
						regridAndDownload.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						regridAndDownload.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("lat1")) {
						regridAndDownload.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						regridAndDownload.setEndLat(parameterValue);
					} else if (parameterName.equals("dlat")) {
						regridAndDownload.setDeltaLat(parameterValue);
					} else if (parameterName.equals("dlon")) {
						regridAndDownload.setDeltaLon(parameterValue);
					} else if (parameterName.equals("lon1")) {
						regridAndDownload.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						regridAndDownload.setEndLon(parameterValue);
					} else if (parameterName.equals("plev")) {
						regridAndDownload.setPressureLevel(parameterValue);
					}
				}
				regridAndDownload.setExecutionPurpose(response.path("purpose").textValue());
				
				regridAndDownload.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.regridAndDownload.render(regridAndDownload));
			}else if (serviceName.equals("3-D-Variable-Zonal-Mean")){
				String press1 = "";
				String press2 = "";
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model")) {
						threeDVarZonalMean.setDataSource(parameterValue);
					} else if (parameterName.equals("var")) {
						threeDVarZonalMean.setVariableName(parameterValue);
					} else if (parameterName.equals("startT")) {
						threeDVarZonalMean.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						threeDVarZonalMean.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("lat1")) {
						threeDVarZonalMean.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						threeDVarZonalMean.setEndLat(parameterValue);
					} else if (parameterName.equals("pres1")) {
						press1 = parameterValue;
					} else if (parameterName.equals("pres2")) {
						press2 = parameterValue;
					} else if (parameterName.equals("months")) {
						String[] months = parameterValue.split(",");
						for (int j = 0; j < months.length; j++) {
							if (months[j].equals("1")) {
								threeDVarZonalMean.addMonth("jan");
							} else if (months[j].equals("2")) {
								threeDVarZonalMean.addMonth("feb");
							} else if (months[j].equals("3")) {
								threeDVarZonalMean.addMonth("mar");
							} else if (months[j].equals("4")) {
								threeDVarZonalMean.addMonth("apr");
							} else if (months[j].equals("5")) {
								threeDVarZonalMean.addMonth("may");
							} else if (months[j].equals("6")) {
								threeDVarZonalMean.addMonth("jun");
							} else if (months[j].equals("7")) {
								threeDVarZonalMean.addMonth("jul");
							} else if (months[j].equals("8")) {
								threeDVarZonalMean.addMonth("aug");
							} else if (months[j].equals("9")) {
								threeDVarZonalMean.addMonth("sep");
							} else if (months[j].equals("10")) {
								threeDVarZonalMean.addMonth("oct");
							} else if (months[j].equals("11")) {
								threeDVarZonalMean.addMonth("nov");
							} else if (months[j].equals("12")) {
								threeDVarZonalMean.addMonth("dec");
							}
						}
					} else if (parameterName.equals("scale")) {
						if (parameterValue.equals("2")) {
							threeDVarZonalMean.setPressureScale("2");
							threeDVarZonalMean.setColorScale("0");
						} else if (parameterValue.equals("0")) {
							threeDVarZonalMean.setPressureScale("0");
							threeDVarZonalMean.setColorScale("0");
						} else if (parameterValue.equals("4")) {
							threeDVarZonalMean.setPressureScale("0");
							threeDVarZonalMean.setColorScale("4");
						} else if (parameterValue.equals("6")) {
							threeDVarZonalMean.setPressureScale("2");
							threeDVarZonalMean.setColorScale("4");
						}
					}
				}
				if (!press1.isEmpty() & !press2.isEmpty())
					threeDVarZonalMean.setPressureRange("" + (Integer.parseInt(press1) / 100) + "," + (Integer.parseInt(press2) / 100));
				threeDVarZonalMean.setExecutionPurpose(response.path("purpose").textValue());
				threeDVarZonalMean.setImage(response.path("plotUrl").textValue());
				threeDVarZonalMean.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.threeDVariableZonalMean.render(threeDVarZonalMean));
			}else if (serviceName.equals("Scatter-and-Histogram-Plot-of-Two-Variables")){                    //"19")){
					scatterHistogram.setPressureLevel1("N/A");
					scatterHistogram.setPressureLevel2("N/A");
					for (int i = 0; i < responseConfigItems.size(); i++) {
						String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
						String parameterValue = responseConfigItems.get(i).path("value").textValue();
						if (parameterName.equals("model1")) {
							scatterHistogram.setSource1(parameterValue);

						} else if (parameterName.equals("model2")) {
							scatterHistogram.setSource2(parameterValue);

						} else if (parameterName.equals("var1")) {
							scatterHistogram.setVaribaleName1(parameterValue);

						} else if (parameterName.equals("var2")) {
							scatterHistogram.setVaribaleName2(parameterValue);
						} else if (parameterName.equals("startT")) {
							scatterHistogram.setStartYear(parameterValue);
						} else if (parameterName.equals("endT")) {
							scatterHistogram.setEndYear(parameterValue);
						} else if (parameterName.equals("lon1")) {
							scatterHistogram.setStartLon(parameterValue);
						} else if (parameterName.equals("lon2")) {
							scatterHistogram.setEndLon(parameterValue);
						} else if (parameterName.equals("lat1")) {
							scatterHistogram.setStartLat(parameterValue);
						} else if (parameterName.equals("lat2")) {
							scatterHistogram.setEndLat(parameterValue);
						} else if (parameterName.equals("nSample")) {
							scatterHistogram.setSamples(parameterValue);
						}
					}
					scatterHistogram.setExecutionPurpose(response.path("purpose").textValue());
					scatterHistogram.setImage(response.path("plotUrl").textValue());
					scatterHistogram.setDataUrl(response.path("dataUrl").textValue());
					return ok(views.html.climate.scatterAndHistogramTwoVariable.render(scatterHistogram));
			}else if (serviceName.equals("Difference-Plot-of-Two-Time-Averaged-Variables")){            //"20")){
					diffPlotTwoTimeAvg.setPressureLevel1("N/A");
					Console.println(diffPlotTwoTimeAvg.getPressureLevel1());
					diffPlotTwoTimeAvg.setPressureLevel2("N/A");
					for (int i = 0; i < responseConfigItems.size(); i++) {
						String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
						String parameterValue = responseConfigItems.get(i).path("value").textValue();
						if (parameterName.equals("model1")) {
							diffPlotTwoTimeAvg.setSource1(parameterValue);
						} else if (parameterName.equals("model2")) {
							diffPlotTwoTimeAvg.setSource2(parameterValue);
						} else if (parameterName.equals("var1")) {
							diffPlotTwoTimeAvg.setVaribaleName1(parameterValue);
						} else if (parameterName.equals("var2")) {
							diffPlotTwoTimeAvg.setVaribaleName2(parameterValue);
						} else if (parameterName.equals("pre1")) {
							diffPlotTwoTimeAvg.setPressureLevel1(parameterValue);
						} else if (parameterName.equals("pre2")) {
							diffPlotTwoTimeAvg.setPressureLevel2(parameterValue);
						} else if (parameterName.equals("startT")) {
							diffPlotTwoTimeAvg.setStartYear(parameterValue);
						} else if (parameterName.equals("endT")) {
							diffPlotTwoTimeAvg.setEndYear(parameterValue);
						} else if (parameterName.equals("lon1")) {
							diffPlotTwoTimeAvg.setStartLon(parameterValue);
						} else if (parameterName.equals("lon2")) {
							diffPlotTwoTimeAvg.setEndLon(parameterValue);
						} else if (parameterName.equals("lat1")) {
							diffPlotTwoTimeAvg.setStartLat(parameterValue);
						} else if (parameterName.equals("lat2")) {
							diffPlotTwoTimeAvg.setEndLat(parameterValue);
						}
					}
					diffPlotTwoTimeAvg.setExecutionPurpose(response.path("purpose").textValue());
					diffPlotTwoTimeAvg.setImage(response.path("plotUrl").textValue());
					diffPlotTwoTimeAvg.setDataUrl(response.path("dataUrl").textValue());
					return ok(views.html.climate.differencePlotTwoTimeAveragedVariables.render(diffPlotTwoTimeAvg));
			}else if (serviceName.equals("3-D-Variable-Average-Vertical-Profile")){ //"18")){
					for (int i = 0; i < responseConfigItems.size(); i++) {
						String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
						String parameterValue = responseConfigItems.get(i).path("value").textValue();
						if (parameterName.equals("model")) {
							threeDVarAvgVertical.setDataSource(parameterValue);
						} else if (parameterName.equals("var")) {
							threeDVarAvgVertical.setVariableName(parameterValue);
						} else if (parameterName.equals("startT")) {
							threeDVarAvgVertical.setStartYearMonth(parameterValue);
						} else if (parameterName.equals("endT")) {
							threeDVarAvgVertical.setEndYearMonth(parameterValue);
						} else if (parameterName.equals("lon1")) {
							threeDVarAvgVertical.setStartLon(parameterValue);
						} else if (parameterName.equals("lon2")) {
							threeDVarAvgVertical.setEndLon(parameterValue);
						} else if (parameterName.equals("lat1")) {
							threeDVarAvgVertical.setStartLat(parameterValue);
						} else if (parameterName.equals("lat2")) {
							threeDVarAvgVertical.setEndLat(parameterValue);
						} else if (parameterName.equals("months")) {
							String[] months = parameterValue.split(",");
							for (int j = 0; j < months.length; j++) {
								if (months[j].equals("1")) {
									threeDVarAvgVertical.addMonth("jan");
								} else if (months[j].equals("2")) {
									threeDVarAvgVertical.addMonth("feb");
								} else if (months[j].equals("3")) {
									threeDVarAvgVertical.addMonth("mar");
								} else if (months[j].equals("4")) {
									threeDVarAvgVertical.addMonth("apr");
								} else if (months[j].equals("5")) {
									threeDVarAvgVertical.addMonth("may");
								} else if (months[j].equals("6")) {
									threeDVarAvgVertical.addMonth("jun");
								} else if (months[j].equals("7")) {
									threeDVarAvgVertical.addMonth("jul");
								} else if (months[j].equals("8")) {
									threeDVarAvgVertical.addMonth("aug");
								} else if (months[j].equals("9")) {
									threeDVarAvgVertical.addMonth("sep");
								} else if (months[j].equals("10")) {
									threeDVarAvgVertical.addMonth("oct");
								} else if (months[j].equals("11")) {
									threeDVarAvgVertical.addMonth("nov");
								} else if (months[j].equals("12")) {
									threeDVarAvgVertical.addMonth("dec");
								}
							}
							threeDVarAvgVertical.changeSelectMonths();
						} else if (parameterName.equals("scale")) {
							if (parameterValue.equals("2")) {
								threeDVarAvgVertical.setPressureLevelScale("2");
								threeDVarAvgVertical.setVariableScale("0");
							} else if (parameterValue.equals("0")) {
								threeDVarAvgVertical.setPressureLevelScale("0");
								threeDVarAvgVertical.setVariableScale("0");
							} else if (parameterValue.equals("1")) {
								threeDVarAvgVertical.setPressureLevelScale("0");
								threeDVarAvgVertical.setVariableScale("1");
							} else if (parameterValue.equals("3")) {
								threeDVarAvgVertical.setPressureLevelScale("2");
								threeDVarAvgVertical.setVariableScale("1");
							}

						}
					}
					threeDVarAvgVertical.setExecutionPurpose(response.path("purpose").textValue());
					threeDVarAvgVertical.setImage(response.path("plotUrl").textValue());
					threeDVarAvgVertical.setDataURL(response.path("dataUrl").textValue());
					return ok(views.html.climate.threeDVariableAerageVerticalProfile.render(threeDVarAvgVertical));
			}else if (serviceName.equals("3-D-Variable-2-D-Slice")){ //"16")){
					for (int i = 0; i < responseConfigItems.size(); i++) {
						String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
						String parameterValue = responseConfigItems.get(i).path("value").textValue();
						if (parameterName.equals("model")) {
							threeDVar2DSlice.setDataSource(parameterValue);
						} else if (parameterName.equals("var")) {
							threeDVar2DSlice.setVariableName(parameterValue);
						} else if (parameterName.equals("pr")) {
							threeDVar2DSlice.setPressureLevel(parameterValue);
						} else if (parameterName.equals("startT")) {
							threeDVar2DSlice.setStartYearMonth(parameterValue);
						} else if (parameterName.equals("endT")) {
							threeDVar2DSlice.setEndYearMonth(parameterValue);
						} else if (parameterName.equals("lon1")) {
							threeDVar2DSlice.setStartLon(parameterValue);
						} else if (parameterName.equals("lon2")) {
							threeDVar2DSlice.setEndLon(parameterValue);
						} else if (parameterName.equals("lat1")) {
							threeDVar2DSlice.setStartLat(parameterValue);
						} else if (parameterName.equals("lat2")) {
							threeDVar2DSlice.setEndLat(parameterValue);
						} else if (parameterName.equals("months")) {
							String[] months = parameterValue.split(",");
							for (int j = 0; j < months.length; j++) {
								if (months[j].equals("1")) {
									threeDVar2DSlice.addMonth("jan");
								} else if (months[j].equals("2")) {
									threeDVar2DSlice.addMonth("feb");
								} else if (months[j].equals("3")) {
									threeDVar2DSlice.addMonth("mar");
								} else if (months[j].equals("4")) {
									threeDVar2DSlice.addMonth("apr");
								} else if (months[j].equals("5")) {
									threeDVar2DSlice.addMonth("may");
								} else if (months[j].equals("6")) {
									threeDVar2DSlice.addMonth("jun");
								} else if (months[j].equals("7")) {
									threeDVar2DSlice.addMonth("jul");
								} else if (months[j].equals("8")) {
									threeDVar2DSlice.addMonth("aug");
								} else if (months[j].equals("9")) {
									threeDVar2DSlice.addMonth("sep");
								} else if (months[j].equals("10")) {
									threeDVar2DSlice.addMonth("oct");
								} else if (months[j].equals("11")) {
									threeDVar2DSlice.addMonth("nov");
								} else if (months[j].equals("12")) {
									threeDVar2DSlice.addMonth("dec");
								}
							}
							threeDVar2DSlice.changeSelectMonths();
						} else if (parameterName.equals("scale")) {
							threeDVar2DSlice.setColorScale(parameterValue);
						}
					}
					threeDVar2DSlice.setExecutionPurpose(response.path("purpose").textValue());
					threeDVar2DSlice.setImage(response.path("plotUrl").textValue());
					threeDVar2DSlice.setDataURL(response.path("dataUrl").textValue());
					return ok(views.html.climate.threeDVariableTwoDSlice.render(threeDVar2DSlice));

			}else if(serviceName.equals("Time-Lagged-Correlation-Map-of-Two-Variables")){
				correlationMap.setPressureLevel1("N/A");
				Console.println(correlationMap.getPressureLevel1());
				correlationMap.setPressureLevel2("N/A");
				for(int i = 0; i < responseConfigItems.size(); i++){
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model1")) {
						correlationMap.setSource1(parameterValue);
					} else if (parameterName.equals("model2")) {
						correlationMap.setSource2(parameterValue);
					} else if (parameterName.equals("var1")) {
						correlationMap.setVariableName1(parameterValue);
					} else if (parameterName.equals("var2")) {
						correlationMap.setVariableName2(parameterValue);
					} else if (parameterName.equals("pres1")) {
						correlationMap.setPressureLevel1(parameterValue);
					} else if (parameterName.equals("pres2")) {
						correlationMap.setPressureLevel2(parameterValue);
					} else if (parameterName.equals("startT")) {
						correlationMap.setStartYear(parameterValue);
					} else if (parameterName.equals("endT")) {
						correlationMap.setEndYear(parameterValue);
					} else if (parameterName.equals("lon1")) {
						correlationMap.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						correlationMap.setEndLon(parameterValue);
					} else if (parameterName.equals("lat1")) {
						correlationMap.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						correlationMap.setEndLat(parameterValue);
					}else if (parameterName.equals("laggedTime")) {
						correlationMap.setLaggedTime(parameterValue);
					}
				}
				correlationMap.setExecutionPurpose(response.path("purpose").textValue());
				correlationMap.setImage(response.path("plotUrl").textValue());
				correlationMap.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.correlationMap.render(correlationMap));
			
			}else if (serviceName.equals("Conditional-Sampling-with-Two-Variables")){
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();
					if (parameterName.equals("model1")) {
						conditionalSampling2Var.setDataSourceP(parameterValue);
					} else if (parameterName.equals("model2")) {
						conditionalSampling2Var.setDataSourceE1(parameterValue);
					} else if (parameterName.equals("model3")) {
						conditionalSampling2Var.setDataSourceE2(parameterValue);
					} else if (parameterName.equals("var1")) {
						conditionalSampling2Var.setVariableNameP(parameterValue);
					} else if (parameterName.equals("var2")) {
						conditionalSampling2Var.setVariableNameE1(parameterValue);
					} else if (parameterName.equals("var3")) {
						conditionalSampling2Var.setVariableNameE2(parameterValue);
					} else if (parameterName.equals("pres1")) {
						conditionalSampling2Var.setPressureRange1(parameterValue);
					} else if (parameterName.equals("pres2")) {
						conditionalSampling2Var.setPressureRange2(parameterValue);
					} else if (parameterName.equals("startT")) {
						conditionalSampling2Var.setStartYearMonth(parameterValue);
					} else if (parameterName.equals("endT")) {
						conditionalSampling2Var.setEndYearMonth(parameterValue);
					} else if (parameterName.equals("lon1")) {
						conditionalSampling2Var.setStartLon(parameterValue);
					} else if (parameterName.equals("lon2")) {
						conditionalSampling2Var.setEndLon(parameterValue);
					} else if (parameterName.equals("lat1")) {
						conditionalSampling2Var.setStartLat(parameterValue);
					} else if (parameterName.equals("lat2")) {
						conditionalSampling2Var.setEndLat(parameterValue);
					} else if (parameterName.equals("months")) {
						String[] months = parameterValue.split(",");
						for (int j = 0; j < months.length; j++) {
							if (months[j].equals("1")) {
								conditionalSampling2Var.addMonth("jan");
							} else if (months[j].equals("2")) {
								conditionalSampling2Var.addMonth("feb");
							} else if (months[j].equals("3")) {
								conditionalSampling2Var.addMonth("mar");
							} else if (months[j].equals("4")) {
								conditionalSampling2Var.addMonth("apr");
							} else if (months[j].equals("5")) {
								conditionalSampling2Var.addMonth("may");
							} else if (months[j].equals("6")) {
								conditionalSampling2Var.addMonth("jun");
							} else if (months[j].equals("7")) {
								conditionalSampling2Var.addMonth("jul");
							} else if (months[j].equals("8")) {
								conditionalSampling2Var.addMonth("aug");
							} else if (months[j].equals("9")) {
								conditionalSampling2Var.addMonth("sep");
							} else if (months[j].equals("10")) {
								conditionalSampling2Var.addMonth("oct");
							} else if (months[j].equals("11")) {
								conditionalSampling2Var.addMonth("nov");
							} else if (months[j].equals("12")) {
								conditionalSampling2Var.addMonth("dec");
							}
						}
						conditionalSampling2Var.changeSelectMonths();
					} else if (parameterName.equals("bin_min1")) {
						conditionalSampling2Var.setBin_min1(parameterValue);
					} else if (parameterName.equals("bin_max1")) {
						conditionalSampling2Var.setBin_max1(parameterValue);
					} else if (parameterName.equals("bin_n1")) {
						conditionalSampling2Var.setBin_n1(parameterValue);
					} else if (parameterName.equals("bin_min2")) {
						conditionalSampling2Var.setBin_min2(parameterValue);
					} else if (parameterName.equals("bin_max2")) {
						conditionalSampling2Var.setBin_max2(parameterValue);
					} else if (parameterName.equals("bin_n2")) {
						conditionalSampling2Var.setBin_n2(parameterValue);
					} else if (parameterName.equals("env_var_plev1")) {
						conditionalSampling2Var.setEnableVarPlev1(parameterValue);
					} else if (parameterName.equals("env_var_plev2")) {
						conditionalSampling2Var.setEnableVarPlev2(parameterValue);
					} else if (parameterName.equals("displayOpt")) {
						int paramBit=Integer.parseInt(parameterValue);
						int bitmaskX = 0x1;
						int bitmaskY = 0x2;
						int bitmaskZ = 0x4;
						conditionalSampling2Var.setX(Integer.toString(paramBit & bitmaskX, 2));
						conditionalSampling2Var.setY(Integer.toString((paramBit & bitmaskY)>>1, 2));
						conditionalSampling2Var.setZ(Integer.toString((paramBit & bitmaskZ)>>2, 2));
					}
				}
				conditionalSampling2Var.setExecutionPurpose(response.path("purpose").textValue());
				conditionalSampling2Var.setImage(response.path("plotUrl").textValue());
				conditionalSampling2Var.setDataURL(response.path("dataUrl").textValue());
				return ok(views.html.climate.conditionalSampling2Var.render(conditionalSampling2Var));
			}else{
				
			}
			Application.flashMsg(response);
			Application.flashMsg(response);
		}catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));

		return ok();
	}

	public static Result deleteClimateService() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String climateServiceId = df.field("idHolder").value();
		Logger.debug(climateServiceId);
		JsonNode response = ClimateService.delete(climateServiceId);
		Application.flashMsg(response);
		return redirect("/climate/climateServices");
	}

	public static Result deleteServiceLog() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String confId = df.field("idHolder").value();
		Logger.debug(confId);
		JsonNode response = ServiceLog.deleteServiceLog(confId);
		Application.flashMsg(response);
		return redirect("/serviceLog");
	}

	public static Result downloadClimateService() {
		List<ClimateService> user = ClimateService.all();
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("user.json");
		try {
			mapper.writeValue(file, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response().setContentType("application/x-download");
		response().setHeader("Content-disposition",
				"attachment; filename=user.json");
		return ok(file);
	}
	
	public static Result oneService(String url) {
		return ok(oneService.render("/assets/html/" + url));
	}

}
