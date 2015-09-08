
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
object searchServiceLog extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ServiceLog],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(serviceLogForm: play.data.Form[metadata.ServiceLog]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">
	$(function() """),format.raw/*28.15*/("""{"""),format.raw/*28.16*/("""
	    var availableTags = [	      
	      "ARGO/ARGO",
	      "CCCMA/CANAM4",
	      "CSIRO/MK3.6",
	      "ECMWF/interim",
	      "GFDL/CM3",
	      "GFDL/ESM2G",
	      "GISS/E2-H",
	      "GISS/E2-R",
	      "IPSL/CM5A-LR",
	      "MIROC/MIROC5",
	      "NASA/AIRS",
	      "NASA/AMSRE",
	      "NASA/AVISO",
	      "NASA/CERES",
	      "NASA/GPCP",
	      "NASA/GRACE",
	      "NASA/MLS",
	      "NASA/MODIS",
	      "NASA/QuikSCAT",
	      "NASA/TRMM",
	      "NCAR/CAM5",
	      "NCC/NORESM",
	      "NOAA/NODC",
	      "UKMO/HadGEM2-A",
	      "UKMO/HadGEM2-ES"
	    ];
	    var availableTagsVariableName = ["Air Temperature",
					"Cloud Ice Water Content", "Cloud Liquid Water Content",
					"Eastward Near-Surface Wind",
					"Equivalent Water Height Over Land",
					"Equivalent Water Height Over Ocean", "Leaf Area Index",
					"Near-Surface Air Temperature",
					"Near-Surface Relative Humidity",
					"Near-Surface Wind Speed", "Northward Near-Surface Wind",
					"Ocean Heat Content Anomaly within 2000 m Depth",
					"Ocean Heat Content Anomaly within 700 m Depth",
					"Ocean Salinity", "Ocean Temperature",
					"Precipitation Flux", "Precipitation", "Relative Humidity",
					"Sea Surface Height", "Sea Surface Temperature",
					"Specific Humidity",
					"Surface Downwelling Clear-Sky Longwave Radiation",
					"Surface Downwelling Clear-Sky Shortwave Radiation",
					"Surface Downwelling Longwave Radiation",
					"Surface Downwelling Shortwave Radiation",
					"Surface Temperature",
					"Surface Upwelling Clear-Sky Shortwave Radiation",
					"Surface Upwelling Longwave Radiation",
					"Surface Upwelling Shortwave Radiation",
					"TOA Incident Shortwave Radiation",
					"TOA Outgoing Clear-Sky Longwave Radiation",
					"TOA Outgoing Clear-Sky Shortwave Radiation",
					"TOA Outgoing Longwave Radiation",
					"TOA Outgoing Shortwave Radiation", "Total Cloud Fraction",
					"Vertical Wind Velocity" ];
			$("#dataSource").autocomplete("""),format.raw/*84.34*/("""{"""),format.raw/*84.35*/("""
				source : availableTags
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/(""");
			$("#variableName").autocomplete("""),format.raw/*87.36*/("""{"""),format.raw/*87.37*/("""
				source : availableTagsVariableName
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/(""");
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/(""");

		$(document).ready(
				function() """),format.raw/*93.16*/("""{"""),format.raw/*93.17*/("""
					$("#preview").click(
							function() """),format.raw/*95.19*/("""{"""),format.raw/*95.20*/("""
								var target = document.getElementById("show");
								if (target.style.display == "none") """),format.raw/*97.45*/("""{"""),format.raw/*97.46*/("""
									target.style.display = "block";
									$("#preview").text("Hide");
									var dataS = $("#dataSource").val();
									var varName = $("#variableName").val();
									var exectionPurpose = $("#exectionPurpose")
											.val();
									/* var userId = $("#userId").val(); */
									var executionStartTime = $(
											"#executionStartTime").val();
									var executionEndTime = $(
											"#executionEndTime").val();
									var dataSetStartTime = $(
											"#dataSetStartTime").val();
									var dataSetEndTime = $("#dataSetEndTime")
											.val();

									/* var startLon = $("#startLon").val();
									var endLon = $("#endLon").val();
									var startPre = $("#startPre").val();
									var endPre = $("#endPre").val(); */
									if (dataS != "") """),format.raw/*118.27*/("""{"""),format.raw/*118.28*/("""
										$("#content").append(
												" Data Source = " + dataS);
									"""),format.raw/*121.10*/("""}"""),format.raw/*121.11*/("""
									if (varName != "" && varName != null) """),format.raw/*122.48*/("""{"""),format.raw/*122.49*/("""
										$("#content").append(
												" Variable Name = " + varName);
									"""),format.raw/*125.10*/("""}"""),format.raw/*125.11*/("""
									if (exectionPurpose != ""
											&& exectionPurpose != null) """),format.raw/*127.40*/("""{"""),format.raw/*127.41*/("""
										$("#content").append(
												" Exection Purpose = "
														+ exectionPurpose);
									"""),format.raw/*131.10*/("""}"""),format.raw/*131.11*/("""
									/* if(userId!="" && userId!=null)"""),format.raw/*132.43*/("""{"""),format.raw/*132.44*/("""
										$("#content").append(" UserId = "+userId);	
									"""),format.raw/*134.10*/("""}"""),format.raw/*134.11*/(""" */
									if (executionStartTime != ""
											&& executionStartTime != null) """),format.raw/*136.43*/("""{"""),format.raw/*136.44*/("""
										$("#content").append(
												" Execution Start Time = "
														+ executionStartTime);
									"""),format.raw/*140.10*/("""}"""),format.raw/*140.11*/("""
									if (executionEndTime != ""
											&& executionEndTime != null) """),format.raw/*142.41*/("""{"""),format.raw/*142.42*/("""
										$("#content").append(
												"Execution End Time = "
														+ executionEndTime);
									"""),format.raw/*146.10*/("""}"""),format.raw/*146.11*/("""
									if (dataSetStartTime != ""
											&& dataSetStartTime != null) """),format.raw/*148.41*/("""{"""),format.raw/*148.42*/("""
										$("#content").append(
												" DataSet Start Time = "
														+ dataSetStartTime);
									"""),format.raw/*152.10*/("""}"""),format.raw/*152.11*/("""
									if (dataSetEndTime != ""
											&& dataSetEndTime != null) """),format.raw/*154.39*/("""{"""),format.raw/*154.40*/("""
										$("#content").append(
												" DataSet End Time = "
														+ dataSetEndTime);
									"""),format.raw/*158.10*/("""}"""),format.raw/*158.11*/("""

								"""),format.raw/*160.9*/("""}"""),format.raw/*160.10*/(""" else """),format.raw/*160.16*/("""{"""),format.raw/*160.17*/("""
									$("#content").val('');
									target.style.display = "none";
									$("#preview").text("Preview");
								"""),format.raw/*164.9*/("""}"""),format.raw/*164.10*/("""
							"""),format.raw/*165.8*/("""}"""),format.raw/*165.9*/(""");
				"""),format.raw/*166.5*/("""}"""),format.raw/*166.6*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.55*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*168.2*/("""

"""),_display_(Seq[Any](/*170.2*/main("Search Execution Service Logs", scripts)/*170.48*/ {_display_(Seq[Any](format.raw/*170.50*/("""
	
	"""),_display_(Seq[Any](/*172.3*/flash_message())),format.raw/*172.18*/("""   
	
    <h1 style="margin-left:360px"> Search Service Execution Log</h1>
    
    """),_display_(Seq[Any](/*176.6*/helper/*176.12*/.form(routes.AccountController.getSearchServiceLogOneDimension())/*176.77*/ {_display_(Seq[Any](format.raw/*176.79*/("""
    	<!-- """),_display_(Seq[Any](/*177.12*/select(serviceLogForm("Data Source"), options(Seq("NASA/MODIS","NASA/AMSRE","NASA/TRMM","NASA/GPCP","NASA/QuikSCAT","NASA/AVISO","NASA/GRACE","")), '_label -> "Data Source", '_default -> "", 'style->"width: 290px"))),format.raw/*177.226*/("""  --> 
    	<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*180.8*/inputText(serviceLogForm("Data Source"),'class -> "form-control", 'id -> "dataSource", '_label -> Messages("Data Source"), 'placeholder -> "NASA/MODIS", 'size->70))),format.raw/*180.171*/(""" 
    	</div>
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*183.8*/inputText(serviceLogForm("Variable Name"),'class -> "form-control", 'id -> "variableName", '_label -> Messages("Variable Name"), 'placeholder -> "Total Cloud Fraction", 'size->70))),format.raw/*183.187*/(""" 
    	</div>
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*186.8*/inputText(serviceLogForm("Execution Purpose"),'class -> "form-control", 'id -> "exectionPurpose", '_label -> Messages("Execution Purpose"), 'placeholder -> "test", 'size->70))),format.raw/*186.182*/(""" 
       	</div>
       	<!-- <div class = "form-group">
       		"""),_display_(Seq[Any](/*189.11*/inputText(serviceLogForm("User Id"),'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "123", 'size->70))),format.raw/*189.155*/("""
	    </div> -->
	    <div class = "form-group">
	    	"""),_display_(Seq[Any](/*192.8*/inputText(serviceLogForm("Execution Start Time"),'class -> "form-control", 'id -> "executionStartTime", '_label -> Messages("Execution Start Time"), 'placeholder -> "MM/DD/YYYY hh:mm", 'size->70))),format.raw/*192.203*/("""
	    	"""),_display_(Seq[Any](/*193.8*/inputText(serviceLogForm("Execution End Time"),'class -> "form-control", 'id -> "executionEndTime", '_label -> Messages("Execution End Time"), 'placeholder -> "MM/DD/YYYY hh:mm", 'size->70))),format.raw/*193.197*/("""
	    	<!-- """),_display_(Seq[Any](/*194.13*/inputText(serviceLogForm("Start Latitude"),'class -> "form-control",'id -> "startLa", '_label -> Messages("Start Latitude"), 'placeholder -> "-90", 'size->70))),format.raw/*194.171*/("""
	    	"""),_display_(Seq[Any](/*195.8*/inputText(serviceLogForm("End Latitude"),'class -> "form-control",'id -> "endLa", '_label -> Messages("End Latitude"), 'placeholder -> "90", 'size->70))),format.raw/*195.159*/(""" -->
	    	
	    </div>
	    <div class = "form-group">
	    	"""),_display_(Seq[Any](/*199.8*/inputText(serviceLogForm("Dataset Start Time"),'class -> "form-control", 'id -> "dataSetStartTime", '_label -> Messages("Dataset Start Time"), 'placeholder -> "YYYYMM", 'size->70))),format.raw/*199.187*/("""
	    	"""),_display_(Seq[Any](/*200.8*/inputText(serviceLogForm("Dataset End Time"),'class -> "form-control", 'id -> "dataSetEndTime", '_label -> Messages("Dataset End Time"), 'placeholder -> "YYYYMM", 'size->70))),format.raw/*200.181*/("""
	    	
	    	<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    <button id="preview" type="button" class="btn btn-info"> Preview</button>	
	    <input class="btn" type="submit" value="Search" >
	    </div>
	    </div>
	    """)))})),format.raw/*211.7*/("""
""")))})))}
    }
    
    def render(serviceLogForm:play.data.Form[metadata.ServiceLog]): play.api.templates.HtmlFormat.Appendable = apply(serviceLogForm)
    
    def f:((play.data.Form[metadata.ServiceLog]) => play.api.templates.HtmlFormat.Appendable) = (serviceLogForm) => apply(serviceLogForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/searchServiceLog.scala.html
                    HASH: b164e12c81af92d3939a99798caf21cb3411470f
                    MATRIX: 3217->1205|3364->1279|3379->1286|3464->1290|3516->1306|3531->1312|3593->1352|3900->1631|3929->1632|5927->3602|5956->3603|6014->3634|6042->3635|6108->3673|6137->3674|6207->3717|6235->3718|6267->3723|6295->3724|6363->3764|6392->3765|6465->3810|6494->3811|6621->3910|6650->3911|7477->4709|7507->4710|7618->4792|7648->4793|7725->4841|7755->4842|7870->4928|7900->4929|8004->5004|8034->5005|8174->5116|8204->5117|8276->5160|8306->5161|8399->5225|8429->5226|8542->5310|8572->5311|8719->5429|8749->5430|8855->5507|8885->5508|9027->5621|9057->5622|9163->5699|9193->5700|9336->5814|9366->5815|9468->5888|9498->5889|9637->5999|9667->6000|9705->6010|9735->6011|9770->6017|9800->6018|9949->6139|9979->6140|10015->6148|10044->6149|10079->6156|10108->6157|10163->1258|10192->1277|10221->6172|10260->6175|10316->6221|10357->6223|10398->6228|10436->6243|10557->6328|10573->6334|10648->6399|10689->6401|10738->6413|10976->6627|11112->6727|11299->6890|11388->6943|11591->7122|11680->7175|11878->7349|11982->7416|12150->7560|12242->7616|12461->7811|12505->7819|12718->8008|12768->8021|12950->8179|12994->8187|13169->8338|13268->8401|13471->8580|13515->8588|13712->8761|14085->9102
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|67->28|67->28|123->84|123->84|125->86|125->86|126->87|126->87|128->89|128->89|129->90|129->90|132->93|132->93|134->95|134->95|136->97|136->97|157->118|157->118|160->121|160->121|161->122|161->122|164->125|164->125|166->127|166->127|170->131|170->131|171->132|171->132|173->134|173->134|175->136|175->136|179->140|179->140|181->142|181->142|185->146|185->146|187->148|187->148|191->152|191->152|193->154|193->154|197->158|197->158|199->160|199->160|199->160|199->160|203->164|203->164|204->165|204->165|205->166|205->166|208->18|210->21|211->168|213->170|213->170|213->170|215->172|215->172|219->176|219->176|219->176|219->176|220->177|220->177|223->180|223->180|226->183|226->183|229->186|229->186|232->189|232->189|235->192|235->192|236->193|236->193|237->194|237->194|238->195|238->195|242->199|242->199|243->200|243->200|254->211
                    -- GENERATED --
                */
            