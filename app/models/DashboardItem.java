/*
 * Copyright (c) 2013 Carnegie Mellon University Silicon Valley. 
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available
 * under the terms of dual licensing(GPL V2 for Research/Education
 * purposes). GNU Public License v2.0 which accompanies this distribution
 * is available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * Please contact http://www.cmu.edu/silicon-valley/ if you have any 
 * questions.
 * 
 * */
package models;

import models.metadata.Device;

public class DashboardItem {
	
	private int status; // 0: inactive, 1: active
	private Device device;
	
	public DashboardItem() {
		// TODO Auto-generated constructor stub
	}
	
	public DashboardItem(int status, Device device) {
		this.status = status;
		this.device = device;
	}
	
	public Device getDevice() {
		return device;
	}
	public int getStatus() {
		return status;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
