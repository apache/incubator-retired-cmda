
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
object allClimateServices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[ClimateService],play.data.Form[ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServices: List[ClimateService], climateServiceForm: play.data.Form[ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.93*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("All Climate Services")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

    """),format.raw/*6.5*/("""<h1>"""),_display_(/*6.10*/climateServices/*6.25*/.size()),format.raw/*6.32*/(""" """),format.raw/*6.33*/("""Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
	<thead>
	<tr class="text-center">
		<th style = "vertical-align: middle;" class="col-md-2">Climate Service Name</th>
		<th style = "vertical-align: middle;" class="col-md-4">Purpose</th>
		<th style = "vertical-align: middle;" class="col-md-4">URL</th>
		<th style = "vertical-align: middle;" class="col-md-3">Scenario</th>
		<th style = "vertical-align: middle;" class="col-md-3">Version_No</th>
		<th style = "vertical-align: middle;" class="col-md-3">Root Service_Id</th>
		 """),_display_(/*16.5*/if(true)/*16.13*/{_display_(Seq[Any](format.raw/*16.14*/("""
			"""),format.raw/*17.4*/("""<th style = "vertical-align: middle;" class="col-md-3">Operation</th> 
	     """)))}),format.raw/*18.8*/(""" 
	     """),format.raw/*19.7*/("""<th style = "vertical-align: middle;" class="col-md-2">Operation</th>
	</tr>
	</thead>
	<tbody>
	"""),_display_(/*23.3*/for(climateService <- climateServices) yield /*23.41*/ {_display_(Seq[Any](format.raw/*23.43*/("""
	"""),format.raw/*24.2*/("""<tr>
		<td><a href = """"),_display_(/*25.19*/climateService/*25.33*/.getUrl()),format.raw/*25.42*/("""">"""),_display_(/*25.45*/climateService/*25.59*/.getName()),format.raw/*25.69*/("""</a></td>

		<td><span class=""""),_display_(/*27.21*/climateService/*27.35*/.getName()),format.raw/*27.45*/(""" """),format.raw/*27.46*/("""editable" data-name='purpose'>
				"""),_display_(/*28.6*/{
					if (climateService.getPurpose().length > 5 ) {
						climateService.getPurpose().substring(0,5);
					}else {
						climateService.getPurpose();
					}
				}),format.raw/*34.6*/(""" """),format.raw/*34.7*/("""... </span></td>
		
		<td><span class=""""),_display_(/*36.21*/climateService/*36.35*/.getName()),format.raw/*36.45*/(""" """),format.raw/*36.46*/("""editable" id = "url" data-name='url'>
				<a href = """"),_display_(/*37.17*/climateService/*37.31*/.getUrl()),format.raw/*37.40*/("""">"""),_display_(/*37.43*/climateService/*37.57*/.getUrl()),format.raw/*37.66*/("""</a></span></td>
				
		<td><span class=""""),_display_(/*39.21*/climateService/*39.35*/.getName()),format.raw/*39.45*/(""" """),format.raw/*39.46*/("""editable" data-name='scenario'>
				"""),_display_(/*40.6*/climateService/*40.20*/.getScenario()),format.raw/*40.34*/(""" """),format.raw/*40.35*/("""</span></td>
				
		<td><span class=""""),_display_(/*42.21*/climateService/*42.35*/.getName()),format.raw/*42.45*/(""" """),format.raw/*42.46*/("""editable" data-name='versionNo'>
				"""),_display_(/*43.6*/climateService/*43.20*/.getVersionNo()),format.raw/*43.35*/(""" """),format.raw/*43.36*/("""</span></td>
				
		<td><span class=""""),_display_(/*45.21*/climateService/*45.35*/.getName()),format.raw/*45.45*/(""" """),format.raw/*45.46*/("""editable" data-name='rootServiceId'>
				"""),_display_(/*46.6*/climateService/*46.20*/.getRootServiceId()),format.raw/*46.39*/(""" """),format.raw/*46.40*/("""</span></td>
				
		<td><input type="file" class="btn btn-info" id ="upload """),_display_(/*48.60*/climateService/*48.74*/.getName()),format.raw/*48.84*/("""" ></button></td>
		<td><button type="button" class="btn btn-danger" id ="doReplace"  onclick="Javascript:replaceFile('upload '+'"""),_display_(/*49.113*/climateService/*49.127*/.getName()),format.raw/*49.137*/("""')" >Execute</button></td>
	
	</tr>
	""")))}),format.raw/*52.3*/("""
	"""),format.raw/*53.2*/("""</tbody>
    </table>
""")))}),format.raw/*55.2*/("""
"""))}
  }

  def render(climateServices:List[ClimateService],climateServiceForm:play.data.Form[ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)

  def f:((List[ClimateService],play.data.Form[ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/allClimateServices.scala.html
                  HASH: 1a3ce250f7173f55e6a7a4e22fdc5e636a99c646
                  MATRIX: 781->1|975->92|1002->110|1029->112|1065->140|1104->142|1136->148|1167->153|1190->168|1217->175|1245->176|1873->778|1890->786|1929->787|1960->791|2068->869|2103->877|2227->975|2281->1013|2321->1015|2350->1017|2400->1040|2423->1054|2453->1063|2483->1066|2506->1080|2537->1090|2595->1121|2618->1135|2649->1145|2678->1146|2740->1182|2924->1346|2952->1347|3019->1387|3042->1401|3073->1411|3102->1412|3183->1466|3206->1480|3236->1489|3266->1492|3289->1506|3319->1515|3388->1557|3411->1571|3442->1581|3471->1582|3534->1619|3557->1633|3592->1647|3621->1648|3686->1686|3709->1700|3740->1710|3769->1711|3833->1749|3856->1763|3892->1778|3921->1779|3986->1817|4009->1831|4040->1841|4069->1842|4137->1884|4160->1898|4200->1917|4229->1918|4333->1995|4356->2009|4387->2019|4545->2149|4569->2163|4601->2173|4669->2211|4698->2213|4751->2236
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|33->6|33->6|33->6|33->6|43->16|43->16|43->16|44->17|45->18|46->19|50->23|50->23|50->23|51->24|52->25|52->25|52->25|52->25|52->25|52->25|54->27|54->27|54->27|54->27|55->28|61->34|61->34|63->36|63->36|63->36|63->36|64->37|64->37|64->37|64->37|64->37|64->37|66->39|66->39|66->39|66->39|67->40|67->40|67->40|67->40|69->42|69->42|69->42|69->42|70->43|70->43|70->43|70->43|72->45|72->45|72->45|72->45|73->46|73->46|73->46|73->46|75->48|75->48|75->48|76->49|76->49|76->49|79->52|80->53|82->55
                  -- GENERATED --
              */
          