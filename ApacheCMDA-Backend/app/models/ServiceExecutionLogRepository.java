/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public interface ServiceExecutionLogRepository extends CrudRepository<ServiceExecutionLog, Long> {
    
	List<ServiceExecutionLog> findByUser_Id(long userId);

//    List<ServiceExecutionLog> findByExecutionStartTimeBetweenAndExecutionEndTimeBetweenAndPurposeLikeAndUser_IdAndServiceConfigurationIn(Date startA, Date startB, Date endA, Date endB, String purpose, long userId, Set<ServiceConfiguration> serviceConfigurations);
//
//    List<ServiceExecutionLog> findByExecutionStartTimeBetweenAndExecutionEndTimeBetweenAndPurposeLikeAndServiceConfigurationIn(Date startA, Date startB, Date endA, Date endB, String purpose, Set<ServiceConfiguration> serviceConfigurations);
//
//    List<ServiceExecutionLog> findByExecutionStartTimeBetweenAndExecutionEndTimeBetweenAndPurposeLikeAndUser_Id(Date startA, Date startB, Date endA, Date endB, String purpose, long userId);
//
//    List<ServiceExecutionLog> findByExecutionStartTimeBetweenAndExecutionEndTimeBetweenAndPurposeLike(Date startA, Date startB, Date endA, Date endB, String purpose);

    List<ServiceExecutionLog> findByServiceConfigurationIn(List<ServiceConfiguration> serviceConfigurations);

    List<ServiceExecutionLog> findByExecutionStartTimeGreaterThanEqualAndExecutionEndTimeLessThanEqualAndPurposeLikeAndUser_IdAndServiceConfigurationIn(Date start, Date end, String purpose, long userId, Set<ServiceConfiguration> serviceConfigurations);

    List<ServiceExecutionLog> findByExecutionStartTimeGreaterThanEqualAndExecutionEndTimeLessThanEqualAndPurposeLikeAndServiceConfigurationIn(Date start, Date end, String purpose, Set<ServiceConfiguration> serviceConfigurations);

    List<ServiceExecutionLog> findByExecutionStartTimeGreaterThanEqualAndExecutionEndTimeLessThanEqualAndPurposeLikeAndUser_Id(Date start, Date end, String purpose, long userId);

    List<ServiceExecutionLog> findByExecutionStartTimeGreaterThanEqualAndExecutionEndTimeLessThanEqualAndPurposeLike(Date start, Date end, String purpose);

    List<ServiceExecutionLog> findAllByOrderByExecutionStartTimeDesc();
}
