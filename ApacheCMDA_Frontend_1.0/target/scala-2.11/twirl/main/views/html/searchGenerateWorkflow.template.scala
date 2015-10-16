
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
object searchGenerateWorkflow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[ServiceExecutionLog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceLogForm: play.data.Form[ServiceExecutionLog]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*7.30*/("""{"""),format.raw/*7.31*/("""
		"""),format.raw/*8.3*/("""$( "#preview" ).click(function() """),format.raw/*8.36*/("""{"""),format.raw/*8.37*/("""
			"""),format.raw/*9.4*/("""var target = document.getElementById("show");
			if(target.style.display=="none")"""),format.raw/*10.36*/("""{"""),format.raw/*10.37*/("""
				"""),format.raw/*11.5*/("""target.style.display="block";
				$( "#preview" ).text("Hide");
				var userId = $("#userId").val();
				var startTime = $("#startTime").val();
				var endTime = $("#endTime").val();
				
				if(userId!="" && userId!=null)"""),format.raw/*17.35*/("""{"""),format.raw/*17.36*/("""
					"""),format.raw/*18.6*/("""$("#content").append(" UserId = "+userId);	
				"""),format.raw/*19.5*/("""}"""),format.raw/*19.6*/("""
				"""),format.raw/*20.5*/("""if(startTime!="" && startTime!=null)"""),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""
					"""),format.raw/*21.6*/("""$("#content").append(" Start Time = "+startTime);	
				"""),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""
				"""),format.raw/*23.5*/("""if(endTime!="" && endTime!=null)"""),format.raw/*23.37*/("""{"""),format.raw/*23.38*/("""
					"""),format.raw/*24.6*/("""$("#content").append(" End Time = "+endTime);	
				"""),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""
				
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""else """),format.raw/*27.10*/("""{"""),format.raw/*27.11*/("""
				"""),format.raw/*28.5*/("""$("#content").val('');	
                target.style.display="none";
                $( "#preview" ).text("Preview");
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
		"""),format.raw/*32.3*/("""}"""),format.raw/*32.4*/(""");
		if(jsonData!=null)"""),format.raw/*33.21*/("""{"""),format.raw/*33.22*/("""
			"""),format.raw/*34.4*/("""var jsonString = $('#jsonData').text();
	  	 	var obj = JSON.parse(jsonString);
	  	 	var data = "text/json;charset=utf-8," + encodeURIComponent(JSON.stringify(obj));
			
	  	 	$('<a href="data:' + data + '" download="data.json">download JSON</a>').appendTo('#download');
		"""),format.raw/*39.3*/("""}"""),format.raw/*39.4*/("""
		"""),format.raw/*40.3*/("""/* 
		$("#workflow-gen").click()"""),format.raw/*41.29*/("""{"""),format.raw/*41.30*/("""
			"""),format.raw/*42.4*/("""alert("0");
			var user = $("#userId").val();
			$("#user2").val(user);
			alert(user);
			var start = $("#startTime").val();
			$("#startTime2").val(start);
			var end = $("#endTime").val();
			$("#endTime2").val(end);
		"""),format.raw/*50.3*/("""}"""),format.raw/*50.4*/("""; */
		
		
		
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*57.2*/("""

"""),_display_(/*59.2*/main("Search and Generate Workflow", scripts)/*59.47*/ {_display_(Seq[Any](format.raw/*59.49*/("""
	
	   
    """),format.raw/*62.5*/("""<h1 style="margin-left:540px">Search</h1>

    	<div class="ui-widget col-sm-offset-3 col-sm-7">
       	<div class = "form-group">
       		"""),_display_(/*66.11*/inputText(serviceLogForm("User Id"), 'class -> "form-control", 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "CCS student 1", 'size->70)),format.raw/*66.166*/("""
	    """),format.raw/*67.6*/("""</div>
	    <div class = "form-group">
	    	"""),_display_(/*69.8*/inputText(serviceLogForm("Start Time"), 'class -> "form-control", 'id -> "startTime", '_label -> Messages("Start Time"), 'placeholder -> "mm/dd/yyyy hh:mm", 'size->70)),format.raw/*69.175*/("""
	    	"""),_display_(/*70.8*/inputText(serviceLogForm("End Time"), 'class -> "form-control", 'id -> "endTime", '_label -> Messages("End Time"), 'placeholder -> "mm/dd/yyyy hh:mm", 'size->70)),format.raw/*70.169*/("""
	    	"""),format.raw/*71.7*/("""<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    <button id="preview" type="button" class="btn btn-info"> Preview</button>	
	    <input class="btn" type="submit" value="Search" >
	    </div>
	    </div>
""")))}))}
  }

  def render(serviceLogForm:play.data.Form[ServiceExecutionLog]): play.twirl.api.HtmlFormat.Appendable = apply(serviceLogForm)

  def f:((play.data.Form[ServiceExecutionLog]) => play.twirl.api.HtmlFormat.Appendable) = (serviceLogForm) => apply(serviceLogForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/searchGenerateWorkflow.scala.html
                  HASH: 1ef2796f2397302f47d79ca9236090aef3cd0199
                  MATRIX: 769->1|908->75|922->82|1002->86|1030->88|1118->149|1146->150|1175->153|1235->186|1263->187|1293->191|1402->272|1431->273|1463->278|1713->500|1742->501|1775->507|1850->555|1878->556|1910->561|1974->597|2003->598|2036->604|2118->659|2146->660|2178->665|2238->697|2267->698|2300->704|2378->755|2406->756|2442->765|2470->766|2503->771|2532->772|2564->777|2722->907|2751->908|2781->911|2809->912|2860->935|2889->936|2920->940|3221->1214|3249->1215|3279->1218|3339->1250|3368->1251|3399->1255|3648->1477|3676->1478|3718->1493|3746->1494|3803->54|3831->73|3859->1512|3888->1515|3942->1560|3982->1562|4021->1574|4190->1716|4367->1871|4400->1877|4472->1923|4661->2090|4695->2098|4878->2259|4912->2266
                  LINES: 26->1|28->5|28->5|30->5|31->6|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|36->11|42->17|42->17|43->18|44->19|44->19|45->20|45->20|45->20|46->21|47->22|47->22|48->23|48->23|48->23|49->24|50->25|50->25|52->27|52->27|52->27|52->27|53->28|56->31|56->31|57->32|57->32|58->33|58->33|59->34|64->39|64->39|65->40|66->41|66->41|67->42|75->50|75->50|79->54|79->54|83->1|85->4|86->57|88->59|88->59|88->59|91->62|95->66|95->66|96->67|98->69|98->69|99->70|99->70|100->71
                  -- GENERATED --
              */
          