package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DatasetLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceExecutionLogId", referencedColumnName = "id")
	private ServiceExecutionLog serviceExecutionLog;
	@ManyToOne(optional = false)
	@JoinColumn(name = "dataSetId", referencedColumnName = "id")
	private Dataset dataset;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	private String plotUrl;
	private String dataUrl;
	@ManyToOne(optional = false)
	@JoinColumn(name = "originalDatasetId", referencedColumnName = "id")
	private Dataset originalDataset;
	@ManyToOne(optional = false)
	@JoinColumn(name = "outputDatasetId", referencedColumnName = "id")
	private Dataset outputDataset;
	
	private Date datasetStudyStartTime;
	private Date datasetStudyEndTime;
	
	public DatasetLog() {
		
	}
	
	public DatasetLog(ServiceExecutionLog serviceExecutionLog, Dataset dataset,
			User user, String plotUrl, String dataUrl, Dataset originalDataset,
			Dataset outputDataset, Date datasetStudyStartTime, Date datasetStudyEndTime) {
		super();
		this.serviceExecutionLog = serviceExecutionLog;
		this.dataset = dataset;
		this.user = user;
		this.plotUrl = plotUrl;
		this.dataUrl = dataUrl;
		this.originalDataset = originalDataset;
		this.outputDataset = outputDataset;
		this.datasetStudyStartTime = datasetStudyStartTime;
		this.datasetStudyEndTime = datasetStudyEndTime;
	}

	public ServiceExecutionLog getServiceExecutionLog() {
		return serviceExecutionLog;
	}

	public void setServiceExecutionLog(ServiceExecutionLog serviceExecutionLog) {
		this.serviceExecutionLog = serviceExecutionLog;
	}

	public Dataset getDataset() {
		return dataset;
	}
	
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

	public void setDataSet(Dataset dataset) {
		this.dataset = dataset;
	}

	public String getPlotUrl() {
		return plotUrl;
	}

	public void setPlotUrl(String plotUrl) {
		this.plotUrl = plotUrl;
	}

	public String getDataUrl() {
		return dataUrl;
	}

	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

	public Dataset getOriginalDataset() {
		return originalDataset;
	}

	public void setOriginalDataset(Dataset originalDataset) {
		this.originalDataset = originalDataset;
	}

	public Dataset getOutputDataset() {
		return outputDataset;
	}

	public void setOutputDataset(Dataset outputDataset) {
		this.outputDataset = outputDataset;
	}

	public long getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Date getDatasetStudyStartTime() {
		return datasetStudyStartTime;
	}
	
	public Date getDatasetStudyEndTime() {
		return datasetStudyEndTime;
	}
	
	public void setDatasetStudyStartTime(Date datasetStudyStartTime) {
		this.datasetStudyStartTime = datasetStudyStartTime;
	}

	public void setDatasetStudyEndTime(Date datasetStudyEndTime) {
		this.datasetStudyEndTime  = datasetStudyEndTime;
	}

	@Override
	public String toString() {
		return "DatasetLog [id=" + id + ", serviceExecutionLog="
				+ serviceExecutionLog + ", dataSet=" + dataset + ", user="
				+ user + ", plotUrl=" + plotUrl + ", dataUrl=" + dataUrl
				+ ", originalDataSet=" + originalDataset + ", outputDataSet="
				+ outputDataset + ", datasetStudyStartTime="
				+ datasetStudyStartTime + ", datasetStudyEndTime="
				+ datasetStudyEndTime + "]";
	}
	
	
}
