package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import util.Constants;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;

import com.fasterxml.jackson.databind.JsonNode;

public class AnalyticsController extends Controller{
	
	public static Result getKnowledgeGraph() {
		JsonNode response = APICall.callAPI("http://einstein.sv.cmu.edu:9035/analytics/getAllDatasetAndUserWithCount/json");
		String resStr = response.toString();
		return ok(knowledgeGraph.render(resStr));
	}
}
