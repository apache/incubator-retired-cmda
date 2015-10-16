package controllers;

import java.util.List;

import play.mvc.*;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import models.ClimateService;
import models.ClimateServiceRepository;
import models.ServiceConfiguration;
import models.ServiceConfigurationRepository;
import models.User;
import models.UserRepository;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

/**
 * The main set of web services.
 */
@Named
@Singleton
public class ServiceConfigurationController extends Controller {
	
	private final ServiceConfigurationRepository serviceConfigurationRepository;
	private final ClimateServiceRepository climateServiceRepository;
	private final UserRepository userRepository;
	
	@Inject
	public ServiceConfigurationController(final ServiceConfigurationRepository serviceConfigurationRepository, 
			UserRepository userRepository, ClimateServiceRepository climateServiceRepository) {
		this.serviceConfigurationRepository = serviceConfigurationRepository;
		this.climateServiceRepository = climateServiceRepository;
		this.userRepository = userRepository;
	}
	
	public Result addServiceConfiguration() {
		JsonNode json = request().body().asJson();
    	if (json == null) {
    		System.out.println("Service Configuration not saved, expecting Json data");
			return badRequest("Service Configuration not saved, expecting Json data");
    	}
    	long serviceId = json.findPath("serviceId").asLong();
    	long userId = json.findPath("userId").asLong();
    	String runTime = json.findPath("runTime").asText();

    	try {
			User user = userRepository.findOne(userId);
			ClimateService climateService = climateServiceRepository.findOne(serviceId);
			ServiceConfiguration serviceConfiguration = new ServiceConfiguration(climateService,
					user, runTime);
			ServiceConfiguration savedServiceConfiguration = serviceConfigurationRepository.save(serviceConfiguration);
			System.out.println("Service Configuration saved: "+ savedServiceConfiguration.getId());
			return created(new Gson().toJson(savedServiceConfiguration.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Service Configuration not created");
			return badRequest("Service Configuration not created");
		}
    	
	}
	
    public Result updateServiceConfigurationById(long id) {
		if (id < 0) {
			System.out.println("id is negative!");
			return badRequest("id is negative!");
		}
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Service Configuration not saved, expecting Json data");
			return badRequest("Service Configuration not saved, expecting Json data");
		}
		long serviceId = json.findPath("serviceId").asLong();
		long userId = json.findPath("userId").asLong();
		String runTime = json.findPath("runTime").asText();


	
		try {
			ServiceConfiguration serviceConfiguration = serviceConfigurationRepository.findOne(id);
			serviceConfiguration.setRunTime(runTime);
			ClimateService climateService = climateServiceRepository.findOne(serviceId);
			serviceConfiguration.setClimateservice(climateService);
			User user = userRepository.findOne(userId);
			serviceConfiguration.setUser(user);
			ServiceConfiguration savedServiceConfiguration = serviceConfigurationRepository.save(serviceConfiguration);
			
			System.out.println("Service Configuration updated: "+ savedServiceConfiguration.getId());
			return created("Service Configuration updated: "+ savedServiceConfiguration.getId());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Service Configuration not saved: "+id);
			return badRequest("Service Configuration not saved: "+id);
		}			
	}

	
    public Result deleteServiceConfiguration(long id) {
    	if (id < 0) {
    		System.out.println("id is negative!");
			return badRequest("id is negative!");
    	}
    	ServiceConfiguration serviceConfiguration = serviceConfigurationRepository.findOne(id);
    	if (serviceConfiguration == null) {
    		System.out.println("Service Configuration not found with id: " + id);
			return notFound("Service Configuration not found with id: " + id);
    	}
    	
    	serviceConfigurationRepository.delete(serviceConfiguration);
    	System.out.println("Service Configuration is deleted: " + id);
		return ok("Service Configuration is deleted: " + id);
    }
    public Result getServiceConfiguration(long id, String format) {
    	ServiceConfiguration serviceConfiguration = serviceConfigurationRepository.findOne(id);
    	if (serviceConfiguration == null) {
    		System.out.println("Service Configuration not found with name: " + id);
			return notFound("Service Configuration not found with name: " + id);
    	}
    	
    	String result = new String();
    	if (format.equals("json")) {
    		result = new Gson().toJson(serviceConfiguration);
    	}
    	
    	return ok(result);
    }
    
    public Result getServiceConfigurationsByUser(long userId, String format) {
    	if (userId < 0) {
    		System.out.println("userId is negative!");
			return badRequest("userId is negative!");
    	}
    	try {
			User user = userRepository.findOne(userId);
			if (user == null) {
				System.out.println("Cannot find User by id: "+userId);
				return notFound("Cannot find User by id: "+userId);
			}
			List<ServiceConfiguration> serviceConfigurations = serviceConfigurationRepository.findAllByUser(user);
			String result = new String();
	    	if (format.equals("json")) {
	    		result = new Gson().toJson(serviceConfigurations);
	    	}
	    	return ok(result);
		} catch (PersistenceException pe) {
			System.out.println("Service Configuration not found by userId: "+userId);
			return notFound("Service Configuration not found by userId: "+userId);
		}
    }
    
    public Result getAllServiceConfigurations() {
    	try {
    		Iterable<ServiceConfiguration> serviceConfigurations =  serviceConfigurationRepository.findAll();
    		String result = new String();
    		result = new Gson().toJson(serviceConfigurations);
    		return ok(result);
    	} catch (Exception e) {
    		return badRequest("Service Configurations not found");
    	}
    }
	
}