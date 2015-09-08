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

import java.util.ArrayList;

public class ConditionalSampling {
	private String dataSourceP = "";
	private String variableNameP = "";
	private String pressureRangeP = "";
	private String dataSourceE = "";
	private String variableNameE = "";
	private String pressureRangeE = "";
	private String startYearMonth = "";
	private String endYearMonth = "";
	private String selectMonths = "";
	private ArrayList<String> month = new ArrayList<String>();
	private String startLat = "";
	private String endLat = "";
	private String startLon = "";
	private String endLon = "";
	private String X;
	private String Y;
	private String Z;
	private String bin_min;
	private String bin_max;
	private String bin_n;
	private String customized;
	private String executionPurpose = "";
	private String image = "";
	private String dataURL = "";
	private String serviceResponseText = "";
	
	public String getBin_min() {
		return bin_min;
	}
	public void setBin_min(String bin_min) {
		this.bin_min = bin_min;
	}
	public String getBin_max() {
		return bin_max;
	}
	public void setBin_max(String bin_max) {
		this.bin_max = bin_max;
	}
	public String getBin_n() {
		return bin_n;
	}
	public void setBin_n(String bin_n) {
		this.bin_n = bin_n;
	}
	public String getVariableNameP() {
		return variableNameP;
	}
	public void setVariableNameP(String variableNameP) {
		this.variableNameP = variableNameP;
	}
	public String getPressureRangeP() {
		return pressureRangeP;
	}
	public void setPressureRangeP(String pressureRangeP) {
		this.pressureRangeP = pressureRangeP;
	}
	public String getDataSourceE() {
		return dataSourceE;
	}
	public void setDataSourceE(String dataSourceE) {
		this.dataSourceE = dataSourceE;
	}
	public String getPressureRangeE() {
		return pressureRangeE;
	}
	public void setPressureRangeE(String pressureRangeE) {
		this.pressureRangeE = pressureRangeE;
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
	public String getX() {
		return X;
	}
	public void setX(String x) {
		X = x;
	}
	public String getY() {
		return Y;
	}
	public void setY(String y) {
		Y = y;
	}
	public String getZ() {
		return Z;
	}
	public void setZ(String z) {
		Z = z;
	}
	public String getCustomized() {
		return customized;
	}
	public void setCustomized(String customized) {
		this.customized = customized;
	}
	public String getDataSourceP() {
		return dataSourceP;
	}
	public void setDataSourceP(String dataSource) {
		this.dataSourceP = dataSource;
	}
	public String getVariableNameE() {
		return variableNameE;
	}
	public void setVariableNameE(String variableName) {
		this.variableNameE = variableName;
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
	public String getSelectMonths() {
		return selectMonths;
	}
	public void setSelectMonths(String selectMonths) {
		this.selectMonths = selectMonths;
	}
	public void changeSelectMonths(){

		if(month.contains("1")&&month.contains("2")&&month.contains("3")&&month.contains("4")&&month.contains("5")&&month.contains("6")&&month.contains("7")&&month.contains("8")&&month.contains("9")&&month.contains("10")&&month.contains("11")&&month.contains("12")){
			this.selectMonths = "select all";
		}
		else if(month.contains("6") && month.contains("7") && month.contains("8")){
			this.selectMonths = "Summer:Jun-Jul-Aug";
		}
		else if(month.contains("9") && month.contains("10") && month.contains("11")){
			this.selectMonths = "Autumn:Sep-Oct-Nov";
		}
		else if(month.contains("12") && month.contains("1") && month.contains("2")){
			this.selectMonths = "Winter:Dec-Jan-Feb";
		}
		else if(month.contains("3") && month.contains("4") && month.contains("5")){
			this.selectMonths = "Spring:Mar-Apr-May";
		}
		else{
			this.selectMonths = "select none";
		}
		
	}
	public String getMonth() {
		return month.toString().replace("[", "").replace("]", "");
	}
	public void setMonth(ArrayList<String> month) {
		this.month = month;
	}
	public void addMonth(String oneMonth){
		month.add(oneMonth);
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
}
