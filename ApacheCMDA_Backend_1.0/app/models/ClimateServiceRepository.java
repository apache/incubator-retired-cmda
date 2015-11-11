package models;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ClimateServiceRepository extends CrudRepository<ClimateService, Long> {
	List<ClimateService> findAllByName(String name);
	ClimateService findFirstByName(String oldName);
    List<ClimateService> findByOrderByCreateTimeDesc();
	// select c.*, sum(s.count) as totalcount from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by totalcount desc;
	@Query(value = "select c.* from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by sum(s.count) desc", nativeQuery = true)
	List<ClimateService> getClimateServiceOrderByCount();

	@Query(value = "select c.* from ClimateService c, ServiceEntry s where c.id=s.serviceId group by s.serviceId order by s.latestAccessTimeStamp desc", nativeQuery = true)
	List<ClimateService> getClimateServiceOrderByLatestAccessTime();
	
	@Query(value = "select * from ClimateService where id in (select serviceId from ServiceEntry s where serviceId in (select climateServiceId from DatasetAndService where datasetId=?2) group by s.serviceId order by s.latestAccessTimeStamp desc) limit ?1", nativeQuery = true)
	List<ClimateService> getClimateServiceByDatasetId(int k, long id);
	
	@Query(value = "select * from ClimateService where ((name like ?1) and (purpose like ?2) and (url like ?3) and (scenario like ?4) and (versionNo like ?5))", nativeQuery = true)
	List<ClimateService> findClimateService(String name, String purpose, String url, String scenario, String versionNo);
	
}
