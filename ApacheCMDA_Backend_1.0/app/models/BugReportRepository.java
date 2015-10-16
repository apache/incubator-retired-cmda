package models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface BugReportRepository extends CrudRepository<BugReport, Long> {
	List<BugReport> findAllBySolved(int solved);
}