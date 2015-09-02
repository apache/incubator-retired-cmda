package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import models.DataSet;
import models.metadata.ClimateService;
import models.metadata.ServiceLog;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import util.APICall;
import util.Constants;
import util.APICall.ResponseType;
import views.html.climate.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class dataSetController extends Controller{
	final static Form<DataSet> dataSetForm = Form
			.form(DataSet.class);
	
	public static Result datasetList() {
		return ok(dataSetList.render(DataSet.all(),
				dataSetForm));
	}
	
	public static Result searchDataset(){
		return ok(searchDataSet.render(dataSetForm));
	}
	
	public static Result getSearchResult(){
		Form<DataSet> dc = dataSetForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		String dataSetName = "";
		String agency = "";
		String instrument = "";
		String physicalVariable = "";
		String gridDimension = "";
		String startTime = "";
		String endTime = "";
		Date dataSetStartTime = new Date(0), dataSetEndTime = new Date();
		
		try {
			dataSetName = dc.field("Dataset Name").value();
			//Logger.info("data "+dataSource);
			agency = dc.field("Agency").value();
			instrument = dc.field("Instrument").value();
			physicalVariable = dc.field("Physical Variable").value();
			gridDimension = dc.field("Grid Dimension").value();
			startTime = dc.field("Dataset Start Time").value();
			endTime = dc.field("Dataset End Time").value();
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
			if (!startTime.isEmpty()) {
				try {
					dataSetStartTime = simpleDateFormat.parse(startTime);
					Date min = new Date(0);
					Date max = new Date();
					if (dataSetStartTime.before(min)) {
						dataSetStartTime = min;
					} else if (dataSetStartTime.after(max)) {
						dataSetStartTime = max;
					}
				} catch (ParseException e) {
					System.out.println("Wrong Date Format :" + startTime);
					return badRequest("Wrong Date Format :" + startTime);
				}
			}
			if (!endTime.isEmpty()) {
				try {
					dataSetEndTime = simpleDateFormat.parse(endTime);
					Date min = new Date(0);
					Date max = new Date();
					if (dataSetEndTime.before(min)) {
						dataSetEndTime = min;
					}
					else if (dataSetEndTime.after(max)) {
						dataSetEndTime = max;
					}
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

		List<DataSet> response = DataSet.queryDataSet(dataSetName, agency, instrument, physicalVariable, gridDimension, dataSetStartTime, dataSetEndTime);
		return ok(dataSetList.render(response, dataSetForm));
	}
}
