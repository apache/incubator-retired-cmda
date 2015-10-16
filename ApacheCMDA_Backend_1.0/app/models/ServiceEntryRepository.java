package models;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by xing on 4/15/15.
 */

@Named
@Singleton
public interface ServiceEntryRepository extends CrudRepository<ServiceEntry, Long> {
	List<ServiceEntry> findByClimateServiceAndVersionNo(ClimateService climateService, String versionNo);
}




