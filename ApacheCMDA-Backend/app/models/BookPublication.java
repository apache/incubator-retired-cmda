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
@PrimaryKeyJoinColumn(name = "bookPublicationId", referencedColumnName = "id")//referencedColumnName
public class BookPublication extends Publication {
	private String bookName;
	//private String publisherName;
	private String publisherLocation;
	private String time;
	private String pages;
	
	public BookPublication() {
	}

	public BookPublication(String paperTitle, User author,
			String publicationChannel, int year, String bookName, String publisherLocation,
			String time, String pages) {
		super(paperTitle, author, publicationChannel, year);
		this.bookName = bookName;
		this.publisherLocation = publisherLocation;
		this.time = time;
		this.pages = pages;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisherLocation() {
		return publisherLocation;
	}

	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "BookPublication [bookName=" + bookName + ", publisherLocation="
				+ publisherLocation + ", time=" + time + ", pages=" + pages
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
