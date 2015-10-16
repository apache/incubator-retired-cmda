package controllers;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.ConferencePublication;
import models.ConferencePublicationRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class ConferencePublicationController extends Controller {
	private final ConferencePublicationRepository ConferencePublicationRepository;
    private final UserRepository userRepository;
	
	// We are using constructor injection to receive a repository to support our desire for immutability.
    @Inject
    public ConferencePublicationController(final ConferencePublicationRepository ConferencePublicationRepository,
    		final UserRepository userRepository) {
        this.ConferencePublicationRepository = ConferencePublicationRepository;
        this.userRepository = userRepository;
    }
    
    public Result addConferencePublication() {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("ConferencePublication not saved, expecting Json data");
			return badRequest("ConferencePublication not saved, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String name = json.findPath("name").asText();
    	String location = json.findPath("location").asText();
		String time = json.findPath("time").asText();
		String page = json.findPath("page").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			ConferencePublication ConferencePublication = new ConferencePublication(paperTitle, author, publicationChannel,
					year, name, location, time, page);
			ConferencePublication savedConferencePublication = ConferencePublicationRepository.save(ConferencePublication);
			
			System.out.println("ConferencePublication saved: " + savedConferencePublication.getName());
			return created(new Gson().toJson(savedConferencePublication.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println(pe.getClass().toString());
			System.out.println("ConferencePublication not saved: " + name);
			return badRequest("ConferencePublication not saved: " + name);
		}			
    }
    
    public Result deleteConferencePublication(Long id) {
    	ConferencePublication ConferencePublication = ConferencePublicationRepository.findOne(id);
    	if (ConferencePublication == null) {
    		System.out.println("ConferencePublication not found with id: " + id);
			return notFound("ConferencePublication not found with id: " + id);
    	}
    	
    	ConferencePublicationRepository.delete(ConferencePublication);
    	System.out.println("ConferencePublication is deleted: " + id);
		return ok("ConferencePublication is deleted: " + id);
    }
    
    public Result updateConferencePublication(long id) {
    	JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("ConferencePublication not updated, expecting Json data");
			return badRequest("ConferencePublication not updated, expecting Json data");
    	}

    	//Parse JSON file
    	String paperTitle = json.findPath("paperTitle").asText();
    	long authorId = json.findPath("authorId").asLong();
		String publicationChannel = json.findPath("publicationChannel").asText();
		int year = json.findPath("year").asInt();
		String name = json.findPath("name").asText();
    	String location = json.findPath("location").asText();
		String time = json.findPath("time").asText();
		String page = json.findPath("page").asText();
		
		try {
			User author = userRepository.findOne(authorId);
			
			ConferencePublication ConferencePublication = ConferencePublicationRepository.findOne(id);
			ConferencePublication.setPaperTitle(paperTitle);
			ConferencePublication.setAuthor(author);
			ConferencePublication.setPublicationChannel(publicationChannel);
			ConferencePublication.setYear(year);
			ConferencePublication.setName(name);
			ConferencePublication.setLocation(location);
			ConferencePublication.setTime(time);
			ConferencePublication.setPage(page);
			
			ConferencePublication savedConferencePublication = ConferencePublicationRepository.save(ConferencePublication);
			
			System.out.println("ConferencePublication updated: " + savedConferencePublication.getName());
			return created("ConferencePublication updated: " + savedConferencePublication.getName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("ConferencePublication not updated: " + id);
			return badRequest("ConferencePublication not updated: " + id);
		}			
    }
    
    public Result getConferencePublication(Long id, String format) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	
    	ConferencePublication ConferencePublication = ConferencePublicationRepository.findOne(id);
    	if (ConferencePublication == null) {
    		System.out.println("ConferencePublication not found with id: " + id);
			return notFound("ConferencePublication not found with id: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(ConferencePublication);
    	}
    	
    	return ok(result);
    }
    
    public Result getAllConferencePublications(String format) {
    	
    	String result = new String();
    	
    	if (format.equals("json")) {
    		result = new Gson().toJson(ConferencePublicationRepository.findAll());
    	}
    			
    	return ok(result);
    }
}
