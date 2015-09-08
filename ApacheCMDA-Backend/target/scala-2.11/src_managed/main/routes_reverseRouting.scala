// @SOURCE:/Users/mingqi/git/ApacheCMDA-Backend/conf/routes
// @HASH:73b57dec301e9888106f2ecbbfcaca49095b5715
// @DATE:Wed Sep 02 14:54:15 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:138
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers {

// @LINE:138
class ReverseAssets {


// @LINE:138
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
class ReverseBookChapterPublicationController {


// @LINE:118
def updateBookChapterPublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "BookChapterPublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:116
def getBookChapterPublication(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookChapterPublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:119
def deleteBookChapterPublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "BookChapterPublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:115
def getAllBookChapterPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookChapterPublication/getAllBookPublications/json")
}
                        

// @LINE:117
def addBookChapterPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "BookChapterPublication/addBookPublication")
}
                        

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseServiceConfigurationController {


// @LINE:41
def getServiceConfigurationsByUser(userId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfiguration/getAllServiceConfigurationsByUserId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/json")
}
                        

// @LINE:37
def getServiceConfiguration(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfiguration/getServiceConfiguration/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:39
def updateServiceConfigurationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceConfiguration/updateServiceConfiguration/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:38
def addServiceConfiguration(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceConfiguration/addServiceConfiguration")
}
                        

// @LINE:40
def deleteServiceConfiguration(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceConfiguration/deleteServiceConfiguration/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseInstrumentController {


// @LINE:77
def getAllInstruments(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getAllInstruments/json")
}
                        

// @LINE:78
def getInstrument(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:79
def addInstrument(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "instrument/addInstrument")
}
                        

// @LINE:80
def updateInstrumentById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "instrument/updateInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:81
def deleteInstrument(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "instrument/deleteInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseWorkflowController {


// @LINE:74
def generateWorkflowJson(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/generateWorkflowJson")
}
                        

// @LINE:71
def addWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/addWorkflow")
}
                        

// @LINE:69
def getAllWorkflows(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getAllWorkflows/json")
}
                        

// @LINE:70
def getWorkflowById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getWorkflowById/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:73
def deleteWorkflowById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "workflow/deleteWorkflowById/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                        

// @LINE:72
def updateWorkflowById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "workflow/updateWorkflowById/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseServiceExecutionLogController {


// @LINE:57
def deleteServiceExecutionLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceExecutionLog/deleteServiceExecutionLogs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:54
def addServiceExecutionLog(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceExecutionLog/addServiceExecutionLog")
}
                        

// @LINE:55
def queryServiceExecutionLogs(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceExecutionLog/queryServiceExecutionLogs")
}
                        

// @LINE:53
def getServiceExecutionLog(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceExecutionLog/getServiceExecutionLog/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:52
def getAllServiceExecutionLogs(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "serviceExecutionLog/getAllServiceExecutionLog")
}
                        

// @LINE:56
def updateServiceExecutionLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceExecutionLog/updateServiceExecutionLogs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
class ReverseConferencePublicationController {


// @LINE:125
def updateConferencePublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "ConferencePublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:123
def getConferencePublication(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "ConferencePublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:124
def addConferencePublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "ConferencePublication/addBookPublication")
}
                        

// @LINE:126
def deleteConferencePublication(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "ConferencePublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:122
def getAllConferencePublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "ConferencePublication/getAllBookPublications/json")
}
                        

}
                          

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseDatasetLogController {


// @LINE:62
def getAllDatasetLogs(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getAllDatasetLogs/json")
}
                        

// @LINE:65
def updateDatasetLogById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "datasetLog/updateDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:64
def addDatasetLog(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "datasetLog/addDatasetLog")
}
                        

// @LINE:63
def getDatasetLog(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "datasetLog/getDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:66
def deleteDatasetLog(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "datasetLog/deleteDatasetLog/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseBugReportController {


// @LINE:28
def getBugReport(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:29
def getAllBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllBugReports/json")
}
                        

// @LINE:32
def addBugReport(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "bugReport/addBugReport")
}
                        

// @LINE:30
def getAllUnsolvedBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllUnsolvedBugReports/json")
}
                        

// @LINE:34
def deleteBugReport(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "bugReport/deleteBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:33
def updateBugReportById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "bugReport/updateBugReport/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:31
def getAllSolvedBugReports(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllSolvedBugReports/json")
}
                        

}
                          

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
class ReverseJournalPublicationController {


// @LINE:102
def getJournalPublicationById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "journalPublication/getJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:101
def getAllJournalPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "journalPublication/getAllJournalPublications/json")
}
                        

// @LINE:105
def deleteJournalPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "journalPublication/deleteJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:104
def updateJournalPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "journalPublication/updateJournalPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:103
def addJournalPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "journalPublication/addJournalPublication")
}
                        

}
                          

// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
class ReverseUserController {


// @LINE:130
def addUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/add")
}
                        

// @LINE:129
def getUser(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:131
def updateUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "users/update/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:133
def getAllUsers(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getAllUsers/json")
}
                        

// @LINE:132
def deleteUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:135
def deleteUserByUserNameandPassword(userName:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/userName/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/password/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

// @LINE:134
def isUserValid(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/isUserValid")
}
                        

}
                          

// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseParameterController {


// @LINE:92
def getAllParameters(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getAllParameters/json")
}
                        

// @LINE:94
def getParameterById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:96
def updateParameterById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:93
def getParameterByName(id:Long, name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:97
def updateParameterByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:98
def deleteParameterByName(id:Long, name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "parameter/deleteParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:95
def addParameter(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "parameter/addParameter")
}
                        

}
                          

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
class ReverseDatasetController {


// @LINE:85
def getDataset(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:84
def getAllDatasets(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getAllDatasets/json")
}
                        

// @LINE:89
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/queryDataset")
}
                        

// @LINE:88
def deleteDataset(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "dataset/deleteDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:86
def addDataset(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/addDataset")
}
                        

// @LINE:87
def updateDatasetById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "dataset/updateDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseServiceConfigurationItemController {


// @LINE:45
def getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemByServiceConfig/" + implicitly[PathBindable[Long]].unbind("serviceConfigId", serviceConfigId))
}
                        

// @LINE:48
def updateServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "serviceConfigurationItem/updateServiceConfigurationItem/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:44
def getServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemById/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:47
def addServiceConfigurationItem(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serviceConfigurationItem/addServiceConfigurationItem")
}
                        

// @LINE:49
def deleteServiceConfigurationItemById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "serviceConfigurationItem/deleteServiceConfigurationItemById/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:46
def getServiceConfigurationItemByParameterId(paramId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "serviceConfigurationItem/serviceConfigurationItemByParamId/" + implicitly[PathBindable[Long]].unbind("paramId", paramId))
}
                        

}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByCreateTime/json")
}
                        

// @LINE:21
def deleteClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def getAllClimateServicesOrderByCount(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostUsedClimateServices/json")
}
                        

// @LINE:18
def addServiceEntry(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addServiceEntry")
}
                        

// @LINE:25
def savePage(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/savePage")
}
                        

// @LINE:16
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addClimateService")
}
                        

// @LINE:12
def getAllClimateServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllClimateServices/json")
}
                        

// @LINE:10
def getClimateService(name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:19
def updateClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def getClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json")
}
                        

// @LINE:17
def getAllServiceEntries(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllServiceEntries/json")
}
                        

// @LINE:20
def updateClimateServiceByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:22
def deleteClimateServiceByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

}
                          

// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
class ReverseBookPublicationController {


// @LINE:110
def addBookPublication(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "BookPublication/addBookPublication")
}
                        

// @LINE:108
def getAllBookPublications(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookPublication/getAllBookPublications/json")
}
                        

// @LINE:112
def deleteBookPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "BookPublication/deleteBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:109
def getBookPublicationById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "BookPublication/getBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:111
def updateBookPublicationById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "BookPublication/updateBookPublication/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:138
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:138
class ReverseAssets {


// @LINE:138
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
class ReverseBookChapterPublicationController {


// @LINE:118
def updateBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.updateBookChapterPublication",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:116
def getBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.getBookChapterPublication",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:119
def deleteBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.deleteBookChapterPublication",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:115
def getAllBookChapterPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.getAllBookChapterPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/getAllBookPublications/json"})
      }
   """
)
                        

// @LINE:117
def addBookChapterPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookChapterPublicationController.addBookChapterPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "BookChapterPublication/addBookPublication"})
      }
   """
)
                        

}
              

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseServiceConfigurationController {


// @LINE:41
def getServiceConfigurationsByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.getServiceConfigurationsByUser",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/getAllServiceConfigurationsByUserId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/json"})
      }
   """
)
                        

// @LINE:37
def getServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.getServiceConfiguration",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/getServiceConfiguration/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:39
def updateServiceConfigurationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.updateServiceConfigurationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/updateServiceConfiguration/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def addServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.addServiceConfiguration",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/addServiceConfiguration"})
      }
   """
)
                        

