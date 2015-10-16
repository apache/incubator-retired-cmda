
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
object mostPopularServices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ClimateService],play.twirl.api.HtmlFormat.Appendable] {

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
	 
    """),format.raw/*15.5*/("""<h1>"""),_display_(/*15.10*/climateServices/*15.25*/.size()),format.raw/*15.32*/(""" """),format.raw/*15.33*/("""Most Popular Used Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-2">Climate Service Name</td>
		<td class="col-md-4">Purpose</td>
		<td class="col-md-4">Url</td>
		<td class="col-md-2">Scenario</td>
		<td class="col-md-2">Version</td>
		<td class="col-md-2">Root Service</td>
		 """),_display_(/*24.5*/if(true)/*24.13*/{_display_(Seq[Any](format.raw/*24.14*/("""
			"""),format.raw/*25.4*/("""<td class="col-md-3">Operation</td> 
	     """)))}),format.raw/*26.8*/(""" 
	"""),format.raw/*27.2*/("""</tr>
	
	"""),_display_(/*29.3*/for(climateService <- climateServices) yield /*29.41*/{_display_(Seq[Any](format.raw/*29.42*/("""
	"""),format.raw/*30.2*/("""<tr>
		<td><a href = """"),_display_(/*31.19*/climateService/*31.33*/.getUrl()),format.raw/*31.42*/("""">"""),_display_(/*31.45*/climateService/*31.59*/.getName()),format.raw/*31.69*/("""</a></td>

		<td><span class=""""),_display_(/*33.21*/climateService/*33.35*/.getName()),format.raw/*33.45*/(""" """),format.raw/*33.46*/("""editable" data-name='purpose'>
				"""),_display_(/*34.6*/climateService/*34.20*/.getPurpose()),format.raw/*34.33*/(""" """),format.raw/*34.34*/("""</span></td>
		
		<td><span class=""""),_display_(/*36.21*/climateService/*36.35*/.getName()),format.raw/*36.45*/(""" """),format.raw/*36.46*/("""editable" id = "url" data-name='url'>
				<a href = """"),_display_(/*37.17*/climateService/*37.31*/.getUrl()),format.raw/*37.40*/("""">
				"""),_display_(/*38.6*/climateService/*38.20*/.getUrl()),format.raw/*38.29*/("""</a> </span></td>
				
		<td><span class=""""),_display_(/*40.21*/climateService/*40.35*/.getName()),format.raw/*40.45*/(""" """),format.raw/*40.46*/("""editable" data-name='scenario'>
				"""),_display_(/*41.6*/climateService/*41.20*/.getScenario()),format.raw/*41.34*/(""" """),format.raw/*41.35*/("""</span></td>
				
		<td><span class=""""),_display_(/*43.21*/climateService/*43.35*/.getName()),format.raw/*43.45*/(""" """),format.raw/*43.46*/("""editable" data-name='versionNo'>
				"""),_display_(/*44.6*/climateService/*44.20*/.getVersionNo()),format.raw/*44.35*/(""" """),format.raw/*44.36*/("""</span></td>
				
		<td><span class=""""),_display_(/*46.21*/climateService/*46.35*/.getName()),format.raw/*46.45*/(""" """),format.raw/*46.46*/("""editable" data-name='rootServiceId'>
				"""),_display_(/*47.6*/climateService/*47.20*/.getRootServiceId()),format.raw/*47.39*/(""" """),format.raw/*47.40*/("""</span></td>
				
		
	</tr>
	""")))}),format.raw/*51.3*/("""
    """),format.raw/*52.5*/("""</table>
 
    
     
""")))}),format.raw/*56.2*/("""
"""))}
  }

  def render(climateServices:List[ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServices)

  def f:((List[ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServices) => apply(climateServices)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/mostPopularServices.scala.html
                  HASH: dbd63395dba02b41be1811dec6cc08839dd77e93
                  MATRIX: 751->1|876->61|890->68|970->72|998->74|1086->135|1114->136|1143->139|1197->167|1224->168|1278->40|1306->59|1334->183|1363->186|1405->219|1445->221|1480->229|1512->234|1536->249|1564->256|1593->257|1973->611|1990->619|2029->620|2060->624|2134->668|2164->671|2200->681|2254->719|2293->720|2322->722|2372->745|2395->759|2425->768|2455->771|2478->785|2509->795|2567->826|2590->840|2621->850|2650->851|2712->887|2735->901|2769->914|2798->915|2861->951|2884->965|2915->975|2944->976|3025->1030|3048->1044|3078->1053|3112->1061|3135->1075|3165->1084|3235->1127|3258->1141|3289->1151|3318->1152|3381->1189|3404->1203|3439->1217|3468->1218|3533->1256|3556->1270|3587->1280|3616->1281|3680->1319|3703->1333|3739->1348|3768->1349|3833->1387|3856->1401|3887->1411|3916->1412|3984->1454|4007->1468|4047->1487|4076->1488|4136->1518|4168->1523|4221->1546
                  LINES: 26->1|28->5|28->5|30->5|31->6|32->7|32->7|33->8|34->9|34->9|37->1|39->4|40->11|42->13|42->13|42->13|44->15|44->15|44->15|44->15|44->15|53->24|53->24|53->24|54->25|55->26|56->27|58->29|58->29|58->29|59->30|60->31|60->31|60->31|60->31|60->31|60->31|62->33|62->33|62->33|62->33|63->34|63->34|63->34|63->34|65->36|65->36|65->36|65->36|66->37|66->37|66->37|67->38|67->38|67->38|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|72->43|72->43|72->43|72->43|73->44|73->44|73->44|73->44|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|80->51|81->52|85->56
                  -- GENERATED --
              */
          