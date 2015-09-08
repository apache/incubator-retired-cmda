// @SOURCE:/Users/mingqi/git/ApacheCMDA-Backend/conf/routes
// @HASH:73b57dec301e9888106f2ecbbfcaca49095b5715
// @DATE:Wed Sep 02 14:54:15 PDT 2015


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

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:10
private[this] lazy val controllers_ClimateServiceController_getClimateService0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ClimateServiceController_getClimateService0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]),"GET", """ Climate Service""", Routes.prefix + """climateService/getClimateService/$name<[^/]+>/json"""))
        

// @LINE:11
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """climateService/getClimateService/id/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllClimateServices/json"""))
        

// @LINE:13
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByCreateTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json"""))
        

// @LINE:14
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"""))
        

// @LINE:15
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostUsedClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostUsedClimateServices/json"""))
        

// @LINE:16
private[this] lazy val controllers_ClimateServiceController_addClimateService6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/addClimateService"""))
        

// @LINE:17
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllServiceEntries/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllServiceEntries/json"""))
        

// @LINE:18
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addServiceEntry"))))
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Nil,"POST", """""", Routes.prefix + """climateService/addServiceEntry"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/id/$id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/name/$oldName<[^/]+>"""))
        

// @LINE:21
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/id/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/name/$name<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_savePage13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/savePage"))))
private[this] lazy val controllers_ClimateServiceController_savePage13_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "savePage", Nil,"POST", """ Save Climate Service Page""", Routes.prefix + """climateService/savePage"""))
        

// @LINE:28
private[this] lazy val controllers_BugReportController_getBugReport14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_getBugReport14_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getBugReport", Seq(classOf[Long], classOf[String]),"GET", """ Bug Report""", Routes.prefix + """bugReport/getBugReport/id/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_BugReportController_getAllBugReports15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllBugReports15_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllBugReports/json"""))
        

// @LINE:30
private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllUnsolvedBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports16_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllUnsolvedBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllUnsolvedBugReports/json"""))
        

// @LINE:31
private[this] lazy val controllers_BugReportController_getAllSolvedBugReports17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/getAllSolvedBugReports/json"))))
private[this] lazy val controllers_BugReportController_getAllSolvedBugReports17_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllSolvedBugReports", Nil,"GET", """""", Routes.prefix + """bugReport/getAllSolvedBugReports/json"""))
        

// @LINE:32
private[this] lazy val controllers_BugReportController_addBugReport18_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/addBugReport"))))
private[this] lazy val controllers_BugReportController_addBugReport18_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "addBugReport", Nil,"POST", """""", Routes.prefix + """bugReport/addBugReport"""))
        

// @LINE:33
private[this] lazy val controllers_BugReportController_updateBugReportById19_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/updateBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_updateBugReportById19_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "updateBugReportById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """bugReport/updateBugReport/id/$id<[^/]+>"""))
        

// @LINE:34
private[this] lazy val controllers_BugReportController_deleteBugReport20_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugReport/deleteBugReport/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BugReportController_deleteBugReport20_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteBugReport", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """bugReport/deleteBugReport/id/$id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfiguration21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/getServiceConfiguration/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfiguration21_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfiguration", Seq(classOf[Long], classOf[String]),"GET", """ Service Configuration""", Routes.prefix + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json"""))
        

// @LINE:38
private[this] lazy val controllers_ServiceConfigurationController_addServiceConfiguration22_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/addServiceConfiguration"))))
private[this] lazy val controllers_ServiceConfigurationController_addServiceConfiguration22_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "addServiceConfiguration", Nil,"POST", """""", Routes.prefix + """serviceConfiguration/addServiceConfiguration"""))
        

// @LINE:39
private[this] lazy val controllers_ServiceConfigurationController_updateServiceConfigurationById23_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/updateServiceConfiguration/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationController_updateServiceConfigurationById23_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "updateServiceConfigurationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_ServiceConfigurationController_deleteServiceConfiguration24_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/deleteServiceConfiguration/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationController_deleteServiceConfiguration24_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "deleteServiceConfiguration", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfigurationsByUser25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfiguration/getAllServiceConfigurationsByUserId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ServiceConfigurationController_getServiceConfigurationsByUser25_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfigurationsByUser", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json"""))
        

// @LINE:44
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemById26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemById26_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemById", Seq(classOf[Long]),"GET", """ Service Configuration Item""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemByServiceConfig/"),DynamicPart("serviceConfigId", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig27_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemsInServiceConfig", Seq(classOf[Long]),"GET", """""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/serviceConfigurationItemByParamId/"),DynamicPart("paramId", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId28_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemByParameterId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>"""))
        

// @LINE:47
private[this] lazy val controllers_ServiceConfigurationItemController_addServiceConfigurationItem29_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/addServiceConfigurationItem"))))
private[this] lazy val controllers_ServiceConfigurationItemController_addServiceConfigurationItem29_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "addServiceConfigurationItem", Nil,"POST", """""", Routes.prefix + """serviceConfigurationItem/addServiceConfigurationItem"""))
        

// @LINE:48
private[this] lazy val controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById30_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/updateServiceConfigurationItem/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById30_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "updateServiceConfigurationItemById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>"""))
        

