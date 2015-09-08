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
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "journalPublicationId", referencedColumnName = "id")//referencedColumnName
public class JournalPublication extends Publication {
	private String journalName;
	private int volume;
	private int qcolumn;//naming problem
	private String page;
	
	public JournalPublication() {
	}
	public JournalPublication(String paperTitle, User author,
			String publicationChannel, int year, String journalName, int volume,
			int column, String page) {
		super(paperTitle, author, publicationChannel, year);
		this.journalName = journalName;
		this.volume = volume;
		this.qcolumn = column;
		this.page = page;
	}
	
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getColumn() {
		return qcolumn;
	}
	public void setColumn(int column) {
		this.qcolumn = column;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "JournalPublication [journalName=" + journalName + ", volume="
				+ volume + ", column=" + qcolumn + ", page=" + page
				+ ", toString()=" + super.toString() + "]";
	}
}
