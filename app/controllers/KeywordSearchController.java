

package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import models.SearchDataset;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Console;
import util.Constants;
import views.html.climate.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class KeywordSearchController extends Controller {
    public static final String ROOT_STRING = "Parameter";
	public static List<SearchDataset> resultsList = null;
    private static List<SearchDataset> dataSetList = null;
	private static Map<String, SearchDataset> dataSetLookupMap = null;
	public static final Type LIST_TYPE = new TypeToken<ArrayList<SearchDataset>>() {
	}.getType();

	public static Result searchPage() {
//        resultsList = null;
        return ok(views.html.climate.datasetSearch.render("", resultsList, null));
    }

    public static Result keywordSearch() {
        // clear the results list
        resultsList = null;

        String input = request().body().asText();
        if (input.startsWith("keyword="))
            input = input.substring("keyword=".length());

//        try {
//            resultsList = DBQueryClient.getDataIDSingleKeyword(input);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try {
			String jsonStr = HttpHelper.httpGet(Constants.NEW_API_URL + Constants.GET_KEYWORD_SEARCH + input);
			resultsList = new Gson().fromJson(jsonStr, LIST_TYPE);

        } catch (Exception e) {
			if (!e.getMessage().equals("Not Found"))
	            e.printStackTrace();
        }

        return ok(views.html.climate.datasetSearch.render("", resultsList, null));
    }

    public static Result selectedKeywordSearch() {
        // clear the results list
        resultsList = null;
        StringBuilder keywordsList = new StringBuilder();

        JsonNode root = request().body().asJson();
        Iterator<JsonNode> iterator = root.iterator();
        while (iterator.hasNext())
        {
            JsonNode current = iterator.next();
            if (current.findPath("children").size()==0)
            {
                keywordsList.append(current.findPath("text").textValue());
                keywordsList.append("\t");
            }
        }

        if (keywordsList.length() > 0) {
//            try {
//    			resultsList = DBQueryClient.getDataIDMultipleKeyword(keywordsList);
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }

            try {
                String jsonStr = HttpHelper.httpPostText(Constants.NEW_API_URL + Constants.POST_KEYWORD_LIST_SEARCH, keywordsList.toString());
				resultsList = new Gson().fromJson(jsonStr, LIST_TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        return redirect(routes.KeywordSearchController.displayResult(null));
        return ok(views.html.climate.datasetSearch.render("", resultsList, null));
    }

    public static Result displayResult(String data_id) {
        if (data_id == null)
            return ok(views.html.climate.datasetSearch.render("", resultsList, null));
		String url = getURLFromID(data_id);
        return ok(views.html.climate.datasetSearch.render("", resultsList, url));
    }

    public static Result getKeywordTree(String id) {
        JsonNode root = new ObjectNode(JsonNodeFactory.instance);
        try {
            root = Json.parse(new FileInputStream("./public/keywords1.json"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ok(root);
    }

    public static Result getDataSetList(String data_id) {
		if (data_id == null)
			dataSetList = null;		//refresh from DB

		getDataSetList();

		String url = null;
		if (data_id != null)
			url = getURLFromID(data_id);
		return ok(views.html.climate.dataSets.render(dataSetList, url));
	}

	public static List<SearchDataset> getDataSetList() {
		if (dataSetList == null) {
			try {
				Console.print("aaa"+Constants.NEW_API_URL + Constants.GET_DATASETLIST);
				String jsonStr = HttpHelper.httpGet(Constants.NEW_API_URL + Constants.GET_DATASETLIST);
				
				dataSetList = new Gson().fromJson(jsonStr, LIST_TYPE);

				//For easy lookups
				dataSetLookupMap = new HashMap<String, SearchDataset>();
				for (SearchDataset ds : dataSetList)
				{
					dataSetLookupMap.put(ds.getData_id(), ds);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dataSetList;
	}

	public static SearchDataset getCachedDatasetFromID(String id)
	{
		if (getDataSetList() != null)
			return dataSetLookupMap.get(id);

		return null;
	}

	public static String getURLFromID(String id)
	{
		getDataSetList();
		return dataSetLookupMap.get(id).getUrl();
	}
}

