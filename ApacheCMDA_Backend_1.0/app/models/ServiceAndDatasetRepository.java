package models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ServiceAndDatasetRepository extends CrudRepository<ServiceAndDataset, Long> {

	List<ServiceAndDataset> findByClimateService(ClimateService service);
	List<ServiceAndDataset> findByDataset(Dataset dataset);
		
}

