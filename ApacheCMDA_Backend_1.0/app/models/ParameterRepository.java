package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Named
@Singleton
public interface ParameterRepository extends CrudRepository<Parameter, Long> {
	List<Parameter> findByName(String name);
	Parameter findByNameAndClimateService(String name, ClimateService climateService);
	Parameter findByNameAndClimateService_Id(String name, long serviceId);
}