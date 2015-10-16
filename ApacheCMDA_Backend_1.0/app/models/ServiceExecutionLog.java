package models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ServiceExecutionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateService;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "serviceConfigurationId", referencedColumnName = "id")
	private ServiceConfiguration serviceConfiguration;
//	@ManyToOne(optional = false)
//	@JoinColumn(name = "datasetLogId", referencedColumnName = "id")
//	private DatasetLog datasetLog;
	private String purpose;
	@Temporal(TemporalType.TIMESTAMP)
	private Date executionStartTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date executionEndTime;
	private String plotUrl;
	private String dataUrl;
	private Date datasetStudyStartTime;
	private Date datasetStudyEndTime;
	

	public ServiceExecutionLog(
			ClimateService climateService, User user,
			ServiceConfiguration serviceConfiguration, // DatasetLog datasetLog,
			String purpose, Date executionStartTime, Date executionEndTime,
			String dataUrl, String plotUrl,
			Date datasetStudyStartTime, Date datasetStudyEndTime) {
	this.climateService = climateService;
		this.user = user;
		this.serviceConfiguration = serviceConfiguration;
		//this.datasetLog = datasetLog;
		this.purpose = purpose;
		this.executionStartTime = executionStartTime;
		this.executionEndTime = executionEndTime;
		this.plotUrl = plotUrl;
		this.dataUrl = dataUrl;
		this.datasetStudyStartTime = datasetStudyStartTime;
		this.datasetStudyEndTime = datasetStudyEndTime;
	}
	
	public ServiceExecutionLog() {

	}
	
	public long getId() {
		return id;
	}

	public ClimateService getClimateService() {
		return climateService;
	}

	public User getUser() {
		return user;
	}

	public ServiceConfiguration getServiceConfiguration() {
		return serviceConfiguration;
	}

//	public DatasetLog getDatasetLog() {
//		return datasetLog;
//	}

	public String getPurpose() {
		return purpose;
	}

	public Date getExecutionStartTime() {
		return executionStartTime;
	}

	public Date getExecutionEndTime() {
		return executionEndTime;
	}

	public String getPlotUrl() {
		return plotUrl;
	}

	public String getDataUrl() {
		return dataUrl;
	}
	
	public Date getDatasetStudyStartTime() {
		return datasetStudyStartTime;
	}
	
	public Date getDatasetStudyEndTime() {
		return datasetStudyEndTime;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setClimateService(ClimateService climateService) {
		this.climateService = climateService;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setServiceConfiguration(ServiceConfiguration serviceConfiguration) {
		this.serviceConfiguration = serviceConfiguration;
	}

//	public void setDatasetLog(DatasetLog datasetLog) {
//		this.datasetLog = datasetLog;
//	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setExecutionStartTime(Date executionStartTime) {
		this.executionStartTime = executionStartTime;
	}

	public void setExecutionEndTime(Date executionEndTime) {
		this.executionEndTime = executionEndTime;
	}

	public void setPlotUrl(String plotUrl) {
		this.plotUrl = plotUrl;
	}

	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}
	
	public void setDatasetStudyStartTime(Date datasetStudyStartTime) {
		this.datasetStudyStartTime = datasetStudyStartTime;
	}

	public void setDatasetStudyEndTime(Date datasetStudyEndTime) {
		this.datasetStudyEndTime  = datasetStudyEndTime;
	}

	@Override
	public String toString() {
		return "ServiceExecutionLog [id=" + id + ", climateService="
				+ climateService + ", user=" + user + ", serviceConfiguration="
				+ serviceConfiguration + ", purpose=" + purpose
				+ ", executionStartTime=" + executionStartTime
				+ ", executionEndTime=" + executionEndTime + ", plotUrl="
				+ plotUrl + ", dataUrl=" + dataUrl 
				+ ", datasetStudyStartTime=" + datasetStudyStartTime
				+ ", datasetStudyEndTime=" + datasetStudyEndTime
				+ "]";
	}

	
//	@Override
//	public String toString() {
//		return "ServiceExecutionLog [id=" + id + ", climateService="
//				+ climateService + ", user=" + user
//				+ ", serviceConfiguration=" + serviceConfiguration
//				+ ", datasetLog=" + datasetLog + ", purpose=" + purpose
//				+ ", executionStartTime=" + executionStartTime
//				+ ", executionEndTime=" + executionEndTime + "]";
//	}
	
}
