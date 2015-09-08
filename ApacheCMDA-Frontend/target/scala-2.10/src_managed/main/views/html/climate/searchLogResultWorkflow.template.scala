
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
object searchLogResultWorkflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[metadata.ServiceLog],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(serviceLogs: List[metadata.ServiceLog], userId: String, start: String, end: String, jsonData: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
  	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
		var user = $('#user').text();
		var start = $('#start').text();
		var end = $('#end').text();
		$("#user2").val(user);
		$("#startTime2").val(start);
		$("#endTime2").val(end);
		
		if(jsonData!=null)"""),format.raw/*36.21*/("""{"""),format.raw/*36.22*/("""
			var jsonString = $('#jsonData').text();
	  	 	var obj = JSON.parse(jsonString);
	  	 	var data = "text/json;charset=utf-8," + encodeURIComponent(JSON.stringify(obj));
			
	  	 	$('<a href="data:' + data + '" download="data.json">download JSON</a>').appendTo('#download');
		"""),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""
		
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*18.104*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*47.2*/("""

"""),_display_(Seq[Any](/*49.2*/main("Result Service Logs", scripts)/*49.38*/{_display_(Seq[Any](format.raw/*49.39*/("""
	
	"""),_display_(Seq[Any](/*51.3*/flash_message())),format.raw/*51.18*/("""   
	<div id="download"></div>
	<div id="user" style="display: none">"""),_display_(Seq[Any](/*53.40*/userId)),format.raw/*53.46*/("""</div>
	<div id="start" style="display: none">"""),_display_(Seq[Any](/*54.41*/start)),format.raw/*54.46*/("""</div>
	<div id="end" style="display: none">"""),_display_(Seq[Any](/*55.39*/end)),format.raw/*55.42*/("""</div>
	<div id="jsonData" style="display: none;">"""),_display_(Seq[Any](/*56.45*/jsonData)),format.raw/*56.53*/("""</div>
	"""),_display_(Seq[Any](/*57.3*/helper/*57.9*/.form(routes.AccountController.getJsonData())/*57.54*/ {_display_(Seq[Any](format.raw/*57.56*/("""
    <div align="right">
    	<input type="hidden" id="user2" name="User Id"></input>
    	<input type="hidden" id="startTime2" name="Start Time"></input>
    	<input type="hidden" id="endTime2" name="End Time"></input>
		<input id="workflow-gen" type="submit" class="btn btn-info text-right" value="Generate Workflow"></input>
    </div>
    """)))})),format.raw/*64.6*/("""
    <h1>"""),_display_(Seq[Any](/*65.10*/serviceLogs/*65.21*/.size())),format.raw/*65.28*/(""" Service Logs</h1>

		<table class="table table-striped table-bordered table-condensed">
	<tr>
		<td>ServiceId</td>
		<td>User</td>
		<td>Purpose</td>
		<td>StartTime</td>
		<td>EndTime</td>
		<td>ServiceConfigurationId</td>
	</tr>
	"""),_display_(Seq[Any](/*76.3*/for(serviceLog <- serviceLogs) yield /*76.33*/ {_display_(Seq[Any](format.raw/*76.35*/("""
	<tr>
	<td>"""),_display_(Seq[Any](/*78.7*/serviceLog/*78.17*/.getServiceId)),format.raw/*78.30*/("""</td>
	<td>"""),_display_(Seq[Any](/*79.7*/serviceLog/*79.17*/.getUserId)),format.raw/*79.27*/("""</td>
	<td>"""),_display_(Seq[Any](/*80.7*/serviceLog/*80.17*/.getPurpose)),format.raw/*80.28*/("""</td>
	<td>"""),_display_(Seq[Any](/*81.7*/serviceLog/*81.17*/.getExecutionStartTime)),format.raw/*81.39*/("""</td>
	<td>"""),_display_(Seq[Any](/*82.7*/serviceLog/*82.17*/.getExecutionEndTime)),format.raw/*82.37*/("""</td>
	<td>
	"""),_display_(Seq[Any](/*84.3*/form(routes.ClimateServiceController.getConfigurationByConfId())/*84.67*/{_display_(Seq[Any](format.raw/*84.68*/(""" 
		<input
			name="serviceId" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*87.12*/serviceLog/*87.22*/.getServiceId)),format.raw/*87.35*/("""">  
		<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*90.12*/serviceLog/*90.22*/.getServiceConfigurationId)),format.raw/*90.48*/(""""> 
		<input
			type="submit" class="btn btn-link" value="see detail">
	""")))})),format.raw/*93.3*/("""
	</td>
	</tr>
	""")))})),format.raw/*96.3*/("""
	</table>
	""")))})))}
    }
    
    def render(serviceLogs:List[metadata.ServiceLog],userId:String,start:String,end:String,jsonData:String): play.api.templates.HtmlFormat.Appendable = apply(serviceLogs,userId,start,end,jsonData)
    
    def f:((List[metadata.ServiceLog],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (serviceLogs,userId,start,end,jsonData) => apply(serviceLogs,userId,start,end,jsonData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:50 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/searchLogResultWorkflow.scala.html
                    HASH: 72f22affadfd0c936ea70bc77cffa2bea6a56fec
                    MATRIX: 3242->1205|3438->1328|3453->1335|3538->1339|3590->1355|3605->1361|3667->1401|3991->1697|4020->1698|4251->1901|4280->1902|4585->2180|4613->2181|4645->2186|4673->2187|4732->1307|4761->1326|4789->2205|4827->2208|4872->2244|4911->2245|4951->2250|4988->2265|5094->2335|5122->2341|5205->2388|5232->2393|5313->2438|5338->2441|5425->2492|5455->2500|5499->2509|5513->2515|5567->2560|5607->2562|5982->2906|6028->2916|6048->2927|6077->2934|6346->3168|6392->3198|6432->3200|6480->3213|6499->3223|6534->3236|6581->3248|6600->3258|6632->3268|6679->3280|6698->3290|6731->3301|6778->3313|6797->3323|6841->3345|6888->3357|6907->3367|6949->3387|6998->3401|7071->3465|7110->3466|7217->3537|7236->3547|7271->3560|7377->3630|7396->3640|7444->3666|7548->3739|7596->3756
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|67->28|67->28|75->36|75->36|81->42|81->42|83->44|83->44|87->18|89->21|90->47|92->49|92->49|92->49|94->51|94->51|96->53|96->53|97->54|97->54|98->55|98->55|99->56|99->56|100->57|100->57|100->57|100->57|107->64|108->65|108->65|108->65|119->76|119->76|119->76|121->78|121->78|121->78|122->79|122->79|122->79|123->80|123->80|123->80|124->81|124->81|124->81|125->82|125->82|125->82|127->84|127->84|127->84|130->87|130->87|130->87|133->90|133->90|133->90|136->93|139->96
                    -- GENERATED --
                */
            