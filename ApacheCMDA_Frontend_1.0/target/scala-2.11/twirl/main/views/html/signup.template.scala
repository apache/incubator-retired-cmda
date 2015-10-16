
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*5.1*/("""<script type="text/javascript">
		function checkpwd()"""),format.raw/*6.22*/("""{"""),format.raw/*6.23*/("""
				"""),format.raw/*7.5*/("""var p1=document.getElementById("password").value;
				var p2=document.getElementById("repassword").value;
				if(p1!=p2)"""),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
					"""),format.raw/*10.6*/("""document.getElementById("msg").innerHTML="Please check that your passwords match";
					document.getElementById("create").disabled = true;
					
				"""),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""else"""),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""
					"""),format.raw/*14.6*/("""document.getElementById("msg").innerHTML = "";
					document.getElementById("create").disabled = false;
					return true;
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
		"""),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""
		
		"""),format.raw/*20.3*/("""function isEmailExisted() """),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""
			"""),format.raw/*21.4*/("""var email = document.getElementById("email").value;
			var obj = """),format.raw/*22.14*/("""{"""),format.raw/*22.15*/("""
					"""),format.raw/*23.6*/("""email : email
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/("""
			"""),format.raw/*25.4*/("""$.ajax("""),format.raw/*25.11*/("""{"""),format.raw/*25.12*/("""
				"""),format.raw/*26.5*/("""url: "/isEmailExisted",
				data: JSON.stringify(obj),
				headers: """),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
					"""),format.raw/*29.6*/("""'Content-Type': 'application/json'
				"""),format.raw/*30.5*/("""}"""),format.raw/*30.6*/(""",
				type: "POST"
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/(""").done(function(data) """),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
				"""),format.raw/*33.5*/("""console.log(data);
				var response = data;
				if("error" in response)"""),format.raw/*35.28*/("""{"""),format.raw/*35.29*/("""
					"""),format.raw/*36.6*/("""document.getElementById("msg1").innerHTML = "Email already used";
					document.getElementById("create").disabled = true;
				"""),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""else"""),format.raw/*38.10*/("""{"""),format.raw/*38.11*/("""
					"""),format.raw/*39.6*/("""document.getElementById("msg1").innerHTML = "";
					document.getElementById("create").disabled = false;
					return true;
				"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""
			"""),format.raw/*43.4*/("""}"""),format.raw/*43.5*/(""");
		"""),format.raw/*44.3*/("""}"""),format.raw/*44.4*/("""
"""),format.raw/*45.1*/("""</script>

"""),_display_(/*47.2*/main("Signup")/*47.16*/ {_display_(Seq[Any](format.raw/*47.18*/("""  
	
	"""),_display_(/*49.3*/helper/*49.9*/.form(action = routes.Application.createNewUser)/*49.57*/ {_display_(Seq[Any](format.raw/*49.59*/("""
"""),format.raw/*50.1*/("""<div class="container"
	style="background-image: url('"""),_display_(/*51.33*/routes/*51.39*/.Assets.at("images/login-background.jpg")),format.raw/*51.80*/("""'); height: 90vh; background-size: 100%; ">
	<div
		class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form class="form-signin">
			<h1 class="form-signin-heading" align="center">Sign up</h1>
			<div class="row">
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="firstName" id="firstName"
							class="form-control" placeholder="First Name" required=""
							value='"""),_display_(/*61.16*/userForm("firstName")/*61.37*/.value),format.raw/*61.43*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="middleInitial" id="middleInitial"
							class="form-control" placeholder="Middle Name"
							value='"""),_display_(/*68.16*/userForm("middleInitial")/*68.41*/.value),format.raw/*68.47*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="lastName" id="lastName"
							class="form-control" placeholder="Last Name" required=""
							value='"""),_display_(/*75.16*/userForm("lastName")/*75.36*/.value),format.raw/*75.42*/("""'>
					</div>
				</div>
			</div>
			
			<div class="form-group">
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email address" required=""
					value='"""),_display_(/*83.14*/userForm("email")/*83.31*/.value),format.raw/*83.37*/("""' onchange="isEmailExisted()">
			</div>
			<div class="form-group" id="msg1" style="color: red;"></div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<input type="password" name="password" id="password"
							class="form-control" placeholder="Password" required=""
							value='"""),_display_(/*92.16*/userForm("password")/*92.36*/.value),format.raw/*92.42*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<input type="password" name="repassword" id="repassword"
							class="form-control" placeholder="Re-enter Password"
							oninput="checkpwd()" />
					</div>
				</div>
			</div>
			<div class="form-group" id="msg" style="color: red;"></div>
			
			<div class="form-group">
				<input type="text" name="affiliation" id="affiliation"
					class="form-control" placeholder="Affiliation"
					value='"""),_display_(/*108.14*/userForm("affiliation")/*108.37*/.value),format.raw/*108.43*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="title" id="title" class="form-control"
					placeholder="Title" value='"""),_display_(/*112.34*/userForm("title")/*112.51*/.value),format.raw/*112.57*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="mailingAddress" id="mailingAddress"
					class="form-control" placeholder="Mailing Address"
					value='"""),_display_(/*117.14*/userForm("mailingAddress")/*117.40*/.value),format.raw/*117.46*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="phoneNumber" id="phoneNumber"
					class="form-control" placeholder="Phone Number"
					value='"""),_display_(/*122.14*/userForm("phoneNumber")/*122.37*/.value),format.raw/*122.43*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="faxNumber" id="faxNumber"
					class="form-control" placeholder="Fax Number"
					value='"""),_display_(/*127.14*/userForm("faxNumber")/*127.35*/.value),format.raw/*127.41*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="researchFields" id="researchFields"
					class="form-control" placeholder="Research Fields"
					value='"""),_display_(/*132.14*/userForm("researchFields")/*132.40*/.value),format.raw/*132.46*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="highestDegree" id="highestDegree"
					class="form-control" placeholder="Highest Degree"
					value='"""),_display_(/*137.14*/userForm("highestDegree")/*137.39*/.value),format.raw/*137.45*/("""'>
			</div>

			<div class="actions row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<input type="submit" class="btn btn-primary btn-block"
						value="Create" id="create">
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<a href=""""),_display_(/*146.16*/routes/*146.22*/.Application.login()),format.raw/*146.42*/("""" class="btn btn-success btn-block">Sign in</a>
				</div>
			</div>
		</form>
	</div>
</div>

""")))}),format.raw/*153.2*/(""" 
""")))}),format.raw/*154.2*/("""
"""))}
  }

  def render(userForm:play.data.Form[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/signup.scala.html
                  HASH: 7aea43cbd3a39bd573b9c2ae81c848989baadf17
                  MATRIX: 745->1|887->40|914->58|942->60|1022->113|1050->114|1081->119|1228->239|1256->240|1289->246|1465->395|1493->396|1525->400|1554->401|1587->407|1740->533|1768->534|1798->537|1826->538|1859->544|1913->570|1942->571|1973->575|2066->640|2095->641|2128->647|2172->664|2200->665|2231->669|2266->676|2295->677|2327->682|2423->750|2452->751|2485->757|2551->796|2579->797|2628->819|2656->820|2706->842|2735->843|2767->848|2866->919|2895->920|2928->926|3081->1052|3109->1053|3141->1057|3170->1058|3203->1064|3357->1191|3385->1192|3416->1196|3444->1197|3476->1202|3504->1203|3532->1204|3570->1216|3593->1230|3633->1232|3666->1239|3680->1245|3737->1293|3777->1295|3805->1296|3887->1351|3902->1357|3964->1398|4438->1845|4468->1866|4495->1872|4758->2108|4792->2133|4819->2139|5082->2375|5111->2395|5138->2401|5360->2596|5386->2613|5413->2619|5783->2962|5812->2982|5839->2988|6375->3496|6408->3519|6436->3525|6606->3667|6633->3684|6661->3690|6864->3865|6900->3891|6928->3897|7122->4063|7155->4086|7183->4092|7371->4252|7402->4273|7430->4279|7633->4454|7669->4480|7697->4486|7897->4658|7932->4683|7960->4689|8243->4944|8259->4950|8301->4970|8428->5066|8462->5069
                  LINES: 26->1|29->1|30->3|32->5|33->6|33->6|34->7|36->9|36->9|37->10|40->13|40->13|40->13|40->13|41->14|44->17|44->17|45->18|45->18|47->20|47->20|47->20|48->21|49->22|49->22|50->23|51->24|51->24|52->25|52->25|52->25|53->26|55->28|55->28|56->29|57->30|57->30|59->32|59->32|59->32|59->32|60->33|62->35|62->35|63->36|65->38|65->38|65->38|65->38|66->39|69->42|69->42|70->43|70->43|71->44|71->44|72->45|74->47|74->47|74->47|76->49|76->49|76->49|76->49|77->50|78->51|78->51|78->51|88->61|88->61|88->61|95->68|95->68|95->68|102->75|102->75|102->75|110->83|110->83|110->83|119->92|119->92|119->92|135->108|135->108|135->108|139->112|139->112|139->112|144->117|144->117|144->117|149->122|149->122|149->122|154->127|154->127|154->127|159->132|159->132|159->132|164->137|164->137|164->137|173->146|173->146|173->146|180->153|181->154
                  -- GENERATED --
              */
          