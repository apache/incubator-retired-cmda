
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object searchGenerateWorkflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ServiceLog],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/(serviceLogForm: play.data.Form[metadata.ServiceLog]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
  	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
		$( "#preview" ).click(function() """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""
			var target = document.getElementById("show");
			if(target.style.display=="none")"""),format.raw/*31.36*/("""{"""),format.raw/*31.37*/("""
				target.style.display="block";
				$( "#preview" ).text("Hide");
				var userId = $("#userId").val();
				var startTime = $("#startTime").val();
				var endTime = $("#endTime").val();
				
				if(userId!="" && userId!=null)"""),format.raw/*38.35*/("""{"""),format.raw/*38.36*/("""
					$("#content").append(" UserId = "+userId);	
				"""),format.raw/*40.5*/("""}"""),format.raw/*40.6*/("""
				if(startTime!="" && startTime!=null)"""),format.raw/*41.41*/("""{"""),format.raw/*41.42*/("""
					$("#content").append(" Start Time = "+startTime);	
				"""),format.raw/*43.5*/("""}"""),format.raw/*43.6*/("""
				if(endTime!="" && endTime!=null)"""),format.raw/*44.37*/("""{"""),format.raw/*44.38*/("""
					$("#content").append(" End Time = "+endTime);	
				"""),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""
				
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""else """),format.raw/*48.10*/("""{"""),format.raw/*48.11*/("""
				$("#content").val('');	
                target.style.display="none";
                $( "#preview" ).text("Preview");
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/("""
		"""),format.raw/*53.3*/("""}"""),format.raw/*53.4*/(""");
		if(jsonData!=null)"""),format.raw/*54.21*/("""{"""),format.raw/*54.22*/("""
			var jsonString = $('#jsonData').text();
	  	 	var obj = JSON.parse(jsonString);
	  	 	var data = "text/json;charset=utf-8," + encodeURIComponent(JSON.stringify(obj));
			
	  	 	$('<a href="data:' + data + '" download="data.json">download JSON</a>').appendTo('#download');
		"""),format.raw/*60.3*/("""}"""),format.raw/*60.4*/("""
		/* 
		$("#workflow-gen").click()"""),format.raw/*62.29*/("""{"""),format.raw/*62.30*/("""
			alert("0");
			var user = $("#userId").val();
			$("#user2").val(user);
			alert(user);
			var start = $("#startTime").val();
			$("#startTime2").val(start);
			var end = $("#endTime").val();
			$("#endTime2").val(end);
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""; */
		
		
		
	"""),format.raw/*75.2*/("""}"""),format.raw/*75.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*18.55*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*78.2*/("""

"""),_display_(Seq[Any](/*80.2*/main("Search and Generate Workflow", scripts)/*80.47*/ {_display_(Seq[Any](format.raw/*80.49*/("""
	
	"""),_display_(Seq[Any](/*82.3*/flash_message())),format.raw/*82.18*/("""   
    <h1 align="center">Search</h1>
    
    """),_display_(Seq[Any](/*85.6*/helper/*85.12*/.form(routes.AccountController.getSearchServiceLogForWorkflow())/*85.76*/ {_display_(Seq[Any](format.raw/*85.78*/("""
    	<div class="ui-widget">
       	<div class = "col-sm-offset-3 col-sm-10">
       		"""),_display_(Seq[Any](/*88.11*/inputText(serviceLogForm("User Id"), 'id -> "userId", '_label -> Messages("User Id"), 'placeholder -> "CCS student 1", 'size->70))),format.raw/*88.140*/("""
	    </div>
	    <div class = "col-sm-offset-3 col-sm-10">
	    	"""),_display_(Seq[Any](/*91.8*/inputText(serviceLogForm("Start Time"), 'id -> "startTime", '_label -> Messages("Start Time"), 'placeholder -> "mm/dd/yyyy hh:mm", 'size->70))),format.raw/*91.149*/("""
	    	"""),_display_(Seq[Any](/*92.8*/inputText(serviceLogForm("End Time"), 'id -> "endTime", '_label -> Messages("End Time"), 'placeholder -> "mm/dd/yyyy hh:mm", 'size->70))),format.raw/*92.143*/("""
	    	<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    <button id="preview" type="button" class="btn btn-info"> Preview</button>	
	    <input class="btn" type="submit" value="Search" >
	    </div>
	    </div>
	    """)))})),format.raw/*102.7*/("""
""")))})))}
    }
    
    def render(serviceLogForm:play.data.Form[metadata.ServiceLog]): play.api.templates.HtmlFormat.Appendable = apply(serviceLogForm)
    
    def f:((play.data.Form[metadata.ServiceLog]) => play.api.templates.HtmlFormat.Appendable) = (serviceLogForm) => apply(serviceLogForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:50 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/searchGenerateWorkflow.scala.html
                    HASH: 4a8c3270dab98331a7fac8e6c669434bafc772ad
                    MATRIX: 3223->1205|3370->1279|3385->1286|3470->1290|3522->1306|3537->1312|3599->1352|3923->1648|3952->1649|4016->1685|4045->1686|4158->1771|4187->1772|4442->1999|4471->2000|4552->2054|4580->2055|4649->2096|4678->2097|4766->2158|4794->2159|4859->2196|4888->2197|4972->2254|5000->2255|5036->2264|5064->2265|5097->2270|5126->2271|5289->2406|5318->2407|5348->2410|5376->2411|5427->2434|5456->2435|5761->2713|5789->2714|5852->2749|5881->2750|6134->2976|6162->2977|6204->2992|6232->2993|6290->1258|6319->1277|6347->3011|6385->3014|6439->3059|6479->3061|6519->3066|6556->3081|6640->3130|6655->3136|6728->3200|6768->3202|6894->3292|7046->3421|7148->3488|7312->3629|7355->3637|7513->3772|7879->4106
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|67->28|67->28|68->29|68->29|70->31|70->31|77->38|77->38|79->40|79->40|80->41|80->41|82->43|82->43|83->44|83->44|85->46|85->46|87->48|87->48|87->48|87->48|91->52|91->52|92->53|92->53|93->54|93->54|99->60|99->60|101->62|101->62|110->71|110->71|114->75|114->75|118->18|120->21|121->78|123->80|123->80|123->80|125->82|125->82|128->85|128->85|128->85|128->85|131->88|131->88|134->91|134->91|135->92|135->92|145->102
                    -- GENERATED --
                */
            