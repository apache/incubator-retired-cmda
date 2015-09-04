package controllers;

import models.BugReport;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;
import java.util.*;

public class BugReportController extends Controller {
	final static Form<BugReport> bugReportForm = Form.form(BugReport.class);

	@play.db.jpa.Transactional
	public static Result reports() {
		return ok(bugReporting.render(bugReportForm));
	}

	@play.db.jpa.Transactional
	public static Result newReport() {
		Form<BugReport> filledForm = bugReportForm.bindFromRequest();
		BugReport report = new BugReport();
		
		try {
			report.setTitle(filledForm.get().getTitle());
			report.setName(filledForm.get().getName());
			report.setEmail(filledForm.get().getEmail());
			report.setOrganization(filledForm.get().getOrganization());
			report.setDescription(filledForm.get().getDescription());
			report.setSolved(0);
			report.save();
			return redirect(routes.BugReportController.list());
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}	
		return ok(bugReporting.render(filledForm));
	}

	@play.db.jpa.Transactional
	public static Result list() {
		BugReport bugReport = new BugReport();
		List<Object[]> list = BugReport.getAll();
		LinkedList<BugReport> bugList = new LinkedList<BugReport>();

		for (Object[] e : list) {
			BugReport bug = new BugReport();
			bug.setId((Integer)e[0]);
			bug.setTitle(e[1].toString());
			bug.setName(e[2].toString());
			bug.setEmail(e[3].toString());
			bug.setOrganization(e[4].toString());
			bug.setDescription(e[5].toString());
			bug.setSolved((Byte)e[6]);
			bugList.add(bug);
		}
		return ok(bugs.render(bugList));
	}
	
	@play.db.jpa.Transactional
	public static Result deleteReport() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		
		try {
			int id = Integer.valueOf(df.field("idHolder").value());

			if(BugReport.delete(id)){
				Application.flashMsg(APICall.createResponse(ResponseType.SUCCESS));
			}else {
				Application.flashMsg(APICall.createResponse(ResponseType.DELETEERROR));
			}
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return redirect(routes.BugReportController.list());
	}
	
	@play.db.jpa.Transactional
	public static Result solveReport() {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		
		try {
			int id = Integer.valueOf(df.field("idHolder").value());

			if(BugReport.solve(id)){
				Application.flashMsg(APICall.createResponse(ResponseType.SUCCESS));
			}else {
				Application.flashMsg(APICall.createResponse(ResponseType.RESOLVEERROR));
			}
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return redirect(routes.BugReportController.list());
	}
}