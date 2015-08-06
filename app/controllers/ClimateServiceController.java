package controllers;

import static play.data.Form.form;
import models.DataSet;
import models.BugReport;
import models.NasaRegistration;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ClimateServiceController extends Controller {

	final static Form<ClimateService> climateServiceForm = Form
			.form(ClimateService.class);

	public static Result estimate(String email, String vfile, String dataset) {
		return ok(estimate.render(email, vfile, dataset));
	}
	
	public static Result home(String email, String vfile, String dataset) {
		return ok(home.render(email, vfile, dataset));
	}

	public static Result addClimateServices() {
		return ok(addClimateServices.render(climateServiceForm));
	}

	public static Result tutorial() {
		return ok(tutorial.render());
	}

	public static Result accountSummary(String userName) {
		return ok(accountSummary.render(userName));
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

			// name should not contain spaces
			if (newClimateServiceName != null && !newClimateServiceName.isEmpty()) {
				jsonData.put("name", newClimateServiceName);
			}
			jsonData.put("creatorId", 1);    //TODO, since we don't have login/account id yet use a default val
			jsonData.put("purpose", dc.field("Purpose").value());
			jsonData.put("url", dc.field("Url").value());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			//get current date time with Date()
			Date date = new Date();
			jsonData.put("createTime", dateFormat.format(date));
			jsonData.put("scenario", dc.field("Scenario").value());
			jsonData.put("versionNo", dc.field("Version").value());
			jsonData.put("rootServiceId", dc.field("Root_Service").value());

			// create the item by calling the API
			JsonNode response = ClimateService.create(jsonData);

			// flash the response message
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

			// if not found, it is an empty ClimateService
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

			// Call the edit() method
			JsonNode response = ClimateService.edit(climateServiceName, jsonData);

			// flash the response message
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

	//get parameters of a service log by serviceConfigurationId
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
		
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String logId = df.field("logId").value();

			if (logId == null || logId.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("confId is null or empty");
			}

			// Call API
			//JsonNode response = APICall.callAPI("http://localhost:9008/getConfigurationByConId/json");
			JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + Constants.SERVICE_EXECUTION_LOG + Constants.SERVICE_EXECUTION_LOG_GET + logId);

			int configurationId = response.path("serviceConfiguration").path("id").asInt();

			JsonNode responseConfigItems = APICall.callAPI(Constants.NEW_BACKEND + Constants.CONFIG_ITEM + Constants.GET_CONFIG_ITEMS_BY_CONFIG + configurationId);
//			Console.print(responseSpec.toString());
			String serviceName = response.path("climateService").path("name").asText();

			//TODO:
			if (serviceName.equals("2-D-Variable-Zonal-Mean")) {
				//TODO: DO NOT USE node.findPath(key)!!!!!  use find(key) instead to get your immediate children if you know the json structure (and we do).
				//TODO: (con't) findPath returns the first occurence of a key string, including GRANDCHILDREN
				for (int i = 0; i < responseConfigItems.size(); i++) {
					String parameterName = responseConfigItems.get(i).path("parameter").path("purpose").textValue();
					String parameterValue = responseConfigItems.get(i).path("value").textValue();

					//	String parameterName = response.get(i).path("parameterPurpose").textValue();
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
				return ok(views.html.climate.TwoDVariableZonelMean.render(twoDVarZonalMean));
			}
			else if (serviceName.equals("2-D-Variable-Map")) {//Old ID 12
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
			//Old ID 21
//			else if (serviceName.equals("2-D-Variable-Map")){
//				for(int i=0; i<response.size(); i++){
//					String parameterName = responseConfigItems.get(i).get("parameter").get("purpose").textValue();
//					String parameterValue = responseConfigItems.get(i).get("value").textValue();
//					if(parameterName.equals("model2")){
//						para_21.setDataSourceE(parameterValue);
//						
//					}else if(parameterName.equals("model1")){
//						para_21.setDataSourceP(parameterValue);
//						
//					}else if(parameterName.equals("var2")){
//						para_21.setVariableNameE(parameterValue);
//						
//					}else if(parameterName.equals("var1")){
//						para_21.setVariableNameP(parameterValue);
//					}else if(parameterName.equals("pre1")){
//						para_21.setPressureRangeP(parameterValue);
//					}
//					else if(parameterName.equals("pre2")){
//						para_21.setPressureRangeE(parameterValue);
//					}else if(parameterName.equals("startT")){
//						para_21.setStartYearMonth(parameterValue);
//					}else if(parameterName.equals("endT")){
//						para_21.setEndYearMonth(parameterValue);
//					}else if(parameterName.equals("lon1")){
//						para_21.setStartLon(parameterValue);
//					}else if(parameterName.equals("lon2")){
//						para_21.setEndLon(parameterValue);
//					}else if(parameterName.equals("lat1")){
//						Console.print("aaa"+parameterValue);
//						para_21.setStartLat(parameterValue);
//					}else if(parameterName.equals("lat2")){
//						para_21.setEndLat(parameterValue);
//					}else if(parameterName.equals("months")){
//						String[] months = parameterValue.split(",");
//						
//						for(int j=0; j<months.length; j++){
//							if(months[j].equals("1")){
//								para_21.addMonth("jan");
//							}else if(months[j].equals("2")){
//								para_21.addMonth("feb");
//							}else if(months[j].equals("3")){
//								para_21.addMonth("mar");
//							}else if(months[j].equals("4")){
//								para_21.addMonth("apr");
//							}else if(months[j].equals("5")){
//								para_21.addMonth("may");
//							}else if(months[j].equals("6")){
//								para_21.addMonth("jun");
//							}else if(months[j].equals("7")){
//								para_21.addMonth("jul");
//							}else if(months[j].equals("8")){
//								para_21.addMonth("aug");
//							}else if(months[j].equals("9")){
//								para_21.addMonth("sep");
//							}else if(months[j].equals("10")){
//								para_21.addMonth("oct");
//							}else if(months[j].equals("11")){
//								para_21.addMonth("nov");
//							}else if(months[j].equals("12")){
//								para_21.addMonth("dec");
//							}
//						}
//					}
//				}
//				twoDVarMap.setExecutionPurpose(response.path("purpose").textValue());
//				twoDVarMap.setImage(response.path("plotUrl").textValue());
//				twoDVarMap.setDataURL(response.path("dataUrl").textValue());
//				return ok(views.html.climate.twoDVariableMap.render(twoDVarMap));
//			}
				else if (serviceName.equals("Conditional-Sampling"))
				{    //Old ID 21
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
				}else if (serviceName.equals("2-D-Variable-Time-Series")){    //Old ID 1595
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
			}else if (serviceName.equals("Regrid-and-Download")){    //NEW ONE the 10th
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
					// old ID 1597
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
							//Console.println(press1);
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
					return ok(views.html.climate.DifferencePlotTwoTimeAveragedVariables.render(diffPlotTwoTimeAvg));
			}else if (serviceName.equals("3-D-Variable-Average-Vertical-4Profile")){ //"18")){
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

			}else{
				
			}

			// flash the response message
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

		// return a text message

		// Call the delete() method
		JsonNode response = ClimateService.delete(climateServiceId);

		// flash the response message
		Application.flashMsg(response);

		return redirect("/climate/climateServices");
	}

	public static Result deleteServiceLog() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String confId = df.field("idHolder").value();
		Logger.debug(confId);

		// return a text message

		// Call the delete() method
		JsonNode response = ServiceLog.deleteServiceLog(confId);

		// flash the response message
		Application.flashMsg(response);

		return redirect("/serviceLog");
	}

	public static Result downloadClimateService() {
		List<ClimateService> user = ClimateService.all();
		// 1. Convert Java object to JSON format
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
		return ok(oneService.render(url));
	}

	// -- Authentication
	public static class Login {


		public String username;
		public String password;

		public String validate() {
			if (username == null || password == null)
				return "Invalid username or password";


			return null;
		}

	}

	/**
	 * Login page.
	 */

	public static Result login() {
		return ok(login.render(form(Login.class)));
	}

	/** Handle login form submission. */

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		/*
		 * if (loginForm.hasErrors()){ System.out.println("Test"); return
		 * badRequest(login.render(loginForm)); } else {
		 */
		session("username", loginForm.get().username);
		System.out.println("Email:" + loginForm.field("username").value());
		if (loginForm.get().username.equals("admin")) {
			System.out.println("Admin arena");
			// session("username", loginForm.field("username").value());
			return redirect(routes.NasaRegistrationController.adminPage());
		} else {
			// session("username", loginForm.field("username").value());
			String userName = NasaRegistration.getUserInfo(
					loginForm.field("username").value(),
					loginForm.field("password").value());
			System.out.println("Value:" + userName);
			if (userName != null) {
				System.out.println("passed get User info");
				return redirect(routes.EstimateController
						.accountSummary(userName));
			} else
				return redirect(routes.EstimateController.authenticate());
			// Retrieve value from API and check against userName and password.

		}
	}

	public static Result logout() {
		session().clear();
		flash("success", "You've been logged out");
		return redirect(routes.EstimateController.estimate(null, null, null));
	}
}
