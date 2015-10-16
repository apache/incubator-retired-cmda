
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
object bugReporting extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[BugReport],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bugReportForm: play.data.Form[BugReport]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Bug Reporting")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
        
    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.BugReportController.newReport)/*7.64*/ {_display_(Seq[Any](format.raw/*7.66*/("""
        
        """),format.raw/*9.9*/("""<fieldset>
            <legend>Bug Report</legend>
            
            """),_display_(/*12.14*/inputText(
                bugReportForm("name"), 
                '_label -> "Your name",                 
                '_error -> bugReportForm.globalError                                
            )),format.raw/*16.14*/("""
            """),_display_(/*17.14*/inputText(
                bugReportForm("title"), 
                '_label -> "Bug Title",                 
                '_error -> bugReportForm.globalError                                
            )),format.raw/*21.14*/("""
            """),_display_(/*22.14*/inputText(
                bugReportForm("email"), 
                '_label -> "Email",
                '_helper -> "You must be a registered user to report a bug",                 
                '_error -> bugReportForm.globalError                                
            )),format.raw/*27.14*/("""
            """),_display_(/*28.14*/inputText(
                bugReportForm("organization"), 
                '_label -> "Organization",                 
                '_error -> bugReportForm.globalError                                
            )),format.raw/*32.14*/("""
            """),_display_(/*33.14*/textarea(
                bugReportForm("description"), 
                '_label -> "Description", 'cols -> 65, 'rows -> 7                                               
            )),format.raw/*36.14*/("""
           
        """),format.raw/*38.9*/("""</fieldset>
        
      
        <div class="actions">
            <input type="submit" class="btn primary" value="Submit">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.Application.home()),format.raw/*43.48*/("""" class="btn">Cancel</a>
        </div>
        
    """)))}),format.raw/*46.6*/("""
    
""")))}),format.raw/*48.2*/("""
"""))}
  }

  def render(bugReportForm:play.data.Form[BugReport]): play.twirl.api.HtmlFormat.Appendable = apply(bugReportForm)

  def f:((play.data.Form[BugReport]) => play.twirl.api.HtmlFormat.Appendable) = (bugReportForm) => apply(bugReportForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/bugReporting.scala.html
                  HASH: 32ef4fc7b9e96752c9f5d34a70bceced25188efe
                  MATRIX: 749->1|894->43|922->62|949->64|978->85|1017->87|1057->102|1071->108|1131->160|1170->162|1214->180|1318->257|1545->463|1586->477|1814->684|1855->698|2156->978|2197->992|2435->1209|2476->1223|2680->1406|2728->1427|2904->1576|2919->1582|2959->1601|3043->1655|3080->1662
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|34->7|34->7|36->9|39->12|43->16|44->17|48->21|49->22|54->27|55->28|59->32|60->33|63->36|65->38|70->43|70->43|70->43|73->46|75->48
                  -- GENERATED --
              */
          