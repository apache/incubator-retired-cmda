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

import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;
import play.libs.Json;
import com.google.gson.JsonObject;
import controllers.Application;
public class EstimatorGetValues {

/*
 *Declaration of variables
 * */
	static JsonObject retFormValues = new JsonObject();


		public static JsonObject getMode(Map<String, String[]> inputForm, String mode){
	        
			
			JsonObject retJson = new JsonObject();
			//Checking if it is for submission
			if(mode.equals("submit")){

				retJson = getSubmit(inputForm);
			}

			else if(mode.equals("update")){
				retJson = getUpdate(inputForm);
			}
			else if(mode.equals("delete")){
				retJson = getDelete(inputForm);
			}
		return retJson;
		
		}
		/*
		 *This method is used to retrieve the values of the submit form
		 * */
		public static JsonObject getSubmit(Map<String, String[]> subForm){
			
		String userNameField = subForm.get("userNameField")[0];
		String passwordField = subForm.get("passwordField")[0];
		String fNameField = subForm.get("fNameField")[0];
		String lNameField = subForm.get("lNameField")[0];
		String mNameField = subForm.get("mNameField")[0];
		String affliationField = subForm.get("affliationField")[0];
		String emailField = subForm.get("emailField")[0];
		String rAreaField = subForm.get("rAreaField")[0];
		
			try {

			retFormValues.addProperty("userName", userNameField);
			retFormValues.addProperty("password", passwordField);
			retFormValues.addProperty("firstName", fNameField);
			retFormValues.addProperty("lastName", lNameField);
			retFormValues.addProperty("middleName", mNameField);
			retFormValues.addProperty("affiliation", affliationField);
			retFormValues.addProperty("email", emailField);
			retFormValues.addProperty("researchArea", rAreaField);
//			retFormValues.addProperty("goal", goalField);
		}

		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return retFormValues;
		
}
		public static JsonObject getUpdate(Map<String, String[]> updateForm){
			
		String userNameField = updateForm.get("userNameField")[0];
		String passwordField = updateForm.get("passwordField")[0];
		String fNameField = updateForm.get("fNameField")[0];
		String lNameField = updateForm.get("lNameField")[0];
		String mNameField = updateForm.get("mNameField")[0];
		String affliationField = updateForm.get("affliationField")[0];
		String emailField = updateForm.get("emailField")[0];
		String rAreaField = updateForm.get("rAreaField")[0];
		
			try {

			retFormValues.addProperty("userName", userNameField);
			retFormValues.addProperty("password", passwordField);
			retFormValues.addProperty("firstName", fNameField);
			retFormValues.addProperty("lastName", lNameField);
			retFormValues.addProperty("middleName", mNameField);
			retFormValues.addProperty("affiliation", affliationField);
			retFormValues.addProperty("email", emailField);
			retFormValues.addProperty("researchArea", rAreaField);		
		}

		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return retFormValues;

		
}	
		public static JsonObject getDelete(Map<String, String[]> delForm){
			
		String userNameField = delForm.get("userNameField")[0];
		String passwordField = delForm.get("passwordField")[0];
		
		
			try {

			retFormValues.addProperty("userName", userNameField);
			retFormValues.addProperty("password", passwordField);			
				
		}

		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return retFormValues;
}
}

