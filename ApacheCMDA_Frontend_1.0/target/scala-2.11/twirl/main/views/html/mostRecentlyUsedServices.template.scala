
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
object mostRecentlyUsedServices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServices: List[ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*7.30*/("""{"""),format.raw/*7.31*/("""
		"""),format.raw/*8.3*/("""//alert($("#url").text());
	"""),format.raw/*9.2*/("""}"""),format.raw/*9.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/main("Climate Services", scripts)/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
	  
	 
    """),format.raw/*16.5*/("""<h1>"""),_display_(/*16.10*/climateServices/*16.25*/.size()),format.raw/*16.32*/(""" """),format.raw/*16.33*/("""Most Recently Used Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-2">Climate Service Name</td>
		<td class="col-md-4">Purpose</td>
		<td class="col-md-4">Url</td>
		<td class="col-md-2">Scenario</td>
		<td class="col-md-2">Version</td>
		<td class="col-md-2">Root Service</td>
		 """),_display_(/*25.5*/if(true)/*25.13*/{_display_(Seq[Any](format.raw/*25.14*/("""
			"""),format.raw/*26.4*/("""<td class="col-md-3">Operation</td> 
	     """)))}),format.raw/*27.8*/(""" 
	"""),format.raw/*28.2*/("""</tr>
	"""),_display_(/*29.3*/for(climateService <- climateServices) yield /*29.41*/{_display_(Seq[Any](format.raw/*29.42*/("""
	"""),format.raw/*30.2*/("""<tr>
		<td><a href = """"),_display_(/*31.19*/climateService/*31.33*/.getUrl()),format.raw/*31.42*/("""">"""),_display_(/*31.45*/climateService/*31.59*/.getName()),format.raw/*31.69*/("""</a></td>

		<td><span class=""""),_display_(/*33.21*/climateService/*33.35*/.getName()),format.raw/*33.45*/(""" """),format.raw/*33.46*/("""editable" data-name='purpose'>
				"""),_display_(/*34.6*/climateService/*34.20*/.getPurpose()),format.raw/*34.33*/(""" """),format.raw/*34.34*/("""</span></td>
		
		<td><span class=""""),_display_(/*36.21*/climateService/*36.35*/.getName()),format.raw/*36.45*/(""" """),format.raw/*36.46*/("""editable" id = "url" data-name='url'>
				<a href = """"),_display_(/*37.17*/climateService/*37.31*/.getUrl()),format.raw/*37.40*/("""">
				"""),_display_(/*38.6*/climateService/*38.20*/.getUrl()),format.raw/*38.29*/(""" """),format.raw/*38.30*/("""</a></span></td>
				
		<td><span class=""""),_display_(/*40.21*/climateService/*40.35*/.getName()),format.raw/*40.45*/(""" """),format.raw/*40.46*/("""editable" data-name='scenario'>
				"""),_display_(/*41.6*/climateService/*41.20*/.getScenario()),format.raw/*41.34*/(""" """),format.raw/*41.35*/("""</span></td>
				
		<td><span class=""""),_display_(/*43.21*/climateService/*43.35*/.getName()),format.raw/*43.45*/(""" """),format.raw/*43.46*/("""editable" data-name='versionNo'>
				"""),_display_(/*44.6*/climateService/*44.20*/.getVersionNo()),format.raw/*44.35*/(""" """),format.raw/*44.36*/("""</span></td>
				
		<td><span class=""""),_display_(/*46.21*/climateService/*46.35*/.getName()),format.raw/*46.45*/(""" """),format.raw/*46.46*/("""editable" data-name='rootServiceId'>
				"""),_display_(/*47.6*/climateService/*47.20*/.getRootServiceId()),format.raw/*47.39*/(""" """),format.raw/*47.40*/("""</span></td>
	</tr>
	""")))}),format.raw/*49.3*/("""
    """),format.raw/*50.5*/("""</table>
""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(climateServices:List[ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServices)

  def f:((List[ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServices) => apply(climateServices)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/mostRecentlyUsedServices.scala.html
                  HASH: e65b218ebb77a17b4737922fdee6ba50eb19b22b
                  MATRIX: 756->1|881->61|895->68|975->72|1003->74|1091->135|1119->136|1148->139|1202->167|1229->168|1283->40|1311->59|1339->183|1368->186|1410->219|1450->221|1489->233|1521->238|1545->253|1573->260|1602->261|1983->616|2000->624|2039->625|2070->629|2144->673|2174->676|2208->684|2262->722|2301->723|2330->725|2380->748|2403->762|2433->771|2463->774|2486->788|2517->798|2575->829|2598->843|2629->853|2658->854|2720->890|2743->904|2777->917|2806->918|2869->954|2892->968|2923->978|2952->979|3033->1033|3056->1047|3086->1056|3120->1064|3143->1078|3173->1087|3202->1088|3271->1130|3294->1144|3325->1154|3354->1155|3417->1192|3440->1206|3475->1220|3504->1221|3569->1259|3592->1273|3623->1283|3652->1284|3716->1322|3739->1336|3775->1351|3804->1352|3869->1390|3892->1404|3923->1414|3952->1415|4020->1457|4043->1471|4083->1490|4112->1491|4164->1513|4196->1518|4236->1528
                  LINES: 26->1|28->5|28->5|30->5|31->6|32->7|32->7|33->8|34->9|34->9|37->1|39->4|40->11|42->13|42->13|42->13|45->16|45->16|45->16|45->16|45->16|54->25|54->25|54->25|55->26|56->27|57->28|58->29|58->29|58->29|59->30|60->31|60->31|60->31|60->31|60->31|60->31|62->33|62->33|62->33|62->33|63->34|63->34|63->34|63->34|65->36|65->36|65->36|65->36|66->37|66->37|66->37|67->38|67->38|67->38|67->38|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|72->43|72->43|72->43|72->43|73->44|73->44|73->44|73->44|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|78->49|79->50|80->51
                  -- GENERATED --
              */
          