// @LINE:40
def deleteServiceConfiguration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationController.deleteServiceConfiguration",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfiguration/deleteServiceConfiguration/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseInstrumentController {


// @LINE:77
def getAllInstruments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getAllInstruments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getAllInstruments/json"})
      }
   """
)
                        

// @LINE:78
def getInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getInstrument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:79
def addInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.addInstrument",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/addInstrument"})
      }
   """
)
                        

// @LINE:80
def updateInstrumentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.updateInstrumentById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/updateInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:81
def deleteInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.deleteInstrument",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/deleteInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseWorkflowController {


// @LINE:74
def generateWorkflowJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.generateWorkflowJson",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/generateWorkflowJson"})
      }
   """
)
                        

// @LINE:71
def addWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/addWorkflow"})
      }
   """
)
                        

// @LINE:69
def getAllWorkflows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getAllWorkflows",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getAllWorkflows/json"})
      }
   """
)
                        

// @LINE:70
def getWorkflowById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getWorkflowById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getWorkflowById/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:73
def deleteWorkflowById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteWorkflowById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/deleteWorkflowById/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:72
def updateWorkflowById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.updateWorkflowById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/updateWorkflowById/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseServiceExecutionLogController {


// @LINE:57
def deleteServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.deleteServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/deleteServiceExecutionLogs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:54
def addServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.addServiceExecutionLog",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/addServiceExecutionLog"})
      }
   """
)
                        

// @LINE:55
def queryServiceExecutionLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.queryServiceExecutionLogs",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/queryServiceExecutionLogs"})
      }
   """
)
                        

// @LINE:53
def getServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/getServiceExecutionLog/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:52
def getAllServiceExecutionLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.getAllServiceExecutionLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/getAllServiceExecutionLog"})
      }
   """
)
                        

// @LINE:56
def updateServiceExecutionLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceExecutionLogController.updateServiceExecutionLog",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceExecutionLog/updateServiceExecutionLogs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
class ReverseConferencePublicationController {


// @LINE:125
def updateConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.updateConferencePublication",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:123
def getConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.getConferencePublication",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:124
def addConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.addConferencePublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/addBookPublication"})
      }
   """
)
                        

// @LINE:126
def deleteConferencePublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.deleteConferencePublication",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:122
def getAllConferencePublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConferencePublicationController.getAllConferencePublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ConferencePublication/getAllBookPublications/json"})
      }
   """
)
                        

}
              

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseDatasetLogController {


// @LINE:62
def getAllDatasetLogs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getAllDatasetLogs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getAllDatasetLogs/json"})
      }
   """
)
                        

// @LINE:65
def updateDatasetLogById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.updateDatasetLogById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/updateDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:64
def addDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.addDatasetLog",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/addDatasetLog"})
      }
   """
)
                        

// @LINE:63
def getDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.getDatasetLog",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/getDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:66
def deleteDatasetLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetLogController.deleteDatasetLog",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetLog/deleteDatasetLog/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseBugReportController {


// @LINE:28
def getBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getBugReport",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def getAllBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllBugReports/json"})
      }
   """
)
                        

// @LINE:32
def addBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.addBugReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/addBugReport"})
      }
   """
)
                        

// @LINE:30
def getAllUnsolvedBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllUnsolvedBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllUnsolvedBugReports/json"})
      }
   """
)
                        

// @LINE:34
def deleteBugReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteBugReport",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/deleteBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def updateBugReportById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.updateBugReportById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/updateBugReport/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def getAllSolvedBugReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.getAllSolvedBugReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllSolvedBugReports/json"})
      }
   """
)
                        

}
              

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
class ReverseJournalPublicationController {


// @LINE:102
def getJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.getJournalPublicationById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/getJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:101
def getAllJournalPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.getAllJournalPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/getAllJournalPublications/json"})
      }
   """
)
                        

// @LINE:105
def deleteJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.deleteJournalPublicationById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/deleteJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:104
def updateJournalPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.updateJournalPublicationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/updateJournalPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:103
def addJournalPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JournalPublicationController.addJournalPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "journalPublication/addJournalPublication"})
      }
   """
)
                        

}
              

// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
class ReverseUserController {


// @LINE:130
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/add"})
      }
   """
)
                        

// @LINE:129
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:131
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.updateUser",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:133
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllUsers/json"})
      }
   """
)
                        

// @LINE:132
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:135
def deleteUserByUserNameandPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUserByUserNameandPassword",
   """
      function(userName,password) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/userName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:134
def isUserValid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.isUserValid",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/isUserValid"})
      }
   """
)
                        

}
              

// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseParameterController {


// @LINE:92
def getAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getAllParameters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getAllParameters/json"})
      }
   """
)
                        

// @LINE:94
def getParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:96
def updateParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:93
def getParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterByName",
   """
      function(id,name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:97
def updateParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:98
def deleteParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.deleteParameterByName",
   """
      function(id,name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/deleteParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:95
def addParameter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.addParameter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/addParameter"})
      }
   """
)
                        

}
              

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
class ReverseDatasetController {


// @LINE:85
def getDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getDataset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:84
def getAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getAllDatasets/json"})
      }
   """
)
                        

// @LINE:89
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/queryDataset"})
      }
   """
)
                        

// @LINE:88
def deleteDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.deleteDataset",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/deleteDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:86
def addDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.addDataset",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/addDataset"})
      }
   """
)
                        

// @LINE:87
def updateDatasetById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.updateDatasetById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/updateDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseServiceConfigurationItemController {


// @LINE:45
def getServiceConfigurationItemsInServiceConfig : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemsInServiceConfig",
   """
      function(serviceConfigId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemByServiceConfig/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("serviceConfigId", serviceConfigId)})
      }
   """
)
                        

// @LINE:48
def updateServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.updateServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/updateServiceConfigurationItem/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:44
def getServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:47
def addServiceConfigurationItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.addServiceConfigurationItem",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/addServiceConfigurationItem"})
      }
   """
)
                        

// @LINE:49
def deleteServiceConfigurationItemById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.deleteServiceConfigurationItemById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/deleteServiceConfigurationItemById/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def getServiceConfigurationItemByParameterId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ServiceConfigurationItemController.getServiceConfigurationItemByParameterId",
   """
      function(paramId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceConfigurationItem/serviceConfigurationItemByParamId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("paramId", paramId)})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCreateTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByCreateTime/json"})
      }
   """
)
                        

// @LINE:21
def deleteClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def getAllClimateServicesOrderByCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostUsedClimateServices/json"})
      }
   """
)
                        

// @LINE:18
def addServiceEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addServiceEntry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addServiceEntry"})
      }
   """
)
                        

// @LINE:25
def savePage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.savePage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/savePage"})
      }
   """
)
                        

// @LINE:16
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addClimateService"})
      }
   """
)
                        

// @LINE:12
def getAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllClimateServices/json"})
      }
   """
)
                        

// @LINE:10
def getClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateService",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:19
def updateClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def getClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateServiceById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByLatestAccessTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"})
      }
   """
)
                        

// @LINE:17
def getAllServiceEntries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllServiceEntries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllServiceEntries/json"})
      }
   """
)
                        

// @LINE:20
def updateClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:22
def deleteClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

}
              

// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
class ReverseBookPublicationController {


// @LINE:110
def addBookPublication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.addBookPublication",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/addBookPublication"})
      }
   """
)
                        

