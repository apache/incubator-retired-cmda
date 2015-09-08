// @SOURCE:/Users/mingqi/git/ApacheCMDA-Frontend/conf/routes
// @HASH:eca2c99108c803652b52ba9b9ce3e1df5ff3a4fc
// @DATE:Fri Sep 04 16:33:43 PDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
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
// @LINE:7
// @LINE:6
package controllers {

// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
class ReverseAboutusController {
    

// @LINE:32
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:31
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseBugReportController {
    

// @LINE:24
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:28
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:27
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:26
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:25
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

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
class ReverseAccountController {
    

// @LINE:20
def getSearchAndGenerateWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchAndGenerateWorkflow")
}
                                                

// @LINE:13
def getSearchServiceLogForWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogWorkflow")
}
                                                

// @LINE:12
def getSearchServiceLog(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogTimeResult")
}
                                                

// @LINE:15
def getDatasetRecommend(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "datasetRecommend")
}
                                                

// @LINE:14
def getRecommend(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogRecommend")
}
                                                

// @LINE:18
def getScientistRecommend(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profileRecommend")
}
                                                

// @LINE:17
def getLogGraph(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogGraph")
}
                                                

// @LINE:11
def getSearchServiceLogOneDimension(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLogResult")
}
                                                

// @LINE:21
def getJsonData(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "generateWorkflowGetData")
}
                                                

// @LINE:16
def searchServiceLog(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "searchServiceLog")
}
                                                

// @LINE:10
def getServiceLog(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLog")
}
                                                

// @LINE:19
def syncData(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "syncData")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:52
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:51
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:45
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:38
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:44
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:40
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:36
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:46
def getConfigurationByConfId(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceLog/conf")
}
                                                

// @LINE:48
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:47
def deleteServiceLog(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/serviceLog")
}
                                                

// @LINE:43
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:39
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:37
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:41
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:35
// @LINE:7
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:7
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:35
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:42
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
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
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
class ReverseAboutusController {
    

// @LINE:32
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:31
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseBugReportController {
    

// @LINE:24
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:28
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:27
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:26
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:25
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

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
class ReverseAccountController {
    

// @LINE:20
def getSearchAndGenerateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getSearchAndGenerateWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchAndGenerateWorkflow"})
      }
   """
)
                        

// @LINE:13
def getSearchServiceLogForWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getSearchServiceLogForWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogWorkflow"})
      }
   """
)
                        

// @LINE:12
def getSearchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getSearchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogTimeResult"})
      }
   """
)
                        

// @LINE:15
def getDatasetRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getDatasetRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasetRecommend"})
      }
   """
)
                        

// @LINE:14
def getRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogRecommend"})
      }
   """
)
                        

// @LINE:18
def getScientistRecommend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getScientistRecommend",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileRecommend"})
      }
   """
)
                        

// @LINE:17
def getLogGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getLogGraph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogGraph"})
      }
   """
)
                        

// @LINE:11
def getSearchServiceLogOneDimension : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getSearchServiceLogOneDimension",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLogResult"})
      }
   """
)
                        

// @LINE:21
def getJsonData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getJsonData",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generateWorkflowGetData"})
      }
   """
)
                        

// @LINE:16
def searchServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.searchServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchServiceLog"})
      }
   """
)
                        

// @LINE:10
def getServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.getServiceLog",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLog"})
      }
   """
)
                        

// @LINE:19
def syncData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountController.syncData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "syncData"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:52
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:51
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:45
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:38
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:44
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:40
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:36
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:46
def getConfigurationByConfId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getConfigurationByConfId",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceLog/conf"})
      }
   """
)
                        

// @LINE:48
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:47
def deleteServiceLog : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteServiceLog",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/serviceLog"})
      }
   """
)
                        

// @LINE:43
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:39
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:37
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:41
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:35
// @LINE:7
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:42
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
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
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:56
class ReverseAssets {
    

// @LINE:56
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
class ReverseAboutusController {
    

// @LINE:32
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:31
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseBugReportController {
    

// @LINE:24
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:28
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:27
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:26
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:25
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

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
class ReverseAccountController {
    

// @LINE:20
def getSearchAndGenerateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getSearchAndGenerateWorkflow(), HandlerDef(this, "controllers.AccountController", "getSearchAndGenerateWorkflow", Seq(), "GET", """""", _prefix + """searchAndGenerateWorkflow""")
)
                      

// @LINE:13
def getSearchServiceLogForWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getSearchServiceLogForWorkflow(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLogForWorkflow", Seq(), "GET", """""", _prefix + """serviceLogWorkflow""")
)
                      

// @LINE:12
def getSearchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getSearchServiceLog(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLog", Seq(), "GET", """""", _prefix + """serviceLogTimeResult""")
)
                      

// @LINE:15
def getDatasetRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getDatasetRecommend(), HandlerDef(this, "controllers.AccountController", "getDatasetRecommend", Seq(), "GET", """""", _prefix + """datasetRecommend""")
)
                      

// @LINE:14
def getRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getRecommend(), HandlerDef(this, "controllers.AccountController", "getRecommend", Seq(), "GET", """""", _prefix + """serviceLogRecommend""")
)
                      

// @LINE:18
def getScientistRecommend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getScientistRecommend(), HandlerDef(this, "controllers.AccountController", "getScientistRecommend", Seq(), "GET", """""", _prefix + """profileRecommend""")
)
                      

// @LINE:17
def getLogGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getLogGraph(), HandlerDef(this, "controllers.AccountController", "getLogGraph", Seq(), "GET", """""", _prefix + """serviceLogGraph""")
)
                      

// @LINE:11
def getSearchServiceLogOneDimension(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getSearchServiceLogOneDimension(), HandlerDef(this, "controllers.AccountController", "getSearchServiceLogOneDimension", Seq(), "GET", """""", _prefix + """serviceLogResult""")
)
                      

// @LINE:21
def getJsonData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getJsonData(), HandlerDef(this, "controllers.AccountController", "getJsonData", Seq(), "GET", """""", _prefix + """generateWorkflowGetData""")
)
                      

// @LINE:16
def searchServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.searchServiceLog(), HandlerDef(this, "controllers.AccountController", "searchServiceLog", Seq(), "GET", """""", _prefix + """searchServiceLog""")
)
                      

// @LINE:10
def getServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.getServiceLog(), HandlerDef(this, "controllers.AccountController", "getServiceLog", Seq(), "GET", """""", _prefix + """serviceLog""")
)
                      

// @LINE:19
def syncData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountController.syncData(), HandlerDef(this, "controllers.AccountController", "syncData", Seq(), "POST", """""", _prefix + """syncData""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:51
class ReverseDatasetController {
    

// @LINE:53
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:52
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:51
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:45
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:38
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:44
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:40
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:36
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:46
def getConfigurationByConfId(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.getConfigurationByConfId(), HandlerDef(this, "controllers.ClimateServiceController", "getConfigurationByConfId", Seq(), "GET", """""", _prefix + """serviceLog/conf""")
)
                      

// @LINE:48
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:47
def deleteServiceLog(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteServiceLog(), HandlerDef(this, "controllers.ClimateServiceController", "deleteServiceLog", Seq(), "POST", """""", _prefix + """climate/delete/serviceLog""")
)
                      

// @LINE:43
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:39
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:37
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:41
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """home""")
)
                      

// @LINE:42
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    