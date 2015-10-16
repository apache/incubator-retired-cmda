
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
object allUsers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],play.data.Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User], userForm: play.data.Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("All Users")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/users/*7.15*/.size()),format.raw/*7.22*/(""" """),format.raw/*7.23*/("""Users</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-1">Id</td>
		<td class="col-md-2">User Name</td>
		<td class="col-md-2">First Name</td>
		<td class="col-md-2">Middle Name</td>
		<td class="col-md-2">Last Name</td>
		<td class="col-md-2">Afflication</td>
		<td class="col-md-4">Email</td>
		<td class="col-md-2">Research Area</td>
		"""),_display_(/*18.4*/if(true)/*18.12*/{_display_(Seq[Any](format.raw/*18.13*/("""
			"""),format.raw/*19.4*/("""<td class="col-md-3">Operation</td> 
	     """)))}),format.raw/*20.8*/("""
	"""),format.raw/*21.2*/("""</tr>
	"""),_display_(/*22.3*/for(user <- users) yield /*22.21*/{_display_(Seq[Any](format.raw/*22.22*/("""
	"""),format.raw/*23.2*/("""<tr>
		<td>"""),_display_(/*24.8*/user/*24.12*/.getId()),format.raw/*24.20*/("""</td>
		
		<td><span class=""""),_display_(/*26.21*/user/*26.25*/.getId()),format.raw/*26.33*/(""" """),format.raw/*26.34*/("""editable" data-name='username'>"""),_display_(/*26.66*/user/*26.70*/.getUserName()),format.raw/*26.84*/("""</span></td>
				
		<td><span class=""""),_display_(/*28.21*/user/*28.25*/.getId()),format.raw/*28.33*/(""" """),format.raw/*28.34*/("""editable" data-name='firstName'>"""),_display_(/*28.67*/user/*28.71*/.getFirstName()),format.raw/*28.86*/("""</span></td>
				
		<td><span class=""""),_display_(/*30.21*/user/*30.25*/.getId()),format.raw/*30.33*/(""" """),format.raw/*30.34*/("""editable" data-name='middleInitial'>"""),_display_(/*30.71*/user/*30.75*/.getMiddleInitial()),format.raw/*30.94*/("""</span></td>
				
		<td><span class=""""),_display_(/*32.21*/user/*32.25*/.getId()),format.raw/*32.33*/(""" """),format.raw/*32.34*/("""editable" data-name='lastName'>"""),_display_(/*32.66*/user/*32.70*/.getLastName()),format.raw/*32.84*/("""</span></td>
		
		<td><span class=""""),_display_(/*34.21*/user/*34.25*/.getId()),format.raw/*34.33*/(""" """),format.raw/*34.34*/("""editable" data-name='affiliation'>"""),_display_(/*34.69*/user/*34.73*/.getAffiliation()),format.raw/*34.90*/("""</span></td>
				
		<td><span class=""""),_display_(/*36.21*/user/*36.25*/.getId()),format.raw/*36.33*/(""" """),format.raw/*36.34*/("""editable" data-name='email'>"""),_display_(/*36.63*/user/*36.67*/.getEmail()),format.raw/*36.78*/("""</span></td>
				
		<td><span class=""""),_display_(/*38.21*/user/*38.25*/.getId()),format.raw/*38.33*/(""" """),format.raw/*38.34*/("""editable" data-name='researchFields'>"""),_display_(/*38.72*/user/*38.76*/.getResearchFields()),format.raw/*38.96*/("""</span></td>
			
	</tr>
	""")))}),format.raw/*41.3*/("""
    """),format.raw/*42.5*/("""</table>
    """)))}),format.raw/*43.6*/("""

"""))}
  }

  def render(users:List[User],userForm:play.data.Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(users,userForm)

  def f:((List[User],play.data.Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (users,userForm) => apply(users,userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/allUsers.scala.html
                  HASH: 1817ee18e7fffc858f7a3891968b1dda36188ca7
                  MATRIX: 751->1|905->52|933->71|960->73|985->90|1024->92|1056->98|1087->103|1100->108|1127->115|1155->116|1576->511|1593->519|1632->520|1663->524|1737->568|1766->570|1800->578|1834->596|1873->597|1902->599|1940->611|1953->615|1982->623|2038->652|2051->656|2080->664|2109->665|2168->697|2181->701|2216->715|2281->753|2294->757|2323->765|2352->766|2412->799|2425->803|2461->818|2526->856|2539->860|2568->868|2597->869|2661->906|2674->910|2714->929|2779->967|2792->971|2821->979|2850->980|2909->1012|2922->1016|2957->1030|3020->1066|3033->1070|3062->1078|3091->1079|3153->1114|3166->1118|3204->1135|3269->1173|3282->1177|3311->1185|3340->1186|3396->1215|3409->1219|3441->1230|3506->1268|3519->1272|3548->1280|3577->1281|3642->1319|3655->1323|3696->1343|3752->1369|3784->1374|3828->1388
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|34->7|45->18|45->18|45->18|46->19|47->20|48->21|49->22|49->22|49->22|50->23|51->24|51->24|51->24|53->26|53->26|53->26|53->26|53->26|53->26|53->26|55->28|55->28|55->28|55->28|55->28|55->28|55->28|57->30|57->30|57->30|57->30|57->30|57->30|57->30|59->32|59->32|59->32|59->32|59->32|59->32|59->32|61->34|61->34|61->34|61->34|61->34|61->34|61->34|63->36|63->36|63->36|63->36|63->36|63->36|63->36|65->38|65->38|65->38|65->38|65->38|65->38|65->38|68->41|69->42|70->43
                  -- GENERATED --
              */
          