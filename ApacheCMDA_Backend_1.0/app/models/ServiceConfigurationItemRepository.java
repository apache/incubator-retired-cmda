package models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ServiceConfigurationItemRepository extends CrudRepository<ServiceConfigurationItem, Long> {
	
	List<ServiceConfigurationItem> findByServiceConfiguration_Id (long serviceConfigurationId);
    
	List<ServiceConfigurationItem> findByParameter (Parameter parameter);
	List<ServiceConfigurationItem> findByParameter_Id (long parameterId);

	List<ServiceConfigurationItem> findByParameterInAndValue (List<Parameter> parameter, String value);
	
	ServiceConfigurationItem findFirstByParameterAndServiceConfiguration(Parameter parameter, ServiceConfiguration serviceConfiguration);

}
