
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object serviceLog extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ServiceLog],play.data.Form[metadata.ServiceLog],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/(serviceLogs: List[metadata.ServiceLog], serviceLogForm: play.data.Form[metadata.ServiceLog]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*25.2*/scripts/*25.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.13*/("""
	<script src='"""),_display_(Seq[Any](/*26.16*/routes/*26.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*26.62*/("""'></script>
	<script src='"""),_display_(Seq[Any](/*27.16*/routes/*27.22*/.Assets.at("javascripts/livefilter.js"))),format.raw/*27.61*/("""'></script>
""")))};
Seq[Any](format.raw/*18.95*/("""

"""),format.raw/*21.1*/("""
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*23.9*/routes/*23.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*23.55*/("""'>
	
"""),format.raw/*28.2*/("""

"""),_display_(Seq[Any](/*30.2*/main("Service Execution Logs", scripts)/*30.41*/{_display_(Seq[Any](format.raw/*30.42*/("""
	
	"""),_display_(Seq[Any](/*32.3*/flash_message())),format.raw/*32.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*34.10*/serviceLogs/*34.21*/.size())),format.raw/*34.28*/(""" Service Logs Found</h1>
    <!-- 
    """),_display_(Seq[Any](/*36.6*/helper/*36.12*/.form(routes.AccountController.syncData())/*36.54*/ {_display_(Seq[Any](format.raw/*36.56*/("""
    	<div class = "col-sm-2">
    		<input class="btn btn-primary" type="submit" value="Sync data" style="margin-top:18px">
    	</div>
    """)))})),format.raw/*40.6*/("""
     -->
    """),_display_(Seq[Any](/*42.6*/helper/*42.12*/.form(routes.AccountController.getSearchServiceLog())/*42.65*/ {_display_(Seq[Any](format.raw/*42.67*/("""
    <div class = "container">
    	<div class = "col-sm-offset-2 col-sm-1">
    		<!-- """),_display_(Seq[Any](/*45.13*/inputText(serviceLogForm("User Id"),  'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "123"))),format.raw/*45.148*/(""" -->
    	</div>
    	<div class = "col-sm-4" >
    		"""),_display_(Seq[Any](/*48.8*/inputText(serviceLogForm("Start Time"), 'class -> "form-control", 'id -> "startTime", 'type -> "datetime-local", '_label -> Messages("Execution Start Time")))),format.raw/*48.165*/("""
    	</div>
    	<div class = "col-sm-4">
	    	"""),_display_(Seq[Any](/*51.8*/inputText(serviceLogForm("End Time"),  'class -> "form-control", 'id -> "endTime", 'type -> "datetime-local", '_label -> Messages("Execution End Time")))),format.raw/*51.160*/("""
    	</div>
    	<input class="btn btn-success" type="submit" value="Search" style="margin-top:23px">
    </div>
    """)))})),format.raw/*55.6*/("""

    <table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable2">
    <thead>
	<tr>
		<th style = "vertical-align: top;" class="col-sm-4">Service Name</td>
 		<th style = "vertical-align: top;" class="col-sm-2">User Name</td> 
		<th style = "vertical-align: top;" class="col-sm-2">Purpose</td>
		<th style = "vertical-align: top;" class="col-sm-2">Execution Start Time</td>
		<th style = "vertical-align: top;" class="col-sm-2">Execution End Time</td>		
		<th style = "vertical-align: top;" class="col-sm-1">DataSet Start Time</td>
		<th style = "vertical-align: top;" class="col-sm-1">DataSet End Time</td>
		<th style = "vertical-align: top;" class="col-sm-1">Details</td>
		<!-- 
		<td class="col-md-2">Operation</td>
		 -->
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*73.3*/for(serviceLog <- serviceLogs) yield /*73.33*/ {_display_(Seq[Any](format.raw/*73.35*/("""
	<tr>
	<td><font size="2">"""),_display_(Seq[Any](/*75.22*/serviceLog/*75.32*/.getServiceName)),format.raw/*75.47*/("""</font></td>
 	<td><font size="2">"""),_display_(Seq[Any](/*76.23*/serviceLog/*76.33*/.getUserId)),format.raw/*76.43*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*77.22*/serviceLog/*77.32*/.getPurpose)),format.raw/*77.43*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*78.22*/serviceLog/*78.32*/.getExecutionStartTime)),format.raw/*78.54*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*79.22*/serviceLog/*79.32*/.getExecutionEndTime)),format.raw/*79.52*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*80.22*/serviceLog/*80.32*/.getDataSetStartTime)),format.raw/*80.52*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*81.22*/serviceLog/*81.32*/.getDataSetEndTime)),format.raw/*81.50*/("""</font></td>
	<td>
	"""),_display_(Seq[Any](/*83.3*/form(routes.ClimateServiceController.getConfigurationByConfId())/*83.67*/{_display_(Seq[Any](format.raw/*83.68*/("""
		<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*86.12*/serviceLog/*86.22*/.getServiceExecutionLogId)),format.raw/*86.47*/("""">
		<input
			type="submit"  value="see details">
	""")))})),format.raw/*89.3*/("""
	</td>
	<!--  
	<td>
	"""),_display_(Seq[Any](/*93.3*/form(routes.ClimateServiceController.deleteServiceLog())/*93.59*/{_display_(Seq[Any](format.raw/*93.60*/(""" 
		<input
			name="idHolder" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*96.12*/serviceLog/*96.22*/.getServiceExecutionLogId)),format.raw/*96.47*/("""">
		<input
			type="submit" class="btn btn-primary delete-btn span2" value="Delete"
			onclick="return confirm('Are you sure you want to delete this log?')">
		""")))})),format.raw/*100.4*/("""
	</td>
	-->
	</tr>
	""")))})),format.raw/*104.3*/("""
    </table>

	""")))})))}
    }
    
    def render(serviceLogs:List[metadata.ServiceLog],serviceLogForm:play.data.Form[metadata.ServiceLog]): play.api.templates.HtmlFormat.Appendable = apply(serviceLogs,serviceLogForm)
    
    def f:((List[metadata.ServiceLog],play.data.Form[metadata.ServiceLog]) => play.api.templates.HtmlFormat.Appendable) = (serviceLogs,serviceLogForm) => apply(serviceLogs,serviceLogForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/serviceLog.scala.html
                    HASH: c8ba4cd7b9a835fe64c95f872a0ea4921c93081c
                    MATRIX: 3237->1205|3424->1401|3439->1408|3524->1412|3576->1428|3591->1434|3653->1474|3716->1501|3731->1507|3792->1546|3845->1298|3874->1317|3941->1349|3956->1355|4018->1395|4050->1559|4088->1562|4136->1601|4175->1602|4215->1607|4252->1622|4304->1638|4324->1649|4353->1656|4428->1696|4443->1702|4494->1744|4534->1746|4707->1888|4757->1903|4772->1909|4834->1962|4874->1964|4999->2053|5157->2188|5247->2243|5427->2400|5512->2450|5687->2602|5837->2721|6653->3502|6699->3532|6739->3534|6803->3562|6822->3572|6859->3587|6930->3622|6949->3632|6981->3642|7051->3676|7070->3686|7103->3697|7173->3731|7192->3741|7236->3763|7306->3797|7325->3807|7367->3827|7437->3861|7456->3871|7498->3891|7568->3925|7587->3935|7627->3953|7683->3974|7756->4038|7795->4039|7897->4105|7916->4115|7963->4140|8047->4193|8106->4217|8171->4273|8210->4274|8316->4344|8335->4354|8382->4379|8576->4541|8630->4563
                    LINES: 56->18|59->25|59->25|61->25|62->26|62->26|62->26|63->27|63->27|63->27|65->18|67->21|69->23|69->23|69->23|71->28|73->30|73->30|73->30|75->32|75->32|77->34|77->34|77->34|79->36|79->36|79->36|79->36|83->40|85->42|85->42|85->42|85->42|88->45|88->45|91->48|91->48|94->51|94->51|98->55|116->73|116->73|116->73|118->75|118->75|118->75|119->76|119->76|119->76|120->77|120->77|120->77|121->78|121->78|121->78|122->79|122->79|122->79|123->80|123->80|123->80|124->81|124->81|124->81|126->83|126->83|126->83|129->86|129->86|129->86|132->89|136->93|136->93|136->93|139->96|139->96|139->96|143->100|147->104
                    -- GENERATED --
                */
            