
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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Header -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/">
					<div>
					<img src='"""),_display_(/*13.17*/routes/*13.23*/.Assets.at("images/NASA_JPL_logo.png")),format.raw/*13.61*/("""' style="height: 30px; width: 180px;">&nbsp&nbsp
					<img src='"""),_display_(/*14.17*/routes/*14.23*/.Assets.at("images/logo.png")),format.raw/*14.52*/("""' style="height: 15px; width: 200px;">
					</div>
				</a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Web Service<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*24.22*/routes/*24.28*/.ClimateServiceController.mostRecentlyAddedClimateServices()),format.raw/*24.88*/("""">Most Recently Added</a></li>
							<li><a href=""""),_display_(/*25.22*/routes/*25.28*/.ClimateServiceController.mostRecentlyUsedClimateServices),format.raw/*25.85*/("""">Most Recently Used</a></li>
							<li><a href=""""),_display_(/*26.22*/routes/*26.28*/.ClimateServiceController.mostPopularServices()),format.raw/*26.75*/("""">Most Popular</a></li>
							<li><a href=""""),_display_(/*27.22*/routes/*27.28*/.ClimateServiceController.showAllClimateServices()),format.raw/*27.78*/("""">Service List</a></li>
							"""),_display_(/*28.9*/if(true)/*28.17*/ {_display_(Seq[Any](format.raw/*28.19*/("""
								"""),format.raw/*29.9*/("""<li><a href=""""),_display_(/*29.23*/routes/*29.29*/.ClimateServiceController.addAClimateService()),format.raw/*29.75*/("""">Register A Service</a></li>
							""")))}),format.raw/*30.9*/("""
							"""),format.raw/*31.8*/("""<li><a>Search Service</a></li>
						</ul>				
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dataset<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a>Most Popular</a></li>
							<li><a href=""""),_display_(/*39.22*/routes/*39.28*/.DatasetController.showAllDatasets()),format.raw/*39.64*/("""">Dataset List</a></li>
							"""),_display_(/*40.9*/if(true)/*40.17*/ {_display_(Seq[Any](format.raw/*40.19*/("""
								"""),format.raw/*41.9*/("""<li><a href="#">Register A Dataset</a></li>
							""")))}),format.raw/*42.9*/("""
							"""),format.raw/*43.8*/("""<li><a href=""""),_display_(/*43.22*/routes/*43.28*/.DatasetController.searchDataset()),format.raw/*43.62*/("""">Search Dataset</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Analytics<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*50.22*/routes/*50.28*/.ServiceExecutionLogController.getServiceLog),format.raw/*50.72*/("""">Service Execution Log</a></li>
							<li><a href=""""),_display_(/*51.22*/routes/*51.28*/.ServiceExecutionLogController.searchServiceLog),format.raw/*51.75*/("""">Search Service Log</a></li>
							<li><a href=""""),_display_(/*52.22*/routes/*52.28*/.DatasetLogController.getAllDatasetLogs),format.raw/*52.67*/("""">Dataset Log</a></li>
							<li><a href=""""),_display_(/*53.22*/routes/*53.28*/.AnalyticsController.getRecommend),format.raw/*53.61*/("""">Semantic Service Analytics</a></li>
							<li><a href=""""),_display_(/*54.22*/routes/*54.28*/.AnalyticsController.getDatasetRecommend),format.raw/*54.68*/("""">Semantic Dataset Analytics</a></li>
							<li><a href=""""),_display_(/*55.22*/routes/*55.28*/.AnalyticsController.getScientistRecommend),format.raw/*55.70*/("""">User Analytics</a></li>
							<li><a href=""""),_display_(/*56.22*/routes/*56.28*/.AnalyticsController.getLogGraph),format.raw/*56.60*/("""">Service Execution Log Analytics</a></li>
							<li><a href=""""),_display_(/*57.22*/routes/*57.28*/.AnalyticsController.getSearchAndGenerateWorkflow),format.raw/*57.77*/("""">Generate Workflow</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Scientist<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*64.22*/routes/*64.28*/.UsersController.getAllUsers()),format.raw/*64.58*/("""">All Users</a></li>
							<li><a href=""""),_display_(/*65.22*/routes/*65.28*/.UsersController.searchUser()),format.raw/*65.57*/("""">Search User</a></li>
							"""),_display_(/*66.9*/if(true)/*66.17*/ {_display_(Seq[Any](format.raw/*66.19*/("""
								"""),format.raw/*67.9*/("""<li><a href="#">Most Active Users</a></li>
								<li><a href=""""),_display_(/*68.23*/routes/*68.29*/.BugReportController.reports),format.raw/*68.57*/("""">Bug Report</a></li>
								<li><a href=""""),_display_(/*69.23*/routes/*69.29*/.BugReportController.list),format.raw/*69.54*/("""">Bug List</a></li>
							""")))}),format.raw/*70.9*/("""
						"""),format.raw/*71.7*/("""</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">About<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(/*77.22*/routes/*77.28*/.Application.home()),format.raw/*77.47*/("""">Home</a></li>
							<li><a href=""""),_display_(/*78.22*/routes/*78.28*/.AboutController.aboutUs()),format.raw/*78.54*/("""">About Us</a></li>
							<li><a href=""""),_display_(/*79.22*/routes/*79.28*/.AboutController.aboutProject()),format.raw/*79.59*/("""">About project</a></li>
							<li><a href=""""),_display_(/*80.22*/routes/*80.28*/.AboutController.tutorial()),format.raw/*80.55*/("""">Tutorial</a></li>
						</ul>
					</li>
					
					"""),_display_(/*84.7*/if(!session.get("email"))/*84.32*/ {_display_(Seq[Any](format.raw/*84.34*/("""
						"""),format.raw/*85.7*/("""<form class="navbar-form navbar-right" action=""""),_display_(/*85.55*/routes/*85.61*/.Application.login()),format.raw/*85.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*88.8*/else/*88.13*/{_display_(Seq[Any](format.raw/*88.14*/("""
						"""),format.raw/*89.7*/("""<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(/*98.68*/session/*98.75*/.get("email")),format.raw/*98.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(/*100.23*/routes/*100.29*/.Application.logout()),format.raw/*100.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))}),format.raw/*103.7*/("""	
										
					"""),_display_(/*105.7*/if(false)/*105.16*/ {_display_(Seq[Any](format.raw/*105.18*/("""
						"""),format.raw/*106.7*/("""<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))}),format.raw/*109.7*/("""						
					
				"""),format.raw/*111.5*/("""</ul>
			</div>
		</div>
	</div>
	
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/header.scala.html
                  HASH: e57d6c4aad567a0f8e011f022cc43d2b0dc87c72
                  MATRIX: 799->0|1342->516|1357->522|1416->560|1508->625|1523->631|1573->660|1962->1022|1977->1028|2058->1088|2137->1140|2152->1146|2230->1203|2308->1254|2323->1260|2391->1307|2463->1352|2478->1358|2549->1408|2607->1440|2624->1448|2664->1450|2700->1459|2741->1473|2756->1479|2823->1525|2891->1563|2926->1571|3232->1850|3247->1856|3304->1892|3362->1924|3379->1932|3419->1934|3455->1943|3537->1995|3572->2003|3613->2017|3628->2023|3683->2057|3946->2293|3961->2299|4026->2343|4107->2397|4122->2403|4190->2450|4268->2501|4283->2507|4343->2546|4414->2590|4429->2596|4483->2629|4569->2688|4584->2694|4645->2734|4731->2793|4746->2799|4809->2841|4883->2888|4898->2894|4951->2926|5042->2990|5057->2996|5127->3045|5393->3284|5408->3290|5459->3320|5528->3362|5543->3368|5593->3397|5650->3428|5667->3436|5707->3438|5743->3447|5835->3512|5850->3518|5899->3546|5970->3590|5985->3596|6031->3621|6089->3649|6123->3656|6350->3856|6365->3862|6405->3881|6469->3918|6484->3924|6531->3950|6599->3991|6614->3997|6666->4028|6739->4074|6754->4080|6802->4107|6883->4162|6917->4187|6957->4189|6991->4196|7066->4244|7081->4250|7122->4270|7232->4363|7245->4368|7284->4369|7318->4376|7729->4760|7745->4767|7779->4780|7889->4862|7905->4868|7948->4889|8029->4939|8075->4958|8094->4967|8135->4969|8170->4976|8348->5123|8393->5140
                  LINES: 29->1|41->13|41->13|41->13|42->14|42->14|42->14|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|57->29|58->30|59->31|67->39|67->39|67->39|68->40|68->40|68->40|69->41|70->42|71->43|71->43|71->43|71->43|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|105->77|105->77|105->77|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|112->84|112->84|112->84|113->85|113->85|113->85|113->85|116->88|116->88|116->88|117->89|126->98|126->98|126->98|128->100|128->100|128->100|131->103|133->105|133->105|133->105|134->106|137->109|139->111
                  -- GENERATED --
              */
          