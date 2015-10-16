
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
object searchUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""

"""),format.raw/*6.1*/("""<script type="text/javascript">	
	$(document).ready(function()"""),format.raw/*7.30*/("""{"""),format.raw/*7.31*/("""
		"""),format.raw/*8.3*/("""$( "#preview" ).click(function() """),format.raw/*8.36*/("""{"""),format.raw/*8.37*/("""
			"""),format.raw/*9.4*/("""var target = document.getElementById("show");
			if(target.style.display=="none")"""),format.raw/*10.36*/("""{"""),format.raw/*10.37*/("""
				"""),format.raw/*11.5*/("""target.style.display="block";
				$( "#preview" ).text("Hide");
				var userName = $("#userName").val();
				var affiliation = $("#affiliation").val();
				var email = $("#email").val();
				var researchFields = $("#researchFields").val();

				if(userName!="")"""),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
					"""),format.raw/*19.6*/("""$("#content").append(" User Name = "+userName);	
				"""),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
				"""),format.raw/*21.5*/("""if(affiliation!="" && affiliation!=null)"""),format.raw/*21.45*/("""{"""),format.raw/*21.46*/("""
					"""),format.raw/*22.6*/("""$("#content").append(" Affiliation = "+affiliation);	
				"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""
				"""),format.raw/*24.5*/("""if(email!="" && email!=null)"""),format.raw/*24.33*/("""{"""),format.raw/*24.34*/("""
					"""),format.raw/*25.6*/("""$("#content").append(" Email = "+email);	
				"""),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""
				"""),format.raw/*27.5*/("""if(researchFields!="" && researchFields!=null)"""),format.raw/*27.51*/("""{"""),format.raw/*27.52*/("""
					"""),format.raw/*28.6*/("""$("#content").append(" Research Area = "+researchFields);	
				"""),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""
				
			"""),format.raw/*31.4*/("""}"""),format.raw/*31.5*/("""else """),format.raw/*31.10*/("""{"""),format.raw/*31.11*/("""
				"""),format.raw/*32.5*/("""$("#content").val('');	
                target.style.display="none";
                $("#preview" ).text("Preview");
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*1.34*/(""" 
"""),format.raw/*3.1*/("""
"""),format.raw/*40.2*/(""" 

"""),_display_(/*42.2*/main("Search User", scripts)/*42.30*/{_display_(Seq[Any](format.raw/*42.31*/("""

	"""),format.raw/*44.2*/("""<h1 style="margin-left:520px">Search User</h1>
	
	<div class="ui-widget col-sm-offset-3 col-sm-7" id="search-form" >
		<div class="form-group" >
			"""),_display_(/*48.5*/inputText(userForm("User Name"), 'class -> "form-control", 'id -> "userName", '_label ->
			Messages("User Name"), 'placeholder -> "User Name", 'size->70)),format.raw/*49.66*/("""
		"""),format.raw/*50.3*/("""</div>
		<div class="form-group">
			"""),_display_(/*52.5*/inputText(userForm("Afflication"), 'class -> "form-control", 'id -> "affiliation", '_label ->
			Messages("Afflication"), 'placeholder -> "Afflication", 'size->70)),format.raw/*53.70*/("""
		"""),format.raw/*54.3*/("""</div>
		<div class="form-group">
			"""),_display_(/*56.5*/inputText(userForm("Email"), 'class -> "form-control", 'id -> "email", '_label ->
			Messages("Email"), 'placeholder -> "xxx@gmail.com", 'size->70)),format.raw/*57.66*/("""
		"""),format.raw/*58.3*/("""</div>
		<div class="form-group">
			"""),_display_(/*60.5*/inputText(userForm("Research Area"), 'class -> "form-control", 'id -> "researchFields", '_label
			-> Messages("Research Area"), 'placeholder -> "Research Area", 'size->70)),format.raw/*61.77*/("""
			"""),format.raw/*62.4*/("""<div id="show" style="display: none;">
				<textarea style="width: 640px" rows="4" id="content"></textarea>
			</div>
		</div>
		<div style="text-align:center">
			<button id="preview" type="button" class="btn btn-info">Preview</button>
			<input class="btn" type="submit" value="Search">
		</div>
	</div>

""")))}),format.raw/*72.2*/("""
"""))}
  }

  def render(userForm:play.data.Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/searchUser.scala.html
                  HASH: 705bf9731a08d9a7a0a1e1d2b8e87739120d565a
                  MATRIX: 742->1|860->55|874->62|954->66|982->68|1071->130|1099->131|1128->134|1188->167|1216->168|1246->172|1355->253|1384->254|1416->259|1705->520|1734->521|1767->527|1847->580|1875->581|1907->586|1975->626|2004->627|2037->633|2122->691|2150->692|2182->697|2238->725|2267->726|2300->732|2373->778|2401->779|2433->784|2507->830|2536->831|2569->837|2659->900|2687->901|2723->910|2751->911|2784->916|2813->917|2845->922|3002->1051|3031->1052|3061->1055|3089->1056|3120->1060|3148->1061|3205->33|3233->53|3261->1079|3291->1083|3328->1111|3367->1112|3397->1115|3572->1264|3747->1418|3777->1421|3841->1459|4025->1622|4055->1625|4119->1663|4287->1810|4317->1813|4381->1851|4574->2023|4605->2027|4943->2335
                  LINES: 26->1|28->4|28->4|30->4|32->6|33->7|33->7|34->8|34->8|34->8|35->9|36->10|36->10|37->11|44->18|44->18|45->19|46->20|46->20|47->21|47->21|47->21|48->22|49->23|49->23|50->24|50->24|50->24|51->25|52->26|52->26|53->27|53->27|53->27|54->28|55->29|55->29|57->31|57->31|57->31|57->31|58->32|61->35|61->35|62->36|62->36|63->37|63->37|67->1|68->3|69->40|71->42|71->42|71->42|73->44|77->48|78->49|79->50|81->52|82->53|83->54|85->56|86->57|87->58|89->60|90->61|91->62|101->72
                  -- GENERATED --
              */
          