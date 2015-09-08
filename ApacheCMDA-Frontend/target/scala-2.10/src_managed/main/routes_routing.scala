// @SOURCE:/Users/mingqi/git/ApacheCMDA-Frontend/conf/routes
// @HASH:eca2c99108c803652b52ba9b9ce3e1df5ff3a4fc
// @DATE:Fri Sep 04 16:33:43 PDT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_AccountController_getServiceLog2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLog"))))
        

// @LINE:11
private[this] lazy val controllers_AccountController_getSearchServiceLogOneDimension3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogResult"))))
        

// @LINE:12
private[this] lazy val controllers_AccountController_getSearchServiceLog4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogTimeResult"))))
        

// @LINE:13
private[this] lazy val controllers_AccountController_getSearchServiceLogForWorkflow5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogWorkflow"))))
        

// @LINE:14
private[this] lazy val controllers_AccountController_getRecommend6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogRecommend"))))
        

// @LINE:15
private[this] lazy val controllers_AccountController_getDatasetRecommend7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetRecommend"))))
        

// @LINE:16
private[this] lazy val controllers_AccountController_searchServiceLog8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchServiceLog"))))
        

// @LINE:17
private[this] lazy val controllers_AccountController_getLogGraph9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogGraph"))))
        

// @LINE:18
private[this] lazy val controllers_AccountController_getScientistRecommend10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profileRecommend"))))
        

// @LINE:19
private[this] lazy val controllers_AccountController_syncData11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("syncData"))))
        

// @LINE:20
private[this] lazy val controllers_AccountController_getSearchAndGenerateWorkflow12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchAndGenerateWorkflow"))))
        

// @LINE:21
private[this] lazy val controllers_AccountController_getJsonData13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("generateWorkflowGetData"))))
        

// @LINE:24
private[this] lazy val controllers_BugReportController_reports14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:25
private[this] lazy val controllers_BugReportController_newReport15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:26
private[this] lazy val controllers_BugReportController_list16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:27
private[this] lazy val controllers_BugReportController_deleteReport17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:28
private[this] lazy val controllers_BugReportController_solveReport18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:31
private[this] lazy val controllers_AboutusController_aboutUs19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:32
private[this] lazy val controllers_AboutusController_aboutProject20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:35
private[this] lazy val controllers_ClimateServiceController_home21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:36
private[this] lazy val controllers_ClimateServiceController_tutorial22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:37
private[this] lazy val controllers_ClimateServiceController_climateServices23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:38
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:40
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:41
private[this] lazy val controllers_ClimateServiceController_newClimateService27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:42
private[this] lazy val controllers_ClimateServiceController_deleteClimateService28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:43
private[this] lazy val controllers_ClimateServiceController_downloadClimateService29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:44
private[this] lazy val controllers_ClimateServiceController_editClimateService30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:45
private[this] lazy val controllers_ClimateServiceController_addClimateServices31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:46
private[this] lazy val controllers_ClimateServiceController_getConfigurationByConfId32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLog/conf"))))
        

// @LINE:47
private[this] lazy val controllers_ClimateServiceController_deleteServiceLog33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/serviceLog"))))
        

// @LINE:48
private[this] lazy val controllers_ClimateServiceController_oneService34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:51
private[this] lazy val controllers_DatasetController_datasetList35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:52
private[this] lazy val controllers_DatasetController_searchDataset36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:53
private[this] lazy val controllers_DatasetController_getSearchResult37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:56
private[this] lazy val controllers_Assets_at38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLog""","""controllers.AccountController.getServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogResult""","""controllers.AccountController.getSearchServiceLogOneDimension()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogTimeResult""","""controllers.AccountController.getSearchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogWorkflow""","""controllers.AccountController.getSearchServiceLogForWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogRecommend""","""controllers.AccountController.getRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetRecommend""","""controllers.AccountController.getDatasetRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchServiceLog""","""controllers.AccountController.searchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogGraph""","""controllers.AccountController.getLogGraph()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profileRecommend""","""controllers.AccountController.getScientistRecommend()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """syncData""","""controllers.AccountController.syncData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchAndGenerateWorkflow""","""controllers.AccountController.getSearchAndGenerateWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """generateWorkflowGetData""","""controllers.AccountController.getJsonData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLog/conf""","""controllers.ClimateServiceController.getConfigurationByConfId()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/serviceLog""","""controllers.ClimateServiceController.deleteServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_AccountController_getServiceLog2(params) => {
   call { 
        invokeHandler(controllers.AccountController.getServiceLog(), HandlerDef(this, "controllers.AccountController", "getServiceLog", Nil,"GET", """""", Routes.prefix + """serviceLog"""))
   }
}
        

