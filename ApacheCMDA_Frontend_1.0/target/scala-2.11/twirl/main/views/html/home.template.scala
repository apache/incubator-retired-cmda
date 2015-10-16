
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
import helper._
/**/
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*4.2*/main("Home")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""

"""),format.raw/*6.1*/("""<div class="jumbotron">
	<div class="row">
		<div class="col-lg-5">
			<img src="/assets/images/Main.jpg" height="480" width="330" style="margin:10px 0px"/>
		</div>
		<div class="col-lg-7">
			<h2>Climate Model Diagnostic Analyzer</h2>
			<br>
			<p> A repository of web services for multi-aspect physics-based and 
				phenomenon-oriented phenomenon-oriented climate model performance
				evaluation and diagnosis through the comprehensive and synergistic 
				use of multiple observational data, reanalysis data, and model outputs.
			</p>
			<br>
			<p> This repository is specially customized to support the 2015 JPL Center
				for Climate Sciences Summer School. The theme of the summer school is 
				<b>Using Satellite Observations to Advance Climate Models</b>. This repository 
				provides datasets and analysis tools for the students to use for their 
				group research projects.
			</p>
			
			<!-- """),_display_(/*27.10*/if(!session.get("username"))/*27.38*/{_display_(Seq[Any](format.raw/*27.39*/(""" """),format.raw/*27.40*/("""-->
			
			<p>
				"""),_display_(/*30.6*/if(false)/*30.15*/{_display_(Seq[Any](format.raw/*30.16*/(""" """),format.raw/*30.17*/("""<a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))}),format.raw/*31.42*/("""
			"""),format.raw/*32.4*/("""</p>
			<!-- """)))}),format.raw/*33.10*/(""" """),format.raw/*33.11*/("""-->
		</div>
	</div>
</div>

""")))}),format.raw/*38.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/home.scala.html
                  HASH: 4a2c8a43bb35b49fde5be518f0b62faa7441a460
                  MATRIX: 812->21|832->33|871->35|899->37|1840->951|1877->979|1916->980|1945->981|1991->1001|2009->1010|2048->1011|2077->1012|2200->1104|2231->1108|2276->1122|2305->1123|2365->1153
                  LINES: 29->4|29->4|29->4|31->6|52->27|52->27|52->27|52->27|55->30|55->30|55->30|55->30|56->31|57->32|58->33|58->33|63->38
                  -- GENERATED --
              */
          