// @LINE:108
def getAllBookPublications : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.getAllBookPublications",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/getAllBookPublications/json"})
      }
   """
)
                        

// @LINE:112
def deleteBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.deleteBookPublicationById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/deleteBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:109
def getBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.getBookPublicationById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/getBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:111
def updateBookPublicationById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BookPublicationController.updateBookPublicationById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "BookPublication/updateBookPublication/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:138
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.ref {


// @LINE:138
class ReverseAssets {


// @LINE:138
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
class ReverseBookChapterPublicationController {


// @LINE:118
def updateBookChapterPublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).updateBookChapterPublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "updateBookChapterPublication", Seq(classOf[Long]), "PUT", """""", _prefix + """BookChapterPublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:116
def getBookChapterPublication(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getBookChapterPublication(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getBookChapterPublication", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """BookChapterPublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:119
def deleteBookChapterPublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).deleteBookChapterPublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "deleteBookChapterPublication", Seq(classOf[Long]), "DELETE", """""", _prefix + """BookChapterPublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:115
def getAllBookChapterPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).getAllBookChapterPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "getAllBookChapterPublications", Seq(classOf[String]), "GET", """ BookChapterPublication""", _prefix + """BookChapterPublication/getAllBookPublications/json""")
)
                      

// @LINE:117
def addBookChapterPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookChapterPublicationController]).addBookChapterPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookChapterPublicationController", "addBookChapterPublication", Seq(), "POST", """""", _prefix + """BookChapterPublication/addBookPublication""")
)
                      

}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseServiceConfigurationController {


// @LINE:41
def getServiceConfigurationsByUser(userId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfigurationsByUser(userId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfigurationsByUser", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """serviceConfiguration/getAllServiceConfigurationsByUserId/$userId<[^/]+>/json""")
)
                      

// @LINE:37
def getServiceConfiguration(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).getServiceConfiguration(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "getServiceConfiguration", Seq(classOf[Long], classOf[String]), "GET", """ Service Configuration""", _prefix + """serviceConfiguration/getServiceConfiguration/id/$id<[^/]+>/json""")
)
                      

// @LINE:39
def updateServiceConfigurationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).updateServiceConfigurationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "updateServiceConfigurationById", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceConfiguration/updateServiceConfiguration/id/$id<[^/]+>""")
)
                      

// @LINE:38
def addServiceConfiguration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).addServiceConfiguration(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "addServiceConfiguration", Seq(), "POST", """""", _prefix + """serviceConfiguration/addServiceConfiguration""")
)
                      

// @LINE:40
def deleteServiceConfiguration(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationController]).deleteServiceConfiguration(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationController", "deleteServiceConfiguration", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceConfiguration/deleteServiceConfiguration/$id<[^/]+>""")
)
                      

}
                          

// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseInstrumentController {


// @LINE:77
def getAllInstruments(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]), "GET", """ Instrument""", _prefix + """instrument/getAllInstruments/json""")
)
                      

// @LINE:78
def getInstrument(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """instrument/getInstrument/id/$id<[^/]+>/json""")
)
                      

// @LINE:79
def addInstrument(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument(), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Seq(), "POST", """""", _prefix + """instrument/addInstrument""")
)
                      

// @LINE:80
def updateInstrumentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]), "PUT", """""", _prefix + """instrument/updateInstrument/id/$id<[^/]+>""")
)
                      

// @LINE:81
def deleteInstrument(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]), "DELETE", """""", _prefix + """instrument/deleteInstrument/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseWorkflowController {


// @LINE:74
def generateWorkflowJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).generateWorkflowJson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "generateWorkflowJson", Seq(), "POST", """""", _prefix + """workflow/generateWorkflowJson""")
)
                      

// @LINE:71
def addWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addWorkflow", Seq(), "POST", """""", _prefix + """workflow/addWorkflow""")
)
                      

// @LINE:69
def getAllWorkflows(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllWorkflows(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getAllWorkflows", Seq(classOf[String]), "GET", """ Workflow""", _prefix + """workflow/getAllWorkflows/json""")
)
                      

// @LINE:70
def getWorkflowById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/getWorkflowById/id/$id<[^/]+>/json""")
)
                      

