
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
object updateUserForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.24*/("""
"""),_display_(/*3.2*/main("Update Users Form")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""

    """),format.raw/*5.5*/("""<div class="clearfix  " id="name_field">
                    
    <legend>User Update Form</legend>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.UsersController.getAllUsers())/*8.64*/{_display_(Seq[Any](format.raw/*8.65*/("""
    """),format.raw/*9.5*/("""<fieldset>
    """),_display_(/*10.6*/helper/*10.12*/.inputText(userForm("userName"),'_label -> "User Name*")),format.raw/*10.68*/("""
    """),_display_(/*11.6*/helper/*11.12*/.inputText(userForm("firstName"), '_label -> "First Name*")),format.raw/*11.71*/("""
    """),_display_(/*12.6*/helper/*12.12*/.inputText(userForm("middleInitial"), '_label -> "Middle Name")),format.raw/*12.75*/("""
    """),_display_(/*13.6*/helper/*13.12*/.inputText(userForm("lastName"), '_label -> "Last Name")),format.raw/*13.68*/("""

    """),_display_(/*15.6*/textarea(
                userForm("affiliation"), 
                '_label -> "Affliation", 'cols -> 50, 'rows -> 5
            )),format.raw/*18.14*/("""
    """),_display_(/*19.6*/helper/*19.12*/.inputText(userForm("email"), '_label -> "Email")),format.raw/*19.61*/("""
    """),_display_(/*20.6*/helper/*20.12*/.inputText(userForm("researchFields"),  '_label -> "Research Area")),format.raw/*20.79*/("""
    """),format.raw/*21.5*/("""<input type="submit" class="btn btn-primary" value="Update">
    <fieldset>
    </div>
""")))}),format.raw/*24.2*/("""
""")))}),format.raw/*25.2*/("""

"""))}
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/updateUserForm.scala.html
                  HASH: 78ed3b1c44d762e423c07aac93d8c135f78eec37
                  MATRIX: 736->1|861->23|888->42|921->67|959->68|991->74|1121->179|1135->185|1195->237|1233->238|1264->243|1306->259|1321->265|1398->321|1430->327|1445->333|1525->392|1557->398|1572->404|1656->467|1688->473|1703->479|1780->535|1813->542|1964->672|1996->678|2011->684|2081->733|2113->739|2128->745|2216->812|2248->817|2366->905|2398->907
                  LINES: 26->1|29->1|30->3|30->3|30->3|32->5|35->8|35->8|35->8|35->8|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|42->15|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|51->24|52->25
                  -- GENERATED --
              */
          