// @LINE:49
private[this] lazy val controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById31_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceConfigurationItem/deleteServiceConfigurationItemById/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById31_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "deleteServiceConfigurationItemById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_ServiceExecutionLogController_getAllServiceExecutionLogs32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/getAllServiceExecutionLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_getAllServiceExecutionLogs32_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getAllServiceExecutionLogs", Seq(classOf[String]),"GET", """ Service Execution Log""", Routes.prefix + """serviceExecutionLog/getAllServiceExecutionLog"""))
        

// @LINE:53
private[this] lazy val controllers_ServiceExecutionLogController_getServiceExecutionLog33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/getServiceExecutionLog/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_getServiceExecutionLog33_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceExecutionLog", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_ServiceExecutionLogController_addServiceExecutionLog34_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/addServiceExecutionLog"))))
private[this] lazy val controllers_ServiceExecutionLogController_addServiceExecutionLog34_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "addServiceExecutionLog", Nil,"POST", """""", Routes.prefix + """serviceExecutionLog/addServiceExecutionLog"""))
        

// @LINE:55
private[this] lazy val controllers_ServiceExecutionLogController_queryServiceExecutionLogs35_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/queryServiceExecutionLogs"))))
private[this] lazy val controllers_ServiceExecutionLogController_queryServiceExecutionLogs35_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryServiceExecutionLogs", Nil,"POST", """""", Routes.prefix + """serviceExecutionLog/queryServiceExecutionLogs"""))
        

// @LINE:56
private[this] lazy val controllers_ServiceExecutionLogController_updateServiceExecutionLog36_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/updateServiceExecutionLogs/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_updateServiceExecutionLog36_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "updateServiceExecutionLog", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>"""))
        

// @LINE:57
private[this] lazy val controllers_ServiceExecutionLogController_deleteServiceExecutionLog37_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceExecutionLog/deleteServiceExecutionLogs/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ServiceExecutionLogController_deleteServiceExecutionLog37_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "deleteServiceExecutionLog", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getAllDatasetLogs/json"))))
private[this] lazy val controllers_DatasetLogController_getAllDatasetLogs38_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(classOf[String]),"GET", """ DatasetLog""", Routes.prefix + """datasetLog/getAllDatasetLogs/json"""))
        

// @LINE:63
private[this] lazy val controllers_DatasetLogController_getDatasetLog39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/getDatasetLog/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetLogController_getDatasetLog39_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLog", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """datasetLog/getDatasetLog/id/$id<[^/]+>/json"""))
        

// @LINE:64
private[this] lazy val controllers_DatasetLogController_addDatasetLog40_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/addDatasetLog"))))
private[this] lazy val controllers_DatasetLogController_addDatasetLog40_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "addDatasetLog", Nil,"POST", """""", Routes.prefix + """datasetLog/addDatasetLog"""))
        

// @LINE:65
private[this] lazy val controllers_DatasetLogController_updateDatasetLogById41_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/updateDatasetLog/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetLogController_updateDatasetLogById41_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "updateDatasetLogById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """datasetLog/updateDatasetLog/id/$id<[^/]+>"""))
        

// @LINE:66
private[this] lazy val controllers_DatasetLogController_deleteDatasetLog42_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datasetLog/deleteDatasetLog/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetLogController_deleteDatasetLog42_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "deleteDatasetLog", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """datasetLog/deleteDatasetLog/id/$id<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_WorkflowController_getAllWorkflows43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getAllWorkflows/json"))))
private[this] lazy val controllers_WorkflowController_getAllWorkflows43_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllWorkflows(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getAllWorkflows", Seq(classOf[String]),"GET", """ Workflow""", Routes.prefix + """workflow/getAllWorkflows/json"""))
        

// @LINE:70
private[this] lazy val controllers_WorkflowController_getWorkflowById44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getWorkflowById/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_getWorkflowById44_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getWorkflowById/id/$id<[^/]+>/json"""))
        