// @LINE:73
def deleteWorkflowById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflowById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflowById", Seq(classOf[Long]), "DELETE", """""", _prefix + """workflow/deleteWorkflowById/id/$id<[^/]+>/""")
)
                      

// @LINE:72
def updateWorkflowById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowById", Seq(classOf[Long]), "PUT", """""", _prefix + """workflow/updateWorkflowById/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseServiceExecutionLogController {


// @LINE:57
def deleteServiceExecutionLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).deleteServiceExecutionLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "deleteServiceExecutionLog", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceExecutionLog/deleteServiceExecutionLogs/$id<[^/]+>""")
)
                      

// @LINE:54
def addServiceExecutionLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).addServiceExecutionLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "addServiceExecutionLog", Seq(), "POST", """""", _prefix + """serviceExecutionLog/addServiceExecutionLog""")
)
                      

// @LINE:55
def queryServiceExecutionLogs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).queryServiceExecutionLogs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "queryServiceExecutionLogs", Seq(), "POST", """""", _prefix + """serviceExecutionLog/queryServiceExecutionLogs""")
)
                      

// @LINE:53
def getServiceExecutionLog(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getServiceExecutionLog(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getServiceExecutionLog", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """serviceExecutionLog/getServiceExecutionLog/$id<[^/]+>""")
)
                      

// @LINE:52
def getAllServiceExecutionLogs(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).getAllServiceExecutionLogs(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "getAllServiceExecutionLogs", Seq(classOf[String]), "GET", """ Service Execution Log""", _prefix + """serviceExecutionLog/getAllServiceExecutionLog""")
)
                      

// @LINE:56
def updateServiceExecutionLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceExecutionLogController]).updateServiceExecutionLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceExecutionLogController", "updateServiceExecutionLog", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceExecutionLog/updateServiceExecutionLogs/$id<[^/]+>""")
)
                      

}
                          

// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
class ReverseConferencePublicationController {


// @LINE:125
def updateConferencePublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).updateConferencePublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "updateConferencePublication", Seq(classOf[Long]), "PUT", """""", _prefix + """ConferencePublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:123
def getConferencePublication(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getConferencePublication(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getConferencePublication", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """ConferencePublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:124
def addConferencePublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).addConferencePublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "addConferencePublication", Seq(), "POST", """""", _prefix + """ConferencePublication/addBookPublication""")
)
                      

// @LINE:126
def deleteConferencePublication(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).deleteConferencePublication(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "deleteConferencePublication", Seq(classOf[Long]), "DELETE", """""", _prefix + """ConferencePublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:122
def getAllConferencePublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ConferencePublicationController]).getAllConferencePublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ConferencePublicationController", "getAllConferencePublications", Seq(classOf[String]), "GET", """ ConferencePublication""", _prefix + """ConferencePublication/getAllBookPublications/json""")
)
                      

}
                          

// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseDatasetLogController {


// @LINE:62
def getAllDatasetLogs(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getAllDatasetLogs(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getAllDatasetLogs", Seq(classOf[String]), "GET", """ DatasetLog""", _prefix + """datasetLog/getAllDatasetLogs/json""")
)
                      

// @LINE:65
def updateDatasetLogById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).updateDatasetLogById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "updateDatasetLogById", Seq(classOf[Long]), "PUT", """""", _prefix + """datasetLog/updateDatasetLog/id/$id<[^/]+>""")
)
                      

// @LINE:64
def addDatasetLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).addDatasetLog(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "addDatasetLog", Seq(), "POST", """""", _prefix + """datasetLog/addDatasetLog""")
)
                      

// @LINE:63
def getDatasetLog(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).getDatasetLog(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "getDatasetLog", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """datasetLog/getDatasetLog/id/$id<[^/]+>/json""")
)
                      

// @LINE:66
def deleteDatasetLog(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetLogController]).deleteDatasetLog(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetLogController", "deleteDatasetLog", Seq(classOf[Long]), "DELETE", """""", _prefix + """datasetLog/deleteDatasetLog/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseBugReportController {


// @LINE:28
def getBugReport(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getBugReport(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getBugReport", Seq(classOf[Long], classOf[String]), "GET", """ Bug Report""", _prefix + """bugReport/getBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:29
def getAllBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllBugReports/json""")
)
                      

// @LINE:32
def addBugReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).addBugReport(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "addBugReport", Seq(), "POST", """""", _prefix + """bugReport/addBugReport""")
)
                      

// @LINE:30
def getAllUnsolvedBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllUnsolvedBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllUnsolvedBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllUnsolvedBugReports/json""")
)
                      

// @LINE:34
def deleteBugReport(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).deleteBugReport(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "deleteBugReport", Seq(classOf[Long]), "DELETE", """""", _prefix + """bugReport/deleteBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:33
def updateBugReportById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).updateBugReportById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "updateBugReportById", Seq(classOf[Long]), "PUT", """""", _prefix + """bugReport/updateBugReport/id/$id<[^/]+>""")
)
                      

// @LINE:31
def getAllSolvedBugReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BugReportController]).getAllSolvedBugReports(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BugReportController", "getAllSolvedBugReports", Seq(), "GET", """""", _prefix + """bugReport/getAllSolvedBugReports/json""")
)
                      

}
                          

// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
class ReverseJournalPublicationController {


// @LINE:102
def getJournalPublicationById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getJournalPublicationById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getJournalPublicationById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """journalPublication/getJournalPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:101
def getAllJournalPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).getAllJournalPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "getAllJournalPublications", Seq(classOf[String]), "GET", """ JournalPublication""", _prefix + """journalPublication/getAllJournalPublications/json""")
)
                      

