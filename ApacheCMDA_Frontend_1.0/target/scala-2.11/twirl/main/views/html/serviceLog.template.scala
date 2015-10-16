
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
object serviceLog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[ServiceExecutionLog],play.data.Form[ServiceExecutionLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceLogs: List[ServiceExecutionLog], serviceLogForm: play.data.Form[ServiceExecutionLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Service Logs")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/(""" 
	 
    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/serviceLogs/*7.21*/.size()),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""Service Logs</h1>
    <!--
    """),_display_(/*9.6*/helper/*9.12*/.form(routes.Application.home())/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
    	"""),format.raw/*10.6*/("""<div class = "col-sm-2">
    		<input class="btn btn-primary" type="submit" value="Sync data" style="margin-top:18px">
    	</div>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""-->
    
    """),_display_(/*16.6*/helper/*16.12*/.form(routes.Application.home())/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
    """),format.raw/*17.5*/("""<div class = "container">
    	<div class = "col-sm-offset-2 col-sm-1">
    		<!-- """),_display_(/*19.13*/inputText(serviceLogForm("User Id"),  'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "123")),format.raw/*19.148*/(""" """),format.raw/*19.149*/("""-->
    	</div>
    	<div class = "col-sm-4" >
    		"""),_display_(/*22.8*/inputText(serviceLogForm("Start Time"), 'class -> "form-control", 'id -> "startTime", 'type -> "datetime-local", '_label -> Messages("Execution Start Time"))),format.raw/*22.165*/("""
    	"""),format.raw/*23.6*/("""</div>
    	<div class = "col-sm-4">
	    	"""),_display_(/*25.8*/inputText(serviceLogForm("End Time"),  'class -> "form-control", 'id -> "endTime", 'type -> "datetime-local", '_label -> Messages("Execution End Time"))),format.raw/*25.160*/("""
    	"""),format.raw/*26.6*/("""</div>
    	<input class="btn" type="submit" value="Search" style="margin-top:23px">
    </div>
    """)))}),format.raw/*29.6*/("""
    
    """),format.raw/*31.5*/("""<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable2">
    <thead>
	<tr>
		<th style = "vertical-align: top;" class="col-sm-1">Service Id</th>
		<th style = "vertical-align: top;" class="col-sm-3">Service Name</th>
 		<th style = "vertical-align: top;" class="col-sm-2">User Name</th> 
		<th style = "vertical-align: top;" class="col-sm-2">Purpose</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution End Time</th>		
		<th style = "vertical-align: top;" class="col-sm-1">DataSet Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">DataSet End Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">Details</th>
		<!-- 
		<td class="col-md-2">Operation</td>
		 -->
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*49.3*/for(serviceLog <- serviceLogs) yield /*49.33*/ {_display_(Seq[Any](format.raw/*49.35*/("""
	"""),format.raw/*50.2*/("""<tr>
	<td><font size="2">"""),_display_(/*51.22*/serviceLog/*51.32*/.getServiceId),format.raw/*51.45*/("""</font></td>
	<td><font size="2">"""),_display_(/*52.22*/serviceLog/*52.32*/.getServiceName),format.raw/*52.47*/("""</font></td>
 	<td><font size="2">"""),_display_(/*53.23*/serviceLog/*53.33*/.getUserName),format.raw/*53.45*/("""</font></td>
	<td><font size="2">"""),_display_(/*54.22*/serviceLog/*54.32*/.getPurpose),format.raw/*54.43*/("""</font></td>
	<td><font size="2">"""),_display_(/*55.22*/serviceLog/*55.32*/.getExecutionStartTime),format.raw/*55.54*/("""</font></td>
	<td><font size="2">"""),_display_(/*56.22*/serviceLog/*56.32*/.getExecutionEndTime),format.raw/*56.52*/("""</font></td>
	<td><font size="2">"""),_display_(/*57.22*/serviceLog/*57.32*/.getDataSetStartTime),format.raw/*57.52*/("""</font></td>
	<td><font size="2">"""),_display_(/*58.22*/serviceLog/*58.32*/.getDataSetEndTime),format.raw/*58.50*/("""</font></td>
	<td>
	"""),_display_(/*60.3*/form(routes.ServiceExecutionLogController.getConfigurationByConfId())/*60.72*/{_display_(Seq[Any](format.raw/*60.73*/("""
		"""),format.raw/*61.3*/("""<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(/*63.12*/serviceLog/*63.22*/.getId),format.raw/*63.28*/("""">
		<input
			type="submit"  value="see details">
	""")))}),format.raw/*66.3*/("""
	"""),format.raw/*67.2*/("""</td>
	<!--
	<td>
	"""),_display_(/*70.3*/form(routes.Application.home())/*70.34*/{_display_(Seq[Any](format.raw/*70.35*/(""" 
		"""),format.raw/*71.3*/("""<input
			name="idHolder" class="hidden" type="hidden"
			value=""""),_display_(/*73.12*/serviceLog/*73.22*/.getId),format.raw/*73.28*/("""">
		<input
			type="submit" class="btn btn-primary delete-btn span2" value="Delete"
			onclick="return confirm('Are you sure you want to delete this log?')">
		""")))}),format.raw/*77.4*/("""
	"""),format.raw/*78.2*/("""</td>
	-->
	</tr>
	""")))}),format.raw/*81.3*/("""
	"""),format.raw/*82.2*/("""</tbody>
    </table>
""")))}),format.raw/*84.2*/("""
	"""))}
  }

  def render(serviceLogs:List[ServiceExecutionLog],serviceLogForm:play.data.Form[ServiceExecutionLog]): play.twirl.api.HtmlFormat.Appendable = apply(serviceLogs,serviceLogForm)

  def f:((List[ServiceExecutionLog],play.data.Form[ServiceExecutionLog]) => play.twirl.api.HtmlFormat.Appendable) = (serviceLogs,serviceLogForm) => apply(serviceLogs,serviceLogForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/serviceLog.scala.html
                  HASH: 388d9b5e833e05977a5727567f3496bdd29ee863
                  MATRIX: 783->1|979->94|1007->113|1034->115|1062->135|1100->136|1135->145|1166->150|1185->161|1212->168|1240->169|1297->201|1311->207|1351->239|1390->241|1423->247|1589->383|1621->388|1661->402|1676->408|1717->440|1757->442|1789->447|1900->531|2057->666|2087->667|2167->721|2346->878|2379->884|2449->928|2623->1080|2656->1086|2787->1187|2824->1197|3704->2051|3750->2081|3790->2083|3819->2085|3872->2111|3891->2121|3925->2134|3986->2168|4005->2178|4041->2193|4103->2228|4122->2238|4155->2250|4216->2284|4235->2294|4267->2305|4328->2339|4347->2349|4390->2371|4451->2405|4470->2415|4511->2435|4572->2469|4591->2479|4632->2499|4693->2533|4712->2543|4751->2561|4798->2582|4876->2651|4915->2652|4945->2655|5035->2718|5054->2728|5081->2734|5164->2787|5193->2789|5239->2809|5279->2840|5318->2841|5349->2845|5442->2911|5461->2921|5488->2927|5680->3089|5709->3091|5759->3111|5788->3113|5841->3136
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|36->9|36->9|36->9|36->9|37->10|40->13|41->14|43->16|43->16|43->16|43->16|44->17|46->19|46->19|46->19|49->22|49->22|50->23|52->25|52->25|53->26|56->29|58->31|76->49|76->49|76->49|77->50|78->51|78->51|78->51|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|85->58|85->58|85->58|87->60|87->60|87->60|88->61|90->63|90->63|90->63|93->66|94->67|97->70|97->70|97->70|98->71|100->73|100->73|100->73|104->77|105->78|108->81|109->82|111->84
                  -- GENERATED --
              */
          