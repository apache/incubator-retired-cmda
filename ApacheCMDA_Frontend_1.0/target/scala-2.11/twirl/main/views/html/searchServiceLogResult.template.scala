
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
object searchServiceLogResult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ServiceExecutionLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceLogs: List[ServiceExecutionLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Result Service Logs")/*5.29*/{_display_(Seq[Any](format.raw/*5.30*/("""
	 
    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/serviceLogs/*7.21*/.size()),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""Service Logs Found</h1>

	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable3">
	<thead>
	<tr>
		<th style = "vertical-align: top;" class="col-sm-4">Service Name</th>
		<th style = "vertical-align: top;" class="col-sm-2">User Name</th>
		<th style = "vertical-align: top;" class="col-sm-2">Purpose</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-2">Execution End Time</th>		
		<th style = "vertical-align: top;" class="col-sm-1">DataSet Start Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">DataSet End Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">Details</th>
	</tr>
	</thead>
	"""),_display_(/*22.3*/for(serviceLog <- serviceLogs) yield /*22.33*/ {_display_(Seq[Any](format.raw/*22.35*/("""
		"""),format.raw/*23.3*/("""<tr>
		<td><font size="2">"""),_display_(/*24.23*/serviceLog/*24.33*/.getServiceName),format.raw/*24.48*/("""</font></td>
		<td><font size="2">"""),_display_(/*25.23*/serviceLog/*25.33*/.getUserName),format.raw/*25.45*/("""</font></td>
		<td><font size="2">"""),_display_(/*26.23*/serviceLog/*26.33*/.getPurpose),format.raw/*26.44*/("""</font></td>
		<td><font size="2">"""),_display_(/*27.23*/serviceLog/*27.33*/.getExecutionStartTime),format.raw/*27.55*/("""</font></td>
		<td><font size="2">"""),_display_(/*28.23*/serviceLog/*28.33*/.getExecutionEndTime),format.raw/*28.53*/("""</font></td>
		<td><font size="2">"""),_display_(/*29.23*/serviceLog/*29.33*/.getDataSetStartTime),format.raw/*29.53*/("""</font></td>
		<td><font size="2">"""),_display_(/*30.23*/serviceLog/*30.33*/.getDataSetEndTime),format.raw/*30.51*/("""</font></td>
		<td>
		"""),_display_(/*32.4*/form(routes.ServiceExecutionLogController.getConfigurationByConfId())/*32.73*/{_display_(Seq[Any](format.raw/*32.74*/("""
		"""),format.raw/*33.3*/("""<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(/*35.12*/serviceLog/*35.22*/.getId),format.raw/*35.28*/("""">
		<input
			type="submit"  value="see details">
		""")))}),format.raw/*38.4*/("""
		"""),format.raw/*39.3*/("""</td>
		</tr>
	""")))}),format.raw/*41.3*/("""
	"""),format.raw/*42.2*/("""</table>
""")))}))}
  }

  def render(serviceLogs:List[ServiceExecutionLog]): play.twirl.api.HtmlFormat.Appendable = apply(serviceLogs)

  def f:((List[ServiceExecutionLog]) => play.twirl.api.HtmlFormat.Appendable) = (serviceLogs) => apply(serviceLogs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/searchServiceLogResult.scala.html
                  HASH: 88a17c1d33d6c643a47c3511c5022b0dfc8e4b8d
                  MATRIX: 759->1|902->41|930->60|957->62|992->89|1030->90|1064->98|1095->103|1114->114|1141->121|1169->122|1938->865|1984->895|2024->897|2054->900|2108->927|2127->937|2163->952|2225->987|2244->997|2277->1009|2339->1044|2358->1054|2390->1065|2452->1100|2471->1110|2514->1132|2576->1167|2595->1177|2636->1197|2698->1232|2717->1242|2758->1262|2820->1297|2839->1307|2878->1325|2927->1348|3005->1417|3044->1418|3074->1421|3164->1484|3183->1494|3210->1500|3294->1554|3324->1557|3370->1573|3399->1575
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|49->22|49->22|49->22|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|59->32|59->32|59->32|60->33|62->35|62->35|62->35|65->38|66->39|68->41|69->42
                  -- GENERATED --
              */
          