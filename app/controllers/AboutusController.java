package controllers;

import play.mvc.*;
import views.html.climate.*;

public class AboutusController extends Controller {
		
    public static Result aboutUs() {
    	return ok(aboutus.render("test"));
    }
    
    public static Result aboutProject(){
    	return ok(aboutProject.render("test"));
    }
}