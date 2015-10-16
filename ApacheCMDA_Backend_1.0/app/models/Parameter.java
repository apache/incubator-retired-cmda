package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Parameter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateService;
	private long indexInService;
	private String name;
	private String dataRange;
	private String rule;
	private String purpose;
	
	public Parameter() {
	}

	public Parameter(ClimateService climateService, long indexInService,
			String name, String dataRange,
			String rule, String purpose) {
		super();
		this.climateService = climateService;
		this.indexInService = indexInService;
		this.name = name;
		this.dataRange = dataRange;
		this.rule = rule;
		this.purpose = purpose;
	}

	public long getId() {
		return id;
	}

	public ClimateService getClimateService() {
		return climateService;
	}

	public void setClimateService(ClimateService climateService) {
		this.climateService = climateService;
	}

	public long getIndexInService() {
		return indexInService;
	}

	public void setIndexInService(long indexInService) {
		this.indexInService = indexInService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataRange() {
		return dataRange;
	}

	public void setDataRange(String dataRange) {
		this.dataRange = dataRange;
	}
	
	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "Parameter [id=" + id + ", climateService=" + climateService
				+ ", indexInService=" + indexInService + ", name=" + name
				+ ", dataRange=" + dataRange
				+ ", rule=" + rule + ", purpose=" + purpose + "]";
	}

	
	
}