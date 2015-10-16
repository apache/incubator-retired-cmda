// @SOURCE:/Users/mingqi/git/climate-service/conf/routes
// @HASH:4ba341718eee43fdccd52b441b56ce7f19fa885b
// @DATE:Wed Oct 14 21:51:48 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:58
class ReverseAssets {


// @LINE:58
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseServiceExecutionLogController {


// @LINE:33
def getServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLog")
}
                        

// @LINE:36
def getConfigurationByConfId(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getConfigurationByConfId")
}
                        

// @LINE:34
def searchServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchServiceLog")
}
                        

// @LINE:35
def getSearchServiceLog(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchServiceLogResult")
}
                        

}
                          

// @LINE:44
class ReverseDatasetLogController {


// @LINE:44
def getAllDatasetLogs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/allDatasetLogs")
}
                        

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseBugReportController {


// @LINE:67
def reports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                        

// @LINE:71
def solveReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                        

// @LINE:70
def deleteReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                        

// @LINE:69
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                        

// @LINE:68
def newReport(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                        

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseAnalyticsController {


// @LINE:51
def getSearchAndGenerateWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchAndGenerateWorkflow")
}
                        

// @LINE:48
def getDatasetRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "datasetRecommend")
}
                        

// @LINE:47
def getRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogRecommend")
}
                        

// @LINE:49
def getScientistRecommend(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profileRecommend")
}
                        

// @LINE:50
def getLogGraph(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogGraph")
}
                        

}
                          

// @LINE:64
// @LINE:63
// @LINE:62
class ReverseAboutController {


// @LINE:63
def aboutProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                        

// @LINE:64
def tutorial(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "tutorial")
}
                        

// @LINE:62
def aboutUs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
}
                        

}
                          

// @LINE:55
// @LINE:54
class ReverseUsersController {


// @LINE:54
def getAllUsers(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scientist/allUsers")
}
                        

// @LINE:55
def searchUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scientist/searchUser")
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createNewUser")
}
                        

// @LINE:12
def createSuccess(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createSuccess")
}
                        

// @LINE:13
def isEmailExisted(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "isEmailExisted")
}
                        

// @LINE:10
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:8
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate")
}
                        

// @LINE:7
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseDatasetController {


// @LINE:41
def getSearchResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/getSearchResult")
}
                        

// @LINE:39
def showAllDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/allDatasets")
}
                        

// @LINE:40
def searchDataset(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dataSet/searchDataSet")
}
                        

}
                          

// @LINE:74
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseClimateServiceController {


// @LINE:24
def mostPopularServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostPopularServices")
}
                        

// @LINE:26
def mostRecentlyAddedClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostRecentlyAddedClimateServices")
}
                        

// @LINE:21
// @LINE:20
def serviceModels(): Call = {
   () match {
// @LINE:20
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "assets/html/climateService/serviceModels")
                                         
   }
}
                                                

// @LINE:17
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/add")
}
                        

// @LINE:16
def showAllClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/allServices")
}
                        

// @LINE:19
def passPageStr(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/savePage")
}
                        

// @LINE:29
def replaceFile(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/replaceFile")
}
                        

// @LINE:25
def mostRecentlyUsedClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/mostRecentlyUsedClimateServices")
}
                        

// @LINE:18
def addAClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/addAClimateService")
}
                        

// @LINE:22
def ruleEngineData(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/ruleEngineData")
}
                        

// @LINE:74
def addAllParameters(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addAllParameters")
}
                        

}
                          
}
                  


// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:58
class ReverseAssets {


// @LINE:58
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseServiceExecutionLogController {


// @LINE:33
def getServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLog"})
      }
   """
)
                        

// @LINE:36
def getConfigurationByConfId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getConfigurationByConfId",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getConfigurationByConfId"})
      }
   """
)
                        

// @LINE:34
def searchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.searchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchServiceLog"})
      }
   """
)
                        

// @LINE:35
def getSearchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getSearchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchServiceLogResult"})
      }
   """
)
                        

}
              

