
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
object dataSetList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Dataset],play.data.Form[Dataset],List[Dataset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataSets: List[Dataset], dataSetForm: play.data.Form[Dataset], datasetsTopK: List[Dataset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import java.math.BigInteger;var k=1;
def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	"""),format.raw/*7.2*/("""<script src='"""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/edit_button.js")),format.raw/*7.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*9.30*/("""{"""),format.raw/*9.31*/("""
		"""),format.raw/*10.3*/("""//alert($("#url").text());
	"""),format.raw/*11.2*/("""}"""),format.raw/*11.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(/*15.2*/main("Dataset List", scripts)/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/(""" 
	 
    """),format.raw/*17.5*/("""<h1>Climate Datasets</h1>
    <h2>"""),_display_(/*18.10*/dataSets/*18.18*/.size()),format.raw/*18.25*/(""" """),format.raw/*18.26*/("""Datasets Found</h2>
    
<!-- 
		<div style="overflow-y:scroll">
		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>

	</tr>
	</thead>
	<tbody>
-->


<section id="courses">
    <div id="carousel1" class="carousel slide" data-ride="carousel" > 
        <!-- Indicators -->         

        <ol class="carousel-indicators"> 
            <li data-target="#carousel1" data-slide-to="0" class="active"></li>             

            <li data-target="#carousel1" data-slide-to="1"></li>             

            <li data-target="#carousel1" data-slide-to="2"></li>             
        </ol>         

        <!-- Wrapper for slides -->         

        <div class="carousel-inner" style="background: url('"""),_display_(/*60.62*/routes/*60.68*/.Assets.at("images/pc.gif")),format.raw/*60.95*/("""') no-repeat left center; background-size: cover; -webkit-filter: blur(0px);  -moz-filter: blur(2px);  -o-filter: blur(2px);  -ms-filter: blur(2px);  filter: blur(2px);"> 
				   """),_display_(/*61.9*/for(dataSet <- datasetsTopK) yield /*61.37*/{_display_(Seq[Any](format.raw/*61.38*/("""
				   """),_display_(/*62.9*/if(k == 1)/*62.19*/ {_display_(Seq[Any](format.raw/*62.21*/("""
				    """),format.raw/*63.9*/("""<div class="item active" >
				    """),_display_(/*64.10*/{k=0}),format.raw/*64.15*/("""				    
				    """)))}/*65.10*/else/*65.14*/{_display_(Seq[Any](format.raw/*65.15*/("""
				    """),format.raw/*66.9*/("""<div class="item" > 
				    """)))}),format.raw/*67.10*/("""
						"""),format.raw/*68.7*/("""<div class="text-left " >
								<div class="well col-lg-offset-4 col-lg-4 col-sm-offset-3 col-sm-6">
									<div class="text-center">
										<img class="card-img-top" style=" width:60%;"
											src='"""),_display_(/*72.18*/routes/*72.24*/.Assets.at("images/data.png")),format.raw/*72.53*/("""' >
									</div>
									<div class="card-block text-center">
										<h4 class="card-title">"""),_display_(/*75.35*/dataSet/*75.42*/.getName()),format.raw/*75.52*/("""</h4>
										<p class="card-text text-muted">A data set (or dataset) is a collection of data.</p>
									</div>
									<ul class="list-group list-group-flush">
										<li class="list-group-item"><strong>Agency:</strong> <code>"""),_display_(/*79.71*/dataSet/*79.78*/.getAgencyId()),format.raw/*79.92*/("""</code></li>
										<li class="list-group-item"><strong>Instrument:</strong> <code>"""),_display_(/*80.75*/dataSet/*80.82*/.getInstrument()),format.raw/*80.98*/("""</code></li>
										<li class="list-group-item"><strong>Units:</strong> <code>"""),_display_(/*81.70*/dataSet/*81.77*/.getUnits()),format.raw/*81.88*/("""</code></li>
										<li class="list-group-item"><strong>Start Time:</strong> <code>"""),_display_(/*82.75*/dataSet/*82.82*/.getStartTime()),format.raw/*82.97*/("""</code></li>
										<li class="list-group-item"><strong>End Time:</strong> <code>"""),_display_(/*83.73*/dataSet/*83.80*/.getEndTime()),format.raw/*83.93*/("""</code></li>
										<li class="list-group-item"><strong>Physical Variable:</strong> <code>"""),_display_(/*84.82*/dataSet/*84.89*/.getPhysicalVariable()),format.raw/*84.111*/("""</code></li>
										
										<!--  
										<li class="list-group-item"><strong>Start Time:</strong> <code>"""),_display_(/*87.75*/dataSet/*87.82*/.getStartTime()),format.raw/*87.97*/("""</code></li>
										<li class="list-group-item"><strong>End Time::</strong> <code>"""),_display_(/*88.74*/dataSet/*88.81*/.getEndTime),format.raw/*88.92*/("""</code></li>
										-->
									</ul>
									<div class="card-block">
										<a href="#" class="card-link col-lg-offset-2 col-lg-4">Card link</a> 
										<a href="#" class="card-link col-lg-4">Another link</a>
									</div>
									
									<br>
									<div>
										<h4 class="card-title text-center"><strong>People also research:</strong></h4>
									</div>
									
									<div class="row">
									  <div class="col-md-6">
									    <div class="thumbnail">
									      <img src='"""),_display_(/*104.27*/routes/*104.33*/.Assets.at("images/github.png")),format.raw/*104.64*/("""' >
									      <div class="caption">
									        <h5>NASA</h5>				        
									        <p><a href="#" class="btn btn-primary" role="button">Go</a> <a href="#" class="btn btn-default" role="button">Ignore</a></p>
									      </div>				      
									    </div>
									  </div>
									  <div class="col-md-6">
									    <div class="thumbnail">
									      <img src='"""),_display_(/*113.27*/routes/*113.33*/.Assets.at("images/bug.png")),format.raw/*113.61*/("""' >
									      <div class="caption">
									        <h5>ARGO</h5>				        
									        <p><a href="#" class="btn btn-primary" role="button">Go</a> <a href="#" class="btn btn-default" role="button">Ignore</a></p>
									      </div>				      
									    </div>
									  </div>
									</div>
									
								</div>
						</div>
					</div>
				<!--  
							<tr>
								<td><font size="2">"""),_display_(/*127.29*/dataSet/*127.36*/.getId()),format.raw/*127.44*/("""</font></td>
								<td><font size="2">"""),_display_(/*128.29*/dataSet/*128.36*/.getName()),format.raw/*128.46*/("""</font></td>
								<td><font size="2">"""),_display_(/*129.29*/dataSet/*129.36*/.getAgencyId()),format.raw/*129.50*/("""</font></td>
								<td><font size="2">"""),_display_(/*130.29*/dataSet/*130.36*/.getInstrument()),format.raw/*130.52*/("""</font></td>
								<td><font size="2">"""),_display_(/*131.29*/dataSet/*131.36*/.getPhysicalVariable()),format.raw/*131.58*/("""</font></td>
								<td><font size="2">"""),_display_(/*132.29*/dataSet/*132.36*/.getCMIP5VarName()),format.raw/*132.54*/("""</font></td>
								<td><font size="2">"""),_display_(/*133.29*/dataSet/*133.36*/.getUnits()),format.raw/*133.47*/("""</font></td>
								<td><font size="2">"""),_display_(/*134.29*/dataSet/*134.36*/.getGridDimension()),format.raw/*134.55*/("""</font></td>
								<td><font size="2">"""),_display_(/*135.29*/dataSet/*135.36*/.getVariableNameInWebInterface()),format.raw/*135.68*/("""</font></td>
								<td><font size="2">"""),_display_(/*136.29*/dataSet/*136.36*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*136.94*/("""</font></td>
								<td><font size="2">"""),_display_(/*137.29*/dataSet/*137.36*/.getStartTime()),format.raw/*137.51*/("""</font></td>
								<td><font size="2">"""),_display_(/*138.29*/dataSet/*138.36*/.getEndTime()),format.raw/*138.49*/("""</font></td>
							</tr>
				-->
					""")))}),format.raw/*141.7*/("""
        """),format.raw/*142.9*/("""</div>         

        <!-- Controls -->         

        <a class="left carousel-control" href="#carousel1" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a>
        <a class="right carousel-control" href="#carousel1" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span>  </a>          
    </div>          
</section>


<h1>Datasets List</h1>
<div style="overflow-y:scroll">
		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<!-- 
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		-->
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Duration</th>

	</tr>
	</thead>
	<tbody>
"""),_display_(/*178.2*/for(dataSet <- dataSets) yield /*178.26*/{_display_(Seq[Any](format.raw/*178.27*/("""
							"""),format.raw/*179.8*/("""<tr>
								<!-- 
								<td><font size="2">"""),_display_(/*181.29*/dataSet/*181.36*/.getId()),format.raw/*181.44*/("""</font></td>
								-->
								<td><font size="2">"""),_display_(/*183.29*/dataSet/*183.36*/.getName()),format.raw/*183.46*/("""</font></td>
								<td><font size="2">"""),_display_(/*184.29*/dataSet/*184.36*/.getAgencyId()),format.raw/*184.50*/("""</font></td>
								<td><font size="2">"""),_display_(/*185.29*/dataSet/*185.36*/.getInstrument()),format.raw/*185.52*/("""</font></td>
								<td><font size="2">"""),_display_(/*186.29*/dataSet/*186.36*/.getPhysicalVariable()),format.raw/*186.58*/("""</font></td>
								<td><font size="2">"""),_display_(/*187.29*/dataSet/*187.36*/.getCMIP5VarName()),format.raw/*187.54*/("""</font></td>
								<td><font size="2">"""),_display_(/*188.29*/dataSet/*188.36*/.getUnits()),format.raw/*188.47*/("""</font></td>
								<td><font size="2">"""),_display_(/*189.29*/dataSet/*189.36*/.getGridDimension()),format.raw/*189.55*/("""</font></td>
								<td><font size="2">"""),_display_(/*190.29*/dataSet/*190.36*/.getVariableNameInWebInterface()),format.raw/*190.68*/("""</font></td>
								<td><font size="2">"""),_display_(/*191.29*/dataSet/*191.36*/.getDataSourceInputParameterToCallScienceApplicationCode()),format.raw/*191.94*/("""</font></td>
								<td><font size="2">"""),_display_(/*192.29*/dataSet/*192.36*/.getStartTime()),format.raw/*192.51*/("""</font></td>
								<td><font size="2">"""),_display_(/*193.29*/dataSet/*193.36*/.getEndTime()),format.raw/*193.49*/("""</font></td>
								<td><font size="2">"""),_display_(/*194.29*/dataSet/*194.36*/.getDuration()),format.raw/*194.50*/("""</font></td>
							</tr>
							""")))}),format.raw/*196.9*/("""

	
	"""),format.raw/*199.2*/("""</tbody>
    </table>
    </div>
""")))}),format.raw/*202.2*/("""
"""))}
  }

  def render(dataSets:List[Dataset],dataSetForm:play.data.Form[Dataset],datasetsTopK:List[Dataset]): play.twirl.api.HtmlFormat.Appendable = apply(dataSets,dataSetForm,datasetsTopK)

  def f:((List[Dataset],play.data.Form[Dataset],List[Dataset]) => play.twirl.api.HtmlFormat.Appendable) = (dataSets,dataSetForm,datasetsTopK) => apply(dataSets,dataSetForm,datasetsTopK)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 16:10:01 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/dataSetList.scala.html
                  HASH: f8a5ef78bef8c227c345010fdf828d5014a694d8
                  MATRIX: 774->1|989->152|1003->159|1083->163|1111->165|1151->179|1165->185|1225->225|1326->299|1354->300|1384->303|1439->331|1467->332|1521->93|1549->150|1577->347|1606->350|1644->379|1684->381|1720->390|1782->425|1799->433|1827->440|1856->441|3557->2115|3572->2121|3620->2148|3826->2328|3870->2356|3909->2357|3944->2366|3963->2376|4003->2378|4039->2387|4102->2423|4128->2428|4165->2446|4178->2450|4217->2451|4253->2460|4314->2490|4348->2497|4586->2708|4601->2714|4651->2743|4778->2843|4794->2850|4825->2860|5089->3097|5105->3104|5140->3118|5254->3205|5270->3212|5307->3228|5416->3310|5432->3317|5464->3328|5578->3415|5594->3422|5630->3437|5742->3522|5758->3529|5792->3542|5913->3636|5929->3643|5973->3665|6115->3780|6131->3787|6167->3802|6280->3888|6296->3895|6328->3906|6872->4422|6888->4428|6941->4459|7362->4852|7378->4858|7428->4886|7869->5299|7886->5306|7916->5314|7985->5355|8002->5362|8034->5372|8103->5413|8120->5420|8156->5434|8225->5475|8242->5482|8280->5498|8349->5539|8366->5546|8410->5568|8479->5609|8496->5616|8536->5634|8605->5675|8622->5682|8655->5693|8724->5734|8741->5741|8782->5760|8851->5801|8868->5808|8922->5840|8991->5881|9008->5888|9088->5946|9157->5987|9174->5994|9211->6009|9280->6050|9297->6057|9332->6070|9403->6110|9440->6119|11026->7678|11067->7702|11107->7703|11143->7711|11218->7758|11235->7765|11265->7773|11346->7826|11363->7833|11395->7843|11464->7884|11481->7891|11517->7905|11586->7946|11603->7953|11641->7969|11710->8010|11727->8017|11771->8039|11840->8080|11857->8087|11897->8105|11966->8146|11983->8153|12016->8164|12085->8205|12102->8212|12143->8231|12212->8272|12229->8279|12283->8311|12352->8352|12369->8359|12449->8417|12518->8458|12535->8465|12572->8480|12641->8521|12658->8528|12693->8541|12762->8582|12779->8589|12815->8603|12880->8637|12913->8642|12978->8676
                  LINES: 26->1|29->6|29->6|31->6|32->7|32->7|32->7|32->7|34->9|34->9|35->10|36->11|36->11|39->1|41->5|42->13|44->15|44->15|44->15|46->17|47->18|47->18|47->18|47->18|89->60|89->60|89->60|90->61|90->61|90->61|91->62|91->62|91->62|92->63|93->64|93->64|94->65|94->65|94->65|95->66|96->67|97->68|101->72|101->72|101->72|104->75|104->75|104->75|108->79|108->79|108->79|109->80|109->80|109->80|110->81|110->81|110->81|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|116->87|116->87|116->87|117->88|117->88|117->88|133->104|133->104|133->104|142->113|142->113|142->113|156->127|156->127|156->127|157->128|157->128|157->128|158->129|158->129|158->129|159->130|159->130|159->130|160->131|160->131|160->131|161->132|161->132|161->132|162->133|162->133|162->133|163->134|163->134|163->134|164->135|164->135|164->135|165->136|165->136|165->136|166->137|166->137|166->137|167->138|167->138|167->138|170->141|171->142|207->178|207->178|207->178|208->179|210->181|210->181|210->181|212->183|212->183|212->183|213->184|213->184|213->184|214->185|214->185|214->185|215->186|215->186|215->186|216->187|216->187|216->187|217->188|217->188|217->188|218->189|218->189|218->189|219->190|219->190|219->190|220->191|220->191|220->191|221->192|221->192|221->192|222->193|222->193|222->193|223->194|223->194|223->194|225->196|228->199|231->202
                  -- GENERATED --
              */
          