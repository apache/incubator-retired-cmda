package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Publication {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String paperTitle;
    @ManyToOne(optional = false)
	@JoinColumn(name = "authorId", referencedColumnName = "id")//using another table is better
    private User author;
    private String publicationChannel;
    private int year;
    
	public Publication() {
	}

	public Publication(String paperTitle, User author,
			String publicationChannel, int year) {
		super();
		this.paperTitle = paperTitle;
		this.author = author;
		this.publicationChannel = publicationChannel;
		this.year = year;
	}

	public String getPaperTitle() {
		return paperTitle;
	}

	public void setPaperTitle(String paperTitle) {
		this.paperTitle = paperTitle;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getPublicationChannel() {
		return publicationChannel;
	}

	public void setPublicationChannel(String publicationChannel) {
		this.publicationChannel = publicationChannel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", paperTitle=" + paperTitle
				+ ", author=" + author + ", publicationChannel="
				+ publicationChannel + ", year=" + year + "]";
	}
    
    
}

