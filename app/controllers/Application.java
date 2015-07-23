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
package controllers;

import java.util.Iterator;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;

public class Application extends Controller {
	//final static Form<SensorType> sensorTypeForm = Form.form(SensorType.class);
	
    public static Result index() {
        return ok(index.render());
    }

    // -- Authentication
    public static class Login {
        
        public String email;
        public String password;
        
        public String validate() {
            //if(User.authenticate(email, password) == null) 
//            if(!email.equals("admin@admin.com"))
//                return "Invalid user or password";
            
            return null;
        }
        
    }

    /** Login page. */
    public static Result login() {
        return ok( login.render(form(Login.class)) );
    }
    
    /**  Handle login form submission. */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors())
            return badRequest(login.render(loginForm));
        else {
            session("email", loginForm.get().email);
            return redirect( routes.Application.index() );
        }
    }

    /** Logout and clean the session. */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect( routes.Application.index() );
    }
    
    public static void flashMsg(JsonNode jsonNode){
		Iterator<Entry<String, JsonNode>> it = jsonNode.fields();
		while (it.hasNext()) {
			Entry<String, JsonNode> field = it.next();
			flash(field.getKey(),field.getValue().asText());	
		}
    }
}
