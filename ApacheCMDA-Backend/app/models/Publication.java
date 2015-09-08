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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Publication {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String paperTitle;
    @ManyToOne(optional = false)
	@JoinColumn(name = "authorId", referencedColumnName = "id")//using another table is better
    private User author;
    private String publicationChannel;
    private int year;
    
	public Publication() {
	}

	public Publication(String paperTitle, User author,
			String publicationChannel, int year) {
		super();
		this.paperTitle = paperTitle;
		this.author = author;
		this.publicationChannel = publicationChannel;
		this.year = year;
	}

	public String getPaperTitle() {
		return paperTitle;
	}

	public void setPaperTitle(String paperTitle) {
		this.paperTitle = paperTitle;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getPublicationChannel() {
		return publicationChannel;
	}

	public void setPublicationChannel(String publicationChannel) {
		this.publicationChannel = publicationChannel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", paperTitle=" + paperTitle
				+ ", author=" + author + ", publicationChannel="
				+ publicationChannel + ", year=" + year + "]";
	}
    
    
}

