
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
object allDatasets extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Dataset],play.data.Form[Dataset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataSets: List[Dataset], dataSetForm: play.data.Form[Dataset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("All Datasets")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""

    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/dataSets/*6.18*/.size()),format.raw/*6.25*/(""" """),format.raw/*6.26*/("""Datasets</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id ="myTable">
	<thead>
	<tr>
		<!--  
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		-->
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		<!--  
		<th style = "vertical-align: top;" class="col-md-3">Source</th> 
		<th style = "vertical-align: top;" class="col-md-3">Status</th>
		<th style = "vertical-align: top;" class="col-md-4">Responsible Person</th>
		<th style = "vertical-align: top;" class="col-md-4">Data Source Name in Web Interface</th> 
		-->
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		<!-- <th style = "vertical-align: top;" class="col-md-3">Variable Name Input Parameter</th> -->
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Duration</th>
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*35.3*/for(dataSet <- dataSets) yield /*35.27*/{_display_(Seq[Any](format.raw/*35.28*/("""
	"""),format.raw/*36.2*/("""<tr>
		<!--  
		<td><font size="2">"""),_display_(/*38.23*/dataSet/*38.30*/.getId()),format.raw/*38.38*/("""</font></td> 
		-->
		<td><font size="2">"""),_display_(/*40.23*/dataSet/*40.30*/.getName()),format.raw/*40.40*/("""</font></td>
		<td><font size="2">"""),_display_(/*41.23*/dataSet/*41.30*/.getAgencyId()),format.raw/*41.44*/("""</font></td>
		<td><font size="2">"""),_display_(/*42.23*/dataSet/*42.30*/.getInstrument()),format.raw/*42.46*/("""</font></td>
		<td><font size="2">"""),_display_(/*43.23*/dataSet/*43.30*/.getPhysicalVariable()),format.raw/*43.52*/("""</font></td>
		<td><font size="2">"""),_display_(/*44.23*/dataSet/*44.30*/.getCMIP5VarName()),format.raw/*44.48*/("""</font></td>
		<td><font size="2">"""),_display_(/*45.23*/dataSet/*45.30*/.getUnits()),format.raw/*45.41*/("""</font></td>
		<td><font size="2">"""),_display_(/*46.23*/dataSet/*46.30*/.getGridDimension()),format.raw/*46.49*/("""</font></td>
		<!--
		<td><font size="2">"""),_display_(/*48.23*/dataSet/*48.30*/.getSource()),format.raw/*48.42*/("""</font></td>
		<td><font size="2">"""),_display_(/*49.23*/dataSet/*49.30*/.getStatus()),format.raw/*49.42*/("""</font></td>
		<td><font size="2">"""),_display_(/*50.23*/dataSet/*50.30*/.getResponsiblePerson()),format.raw/*50.53*/("""</font></td>
		<td><font size="2">"""),_display_(/*51.23*/dataSet/*51.30*/.getDataSourceNameinWebInterface()),format.raw/*51.64*/("""</font></td>
		-->
		<td><font size="2">"""),_display_(/*53.23*/dataSet/*53.30*/.getVariableNameInWebInterface()),format.raw/*53.62*/("""</font></td>
		<td><font size="2">"""),_display_(/*54.23*/dataSet/*54.30*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*54.88*/("""</font></td>
		<!--<td><font size="2">"""),_display_(/*55.27*/dataSet/*55.34*/.getVariableNameInputParameterToCallScienceApplicationCode()),format.raw/*55.94*/("""</font></td> -->
		<td><font size="2">"""),_display_(/*56.23*/dataSet/*56.30*/.getStartTime()),format.raw/*56.45*/("""</font></td>
		<td><font size="2">"""),_display_(/*57.23*/dataSet/*57.30*/.getEndTime()),format.raw/*57.43*/("""</font></td>
		<td><font size="2">"""),_display_(/*58.23*/dataSet/*58.30*/.getDuration()),format.raw/*58.44*/("""</font></td>
		
	</tr>
	
	""")))}),format.raw/*62.3*/("""
	"""),format.raw/*63.2*/("""</tbody>
    </table>
""")))}),format.raw/*65.2*/("""
"""))}
  }

  def render(dataSets:List[Dataset],dataSetForm:play.data.Form[Dataset]): play.twirl.api.HtmlFormat.Appendable = apply(dataSets,dataSetForm)

  def f:((List[Dataset],play.data.Form[Dataset]) => play.twirl.api.HtmlFormat.Appendable) = (dataSets,dataSetForm) => apply(dataSets,dataSetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 15:20:28 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/allDatasets.scala.html
                  HASH: a80b7f53ed285e18e7359099177c57ff8b285403
                  MATRIX: 760->1|926->64|953->82|980->84|1008->104|1047->106|1079->112|1110->117|1126->125|1153->132|1181->133|2765->1691|2805->1715|2844->1716|2873->1718|2936->1754|2952->1761|2981->1769|3050->1811|3066->1818|3097->1828|3159->1863|3175->1870|3210->1884|3272->1919|3288->1926|3325->1942|3387->1977|3403->1984|3446->2006|3508->2041|3524->2048|3563->2066|3625->2101|3641->2108|3673->2119|3735->2154|3751->2161|3791->2180|3860->2222|3876->2229|3909->2241|3971->2276|3987->2283|4020->2295|4082->2330|4098->2337|4142->2360|4204->2395|4220->2402|4275->2436|4343->2477|4359->2484|4412->2516|4474->2551|4490->2558|4569->2616|4635->2655|4651->2662|4732->2722|4798->2761|4814->2768|4850->2783|4912->2818|4928->2825|4962->2838|5024->2873|5040->2880|5075->2894|5132->2921|5161->2923|5214->2946
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|62->35|62->35|62->35|63->36|65->38|65->38|65->38|67->40|67->40|67->40|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|73->46|73->46|73->46|75->48|75->48|75->48|76->49|76->49|76->49|77->50|77->50|77->50|78->51|78->51|78->51|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|85->58|85->58|85->58|89->62|90->63|92->65
                  -- GENERATED --
              */
          