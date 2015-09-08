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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ServiceConfiguration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceId", referencedColumnName = "id")
	private ClimateService climateservice;
	@ManyToOne(optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
	private String runTime;

//	@OneToMany(mappedBy="serviceConfiguration")
//	private List<ServiceConfigurationItem> serviceConfigurationItems;

	public ServiceConfiguration() {
	}
	
	public ServiceConfiguration(ClimateService climateservice,
			User user,String runtime){
		super();
		this.climateservice = climateservice;
		this.user = user;
		this.runTime = runtime;
	}

	public long getId() {
		return id;
	}

	public ClimateService getClimateservice() {
		return climateservice;
	}

	public User getUser() {
		return user;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setClimateservice(ClimateService climateservice) {
		this.climateservice = climateservice;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

//	public List<ServiceConfigurationItem> getServiceConfigurationItems() {
//		return serviceConfigurationItems;
//	}
//
//	public void setServiceConfigurationItems(
//			List<ServiceConfigurationItem> serviceConfigurationItems) {
//		this.serviceConfigurationItems = serviceConfigurationItems;
//	}

	@Override
	public String toString() {
		return "ServiceConfiguration [id=" + id + ", climateservice="
				+ climateservice + ", user=" + user + ", runTime=" + runTime
				+ "]";
	}


    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of ServiceConfiguration or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof ServiceConfiguration)) {
            return false;
        }

        // typecast o to ServiceConfiguration so that we can compare data members
        ServiceConfiguration c = (ServiceConfiguration) o;

        if (this.getId() == c.getId())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return (int)id;
    }
}