// @LINE:71
private[this] lazy val controllers_WorkflowController_addWorkflow45_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addWorkflow"))))
private[this] lazy val controllers_WorkflowController_addWorkflow45_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/addWorkflow"""))
        

// @LINE:72
private[this] lazy val controllers_WorkflowController_updateWorkflowById46_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateWorkflowById/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowById46_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """workflow/updateWorkflowById/id/$id<[^/]+>"""))
        

// @LINE:73
private[this] lazy val controllers_WorkflowController_deleteWorkflowById47_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/deleteWorkflowById/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
private[this] lazy val controllers_WorkflowController_deleteWorkflowById47_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflowById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflowById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """workflow/deleteWorkflowById/id/$id<[^/]+>/"""))
        

// @LINE:74
private[this] lazy val controllers_WorkflowController_generateWorkflowJson48_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/generateWorkflowJson"))))
private[this] lazy val controllers_WorkflowController_generateWorkflowJson48_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).generateWorkflowJson,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "generateWorkflowJson", Nil,"POST", """""", Routes.prefix + """workflow/generateWorkflowJson"""))
        

// @LINE:77
private[this] lazy val controllers_InstrumentController_getAllInstruments49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getAllInstruments/json"))))
private[this] lazy val controllers_InstrumentController_getAllInstruments49_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]),"GET", """ Instrument""", Routes.prefix + """instrument/getAllInstruments/json"""))
        

// @LINE:78
private[this] lazy val controllers_InstrumentController_getInstrument50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getInstrument/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_InstrumentController_getInstrument50_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """instrument/getInstrument/id/$id<[^/]+>/json"""))
        

// @LINE:79
private[this] lazy val controllers_InstrumentController_addInstrument51_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/addInstrument"))))
private[this] lazy val controllers_InstrumentController_addInstrument51_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument,
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Nil,"POST", """""", Routes.prefix + """instrument/addInstrument"""))
        

// @LINE:80
private[this] lazy val controllers_InstrumentController_updateInstrumentById52_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/updateInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_updateInstrumentById52_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """instrument/updateInstrument/id/$id<[^/]+>"""))
        

// @LINE:81
private[this] lazy val controllers_InstrumentController_deleteInstrument53_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/deleteInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_deleteInstrument53_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """instrument/deleteInstrument/id/$id<[^/]+>"""))
        

// @LINE:84
private[this] lazy val controllers_DatasetController_getAllDatasets54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getAllDatasets/json"))))
private[this] lazy val controllers_DatasetController_getAllDatasets54_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]),"GET", """ Dataset""", Routes.prefix + """dataset/getAllDatasets/json"""))
        

// @LINE:85
private[this] lazy val controllers_DatasetController_getDataset55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getDataset/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetController_getDataset55_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """dataset/getDataset/id/$id<[^/]+>/json"""))
        

// @LINE:86
private[this] lazy val controllers_DatasetController_addDataset56_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/addDataset"))))
private[this] lazy val controllers_DatasetController_addDataset56_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Nil,"POST", """""", Routes.prefix + """dataset/addDataset"""))
        

// @LINE:87
private[this] lazy val controllers_DatasetController_updateDatasetById57_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/updateDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_updateDatasetById57_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """dataset/updateDataset/id/$id<[^/]+>"""))
        

// @LINE:88
private[this] lazy val controllers_DatasetController_deleteDataset58_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/deleteDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_deleteDataset58_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """dataset/deleteDataset/id/$id<[^/]+>"""))
        

// @LINE:89
private[this] lazy val controllers_DatasetController_queryDatasets59_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/queryDataset"))))
private[this] lazy val controllers_DatasetController_queryDatasets59_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Nil,"POST", """""", Routes.prefix + """dataset/queryDataset"""))
        

// @LINE:92
private[this] lazy val controllers_ParameterController_getAllParameters60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getAllParameters/json"))))
private[this] lazy val controllers_ParameterController_getAllParameters60_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]),"GET", """ Parameter""", Routes.prefix + """parameter/getAllParameters/json"""))
        

// @LINE:93
private[this] lazy val controllers_ParameterController_getParameterByName61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterByName61_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(fakeValue[Long], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json"""))
        

// @LINE:94
private[this] lazy val controllers_ParameterController_getParameterById62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterById62_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/id/$id<[^/]+>/json"""))
        

// @LINE:95
private[this] lazy val controllers_ParameterController_addParameter63_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/addParameter"))))
private[this] lazy val controllers_ParameterController_addParameter63_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Nil,"POST", """""", Routes.prefix + """parameter/addParameter"""))
        

// @LINE:96
private[this] lazy val controllers_ParameterController_updateParameterById64_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterById64_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """parameter/updateParameter/id/$id<[^/]+>"""))
        

// @LINE:97
private[this] lazy val controllers_ParameterController_updateParameterByName65_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterByName65_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """parameter/updateParameter/name/$oldName<[^/]+>"""))
        

// @LINE:98
private[this] lazy val controllers_ParameterController_deleteParameterByName66_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/deleteParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_deleteParameterByName66_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>"""))
        

// @LINE:101
private[this] lazy val controllers_JournalPublicationController_getAllJournalPublications67_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/getAllJournalPublications/json"))))
private[this] lazy val controllers_JournalPublicationController_getAllJournalPublications67_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getAllJournalPublications", Seq(classOf[String]),"GET", """ JournalPublication""", Routes.prefix + """journalPublication/getAllJournalPublications/json"""))
        

// @LINE:102
private[this] lazy val controllers_JournalPublicationController_getJournalPublicationById68_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/getJournalPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_JournalPublicationController_getJournalPublicationById68_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getJournalPublicationById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """journalPublication/getJournalPublication/id/$id<[^/]+>/json"""))
        

// @LINE:103
private[this] lazy val controllers_JournalPublicationController_addJournalPublication69_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/addJournalPublication"))))
private[this] lazy val controllers_JournalPublicationController_addJournalPublication69_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "addJournalPublication", Nil,"POST", """""", Routes.prefix + """journalPublication/addJournalPublication"""))
        

// @LINE:104
private[this] lazy val controllers_JournalPublicationController_updateJournalPublicationById70_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/updateJournalPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JournalPublicationController_updateJournalPublicationById70_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "updateJournalPublicationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """journalPublication/updateJournalPublication/id/$id<[^/]+>"""))
        

// @LINE:105
private[this] lazy val controllers_JournalPublicationController_deleteJournalPublicationById71_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("journalPublication/deleteJournalPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JournalPublicationController_deleteJournalPublicationById71_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "deleteJournalPublicationById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """journalPublication/deleteJournalPublication/id/$id<[^/]+>"""))
        

// @LINE:108
private[this] lazy val controllers_BookPublicationController_getAllBookPublications72_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/getAllBookPublications/json"))))
private[this] lazy val controllers_BookPublicationController_getAllBookPublications72_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getAllBookPublications", Seq(classOf[String]),"GET", """ BookPublication""", Routes.prefix + """BookPublication/getAllBookPublications/json"""))
        

// @LINE:109
private[this] lazy val controllers_BookPublicationController_getBookPublicationById73_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_BookPublicationController_getBookPublicationById73_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getBookPublicationById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """BookPublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:110
private[this] lazy val controllers_BookPublicationController_addBookPublication74_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/addBookPublication"))))
private[this] lazy val controllers_BookPublicationController_addBookPublication74_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "addBookPublication", Nil,"POST", """""", Routes.prefix + """BookPublication/addBookPublication"""))
        

