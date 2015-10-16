package models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "bookChapterPublicationId", referencedColumnName = "id")//referencedColumnName
public class BookChapterPublication extends Publication {

	private String bookName;
	private String editorName;
	private String time;
	
	public BookChapterPublication() {
		super();
	}	

	public BookChapterPublication(String paperTitle, User author,
			String publicationChannel, int year, String bookName,
			String editorName, String time) {
		super(paperTitle, author, publicationChannel, year);
		this.bookName = bookName;
		this.editorName = editorName;
		this.time = time;
	}



	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getEditorName() {
		return editorName;
	}
	public void setEditorName(String editorName) {
		this.editorName = editorName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
