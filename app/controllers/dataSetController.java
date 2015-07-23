package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import models.SearchDataset;
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
		try {
			dataSetName = dc.field("Data Set Name").value();
			//Logger.info("data "+dataSource);
			agency = dc.field("Agency").value();
			instrument = dc.field("Instrument").value();
			physicalVariable = dc.field("Physical Variable").value();
			gridDimension = dc.field("Grid Dimension").value();

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}

		List<DataSet> response = DataSet.queryDataSet(dataSetName, agency, instrument, physicalVariable, gridDimension);
		return ok(dataSetList.render(response, dataSetForm));
	}
}
