
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
object dataRecommend extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonData: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet"
    href='"""),_display_(/*5.12*/routes/*5.18*/.Assets.at("stylesheets/custom_recommend.css")),format.raw/*5.64*/("""'>

<link rel="stylesheet"
  href="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.css"
>
    
"""),_display_(/*11.2*/main("Service Logs")/*11.22*/{_display_(Seq[Any](format.raw/*11.23*/("""
  

  """),format.raw/*14.3*/("""<div id="jsonData" style="display: none;">"""),_display_(/*14.46*/jsonData),format.raw/*14.54*/("""</div>
  <div id="graphText">
    <div class="row">
      <div class="col-lg-9" id="testGraph">
      </div>
      <div class="col-lg-3" id="testText">
      </div>
    </div>
  </div>


  <script src="https://cdnjs.cloudflare.com/ajax/libs/vis/3.11.0/vis.min.js"></script>
  <script type="text/javascript">
      
      var jsonString = $('#jsonData').text();
      var data = JSON.parse(jsonString);
      var container = document.getElementById('testGraph');

      var options = """),format.raw/*32.21*/("""{"""),format.raw/*32.22*/("""
        """),format.raw/*33.9*/("""stabilize:false,
        edges: """),format.raw/*34.16*/("""{"""),format.raw/*34.17*/("""
          """),format.raw/*35.11*/("""color: """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
            """),format.raw/*36.13*/("""color: "gray",
            highlight: "gray",
          """),format.raw/*38.11*/("""}"""),format.raw/*38.12*/(""",
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""",
        nodes: """),format.raw/*40.16*/("""{"""),format.raw/*40.17*/("""
          """),format.raw/*41.11*/("""shape: 'dot',
          radiusMin: 10,
          radiusMax: 30,
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""",
        groups: """),format.raw/*45.17*/("""{"""),format.raw/*45.18*/("""
          """),format.raw/*46.11*/("""user: """),format.raw/*46.17*/("""{"""),format.raw/*46.18*/("""
            """),format.raw/*47.13*/("""color:"#F2545A",
            shape:"star",
          """),format.raw/*49.11*/("""}"""),format.raw/*49.12*/(""",
          feature: """),format.raw/*50.20*/("""{"""),format.raw/*50.21*/("""
            """),format.raw/*51.13*/("""shape:"triangle",
            color:"#EC8F93",
          """),format.raw/*53.11*/("""}"""),format.raw/*53.12*/(""",
          service: """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""
            """),format.raw/*55.13*/("""color:"#EF777C",
            shape:"dot",
          """),format.raw/*57.11*/("""}"""),format.raw/*57.12*/(""",
          data: """),format.raw/*58.17*/("""{"""),format.raw/*58.18*/("""
            """),format.raw/*59.13*/("""color:"#F46369",
            shape:"square",
          """),format.raw/*61.11*/("""}"""),format.raw/*61.12*/("""
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""",
        tooltip: """),format.raw/*63.18*/("""{"""),format.raw/*63.19*/("""
          """),format.raw/*64.11*/("""delay: 300,
          fontColor: "black",
          fontSize: 14,
          fontFace: "verdana",
          color: """),format.raw/*68.18*/("""{"""),format.raw/*68.19*/("""
            """),format.raw/*69.13*/("""border: "#666",
            background: "#FFFFC6"
          """),format.raw/*71.11*/("""}"""),format.raw/*71.12*/("""
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""",
      """),format.raw/*73.7*/("""}"""),format.raw/*73.8*/(""";

      var network = new vis.Network(container, data, options);
      
      network.on('select', function(properties) """),format.raw/*77.49*/("""{"""),format.raw/*77.50*/("""
        """),format.raw/*78.9*/("""var select_node = $.grep(data.nodes, function(e)"""),format.raw/*78.57*/("""{"""),format.raw/*78.58*/("""
          """),format.raw/*79.11*/("""return e["id"] == properties.nodes[0];
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""")[0];
        $("#testText").html(select_node["title"]);
      """),format.raw/*82.7*/("""}"""),format.raw/*82.8*/(""");

      //focus on serviceid 19
      //network.focusOnNode(19);
    
  </script>
  
  
    
""")))}))}
  }

  def render(jsonData:String): play.twirl.api.HtmlFormat.Appendable = apply(jsonData)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (jsonData) => apply(jsonData)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/dataRecommend.scala.html
                  HASH: 66ccf8ea82d1f9bb1154bbaa8fdfda366ce4f6c0
                  MATRIX: 731->1|852->19|879->37|906->38|966->72|980->78|1046->124|1178->230|1207->250|1246->251|1280->258|1350->301|1379->309|1890->792|1919->793|1955->802|2015->834|2044->835|2083->846|2118->853|2147->854|2188->867|2272->923|2301->924|2338->934|2367->935|2412->952|2441->953|2480->964|2579->1036|2608->1037|2654->1055|2683->1056|2722->1067|2756->1073|2785->1074|2826->1087|2907->1140|2936->1141|2985->1162|3014->1163|3055->1176|3140->1233|3169->1234|3218->1255|3247->1256|3288->1269|3368->1321|3397->1322|3443->1340|3472->1341|3513->1354|3596->1409|3625->1410|3661->1419|3690->1420|3737->1439|3766->1440|3805->1451|3947->1565|3976->1566|4017->1579|4105->1639|4134->1640|4170->1649|4199->1650|4234->1658|4262->1659|4411->1780|4440->1781|4476->1790|4552->1838|4581->1839|4620->1850|4694->1897|4723->1898|4813->1961|4841->1962
                  LINES: 26->1|29->1|30->3|31->4|32->5|32->5|32->5|38->11|38->11|38->11|41->14|41->14|41->14|59->32|59->32|60->33|61->34|61->34|62->35|62->35|62->35|63->36|65->38|65->38|66->39|66->39|67->40|67->40|68->41|71->44|71->44|72->45|72->45|73->46|73->46|73->46|74->47|76->49|76->49|77->50|77->50|78->51|80->53|80->53|81->54|81->54|82->55|84->57|84->57|85->58|85->58|86->59|88->61|88->61|89->62|89->62|90->63|90->63|91->64|95->68|95->68|96->69|98->71|98->71|99->72|99->72|100->73|100->73|104->77|104->77|105->78|105->78|105->78|106->79|107->80|107->80|109->82|109->82
                  -- GENERATED --
              */
          