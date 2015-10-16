
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
object mostRecentlyAddedServices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServices: List[models.ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Climate Services")/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/(""" 
	 
    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/climateServices/*7.25*/.size()),format.raw/*7.32*/(""" """),format.raw/*7.33*/("""Most Recently Added Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-2">Climate Service Name</td>
		<td class="col-md-4">Purpose</td>
		<td class="col-md-4">Url</td>
		<td class="col-md-2">Scenario</td>
		<td class="col-md-2">Version</td>
		<td class="col-md-2">Root Service</td>
		 """),_display_(/*16.5*/if(true)/*16.13*/{_display_(Seq[Any](format.raw/*16.14*/("""
			"""),format.raw/*17.4*/("""<td class="col-md-3">Operation</td> 
	     """)))}),format.raw/*18.8*/(""" 
	"""),format.raw/*19.2*/("""</tr>
	"""),_display_(/*20.3*/for(climateService <- climateServices) yield /*20.41*/{_display_(Seq[Any](format.raw/*20.42*/("""
	"""),format.raw/*21.2*/("""<tr>
		<td><a href = """"),_display_(/*22.19*/climateService/*22.33*/.getUrl()),format.raw/*22.42*/("""">"""),_display_(/*22.45*/climateService/*22.59*/.getName()),format.raw/*22.69*/("""</a></td>

		<td><span class=""""),_display_(/*24.21*/climateService/*24.35*/.getName()),format.raw/*24.45*/(""" """),format.raw/*24.46*/("""editable" data-name='purpose'>
				"""),_display_(/*25.6*/climateService/*25.20*/.getPurpose()),format.raw/*25.33*/(""" """),format.raw/*25.34*/("""</span></td>
		
		<td><span class=""""),_display_(/*27.21*/climateService/*27.35*/.getName()),format.raw/*27.45*/(""" """),format.raw/*27.46*/("""editable" id = "url" data-name='url'>
				<a href = """"),_display_(/*28.17*/climateService/*28.31*/.getUrl()),format.raw/*28.40*/("""">
				"""),_display_(/*29.6*/climateService/*29.20*/.getUrl()),format.raw/*29.29*/("""</a> </span></td>
				
		<td><span class=""""),_display_(/*31.21*/climateService/*31.35*/.getName()),format.raw/*31.45*/(""" """),format.raw/*31.46*/("""editable" data-name='scenario'>
				"""),_display_(/*32.6*/climateService/*32.20*/.getScenario()),format.raw/*32.34*/(""" """),format.raw/*32.35*/("""</span></td>
				
		<td><span class=""""),_display_(/*34.21*/climateService/*34.35*/.getName()),format.raw/*34.45*/(""" """),format.raw/*34.46*/("""editable" data-name='versionNo'>
				"""),_display_(/*35.6*/climateService/*35.20*/.getVersionNo()),format.raw/*35.35*/(""" """),format.raw/*35.36*/("""</span></td>
				
		<td><span class=""""),_display_(/*37.21*/climateService/*37.35*/.getName()),format.raw/*37.45*/(""" """),format.raw/*37.46*/("""editable" data-name='rootServiceId'>
				"""),_display_(/*38.6*/climateService/*38.20*/.getRootServiceId()),format.raw/*38.39*/(""" """),format.raw/*38.40*/("""</span></td>
	</tr>
	""")))}),format.raw/*40.3*/("""
    """),format.raw/*41.5*/("""</table>
""")))}),format.raw/*42.2*/("""
"""))}
  }

  def render(climateServices:List[models.ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServices)

  def f:((List[models.ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServices) => apply(climateServices)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/mostRecentlyAddedServices.scala.html
                  HASH: ba64e1156f24087dbbc9dc3532913dea55f2b346
                  MATRIX: 764->1|913->47|941->66|968->68|1000->92|1039->94|1074->103|1105->108|1128->123|1155->130|1183->131|1565->487|1582->495|1621->496|1652->500|1726->544|1756->547|1790->555|1844->593|1883->594|1912->596|1962->619|1985->633|2015->642|2045->645|2068->659|2099->669|2157->700|2180->714|2211->724|2240->725|2302->761|2325->775|2359->788|2388->789|2451->825|2474->839|2505->849|2534->850|2615->904|2638->918|2668->927|2702->935|2725->949|2755->958|2825->1001|2848->1015|2879->1025|2908->1026|2971->1063|2994->1077|3029->1091|3058->1092|3123->1130|3146->1144|3177->1154|3206->1155|3270->1193|3293->1207|3329->1222|3358->1223|3423->1261|3446->1275|3477->1285|3506->1286|3574->1328|3597->1342|3637->1361|3666->1362|3718->1384|3750->1389|3790->1399
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|43->16|43->16|43->16|44->17|45->18|46->19|47->20|47->20|47->20|48->21|49->22|49->22|49->22|49->22|49->22|49->22|51->24|51->24|51->24|51->24|52->25|52->25|52->25|52->25|54->27|54->27|54->27|54->27|55->28|55->28|55->28|56->29|56->29|56->29|58->31|58->31|58->31|58->31|59->32|59->32|59->32|59->32|61->34|61->34|61->34|61->34|62->35|62->35|62->35|62->35|64->37|64->37|64->37|64->37|65->38|65->38|65->38|65->38|67->40|68->41|69->42
                  -- GENERATED --
              */
          