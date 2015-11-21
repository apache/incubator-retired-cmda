package models;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ServiceAndUserRepository extends CrudRepository<ServiceAndUser, Long> {

	List<ServiceAndUser> findByUser(User user);
	List<ServiceAndUser> findByClimateService(ClimateService service);
	List<ServiceAndUser> findAll(Sort sort);
}