// @LINE:111
private[this] lazy val controllers_BookPublicationController_updateBookPublicationById75_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookPublicationController_updateBookPublicationById75_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "updateBookPublicationById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """BookPublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:112
private[this] lazy val controllers_BookPublicationController_deleteBookPublicationById76_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookPublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookPublicationController_deleteBookPublicationById76_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "deleteBookPublicationById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """BookPublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:115
private[this] lazy val controllers_BookChapterPublicationController_getAllBookChapterPublications77_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/getAllBookPublications/json"))))
private[this] lazy val controllers_BookChapterPublicationController_getAllBookChapterPublications77_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getAllBookChapterPublications", Seq(classOf[String]),"GET", """ BookChapterPublication""", Routes.prefix + """BookChapterPublication/getAllBookPublications/json"""))
        

// @LINE:116
private[this] lazy val controllers_BookChapterPublicationController_getBookChapterPublication78_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_BookChapterPublicationController_getBookChapterPublication78_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getBookChapterPublication", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:117
private[this] lazy val controllers_BookChapterPublicationController_addBookChapterPublication79_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/addBookPublication"))))
private[this] lazy val controllers_BookChapterPublicationController_addBookChapterPublication79_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "addBookChapterPublication", Nil,"POST", """""", Routes.prefix + """BookChapterPublication/addBookPublication"""))
        

// @LINE:118
private[this] lazy val controllers_BookChapterPublicationController_updateBookChapterPublication80_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookChapterPublicationController_updateBookChapterPublication80_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "updateBookChapterPublication", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:119
private[this] lazy val controllers_BookChapterPublicationController_deleteBookChapterPublication81_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("BookChapterPublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_BookChapterPublicationController_deleteBookChapterPublication81_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "deleteBookChapterPublication", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:122
private[this] lazy val controllers_ConferencePublicationController_getAllConferencePublications82_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/getAllBookPublications/json"))))
private[this] lazy val controllers_ConferencePublicationController_getAllConferencePublications82_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getAllConferencePublications", Seq(classOf[String]),"GET", """ ConferencePublication""", Routes.prefix + """ConferencePublication/getAllBookPublications/json"""))
        

// @LINE:123
private[this] lazy val controllers_ConferencePublicationController_getConferencePublication83_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/getBookPublication/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ConferencePublicationController_getConferencePublication83_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getConferencePublication", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json"""))
        

// @LINE:124
private[this] lazy val controllers_ConferencePublicationController_addConferencePublication84_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/addBookPublication"))))
private[this] lazy val controllers_ConferencePublicationController_addConferencePublication84_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "addConferencePublication", Nil,"POST", """""", Routes.prefix + """ConferencePublication/addBookPublication"""))
        

// @LINE:125
private[this] lazy val controllers_ConferencePublicationController_updateConferencePublication85_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/updateBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ConferencePublicationController_updateConferencePublication85_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "updateConferencePublication", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """ConferencePublication/updateBookPublication/id/$id<[^/]+>"""))
        

// @LINE:126
private[this] lazy val controllers_ConferencePublicationController_deleteConferencePublication86_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ConferencePublication/deleteBookPublication/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ConferencePublicationController_deleteConferencePublication86_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "deleteConferencePublication", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>"""))
        

// @LINE:129
private[this] lazy val controllers_UserController_getUser87_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getUser87_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getUser", Seq(classOf[Long], classOf[String]),"GET", """ Users""", Routes.prefix + """users/$id<[^/]+>"""))
        

// @LINE:130
private[this] lazy val controllers_UserController_addUser88_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/add"))))
private[this] lazy val controllers_UserController_addUser88_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addUser", Nil,"POST", """""", Routes.prefix + """users/add"""))
        

// @LINE:131
private[this] lazy val controllers_UserController_updateUser89_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_updateUser89_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "updateUser", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """users/update/$id<[^/]+>"""))
        

// @LINE:132
private[this] lazy val controllers_UserController_deleteUser90_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUser90_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """users/delete/$id<[^/]+>"""))
        

// @LINE:133
private[this] lazy val controllers_UserController_getAllUsers91_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getAllUsers/json"))))
private[this] lazy val controllers_UserController_getAllUsers91_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """users/getAllUsers/json"""))
        

// @LINE:134
private[this] lazy val controllers_UserController_isUserValid92_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/isUserValid"))))
private[this] lazy val controllers_UserController_isUserValid92_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserValid", Nil,"POST", """""", Routes.prefix + """users/isUserValid"""))
        

// @LINE:135
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword93_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/userName/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/password/"),DynamicPart("password", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword93_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>"""))
        

