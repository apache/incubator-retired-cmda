
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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

/**/
object searchServiceLog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[ServiceExecutionLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceLogForm: play.data.Form[ServiceExecutionLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
	$(function() """),format.raw/*7.15*/("""{"""),format.raw/*7.16*/("""
	    """),format.raw/*8.6*/("""var availableTags = [	      
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
			$("#dataSource").autocomplete("""),format.raw/*63.34*/("""{"""),format.raw/*63.35*/("""
				"""),format.raw/*64.5*/("""source : availableTags
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/(""");
			$("#variableName").autocomplete("""),format.raw/*66.36*/("""{"""),format.raw/*66.37*/("""
				"""),format.raw/*67.5*/("""source : availableTagsVariableName
			"""),format.raw/*68.4*/("""}"""),format.raw/*68.5*/(""");
		"""),format.raw/*69.3*/("""}"""),format.raw/*69.4*/(""");

		$(document).ready(
				function() """),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
					"""),format.raw/*73.6*/("""$("#preview").click(
							function() """),format.raw/*74.19*/("""{"""),format.raw/*74.20*/("""
								"""),format.raw/*75.9*/("""var target = document.getElementById("show");
								if (target.style.display == "none") """),format.raw/*76.45*/("""{"""),format.raw/*76.46*/("""
									"""),format.raw/*77.10*/("""target.style.display = "block";
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
									var datasetStartTime = $(
											"#datasetStartTime").val();
									var datasetEndTime = $("#datasetEndTime")
											.val();

									/* var startLon = $("#startLon").val();
									var endLon = $("#endLon").val();
									var startPre = $("#startPre").val();
									var endPre = $("#endPre").val(); */
									if (dataS != "") """),format.raw/*97.27*/("""{"""),format.raw/*97.28*/("""
										"""),format.raw/*98.11*/("""$("#content").append(
												" Data Source = " + dataS);
									"""),format.raw/*100.10*/("""}"""),format.raw/*100.11*/("""
									"""),format.raw/*101.10*/("""if (varName != "" && varName != null) """),format.raw/*101.48*/("""{"""),format.raw/*101.49*/("""
										"""),format.raw/*102.11*/("""$("#content").append(
												" Variable Name = " + varName);
									"""),format.raw/*104.10*/("""}"""),format.raw/*104.11*/("""
									"""),format.raw/*105.10*/("""if (exectionPurpose != ""
											&& exectionPurpose != null) """),format.raw/*106.40*/("""{"""),format.raw/*106.41*/("""
										"""),format.raw/*107.11*/("""$("#content").append(
												" Exection Purpose = "
														+ exectionPurpose);
									"""),format.raw/*110.10*/("""}"""),format.raw/*110.11*/("""
									"""),format.raw/*111.10*/("""/* if(userId!="" && userId!=null)"""),format.raw/*111.43*/("""{"""),format.raw/*111.44*/("""
										"""),format.raw/*112.11*/("""$("#content").append(" UserId = "+userId);	
									"""),format.raw/*113.10*/("""}"""),format.raw/*113.11*/(""" """),format.raw/*113.12*/("""*/
									if (executionStartTime != ""
											&& executionStartTime != null) """),format.raw/*115.43*/("""{"""),format.raw/*115.44*/("""
										"""),format.raw/*116.11*/("""$("#content").append(
												" Execution Start Time = "
														+ executionStartTime);
									"""),format.raw/*119.10*/("""}"""),format.raw/*119.11*/("""
									"""),format.raw/*120.10*/("""if (executionEndTime != ""
											&& executionEndTime != null) """),format.raw/*121.41*/("""{"""),format.raw/*121.42*/("""
										"""),format.raw/*122.11*/("""$("#content").append(
												"Execution End Time = "
														+ executionEndTime);
									"""),format.raw/*125.10*/("""}"""),format.raw/*125.11*/("""
									"""),format.raw/*126.10*/("""if (datasetStartTime != ""
											&& datasetStartTime != null) """),format.raw/*127.41*/("""{"""),format.raw/*127.42*/("""
										"""),format.raw/*128.11*/("""$("#content").append(
												" Dataset Start Time = "
														+ datasetStartTime);
									"""),format.raw/*131.10*/("""}"""),format.raw/*131.11*/("""
									"""),format.raw/*132.10*/("""if (datasetEndTime != ""
											&& datasetEndTime != null) """),format.raw/*133.39*/("""{"""),format.raw/*133.40*/("""
										"""),format.raw/*134.11*/("""$("#content").append(
												" Dataset End Time = "
														+ datasetEndTime);
									"""),format.raw/*137.10*/("""}"""),format.raw/*137.11*/("""

								"""),format.raw/*139.9*/("""}"""),format.raw/*139.10*/(""" """),format.raw/*139.11*/("""else """),format.raw/*139.16*/("""{"""),format.raw/*139.17*/("""
									"""),format.raw/*140.10*/("""$("#content").val('');
									target.style.display = "none";
									$("#preview").text("Preview");
								"""),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""
							"""),format.raw/*144.8*/("""}"""),format.raw/*144.9*/(""");
				"""),format.raw/*145.5*/("""}"""),format.raw/*145.6*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*147.2*/("""


"""),_display_(/*150.2*/main("Search Execution Service Logs", scripts)/*150.48*/ {_display_(Seq[Any](format.raw/*150.50*/("""

    """),format.raw/*152.5*/("""<h1 style="margin-left:360px"> Search Service Execution Log</h1>
    
    """),_display_(/*154.6*/helper/*154.12*/.form(routes.ServiceExecutionLogController.getSearchServiceLog())/*154.77*/ {_display_(Seq[Any](format.raw/*154.79*/("""
    	"""),format.raw/*155.6*/("""<!-- """),_display_(/*155.12*/select(serviceLogForm("Data Source"), options(Seq("NASA/MODIS","NASA/AMSRE","NASA/TRMM","NASA/GPCP","NASA/QuikSCAT","NASA/AVISO","NASA/GRACE","")), '_label -> "Data Source", '_default -> "", 'style->"width: 290px")),format.raw/*155.226*/("""  """),format.raw/*155.228*/("""--> 
    	<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(/*158.8*/inputText(serviceLogForm("Data Source"),'class -> "form-control", 'id -> "dataSource", '_label -> Messages("Data Source"), 'placeholder -> "NASA/MODIS", 'size->70)),format.raw/*158.171*/(""" 
    	"""),format.raw/*159.6*/("""</div>
    	<div class = "form-group">
    		"""),_display_(/*161.8*/inputText(serviceLogForm("Variable Name"),'class -> "form-control", 'id -> "variableName", '_label -> Messages("Variable Name"), 'placeholder -> "Total Cloud Fraction", 'size->70)),format.raw/*161.187*/(""" 
    	"""),format.raw/*162.6*/("""</div>
    	<div class = "form-group">
    		"""),_display_(/*164.8*/inputText(serviceLogForm("Execution Purpose"),'class -> "form-control", 'id -> "exectionPurpose", '_label -> Messages("Execution Purpose"), 'placeholder -> "test", 'size->70)),format.raw/*164.182*/(""" 
       	"""),format.raw/*165.9*/("""</div>
       	<!-- <div class = "form-group">
       		"""),_display_(/*167.11*/inputText(serviceLogForm("User Id"),'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "123", 'size->70)),format.raw/*167.155*/("""
	    """),format.raw/*168.6*/("""</div> -->
	    <div class = "form-group">
	    	"""),_display_(/*170.8*/inputText(serviceLogForm("Execution Start Time"),'class -> "form-control", 'id -> "executionStartTime", '_label -> Messages("Execution Start Time"), 'placeholder -> "MM/DD/YYYY hh:mm", 'size->70)),format.raw/*170.203*/("""
	    	"""),_display_(/*171.8*/inputText(serviceLogForm("Execution End Time"),'class -> "form-control", 'id -> "executionEndTime", '_label -> Messages("Execution End Time"), 'placeholder -> "MM/DD/YYYY hh:mm", 'size->70)),format.raw/*171.197*/("""
	    	"""),format.raw/*172.7*/("""<!-- """),_display_(/*172.13*/inputText(serviceLogForm("Start Latitude"),'class -> "form-control",'id -> "startLa", '_label -> Messages("Start Latitude"), 'placeholder -> "-90", 'size->70)),format.raw/*172.171*/("""
	    	"""),_display_(/*173.8*/inputText(serviceLogForm("End Latitude"),'class -> "form-control",'id -> "endLa", '_label -> Messages("End Latitude"), 'placeholder -> "90", 'size->70)),format.raw/*173.159*/(""" """),format.raw/*173.160*/("""-->
	    	
	    </div>
	    <div class = "form-group">
	    	"""),_display_(/*177.8*/inputText(serviceLogForm("Dataset Start Time"),'class -> "form-control", 'id -> "datasetStartTime", '_label -> Messages("Dataset Start Time"), 'placeholder -> "YYYYMM", 'size->70)),format.raw/*177.187*/("""
	    	"""),_display_(/*178.8*/inputText(serviceLogForm("Dataset End Time"),'class -> "form-control", 'id -> "datasetEndTime", '_label -> Messages("Dataset End Time"), 'placeholder -> "YYYYMM", 'size->70)),format.raw/*178.181*/("""
	    	
	    	"""),format.raw/*180.7*/("""<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    <button id="preview" type="button" class="btn btn-info"> Preview</button>	
	    <input class="btn" type="submit" value="Search" >
	    </div>
	    </div>
	    """)))}),format.raw/*189.7*/("""
""")))}))}
  }

  def render(serviceLogForm:play.data.Form[ServiceExecutionLog]): play.twirl.api.HtmlFormat.Appendable = apply(serviceLogForm)

  def f:((play.data.Form[ServiceExecutionLog]) => play.twirl.api.HtmlFormat.Appendable) = (serviceLogForm) => apply(serviceLogForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/searchServiceLog.scala.html
                  HASH: 612eebae64df4fb52d2e7d5fd6aa1b2975440d0d
                  MATRIX: 763->1|902->75|916->82|996->86|1024->88|1097->134|1125->135|1157->141|3149->2105|3178->2106|3210->2111|3263->2137|3291->2138|3357->2176|3386->2177|3418->2182|3483->2220|3511->2221|3543->2226|3571->2227|3639->2267|3668->2268|3701->2274|3768->2313|3797->2314|3833->2323|3951->2413|3980->2414|4018->2424|4834->3212|4863->3213|4902->3224|5002->3295|5032->3296|5071->3306|5138->3344|5168->3345|5208->3356|5312->3431|5342->3432|5381->3442|5475->3507|5505->3508|5545->3519|5674->3619|5704->3620|5743->3630|5805->3663|5835->3664|5875->3675|5957->3728|5987->3729|6017->3730|6129->3813|6159->3814|6199->3825|6335->3932|6365->3933|6404->3943|6500->4010|6530->4011|6570->4022|6701->4124|6731->4125|6770->4135|6866->4202|6896->4203|6936->4214|7068->4317|7098->4318|7137->4328|7229->4391|7259->4392|7299->4403|7427->4502|7457->4503|7495->4513|7525->4514|7555->4515|7589->4520|7619->4521|7658->4531|7797->4642|7827->4643|7863->4651|7892->4652|7927->4659|7956->4660|8010->54|8038->73|8067->4675|8098->4679|8154->4725|8195->4727|8229->4733|8331->4808|8347->4814|8422->4879|8463->4881|8497->4887|8531->4893|8768->5107|8800->5109|8925->5207|9111->5370|9146->5377|9219->5423|9421->5602|9456->5609|9529->5655|9726->5829|9764->5839|9849->5896|10016->6040|10050->6046|10127->6096|10345->6291|10380->6299|10592->6488|10627->6495|10661->6501|10842->6659|10877->6667|11051->6818|11082->6819|11171->6881|11373->7060|11408->7068|11604->7241|11646->7255|12004->7582
                  LINES: 26->1|28->5|28->5|30->5|31->6|32->7|32->7|33->8|88->63|88->63|89->64|90->65|90->65|91->66|91->66|92->67|93->68|93->68|94->69|94->69|97->72|97->72|98->73|99->74|99->74|100->75|101->76|101->76|102->77|122->97|122->97|123->98|125->100|125->100|126->101|126->101|126->101|127->102|129->104|129->104|130->105|131->106|131->106|132->107|135->110|135->110|136->111|136->111|136->111|137->112|138->113|138->113|138->113|140->115|140->115|141->116|144->119|144->119|145->120|146->121|146->121|147->122|150->125|150->125|151->126|152->127|152->127|153->128|156->131|156->131|157->132|158->133|158->133|159->134|162->137|162->137|164->139|164->139|164->139|164->139|164->139|165->140|168->143|168->143|169->144|169->144|170->145|170->145|173->1|175->4|176->147|179->150|179->150|179->150|181->152|183->154|183->154|183->154|183->154|184->155|184->155|184->155|184->155|187->158|187->158|188->159|190->161|190->161|191->162|193->164|193->164|194->165|196->167|196->167|197->168|199->170|199->170|200->171|200->171|201->172|201->172|201->172|202->173|202->173|202->173|206->177|206->177|207->178|207->178|209->180|218->189
                  -- GENERATED --
              */
          