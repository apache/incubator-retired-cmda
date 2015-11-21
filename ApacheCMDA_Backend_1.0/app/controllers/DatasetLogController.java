package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.Dataset;
import models.DatasetAndUser;
import models.DatasetLog;
import models.DatasetLogRepository;
import models.DatasetRepository;
import models.ServiceExecutionLog;
import models.ServiceExecutionLogRepository;
import models.User;
import models.UserRepository;
import play.mvc.*;
import util.HashMapUtil;

@Named
@Singleton
public class DatasetLogController extends Controller {
	
	private final DatasetLogRepository datasetLogRepository;
	private final DatasetRepository datasetRepository;
	private final ServiceExecutionLogRepository serviceExecutionLogRepository;
	private final UserRepository userRepository;
	
	@Inject
	public DatasetLogController(DatasetRepository datasetRepository, 
			DatasetLogRepository datasetLogRepository,
			ServiceExecutionLogRepository serviceExecutionLogRepository,
			UserRepository userRepository) {
		this.datasetLogRepository = datasetLogRepository;
		this.datasetRepository = datasetRepository;
		this.serviceExecutionLogRepository = serviceExecutionLogRepository;
		this.userRepository = userRepository;
	}
	
	public Result addDatasetLog() {
		JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("DatasetLog not saved, expecting Json data");
			return badRequest("DatasetLog not saved, expecting Json data");
    	}
    	
    	String plotUrl = json.findPath("plotUrl").asText();
    	String dataUrl = json.findPath("dataUrl").asText();
    	long originalDatasetId = json.findPath("originalDatasetId").asLong();
    	long outputDatasetId = json.findPath("outputDatasetId").asLong();
    	long serviceExecutionLogId = json.findPath("serviceExecutionLogId").asLong();
    	long datasetId = json.findPath("datasetId").asLong();
    	long userId = json.findPath("userId").asLong();
    	String datasetStudyStartTimeNumber = json.findPath("datasetStudyStartTime")
				.asText();
		String datasetStudyEndTimeNumber = json.findPath("datasetStudyEndTime")
				.asText();
		Date datasetStudyStartTime = new Date();
		Date datasetStudyEndTime = new Date();
		
