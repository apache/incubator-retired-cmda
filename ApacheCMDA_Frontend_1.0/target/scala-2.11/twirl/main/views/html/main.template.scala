
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.62*/(""" 

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(/*8.9*/title),format.raw/*8.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(/*14.9*/routes/*14.15*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*14.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*16.9*/routes/*16.15*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*16.58*/("""'>	
<link rel="stylesheet"
	href='"""),_display_(/*18.9*/routes/*18.15*/.Assets.at("stylesheets/navbar-fixed-top.css")),format.raw/*18.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*20.9*/routes/*20.15*/.Assets.at("stylesheets/custom.css")),format.raw/*20.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(/*22.9*/routes/*22.15*/.Assets.at("stylesheets/main.css")),format.raw/*22.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(/*24.9*/routes/*24.15*/.Assets.at("images/favicon.png")),format.raw/*24.47*/("""'>
<link rel="stylesheet"
	href='"""),_display_(/*26.9*/routes/*26.15*/.Assets.at("stylesheets/bootstrap-editable.css")),format.raw/*26.63*/("""'>
<link href='"""),_display_(/*27.14*/routes/*27.20*/.Assets.at("stylesheets/jquery.tablesorter.pager.css")),format.raw/*27.74*/("""'
	rel="stylesheet" />
<link href='"""),_display_(/*29.14*/routes/*29.20*/.Assets.at("stylesheets/style.css")),format.raw/*29.55*/("""'
	rel="stylesheet" />
<link rel="stylesheet"
	href='"""),_display_(/*32.9*/routes/*32.15*/.Assets.at("stylesheets/livefitler.css")),format.raw/*32.55*/("""'>
<link rel="stylesheet"
    href='"""),_display_(/*34.12*/routes/*34.18*/.Assets.at("stylesheets/custom_recommend.css")),format.raw/*34.64*/("""'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.css">
<link rel="stylesheet" 
	href="http://code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">


<script type="text/javascript" src='"""),_display_(/*41.38*/routes/*41.44*/.Assets.at("javascripts/jquery-1.11.3.min.js")),format.raw/*41.90*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*42.38*/routes/*42.44*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*42.86*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*43.38*/routes/*43.44*/.Assets.at("javascripts/parameter.js")),format.raw/*43.82*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*44.38*/routes/*44.44*/.Assets.at("javascripts/lastLoader.js")),format.raw/*44.83*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*45.38*/routes/*45.44*/.Assets.at("javascripts/jquery.metadata.js")),format.raw/*45.88*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*46.38*/routes/*46.44*/.Assets.at("javascripts/jquery.tablesorter.js")),format.raw/*46.91*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*47.38*/routes/*47.44*/.Assets.at("javascripts/bootstrap-editable.min.js")),format.raw/*47.95*/("""'></script>

<!--  
<script type="text/javascript" src='"""),_display_(/*50.38*/routes/*50.44*/.Assets.at("javascripts/edit_button.js")),format.raw/*50.84*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*51.38*/routes/*51.44*/.Assets.at("javascripts/livefitler.js")),format.raw/*51.83*/("""'></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script>
-->
<script type="text/javascript" src="http://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>

"""),_display_(/*56.2*/moreScripts),format.raw/*56.13*/("""

"""),format.raw/*58.1*/("""</head>

<body>
	
	"""),_display_(/*62.3*/header()),format.raw/*62.11*/("""

	"""),format.raw/*64.2*/("""<div class="container">

		"""),_display_(/*66.4*/content),format.raw/*66.11*/("""

	"""),format.raw/*68.2*/("""</div>
	
	"""),_display_(/*70.3*/footer()),format.raw/*70.11*/("""

"""),format.raw/*72.1*/("""</body>
</html>


"""))}
  }

  def render(title:String,moreScripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,moreScripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/main.scala.html
                  HASH: ead32c176900dd04f5faf12db6435609d12553d5
                  MATRIX: 732->1|880->61|909->64|974->104|999->109|1214->298|1229->304|1289->343|1349->377|1364->383|1428->426|1489->461|1504->467|1571->513|1631->547|1646->553|1703->589|1778->638|1793->644|1848->678|1928->732|1943->738|1996->770|2056->804|2071->810|2140->858|2183->874|2198->880|2273->934|2336->970|2351->976|2407->1011|2487->1065|2502->1071|2563->1111|2627->1148|2642->1154|2709->1200|2970->1434|2985->1440|3052->1486|3128->1535|3143->1541|3206->1583|3282->1632|3297->1638|3356->1676|3432->1725|3447->1731|3507->1770|3583->1819|3598->1825|3663->1869|3739->1918|3754->1924|3822->1971|3898->2020|3913->2026|3985->2077|4069->2134|4084->2140|4145->2180|4221->2229|4236->2235|4296->2274|4520->2472|4552->2483|4581->2485|4627->2505|4656->2513|4686->2516|4740->2544|4768->2551|4798->2554|4835->2565|4864->2573|4893->2575
                  LINES: 26->1|29->1|31->3|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|57->29|57->29|57->29|60->32|60->32|60->32|62->34|62->34|62->34|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|78->50|78->50|78->50|79->51|79->51|79->51|84->56|84->56|86->58|90->62|90->62|92->64|94->66|94->66|96->68|98->70|98->70|100->72
                  -- GENERATED --
              */
          