// @LINE:44
class ReverseDatasetLogController {


// @LINE:44
def getAllDatasetLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getAllDatasetLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/allDatasetLogs"})
      }
   """
)
                        

}
              

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseBugReportController {


// @LINE:67
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:71
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:70
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:69
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:68
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        

}
              

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseAnalyticsController {


// @LINE:51
def getSearchAndGenerateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getSearchAndGenerateWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchAndGenerateWorkflow"})
      }
   """
)
                        

// @LINE:48
def getDatasetRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getDatasetRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetRecommend"})
      }
   """
)
                        

// @LINE:47
def getRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogRecommend"})
      }
   """
)
                        

// @LINE:49
def getScientistRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getScientistRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileRecommend"})
      }
   """
)
                        

// @LINE:50
def getLogGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AnalyticsController.getLogGraph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogGraph"})
      }
   """
)
                        

}
              

// @LINE:64
// @LINE:63
// @LINE:62
class ReverseAboutController {


// @LINE:63
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:64
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
      }
   """
)
                        

// @LINE:62
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs"})
      }
   """
)
                        

}
              

// @LINE:55
// @LINE:54
class ReverseUsersController {


// @LINE:54
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsersController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scientist/allUsers"})
      }
   """
)
                        

// @LINE:55
def searchUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UsersController.searchUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scientist/searchUser"})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createNewUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewUser"})
      }
   """
)
                        

// @LINE:12
def createSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createSuccess"})
      }
   """
)
                        

// @LINE:13
def isEmailExisted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isEmailExisted",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "isEmailExisted"})
      }
   """
)
                        

// @LINE:10
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseDatasetController {


// @LINE:41
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/getSearchResult"})
      }
   """
)
                        

// @LINE:39
def showAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.showAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/allDatasets"})
      }
   """
)
                        

// @LINE:40
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataSet/searchDataSet"})
      }
   """
)
                        

}
              

// @LINE:74
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseClimateServiceController {


// @LINE:24
def mostPopularServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostPopularServices"})
      }
   """
)
                        

// @LINE:26
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:21
// @LINE:20
def serviceModels : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.serviceModels",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/html/climateService/serviceModels"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/serviceModels"})
      }
      }
   """
)
                        

// @LINE:17
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/add"})
      }
   """
)
                        

// @LINE:16
def showAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.showAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/allServices"})
      }
   """
)
                        

// @LINE:19
def passPageStr : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.passPageStr",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/savePage"})
      }
   """
)
                        

// @LINE:29
def replaceFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.replaceFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/replaceFile"})
      }
   """
)
                        

// @LINE:25
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:18
def addAClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addAClimateService",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addAClimateService"})
      }
   """
)
                        

// @LINE:22
def ruleEngineData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.ruleEngineData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/ruleEngineData"})
      }
   """
)
                        

// @LINE:74
def addAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addAllParameters",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addAllParameters"})
      }
   """
)
                        

}
              
}
        


// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:58
class ReverseAssets {


// @LINE:58
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
class ReverseServiceExecutionLogController {


// @LINE:33
def getServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceLog", Seq(), "GET", """ Service Execution Log""", _prefix + """serviceLog""")
)
                      

// @LINE:36
def getConfigurationByConfId(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getConfigurationByConfId(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getConfigurationByConfId", Seq(), "GET", """""", _prefix + """getConfigurationByConfId""")
)
                      

// @LINE:34
def searchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.searchServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "searchServiceLog", Seq(), "GET", """""", _prefix + """searchServiceLog""")
)
                      

// @LINE:35
def getSearchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ServiceExecutionLogController.getSearchServiceLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getSearchServiceLog", Seq(), "GET", """""", _prefix + """searchServiceLogResult""")
)
                      

}
                          

// @LINE:44
class ReverseDatasetLogController {


// @LINE:44
def getAllDatasetLogs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetLogController.getAllDatasetLogs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(), "GET", """ Dataset Log""", _prefix + """datasetLog/allDatasetLogs""")
)
                      

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseBugReportController {


// @LINE:67
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:71
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:70
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:69
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:68
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseAnalyticsController {


// @LINE:51
def getSearchAndGenerateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getSearchAndGenerateWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getSearchAndGenerateWorkflow", Seq(), "GET", """""", _prefix + """searchAndGenerateWorkflow""")
)
                      

// @LINE:48
def getDatasetRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getDatasetRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getDatasetRecommend", Seq(), "GET", """""", _prefix + """datasetRecommend""")
)
                      

// @LINE:47
def getRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getRecommend", Seq(), "GET", """ Analytics""", _prefix + """serviceLogRecommend""")
)
                      

// @LINE:49
def getScientistRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getScientistRecommend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getScientistRecommend", Seq(), "GET", """""", _prefix + """profileRecommend""")
)
                      

// @LINE:50
def getLogGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AnalyticsController.getLogGraph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AnalyticsController", "getLogGraph", Seq(), "GET", """""", _prefix + """serviceLogGraph""")
)
                      

}
                          

// @LINE:64
// @LINE:63
// @LINE:62
class ReverseAboutController {


// @LINE:63
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.aboutProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:64
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.tutorial(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "tutorial", Seq(), "GET", """""", _prefix + """tutorial""")
)
                      

// @LINE:62
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutController.aboutUs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AboutController", "aboutUs", Seq(), "GET", """ About""", _prefix + """aboutUs""")
)
                      

}
                          

// @LINE:55
// @LINE:54
class ReverseUsersController {


// @LINE:54
def getAllUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsersController.getAllUsers(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "getAllUsers", Seq(), "GET", """ Users""", _prefix + """scientist/allUsers""")
)
                      

// @LINE:55
def searchUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UsersController.searchUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UsersController", "searchUser", Seq(), "GET", """""", _prefix + """scientist/searchUser""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def createNewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createNewUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createNewUser", Seq(), "GET", """""", _prefix + """createNewUser""")
)
                      

// @LINE:12
def createSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSuccess(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createSuccess", Seq(), "GET", """""", _prefix + """createSuccess""")
)
                      

// @LINE:13
def isEmailExisted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isEmailExisted(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "isEmailExisted", Seq(), "POST", """""", _prefix + """isEmailExisted""")
)
                      

// @LINE:10
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "GET", """""", _prefix + """authenticate""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
class ReverseDatasetController {


// @LINE:41
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """dataSet/getSearchResult""")
)
                      

// @LINE:39
def showAllDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.showAllDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "showAllDatasets", Seq(), "GET", """ Dataset""", _prefix + """dataSet/allDatasets""")
)
                      

// @LINE:40
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """dataSet/searchDataSet""")
)
                      

}
                          

// @LINE:74
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseClimateServiceController {


// @LINE:24
def mostPopularServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostPopularServices", Seq(), "GET", """""", _prefix + """climateService/mostPopularServices""")
)
                      

// @LINE:26
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climateService/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:20
def serviceModels(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.serviceModels(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "serviceModels", Seq(), "POST", """""", _prefix + """assets/html/climateService/serviceModels""")
)
                      

// @LINE:17
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/add""")
)
                      

// @LINE:16
def showAllClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.showAllClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "showAllClimateServices", Seq(), "GET", """ Climate Service""", _prefix + """climateService/allServices""")
)
                      

// @LINE:19
def passPageStr(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.passPageStr(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "passPageStr", Seq(), "POST", """""", _prefix + """climateService/savePage""")
)
                      

// @LINE:29
def replaceFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.replaceFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "replaceFile", Seq(), "POST", """replace page""", _prefix + """climateService/replaceFile""")
)
                      

// @LINE:25
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climateService/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:18
def addAClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addAClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAClimateService", Seq(), "GET", """""", _prefix + """climateService/addAClimateService""")
)
                      

// @LINE:22
def ruleEngineData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.ruleEngineData(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "ruleEngineData", Seq(), "POST", """""", _prefix + """climateService/ruleEngineData""")
)
                      

// @LINE:74
def addAllParameters(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addAllParameters(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addAllParameters", Seq(), "POST", """ AddParameters""", _prefix + """climateService/addAllParameters""")
)
                      

}
                          
}
        
    