package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DatasetAndUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	@ManyToOne(optional = false)
	@JoinColumn(name = "datasetId", referencedColumnName = "id")
	private Dataset dataset;
	private long count;
	
	public DatasetAndUser() {
	}
	
	public DatasetAndUser(User user, Dataset dataset, long count) {
		this.user = user;
		this.dataset = dataset;
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
	
	@Override
	public String toString() {
		return "DatasetAndUser[id=" + id + ", user=" + user.toString()
				+ ", dataset=" + dataset.toString() + ", count=" + count + "]";
	}
}
