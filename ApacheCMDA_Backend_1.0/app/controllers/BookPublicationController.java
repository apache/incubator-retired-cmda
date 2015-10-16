package controllers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.BookPublication;
import models.BookPublicationRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class BookPublicationController extends Controller {
	private final BookPublicationRepository bookPublicationRepository;
    private final UserRepository userRepository;
	
	// We are using constructor injection to receive a repository to support our desire for immutability.
    @Inject
    public BookPublicationController(final BookPublicationRepository bookPublicationRepository,
    		final UserRepository userRepository) {
        this.bookPublicationRepository = bookPublicationRepository;
        this.userRepository = userRepository;
    }
    
    public Result addBookPublication() {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("BookPublication not saved, expecting Json data");
			return badRequest("BookPublication not saved, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String bookName = json.findPath("bookName").asText();
    	String publisherLocation = json.findPath("publisherLocation").asText();
		String time = json.findPath("time").asText();
		String pages = json.findPath("pages").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			BookPublication bookPublication = new BookPublication(paperTitle, author, publicationChannel,
					year, bookName, publisherLocation, time, pages);
			BookPublication savedBookPublication = bookPublicationRepository.save(bookPublication);
			
			System.out.println("BookPublication saved: " + savedBookPublication.getBookName());
			return created(new Gson().toJson(savedBookPublication.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println(pe.getClass().toString());
			System.out.println("BookPublication not saved: " + bookName);
			return badRequest("BookPublication not saved: " + bookName);
		}			
    }
    
    public Result deleteBookPublicationById(Long id) {
    	BookPublication bookPublication = bookPublicationRepository.findOne(id);
    	if (bookPublication == null) {
    		System.out.println("BookPublication not found with id: " + id);
			return notFound("BookPublication not found with id: " + id);
    	}
    	
    	bookPublicationRepository.delete(bookPublication);
    	System.out.println("BookPublication is deleted: " + id);
		return ok("BookPublication is deleted: " + id);
    }
    
    public Result updateBookPublicationById(long id) {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("BookPublication not updated, expecting Json data");
			return badRequest("BookPublication not updated, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String bookName = json.findPath("bookName").asText();
    	String publisherLocation = json.findPath("publisherLocation").asText();
		String time = json.findPath("time").asText();
		String pages = json.findPath("pages").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			
			BookPublication bookPublication = bookPublicationRepository.findOne(id);
			bookPublication.setPaperTitle(paperTitle);
			bookPublication.setAuthor(author);
			bookPublication.setPublicationChannel(publicationChannel);
			bookPublication.setYear(year);
			bookPublication.setBookName(bookName);
			bookPublication.setPublisherLocation(publisherLocation);
			bookPublication.setTime(time);
			bookPublication.setPages(pages);
			
			BookPublication savedBookPublication = bookPublicationRepository.save(bookPublication);
			
			System.out.println("BookPublication updated: " + savedBookPublication.getBookName());
			return created("BookPublication updated: " + savedBookPublication.getBookName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("BookPublication not updated: " + id);
			return badRequest("BookPublication not updated: " + id);
		}			
    }
    
    public Result getBookPublicationById(Long id, String format) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	
    	BookPublication bookPublication = bookPublicationRepository.findOne(id);
    	if (bookPublication == null) {
    		System.out.println("BookPublication not found with id: " + id);
			return notFound("BookPublication not found with id: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(bookPublication);
    	}
    	
    	return ok(result);
    }
    
    public Result getAllBookPublications(String format) {
    	
    	String result = new String();
    	
    	if (format.equals("json")) {
    		result = new Gson().toJson(bookPublicationRepository.findAll());
    	}
    			
    	return ok(result);
    }
}