// @LINE:105
def deleteJournalPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).deleteJournalPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "deleteJournalPublicationById", Seq(classOf[Long]), "DELETE", """""", _prefix + """journalPublication/deleteJournalPublication/id/$id<[^/]+>""")
)
                      

// @LINE:104
def updateJournalPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).updateJournalPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "updateJournalPublicationById", Seq(classOf[Long]), "PUT", """""", _prefix + """journalPublication/updateJournalPublication/id/$id<[^/]+>""")
)
                      

// @LINE:103
def addJournalPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.JournalPublicationController]).addJournalPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JournalPublicationController", "addJournalPublication", Seq(), "POST", """""", _prefix + """journalPublication/addJournalPublication""")
)
                      

}
                          

// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
// @LINE:129
class ReverseUserController {


// @LINE:130
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addUser", Seq(), "POST", """""", _prefix + """users/add""")
)
                      

// @LINE:129
def getUser(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getUser", Seq(classOf[Long], classOf[String]), "GET", """ Users""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:131
def updateUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "updateUser", Seq(classOf[Long]), "PUT", """""", _prefix + """users/update/$id<[^/]+>""")
)
                      

// @LINE:133
def getAllUsers(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/getAllUsers/json""")
)
                      

// @LINE:132
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]), "DELETE", """""", _prefix + """users/delete/$id<[^/]+>""")
)
                      

// @LINE:135
def deleteUserByUserNameandPassword(userName:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""")
)
                      

// @LINE:134
def isUserValid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserValid", Seq(), "POST", """""", _prefix + """users/isUserValid""")
)
                      

}
                          

// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseParameterController {


// @LINE:92
def getAllParameters(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]), "GET", """ Parameter""", _prefix + """parameter/getAllParameters/json""")
)
                      

// @LINE:94
def getParameterById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/id/$id<[^/]+>/json""")
)
                      

// @LINE:96
def updateParameterById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]), "PUT", """""", _prefix + """parameter/updateParameter/id/$id<[^/]+>""")
)
                      

// @LINE:93
def getParameterByName(id:Long, name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""")
)
                      

// @LINE:97
def updateParameterByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]), "PUT", """""", _prefix + """parameter/updateParameter/name/$oldName<[^/]+>""")
)
                      

// @LINE:98
def deleteParameterByName(id:Long, name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""")
)
                      

// @LINE:95
def addParameter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Seq(), "POST", """""", _prefix + """parameter/addParameter""")
)
                      

}
                          

// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
class ReverseDatasetController {


// @LINE:85
def getDataset(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dataset/getDataset/id/$id<[^/]+>/json""")
)
                      

// @LINE:84
def getAllDatasets(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]), "GET", """ Dataset""", _prefix + """dataset/getAllDatasets/json""")
)
                      

// @LINE:89
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Seq(), "POST", """""", _prefix + """dataset/queryDataset""")
)
                      

// @LINE:88
def deleteDataset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]), "DELETE", """""", _prefix + """dataset/deleteDataset/id/$id<[^/]+>""")
)
                      

// @LINE:86
def addDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Seq(), "POST", """""", _prefix + """dataset/addDataset""")
)
                      

// @LINE:87
def updateDatasetById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]), "PUT", """""", _prefix + """dataset/updateDataset/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseServiceConfigurationItemController {


// @LINE:45
def getServiceConfigurationItemsInServiceConfig(serviceConfigId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemsInServiceConfig(serviceConfigId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemsInServiceConfig", Seq(classOf[Long]), "GET", """""", _prefix + """serviceConfigurationItem/serviceConfigurationItemByServiceConfig/$serviceConfigId<[^/]+>""")
)
                      

// @LINE:48
def updateServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).updateServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "updateServiceConfigurationItemById", Seq(classOf[Long]), "PUT", """""", _prefix + """serviceConfigurationItem/updateServiceConfigurationItem/id/$id<[^/]+>""")
)
                      

// @LINE:44
def getServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemById", Seq(classOf[Long]), "GET", """ Service Configuration Item""", _prefix + """serviceConfigurationItem/serviceConfigurationItemById/$id<[^/]+>""")
)
                      

// @LINE:47
def addServiceConfigurationItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).addServiceConfigurationItem(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "addServiceConfigurationItem", Seq(), "POST", """""", _prefix + """serviceConfigurationItem/addServiceConfigurationItem""")
)
                      

// @LINE:49
def deleteServiceConfigurationItemById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).deleteServiceConfigurationItemById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "deleteServiceConfigurationItemById", Seq(classOf[Long]), "DELETE", """""", _prefix + """serviceConfigurationItem/deleteServiceConfigurationItemById/$id<[^/]+>""")
)
                      

// @LINE:46
def getServiceConfigurationItemByParameterId(paramId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ServiceConfigurationItemController]).getServiceConfigurationItemByParameterId(paramId), HandlerDef(this.getClass.getClassLoader, "", "controllers.ServiceConfigurationItemController", "getServiceConfigurationItemByParameterId", Seq(classOf[Long]), "GET", """""", _prefix + """serviceConfigurationItem/serviceConfigurationItemByParamId/$paramId<[^/]+>""")
)
                      

}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json""")
)
                      

// @LINE:21
def deleteClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]), "DELETE", """""", _prefix + """climateService/deleteClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:15
def getAllClimateServicesOrderByCount(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostUsedClimateServices/json""")
)
                      

// @LINE:18
def addServiceEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Seq(), "POST", """""", _prefix + """climateService/addServiceEntry""")
)
                      

// @LINE:25
def savePage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).savePage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "savePage", Seq(), "POST", """ Save Climate Service Page""", _prefix + """climateService/savePage""")
)
                      

// @LINE:16
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/addClimateService""")
)
                      

// @LINE:12
def getAllClimateServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllClimateServices/json""")
)
                      

// @LINE:10
def getClimateService(name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]), "GET", """ Climate Service""", _prefix + """climateService/getClimateService/$name<[^/]+>/json""")
)
                      

// @LINE:19
def updateClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]), "PUT", """""", _prefix + """climateService/updateClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:11
def getClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]), "GET", """""", _prefix + """climateService/getClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""")
)
                      

// @LINE:17
def getAllServiceEntries(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllServiceEntries/json""")
)
                      

// @LINE:20
def updateClimateServiceByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]), "PUT", """""", _prefix + """climateService/updateClimateService/name/$oldName<[^/]+>""")
)
                      

// @LINE:22
def deleteClimateServiceByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]), "DELETE", """""", _prefix + """climateService/deleteClimateService/name/$name<[^/]+>""")
)
                      

}
                          

// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
class ReverseBookPublicationController {


// @LINE:110
def addBookPublication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).addBookPublication(), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "addBookPublication", Seq(), "POST", """""", _prefix + """BookPublication/addBookPublication""")
)
                      

// @LINE:108
def getAllBookPublications(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getAllBookPublications(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getAllBookPublications", Seq(classOf[String]), "GET", """ BookPublication""", _prefix + """BookPublication/getAllBookPublications/json""")
)
                      

// @LINE:112
def deleteBookPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).deleteBookPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "deleteBookPublicationById", Seq(classOf[Long]), "DELETE", """""", _prefix + """BookPublication/deleteBookPublication/id/$id<[^/]+>""")
)
                      

// @LINE:109
def getBookPublicationById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).getBookPublicationById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "getBookPublicationById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """BookPublication/getBookPublication/id/$id<[^/]+>/json""")
)
                      

// @LINE:111
def updateBookPublicationById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.BookPublicationController]).updateBookPublicationById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.BookPublicationController", "updateBookPublicationById", Seq(classOf[Long]), "PUT", """""", _prefix + """BookPublication/updateBookPublication/id/$id<[^/]+>""")
)
                      

}
                          
}
        
    