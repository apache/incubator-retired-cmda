
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
object allDatasetLogs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[DatasetLog],play.data.Form[DatasetLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(datasetLogs: List[DatasetLog], datasetLogsForm: play.data.Form[DatasetLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("All Dataset Logs")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""

    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/datasetLogs/*6.21*/.size()),format.raw/*6.28*/(""" """),format.raw/*6.29*/("""Dataset Logs</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id ="datasetLogTable">
	<thead>
	<tr>
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">User Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;" class="col-md-1">Dataset End Time</th>
		<th style = "vertical-align: top;" class="col-sm-1">Details</th>
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*21.3*/for(datasetLog <- datasetLogs) yield /*21.33*/{_display_(Seq[Any](format.raw/*21.34*/("""
	"""),format.raw/*22.2*/("""<tr>
		<td><font size="2">"""),_display_(/*23.23*/datasetLog/*23.33*/.getId()),format.raw/*23.41*/("""</font></td>
		<td><font size="2">"""),_display_(/*24.23*/datasetLog/*24.33*/.getDatasetName()),format.raw/*24.50*/("""</font></td>
		<td><font size="2">"""),_display_(/*25.23*/datasetLog/*25.33*/.getUserName()),format.raw/*25.47*/("""</font></td>
		<td><font size="2">"""),_display_(/*26.23*/datasetLog/*26.33*/.getDatasetSource()),format.raw/*26.52*/("""</font></td>
		<td><font size="2">"""),_display_(/*27.23*/datasetLog/*27.33*/.getDatasetVariable()),format.raw/*27.54*/("""</font></td>
		<td><font size="2">"""),_display_(/*28.23*/datasetLog/*28.33*/.getDatasetStudyStartTime()),format.raw/*28.60*/("""</font></td>
		<td><font size="2">"""),_display_(/*29.23*/datasetLog/*29.33*/.getDatasetStudyEndTime()),format.raw/*29.58*/("""</font></td>
		<td>
		"""),_display_(/*31.4*/form(routes.ServiceExecutionLogController.getConfigurationByConfId())/*31.73*/{_display_(Seq[Any](format.raw/*31.74*/("""
		"""),format.raw/*32.3*/("""<input
			name="logId" class="hidden" type="hidden"
			value=""""),_display_(/*34.12*/datasetLog/*34.22*/.getServiceExecutionLogId()),format.raw/*34.49*/("""">
		<input
			type="submit"  value="see details">
		""")))}),format.raw/*37.4*/("""
		"""),format.raw/*38.3*/("""</td>
	</tr>
	
	""")))}),format.raw/*41.3*/("""
	"""),format.raw/*42.2*/("""</tbody>
    </table>
""")))}),format.raw/*44.2*/("""
"""))}
  }

  def render(datasetLogs:List[DatasetLog],datasetLogsForm:play.data.Form[DatasetLog]): play.twirl.api.HtmlFormat.Appendable = apply(datasetLogs,datasetLogsForm)

  def f:((List[DatasetLog],play.data.Form[DatasetLog]) => play.twirl.api.HtmlFormat.Appendable) = (datasetLogs,datasetLogsForm) => apply(datasetLogs,datasetLogsForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/allDatasetLogs.scala.html
                  HASH: b879be0715216ed2f8f862b605649d356c6973d7
                  MATRIX: 769->1|948->77|975->95|1002->97|1034->121|1073->123|1105->129|1136->134|1155->145|1182->152|1210->153|1983->900|2029->930|2068->931|2097->933|2151->960|2170->970|2199->978|2261->1013|2280->1023|2318->1040|2380->1075|2399->1085|2434->1099|2496->1134|2515->1144|2555->1163|2617->1198|2636->1208|2678->1229|2740->1264|2759->1274|2807->1301|2869->1336|2888->1346|2934->1371|2983->1394|3061->1463|3100->1464|3130->1467|3220->1530|3239->1540|3287->1567|3371->1621|3401->1624|3448->1641|3477->1643|3530->1666
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|48->21|48->21|48->21|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|58->31|58->31|58->31|59->32|61->34|61->34|61->34|64->37|65->38|68->41|69->42|71->44
                  -- GENERATED --
              */
          