// @LINE:138
private[this] lazy val controllers_Assets_at94_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at94_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/$name<[^/]+>/json""","""@controllers.ClimateServiceController@.getClimateService(name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.getClimateServiceById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServices(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByCreateTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCreateTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByLatestAccessTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostUsedClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCount(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addClimateService""","""@controllers.ClimateServiceController@.addClimateService"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllServiceEntries/json""","""@controllers.ClimateServiceController@.getAllServiceEntries(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addServiceEntry""","""@controllers.ClimateServiceController@.addServiceEntry"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/name/$oldName<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/name/$name<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceByName(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/savePage""","""@controllers.ClimateServiceController@.savePage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.getBugReport(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllBugReports/json""","""@controllers.BugReportController@.getAllBugReports"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllUnsolvedBugReports/json""","""@controllers.BugReportController@.getAllUnsolvedBugReports"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/getAllSolvedBugReports/json""","""@controllers.BugReportController@.getAllSolvedBugReports"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/addBugReport""","""@controllers.BugReportController@.addBugReport"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/updateBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.updateBugReportById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugReport/deleteBugReport/id/$id<[^/]+>""","""@controllers.BugReportController@.deleteBugReport(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json""","""@controllers.ServiceConfigurationController@.getServiceConfiguration(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/addServiceConfiguration""","""@controllers.ServiceConfigurationController@.addServiceConfiguration"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>""","""@controllers.ServiceConfigurationController@.updateServiceConfigurationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>""","""@controllers.ServiceConfigurationController@.deleteServiceConfiguration(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json""","""@controllers.ServiceConfigurationController@.getServiceConfigurationsByUser(userId:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>""","""@controllers.ServiceConfigurationItemController@.getServiceConfigurationItemByParameterId(paramId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/addServiceConfigurationItem""","""@controllers.ServiceConfigurationItemController@.addServiceConfigurationItem"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.updateServiceConfigurationItemById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>""","""@controllers.ServiceConfigurationItemController@.deleteServiceConfigurationItemById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/getAllServiceExecutionLog""","""@controllers.ServiceExecutionLogController@.getAllServiceExecutionLogs(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.getServiceExecutionLog(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/addServiceExecutionLog""","""@controllers.ServiceExecutionLogController@.addServiceExecutionLog()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/queryServiceExecutionLogs""","""@controllers.ServiceExecutionLogController@.queryServiceExecutionLogs()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.updateServiceExecutionLog(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>""","""@controllers.ServiceExecutionLogController@.deleteServiceExecutionLog(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getAllDatasetLogs/json""","""@controllers.DatasetLogController@.getAllDatasetLogs(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/getDatasetLog/id/$id<[^/]+>/json""","""@controllers.DatasetLogController@.getDatasetLog(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/addDatasetLog""","""@controllers.DatasetLogController@.addDatasetLog"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/updateDatasetLog/id/$id<[^/]+>""","""@controllers.DatasetLogController@.updateDatasetLogById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datasetLog/deleteDatasetLog/id/$id<[^/]+>""","""@controllers.DatasetLogController@.deleteDatasetLog(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getAllWorkflows/json""","""@controllers.WorkflowController@.getAllWorkflows(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getWorkflowById/id/$id<[^/]+>/json""","""@controllers.WorkflowController@.getWorkflowById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addWorkflow""","""@controllers.WorkflowController@.addWorkflow"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateWorkflowById/id/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/deleteWorkflowById/id/$id<[^/]+>/""","""@controllers.WorkflowController@.deleteWorkflowById(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/generateWorkflowJson""","""@controllers.WorkflowController@.generateWorkflowJson"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getAllInstruments/json""","""@controllers.InstrumentController@.getAllInstruments(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getInstrument/id/$id<[^/]+>/json""","""@controllers.InstrumentController@.getInstrument(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/addInstrument""","""@controllers.InstrumentController@.addInstrument"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/updateInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.updateInstrumentById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/deleteInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.deleteInstrument(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getAllDatasets/json""","""@controllers.DatasetController@.getAllDatasets(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getDataset/id/$id<[^/]+>/json""","""@controllers.DatasetController@.getDataset(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/addDataset""","""@controllers.DatasetController@.addDataset"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/updateDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.updateDatasetById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/deleteDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.deleteDataset(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/queryDataset""","""@controllers.DatasetController@.queryDatasets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getAllParameters/json""","""@controllers.ParameterController@.getAllParameters(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""","""@controllers.ParameterController@.getParameterByName(id:Long, name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/id/$id<[^/]+>/json""","""@controllers.ParameterController@.getParameterById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/addParameter""","""@controllers.ParameterController@.addParameter"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/id/$id<[^/]+>""","""@controllers.ParameterController@.updateParameterById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/name/$oldName<[^/]+>""","""@controllers.ParameterController@.updateParameterByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""","""@controllers.ParameterController@.deleteParameterByName(id:Long, name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/getAllJournalPublications/json""","""@controllers.JournalPublicationController@.getAllJournalPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/getJournalPublication/id/$id<[^/]+>/json""","""@controllers.JournalPublicationController@.getJournalPublicationById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/addJournalPublication""","""@controllers.JournalPublicationController@.addJournalPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/updateJournalPublication/id/$id<[^/]+>""","""@controllers.JournalPublicationController@.updateJournalPublicationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """journalPublication/deleteJournalPublication/id/$id<[^/]+>""","""@controllers.JournalPublicationController@.deleteJournalPublicationById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/getAllBookPublications/json""","""@controllers.BookPublicationController@.getAllBookPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.BookPublicationController@.getBookPublicationById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/addBookPublication""","""@controllers.BookPublicationController@.addBookPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.BookPublicationController@.updateBookPublicationById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookPublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.BookPublicationController@.deleteBookPublicationById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/getAllBookPublications/json""","""@controllers.BookChapterPublicationController@.getAllBookChapterPublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.BookChapterPublicationController@.getBookChapterPublication(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/addBookPublication""","""@controllers.BookChapterPublicationController@.addBookChapterPublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.BookChapterPublicationController@.updateBookChapterPublication(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.BookChapterPublicationController@.deleteBookChapterPublication(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/getAllBookPublications/json""","""@controllers.ConferencePublicationController@.getAllConferencePublications(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json""","""@controllers.ConferencePublicationController@.getConferencePublication(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/addBookPublication""","""@controllers.ConferencePublicationController@.addConferencePublication"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/updateBookPublication/id/$id<[^/]+>""","""@controllers.ConferencePublicationController@.updateConferencePublication(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>""","""@controllers.ConferencePublicationController@.deleteConferencePublication(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""@controllers.UserController@.getUser(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/add""","""@controllers.UserController@.addUser"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/update/$id<[^/]+>""","""@controllers.UserController@.updateUser(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/$id<[^/]+>""","""@controllers.UserController@.deleteUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getAllUsers/json""","""@controllers.UserController@.getAllUsers(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/isUserValid""","""@controllers.UserController@.isUserValid"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""","""@controllers.UserController@.deleteUserByUserNameandPassword(userName:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:10
case controllers_ClimateServiceController_getClimateService0_route(params) => {
   call(params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (name, format) =>
        controllers_ClimateServiceController_getClimateService0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format))
   }
}
        

// @LINE:11
case controllers_ClimateServiceController_getClimateServiceById1_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_getClimateServiceById1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id))
   }
}
        

// @LINE:12
case controllers_ClimateServiceController_getAllClimateServices2_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServices2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format))
   }
}
        

// @LINE:13
case controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format))
   }
}
        

// @LINE:14
case controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format))
   }
}
        

// @LINE:15
case controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format))
   }
}
        

// @LINE:16
case controllers_ClimateServiceController_addClimateService6_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService)
   }
}
        

// @LINE:17
case controllers_ClimateServiceController_getAllServiceEntries7_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllServiceEntries7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format))
   }
}
        

// @LINE:18
case controllers_ClimateServiceController_addServiceEntry8_route(params) => {
   call { 
        controllers_ClimateServiceController_addServiceEntry8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry)
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_updateClimateServiceById9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_updateClimateServiceById9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id))
   }
}
        

// @LINE:20
case controllers_ClimateServiceController_updateClimateServiceByName10_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ClimateServiceController_updateClimateServiceByName10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName))
   }
}
        

// @LINE:21
case controllers_ClimateServiceController_deleteClimateServiceById11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_deleteClimateServiceById11_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_deleteClimateServiceByName12_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ClimateServiceController_deleteClimateServiceByName12_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name))
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_savePage13_route(params) => {
   call { 
        controllers_ClimateServiceController_savePage13_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage)
   }
}
        

// @LINE:28
case controllers_BugReportController_getBugReport14_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BugReportController_getBugReport14_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(id, format))
   }
}
        

// @LINE:29
case controllers_BugReportController_getAllBugReports15_route(params) => {
   call { 
        controllers_BugReportController_getAllBugReports15_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports)
   }
}
        

// @LINE:30
case controllers_BugReportController_getAllUnsolvedBugReports16_route(params) => {
   call { 
        controllers_BugReportController_getAllUnsolvedBugReports16_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports)
   }
}
        

// @LINE:31
case controllers_BugReportController_getAllSolvedBugReports17_route(params) => {
   call { 
        controllers_BugReportController_getAllSolvedBugReports17_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports)
   }
}
        

// @LINE:32
case controllers_BugReportController_addBugReport18_route(params) => {
   call { 
        controllers_BugReportController_addBugReport18_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport)
   }
}
        

// @LINE:33
case controllers_BugReportController_updateBugReportById19_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_updateBugReportById19_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(id))
   }
}
        

// @LINE:34
case controllers_BugReportController_deleteBugReport20_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_deleteBugReport20_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(id))
   }
}
        

// @LINE:37
case controllers_ServiceConfigurationController_getServiceConfiguration21_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ServiceConfigurationController_getServiceConfiguration21_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(id, format))
   }
}
        

// @LINE:38
case controllers_ServiceConfigurationController_addServiceConfiguration22_route(params) => {
   call { 
        controllers_ServiceConfigurationController_addServiceConfiguration22_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration)
   }
}
        

// @LINE:39
case controllers_ServiceConfigurationController_updateServiceConfigurationById23_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationController_updateServiceConfigurationById23_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(id))
   }
}
        

// @LINE:40
case controllers_ServiceConfigurationController_deleteServiceConfiguration24_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationController_deleteServiceConfiguration24_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(id))
   }
}
        

// @LINE:41
case controllers_ServiceConfigurationController_getServiceConfigurationsByUser25_route(params) => {
   call(params.fromPath[Long]("userId", None), Param[String]("format", Right("json"))) { (userId, format) =>
        controllers_ServiceConfigurationController_getServiceConfigurationsByUser25_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(userId, format))
   }
}
        

// @LINE:44
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemById26_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemById26_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(id))
   }
}
        

// @LINE:45
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig27_route(params) => {
   call(params.fromPath[Long]("serviceConfigId", None)) { (serviceConfigId) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemsInServiceConfig27_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(serviceConfigId))
   }
}
        

// @LINE:46
case controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId28_route(params) => {
   call(params.fromPath[Long]("paramId", None)) { (paramId) =>
        controllers_ServiceConfigurationItemController_getServiceConfigurationItemByParameterId28_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(paramId))
   }
}
        

// @LINE:47
case controllers_ServiceConfigurationItemController_addServiceConfigurationItem29_route(params) => {
   call { 
        controllers_ServiceConfigurationItemController_addServiceConfigurationItem29_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem)
   }
}
        

// @LINE:48
case controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById30_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_updateServiceConfigurationItemById30_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(id))
   }
}
        

// @LINE:49
case controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById31_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceConfigurationItemController_deleteServiceConfigurationItemById31_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(id))
   }
}
        

// @LINE:52
case controllers_ServiceExecutionLogController_getAllServiceExecutionLogs32_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ServiceExecutionLogController_getAllServiceExecutionLogs32_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(format))
   }
}
        

// @LINE:53
case controllers_ServiceExecutionLogController_getServiceExecutionLog33_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ServiceExecutionLogController_getServiceExecutionLog33_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(id, format))
   }
}
        

// @LINE:54
case controllers_ServiceExecutionLogController_addServiceExecutionLog34_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_addServiceExecutionLog34_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog())
   }
}
        

// @LINE:55
case controllers_ServiceExecutionLogController_queryServiceExecutionLogs35_route(params) => {
   call { 
        controllers_ServiceExecutionLogController_queryServiceExecutionLogs35_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs())
   }
}
        

// @LINE:56
case controllers_ServiceExecutionLogController_updateServiceExecutionLog36_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceExecutionLogController_updateServiceExecutionLog36_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(id))
   }
}
        

// @LINE:57
case controllers_ServiceExecutionLogController_deleteServiceExecutionLog37_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServiceExecutionLogController_deleteServiceExecutionLog37_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(id))
   }
}
        

// @LINE:62
case controllers_DatasetLogController_getAllDatasetLogs38_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetLogController_getAllDatasetLogs38_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(format))
   }
}
        

// @LINE:63
case controllers_DatasetLogController_getDatasetLog39_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetLogController_getDatasetLog39_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(id, format))
   }
}
        

// @LINE:64
case controllers_DatasetLogController_addDatasetLog40_route(params) => {
   call { 
        controllers_DatasetLogController_addDatasetLog40_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog)
   }
}
        

// @LINE:65
case controllers_DatasetLogController_updateDatasetLogById41_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetLogController_updateDatasetLogById41_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(id))
   }
}
        

// @LINE:66
case controllers_DatasetLogController_deleteDatasetLog42_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetLogController_deleteDatasetLog42_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(id))
   }
}
        

// @LINE:69
case controllers_WorkflowController_getAllWorkflows43_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getAllWorkflows43_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllWorkflows(format))
   }
}
        

// @LINE:70
case controllers_WorkflowController_getWorkflowById44_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowById44_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowById(id, format))
   }
}
        

// @LINE:71
case controllers_WorkflowController_addWorkflow45_route(params) => {
   call { 
        controllers_WorkflowController_addWorkflow45_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addWorkflow)
   }
}
        

// @LINE:72
case controllers_WorkflowController_updateWorkflowById46_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_updateWorkflowById46_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowById(id))
   }
}
        

// @LINE:73
case controllers_WorkflowController_deleteWorkflowById47_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_deleteWorkflowById47_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflowById(id))
   }
}
        

// @LINE:74
case controllers_WorkflowController_generateWorkflowJson48_route(params) => {
   call { 
        controllers_WorkflowController_generateWorkflowJson48_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).generateWorkflowJson)
   }
}
        

// @LINE:77
case controllers_InstrumentController_getAllInstruments49_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_InstrumentController_getAllInstruments49_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format))
   }
}
        

// @LINE:78
case controllers_InstrumentController_getInstrument50_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_InstrumentController_getInstrument50_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format))
   }
}
        

// @LINE:79
case controllers_InstrumentController_addInstrument51_route(params) => {
   call { 
        controllers_InstrumentController_addInstrument51_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument)
   }
}
        

// @LINE:80
case controllers_InstrumentController_updateInstrumentById52_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_updateInstrumentById52_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id))
   }
}
        

// @LINE:81
case controllers_InstrumentController_deleteInstrument53_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_deleteInstrument53_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id))
   }
}
        

// @LINE:84
case controllers_DatasetController_getAllDatasets54_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetController_getAllDatasets54_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format))
   }
}
        

// @LINE:85
case controllers_DatasetController_getDataset55_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetController_getDataset55_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format))
   }
}
        

// @LINE:86
case controllers_DatasetController_addDataset56_route(params) => {
   call { 
        controllers_DatasetController_addDataset56_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset)
   }
}
        

// @LINE:87
case controllers_DatasetController_updateDatasetById57_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_updateDatasetById57_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id))
   }
}
        

// @LINE:88
case controllers_DatasetController_deleteDataset58_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_deleteDataset58_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id))
   }
}
        

// @LINE:89
case controllers_DatasetController_queryDatasets59_route(params) => {
   call { 
        controllers_DatasetController_queryDatasets59_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets)
   }
}
        

// @LINE:92
case controllers_ParameterController_getAllParameters60_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ParameterController_getAllParameters60_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format))
   }
}
        

// @LINE:93
case controllers_ParameterController_getParameterByName61_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (id, name, format) =>
        controllers_ParameterController_getParameterByName61_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format))
   }
}
        

// @LINE:94
case controllers_ParameterController_getParameterById62_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ParameterController_getParameterById62_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format))
   }
}
        

// @LINE:95
case controllers_ParameterController_addParameter63_route(params) => {
   call { 
        controllers_ParameterController_addParameter63_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter)
   }
}
        

// @LINE:96
case controllers_ParameterController_updateParameterById64_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ParameterController_updateParameterById64_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id))
   }
}
        

// @LINE:97
case controllers_ParameterController_updateParameterByName65_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ParameterController_updateParameterByName65_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName))
   }
}
        

// @LINE:98
case controllers_ParameterController_deleteParameterByName66_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None)) { (id, name) =>
        controllers_ParameterController_deleteParameterByName66_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name))
   }
}
        

// @LINE:101
case controllers_JournalPublicationController_getAllJournalPublications67_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_JournalPublicationController_getAllJournalPublications67_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(format))
   }
}
        

// @LINE:102
case controllers_JournalPublicationController_getJournalPublicationById68_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_JournalPublicationController_getJournalPublicationById68_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(id, format))
   }
}
        

// @LINE:103
case controllers_JournalPublicationController_addJournalPublication69_route(params) => {
   call { 
        controllers_JournalPublicationController_addJournalPublication69_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication)
   }
}
        

// @LINE:104
case controllers_JournalPublicationController_updateJournalPublicationById70_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_JournalPublicationController_updateJournalPublicationById70_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(id))
   }
}
        

// @LINE:105
case controllers_JournalPublicationController_deleteJournalPublicationById71_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_JournalPublicationController_deleteJournalPublicationById71_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(id))
   }
}
        

// @LINE:108
case controllers_BookPublicationController_getAllBookPublications72_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_BookPublicationController_getAllBookPublications72_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(format))
   }
}
        

// @LINE:109
case controllers_BookPublicationController_getBookPublicationById73_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BookPublicationController_getBookPublicationById73_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(id, format))
   }
}
        

// @LINE:110
case controllers_BookPublicationController_addBookPublication74_route(params) => {
   call { 
        controllers_BookPublicationController_addBookPublication74_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication)
   }
}
        

// @LINE:111
case controllers_BookPublicationController_updateBookPublicationById75_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookPublicationController_updateBookPublicationById75_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(id))
   }
}
        

// @LINE:112
case controllers_BookPublicationController_deleteBookPublicationById76_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookPublicationController_deleteBookPublicationById76_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(id))
   }
}
        

// @LINE:115
case controllers_BookChapterPublicationController_getAllBookChapterPublications77_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_BookChapterPublicationController_getAllBookChapterPublications77_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(format))
   }
}
        

// @LINE:116
case controllers_BookChapterPublicationController_getBookChapterPublication78_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BookChapterPublicationController_getBookChapterPublication78_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(id, format))
   }
}
        

// @LINE:117
case controllers_BookChapterPublicationController_addBookChapterPublication79_route(params) => {
   call { 
        controllers_BookChapterPublicationController_addBookChapterPublication79_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication)
   }
}
        

// @LINE:118
case controllers_BookChapterPublicationController_updateBookChapterPublication80_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookChapterPublicationController_updateBookChapterPublication80_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(id))
   }
}
        

// @LINE:119
case controllers_BookChapterPublicationController_deleteBookChapterPublication81_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookChapterPublicationController_deleteBookChapterPublication81_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(id))
   }
}
        

// @LINE:122
case controllers_ConferencePublicationController_getAllConferencePublications82_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ConferencePublicationController_getAllConferencePublications82_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(format))
   }
}
        

// @LINE:123
case controllers_ConferencePublicationController_getConferencePublication83_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ConferencePublicationController_getConferencePublication83_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(id, format))
   }
}
        

// @LINE:124
case controllers_ConferencePublicationController_addConferencePublication84_route(params) => {
   call { 
        controllers_ConferencePublicationController_addConferencePublication84_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication)
   }
}
        

// @LINE:125
case controllers_ConferencePublicationController_updateConferencePublication85_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConferencePublicationController_updateConferencePublication85_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(id))
   }
}
        

// @LINE:126
case controllers_ConferencePublicationController_deleteConferencePublication86_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ConferencePublicationController_deleteConferencePublication86_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(id))
   }
}
        

// @LINE:129
case controllers_UserController_getUser87_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserController_getUser87_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(id, format))
   }
}
        

// @LINE:130
case controllers_UserController_addUser88_route(params) => {
   call { 
        controllers_UserController_addUser88_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser)
   }
}
        

// @LINE:131
case controllers_UserController_updateUser89_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_updateUser89_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(id))
   }
}
        

// @LINE:132
case controllers_UserController_deleteUser90_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser90_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id))
   }
}
        

// @LINE:133
case controllers_UserController_getAllUsers91_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_UserController_getAllUsers91_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format))
   }
}
        

// @LINE:134
case controllers_UserController_isUserValid92_route(params) => {
   call { 
        controllers_UserController_isUserValid92_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid)
   }
}
        

// @LINE:135
case controllers_UserController_deleteUserByUserNameandPassword93_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_deleteUserByUserNameandPassword93_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password))
   }
}
        

// @LINE:138
case controllers_Assets_at94_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at94_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     