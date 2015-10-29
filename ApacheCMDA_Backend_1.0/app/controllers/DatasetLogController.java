package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.Dataset;
import models.DatasetLog;
import models.DatasetLogRepository;
import models.DatasetRepository;
import models.ServiceExecutionLog;
import models.ServiceExecutionLogRepository;
import models.User;
import models.UserRepository;
import play.mvc.*;

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
			User user = userRepository.findOne(userId);
			DatasetLog datasetLog = new DatasetLog(serviceExecutionLog,
					dataset, user, plotUrl, dataUrl, originalDataset,
					outputDataset, datasetStudyStartTime, datasetStudyEndTime);
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
	
}