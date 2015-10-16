// @SOURCE:/Users/mingqi/git/climate-service/conf/routes
// @HASH:4ba341718eee43fdccd52b441b56ce7f19fa885b
// @DATE:Wed Oct 14 21:51:48 PDT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_home0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_home0_invoker = createInvoker(
controllers.Application.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login1_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
private[this] lazy val controllers_Application_authenticate3_invoker = createInvoker(
controllers.Application.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"GET", """""", Routes.prefix + """authenticate"""))
        

// @LINE:10
private[this] lazy val controllers_Application_signup4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signup4_invoker = createInvoker(
controllers.Application.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:11
private[this] lazy val controllers_Application_createNewUser5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewUser"))))
private[this] lazy val controllers_Application_createNewUser5_invoker = createInvoker(
controllers.Application.createNewUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createNewUser", Nil,"GET", """""", Routes.prefix + """createNewUser"""))
        

// @LINE:12
private[this] lazy val controllers_Application_createSuccess6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createSuccess"))))
private[this] lazy val controllers_Application_createSuccess6_invoker = createInvoker(
controllers.Application.createSuccess(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createSuccess", Nil,"GET", """""", Routes.prefix + """createSuccess"""))
        

// @LINE:13
private[this] lazy val controllers_Application_isEmailExisted7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("isEmailExisted"))))
private[this] lazy val controllers_Application_isEmailExisted7_invoker = createInvoker(
controllers.Application.isEmailExisted(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "isEmailExisted", Nil,"POST", """""", Routes.prefix + """isEmailExisted"""))
        

// @LINE:16
private[this] lazy val controllers_ClimateServiceController_showAllClimateServices8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/allServices"))))
private[this] lazy val controllers_ClimateServiceController_showAllClimateServices8_invoker = createInvoker(
controllers.ClimateServiceController.showAllClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "showAllClimateServices", Nil,"GET", """ Climate Service""", Routes.prefix + """climateService/allServices"""))
        

// @LINE:17
private[this] lazy val controllers_ClimateServiceController_addClimateService9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/add"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService9_invoker = createInvoker(
controllers.ClimateServiceController.addClimateService(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/add"""))
        

// @LINE:18
private[this] lazy val controllers_ClimateServiceController_addAClimateService10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addAClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addAClimateService10_invoker = createInvoker(
controllers.ClimateServiceController.addAClimateService(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAClimateService", Nil,"GET", """""", Routes.prefix + """climateService/addAClimateService"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_passPageStr11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/savePage"))))
private[this] lazy val controllers_ClimateServiceController_passPageStr11_invoker = createInvoker(
controllers.ClimateServiceController.passPageStr(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "passPageStr", Nil,"POST", """""", Routes.prefix + """climateService/savePage"""))
        

// @LINE:20
private[this] lazy val controllers_ClimateServiceController_serviceModels12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/html/climateService/serviceModels"))))
private[this] lazy val controllers_ClimateServiceController_serviceModels12_invoker = createInvoker(
controllers.ClimateServiceController.serviceModels(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Nil,"POST", """""", Routes.prefix + """assets/html/climateService/serviceModels"""))
        

