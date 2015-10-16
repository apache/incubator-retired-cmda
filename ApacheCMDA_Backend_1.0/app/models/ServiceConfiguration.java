package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class ServiceConfiguration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateservice;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	private String runTime;

//	@OneToMany(mappedBy="serviceConfiguration")
//	private List<ServiceConfigurationItem> serviceConfigurationItems;

	public ServiceConfiguration() {
	}
	
	public ServiceConfiguration(ClimateService climateservice,
			User user,String runtime){
		super();
		this.climateservice = climateservice;
		this.user = user;
		this.runTime = runtime;
	}

	public long getId() {
		return id;
	}

	public ClimateService getClimateservice() {
		return climateservice;
	}

	public User getUser() {
		return user;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setClimateservice(ClimateService climateservice) {
		this.climateservice = climateservice;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

//	public List<ServiceConfigurationItem> getServiceConfigurationItems() {
//		return serviceConfigurationItems;
//	}
//
//	public void setServiceConfigurationItems(
//			List<ServiceConfigurationItem> serviceConfigurationItems) {
//		this.serviceConfigurationItems = serviceConfigurationItems;
//	}

	@Override
	public String toString() {
		return "ServiceConfiguration [id=" + id + ", climateservice="
				+ climateservice + ", user=" + user + ", runTime=" + runTime
				+ "]";
	}


    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of ServiceConfiguration or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof ServiceConfiguration)) {
            return false;
        }

        // typecast o to ServiceConfiguration so that we can compare data members
        ServiceConfiguration c = (ServiceConfiguration) o;

        if (this.getId() == c.getId())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return (int)id;
    }
}