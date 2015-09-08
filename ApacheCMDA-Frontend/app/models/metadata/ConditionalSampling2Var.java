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

public class ConditionalSampling2Var {
	// Physical Variable
	private String dataSourceP = "";
	private String variableNameP = "";
	private String pressureRange1 = "";
	private String pressureRange2 = "";
	
	// Environmental Variable 1
	private String dataSourceE1 = "";
	private String variableNameE1 = "";
	private String bin_min1;
	private String bin_max1;
	private String bin_n1;
	private String customized1;
	private String enableVarPlev1 = "";
	
	// Environmental Variable 2
	private String dataSourceE2 = "";
	private String variableNameE2 = "";
	private String bin_min2;
	private String bin_max2;
	private String bin_n2;
	private String customized2;
	private String enableVarPlev2 = "";
	
	
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
	private String executionPurpose = "";
	private String image = "";
	private String dataURL = "";
	private String serviceResponseText = "";
	
	public String getDataSourceP() {
		return dataSourceP;
	}
	public void setDataSourceP(String dataSourceP) {
		this.dataSourceP = dataSourceP;
	}
	public String getVariableNameP() {
		return variableNameP;
	}
	public void setVariableNameP(String variableNameP) {
		this.variableNameP = variableNameP;
	}
	public String getPressureRange1() {
		return pressureRange1;
	}
	public void setPressureRange1(String pressureRange1) {
		this.pressureRange1 = pressureRange1;
	}
	public String getDataSourceE1() {
		return dataSourceE1;
	}
	public void setDataSourceE1(String dataSourceE1) {
		this.dataSourceE1 = dataSourceE1;
	}
	public String getVariableNameE1() {
		return variableNameE1;
	}
	public void setVariableNameE1(String variableNameE1) {
		this.variableNameE1 = variableNameE1;
	}
	public String getPressureRange2() {
		return pressureRange2;
	}
	public void setPressureRange2(String pressureRange2) {
		this.pressureRange2 = pressureRange2;
	}
	public String getBin_min1() {
		return bin_min1;
	}
	public void setBin_min1(String bin_min1) {
		this.bin_min1 = bin_min1;
	}
	public String getBin_max1() {
		return bin_max1;
	}
	public void setBin_max1(String bin_max1) {
		this.bin_max1 = bin_max1;
	}
	public String getBin_n1() {
		return bin_n1;
	}
	public void setBin_n1(String bin_n1) {
		this.bin_n1 = bin_n1;
	}
	public String getCustomized1() {
		return customized1;
	}
	public void setCustomized1(String customized1) {
		this.customized1 = customized1;
	}
	public String getDataSourceE2() {
		return dataSourceE2;
	}
	public void setDataSourceE2(String dataSourceE2) {
		this.dataSourceE2 = dataSourceE2;
	}
	public String getVariableNameE2() {
		return variableNameE2;
	}
	public void setVariableNameE2(String variableNameE2) {
		this.variableNameE2 = variableNameE2;
	}
	public String getBin_min2() {
		return bin_min2;
	}
	public void setBin_min2(String bin_min2) {
		this.bin_min2 = bin_min2;
	}
	public String getBin_max2() {
		return bin_max2;
	}
	public void setBin_max2(String bin_max2) {
		this.bin_max2 = bin_max2;
	}
	public String getBin_n2() {
		return bin_n2;
	}
	public void setBin_n2(String bin_n2) {
		this.bin_n2 = bin_n2;
	}
	public String getCustomized2() {
		return customized2;
	}
	public void setCustomized2(String customized2) {
		this.customized2 = customized2;
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
	public String getEnableVarPlev1() {
		return enableVarPlev1;
	}
	public void setEnableVarPlev1(String enableVarPlev1) {
		this.enableVarPlev1 = enableVarPlev1;
	}
	public String getEnableVarPlev2() {
		return enableVarPlev2;
	}
	public void setEnableVarPlev2(String enableVarPlev2) {
		this.enableVarPlev2 = enableVarPlev2;
	}
}
