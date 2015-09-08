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
public class ServiceConfigurationItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "serviceConfigurationId", referencedColumnName = "id")
	private ServiceConfiguration serviceConfiguration;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "parameterId", referencedColumnName = "id")
	private Parameter parameter;
	
	private String value;

	public ServiceConfigurationItem() {
	}
	
	public ServiceConfigurationItem(ServiceConfiguration serviceConfiguration, Parameter parameter
			, String value) {
		super();
		this.serviceConfiguration = serviceConfiguration;
		this.parameter = parameter;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public ServiceConfiguration getServiceConfiguration() {
		return serviceConfiguration;
	}
	public void setServiceConfiguration(ServiceConfiguration serviceConfiguration) {
		this.serviceConfiguration = serviceConfiguration;
	}
	public Parameter getParameter() {
		return parameter;
	}
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	

	@Override
	public String toString() {
		return "ServiceConfigurationItem [id=" + id + ", serviceConfiguration="
				+ serviceConfiguration + ", parameter=" + parameter
				+ ", value=" + value + "]";
	}
}
