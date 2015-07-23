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
package util;

public class DBHandler{
    static final String JDBC_DRIVER = "org.h2.Driver"; //org.h2.Driver
    static final String DB_URL = "jdbc:h2:~/mytest";
    
    static final String USER = "sa";
    static final String PASS = "";
    
	public DBHandler(){
		
	}
}