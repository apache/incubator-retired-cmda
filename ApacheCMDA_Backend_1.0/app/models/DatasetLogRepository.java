package models;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface DatasetLogRepository extends CrudRepository<DatasetLog, Long> {
	
    List<DatasetLog> findByServiceExecutionStartTimeGreaterThanEqualAndServiceExecutionEndTimeLessThanEqualAndUser_Id(Date serviceExecutionStartTime, Date serviceExecutionEndTime, long userId);

}