// @LINE:21
private[this] lazy val controllers_ClimateServiceController_serviceModels13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/serviceModels"))))
private[this] lazy val controllers_ClimateServiceController_serviceModels13_invoker = createInvoker(
controllers.ClimateServiceController.serviceModels(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Nil,"POST", """""", Routes.prefix + """climateService/serviceModels"""))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_ruleEngineData14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/ruleEngineData"))))
private[this] lazy val controllers_ClimateServiceController_ruleEngineData14_invoker = createInvoker(
controllers.ClimateServiceController.ruleEngineData(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "ruleEngineData", Nil,"POST", """""", Routes.prefix + """climateService/ruleEngineData"""))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_mostPopularServices15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostPopularServices"))))
private[this] lazy val controllers_ClimateServiceController_mostPopularServices15_invoker = createInvoker(
controllers.ClimateServiceController.mostPopularServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostPopularServices", Nil,"GET", """""", Routes.prefix + """climateService/mostPopularServices"""))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostRecentlyUsedClimateServices"))))
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices16_invoker = createInvoker(
controllers.ClimateServiceController.mostRecentlyUsedClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climateService/mostRecentlyUsedClimateServices"""))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/mostRecentlyAddedClimateServices"))))
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices17_invoker = createInvoker(
controllers.ClimateServiceController.mostRecentlyAddedClimateServices(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climateService/mostRecentlyAddedClimateServices"""))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_replaceFile18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/replaceFile"))))
private[this] lazy val controllers_ClimateServiceController_replaceFile18_invoker = createInvoker(
controllers.ClimateServiceController.replaceFile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "replaceFile", Nil,"POST", """replace page""", Routes.prefix + """climateService/replaceFile"""))
        

// @LINE:33
private[this] lazy val controllers_ServiceExecutionLogController_getServiceLog19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_getServiceLog19_invoker = createInvoker(
controllers.ServiceExecutionLogController.getServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceLog", Nil,"GET", """ Service Execution Log""", Routes.prefix + """serviceLog"""))
        

// @LINE:34
private[this] lazy val controllers_ServiceExecutionLogController_searchServiceLog20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchServiceLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_searchServiceLog20_invoker = createInvoker(
controllers.ServiceExecutionLogController.searchServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "searchServiceLog", Nil,"GET", """""", Routes.prefix + """searchServiceLog"""))
        

// @LINE:35
private[this] lazy val controllers_ServiceExecutionLogController_getSearchServiceLog21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchServiceLogResult"))))
private[this] lazy val controllers_ServiceExecutionLogController_getSearchServiceLog21_invoker = createInvoker(
controllers.ServiceExecutionLogController.getSearchServiceLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getSearchServiceLog", Nil,"GET", """""", Routes.prefix + """searchServiceLogResult"""))
        

// @LINE:36
private[this] lazy val controllers_ServiceExecutionLogController_getConfigurationByConfId22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getConfigurationByConfId"))))
private[this] lazy val controllers_ServiceExecutionLogController_getConfigurationByConfId22_invoker = createInvoker(
controllers.ServiceExecutionLogController.getConfigurationByConfId(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getConfigurationByConfId", Nil,"GET", """""", Routes.prefix + """getConfigurationByConfId"""))
        

// @LINE:39
private[this] lazy val controllers_DatasetController_showAllDatasets23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/allDatasets"))))
private[this] lazy val controllers_DatasetController_showAllDatasets23_invoker = createInvoker(
controllers.DatasetController.showAllDatasets(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "showAllDatasets", Nil,"GET", """ Dataset""", Routes.prefix + """dataSet/allDatasets"""))
        

// @LINE:40
private[this] lazy val controllers_DatasetController_searchDataset24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/searchDataSet"))))
private[this] lazy val controllers_DatasetController_searchDataset24_invoker = createInvoker(
controllers.DatasetController.searchDataset(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """dataSet/searchDataSet"""))
        

// @LINE:41
private[this] lazy val controllers_DatasetController_getSearchResult25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataSet/getSearchResult"))))
private[this] lazy val controllers_DatasetController_getSearchResult25_invoker = createInvoker(
controllers.DatasetController.getSearchResult(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """dataSet/getSearchResult"""))
        

// @LINE:44
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/allDatasetLogs"))))
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs26_invoker = createInvoker(
controllers.DatasetLogController.getAllDatasetLogs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Nil,"GET", """ Dataset Log""", Routes.prefix + """datasetLog/allDatasetLogs"""))
        

// @LINE:47
private[this] lazy val controllers_AnalyticsController_getRecommend27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogRecommend"))))
private[this] lazy val controllers_AnalyticsController_getRecommend27_invoker = createInvoker(
controllers.AnalyticsController.getRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRecommend", Nil,"GET", """ Analytics""", Routes.prefix + """serviceLogRecommend"""))
        

// @LINE:48
private[this] lazy val controllers_AnalyticsController_getDatasetRecommend28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetRecommend"))))
private[this] lazy val controllers_AnalyticsController_getDatasetRecommend28_invoker = createInvoker(
controllers.AnalyticsController.getDatasetRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getDatasetRecommend", Nil,"GET", """""", Routes.prefix + """datasetRecommend"""))
        

// @LINE:49
private[this] lazy val controllers_AnalyticsController_getScientistRecommend29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profileRecommend"))))
private[this] lazy val controllers_AnalyticsController_getScientistRecommend29_invoker = createInvoker(
controllers.AnalyticsController.getScientistRecommend(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getScientistRecommend", Nil,"GET", """""", Routes.prefix + """profileRecommend"""))
        

// @LINE:50
private[this] lazy val controllers_AnalyticsController_getLogGraph30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceLogGraph"))))
private[this] lazy val controllers_AnalyticsController_getLogGraph30_invoker = createInvoker(
controllers.AnalyticsController.getLogGraph(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getLogGraph", Nil,"GET", """""", Routes.prefix + """serviceLogGraph"""))
        

// @LINE:51
private[this] lazy val controllers_AnalyticsController_getSearchAndGenerateWorkflow31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchAndGenerateWorkflow"))))
private[this] lazy val controllers_AnalyticsController_getSearchAndGenerateWorkflow31_invoker = createInvoker(
controllers.AnalyticsController.getSearchAndGenerateWorkflow(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSearchAndGenerateWorkflow", Nil,"GET", """""", Routes.prefix + """searchAndGenerateWorkflow"""))
        

// @LINE:54
private[this] lazy val controllers_UsersController_getAllUsers32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scientist/allUsers"))))
private[this] lazy val controllers_UsersController_getAllUsers32_invoker = createInvoker(
controllers.UsersController.getAllUsers(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getAllUsers", Nil,"GET", """ Users""", Routes.prefix + """scientist/allUsers"""))
        

// @LINE:55
private[this] lazy val controllers_UsersController_searchUser33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scientist/searchUser"))))
private[this] lazy val controllers_UsersController_searchUser33_invoker = createInvoker(
controllers.UsersController.searchUser(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "searchUser", Nil,"GET", """""", Routes.prefix + """scientist/searchUser"""))
        

// @LINE:58
private[this] lazy val controllers_Assets_at34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at34_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:62
private[this] lazy val controllers_AboutController_aboutUs35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutUs"))))
private[this] lazy val controllers_AboutController_aboutUs35_invoker = createInvoker(
controllers.AboutController.aboutUs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutUs", Nil,"GET", """ About""", Routes.prefix + """aboutUs"""))
        

// @LINE:63
private[this] lazy val controllers_AboutController_aboutProject36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
private[this] lazy val controllers_AboutController_aboutProject36_invoker = createInvoker(
controllers.AboutController.aboutProject(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
        

// @LINE:64
private[this] lazy val controllers_AboutController_tutorial37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tutorial"))))
private[this] lazy val controllers_AboutController_tutorial37_invoker = createInvoker(
controllers.AboutController.tutorial(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "tutorial", Nil,"GET", """""", Routes.prefix + """tutorial"""))
        

// @LINE:67
private[this] lazy val controllers_BugReportController_reports38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
private[this] lazy val controllers_BugReportController_reports38_invoker = createInvoker(
controllers.BugReportController.reports(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
        

// @LINE:68
private[this] lazy val controllers_BugReportController_newReport39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
private[this] lazy val controllers_BugReportController_newReport39_invoker = createInvoker(
controllers.BugReportController.newReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
        

// @LINE:69
private[this] lazy val controllers_BugReportController_list40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
private[this] lazy val controllers_BugReportController_list40_invoker = createInvoker(
controllers.BugReportController.list(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
        

// @LINE:70
private[this] lazy val controllers_BugReportController_deleteReport41_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
private[this] lazy val controllers_BugReportController_deleteReport41_invoker = createInvoker(
controllers.BugReportController.deleteReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
        

// @LINE:71
private[this] lazy val controllers_BugReportController_solveReport42_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
private[this] lazy val controllers_BugReportController_solveReport42_invoker = createInvoker(
controllers.BugReportController.solveReport(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
        

// @LINE:74
private[this] lazy val controllers_ClimateServiceController_addAllParameters43_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addAllParameters"))))
private[this] lazy val controllers_ClimateServiceController_addAllParameters43_invoker = createInvoker(
controllers.ClimateServiceController.addAllParameters(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAllParameters", Nil,"POST", """ AddParameters""", Routes.prefix + """climateService/addAllParameters"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewUser""","""controllers.Application.createNewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createSuccess""","""controllers.Application.createSuccess()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """isEmailExisted""","""controllers.Application.isEmailExisted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/allServices""","""controllers.ClimateServiceController.showAllClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/add""","""controllers.ClimateServiceController.addClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addAClimateService""","""controllers.ClimateServiceController.addAClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/savePage""","""controllers.ClimateServiceController.passPageStr()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/html/climateService/serviceModels""","""controllers.ClimateServiceController.serviceModels()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/serviceModels""","""controllers.ClimateServiceController.serviceModels()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/ruleEngineData""","""controllers.ClimateServiceController.ruleEngineData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostPopularServices""","""controllers.ClimateServiceController.mostPopularServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/replaceFile""","""controllers.ClimateServiceController.replaceFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLog""","""controllers.ServiceExecutionLogController.getServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchServiceLog""","""controllers.ServiceExecutionLogController.searchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchServiceLogResult""","""controllers.ServiceExecutionLogController.getSearchServiceLog()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getConfigurationByConfId""","""controllers.ServiceExecutionLogController.getConfigurationByConfId()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/allDatasets""","""controllers.DatasetController.showAllDatasets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataSet/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/allDatasetLogs""","""controllers.DatasetLogController.getAllDatasetLogs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogRecommend""","""controllers.AnalyticsController.getRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetRecommend""","""controllers.AnalyticsController.getDatasetRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profileRecommend""","""controllers.AnalyticsController.getScientistRecommend()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceLogGraph""","""controllers.AnalyticsController.getLogGraph()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchAndGenerateWorkflow""","""controllers.AnalyticsController.getSearchAndGenerateWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scientist/allUsers""","""controllers.UsersController.getAllUsers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scientist/searchUser""","""controllers.UsersController.searchUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutUs""","""controllers.AboutController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tutorial""","""controllers.AboutController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addAllParameters""","""controllers.ClimateServiceController.addAllParameters()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_home0_route(params) => {
   call { 
        controllers_Application_home0_invoker.call(controllers.Application.home())
   }
}
        

// @LINE:7
case controllers_Application_login1_route(params) => {
   call { 
        controllers_Application_login1_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:8
case controllers_Application_logout2_route(params) => {
   call { 
        controllers_Application_logout2_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:9
case controllers_Application_authenticate3_route(params) => {
   call { 
        controllers_Application_authenticate3_invoker.call(controllers.Application.authenticate())
   }
}
        

// @LINE:10
case controllers_Application_signup4_route(params) => {
   call { 
        controllers_Application_signup4_invoker.call(controllers.Application.signup())
   }
}
        

// @LINE:11
case controllers_Application_createNewUser5_route(params) => {
   call { 
        controllers_Application_createNewUser5_invoker.call(controllers.Application.createNewUser())
   }
}
        

// @LINE:12
case controllers_Application_createSuccess6_route(params) => {
   call { 
        controllers_Application_createSuccess6_invoker.call(controllers.Application.createSuccess())
   }
}
        

// @LINE:13
case controllers_Application_isEmailExisted7_route(params) => {
   call { 
        controllers_Application_isEmailExisted7_invoker.call(controllers.Application.isEmailExisted())
   }
}
        

// @LINE:16
case controllers_ClimateServiceController_showAllClimateServices8_route(params) => {
   call { 
        controllers_ClimateServiceController_showAllClimateServices8_invoker.call(controllers.ClimateServiceController.showAllClimateServices())
   }
}
        

// @LINE:17
case controllers_ClimateServiceController_addClimateService9_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService9_invoker.call(controllers.ClimateServiceController.addClimateService())
   }
}
        

// @LINE:18
case controllers_ClimateServiceController_addAClimateService10_route(params) => {
   call { 
        controllers_ClimateServiceController_addAClimateService10_invoker.call(controllers.ClimateServiceController.addAClimateService())
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_passPageStr11_route(params) => {
   call { 
        controllers_ClimateServiceController_passPageStr11_invoker.call(controllers.ClimateServiceController.passPageStr())
   }
}
        

// @LINE:20
case controllers_ClimateServiceController_serviceModels12_route(params) => {
   call { 
        controllers_ClimateServiceController_serviceModels12_invoker.call(controllers.ClimateServiceController.serviceModels())
   }
}
        

// @LINE:21
case controllers_ClimateServiceController_serviceModels13_route(params) => {
   call { 
        controllers_ClimateServiceController_serviceModels13_invoker.call(controllers.ClimateServiceController.serviceModels())
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_ruleEngineData14_route(params) => {
   call { 
        controllers_ClimateServiceController_ruleEngineData14_invoker.call(controllers.ClimateServiceController.ruleEngineData())
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_mostPopularServices15_route(params) => {
   call { 
        controllers_ClimateServiceController_mostPopularServices15_invoker.call(controllers.ClimateServiceController.mostPopularServices())
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices16_route(params) => {
   call { 
        controllers_ClimateServiceController_mostRecentlyUsedClimateServices16_invoker.call(controllers.ClimateServiceController.mostRecentlyUsedClimateServices())
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices17_route(params) => {
   call { 
        controllers_ClimateServiceController_mostRecentlyAddedClimateServices17_invoker.call(controllers.ClimateServiceController.mostRecentlyAddedClimateServices())
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_replaceFile18_route(params) => {
   call { 
        controllers_ClimateServiceController_replaceFile18_invoker.call(controllers.ClimateServiceController.replaceFile())
   }
}
        

// @LINE:33
case controllers_ServiceExecutionLogController_getServiceLog19_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getServiceLog19_invoker.call(controllers.ServiceExecutionLogController.getServiceLog())
   }
}
        

// @LINE:34
case controllers_ServiceExecutionLogController_searchServiceLog20_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_searchServiceLog20_invoker.call(controllers.ServiceExecutionLogController.searchServiceLog())
   }
}
        

// @LINE:35
case controllers_ServiceExecutionLogController_getSearchServiceLog21_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getSearchServiceLog21_invoker.call(controllers.ServiceExecutionLogController.getSearchServiceLog())
   }
}
        

// @LINE:36
case controllers_ServiceExecutionLogController_getConfigurationByConfId22_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_getConfigurationByConfId22_invoker.call(controllers.ServiceExecutionLogController.getConfigurationByConfId())
   }
}
        

// @LINE:39
case controllers_DatasetController_showAllDatasets23_route(params) => {
   call { 
        controllers_DatasetController_showAllDatasets23_invoker.call(controllers.DatasetController.showAllDatasets())
   }
}
        

// @LINE:40
case controllers_DatasetController_searchDataset24_route(params) => {
   call { 
        controllers_DatasetController_searchDataset24_invoker.call(controllers.DatasetController.searchDataset())
   }
}
        

// @LINE:41
case controllers_DatasetController_getSearchResult25_route(params) => {
   call { 
        controllers_DatasetController_getSearchResult25_invoker.call(controllers.DatasetController.getSearchResult())
   }
}
        

// @LINE:44
case controllers_DatasetLogController_getAllDatasetLogs26_route(params) => {
   call { 
        controllers_DatasetLogController_getAllDatasetLogs26_invoker.call(controllers.DatasetLogController.getAllDatasetLogs())
   }
}
        

// @LINE:47
case controllers_AnalyticsController_getRecommend27_route(params) => {
   call { 
        controllers_AnalyticsController_getRecommend27_invoker.call(controllers.AnalyticsController.getRecommend())
   }
}
        

// @LINE:48
case controllers_AnalyticsController_getDatasetRecommend28_route(params) => {
   call { 
        controllers_AnalyticsController_getDatasetRecommend28_invoker.call(controllers.AnalyticsController.getDatasetRecommend())
   }
}
        

// @LINE:49
case controllers_AnalyticsController_getScientistRecommend29_route(params) => {
   call { 
        controllers_AnalyticsController_getScientistRecommend29_invoker.call(controllers.AnalyticsController.getScientistRecommend())
   }
}
        

// @LINE:50
case controllers_AnalyticsController_getLogGraph30_route(params) => {
   call { 
        controllers_AnalyticsController_getLogGraph30_invoker.call(controllers.AnalyticsController.getLogGraph())
   }
}
        

// @LINE:51
case controllers_AnalyticsController_getSearchAndGenerateWorkflow31_route(params) => {
   call { 
        controllers_AnalyticsController_getSearchAndGenerateWorkflow31_invoker.call(controllers.AnalyticsController.getSearchAndGenerateWorkflow())
   }
}
        

// @LINE:54
case controllers_UsersController_getAllUsers32_route(params) => {
   call { 
        controllers_UsersController_getAllUsers32_invoker.call(controllers.UsersController.getAllUsers())
   }
}
        

// @LINE:55
case controllers_UsersController_searchUser33_route(params) => {
   call { 
        controllers_UsersController_searchUser33_invoker.call(controllers.UsersController.searchUser())
   }
}
        

// @LINE:58
case controllers_Assets_at34_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at34_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:62
case controllers_AboutController_aboutUs35_route(params) => {
   call { 
        controllers_AboutController_aboutUs35_invoker.call(controllers.AboutController.aboutUs())
   }
}
        

// @LINE:63
case controllers_AboutController_aboutProject36_route(params) => {
   call { 
        controllers_AboutController_aboutProject36_invoker.call(controllers.AboutController.aboutProject())
   }
}
        

// @LINE:64
case controllers_AboutController_tutorial37_route(params) => {
   call { 
        controllers_AboutController_tutorial37_invoker.call(controllers.AboutController.tutorial())
   }
}
        

// @LINE:67
case controllers_BugReportController_reports38_route(params) => {
   call { 
        controllers_BugReportController_reports38_invoker.call(controllers.BugReportController.reports())
   }
}
        

// @LINE:68
case controllers_BugReportController_newReport39_route(params) => {
   call { 
        controllers_BugReportController_newReport39_invoker.call(controllers.BugReportController.newReport())
   }
}
        

// @LINE:69
case controllers_BugReportController_list40_route(params) => {
   call { 
        controllers_BugReportController_list40_invoker.call(controllers.BugReportController.list())
   }
}
        

// @LINE:70
case controllers_BugReportController_deleteReport41_route(params) => {
   call { 
        controllers_BugReportController_deleteReport41_invoker.call(controllers.BugReportController.deleteReport())
   }
}
        

// @LINE:71
case controllers_BugReportController_solveReport42_route(params) => {
   call { 
        controllers_BugReportController_solveReport42_invoker.call(controllers.BugReportController.solveReport())
   }
}
        

// @LINE:74
case controllers_ClimateServiceController_addAllParameters43_route(params) => {
   call { 
        controllers_ClimateServiceController_addAllParameters43_invoker.call(controllers.ClimateServiceController.addAllParameters())
   }
}
        
}

}
     