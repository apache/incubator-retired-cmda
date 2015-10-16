
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""  
    
    """),_display_(/*5.6*/helper/*5.12*/.form(routes.Application.authenticate)/*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""

		"""),format.raw/*7.3*/("""<div class="container" style="background-image:url('"""),_display_(/*7.56*/routes/*7.62*/.Assets.at("images/login-background.jpg")),format.raw/*7.103*/("""'); height:80vh; background-size: 100%;">
			<div class="col-sm-6 col-md-4 col-md-offset-4" style="background: rgba(255,255,255,0.7); border-radius:3px; top:25%;">
			<form class="form-signin">
				<h1 class="form-signin-heading" align="center">Sign in</h1>
				<div class="form-group">
					<label for="inputEmail" class="sr-only">Email address</label> 
					<input
						type="email" name="email" id="email" class="form-control"
						placeholder="Email address" required="" autofocus="" value='"""),_display_(/*15.68*/form("email")/*15.81*/.value),format.raw/*15.87*/("""'>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="sr-only">Password</label> 
					<input
						type="password" name="password" id="password" class="form-control"
						placeholder="Password" required="">
				</div>
				<div class="form-group" style="color: red;">
				"""),_display_(/*24.6*/if(form.hasGlobalErrors)/*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/(""" 
            	"""),format.raw/*25.14*/("""<p class="error">
                	"""),_display_(/*26.19*/form/*26.23*/.globalError.message),format.raw/*26.43*/("""
            	"""),format.raw/*27.14*/("""</p>
        		""")))}),format.raw/*28.12*/("""
        		"""),_display_(/*29.12*/if(flash.contains("success"))/*29.41*/ {_display_(Seq[Any](format.raw/*29.43*/("""
            	"""),format.raw/*30.14*/("""<p class="success">
                	"""),_display_(/*31.19*/flash/*31.24*/.get("success")),format.raw/*31.39*/("""
            	"""),format.raw/*32.14*/("""</p>
        		""")))}),format.raw/*33.12*/("""
				"""),format.raw/*34.5*/("""<button class="btn btn-primary btn-block" type="submit">Sign in</button>
				</div>
				<div class="form-group" align="center">
					<span >
					New User?
					<a href='"""),_display_(/*39.16*/routes/*39.22*/.Application.signup()),format.raw/*39.43*/("""'>Sign up</a>
					</span>
				</div>
			</form>
			</div>
		</div>
""")))}),format.raw/*45.2*/("""
	
""")))}),format.raw/*47.2*/("""
    

"""))}
  }

  def render(form:play.data.Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((play.data.Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/login.scala.html
                  HASH: e7fa694e9f434ff82dcf2bbb30910509c4c3264c
                  MATRIX: 750->1|879->42|907->45|928->58|967->60|1005->73|1019->79|1065->117|1104->119|1134->123|1213->176|1227->182|1289->223|1814->721|1836->734|1863->740|2190->1041|2223->1065|2263->1067|2306->1082|2369->1118|2382->1122|2423->1142|2465->1156|2512->1172|2551->1184|2589->1213|2629->1215|2671->1229|2736->1267|2750->1272|2786->1287|2828->1301|2875->1317|2907->1322|3105->1493|3120->1499|3162->1520|3261->1589|3295->1593
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7|35->7|35->7|35->7|43->15|43->15|43->15|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|60->32|61->33|62->34|67->39|67->39|67->39|73->45|75->47
                  -- GENERATED --
              */
          