package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import scala.Console;
import models.metadata.ClimateService;
import models.metadata.ServiceLog;
import util.APICall;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DataSet {

	private String id;
	private String dataSetName;
	private String agencyId;
	private String instrument;
	private String physicalVariable;
	private String CMIP5VarName;
	private String units;
	private String gridDimension;
	private String source;
	private String status;
	private String ResponsiblePerson;
	private String comments;
	private String dataSourceName;
	private String variableName;
	private String dataSourceInput;
	private String variableNameInput;
	private String startTime;
	private String endTime;
	
	public String getStartTime() {
		return startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String dataSetEndTime) {
		this.endTime = dataSetEndTime;
	}
	
	public void setStartTime(String dataSetStartTime) {
		this.startTime = dataSetStartTime;
	}
	
	public String getDataSetName() {
		return dataSetName;
	}
	public void setDataSetName(String dataSetName) {
		this.dataSetName = dataSetName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getPhysicalVariable() {
		return physicalVariable;
	}
	public void setPhysicalVariable(String physicalVariable) {
		this.physicalVariable = physicalVariable;
	}
	public String getCMIP5VarName() {
		return CMIP5VarName;
	}
	public void setCMIP5VarName(String cMIP5VarName) {
		CMIP5VarName = cMIP5VarName;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getGridDimension() {
		return gridDimension;
	}
	public void setGridDimension(String gridDimension) {
		this.gridDimension = gridDimension;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponsiblePerson() {
		return ResponsiblePerson;
	}
	public void setResponsiblePerson(String responsiblePerson) {
		ResponsiblePerson = responsiblePerson;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDataSourceName() {
		return dataSourceName;
	}
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	public String getDataSourceInput() {
		return dataSourceInput;
	}
	public void setDataSourceInput(String dataSourceInput) {
		this.dataSourceInput = dataSourceInput;
	}
	public String getVariableNameInput() {
		return variableNameInput;
	}
	public void setVariableNameInput(String variableNameInput) {
		this.variableNameInput = variableNameInput;
	}
	
	public static List<DataSet> all() {

		List<DataSet> dataSets = new ArrayList<DataSet>();

		JsonNode dataSetNode = APICall
				.callAPI("http://localhost:9034/dataset/getAllDatasets/json");

		// if no value is returned or error or is not json array
		if (dataSetNode == null || dataSetNode.has("error")
				|| !dataSetNode.isArray()) {
			return dataSets;
		}

		// parse the json string into object
		for (int i = 0; i < dataSetNode.size(); i++) {
			JsonNode json = dataSetNode.path(i);
			DataSet dataset = new DataSet();
			dataset.setId(json.get("id").asText());
			dataset.setDataSetName(json.get("name").asText());
			dataset.setAgencyId(json.get("agencyId").asText());
			dataset.setInstrument(json.get("instrument").get("name").asText());
			dataset.setPhysicalVariable(json.get("physicalVariable").asText());
			dataset.setCMIP5VarName(json.get("CMIP5VarName").asText());
			dataset.setUnits(json.get("units").asText());
			dataset.setGridDimension(json.get("gridDimension").asText());
			dataset.setSource(json.get("source").asText());
			dataset.setStatus(json.get("status").asText());
			dataset.setResponsiblePerson(json.get("responsiblePerson").asText());
//			dataset.setComments(json.get(""));
			dataset.setDataSourceName(json.get("dataSourceNameinWebInterface").asText());
//			Console.print("aaa"+dataset.getDataSourceName());
			dataset.setVariableName(json.get("variableNameInWebInterface").asText());
			dataset.setDataSourceInput(json.get("dataSourceInputParameterToCallScienceApplicationCode").asText());
			dataset.setVariableNameInput(json.get("variableNameInputParameterToCallScienceApplicationCode").asText());
			
//!!!!!!fake start/end time value
			dataset.setEndTime(json.get("dataSetEndTime").asText());
			dataset.setStartTime(json.get("dataSetStartTime").asText());
//			dataset.setEndTime("201508");
//			dataset.setStartTime("201507");
			
			dataSets.add(dataset);
		}
		return dataSets;
	}
	
public static List<DataSet> queryDataSet(String dataSetName, String agency, String instrument, String physicalVariable, String gridDimension, String dataSetStartTime, String dataSetEndTime) {
		
		List<DataSet> dataset = new ArrayList<DataSet>();
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode queryJson = mapper.createObjectNode();
		queryJson.put("name", dataSetName);
		queryJson.put("agencyId", agency);
		queryJson.put("instrument", instrument);
		queryJson.put("physicalVariable", physicalVariable);
		queryJson.put("gridDimension", gridDimension);
		queryJson.put("dataSetEndTime", dataSetEndTime);
		queryJson.put("dataSetStartTime", dataSetStartTime);
		
//		if (dataSetName != null && !dataSetName.isEmpty()) {
//			queryJson.put("name", dataSetName);
//		}
//		if (agency != null && !agency.isEmpty()) {
//			queryJson.put("agencyId", agency);
//		}
//		if (instrument != null && !instrument.isEmpty()) {
//			queryJson.put("instrument", instrument);
//		}
//		if (physicalVariable != null && !physicalVariable.isEmpty()) {
//			queryJson.put("physicalVariable", physicalVariable);
//		}
//		if (gridDimension != null && !gridDimension.isEmpty()) {
//			queryJson.put("gridDimension", gridDimension);
//		}
		
		JsonNode dataSetNode = APICall.postAPI("http://localhost:9034/dataset/queryDataset", queryJson);
		if (dataSetNode == null || dataSetNode.has("error")
				|| !dataSetNode.isArray()) {
			return dataset;
		}

		// parse the json string into object
		for (int i = 0; i < dataSetNode.size(); i++) {
			JsonNode json = dataSetNode.path(i);
			DataSet newDataSet = deserializeJsonToDataSet(json);
			dataset.add(newDataSet);
		}
		return dataset;
	}

	private static DataSet deserializeJsonToDataSet(JsonNode json) {
		DataSet newDataSet = new DataSet();
//		newDataSet.setDataSetName(json.get(
//				"name").asText());
//		newDataSet.setAgencyId(json.get(
//				"agencyId").asText());
//		newDataSet.setInstrument(json.get("instrument").get("name").asText());
//		newDataSet.setPhysicalVariable(json.get("physicalVariable").asText());
//		newDataSet.setGridDimension(json.get("gridDimension").asText());
		
		newDataSet.setId(json.get("id").asText());
		newDataSet.setDataSetName(json.get("name").asText());
		newDataSet.setAgencyId(json.get("agencyId").asText());
		newDataSet.setInstrument(json.get("instrument").get("name").asText());
		newDataSet.setPhysicalVariable(json.get("physicalVariable").asText());
		newDataSet.setCMIP5VarName(json.get("CMIP5VarName").asText());
		newDataSet.setUnits(json.get("units").asText());
		newDataSet.setGridDimension(json.get("gridDimension").asText());
		newDataSet.setSource(json.get("source").asText());
		newDataSet.setStatus(json.get("status").asText());
		newDataSet.setResponsiblePerson(json.get("responsiblePerson").asText());
//		dataset.setComments(json.get(""));
		newDataSet.setDataSourceName(json.get("dataSourceNameinWebInterface").asText());
//		Console.print("aaa"+dataset.getDataSourceName());
		newDataSet.setVariableName(json.get("variableNameInWebInterface").asText());
		newDataSet.setDataSourceInput(json.get("dataSourceInputParameterToCallScienceApplicationCode").asText());
		newDataSet.setVariableNameInput(json.get("variableNameInputParameterToCallScienceApplicationCode").asText());
		
		
//!!!!!!fake start/end time value		
//		newDataSet.setEndTime(json.get("dataSetEndTime").asText());
//		newDataSet.setStartTime(json.get("dataSetStartTime").asText());
		
	
		return newDataSet;
	}
}
