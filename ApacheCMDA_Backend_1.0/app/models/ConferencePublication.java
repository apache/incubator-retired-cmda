package models;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "conferencePublicationId", referencedColumnName = "id")
public class ConferencePublication extends Publication {

	private String name;
	private String location;
	private String time;
	private String page;
	
	
	public ConferencePublication() {
		super();
	}	
	
	public ConferencePublication(String paperTitle, User author,
			String publicationChannel, int year, String name, String location,
			String time, String page) {
		super(paperTitle, author, publicationChannel, year);
		this.name = name;
		this.location = location;
		this.time = time;
		this.page = page;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	
	
}
