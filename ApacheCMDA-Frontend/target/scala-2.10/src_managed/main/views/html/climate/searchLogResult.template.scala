
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
object searchLogResult extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[metadata.ServiceLog],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(serviceLogs: List[metadata.ServiceLog]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
""")))};
Seq[Any](format.raw/*18.42*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*24.2*/("""

"""),_display_(Seq[Any](/*26.2*/main("Result Service Logs", scripts)/*26.38*/{_display_(Seq[Any](format.raw/*26.39*/("""
	
	"""),_display_(Seq[Any](/*28.3*/flash_message())),format.raw/*28.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*30.10*/serviceLogs/*30.21*/.size())),format.raw/*30.28*/(""" Service Logs Found</h1>

	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable3">
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
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*45.3*/for(serviceLog <- serviceLogs) yield /*45.33*/ {_display_(Seq[Any](format.raw/*45.35*/("""
	<tr>
	<td><font size="2">"""),_display_(Seq[Any](/*47.22*/serviceLog/*47.32*/.getServiceName)),format.raw/*47.47*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*48.22*/serviceLog/*48.32*/.getUserId)),format.raw/*48.42*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*49.22*/serviceLog/*49.32*/.getPurpose)),format.raw/*49.43*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*50.22*/serviceLog/*50.32*/.getExecutionStartTime)),format.raw/*50.54*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*51.22*/serviceLog/*51.32*/.getExecutionEndTime)),format.raw/*51.52*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*52.22*/serviceLog/*52.32*/.getDataSetStartTime)),format.raw/*52.52*/("""</font></td>
	<td><font size="2">"""),_display_(Seq[Any](/*53.22*/serviceLog/*53.32*/.getDataSetEndTime)),format.raw/*53.50*/("""</font></td>
	<td>
	"""),_display_(Seq[Any](/*55.3*/form(routes.ClimateServiceController.getConfigurationByConfId())/*55.67*/{_display_(Seq[Any](format.raw/*55.68*/("""
		<input
			name="serviceId" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*58.12*/serviceLog/*58.22*/.getServiceId)),format.raw/*58.35*/("""">  
		<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(Seq[Any](/*61.12*/serviceLog/*61.22*/.getServiceConfigurationId)),format.raw/*61.48*/(""""> 
		<input
			type="submit" value="see detail">
	""")))})),format.raw/*64.3*/("""
	</td>
	</tr>
	""")))})),format.raw/*67.3*/("""
	</table>
	""")))})))}
    }
    
    def render(serviceLogs:List[metadata.ServiceLog]): play.api.templates.HtmlFormat.Appendable = apply(serviceLogs)
    
    def f:((List[metadata.ServiceLog]) => play.api.templates.HtmlFormat.Appendable) = (serviceLogs) => apply(serviceLogs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:50 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/searchLogResult.scala.html
                    HASH: 536df5a2a555c0991e18db05f36d72819c39e083
                    MATRIX: 3206->1205|3340->1266|3355->1273|3440->1277|3492->1293|3507->1299|3569->1339|3622->1245|3651->1264|3679->1352|3717->1355|3762->1391|3801->1392|3841->1397|3878->1412|3930->1428|3950->1439|3979->1446|4758->2190|4804->2220|4844->2222|4908->2250|4927->2260|4964->2275|5034->2309|5053->2319|5085->2329|5155->2363|5174->2373|5207->2384|5277->2418|5296->2428|5340->2450|5410->2484|5429->2494|5471->2514|5541->2548|5560->2558|5602->2578|5672->2612|5691->2622|5731->2640|5787->2661|5860->2725|5899->2726|6005->2796|6024->2806|6059->2819|6165->2889|6184->2899|6232->2925|6315->2977|6363->2994
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->18|66->21|67->24|69->26|69->26|69->26|71->28|71->28|73->30|73->30|73->30|88->45|88->45|88->45|90->47|90->47|90->47|91->48|91->48|91->48|92->49|92->49|92->49|93->50|93->50|93->50|94->51|94->51|94->51|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|101->58|101->58|101->58|104->61|104->61|104->61|107->64|110->67
                    -- GENERATED --
                */
            