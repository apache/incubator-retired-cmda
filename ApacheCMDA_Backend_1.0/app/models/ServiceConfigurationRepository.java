package models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ServiceConfigurationRepository extends CrudRepository<ServiceConfiguration, Long> {
	List<ServiceConfiguration> findAllByUser(User user);
}
