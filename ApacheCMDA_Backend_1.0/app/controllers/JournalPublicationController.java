package controllers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.JournalPublication;
import models.JournalPublicationRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class JournalPublicationController extends Controller {
	private final JournalPublicationRepository journalPublicationRepository;
    private final UserRepository userRepository;
	
	// We are using constructor injection to receive a repository to support our desire for immutability.
    @Inject
    public JournalPublicationController(final JournalPublicationRepository journalPublicationRepository,
    		final UserRepository userRepository) {
        this.journalPublicationRepository = journalPublicationRepository;
        this.userRepository = userRepository;
    }
    
    public Result addJournalPublication() {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("JournalPublication not saved, expecting Json data");
			return badRequest("JournalPublication not saved, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String journalName = json.findPath("journalName").asText();
    	int volume = json.findPath("volume").asInt();
		int column = json.findPath("column").asInt();
		String page = json.findPath("page").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			JournalPublication journalPublication = new JournalPublication(paperTitle, author, publicationChannel,
					year, journalName, volume, column, page);
			JournalPublication savedJournalPublication = journalPublicationRepository.save(journalPublication);
			
			System.out.println("JournalPublication saved: " + savedJournalPublication.getJournalName());
			return created(new Gson().toJson(savedJournalPublication.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println(pe.getClass().toString());
			System.out.println("JournalPublication not saved: " + journalName);
			return badRequest("JournalPublication not saved: " + journalName);
		}			
    }
    
    public Result deleteJournalPublicationById(Long id) {
    	JournalPublication journalPublication = journalPublicationRepository.findOne(id);
    	if (journalPublication == null) {
    		System.out.println("JournalPublication not found with id: " + id);
			return notFound("JournalPublication not found with id: " + id);
    	}
    	
    	journalPublicationRepository.delete(journalPublication);
    	System.out.println("JournalPublication is deleted: " + id);
		return ok("JournalPublication is deleted: " + id);
    }
    
    public Result updateJournalPublicationById(long id) {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("JournalPublication not updated, expecting Json data");
			return badRequest("JournalPublication not updated, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String journalName = json.findPath("journalName").asText();
    	int volume = json.findPath("volume").asInt();
		int column = json.findPath("column").asInt();
		String page = json.findPath("page").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			
			JournalPublication journalPublication = journalPublicationRepository.findOne(id);
			journalPublication.setPaperTitle(paperTitle);
			journalPublication.setAuthor(author);
			journalPublication.setPublicationChannel(publicationChannel);
			journalPublication.setYear(year);
			journalPublication.setJournalName(journalName);
			journalPublication.setVolume(volume);
			journalPublication.setColumn(column);
			journalPublication.setPage(page);
			
			JournalPublication savedJournalPublication = journalPublicationRepository.save(journalPublication);
			
			System.out.println("JournalPublication updated: " + savedJournalPublication.getJournalName());
			return created("JournalPublication updated: " + savedJournalPublication.getJournalName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("JournalPublication not updated: " + id);
			return badRequest("JournalPublication not updated: " + id);
		}			
    }
    
    public Result getJournalPublicationById(Long id, String format) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	
    	JournalPublication journalPublication = journalPublicationRepository.findOne(id);
    	if (journalPublication == null) {
    		System.out.println("JournalPublication not found with id: " + id);
			return notFound("JournalPublication not found with id: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(journalPublication);
    	}
    	
    	return ok(result);
    }
    
    public Result getAllJournalPublications(String format) {
    	
    	String result = new String();
    	
    	if (format.equals("json")) {
    		result = new Gson().toJson(journalPublicationRepository.findAll());
    	}
    			
    	return ok(result);
    }
}
