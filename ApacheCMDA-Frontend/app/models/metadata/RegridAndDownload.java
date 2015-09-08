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

package models.metadata;

public class RegridAndDownload {
	private String dataSource = "";
	private String variableName = "";
	private String startYearMonth = "";
	private String endYearMonth = "";
	private String startLat = "";
	private String endLat = "";
	private String deltaLat = "";
	private String startLon = "";
	private String endLon = "";
	private String deltaLon = "";
	private String pressureLevel = "";
	private String executionPurpose = "";
	private String dataURL = "";
	private String serviceResponseText = "";
	
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	public String getStartYearMonth() {
		return startYearMonth;
	}
	public void setStartYearMonth(String startYearMonth) {
		this.startYearMonth = startYearMonth;
	}
	public String getEndYearMonth() {
		return endYearMonth;
	}
	public void setEndYearMonth(String endYearMonth) {
		this.endYearMonth = endYearMonth;
	}
	public String getStartLat() {
		return startLat;
	}
	public void setStartLat(String startLat) {
		this.startLat = startLat;
	}
	public String getEndLat() {
		return endLat;
	}
	public void setEndLat(String endLat) {
		this.endLat = endLat;
	}
	public String getDeltaLat() {
		return deltaLat;
	}
	public void setDeltaLat(String deltaLat) {
		this.deltaLat = deltaLat;
	}
	public String getStartLon() {
		return startLon;
	}
	public void setStartLon(String startLon) {
		this.startLon = startLon;
	}
	public String getEndLon() {
		return endLon;
	}
	public void setEndLon(String endLon) {
		this.endLon = endLon;
	}
	public String getDeltaLon() {
		return deltaLon;
	}
	public void setDeltaLon(String deltaLon) {
		this.deltaLon = deltaLon;
	}
	public String getPressureLevel() {
		return pressureLevel;
	}
	public void setPressureLevel(String pressureLevel) {
		this.pressureLevel = pressureLevel;
	}
	public String getExecutionPurpose() {
		return executionPurpose;
	}
	public void setExecutionPurpose(String executionPurpose) {
		this.executionPurpose = executionPurpose;
	}
	public String getDataURL() {
		return dataURL;
	}
	public void setDataURL(String dataURL) {
		this.dataURL = dataURL;
	}
	public String getServiceResponseText() {
		return serviceResponseText;
	}
	public void setServiceResponseText(String serviceResponseText) {
		this.serviceResponseText = serviceResponseText;
	}		
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
	
}
