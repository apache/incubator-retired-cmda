import static org.junit.Assert.*;

import java.util.Date;

import models.Dataset;
import models.DatasetLog;
import models.ServiceExecutionLog;
import models.User;

import org.junit.Before;
import org.junit.Test;


public class DatasetLogTest {
	private static long TEST_ID = 0;
	private static ServiceExecutionLog serviceExecutionLog;
	private static Dataset TEST_DATASET;
	private static String TEST_PLOT_URL = "test_plotUrl";
	private static String TEST_DATA_URL = "test_dataUrl";
	private static Dataset TEST_ORIGINAL_DATASET;
	private static Dataset TEST_OUTPUT_DATASET;
	private static User TEST_USER;
	private static Date TEST_SERVICE_EXECUTION_START_TIME;
	private static Date TEST_SERVICE_EXECUTION_END_TIME;
	private static Date TEST_DATASET_STUDY_START_TIME;
	private static Date TEST_DATASET_STUDY_END_TIME;
	
	private static DatasetLog datasetLog;
	private static DatasetLog datasetLog1;
	
	@Before
	public void setUp() throws Exception{
		serviceExecutionLog = new ServiceExecutionLog();
		TEST_DATASET = new Dataset();
		TEST_ORIGINAL_DATASET = new Dataset();
		TEST_OUTPUT_DATASET = new Dataset();
		datasetLog = new DatasetLog();
		TEST_USER = new User();
		TEST_SERVICE_EXECUTION_START_TIME = new Date();
		TEST_SERVICE_EXECUTION_END_TIME = new Date();
		TEST_DATASET_STUDY_START_TIME = new Date();
		TEST_DATASET_STUDY_END_TIME = new Date();
		datasetLog1 = new DatasetLog(serviceExecutionLog, TEST_DATASET, TEST_USER, TEST_PLOT_URL, TEST_DATA_URL,
				TEST_ORIGINAL_DATASET, TEST_OUTPUT_DATASET, TEST_SERVICE_EXECUTION_START_TIME, TEST_SERVICE_EXECUTION_END_TIME,
				TEST_DATASET_STUDY_START_TIME, TEST_DATASET_STUDY_END_TIME);
	}
	
	@Test
	public void testServiceExecutionLog(){
		datasetLog.setServiceExecutionLog(serviceExecutionLog);
		assertEquals(serviceExecutionLog, datasetLog.getServiceExecutionLog());
	}

	@Test
	public void testDataset(){
		datasetLog.setDataSet(TEST_DATASET);
		assertEquals(TEST_DATASET, datasetLog.getDataset());
	}
	
	@Test
	public void testUser(){
		datasetLog.setUser(TEST_USER);
		assertEquals(TEST_USER, datasetLog.getUser());
	}
	
	@Test
	public void testPlotUrl(){
		datasetLog.setPlotUrl(TEST_PLOT_URL);
		assertEquals(TEST_PLOT_URL, datasetLog.getPlotUrl());
	}
	
	@Test
	public void testDataUrl(){
		datasetLog.setDataUrl(TEST_DATA_URL);
		assertEquals(TEST_DATA_URL, datasetLog.getDataUrl());
	}
	
	@Test
	public void testOriginalDataset(){
		datasetLog.setOriginalDataset(TEST_ORIGINAL_DATASET);
		assertEquals(TEST_ORIGINAL_DATASET, datasetLog.getOriginalDataset());
	}
	
	@Test
	public void testOutputDataset(){
		datasetLog.setOutputDataset(TEST_OUTPUT_DATASET);
		assertEquals(TEST_OUTPUT_DATASET, datasetLog.getOutputDataset());
	}
	
	@Test
	public void testDatasetStudyStartTime(){
		datasetLog.setDatasetStudyStartTime(TEST_DATASET_STUDY_START_TIME);
		assertEquals(TEST_DATASET_STUDY_START_TIME, datasetLog.getDatasetStudyStartTime());
	}
	
	@Test
	public void testDatasetStudyEndTime(){
		datasetLog.setDatasetStudyEndTime(TEST_DATASET_STUDY_END_TIME);
		assertEquals(TEST_DATASET_STUDY_END_TIME, datasetLog.getDatasetStudyEndTime());
	}
	
}