		// If we change the date format later, we can modify here.
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				util.Common.DATASET_DATE_PATTERN);

		try {
			datasetStudyStartTime = simpleDateFormat
					.parse(datasetStudyStartTimeNumber);
			datasetStudyEndTime = simpleDateFormat
					.parse(datasetStudyEndTimeNumber);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Wrong Date Format :" + datasetStudyStartTime
					+ " " + datasetStudyEndTime);
			return badRequest("Wrong Date Format :" + datasetStudyStartTime
					+ " " + datasetStudyEndTime);
		}
    	
    	try {
			Dataset originalDataset = datasetRepository.findOne(originalDatasetId);
			Dataset outputDataset = datasetRepository.findOne(outputDatasetId);
			Dataset dataset = datasetRepository.findOne(datasetId);
			ServiceExecutionLog serviceExecutionLog = serviceExecutionLogRepository.findOne(serviceExecutionLogId);
			Date serviceExecutionStartTime = serviceExecutionLog.getExecutionStartTime();		
			Date serviceExecutionEndTime = serviceExecutionLog.getExecutionEndTime();
			User user = userRepository.findOne(userId);
			DatasetLog datasetLog = new DatasetLog(serviceExecutionLog,
					dataset, user, plotUrl, dataUrl, originalDataset,
					outputDataset, serviceExecutionStartTime, serviceExecutionEndTime,
					datasetStudyStartTime, datasetStudyEndTime);
			DatasetLog saveddatasetLog = datasetLogRepository.save(datasetLog);
			System.out.println("DatasetLog saved: "+ saveddatasetLog.getId());
			return created(new Gson().toJson(datasetLog.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("DatasetLog not created");
			return badRequest("DatasetLog Configuration not created");
		}
    	
	}
	
    public Result updateDatasetLogById(long id) {
	    JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("DatasetLog not saved, expecting Json data");
			return badRequest("DatasetLog Configuration not saved, expecting Json data");
		}
		
    	String plotUrl = json.findPath("plotUrl").asText();
    	String dataUrl = json.findPath("dataUrl").asText();
    	long originalDatasetId = json.findPath("originalDatasetId").asLong();
    	long outputDatasetId = json.findPath("outputDatasetId").asLong();
    	long serviceExecutionLogId = json.findPath("serviceExecutionLogId").asLong();
    	long datasetId = json.findPath("datasetId").asLong();
    	long userId = json.findPath("userId").asLong();
    	String datasetStudyStartTimeNumber = json.findPath("datasetStudyStartTime")
				.asText();
		String datasetStudyEndTimeNumber = json.findPath("datasetStudyEndTime")
				.asText();
		Date datasetStudyStartTime = new Date();
		Date datasetStudyEndTime = new Date();
		
		// If we change the date format later, we can modify here.
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				util.Common.DATASET_DATE_PATTERN);

		try {
			datasetStudyStartTime = simpleDateFormat
					.parse(datasetStudyStartTimeNumber);
			datasetStudyEndTime = simpleDateFormat
					.parse(datasetStudyEndTimeNumber);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Wrong Date Format :" + datasetStudyStartTime
					+ " " + datasetStudyEndTime);
			return badRequest("Wrong Date Format :" + datasetStudyStartTime
					+ " " + datasetStudyEndTime);
		}

		try {
			Dataset originalDataset = datasetRepository.findOne(originalDatasetId);
			Dataset outputDataset = datasetRepository.findOne(outputDatasetId);
			Dataset dataset = datasetRepository.findOne(datasetId);
			ServiceExecutionLog serviceExecutionLog = serviceExecutionLogRepository.findOne(serviceExecutionLogId);
			DatasetLog datasetLog = datasetLogRepository.findOne(id);
			User user = userRepository.findOne(userId);
			datasetLog.setUser(user);
			datasetLog.setDataSet(dataset);
			datasetLog.setDataUrl(dataUrl);
			datasetLog.setOriginalDataset(originalDataset);
			datasetLog.setOutputDataset(outputDataset);
			datasetLog.setPlotUrl(plotUrl);
			datasetLog.setServiceExecutionLog(serviceExecutionLog);
			datasetLog.setDatasetStudyStartTime(datasetStudyStartTime);
			datasetLog.setDatasetStudyEndTime(datasetStudyEndTime);
			DatasetLog savedDatasetLog = datasetLogRepository.save(datasetLog);
			
			System.out.println("DatasetLog updated: "+ savedDatasetLog.getId());
			return created("DatasetLog updated: "+ savedDatasetLog.getId());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("DatasetLog not saved: "+id);
			return badRequest("DatasetLog not saved: "+id);
		}			
    }

	
    public Result deleteDatasetLog(long id) {
    	DatasetLog datasetLog = datasetLogRepository.findOne(id);
    	if (datasetLog == null) {
    		System.out.println("DatasetLog not found with id: " + id);
			return notFound("DatasetLog not found with id: " + id);
    	}
    	
    	datasetLogRepository.delete(datasetLog);
    	System.out.println("DatasetLog is deleted: " + id);
		return ok("DatasetLog is deleted: " + id);
    }
    
    public Result getDatasetLog(long id, String format) {
    	DatasetLog datasetLog = datasetLogRepository.findOne(id);
    	if (datasetLog == null) {
    		System.out.println("DatasetLog not found with name: " + id);
			return notFound("DatasetLog not found with name: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(datasetLog);
    	}
    	
    	return ok(result);
    }

    public Result getAllDatasetLogs(String format) {
    	try {
    		Iterable<DatasetLog>datasetLogs =  datasetLogRepository.findAll();
    		String result = new String();
    		result = new Gson().toJson(datasetLogs);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("DatasetLog not found");
    	}
    }
    
    public Result queryDatasets() {
    	JsonNode json = request().body().asJson();
		Set<Dataset> datasets = new HashSet<Dataset>();
		Map<String, Object> map = new HashMap<>();
		
		if (json == null) {
			System.out.println("Dataset cannot be queried, expecting Json data");
			String result = new Gson().toJson(map);
			return ok(result);
		}

		try {
			// Parse JSON file
			Long userId = json.findPath("id").asLong();

			Date start = new Date(0);
			Date end = new Date();
			long executionStartTimeNumber = json.findPath("executionStartTime")
					.asLong();
			long executionEndTimeNumber = json.findPath("executionEndTime")
					.asLong();
			
			if (executionStartTimeNumber > 0) {
				start = new Date(executionStartTimeNumber);
			}
			if (executionEndTimeNumber > 0) {
				end = new Date(executionEndTimeNumber);
			}
			
			List<DatasetLog> datasetLogs = datasetLogRepository.
					findByServiceExecutionStartTimeGreaterThanEqualAndServiceExecutionEndTimeLessThanEqualAndUser_Id(start, end, userId);
//			for (DatasetLog datasetLog : datasetLogs) {
//				datasets.add(datasetLog.getDataset());
//			}
			map = jsonFormatUserAndDataset(datasetLogs);
		} catch (Exception e) {
			System.out.println("Dataset cannot be queried, query is corrupt");
			String result = new Gson().toJson(map);
			return ok(result);
		}
		
		String result = new Gson().toJson(map);
		return ok(result);
    }
    
    private Map<String, Object> jsonFormatUserAndDataset(
			Iterable<DatasetLog> userDatasets) {

		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
		for (DatasetLog userDataset : userDatasets) {
			int source = 0;
			int target = 0;
			// Check whether the current user has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("user")
						&& (long) nodes.get(j).get("userId") == userDataset
								.getUser().getId()) {
					source = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (source == 0) {
				String realName = userDataset.getUser().getFirstName() + " "
						+ userDataset.getUser().getLastName();
				nodes.add(HashMapUtil.map7("id", i, "title", realName, "label", userDataset
						.getUser().getUserName(), "cluster", "1", "value", 1,
						"group", "user", "userId", userDataset.getUser()
								.getId()));

				source = i;
				i++;
			}
			// Check whether the current dataset has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("dataset")
						&& (long) nodes.get(j).get("datasetId") == userDataset
								.getDataset().getId()) {
					target = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (target == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", userDataset.getDataset()
						.getName(), "label",
						userDataset.getDataset().getName(), "cluster", "2",
						"value", 2, "group", "dataset", "datasetId",
						userDataset.getDataset().getId()));
				target = i;
				i++;
			}
			rels.add(HashMapUtil.map5("from", source, "to", target, "title", "USE",
					"id", edgeId, "weight", 0));
			edgeId++;
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}
    
    public Result queryVariables() {
    	JsonNode json = request().body().asJson();
		Set<Dataset> datasets = new HashSet<Dataset>();
		Set<String> variables = new HashSet<String>();
		Map<String, Object> map = new HashMap<>();
		
		if (json == null) {
			System.out.println("Dataset cannot be queried, expecting Json data");
			String result = new Gson().toJson(map);
			return ok(result);
		}

		try {
			// Parse JSON file
			Long userId = json.findPath("userId").asLong();

			Date start = new Date(0);
			Date end = new Date();
			long executionStartTimeNumber = json.findPath("executionStartTime")
					.asLong();
			long executionEndTimeNumber = json.findPath("executionEndTime")
					.asLong();

			if (executionStartTimeNumber > 0) {
				start = new Date(executionStartTimeNumber);
			}
			if (executionEndTimeNumber > 0) {
				end = new Date(executionEndTimeNumber);
			}
			
			List<DatasetLog> datasetLogs = datasetLogRepository.
					findByServiceExecutionStartTimeGreaterThanEqualAndServiceExecutionEndTimeLessThanEqualAndUser_Id(start, end, userId);
			
//			for (DatasetLog datasetLog : datasetLogs) {
//				datasets.add(datasetLog.getDataset());
//			}
//			
//			for (Dataset dataset : datasets) {
//				variables.add(dataset.getPhysicalVariable());
//			}
			map = jsonFormatUserAndVariable(datasetLogs);
			
		} catch (Exception e) {
			System.out.println("Dataset cannot be queried, query is corrupt");
			String result = new Gson().toJson(map);
			return ok(result);
		}
		
		String result = new Gson().toJson(new ArrayList<String>(variables));
		return ok(result);
    }
    
    private Map<String, Object> jsonFormatUserAndVariable (
			Iterable<DatasetLog> userDatasets) {

		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
		for (DatasetLog userDataset : userDatasets) {
			int source = 0;
			int target = 0;
			// Check whether the current user has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("user")
						&& (long) nodes.get(j).get("userId") == userDataset
								.getUser().getId()) {
					source = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (source == 0) {
				String realName = userDataset.getUser().getFirstName() + " "
						+ userDataset.getUser().getLastName();
				nodes.add(HashMapUtil.map7("id", i, "title", realName, "label", userDataset
						.getUser().getUserName(), "cluster", "1", "value", 1,
						"group", "user", "userId", userDataset.getUser()
								.getId()));

				source = i;
				i++;
			}
			// Check whether the current dataset has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("dataset")
						&& (long) nodes.get(j).get("datasetId") == userDataset
								.getDataset().getId()) {
					target = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (target == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", userDataset.getDataset()
						.getName(), "label",
						userDataset.getDataset().getPhysicalVariable(), "cluster", "2",
						"value", 2, "group", "dataset", "datasetId",
						userDataset.getDataset().getId()));
				target = i;
				i++;
			}
			rels.add(HashMapUtil.map5("from", source, "to", target, "title", "USE",
					"id", edgeId, "weight", 0));
			edgeId++;
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}
}