package models;

import util.APICall;

import com.fasterxml.jackson.databind.JsonNode;

public class SensorReading {
	private String sensorName;
	private String startTime;
	private String endTime;

	private static final String GET_SENSOR_READING_INRANGE_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_SENSOR_READING_IN_RANGE;
	
	private static final String GET_SENSOR_READING_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_SENSOR_READING;
	
	private static final String GET_LATEST_SENSOR_READING_CALL = util.Constants.NEW_API_URL
			+ util.Constants.NEW_GET_LATEST_SENSOR_READING_IN_ALL_DEVICES;

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public static JsonNode getReadingsWithinRange(String sensorName,
			String startTime, String endTime) {

		JsonNode readingsNode = APICall.callAPI(wrapTimeRangeURL(sensorName,
				startTime, endTime));
		return readingsNode;
	}
	

	public static JsonNode getReadingsAtTimestamp(String sensorName,
			String time) {
		System.out.println(wrapTimeURL(sensorName,time));
		JsonNode readingsNode = APICall.callAPI(wrapTimeURL(sensorName,
				time));
		return readingsNode;
	}
	
	public static JsonNode getLatestSensorReading(String sensorTypeName) {
		JsonNode readingsNode = APICall.callAPI(wrapLatestURL(sensorTypeName));
		return readingsNode;
	}

	private static String wrapTimeRangeURL(String sensorName, String startTime,
			String endTime) {
		return GET_SENSOR_READING_INRANGE_CALL + sensorName + "/" + startTime + "/"
				+ endTime + "/json";
	}
	
	private static String wrapTimeURL(String sensorName, String time) {
		return GET_SENSOR_READING_CALL + sensorName + "/" + time + "/json";
	}
	
	private static String wrapLatestURL(String sensorTypeName) {
		return GET_LATEST_SENSOR_READING_CALL + sensorTypeName + "/json";
	}
}