// @LINE:11
case controllers_AccountController_getSearchServiceLogOneDimension3(params) => {
   call { 
        invokeHandler(controllers.AccountController.getSearchServiceLogOneDimension(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLogOneDimension", Nil,"GET", """""", Routes.prefix + """serviceLogResult"""))
   }
}
        

// @LINE:12
case controllers_AccountController_getSearchServiceLog4(params) => {
   call { 
        invokeHandler(controllers.AccountController.getSearchServiceLog(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLog", Nil,"GET", """""", Routes.prefix + """serviceLogTimeResult"""))
   }
}
        

// @LINE:13
case controllers_AccountController_getSearchServiceLogForWorkflow5(params) => {
   call { 
        invokeHandler(controllers.AccountController.getSearchServiceLogForWorkflow(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLogForWorkflow", Nil,"GET", """""", Routes.prefix + """serviceLogWorkflow"""))
   }
}
        

// @LINE:14
case controllers_AccountController_getRecommend6(params) => {
   call { 
        invokeHandler(controllers.AccountController.getRecommend(), HandlerDef(this, "controllers.AccountController", "getRecommend", Nil,"GET", """""", Routes.prefix + """serviceLogRecommend"""))
   }
}
        

// @LINE:15
case controllers_AccountController_getDatasetRecommend7(params) => {
   call { 
        invokeHandler(controllers.AccountController.getDatasetRecommend(), HandlerDef(this, "controllers.AccountController", "getDatasetRecommend", Nil,"GET", """""", Routes.prefix + """datasetRecommend"""))
   }
}
        

// @LINE:16
case controllers_AccountController_searchServiceLog8(params) => {
   call { 
        invokeHandler(controllers.AccountController.searchServiceLog(), HandlerDef(this, "controllers.AccountController", "searchServiceLog", Nil,"GET", """""", Routes.prefix + """searchServiceLog"""))
   }
}
        

// @LINE:17
case controllers_AccountController_getLogGraph9(params) => {
   call { 
        invokeHandler(controllers.AccountController.getLogGraph(), HandlerDef(this, "controllers.AccountController", "getLogGraph", Nil,"GET", """""", Routes.prefix + """serviceLogGraph"""))
   }
}
        

// @LINE:18
case controllers_AccountController_getScientistRecommend10(params) => {
   call { 
        invokeHandler(controllers.AccountController.getScientistRecommend(), HandlerDef(this, "controllers.AccountController", "getScientistRecommend", Nil,"GET", """""", Routes.prefix + """profileRecommend"""))
   }
}
        

// @LINE:19
case controllers_AccountController_syncData11(params) => {
   call { 
        invokeHandler(controllers.AccountController.syncData(), HandlerDef(this, "controllers.AccountController", "syncData", Nil,"POST", """""", Routes.prefix + """syncData"""))
   }
}
        

// @LINE:20
case controllers_AccountController_getSearchAndGenerateWorkflow12(params) => {
   call { 
        invokeHandler(controllers.AccountController.getSearchAndGenerateWorkflow(), HandlerDef(this, "controllers.AccountController", "getSearchAndGenerateWorkflow", Nil,"GET", """""", Routes.prefix + """searchAndGenerateWorkflow"""))
   }
}
        

// @LINE:21
case controllers_AccountController_getJsonData13(params) => {
   call { 
        invokeHandler(controllers.AccountController.getJsonData(), HandlerDef(this, "controllers.AccountController", "getJsonData", Nil,"GET", """""", Routes.prefix + """generateWorkflowGetData"""))
   }
}
        

// @LINE:24
case controllers_BugReportController_reports14(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:25
case controllers_BugReportController_newReport15(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:26
case controllers_BugReportController_list16(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:27
case controllers_BugReportController_deleteReport17(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:28
case controllers_BugReportController_solveReport18(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:31
case controllers_AboutusController_aboutUs19(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:32
case controllers_AboutusController_aboutProject20(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:35
case controllers_ClimateServiceController_home21(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:36
case controllers_ClimateServiceController_tutorial22(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:37
case controllers_ClimateServiceController_climateServices23(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:38
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices24(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:39
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices25(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:40
case controllers_ClimateServiceController_mostPopularClimateServices26(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:41
case controllers_ClimateServiceController_newClimateService27(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:42
case controllers_ClimateServiceController_deleteClimateService28(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:43
case controllers_ClimateServiceController_downloadClimateService29(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:44
case controllers_ClimateServiceController_editClimateService30(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:45
case controllers_ClimateServiceController_addClimateServices31(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:46
case controllers_ClimateServiceController_getConfigurationByConfId32(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.getConfigurationByConfId(), HandlerDef(this, "controllers.ClimateServiceController", "getConfigurationByConfId", Nil,"GET", """""", Routes.prefix + """serviceLog/conf"""))
   }
}
        

// @LINE:47
case controllers_ClimateServiceController_deleteServiceLog33(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteServiceLog(), HandlerDef(this, "controllers.ClimateServiceController", "deleteServiceLog", Nil,"POST", """""", Routes.prefix + """climate/delete/serviceLog"""))
   }
}
        

// @LINE:48
case controllers_ClimateServiceController_oneService34(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:51
case controllers_DatasetController_datasetList35(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:52
case controllers_DatasetController_searchDataset36(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:53
case controllers_DatasetController_getSearchResult37(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:56
case controllers_Assets_at38(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     