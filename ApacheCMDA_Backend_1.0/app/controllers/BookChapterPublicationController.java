package controllers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.BookChapterPublication;
import models.BookChapterPublicationRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class BookChapterPublicationController extends Controller {
	private final BookChapterPublicationRepository bookChapterPublicationRepository;
    private final UserRepository userRepository;
	
	// We are using constructor injection to receive a repository to support our desire for immutability.
    @Inject
    public BookChapterPublicationController(final BookChapterPublicationRepository BookChapterPublicationRepository,
    		final UserRepository userRepository) {
        this.bookChapterPublicationRepository = BookChapterPublicationRepository;
        this.userRepository = userRepository;
    }
    
    public Result addBookChapterPublication() {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("BookChapterPublication not saved, expecting Json data");
			return badRequest("BookChapterPublication not saved, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String bookName = json.findPath("bookName").asText();
    	String editorName = json.findPath("editorName").asText();
		String time = json.findPath("time").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			BookChapterPublication BookChapterPublication = new BookChapterPublication(paperTitle, author, publicationChannel,
					year, bookName, editorName, time);
			BookChapterPublication savedBookChapterPublication = bookChapterPublicationRepository.save(BookChapterPublication);
			
			System.out.println("BookChapterPublication saved: " + savedBookChapterPublication.getBookName());
			return created(new Gson().toJson(savedBookChapterPublication.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println(pe.getClass().toString());
			System.out.println("BookChapterPublication not saved: " + bookName);
			return badRequest("BookChapterPublication not saved: " + bookName);
		}			
    }
    
    public Result deleteBookChapterPublication(Long id) {
    	BookChapterPublication BookChapterPublication = bookChapterPublicationRepository.findOne(id);
    	if (BookChapterPublication == null) {
    		System.out.println("BookChapterPublication not found with id: " + id);
			return notFound("BookChapterPublication not found with id: " + id);
    	}
    	
    	bookChapterPublicationRepository.delete(BookChapterPublication);
    	System.out.println("BookChapterPublication is deleted: " + id);
		return ok("BookChapterPublication is deleted: " + id);
    }
    
    public Result updateBookChapterPublication(long id) {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("BookChapterPublication not updated, expecting Json data");
			return badRequest("BookChapterPublication not updated, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String bookName = json.findPath("bookName").asText();
    	String editorName = json.findPath("editorName").asText();
		String time = json.findPath("time").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			
			BookChapterPublication BookChapterPublication = bookChapterPublicationRepository.findOne(id);
			BookChapterPublication.setPaperTitle(paperTitle);
			BookChapterPublication.setAuthor(author);
			BookChapterPublication.setPublicationChannel(publicationChannel);
			BookChapterPublication.setYear(year);
			BookChapterPublication.setBookName(bookName);
			BookChapterPublication.setEditorName(editorName);
			BookChapterPublication.setTime(time);
			
			BookChapterPublication savedBookChapterPublication = bookChapterPublicationRepository.save(BookChapterPublication);
			
			System.out.println("BookChapterPublication updated: " + savedBookChapterPublication.getBookName());
			return created("BookChapterPublication updated: " + savedBookChapterPublication.getBookName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("BookChapterPublication not updated: " + id);
			return badRequest("BookChapterPublication not updated: " + id);
		}			
    }
    
    public Result getBookChapterPublication(Long id, String format) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	
    	BookChapterPublication BookChapterPublication = bookChapterPublicationRepository.findOne(id);
    	if (BookChapterPublication == null) {
    		System.out.println("BookChapterPublication not found with id: " + id);
			return notFound("BookChapterPublication not found with id: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(BookChapterPublication);
    	}
    	
    	return ok(result);
    }
    
    public Result getAllBookChapterPublications(String format) {
    	
    	String result = new String();
    	
    	if (format.equals("json")) {
    		result = new Gson().toJson(bookChapterPublicationRepository.findAll());
    	}
    			
    	return ok(result);
    }
}
