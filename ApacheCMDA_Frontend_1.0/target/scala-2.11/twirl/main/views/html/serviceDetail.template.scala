
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
object serviceDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,List[ServiceConfigurationItem],ServiceExecutionLog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(servicePage: String, moreScript: String, confItems: List[ServiceConfigurationItem], serviceLog: ServiceExecutionLog):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
	
	window.onload = function() """),format.raw/*8.29*/("""{"""),format.raw/*8.30*/("""
		
		"""),format.raw/*10.3*/("""var value = "";
		var parameterPurpose = "";
		var parameterRule = "";
		
		var seperator = "  |  ";
		"""),_display_(/*15.4*/for(confItem <- confItems) yield /*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""
			"""),format.raw/*16.4*/("""var parameterName = "";
			var parameterType = "";
			var parameterValue = "";
			var parameterDefaultValue = "";
			parameterPurpose = """"),_display_(/*20.25*/confItem/*20.33*/.getParameterPurpose()),format.raw/*20.55*/("""";
			parameterRule = """"),_display_(/*21.22*/confItem/*21.30*/.getParameterRule()),format.raw/*21.49*/("""";
			value = """"),_display_(/*22.14*/confItem/*22.22*/.getValue()),format.raw/*22.33*/("""";
			parameterName = """"),_display_(/*23.22*/confItem/*23.30*/.getParameterName()),format.raw/*23.49*/("""";
			parameterType = parameterRule.split("*|")[1].split("|*")[1];
			parameterValue = parameterRule.split("*|")[2].split("|*")[1];
			parameterDefaultValue = parameterRule.split("*|")[3].split("|*")[1];
			
			var res = parameterPurpose.split(" ");
			var name = res[0];
			for (i = 1; i < res.length; i++) """),format.raw/*30.37*/("""{"""),format.raw/*30.38*/("""
				"""),format.raw/*31.5*/("""var temp = res[i].charAt(0).toUpperCase();
				temp += res[i].substring(1);
				name += temp;
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			"""),format.raw/*35.4*/("""name += "_detail";
			
			
			console.log(parameterName + seperator + name + seperator + value + seperator + parameterType + seperator + parameterValue + seperator + parameterDefaultValue);

			switch (parameterType) """),format.raw/*40.27*/("""{"""),format.raw/*40.28*/("""
				case "Input text":
					document.getElementById(name).value = value;		           
		            break;
		        case "Input area":
		        	document.getElementById(name).innerHTML = value;
		            break;
		        case "Multiple selects":
		        	var paraArr = parameterValue.split(",");
		        	var checkedPara = value.split(",");
		        	
		        	for (var i=0; i<paraArr.length; i++) """),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""
		        		"""),format.raw/*52.13*/("""$("#" + name + i).prop( "checked", false );
		        		for (var j=0; j<checkedPara.length; j++ ) """),format.raw/*53.55*/("""{"""),format.raw/*53.56*/("""
		        			"""),format.raw/*54.14*/("""if ($("#" + name + i).val() == checkedPara[j]) """),format.raw/*54.61*/("""{"""),format.raw/*54.62*/("""
		        				"""),format.raw/*55.15*/("""$("#" + name + i).prop( "checked", true );
		        			"""),format.raw/*56.14*/("""}"""),format.raw/*56.15*/("""
		        		"""),format.raw/*57.13*/("""}"""),format.raw/*57.14*/(""" 
		        	"""),format.raw/*58.12*/("""}"""),format.raw/*58.13*/("""
		        	"""),format.raw/*59.12*/("""//$( 'input' ).filter('[value="6"]').prop( "checked", false );
		            break;
		        case "Radio button":
		        	var paraArr = parameterValue.split(",");
		        	for (var i=0; i<paraArr.length; i++) """),format.raw/*63.49*/("""{"""),format.raw/*63.50*/("""
		        		"""),format.raw/*64.13*/("""if ($("#" + name + i).val() == value) """),format.raw/*64.51*/("""{"""),format.raw/*64.52*/("""
		        			"""),format.raw/*65.14*/("""$( "#" + name + i ).prop("checked", true);
		        			break;
		        		"""),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
		        	"""),format.raw/*68.12*/("""}"""),format.raw/*68.13*/("""
		            """),format.raw/*69.15*/("""break;
		        case "Dropdown list":
		        	//$( 'option:contains("'+value+'")').attr('selected','selected');
		        	var allOptions = document.getElementById(parameterName + "_trID").getElementsByTagName('option');
		        	for (var i =0; i<allOptions.length; i++) """),format.raw/*73.53*/("""{"""),format.raw/*73.54*/("""
		        		"""),format.raw/*74.13*/("""if(allOptions[i].value == value) """),format.raw/*74.46*/("""{"""),format.raw/*74.47*/("""
		        			"""),format.raw/*75.14*/("""allOptions[i].selected = true;
		        		"""),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""
		        	"""),format.raw/*77.12*/("""}"""),format.raw/*77.13*/(""" 
		            """),format.raw/*78.15*/("""break;
		        default:
		            
			"""),format.raw/*81.4*/("""}"""),format.raw/*81.5*/("""					
		""")))}),format.raw/*82.4*/("""
		"""),format.raw/*83.3*/("""//only for testing
		//document.getElementById('startTime').value = parameterType;
		
		document.getElementById("purpose_detail").innerHTML = """"),_display_(/*86.59*/serviceLog/*86.69*/.getPurpose()),format.raw/*86.82*/("""";
		document.getElementById("serviceImg").src = """"),_display_(/*87.49*/serviceLog/*87.59*/.getPlotUrl()),format.raw/*87.72*/("""";
		document.getElementById("comment").value = """"),_display_(/*88.48*/serviceLog/*88.58*/.getDataUrl()),format.raw/*88.71*/("""";
