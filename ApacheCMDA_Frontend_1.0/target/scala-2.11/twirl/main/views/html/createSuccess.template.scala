
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
object createSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Create Successfully")/*1.29*/ {_display_(Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
		<title>Create Successfully</title> 
		<style>
		body"""),format.raw/*7.7*/("""{"""),format.raw/*7.8*/("""
			"""),format.raw/*8.4*/("""text-align:center;
			margin-left:auto;
			margin-right:auto;
		"""),format.raw/*11.3*/("""}"""),format.raw/*11.4*/("""
		"""),format.raw/*12.3*/("""</style>
	</head> 
	<body> 
		<h1>Congratulations!</h1>
		<h3>Registration has been successful.</h3>
		<script type="text/javascript"> 
		var t=5; // set the time of re-directing
		setInterval("refer()",1000); // 1s start up
		function refer()"""),format.raw/*20.19*/("""{"""),format.raw/*20.20*/("""  
		    """),format.raw/*21.7*/("""if(t==0)"""),format.raw/*21.15*/("""{"""),format.raw/*21.16*/(""" 
		        """),format.raw/*22.11*/("""location='"""),_display_(/*22.22*/routes/*22.28*/.Application.login()),format.raw/*22.48*/("""'; 
		    """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/(""" 
		    """),format.raw/*24.7*/("""document.getElementById('show').innerHTML="The page will be redirected to the home page in "
		    +""+t+" seconds";
		    t--; 
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""" 
		"""),format.raw/*28.3*/("""</script> 
		<span id="show"></span> 
	</body>
</html>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/createSuccess.scala.html
                  HASH: 80fc0e718327957e0f916a923999c63b28bd15d0
                  MATRIX: 806->1|841->28|880->30|907->31|1076->174|1103->175|1133->179|1224->243|1252->244|1282->247|1553->490|1582->491|1618->500|1654->508|1683->509|1723->521|1761->532|1776->538|1817->558|1854->568|1882->569|1917->577|2075->708|2103->709|2134->713
                  LINES: 29->1|29->1|29->1|30->2|35->7|35->7|36->8|39->11|39->11|40->12|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|52->24|55->27|55->27|56->28
                  -- GENERATED --
              */
          