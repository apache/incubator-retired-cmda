
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
object recommend extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonData: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet"
	href='"""),_display_(/*5.9*/routes/*5.15*/.Assets.at("stylesheets/custom_recommend.css")),format.raw/*5.61*/("""'>

<link rel="stylesheet"
  href="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.css"
>
	
"""),_display_(/*11.2*/main("Service Logs")/*11.22*/{_display_(Seq[Any](format.raw/*11.23*/("""
	  

  """),format.raw/*14.3*/("""<div id="jsonData" style="display: none;">"""),_display_(/*14.46*/jsonData),format.raw/*14.54*/("""</div>
  <div id="graphText">
    <div class="row">
      <div class="col-lg-6" id="testGraph">
      </div>
      <div class="col-lg-6" id="testText">
      </div>
    </div>
  </div>


  <script src="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.js"></script>
  <script type="text/javascript">
  	  var jsonString = $('#jsonData').text();
  	 	var data = JSON.parse(jsonString);
      var container = document.getElementById('testGraph');
      var options = """),format.raw/*30.21*/("""{"""),format.raw/*30.22*/("""
        """),format.raw/*31.9*/("""stabilize:false,
        edges: """),format.raw/*32.16*/("""{"""),format.raw/*32.17*/("""
          """),format.raw/*33.11*/("""color: """),format.raw/*33.18*/("""{"""),format.raw/*33.19*/("""
            """),format.raw/*34.13*/("""color: "gray",
            highlight: "gray",
          """),format.raw/*36.11*/("""}"""),format.raw/*36.12*/(""",
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/(""",
        nodes: """),format.raw/*38.16*/("""{"""),format.raw/*38.17*/("""
          """),format.raw/*39.11*/("""shape: 'dot',
          radiusMin: 10,
          radiusMax: 30,
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""",
        groups: """),format.raw/*43.17*/("""{"""),format.raw/*43.18*/("""
          """),format.raw/*44.11*/("""user: """),format.raw/*44.17*/("""{"""),format.raw/*44.18*/("""
            """),format.raw/*45.13*/("""color:"#F2545A",
            shape:"star",
          """),format.raw/*47.11*/("""}"""),format.raw/*47.12*/(""",
          feature: """),format.raw/*48.20*/("""{"""),format.raw/*48.21*/("""
            """),format.raw/*49.13*/("""shape:"triangle",
            color:"#EC8F93",
          """),format.raw/*51.11*/("""}"""),format.raw/*51.12*/(""",
          service: """),format.raw/*52.20*/("""{"""),format.raw/*52.21*/("""
            """),format.raw/*53.13*/("""color:"#EF777C",
            shape:"dot",
          """),format.raw/*55.11*/("""}"""),format.raw/*55.12*/(""",
          /*data: """),format.raw/*56.19*/("""{"""),format.raw/*56.20*/("""
            """),format.raw/*57.13*/("""color:"#F46369",
            shape:"square",
          """),format.raw/*59.11*/("""}"""),format.raw/*59.12*/("""*/
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""",
        tooltip: """),format.raw/*61.18*/("""{"""),format.raw/*61.19*/("""
          """),format.raw/*62.11*/("""delay: 300,
          fontColor: "black",
          fontSize: 14, // px
          fontFace: "verdana",
          color: """),format.raw/*66.18*/("""{"""),format.raw/*66.19*/("""
            """),format.raw/*67.13*/("""border: "#666",
            background: "#FFFFC6"
          """),format.raw/*69.11*/("""}"""),format.raw/*69.12*/("""
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""
      """),format.raw/*71.7*/("""}"""),format.raw/*71.8*/(""";

      var network = new vis.Network(container, data, options);
      //focus on serviceid 19
      network.focusOnNode(19);
      network.on('select', function(properties) """),format.raw/*76.49*/("""{"""),format.raw/*76.50*/("""
        """),format.raw/*77.9*/("""var select_node = $.grep(data.nodes, function(e)"""),format.raw/*77.57*/("""{"""),format.raw/*77.58*/("""
          """),format.raw/*78.11*/("""return e["id"] == properties.nodes[0];
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""")[0];
        if(select_node["group"] == "service")"""),format.raw/*80.46*/("""{"""),format.raw/*80.47*/("""
          """),format.raw/*81.11*/("""var select_edges = $.grep(data.edges, function(e) """),format.raw/*81.61*/("""{"""),format.raw/*81.62*/(""" 
            """),format.raw/*82.13*/("""return e["from"] == select_node["id"] """),format.raw/*82.51*/("""}"""),format.raw/*82.52*/(""");
          var textVal = "";
          textVal += "<h3>"+select_node["label"]+"</h3>";
          textVal += "<div><h4>Keywords:</h4><h4>"
          for (var i = select_edges.length - 1; i >= 0; i--) """),format.raw/*86.62*/("""{"""),format.raw/*86.63*/("""
            """),format.raw/*87.13*/("""textVal += "<span class=\"label label-primary\">"+select_edges[i]["to"]+"</span>\n";
          """),format.raw/*88.11*/("""}"""),format.raw/*88.12*/(""";
          textVal += "</h4></div>";
          textVal += "<div><img src=\""+select_node["image"]+"\" class=\"img-responsive\"></div>";
          $("#testText").html(textVal);
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""
      """),format.raw/*93.7*/("""}"""),format.raw/*93.8*/(""");
  </script>
  
  
	
""")))}),format.raw/*98.2*/("""
"""))}
  }

  def render(jsonData:String): play.twirl.api.HtmlFormat.Appendable = apply(jsonData)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (jsonData) => apply(jsonData)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/recommend.scala.html
                  HASH: 9cd499c11d861449692fa4974f99d36f70c937c6
                  MATRIX: 727->1|848->19|875->37|902->38|958->69|972->75|1038->121|1167->224|1196->244|1235->245|1270->253|1340->296|1369->304|1870->777|1899->778|1935->787|1995->819|2024->820|2063->831|2098->838|2127->839|2168->852|2252->908|2281->909|2318->919|2347->920|2392->937|2421->938|2460->949|2559->1021|2588->1022|2634->1040|2663->1041|2702->1052|2736->1058|2765->1059|2806->1072|2887->1125|2916->1126|2965->1147|2994->1148|3035->1161|3120->1218|3149->1219|3198->1240|3227->1241|3268->1254|3348->1306|3377->1307|3425->1327|3454->1328|3495->1341|3578->1396|3607->1397|3645->1408|3674->1409|3721->1428|3750->1429|3789->1440|3937->1560|3966->1561|4007->1574|4095->1634|4124->1635|4160->1644|4189->1645|4223->1652|4251->1653|4454->1828|4483->1829|4519->1838|4595->1886|4624->1887|4663->1898|4737->1945|4766->1946|4845->1997|4874->1998|4913->2009|4991->2059|5020->2060|5062->2074|5128->2112|5157->2113|5386->2314|5415->2315|5456->2328|5579->2423|5608->2424|5820->2609|5849->2610|5883->2617|5911->2618|5965->2642
                  LINES: 26->1|29->1|30->3|31->4|32->5|32->5|32->5|38->11|38->11|38->11|41->14|41->14|41->14|57->30|57->30|58->31|59->32|59->32|60->33|60->33|60->33|61->34|63->36|63->36|64->37|64->37|65->38|65->38|66->39|69->42|69->42|70->43|70->43|71->44|71->44|71->44|72->45|74->47|74->47|75->48|75->48|76->49|78->51|78->51|79->52|79->52|80->53|82->55|82->55|83->56|83->56|84->57|86->59|86->59|87->60|87->60|88->61|88->61|89->62|93->66|93->66|94->67|96->69|96->69|97->70|97->70|98->71|98->71|103->76|103->76|104->77|104->77|104->77|105->78|106->79|106->79|107->80|107->80|108->81|108->81|108->81|109->82|109->82|109->82|113->86|113->86|114->87|115->88|115->88|119->92|119->92|120->93|120->93|125->98
                  -- GENERATED --
              */
          