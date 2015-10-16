
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
object bugs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[BugReport],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bugReports: List[BugReport]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Bug Reports")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    
    """),format.raw/*7.5*/("""<h1> Bug Reports(s)</h1>
		<table class="table table-striped table-bordered ">
			<thead ">
			<tr>
	    	  <td>Solved</td>
	    	  <td>Report Title</td>
	    	  <td>Reporter Name</td>
	    	  <td>Reporter's email</td>
	    	  <td>Reporter's organization</td>
	    	  <td>Bug content</td>
	    	  <td>Operation</td>
	        </tr>
			</thead>
			
			<tbody>
            <tr>
               """),_display_(/*23.17*/for(bugReport <- bugReports) yield /*23.45*/ {_display_(Seq[Any](format.raw/*23.47*/("""
                    """),format.raw/*24.21*/("""<tr>
                    	<td>
                    		"""),_display_(/*26.24*/{if(bugReport.getSolved()==1){"Yes"}
                    			else{"No"}
                    		}),format.raw/*28.24*/("""
                    			
                    	"""),format.raw/*30.22*/("""</td>
                        <td>
                            """),_display_(/*32.30*/bugReport/*32.39*/.getTitle()),format.raw/*32.50*/("""
                        """),format.raw/*33.25*/("""</td>
                        <td> 
                            """),_display_(/*35.30*/bugReport/*35.39*/.getName()),format.raw/*35.49*/("""
                        """),format.raw/*36.25*/("""</td>
                        <td> 
                            """),_display_(/*38.30*/bugReport/*38.39*/.getEmail()),format.raw/*38.50*/("""
                        """),format.raw/*39.25*/("""</td>
                        <td> 
                            """),_display_(/*41.30*/bugReport/*41.39*/.getOrganization()),format.raw/*41.57*/("""
                        """),format.raw/*42.25*/("""</td>
                        <td> 
                            """),_display_(/*44.30*/bugReport/*44.39*/.getDescription()),format.raw/*44.56*/("""
                        """),format.raw/*45.25*/("""</td>
                        
                        
                        <td>
                        <div class="input-group input-group-sm">
                        <span>
						"""),_display_(/*51.8*/form(routes.BugReportController.solveReport())/*51.54*/{_display_(Seq[Any](format.raw/*51.55*/("""
               		 		"""),format.raw/*52.21*/("""<input name="idHolder" type="hidden" value=""""),_display_(/*52.66*/bugReport/*52.75*/.getId()),format.raw/*52.83*/("""">
        					<input type="submit"  class="btn btn-success" value="Solve" onclick="return confirm('Are you sure you want to solve this issue?')">
        				""")))}),format.raw/*54.14*/("""	
        				"""),format.raw/*55.13*/("""</span>
                        <span>
						"""),_display_(/*57.8*/form(routes.BugReportController.deleteReport())/*57.55*/{_display_(Seq[Any](format.raw/*57.56*/("""
               		 		"""),format.raw/*58.21*/("""<input name="idHolder" type="hidden" value=""""),_display_(/*58.66*/bugReport/*58.75*/.getId()),format.raw/*58.83*/("""">
        					<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this issue?')">
        				""")))}),format.raw/*60.14*/("""	
        				"""),format.raw/*61.13*/("""</span>
        				</div>
           				
						
						</td>
                    </tr>
                """)))}),format.raw/*67.18*/("""
            """),format.raw/*68.13*/("""</tr>
            </tbody>

    </table>
    
""")))}))}
  }

  def render(bugReports:List[BugReport]): play.twirl.api.HtmlFormat.Appendable = apply(bugReports)

  def f:((List[BugReport]) => play.twirl.api.HtmlFormat.Appendable) = (bugReports) => apply(bugReports)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/bugs.scala.html
                  HASH: 1156da530508b58b3d3939c795b97e1e303f43fb
                  MATRIX: 731->1|863->30|891->49|918->51|945->70|984->72|1020->82|1438->473|1482->501|1522->503|1571->524|1652->578|1767->672|1841->718|1932->782|1950->791|1982->802|2035->827|2127->892|2145->901|2176->911|2229->936|2321->1001|2339->1010|2371->1021|2424->1046|2516->1111|2534->1120|2573->1138|2626->1163|2718->1228|2736->1237|2774->1254|2827->1279|3041->1467|3096->1513|3135->1514|3184->1535|3256->1580|3274->1589|3303->1597|3495->1758|3537->1772|3609->1818|3665->1865|3704->1866|3753->1887|3825->1932|3843->1941|3872->1949|4065->2111|4107->2125|4243->2230|4284->2243
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|50->23|50->23|50->23|51->24|53->26|55->28|57->30|59->32|59->32|59->32|60->33|62->35|62->35|62->35|63->36|65->38|65->38|65->38|66->39|68->41|68->41|68->41|69->42|71->44|71->44|71->44|72->45|78->51|78->51|78->51|79->52|79->52|79->52|79->52|81->54|82->55|84->57|84->57|84->57|85->58|85->58|85->58|85->58|87->60|88->61|94->67|95->68
                  -- GENERATED --
              */
          