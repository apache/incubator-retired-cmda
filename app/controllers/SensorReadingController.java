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
package controllers;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.SensorReading;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

public class SensorReadingController extends Controller {
	final static Form<SensorReading> sensorReadingForm = Form
			.form(SensorReading.class);

	public static Result sensorReadings() {
		return ok(sensorReading.render(sensorReadingForm));
	}

	public static Result getSensorReadingsWithinRange() {
		Form<SensorReading> sr = sensorReadingForm.bindFromRequest();
		String[] postAction = request().body().asFormUrlEncoded().get("action");
		JsonNode resultNode;
		File file = new File("sensor.json");

		try {
			// String deviceName = sr.field("deviceName").value();
			String sensorName = sr.field("sensorName").value();

			String startDate = sr.field("startDate").value();
			String startTime = sr.field("startTime").value();
			Long startTimeStamp = convertToUnixTime(startDate + startTime);

			String endDate = sr.field("endDate").value();
			String endTime = sr.field("endTime").value();
			Long endTimeStamp = convertToUnixTime(endDate + endTime);

			resultNode = SensorReading.getReadingsWithinRange(sensorName,
					startTimeStamp.toString(), endTimeStamp.toString());

			if (resultNode == null || resultNode.has("error")
					|| !resultNode.isArray()) {
				Application.flashMsg(resultNode);
				return ok(sensorReading.render(sensorReadingForm));
			}

			if (postAction == null || postAction.length == 0) {
				return badRequest("You must provide a valid action");
			} else {
				String action = postAction[0];
				if ("Submit".equals(action)) {
					return ok(resultNode);
				} else if ("Download".equals(action)) {
					// 1. Convert Java object to JSON format
					ObjectMapper mapper = new ObjectMapper();

					try {
						mapper.writeValue(file, resultNode);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					response().setContentType("application/x-download");
					response().setHeader("Content-disposition",
							"attachment; filename=sensor.json");

					return ok(file);

				} else {
					return badRequest("This action is not allowed");
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

		if (postAction == null || postAction.length == 0) {
			return badRequest("You must provide a valid action");
		} else {

			String action = postAction[0];
			if ("Submit".equals(action)) {
				return ok(sensorReading.render(sensorReadingForm));
			} else if ("Download".equals(action)) {
				return ok(file);
			} else {
				return badRequest("This action is not allowed");
			}
		}
	}

	public static Result getSensorReadingsAtTimestamp() {
		Form<SensorReading> sr = sensorReadingForm.bindFromRequest();
		String[] postAction = request().body().asFormUrlEncoded().get("action");
		JsonNode resultNode;
		File file = new File("sensor.json");

		try {
			// String deviceName = sr.field("deviceName").value();
			String sensorName = sr.field("sensorName2").value();

			String date = sr.field("Date").value();
			String time = sr.field("Time").value();
			Long timeStamp = convertToUnixTime(date + time);

			resultNode = SensorReading.getReadingsAtTimestamp(sensorName,
					timeStamp.toString());

			if (resultNode == null || resultNode.has("error")) {
				Application.flashMsg(resultNode);
				return ok(sensorReading.render(sensorReadingForm));
			}
			if (postAction == null || postAction.length == 0) {

				
				return badRequest("You must provide a valid action");
			} else {

				System.out.println("");
				String action = postAction[0];
				if ("Submit".equals(action)) {
					return ok(resultNode);
				} else if ("Download".equals(action)) {
					// 1. Convert Java object to JSON format
					ObjectMapper mapper = new ObjectMapper();

					try {
						mapper.writeValue(file, resultNode);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					response().setContentType("application/x-download");
					response().setHeader("Content-disposition",
							"attachment; filename=sensor.json");

					return ok(file);

				} else {
					return badRequest("This action is not allowed");
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

		if (postAction == null || postAction.length == 0) {
			return badRequest("You must provide a valid action");
		} else {
			String action = postAction[0];
			if ("Submit".equals(action)) {
				return ok(sensorReading.render(sensorReadingForm));
			} else if ("Download".equals(action)) {
				return ok(file);
			} else {
				return badRequest("This action is not allowed");
			}
		}
	}

	public static Result getLatestSensorReadings() {
		Form<SensorReading> sr = sensorReadingForm.bindFromRequest();
		String[] postAction = request().body().asFormUrlEncoded().get("action");
		JsonNode resultNode;
		File file = new File("sensor.json");

		try {
			// String deviceName = sr.field("deviceName").value();
			String sensorTypeName = sr.field("sensorTypeName").value();

			resultNode = SensorReading.getLatestSensorReading(sensorTypeName);

			System.out.println("0 "+resultNode);
			
			if (resultNode == null || resultNode.has("error")
					|| !resultNode.isArray()) {
				Application.flashMsg(resultNode);
				return ok(sensorReading.render(sensorReadingForm));
			}

			System.out.println("1 "+resultNode);
			if (postAction == null || postAction.length == 0) {
				return badRequest("You must provide a valid action");
			} else {

				System.out.println("2 "+resultNode);
				String action = postAction[0];
				if ("Submit".equals(action)) {
					return ok(resultNode);
				} else if ("Download".equals(action)) {
					// 1. Convert Java object to JSON format
					ObjectMapper mapper = new ObjectMapper();

					try {
						mapper.writeValue(file, resultNode);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					response().setContentType("application/x-download");
					response().setHeader("Content-disposition",
							"attachment; filename=sensor.json");

					return ok(file);

				} else {
					return badRequest("This action is not allowed");
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

		if (postAction == null || postAction.length == 0) {
			return badRequest("You must provide a valid action");
		} else {
			String action = postAction[0];
			if ("Submit".equals(action)) {
				return ok(sensorReading.render(sensorReadingForm));
			} else if ("Download".equals(action)) {
				return ok(file);
			} else {
				return badRequest("This action is not allowed");
			}
		}
	}

	public static Result downloadSensorReadings() {
		Form<SensorReading> sr = sensorReadingForm.bindFromRequest();
		JsonNode resultNode;
		File file = new File("E:\\sensor.json");

		try {
			//String deviceName = sr.field("deviceName").value();
			String sensorName = sr.field("sensorName").value();

			String startDate = sr.field("startDate").value();
			String startTime = sr.field("startTime").value();
			Long startTimeStamp = convertToUnixTime(startDate + startTime);

			String endDate = sr.field("endDate").value();
			String endTime = sr.field("endTime").value();
			Long endTimeStamp = convertToUnixTime(endDate + endTime);

			resultNode = SensorReading.getReadingsWithinRange(sensorName,
					startTimeStamp.toString(), endTimeStamp.toString());

			if (resultNode == null || resultNode.has("error")
					|| !resultNode.isArray()) {
				Application.flashMsg(resultNode);
				return ok(sensorReading.render(sensorReadingForm));
			}
			// 1. Convert Java object to JSON format
			ObjectMapper mapper = new ObjectMapper();

			try {
				mapper.writeValue(file, resultNode);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			response().setContentType("application/x-download");
			response().setHeader("Content-disposition",
					"attachment; filename=sensor.json");

			return ok(file);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok(file);

	}

	private static long convertToUnixTime(String timeStamp) throws Exception {
		DateFormat startTimeStamp = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		startTimeStamp.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		return startTimeStamp.parse(timeStamp).getTime();

	}
}