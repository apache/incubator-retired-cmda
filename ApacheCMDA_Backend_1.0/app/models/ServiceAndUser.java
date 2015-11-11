package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ServiceAndUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateService;
	private long count;
	
	public ServiceAndUser() {
	}
	
	public ServiceAndUser(User user, ClimateService climateService, long count) {
		this.user = user;
		this.climateService = climateService;
		this.count = count;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public ClimateService getClimateService() {
		return climateService;
	}

	@Override
	public String toString() {
		return "ServiceAndUser [id=" + id + ", user=" + user
				+ ", climateService=" + climateService + ", count=" + count
				+ "]";
	}

}

