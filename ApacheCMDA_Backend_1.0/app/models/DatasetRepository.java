package models;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface DatasetRepository extends CrudRepository<Dataset, Long> {
	
	@Query(value = "select d.* from Dataset d where (d.dataSourceInputParameterToCallScienceApplicationCode = ?1 and d.CMIP5VarName = ?2)", nativeQuery = true)
	List<Dataset> findByDataSourceAndCMIP5VarName(String source, String variable);
	
	List<Dataset> findByNameLikeAndAgencyIdLikeAndGridDimensionLikeAndPhysicalVariableLikeAndInstrument_Id(String name, String agencyId, String gridDimension, String physicalVariable,long instrumentId);
	List<Dataset> findByNameLikeAndAgencyIdLikeAndGridDimensionLikeAndPhysicalVariableLike(String name, String agencyId, String gridDimension, String physicalVariable);
	List<Dataset> findByvariableNameInWebInterface(String variableNameInWebInterface);
	List<Dataset> findByNameLikeAndAgencyIdLikeAndGridDimensionLikeAndPhysicalVariableLikeAndInstrument_IdAndStartTimeLessThanEqualOrEndTimeGreaterThanEqual(String name, String agencyId, String gridDimension, String physicalVariable, long instrumentId, Date startTime, Date endTime);
	List<Dataset> findByNameLikeAndAgencyIdLikeAndGridDimensionLikeAndPhysicalVariableLikeAndStartTimeLessThanEqualOrEndTimeGreaterThanEqual(String name, String agencyId, String gridDimension, String physicalVariable, Date startTime, Date endTime);
	
	//New Dataset Search 
	@Query(value = "select d.* from Dataset d where ((d.name like ?1) and (d.agencyId like ?2) and (d.gridDimension like ?3) and (d.physicalVariable like ?4) and (d.instrumentId = ?5)) and ((d.startTime between ?6 and ?7) or (d.endTime between ?6 and ?7) or (d.startTime <= ?6 and d.endTime >= ?7))", nativeQuery = true)
	List<Dataset> findDatasetWithInstrument_Id(String name, String agencyId, String gridDimension, String physicalVariable, long instrumentId, Date startTime, Date endTime);
	
	@Query(value = "select d.* from Dataset d where ((d.name like ?1) and (d.agencyId like ?2) and (d.gridDimension like ?3) and (d.physicalVariable like ?4)) and ((d.startTime between ?5 and ?6) or (d.endTime between ?5 and ?6) or (d.startTime <= ?5 and d.endTime >= ?6))", nativeQuery = true)
	List<Dataset> findDataset(String name, String agencyId, String gridDimension, String physicalVariable, Date startTime, Date endTime);
	
	@Query(value = "select d.* from Dataset d where ((d.name like ?1) and (d.agencyId like ?2) and (d.gridDimension like ?3) and (d.physicalVariable like ?4) and (d.source like ?5)) and ((d.startTime between ?6 and ?7) or (d.endTime between ?6 and ?7) or (d.startTime <= ?6 and d.endTime >= ?7))", nativeQuery = true)
	List<Dataset> findDatasetWithInstrument(String name, String agencyId, String gridDimension, String physicalVariable, String source, Date startTime, Date endTime);
	
	@Query(value = "select d.* from Dataset d, DatasetEntry s where ((d.id=s.datasetId) and (d.name like ?1) and (d.agencyId like ?2) and (d.gridDimension like ?3) and (d.physicalVariable like ?4)) and ((d.startTime between ?5 and ?6) or (d.endTime between ?5 and ?6) or (d.startTime <= ?5 and d.endTime >= ?6)) group by s.datasetId order by sum(s.count) desc limit ?7", nativeQuery = true)
	List<Dataset> getClimateServiceOrderByCount(String name, String agencyId, String gridDimension, String physicalVariable, Date startTime, Date endTime, int k);
	
	@Query(value = "select d.* from Dataset d, DatasetEntry s where ((d.id=s.datasetId) and (d.name like ?1) and (d.agencyId like ?2) and (d.gridDimension like ?3) and (d.physicalVariable like ?4) and (d.source like ?5)) and ((d.startTime between ?6 and ?7) or (d.endTime between ?6 and ?7)) group by s.datasetId order by sum(s.count) desc limit ?8", nativeQuery = true)
	List<Dataset> getClimateServiceOrderByCountWithInstrument(String name, String agencyId, String gridDimension, String physicalVariable, String source, Date startTime, Date endTime, int k);
	
	
	
//	@Query(value = "select d.* from Dataset d, DatasetEntry s where d.id=s.datasetId group by s.datasetId order by sum(s.count) desc limit ?1", nativeQuery = true)
//	List<Dataset> getClimateServiceOrderByCount(int k);
	
}