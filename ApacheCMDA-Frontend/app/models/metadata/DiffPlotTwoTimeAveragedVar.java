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

public class DiffPlotTwoTimeAveragedVar {
	String source1;
	String varibaleName1;
	String pressureLevel1;
	String startYear;
	String startLat;
	String startLon;
	
	String source2;
	String varibaleName2;
	String pressureLevel2;
	String endYear;
	String endLat;
	String endLon;
	
	String executionPurpose;
	String image;
	String dataUrl;
	String serviceResponse;
	
	
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public String getEndLat() {
		return endLat;
	}
	public void setEndLat(String endLat) {
		this.endLat = endLat;
	}
	public String getEndLon() {
		return endLon;
	}
	public void setEndLon(String endLon) {
		this.endLon = endLon;
	}
	public String getSource1() {
		return source1;
	}
	public void setSource1(String source1) {
		this.source1 = source1;
	}
	public String getVaribaleName1() {
		return varibaleName1;
	}
	public void setVaribaleName1(String varibaleName1) {
		this.varibaleName1 = varibaleName1;
	}
	public String getPressureLevel1() {
		return pressureLevel1;
	}
	public void setPressureLevel1(String pressureLevel1) {
		this.pressureLevel1 = pressureLevel1;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getStartLat() {
		return startLat;
	}
	public void setStartLat(String startLat) {
		this.startLat = startLat;
	}
	public String getStartLon() {
		return startLon;
	}
	public void setStartLon(String startLon) {
		this.startLon = startLon;
	}
	public String getSource2() {
		return source2;
	}
	public void setSource2(String source2) {
		this.source2 = source2;
	}
	public String getVaribaleName2() {
		return varibaleName2;
	}
	public void setVaribaleName2(String varibaleName2) {
		this.varibaleName2 = varibaleName2;
	}
	public String getPressureLevel2() {
		return pressureLevel2;
	}
	public void setPressureLevel2(String pressureLevel2) {
		this.pressureLevel2 = pressureLevel2;
	}
	public String getExecutionPurpose() {
		return executionPurpose;
	}
	public void setExecutionPurpose(String executionPurpose) {
		this.executionPurpose = executionPurpose;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDataUrl() {
		return dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}
	public String getServiceResponse() {
		return serviceResponse;
	}
	public void setServiceResponse(String serviceResponse) {
		this.serviceResponse = serviceResponse;
	}
	
}
