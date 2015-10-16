package controllers;

import java.util.Date;

import play.mvc.*;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import models.BugReport;
import models.BugReportRepository;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class BugReportController extends Controller {
	
	static private int solved = 1;
	static private int unsolved = 0;
	
	private final BugReportRepository bugReportRepository;
	
	@Inject
	public BugReportController(final BugReportRepository bugReportRepository) {
		this.bugReportRepository = bugReportRepository;
	}
	
	public Result addBugReport() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Bug Report not saved, expecting Json data");
			return badRequest("Bug Report not saved, expecting Json data");
		}
		String title = json.findPath("title").asText();
		String email = json.findPath("email").asText();
		String name = json.findPath("name").asText();
		String organization = json.findPath("organization").asText();
		String description = json.findPath("description").asText();
		int solved = json.findPath("solved").asInt();
		long creationDateNumber = json.findPath("creationDate").asLong();
		long updateDateNumber = json.findPath("updateDate").asLong();
		Date creationDate = new Date(creationDateNumber);
		Date updateDate = new Date(updateDateNumber);
		try {
			BugReport bugReport = new BugReport(title, email, name,
					organization, description, solved, creationDate, updateDate);
			BugReport savedBugReport = bugReportRepository.save(bugReport);
			System.out.println("Service Configuration saved: "
					+ savedBugReport.getId());
			return created(new Gson().toJson(savedBugReport.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Service Configuration not created");
			return badRequest("Service Configuration not created");
		}

	}
	
	public Result updateBugReportById(long id) {
		if (id < 0) {
			System.out.println("id is negative!");
			return badRequest("id is negative!");
		}
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out
					.println("Service Configuration not saved, expecting Json data");
			return badRequest("Service Configuration not saved, expecting Json data");
		}

		String title = json.findPath("title").asText();
		String email = json.findPath("email").asText();
		String name = json.findPath("name").asText();
		String organization = json.findPath("organization").asText();
		String description = json.findPath("description").asText();
		int solved = json.findPath("solved").asInt();
		long creationDateNumber = json.findPath("creationDate").asLong();
		long updateDateNumber = json.findPath("updateDate").asLong();
		Date creationDate = new Date(creationDateNumber);
		Date updateDate = new Date(updateDateNumber);

		try {
			BugReport bugReport = bugReportRepository.findOne(id);
			bugReport.setDescription(description);
			bugReport.setEmail(email);
			bugReport.setName(name);
			bugReport.setOrganization(organization);
			bugReport.setSolved(solved);
			bugReport.setTitle(title);
			bugReport.setCreationDate(creationDate);
			bugReport.setUpdateDate(updateDate);

			BugReport savedBugReport = bugReportRepository.save(bugReport);
			System.out.println("Service Configuration updated: "
					+ savedBugReport.getId());
			return created("Service Configuration updated: "
					+ savedBugReport.getId());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Service Configuration not saved: " + id);
			return badRequest("Service Configuration not saved: " + id);
		}
	}

	
    public Result deleteBugReport(long id) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	BugReport bugReport = bugReportRepository.findOne(id);
    	if (bugReport == null) {
    		System.out.println("Service Configuration not found with id: " + id);
			return notFound("Service Configuration not found with id: " + id);
    	}
    	
    	bugReportRepository.delete(bugReport);
    	System.out.println("Service Configuration is deleted: " + id);
		return ok("Service Configuration is deleted: " + id);
    }
    public Result getBugReport(long id, String format) {
    	BugReport bugReport = bugReportRepository.findOne(id);
    	if (bugReport == null) {
    		System.out.println("Service Configuration not found with name: " + id);
			return notFound("Service Configuration not found with name: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(bugReport);
    	}
    	
    	return ok(result);
    }
    
    public Result getAllBugReports() {
    	try {
    		Iterable<BugReport> bugReports =  bugReportRepository.findAll();
    		String result = new String();
    		result = new Gson().toJson(bugReports);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("Service Configurations not found");
    	}
    }
    
    public Result getAllUnsolvedBugReports() {
    	try {
    		Iterable<BugReport> bugReports =  bugReportRepository.findAllBySolved(unsolved);
    		String result = new String();
    		result = new Gson().toJson(bugReports);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("Service Configurations not found");
    	}
    }
    
    public Result getAllSolvedBugReports() {
    	try {
    		Iterable<BugReport> bugReports =  bugReportRepository.findAllBySolved(solved);
    		String result = new String();
    		result = new Gson().toJson(bugReports);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("Service Configurations not found");
    	}
    }
	
}