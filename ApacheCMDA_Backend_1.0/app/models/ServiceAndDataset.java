package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ServiceAndDataset {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateService;
	@ManyToOne(optional = false)
	@JoinColumn(name = "datasetId", referencedColumnName = "id")
	private Dataset dataset;
	private long count;
	
	public ServiceAndDataset() {
	}
	
	public ServiceAndDataset(ClimateService climateService, Dataset dataset, long count) {
		this.climateService = climateService;
		this.dataset = dataset;
		this.count = count;
	}

	public ClimateService getClimateService() {
		return climateService;
	}

	public void setClimateService(ClimateService climateService) {
		this.climateService = climateService;
	}

	public Dataset getDataset() {
		return dataset;
	}

	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ServiceAndDataset [id=" + id + ", climateService="
				+ climateService + ", dataset=" + dataset + ", count=" + count
				+ "]";
	}
	
}
