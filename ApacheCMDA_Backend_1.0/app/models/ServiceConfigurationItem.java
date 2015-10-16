package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ServiceConfigurationItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceConfigurationId", referencedColumnName = "id")
	private ServiceConfiguration serviceConfiguration;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "parameterId", referencedColumnName = "id")
	private Parameter parameter;
	
	private String value;

	public ServiceConfigurationItem() {
	}
	
	public ServiceConfigurationItem(ServiceConfiguration serviceConfiguration, Parameter parameter
			, String value) {
		super();
		this.serviceConfiguration = serviceConfiguration;
		this.parameter = parameter;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public ServiceConfiguration getServiceConfiguration() {
		return serviceConfiguration;
	}
	public void setServiceConfiguration(ServiceConfiguration serviceConfiguration) {
		this.serviceConfiguration = serviceConfiguration;
	}
	public Parameter getParameter() {
		return parameter;
	}
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	

	@Override
	public String toString() {
		return "ServiceConfigurationItem [id=" + id + ", serviceConfiguration="
				+ serviceConfiguration + ", parameter=" + parameter
				+ ", value=" + value + "]";
	}
}