/*		
			var res = parameterPurpose.split(" ");
			var name = res[0];
			for (i = 1; i < res.length; i++) """),format.raw/*92.37*/("""{"""),format.raw/*92.38*/("""
				"""),format.raw/*93.5*/("""var temp = res[i].charAt(0).toUpperCase();
				temp += res[i].substring(1);
				name += temp;
			"""),format.raw/*96.4*/("""}"""),format.raw/*96.5*/("""
			"""),format.raw/*97.4*/("""console.log(name + value + parameterType + parameterValue + parameterDefaultValue);
			
			if (parameterType == "Input text" ) """),format.raw/*99.40*/("""{"""),format.raw/*99.41*/("""
				"""),format.raw/*100.5*/("""document.getElementById(name).value = value;
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
		
		
		"""),format.raw/*104.3*/("""document.getElementById("serviceImg").src = """"),_display_(/*104.49*/serviceLog/*104.59*/.getPlotUrl()),format.raw/*104.72*/("""";
		document.getElementById("comment").value = """"),_display_(/*105.48*/serviceLog/*105.58*/.getDataUrl()),format.raw/*105.71*/("""";
*/
	"""),format.raw/*107.2*/("""}"""),format.raw/*107.3*/("""
	"""),_display_(/*108.3*/Html(moreScript)),format.raw/*108.19*/("""
	"""),format.raw/*109.2*/("""</script>
""")))};
Seq[Any](format.raw/*1.119*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*110.2*/("""

"""),_display_(/*112.2*/main("Service Details", scripts)/*112.34*/ {_display_(Seq[Any](format.raw/*112.36*/("""
	"""),_display_(/*113.3*/Html(servicePage)),format.raw/*113.20*/("""
""")))}),format.raw/*114.2*/("""
"""))}
  }

  def render(servicePage:String,moreScript:String,confItems:List[ServiceConfigurationItem],serviceLog:ServiceExecutionLog): play.twirl.api.HtmlFormat.Appendable = apply(servicePage,moreScript,confItems,serviceLog)

  def f:((String,String,List[ServiceConfigurationItem],ServiceExecutionLog) => play.twirl.api.HtmlFormat.Appendable) = (servicePage,moreScript,confItems,serviceLog) => apply(servicePage,moreScript,confItems,serviceLog)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/serviceDetail.scala.html
                  HASH: d06c32a4831129a5301000e6479b9ec002901d44
                  MATRIX: 789->1|992->139|1006->146|1086->150|1114->152|1203->214|1231->215|1264->221|1394->325|1436->351|1476->353|1507->357|1672->495|1689->503|1732->525|1783->549|1800->557|1840->576|1883->592|1900->600|1932->611|1983->635|2000->643|2040->662|2376->970|2405->971|2437->976|2561->1073|2589->1074|2620->1078|2865->1295|2894->1296|3334->1708|3363->1709|3404->1722|3530->1820|3559->1821|3601->1835|3676->1882|3705->1883|3748->1898|3832->1954|3861->1955|3902->1968|3931->1969|3972->1982|4001->1983|4041->1995|4284->2210|4313->2211|4354->2224|4420->2262|4449->2263|4491->2277|4594->2352|4623->2353|4663->2365|4692->2366|4735->2381|5040->2658|5069->2659|5110->2672|5171->2705|5200->2706|5242->2720|5313->2763|5342->2764|5382->2776|5411->2777|5455->2793|5526->2837|5554->2838|5593->2847|5623->2850|5794->2994|5813->3004|5847->3017|5925->3068|5944->3078|5978->3091|6055->3141|6074->3151|6108->3164|6244->3272|6273->3273|6305->3278|6429->3375|6457->3376|6488->3380|6643->3507|6672->3508|6705->3513|6781->3561|6810->3562|6847->3571|6921->3617|6941->3627|6976->3640|7054->3690|7074->3700|7109->3713|7144->3720|7173->3721|7203->3724|7241->3740|7271->3742|7322->118|7350->137|7379->3753|7409->3756|7451->3788|7492->3790|7522->3793|7561->3810|7594->3812
                  LINES: 26->1|28->5|28->5|30->5|31->6|33->8|33->8|35->10|40->15|40->15|40->15|41->16|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|55->30|55->30|56->31|59->34|59->34|60->35|65->40|65->40|76->51|76->51|77->52|78->53|78->53|79->54|79->54|79->54|80->55|81->56|81->56|82->57|82->57|83->58|83->58|84->59|88->63|88->63|89->64|89->64|89->64|90->65|92->67|92->67|93->68|93->68|94->69|98->73|98->73|99->74|99->74|99->74|100->75|101->76|101->76|102->77|102->77|103->78|106->81|106->81|107->82|108->83|111->86|111->86|111->86|112->87|112->87|112->87|113->88|113->88|113->88|117->92|117->92|118->93|121->96|121->96|122->97|124->99|124->99|125->100|126->101|126->101|129->104|129->104|129->104|129->104|130->105|130->105|130->105|132->107|132->107|133->108|133->108|134->109|136->1|138->4|139->110|141->112|141->112|141->112|142->113|142->113|143->114
                  -- GENERATED --
              */
          