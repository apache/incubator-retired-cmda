
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
object registerAClimateService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.ClimateService],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(climateServiceForm: play.data.Form[models.ClimateService]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""

"""),format.raw/*5.1*/("""<script type="text/javascript">	
	

	$(document).ready(function()"""),format.raw/*8.30*/("""{"""),format.raw/*8.31*/("""
		
	    
		"""),format.raw/*11.3*/("""$( "#preview" ).click(function() """),format.raw/*11.36*/("""{"""),format.raw/*11.37*/("""
			"""),format.raw/*12.4*/("""var target = document.getElementById("show");
			if(target.style.display=="none")"""),format.raw/*13.36*/("""{"""),format.raw/*13.37*/("""
				"""),format.raw/*14.5*/("""target.style.display="block";
				$( "#preview" ).text("Hide");
				var userName = $("#userName").val();
				var affiliation = $("#affiliation").val();
				var email = $("#email").val();
				var researchFields = $("#researchFields").val();

				if(userName!="")"""),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
					"""),format.raw/*22.6*/("""$("#content").append(" User Name = "+userName);	
				"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""
				"""),format.raw/*24.5*/("""if(affiliation!="" && affiliation!=null)"""),format.raw/*24.45*/("""{"""),format.raw/*24.46*/("""
					"""),format.raw/*25.6*/("""$("#content").append(" Affiliation = "+affiliation);	
				"""),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""
				"""),format.raw/*27.5*/("""if(email!="" && email!=null)"""),format.raw/*27.33*/("""{"""),format.raw/*27.34*/("""
					"""),format.raw/*28.6*/("""$("#content").append(" Email = "+email);	
				"""),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""
				"""),format.raw/*30.5*/("""if(researchFields!="" && researchFields!=null)"""),format.raw/*30.51*/("""{"""),format.raw/*30.52*/("""
					"""),format.raw/*31.6*/("""$("#content").append(" Research Area = "+researchFields);	
				"""),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""
				
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""else """),format.raw/*34.10*/("""{"""),format.raw/*34.11*/("""
				"""),format.raw/*35.5*/("""$("#content").val('');	
                target.style.display="none";
                $("#preview" ).text("Preview");
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/("""
		"""),format.raw/*39.3*/("""}"""),format.raw/*39.4*/(""");
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/(""");
		
	</script>
""")))};
Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*43.2*/(""" 
"""),_display_(/*44.2*/main("Register A New Climate Service")/*44.40*/ {_display_(Seq[Any](format.raw/*44.42*/("""
"""),format.raw/*45.1*/("""<script type="text/javascript">
console.log("register started");
$(window).load(function()"""),format.raw/*47.26*/("""{"""),format.raw/*47.27*/("""
    """),format.raw/*48.5*/("""var fixHelperModified = function(e, tr) """),format.raw/*48.45*/("""{"""),format.raw/*48.46*/("""
        """),format.raw/*49.9*/("""var $originals = tr.children();
        var $helper = tr.clone();
        $helper.children().each(function(index) """),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""
            """),format.raw/*52.13*/("""$(this).width($originals.eq(index).width())
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""");
        return $helper;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/(""",
        updateIndex = function(e, ui) """),format.raw/*56.39*/("""{"""),format.raw/*56.40*/("""
            """),format.raw/*57.13*/("""$('td.index', ui.item.parent()).each(function (i) """),format.raw/*57.63*/("""{"""),format.raw/*57.64*/("""
                """),format.raw/*58.17*/("""$(this).html(i + 1);
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/(""");
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""";

    $("#parameterPreview tbody").sortable("""),format.raw/*62.43*/("""{"""),format.raw/*62.44*/("""
        """),format.raw/*63.9*/("""helper: fixHelperModified,
        stop: updateIndex
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/(""").disableSelection();
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/(""");
</script>
<h2 class="text-center">Register a New Climate Service</h2>
<br>

<div class="container col-md-6">
    

    
    """),_display_(/*75.6*/form(routes.ClimateServiceController.addClimateService())/*75.63*/ {_display_(Seq[Any](format.raw/*75.65*/("""
    """),format.raw/*76.5*/("""<div class="well">
    	<h4>Step 1 : Add Climate Service Metadata</h3>
    	<br>
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="2-D-Variable-Map">
        </div>
        <div class="form-group">
            <label>Purpose</label>
            <input type="text" class="form-control" id="purpose" name="purpose" placeholder="climate service description">
        </div>
        <div class="form-group">
            <label>Web Service API</label>
            <input type="text" class="form-control" id="url" name="url" placeholder="cmac/web/twoDimMap">
        </div>
        <div class="form-group">
            <label>Scenario</label>
            <input type="text" class="form-control" id="scenario" name="scenario" placeholder="12">
        </div>
        <div class="form-group">
            <label>Version</label>
            <input type="text" class="form-control" id="version" name="version" placeholder="1">
        </div>
        <div class="form-group">
            <label>Root Service Id</label>
            <input type="text" class="form-control" id="rootServiceId" name="rootServiceId" placeholder="2">
        </div>
        <div class="form-group">
            <label>Homepage URL</label>
            <input type="text" class="form-control" id="homepage" placeholder="http://www.google.com">
        </div>
        <div class="form-group">
            <label>Developers</label>
            <input type="text" class="form-control" id="delevopers" placeholder="Tom Smith, Mary Brown">
        </div>        
        <div class="text-center">
        	<div class="form-group">            
            	<button type="reset" class="btn btn-success">Reset</button>
        	</div>
        </div>
     </div>   
        <div class="well">
            <h4>Step 2 : Configure Input Parameters</h4>
            <br>
            <form>
                <div class="form-group">
                    <label>Descriptive Parameter Name</label>
                    <input type="text" class="form-control" id="parameterNameDescriptive" placeholder="descriptive">
                </div>
                <div class="form-group">
                    <label>API Parameter Name</label>
                    <input type="text" class="form-control" id="parameterNameFunctional" placeholder="functional">
                </div>
                <div class="form-group">
                    <label>Parameter Type</label>
                    <select class="form-control" id="parameterType" onchange="Javascript:disableItem()">
                        <option value="Input text">Input text</option>
                        <option value="Input area">Input area</option>
                        <option value="Multiple selects">Multiple selects</option>
                        <option value="Radio button">Radio button</option>
                        <option value="Dropdown list">Dropdown list</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>Parameter Values</label>
                    <input type="text" class="form-control" id="parameterValues" placeholder="2" disabled>
                </div>
                <div class="form-group">
                    <label>Default Values</label>
                    <input type="text" class="form-control" id="defaultValues" placeholder="2">
                </div>
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="Javascript:addRow()">Add Input Parameter</button>
                    <button type="reset" class="btn btn-success">Reset</button>
                </div>
            </form>
        </div>        
        <div class="well">

            <h4>Step 3 : Rule Generator</h4>
            <br>
            
            <div id= "ruleAlert" class="alert alert-success">
                <strong>Successfully added!</strong>
            </div>
            <div class="well">
					<div class="form-group">
	                    <label>Dependence1</label>
	                    <input type="text" class="form-control" id="dependence1" placeholder="Enter dependence1 API Name" value="test">
	                </div>
	                <div class="form-group">
	                    <label>Dependence2</label>
	                    <input type="text" class="form-control" id="dependence2" placeholder="Enter dependence2 API Name" value="test1">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addDependency()">Add dependency</button>
	                    <button type="button" class="btn btn-success" onclick="">Reset dependency</button>
	                </div> 
             </div>
			<div class="well">					
	            <form>
	            	<div class="form-group">
	                    <label>Data source</label>
	                    <input type="text" class="form-control" id="dataSource" placeholder="Enter Data Source" value="GFDL/ESM2G">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addDataSource()">Add data source</button>
	                    <button type="button" class="btn btn-success" onclick="Javascript:resetDataSource()">Reset data source</button>
	                </div>
	                <div class="form-group">
	                    <label>Data group</label>
	                    <input type="text" class="form-control" id="dataGroup" placeholder="Enter Data Group" value="Default Group">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addGroup()">Add group</button>
	                </div>
	                <div class="form-group">
	                    <label>Enabled variable</label>
	                    <input type="text" class="form-control" id="variable" placeholder="Enter Variable" value="clt">
	                </div>
	                <div class="text-center">
	                    <button type="button" class="btn btn-primary" onclick="Javascript:addVariable()">Add variable</button>
	                    <button type="button" class="btn btn-success" onclick="Javascript:resetVariable()">Reset variable</button>
	                    <button type="button" class="btn btn-primary" onclick="Javascript:oneClickAdd()">One-click add</button>
	                </div>       
	            </form>
	            <br>
	
	            <div class="well">
	                <div class="text-center">
	                    <button type="button" class="btn  btn-primary" onclick="Javascript:continue1()">Add one rule</button>
	                    <button type="button" class="btn  btn-primary" onclick="Javascript:addDataList()">Add rule list</button>
						<button type="button" class="btn  btn-success" onclick="Javascript:deleteAllData()">Reset rule</button>	                
	                </div>
	            </div>
            </div>
            <div class="well">
                <label>Rule Preview</label>
                <textarea class="form-control" rows="10" id="preview" placeholder ="Placeholder for the json data"></textarea>
            
                <div class="input-group">
                    <input type="text" id="valid" class="form-control" placeholder="Valiadtion Result">
                    <span class="input-group-btn">
                    <button class="btn btn-primary" onclick="Javascript:validate()" type="button">Validate Json Format and Save</button>
                    </span>
                </div><!-- /input-group -->

            </div>

            <div class="well">
                <div class="form-group">
                    <label>Show Cache</label>
                    <input type="text" class="form-control" id="demo1" placeholder="Show Cache" >
                </div>
                <label>Para Preview</label>
                <textarea class="form-control" rows="10" id="previewPara" placeholder ="Placeholder for the Para data"></textarea>
            </div>
        </div>
        
        <div class="well">
        	<h4>Step 4 : Configure Output Parameters</h4>
        	<br>
        	<form>
                <div class="form-group">
                    <label>Button Name</label>
                    <input type="text" class="form-control" id="outputName" placeholder="Enter Output Name">
                </div>
                <div class="form-group">
                    <label>Output Button Key</label>
                    <input type="text" class="form-control" id="outputUrl" placeholder="Enter Output Button Url">
                </div>
                
                <div class="text-center">
                    <button type="button" class="btn btn-primary" onclick="Javascript:addButton()">Add Output Button</button>
                    <button type="reset" class="btn btn-success">Reset</button>
                </div>
            </form>
        </div>
        
        
        
        
    """)))}),format.raw/*258.6*/("""
"""),format.raw/*259.1*/("""</div>

<!-- Modal -->
<div class="modal fade" id="confirm" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Confirmation</h4>
            </div>
            <div class="modal-body">
                <p>Are you sure you want to add this climate service?</p>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary" data-dismiss="modal" onclick="Javascript:window.location.href='/climateService/add'">Submit</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>

<div class="container col-md-6">
    <h3>Input Part Preview</h3>

    <form>
        <table id="parameterPreview" class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="col-md-2">Parameter Name</th>
                <th class="col-md-3">Value</th>
                <th class="col-md-1">&nbsp;</th>
            </tr>
            </thead>
            <tbody id="tbody"></tbody>
        </table>
    </form>
    
    <h3> Output Part Preview</h3>
    <form>
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Output</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <a id="serviceImgLink" href="">
                        <img src="" id="serviceImg" class="img-responsive">
                        <h5>  Placeholder for the image</h5>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a id="commentLink" href="">
                        <textarea class="form-control" rows="3" id="comment" placeholder ="Placeholder for the link"></textarea>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <textarea class="form-control" rows="10" id="message" placeholder ="Placeholder for the message"></textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Download Data</button>
        </div>
        <br>
        <div class="text-center" id="output">
            
        </div>
    </form>
    
    <div class="text-center">
            <button type="button" class="btn btn-primary btn-lg" id="addAClimateService">Add a Climate Service</button>
    </div>
    
    
</div>
""")))}))}
  }

  def render(climateServiceForm:play.data.Form[models.ClimateService]): play.twirl.api.HtmlFormat.Appendable = apply(climateServiceForm)

  def f:((play.data.Form[models.ClimateService]) => play.twirl.api.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/registerAClimateService.scala.html
                  HASH: da606d17e9a87e6c022094605d0a66f9e2961cd7
                  MATRIX: 772->1|917->79|931->86|1011->90|1039->92|1131->157|1159->158|1198->170|1259->203|1288->204|1319->208|1428->289|1457->290|1489->295|1778->556|1807->557|1840->563|1920->616|1948->617|1980->622|2048->662|2077->663|2110->669|2195->727|2223->728|2255->733|2311->761|2340->762|2373->768|2446->814|2474->815|2506->820|2580->866|2609->867|2642->873|2732->936|2760->937|2796->946|2824->947|2857->952|2886->953|2918->958|3075->1087|3104->1088|3134->1091|3162->1092|3193->1096|3221->1097|3278->60|3306->1115|3335->1118|3382->1156|3422->1158|3450->1159|3568->1249|3597->1250|3629->1255|3697->1295|3726->1296|3762->1305|3904->1419|3933->1420|3974->1433|4053->1485|4082->1486|4140->1517|4168->1518|4236->1558|4265->1559|4306->1572|4384->1622|4413->1623|4458->1640|4519->1673|4548->1674|4586->1685|4615->1686|4688->1731|4717->1732|4753->1741|4837->1798|4865->1799|4914->1821|4942->1822|5096->1950|5162->2007|5202->2009|5234->2014|14439->11188|14468->11189
                  LINES: 26->1|28->3|28->3|30->3|32->5|35->8|35->8|38->11|38->11|38->11|39->12|40->13|40->13|41->14|48->21|48->21|49->22|50->23|50->23|51->24|51->24|51->24|52->25|53->26|53->26|54->27|54->27|54->27|55->28|56->29|56->29|57->30|57->30|57->30|58->31|59->32|59->32|61->34|61->34|61->34|61->34|62->35|65->38|65->38|66->39|66->39|67->40|67->40|71->1|72->43|73->44|73->44|73->44|74->45|76->47|76->47|77->48|77->48|77->48|78->49|80->51|80->51|81->52|82->53|82->53|84->55|84->55|85->56|85->56|86->57|86->57|86->57|87->58|88->59|88->59|89->60|89->60|91->62|91->62|92->63|94->65|94->65|95->66|95->66|104->75|104->75|104->75|105->76|287->258|288->259
                  -- GENERATED --
              */
          