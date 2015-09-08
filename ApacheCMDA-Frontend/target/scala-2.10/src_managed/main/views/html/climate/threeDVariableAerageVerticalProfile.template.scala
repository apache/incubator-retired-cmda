
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
object threeDVariableAerageVerticalProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ThreeDVarAvgVertical4Profile,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ThreeDVarAvgVertical4Profile):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/livefilter.js"))),format.raw/*23.60*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*25.8*/routes/*25.14*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*25.59*/("""'></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js"></script>
	<script type="
	text/javascript" src='"""),_display_(Seq[Any](/*28.25*/routes/*28.31*/.Assets.at("javascripts/json2.js"))),format.raw/*28.65*/("""'></script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*29.38*/routes/*29.44*/.Assets.at("javascripts/xmisc.js"))),format.raw/*29.78*/(""""></script>
<script type="text/javascript">
	var Response = null;
    var variable = "";
    window.onload = function() """),format.raw/*33.32*/("""{"""),format.raw/*33.33*/("""
      select_all_months();
      getDataSource();
      select_data();
      getVariableName();
      select_var();
      $('#t0').val("""),_display_(Seq[Any](/*39.21*/parameters/*39.31*/.getStartYearMonth())),format.raw/*39.51*/(""");
      $('#t1').val("""),_display_(Seq[Any](/*40.21*/parameters/*40.31*/.getEndYearMonth())),format.raw/*40.49*/(""");
      var selectMonths = $('#selectMonths').text();
      $('#months option:contains('+selectMonths+')').prop("""),format.raw/*42.59*/("""{"""),format.raw/*42.60*/("""selected: true"""),format.raw/*42.74*/("""}"""),format.raw/*42.75*/(""");
      select_months();
      select_monthsByPara();
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      var pressureLvlScale = $('#pressureLevelScale').text();
      if(pressureLvlScale == "0") """),format.raw/*50.35*/("""{"""),format.raw/*50.36*/("""
        $('#radioLin').prop( "checked", true );
        $('#radioLog').prop( "checked", false );
      """),format.raw/*53.7*/("""}"""),format.raw/*53.8*/("""
      else """),format.raw/*54.12*/("""{"""),format.raw/*54.13*/("""
        $('#radioLin').prop( "checked", false );
        $('#radioLog').prop( "checked", true );
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/("""
      var variableScale = $('#variableScale').text();
      if(variableScale == "0") """),format.raw/*59.32*/("""{"""),format.raw/*59.33*/("""
        $('#radioLin2').prop("checked", true);
        $('#radioLog2').prop("checked", false);
      """),format.raw/*62.7*/("""}"""),format.raw/*62.8*/("""
      else """),format.raw/*63.12*/("""{"""),format.raw/*63.13*/("""
        $('#radioLin2').prop("checked", false);
        $('#radioLog2').prop("checked", true);
      """),format.raw/*66.7*/("""}"""),format.raw/*66.8*/("""
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    function getDataSource()
    """),format.raw/*73.5*/("""{"""),format.raw/*73.6*/("""
      var dataSource = $('#dataSource').text();
      var x = document.getElementById("data");
      if(dataSource == "NASA_AIRS") """),format.raw/*76.37*/("""{"""),format.raw/*76.38*/("""
        x.options[0].selected = true;
      """),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
      else if(dataSource == "NASA_MLS") """),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
        x.options[1].selected = true;
      """),format.raw/*81.7*/("""}"""),format.raw/*81.8*/("""
      else if(dataSource == "ARGO_ARGO") """),format.raw/*82.42*/("""{"""),format.raw/*82.43*/("""
        x.options[2].selected = true;
      """),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""
      else if(dataSource == "CCCMA_CANESM2") """),format.raw/*85.46*/("""{"""),format.raw/*85.47*/("""
        x.options[3].selected = true;
      """),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""
      else if(dataSource == "GFDL_ESM2G") """),format.raw/*88.43*/("""{"""),format.raw/*88.44*/("""
        x.options[4].selected = true;
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""
      else if(dataSource == "GISS_E2-H") """),format.raw/*91.42*/("""{"""),format.raw/*91.43*/("""
        x.options[5].selected = true;
      """),format.raw/*93.7*/("""}"""),format.raw/*93.8*/("""
      else if(dataSource == "GISS_E2-R") """),format.raw/*94.42*/("""{"""),format.raw/*94.43*/("""
        x.options[6].selected = true;
      """),format.raw/*96.7*/("""}"""),format.raw/*96.8*/("""
      else if(dataSource == "NCAR_CAM5") """),format.raw/*97.42*/("""{"""),format.raw/*97.43*/("""
        x.options[7].selected = true;
      """),format.raw/*99.7*/("""}"""),format.raw/*99.8*/("""
      else if(dataSource == "NCC_NORESM") """),format.raw/*100.43*/("""{"""),format.raw/*100.44*/("""
        x.options[8].selected = true;
      """),format.raw/*102.7*/("""}"""),format.raw/*102.8*/("""
      else if(dataSource == "UKMO_HadGEM2-ES") """),format.raw/*103.48*/("""{"""),format.raw/*103.49*/("""
        x.options[9].selected = true;
      """),format.raw/*105.7*/("""}"""),format.raw/*105.8*/("""
      else if(dataSource == "CCCMA_CANAM4") """),format.raw/*106.45*/("""{"""),format.raw/*106.46*/("""
        x.options[10].selected = true;
      """),format.raw/*108.7*/("""}"""),format.raw/*108.8*/("""
      else if(dataSource == "CSIRO_MK3.6") """),format.raw/*109.44*/("""{"""),format.raw/*109.45*/("""
        x.options[11].selected = true;
      """),format.raw/*111.7*/("""}"""),format.raw/*111.8*/("""
      else if(dataSource == "GFDL_CM3") """),format.raw/*112.41*/("""{"""),format.raw/*112.42*/("""
        x.options[12].selected = true;
      """),format.raw/*114.7*/("""}"""),format.raw/*114.8*/("""
      else if(dataSource == "IPSL_CM5A-LR") """),format.raw/*115.45*/("""{"""),format.raw/*115.46*/("""
        x.options[13].selected = true;
      """),format.raw/*117.7*/("""}"""),format.raw/*117.8*/("""
      else if(dataSource == "MIROC_MIROC5") """),format.raw/*118.45*/("""{"""),format.raw/*118.46*/("""
        x.options[14].selected = true;
      """),format.raw/*120.7*/("""}"""),format.raw/*120.8*/("""
      else if(dataSource == "UKMO_HadGEM2-A") """),format.raw/*121.47*/("""{"""),format.raw/*121.48*/("""
        x.options[15].selected = true;
      """),format.raw/*123.7*/("""}"""),format.raw/*123.8*/("""
      else if(dataSource == "ECMWF_interim") """),format.raw/*124.46*/("""{"""),format.raw/*124.47*/("""
        x.options[16].selected = true;
      """),format.raw/*126.7*/("""}"""),format.raw/*126.8*/("""
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/("""
    function getVariableName()
    """),format.raw/*129.5*/("""{"""),format.raw/*129.6*/("""
      var var_string = $('#variableName').text();
      var x=document.getElementById("var");
      if(var_string == "ta") """),format.raw/*132.30*/("""{"""),format.raw/*132.31*/("""
        x.options[0].selected = true;
      """),format.raw/*134.7*/("""}"""),format.raw/*134.8*/("""
      else if(var_string == "hus") """),format.raw/*135.36*/("""{"""),format.raw/*135.37*/("""
        x.options[1].selected = true;
      """),format.raw/*137.7*/("""}"""),format.raw/*137.8*/("""
      else if(var_string == "cli") """),format.raw/*138.36*/("""{"""),format.raw/*138.37*/("""
        x.options[2].selected = true;
      """),format.raw/*140.7*/("""}"""),format.raw/*140.8*/("""
      else if(var_string == "clw") """),format.raw/*141.36*/("""{"""),format.raw/*141.37*/("""
        x.options[3].selected = true;
      """),format.raw/*143.7*/("""}"""),format.raw/*143.8*/("""
      else if(var_string == "ot") """),format.raw/*144.35*/("""{"""),format.raw/*144.36*/("""
        x.options[4].selected = true;
      """),format.raw/*146.7*/("""}"""),format.raw/*146.8*/("""
      else if(var_string == "os") """),format.raw/*147.35*/("""{"""),format.raw/*147.36*/("""
        x.options[5].selected = true;
      """),format.raw/*149.7*/("""}"""),format.raw/*149.8*/("""
      else if(var_string == "wap") """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/("""
        x.options[6].selected = true;
      """),format.raw/*152.7*/("""}"""),format.raw/*152.8*/("""
      else if(var_string == "hur") """),format.raw/*153.36*/("""{"""),format.raw/*153.37*/("""
        x.options[7].selected = true;
      """),format.raw/*155.7*/("""}"""),format.raw/*155.8*/("""
    """),format.raw/*156.5*/("""}"""),format.raw/*156.6*/("""
    function select_monthsByPara()"""),format.raw/*157.35*/("""{"""),format.raw/*157.36*/("""
      var monthsByPara = $('#monthsPara').text();
      if(monthsByPara.search("jan")>-1)"""),format.raw/*159.40*/("""{"""),format.raw/*159.41*/("""
        document.getElementById('Jan').checked = true;
      """),format.raw/*161.7*/("""}"""),format.raw/*161.8*/("""
      if(monthsByPara.search("feb")>-1)"""),format.raw/*162.40*/("""{"""),format.raw/*162.41*/("""
        document.getElementById('Feb').checked = true;
      """),format.raw/*164.7*/("""}"""),format.raw/*164.8*/("""
      if(monthsByPara.search("mar")>-1)"""),format.raw/*165.40*/("""{"""),format.raw/*165.41*/("""
        document.getElementById('Mar').checked = true;
      """),format.raw/*167.7*/("""}"""),format.raw/*167.8*/("""
      if(monthsByPara.search("apr")>-1)"""),format.raw/*168.40*/("""{"""),format.raw/*168.41*/("""
        document.getElementById('Apr').checked = true;
      """),format.raw/*170.7*/("""}"""),format.raw/*170.8*/("""
      if(monthsByPara.search("may")>-1)"""),format.raw/*171.40*/("""{"""),format.raw/*171.41*/("""
        document.getElementById('May').checked = true;
      """),format.raw/*173.7*/("""}"""),format.raw/*173.8*/("""
      if(monthsByPara.search("jun")>-1)"""),format.raw/*174.40*/("""{"""),format.raw/*174.41*/("""
        document.getElementById('Jun').checked = true;
      """),format.raw/*176.7*/("""}"""),format.raw/*176.8*/("""
      if(monthsByPara.search("jul")>-1)"""),format.raw/*177.40*/("""{"""),format.raw/*177.41*/("""
        document.getElementById('Jul').checked = true;
      """),format.raw/*179.7*/("""}"""),format.raw/*179.8*/("""
      if(monthsByPara.search("aug")>-1)"""),format.raw/*180.40*/("""{"""),format.raw/*180.41*/("""
        document.getElementById('Aug').checked = true;
      """),format.raw/*182.7*/("""}"""),format.raw/*182.8*/("""
      if(monthsByPara.search("sep")>-1)"""),format.raw/*183.40*/("""{"""),format.raw/*183.41*/("""
        document.getElementById('Sep').checked = true;
      """),format.raw/*185.7*/("""}"""),format.raw/*185.8*/("""
      if(monthsByPara.search("oct")>-1)"""),format.raw/*186.40*/("""{"""),format.raw/*186.41*/("""
        document.getElementById('Oct').checked = true;
      """),format.raw/*188.7*/("""}"""),format.raw/*188.8*/("""
      if(monthsByPara.search("nov")>-1)"""),format.raw/*189.40*/("""{"""),format.raw/*189.41*/("""
        document.getElementById('Nov').checked = true;
      """),format.raw/*191.7*/("""}"""),format.raw/*191.8*/("""
      if(monthsByPara.search("dec")>-1)"""),format.raw/*192.40*/("""{"""),format.raw/*192.41*/("""
        document.getElementById('Dec').checked = true;
      """),format.raw/*194.7*/("""}"""),format.raw/*194.8*/("""
    """),format.raw/*195.5*/("""}"""),format.raw/*195.6*/("""
    function disable_download_button()
    """),format.raw/*197.5*/("""{"""),format.raw/*197.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*200.5*/("""}"""),format.raw/*200.6*/("""
    function enable_download_button()
    """),format.raw/*202.5*/("""{"""),format.raw/*202.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*205.5*/("""}"""),format.raw/*205.6*/("""
    function select_all_months()
    """),format.raw/*207.5*/("""{"""),format.raw/*207.6*/("""
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
        document.getElementById('Dec').checked = true;
    """),format.raw/*220.5*/("""}"""),format.raw/*220.6*/("""
    function no_month_check()
    """),format.raw/*222.5*/("""{"""),format.raw/*222.6*/("""
        if (document.getElementById('Jan').checked == false &&
           document.getElementById('Feb').checked == false &&
           document.getElementById('Mar').checked == false &&
           document.getElementById('Apr').checked == false &&
           document.getElementById('May').checked == false &&
           document.getElementById('Jun').checked == false &&
           document.getElementById('Jul').checked == false &&
           document.getElementById('Aug').checked == false &&
           document.getElementById('Sep').checked == false &&
           document.getElementById('Oct').checked == false &&
           document.getElementById('Nov').checked == false &&
           document.getElementById('Dec').checked == false) """),format.raw/*234.61*/("""{"""),format.raw/*234.62*/("""
           return true;
          """),format.raw/*236.11*/("""}"""),format.raw/*236.12*/("""
        else
           return false;
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/("""
    function reset_months()
    """),format.raw/*241.5*/("""{"""),format.raw/*241.6*/("""
        document.getElementById('Jan').checked = false;
        document.getElementById('Feb').checked = false;
        document.getElementById('Mar').checked = false;
        document.getElementById('Apr').checked = false;
        document.getElementById('May').checked = false;
        document.getElementById('Jun').checked = false;
        document.getElementById('Jul').checked = false;
        document.getElementById('Aug').checked = false;
        document.getElementById('Sep').checked = false;
        document.getElementById('Oct').checked = false;
        document.getElementById('Nov').checked = false;
        document.getElementById('Dec').checked = false;
    """),format.raw/*254.5*/("""}"""),format.raw/*254.6*/("""
    function reset_vars()
    """),format.raw/*256.5*/("""{"""),format.raw/*256.6*/("""
      var x=document.getElementById("var");
      x.options[0].disabled=false;
      x.options[1].disabled=false;
      x.options[2].disabled=false;
      x.options[3].disabled=false;
      x.options[4].disabled=false;
      x.options[5].disabled=false;
      x.options[6].disabled=false;
      x.options[7].disabled=false;
    """),format.raw/*266.5*/("""}"""),format.raw/*266.6*/("""
    function select_var()
    """),format.raw/*268.5*/("""{"""),format.raw/*268.6*/("""
      var var_string = $("#var").val();
      disable_download_button();
      if (var_string == "Air Temperature")
        variable = "ta";
      else if (var_string == "Specific Humidity")
        variable = "hus";
      else if (var_string == "Cloud Ice Water Content")
        variable = "cli";
      else if (var_string == "Cloud Liquid Water Content")
        variable = "clw";
      else if (var_string == "Ocean Temperature")
        variable = "ot";
      else if (var_string == "Ocean Salinity")
        variable = "os";
      else if (var_string == "Vertical Wind Velocity")  
        variable = "wap";  
      else if (var_string == "Relative Humidity")  
        variable = "hur";  
    """),format.raw/*287.5*/("""}"""),format.raw/*287.6*/("""
    function select_data()
    """),format.raw/*289.5*/("""{"""),format.raw/*289.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      disable_download_button();
      reset_vars();
      if (data_string == "NASA/AIRS") """),format.raw/*294.39*/("""{"""),format.raw/*294.40*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*302.7*/("""}"""),format.raw/*302.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*303.43*/("""{"""),format.raw/*303.44*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*311.7*/("""}"""),format.raw/*311.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*312.44*/("""{"""),format.raw/*312.45*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].selected=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*320.7*/("""}"""),format.raw/*320.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*321.48*/("""{"""),format.raw/*321.49*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].selected=true;
      """),format.raw/*329.7*/("""}"""),format.raw/*329.8*/("""
      else """),format.raw/*330.12*/("""{"""),format.raw/*330.13*/("""
        x.options[0].selected=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
      """),format.raw/*334.7*/("""}"""),format.raw/*334.8*/("""
      select_var();
    """),format.raw/*336.5*/("""}"""),format.raw/*336.6*/("""
    function select_months()
    """),format.raw/*338.5*/("""{"""),format.raw/*338.6*/("""
      var s1=document.getElementById("months");
      disable_download_button();
      if (s1.selectedIndex == 1) """),format.raw/*341.34*/("""{"""),format.raw/*341.35*/("""
        reset_months();
      """),format.raw/*343.7*/("""}"""),format.raw/*343.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*344.34*/("""{"""),format.raw/*344.35*/("""
        select_all_months();
      """),format.raw/*346.7*/("""}"""),format.raw/*346.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*347.34*/("""{"""),format.raw/*347.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*352.7*/("""}"""),format.raw/*352.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*353.34*/("""{"""),format.raw/*353.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*358.7*/("""}"""),format.raw/*358.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*359.34*/("""{"""),format.raw/*359.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*364.7*/("""}"""),format.raw/*364.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*365.34*/("""{"""),format.raw/*365.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*370.7*/("""}"""),format.raw/*370.8*/("""
    """),format.raw/*371.5*/("""}"""),format.raw/*371.6*/("""
    $(document).ready(function()"""),format.raw/*372.33*/("""{"""),format.raw/*372.34*/("""
      $("#download_data").click(function(event) """),format.raw/*373.49*/("""{"""),format.raw/*373.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*376.7*/("""}"""),format.raw/*376.8*/(""");
      $("#threedvertical").click(function(event) """),format.raw/*377.50*/("""{"""),format.raw/*377.51*/("""
	Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*380.31*/("""{"""),format.raw/*380.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*384.9*/("""}"""),format.raw/*384.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/threeDimVerticalProfile?";
        var d1 = $("#data").val();
        var model1 = d1.replace("/", "_");
        var arglist = "";
        arglist = arglist.concat("model=");
        arglist = arglist.concat(model1);
        var v1 = $("#var").val();
        arglist = arglist.concat("&var=");
        arglist = arglist.concat(variable);
        var t0 = $("#t0").val();
        var t1 = $("#t1").val();
        t0 = t0.replace("-", "");
        t1 = t1.replace("-", "");
        arglist = arglist.concat("&start_time=");
        arglist = arglist.concat(t0);
        arglist = arglist.concat("&end_time=");
        arglist = arglist.concat(t1);
        var lon0 = $("#lon0").val();
        var lon1 = $("#lon1").val();
        var lat0 = $("#lat0").val();
        var lat1 = $("#lat1").val();
        arglist = arglist.concat("&lon1=");
        arglist = arglist.concat(lon0);
        arglist = arglist.concat("&lon2=");
        arglist = arglist.concat(lon1);
        arglist = arglist.concat("&lat1=");
        arglist = arglist.concat(lat0);
        arglist = arglist.concat("&lat2=");
        arglist = arglist.concat(lat1);
        var s1 = document.getElementById('months');
        var month_str = "";
        var mm = document.getElementById('Jan');
        if (mm.checked == true)
          month_str = month_str.concat(",1");
        var mm = document.getElementById('Feb');
        if (mm.checked == true)
          month_str = month_str.concat(",2");
        var mm = document.getElementById('Mar');
        if (mm.checked == true)
          month_str = month_str.concat(",3");
        var mm = document.getElementById('Apr');
        if (mm.checked == true)
          month_str = month_str.concat(",4");
        var mm = document.getElementById('May');
        if (mm.checked == true)
          month_str = month_str.concat(",5");
        var mm = document.getElementById('Jun');
        if (mm.checked == true)
          month_str = month_str.concat(",6");
        var mm = document.getElementById('Jul');
        if (mm.checked == true)
          month_str = month_str.concat(",7");
        var mm = document.getElementById('Aug');
        if (mm.checked == true)
          month_str = month_str.concat(",8");
        var mm = document.getElementById('Sep');
        if (mm.checked == true)
          month_str = month_str.concat(",9");
        var mm = document.getElementById('Oct');
        if (mm.checked == true)
          month_str = month_str.concat(",10");
        var mm = document.getElementById('Nov');
        if (mm.checked == true)
          month_str = month_str.concat(",11");
        var mm = document.getElementById('Dec');
        if (mm.checked == true)
          month_str = month_str.concat(",12");
        month_str = month_str.substr(1);
        arglist = arglist.concat("&months=");
        arglist = arglist.concat(month_str);
        arglist = arglist.concat("&scale=");
        var y = document.getElementById("radioLin").checked;
        var yval;
        var x = document.getElementById("radioLin2").checked;
        var xval;
        if (y == true)
          yval = 0;
        else
          yval = 2;
        if (x == true)
          xval = 0;
        else
          xval = 1;
        var scale1 =  yval + xval;
        var scale1_str =  scale1.toString();
        arglist = arglist.concat(scale1_str);
        var purpose = $("#purpose").val();
        arglist = arglist.concat("&purpose=");
        arglist = arglist.concat(purpose);
        url = url + encodeURI(arglist);
        var urlTimeBounds = "http://" + window.location.hostname + ":9002/svc/time_bounds?";
        var arglistTB = "";
        arglistTB = arglistTB.concat("serviceType=");
        arglistTB = arglistTB.concat("1");
        arglistTB = arglistTB.concat("&source=");
        arglistTB = arglistTB.concat(d1);
        arglistTB = arglistTB.concat("&var=");
        arglistTB = arglistTB.concat(variable);
        urlTimeBounds = urlTimeBounds + encodeURI(arglistTB);
        $.ajax("""),format.raw/*487.16*/("""{"""),format.raw/*487.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*492.54*/("""{"""),format.raw/*492.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*494.44*/("""{"""),format.raw/*494.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*501.17*/("""}"""),format.raw/*501.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*509.50*/("""{"""),format.raw/*509.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*512.17*/("""}"""),format.raw/*512.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*514.51*/("""{"""),format.raw/*514.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*517.17*/("""}"""),format.raw/*517.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*518.52*/("""{"""),format.raw/*518.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*521.17*/("""}"""),format.raw/*521.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*522.52*/("""{"""),format.raw/*522.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*525.17*/("""}"""),format.raw/*525.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*526.52*/("""{"""),format.raw/*526.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*529.17*/("""}"""),format.raw/*529.18*/("""
            """),format.raw/*530.13*/("""}"""),format.raw/*530.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*531.59*/("""{"""),format.raw/*531.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*534.13*/("""}"""),format.raw/*534.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*535.49*/("""{"""),format.raw/*535.50*/("""
            """),format.raw/*536.13*/("""}"""),format.raw/*536.14*/("""
        """),format.raw/*537.9*/("""}"""),format.raw/*537.10*/(""");
        $.ajax("""),format.raw/*538.16*/("""{"""),format.raw/*538.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*543.54*/("""{"""),format.raw/*543.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*545.44*/("""{"""),format.raw/*545.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*552.17*/("""}"""),format.raw/*552.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='680'/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*559.13*/("""}"""),format.raw/*559.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*560.59*/("""{"""),format.raw/*560.60*/("""
		$("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*563.13*/("""}"""),format.raw/*563.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*564.49*/("""{"""),format.raw/*564.50*/("""
            """),format.raw/*565.13*/("""}"""),format.raw/*565.14*/("""
        """),format.raw/*566.9*/("""}"""),format.raw/*566.10*/(""");
      """),format.raw/*567.7*/("""}"""),format.raw/*567.8*/(""");
    """),format.raw/*568.5*/("""}"""),format.raw/*568.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.53*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*570.2*/(""" """),_display_(Seq[Any](/*570.4*/main("Parameters of ConfId", scripts)/*570.41*/{_display_(Seq[Any](format.raw/*570.42*/(""" """),_display_(Seq[Any](/*570.44*/flash_message())),format.raw/*570.59*/("""
<p>
<div id="dataSource" style="display: none">"""),_display_(Seq[Any](/*572.45*/parameters/*572.55*/.getDataSource())),format.raw/*572.71*/("""</div>
<div id="variableName" style="display: none">"""),_display_(Seq[Any](/*573.47*/parameters/*573.57*/.getVariableName())),format.raw/*573.75*/("""</div>
<div id="startYearMonth" style="display: none">"""),_display_(Seq[Any](/*574.49*/parameters/*574.59*/.getStartYearMonth())),format.raw/*574.79*/("""</div>
<div id="endYearMonth" style="display: none">"""),_display_(Seq[Any](/*575.47*/parameters/*575.57*/.getEndYearMonth())),format.raw/*575.75*/("""</div>
<div id="selectMonths" style="display: none">"""),_display_(Seq[Any](/*576.47*/parameters/*576.57*/.getSelectMonths())),format.raw/*576.75*/("""</div>
<div id="monthsPara" style="display: none">"""),_display_(Seq[Any](/*577.45*/parameters/*577.55*/.getMonth())),format.raw/*577.66*/("""</div>
<div id="startLat" style="display: none">"""),_display_(Seq[Any](/*578.43*/parameters/*578.53*/.getStartLat())),format.raw/*578.67*/("""</div>
<div id="endLat" style="display: none">"""),_display_(Seq[Any](/*579.41*/parameters/*579.51*/.getEndLat())),format.raw/*579.63*/("""</div>
<div id="startLon" style="display: none">"""),_display_(Seq[Any](/*580.43*/parameters/*580.53*/.getStartLon())),format.raw/*580.67*/("""</div>
<div id="endLon" style="display: none">"""),_display_(Seq[Any](/*581.41*/parameters/*581.51*/.getEndLon())),format.raw/*581.63*/("""</div>
<div id="pressureLevelScale" style="display: none">"""),_display_(Seq[Any](/*582.53*/parameters/*582.63*/.getPressureLevelScale())),format.raw/*582.87*/("""</div>
<div id="variableScale" style="display: none">"""),_display_(Seq[Any](/*583.48*/parameters/*583.58*/.getVariableScale())),format.raw/*583.77*/("""</div>
<div id="executionPurpose" style="display: none">"""),_display_(Seq[Any](/*584.51*/parameters/*584.61*/.getExecutionPurpose())),format.raw/*584.83*/("""</div>
<div id="image" style="display: none">"""),_display_(Seq[Any](/*585.40*/parameters/*585.50*/.getImage())),format.raw/*585.61*/("""</div>
<div id="dataURL" style="display: none">"""),_display_(Seq[Any](/*586.42*/parameters/*586.52*/.getDataURL())),format.raw/*586.65*/("""</div>
<div id="serviceResponseText" style="display: none">"""),_display_(Seq[Any](/*587.54*/parameters/*587.64*/.getServiceResponseText())),format.raw/*587.89*/("""</div>
<table border="1" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: 3-D Variable Average Vertical Profile</b> <br>
				<br> This service generates the average of a three-dimensional
				variable over a specified region and time and display the average as
				a function of pressure level as an X-Y plot. <br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td>data source:</td>
		<td><select name="data" , id="data" onchange="select_data()">
				<optgroup label="Observation">
					<option>NASA/AIRS</option>
					<option>NASA/MLS</option>
					<option>ARGO/ARGO</option>
				</optgroup>
				<optgroup label="Model: Historical">
					<option>CCCMA/CANESM2</option>
					<option>GFDL/ESM2G</option>
					<option>GISS/E2-H</option>
					<option>GISS/E2-R</option>
					<option>NCAR/CAM5</option>
					<option>NCC/NORESM</option>
					<option>UKMO/HadGEM2-ES</option>
				</optgroup>
				<optgroup label="Model: AMIP">
					<option>CCCMA/CANAM4</option>
					<option>CSIRO/MK3.6</option>
					<option>GFDL/CM3</option>
					<option>IPSL/CM5A-LR</option>
					<option>MIROC/MIROC5</option>
					<option>UKMO/HadGEM2-A</option>
				</optgroup>
				<optgroup label="Reanalysis">
					<option>ECMWF/interim</option>
				</optgroup>
		</select></td>
		<td>variable name:</td>
		<td><select name="var" , id="var" onchange="select_var()">
				<option>Air Temperature</option>
				<option>Specific Humidity</option>
				<option>Cloud Ice Water Content</option>
				<option>Cloud Liquid Water Content</option>
				<option>Ocean Temperature</option>
				<option>Ocean Salinity</option>
				<option>Vertical Wind Velocity</option>
				<option>Relative Humidity</option>
		</select></td>
	</tr>
	<tr>
		<td>start year-month:</td>
		<td><input id="t0" value="2004-01" alt="start" /></td>
		<td>end year-month:</td>
		<td><input id="t1" value="2004-12" alt="end" /></td>
	</tr>
	<tr>
		<td>select months:</td>
		<td><select name="months" id="months" onchange="select_months()">
				<option id="all">select all</option>
				<option id="none" selected="selected">select none</option>
				<option id="summer">Summer:Jun-Jul-Aug</option>
				<option id="autum">Autumn:Sep-Oct-Nov</option>
				<option id="winter">Winter:Dec-Jan-Feb</option>
				<option id="spring">Spring:Mar-Apr-May</option>
		</select></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td><label><input type="checkbox" name="option1" id="Jan"
				value="Jan" /> Jan<br></label> <label><input type="checkbox"
				name="option1" id="Feb" value="Feb" /> Feb<br></label> <label><input
				type="checkbox" name="option1" id="Mar" value="Mar" /> Mar<br></label>
		</td>
		<td><label><input type="checkbox" name="option1" id="Apr"
				value="Apr" /> Apr<br></label> <label><input type="checkbox"
				name="option1" id="May" value="May" /> May<br></label> <label><input
				type="checkbox" name="option1" id="Jun" value="Jun" /> Jun<br></label>
		</td>
		<td><label><input type="checkbox" name="option1" id="Jul"
				value="Jul" /> Jul<br></label> <label><input type="checkbox"
				name="option1" id="Aug" value="Aug" /> Aug<br></label> <label><input
				type="checkbox" name="option1" id="Sep" value="Sep" /> Sep<br></label>
		</td>
		<td><label><input type="checkbox" name="option1" id="Oct"
				value="Oct" /> Oct<br></label> <label><input type="checkbox"
				name="option1" id="Nov" value="Nov" /> Nov<br></label> <label><input
				type="checkbox" name="option1" id="Dec" value="Dec" /> Dec<br></label>
		</td>
	</tr>
	<tr>
		<td>start lat (deg):</td>
		<td><input id="lat0" value="-90" /></td>
		<td>end lat (deg):</td>
		<td><input id="lat1" value="90" /></td>
	</tr>
	<tr>
		<td>start lon (deg):</td>
		<td><input id="lon0" value="0" /></td>
		<td>end lon (deg):</td>
		<td><input id="lon1" value="360" /></td>
	</tr>
	<tr>
		<td colspan="1">pressure level scale:</td>
		<td colspan="1"><form>
				<input type="radio" name="scale1" value="linear" id="radioLin">linear
				<input type="radio" name="scale1" value="logarithmic" id="radioLog">logarithmic
			</form></td>
		<td colspan="1">variable scale:</td>
		<td colspan="1">
			<form>
				<input type="radio" name="scale2" value="linear" id="radioLin2">linear
				<input type="radio" name="scale2" value="logarithmic" id="radioLog2">logarithmic
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="1">Execution purpose</td>
		<td colspan="3">
			<form>
				<textarea name="purpose" id="purpose" rows="4" cols="50"> </textarea>
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input id="threedvertical"
			type="submit" value="            Run  Again            "
			style="height: 28px" /></td>
		<form>
			<td colspan="2" align="center"><input id="download_data"
				type="button" value="Download Data" style="height: 28px" /></td>
		</form>
	</tr>
	<tr>
		<td colspan="4">
			<div id="Image">Image Here</div>
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea readonly id="data_url"
				cols="89" rows="2">Data URL Here</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea readonly id="Response"
				cols="89" rows="6">Service Response Text Here</textarea></td>
	</tr>
	</p>
</table>
""")))})),format.raw/*740.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ThreeDVarAvgVertical4Profile): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ThreeDVarAvgVertical4Profile) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/threeDVariableAerageVerticalProfile.scala.html
                    HASH: cef951eede66abf4271c555a25a80ed49e8eddc9
                    MATRIX: 3238->1205|3383->1355|3398->1362|3483->1366|3534->1381|3549->1387|3611->1427|3673->1453|3688->1459|3749->1498|3834->1548|3849->1554|3916->1599|4120->1767|4135->1773|4191->1807|4276->1856|4291->1862|4347->1896|4495->2016|4524->2017|4697->2154|4716->2164|4758->2184|4817->2207|4836->2217|4876->2235|5017->2348|5046->2349|5088->2363|5117->2364|5472->2691|5501->2692|5632->2796|5660->2797|5700->2809|5729->2810|5860->2914|5888->2915|6002->3001|6031->3002|6160->3104|6188->3105|6228->3117|6257->3118|6386->3220|6414->3221|6657->3437|6685->3438|6746->3472|6774->3473|6934->3605|6963->3606|7035->3651|7063->3652|7132->3693|7161->3694|7233->3739|7261->3740|7331->3782|7360->3783|7432->3828|7460->3829|7534->3875|7563->3876|7635->3921|7663->3922|7734->3965|7763->3966|7835->4011|7863->4012|7933->4054|7962->4055|8034->4100|8062->4101|8132->4143|8161->4144|8233->4189|8261->4190|8331->4232|8360->4233|8432->4278|8460->4279|8532->4322|8562->4323|8635->4368|8664->4369|8741->4417|8771->4418|8844->4463|8873->4464|8947->4509|8977->4510|9051->4556|9080->4557|9153->4601|9183->4602|9257->4648|9286->4649|9356->4690|9386->4691|9460->4737|9489->4738|9563->4783|9593->4784|9667->4830|9696->4831|9770->4876|9800->4877|9874->4923|9903->4924|9979->4971|10009->4972|10083->5018|10112->5019|10187->5065|10217->5066|10291->5112|10320->5113|10353->5118|10382->5119|10446->5155|10475->5156|10628->5280|10658->5281|10731->5326|10760->5327|10825->5363|10855->5364|10928->5409|10957->5410|11022->5446|11052->5447|11125->5492|11154->5493|11219->5529|11249->5530|11322->5575|11351->5576|11415->5611|11445->5612|11518->5657|11547->5658|11611->5693|11641->5694|11714->5739|11743->5740|11808->5776|11838->5777|11911->5822|11940->5823|12005->5859|12035->5860|12108->5905|12137->5906|12170->5911|12199->5912|12263->5947|12293->5948|12412->6038|12442->6039|12532->6101|12561->6102|12630->6142|12660->6143|12750->6205|12779->6206|12848->6246|12878->6247|12968->6309|12997->6310|13066->6350|13096->6351|13186->6413|13215->6414|13284->6454|13314->6455|13404->6517|13433->6518|13502->6558|13532->6559|13622->6621|13651->6622|13720->6662|13750->6663|13840->6725|13869->6726|13938->6766|13968->6767|14058->6829|14087->6830|14156->6870|14186->6871|14276->6933|14305->6934|14374->6974|14404->6975|14494->7037|14523->7038|14592->7078|14622->7079|14712->7141|14741->7142|14810->7182|14840->7183|14930->7245|14959->7246|14992->7251|15021->7252|15093->7296|15122->7297|15233->7380|15262->7381|15333->7424|15362->7425|15473->7508|15502->7509|15568->7547|15597->7548|16290->8213|16319->8214|16382->8249|16411->8250|17184->8994|17214->8995|17278->9030|17308->9031|17379->9074|17408->9075|17469->9108|17498->9109|18203->9786|18232->9787|18291->9818|18320->9819|18677->10148|18706->10149|18765->10180|18794->10181|19523->10882|19552->10883|19612->10915|19641->10916|19848->11094|19878->11095|20165->11354|20194->11355|20266->11398|20296->11399|20583->11658|20612->11659|20685->11703|20715->11704|21002->11963|21031->11964|21108->12012|21138->12013|21425->12272|21454->12273|21495->12285|21525->12286|21668->12401|21697->12402|21750->12427|21779->12428|21841->12462|21870->12463|22014->12578|22044->12579|22103->12610|22132->12611|22195->12645|22225->12646|22289->12682|22318->12683|22381->12717|22411->12718|22635->12914|22664->12915|22727->12949|22757->12950|22981->13146|23010->13147|23073->13181|23103->13182|23327->13378|23356->13379|23419->13413|23449->13414|23673->13610|23702->13611|23735->13616|23764->13617|23826->13650|23856->13651|23934->13700|23964->13701|24078->13787|24107->13788|24188->13840|24218->13841|24331->13925|24361->13926|24525->14062|24555->14063|28785->18264|28815->18265|29009->18430|29039->18431|29145->18508|29175->18509|29503->18808|29533->18809|29936->19183|29966->19184|30130->19319|30160->19320|30292->19423|30322->19424|30516->19589|30546->19590|30627->19642|30657->19643|30893->19850|30923->19851|31004->19903|31034->19904|31270->20111|31300->20112|31381->20164|31411->20165|31711->20436|31741->20437|31783->20450|31813->20451|31902->20511|31932->20512|32040->20591|32070->20592|32149->20642|32179->20643|32221->20656|32251->20657|32288->20666|32318->20667|32365->20685|32395->20686|32579->20841|32609->20842|32715->20919|32745->20920|33073->21219|33103->21220|33449->21537|33479->21538|33568->21598|33598->21599|33720->21692|33750->21693|33829->21743|33859->21744|33901->21757|33931->21758|33968->21767|33998->21768|34035->21777|34064->21778|34099->21785|34128->21786|34184->1256|34212->1274|34278->1305|34293->1311|34355->1351|34386->21802|34424->21804|34471->21841|34511->21842|34550->21844|34588->21859|34674->21908|34694->21918|34733->21934|34823->21987|34843->21997|34884->22015|34976->22070|34996->22080|35039->22100|35129->22153|35149->22163|35190->22181|35280->22234|35300->22244|35341->22262|35429->22313|35449->22323|35483->22334|35569->22383|35589->22393|35626->22407|35710->22454|35730->22464|35765->22476|35851->22525|35871->22535|35908->22549|35992->22596|36012->22606|36047->22618|36143->22677|36163->22687|36210->22711|36301->22765|36321->22775|36363->22794|36457->22851|36477->22861|36522->22883|36605->22929|36625->22939|36659->22950|36744->22998|36764->23008|36800->23021|36897->23081|36917->23091|36965->23116|42143->28262
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|69->29|69->29|69->29|73->33|73->33|79->39|79->39|79->39|80->40|80->40|80->40|82->42|82->42|82->42|82->42|90->50|90->50|93->53|93->53|94->54|94->54|97->57|97->57|99->59|99->59|102->62|102->62|103->63|103->63|106->66|106->66|111->71|111->71|113->73|113->73|116->76|116->76|118->78|118->78|119->79|119->79|121->81|121->81|122->82|122->82|124->84|124->84|125->85|125->85|127->87|127->87|128->88|128->88|130->90|130->90|131->91|131->91|133->93|133->93|134->94|134->94|136->96|136->96|137->97|137->97|139->99|139->99|140->100|140->100|142->102|142->102|143->103|143->103|145->105|145->105|146->106|146->106|148->108|148->108|149->109|149->109|151->111|151->111|152->112|152->112|154->114|154->114|155->115|155->115|157->117|157->117|158->118|158->118|160->120|160->120|161->121|161->121|163->123|163->123|164->124|164->124|166->126|166->126|167->127|167->127|169->129|169->129|172->132|172->132|174->134|174->134|175->135|175->135|177->137|177->137|178->138|178->138|180->140|180->140|181->141|181->141|183->143|183->143|184->144|184->144|186->146|186->146|187->147|187->147|189->149|189->149|190->150|190->150|192->152|192->152|193->153|193->153|195->155|195->155|196->156|196->156|197->157|197->157|199->159|199->159|201->161|201->161|202->162|202->162|204->164|204->164|205->165|205->165|207->167|207->167|208->168|208->168|210->170|210->170|211->171|211->171|213->173|213->173|214->174|214->174|216->176|216->176|217->177|217->177|219->179|219->179|220->180|220->180|222->182|222->182|223->183|223->183|225->185|225->185|226->186|226->186|228->188|228->188|229->189|229->189|231->191|231->191|232->192|232->192|234->194|234->194|235->195|235->195|237->197|237->197|240->200|240->200|242->202|242->202|245->205|245->205|247->207|247->207|260->220|260->220|262->222|262->222|274->234|274->234|276->236|276->236|279->239|279->239|281->241|281->241|294->254|294->254|296->256|296->256|306->266|306->266|308->268|308->268|327->287|327->287|329->289|329->289|334->294|334->294|342->302|342->302|343->303|343->303|351->311|351->311|352->312|352->312|360->320|360->320|361->321|361->321|369->329|369->329|370->330|370->330|374->334|374->334|376->336|376->336|378->338|378->338|381->341|381->341|383->343|383->343|384->344|384->344|386->346|386->346|387->347|387->347|392->352|392->352|393->353|393->353|398->358|398->358|399->359|399->359|404->364|404->364|405->365|405->365|410->370|410->370|411->371|411->371|412->372|412->372|413->373|413->373|416->376|416->376|417->377|417->377|420->380|420->380|424->384|424->384|527->487|527->487|532->492|532->492|534->494|534->494|541->501|541->501|549->509|549->509|552->512|552->512|554->514|554->514|557->517|557->517|558->518|558->518|561->521|561->521|562->522|562->522|565->525|565->525|566->526|566->526|569->529|569->529|570->530|570->530|571->531|571->531|574->534|574->534|575->535|575->535|576->536|576->536|577->537|577->537|578->538|578->538|583->543|583->543|585->545|585->545|592->552|592->552|599->559|599->559|600->560|600->560|603->563|603->563|604->564|604->564|605->565|605->565|606->566|606->566|607->567|607->567|608->568|608->568|611->18|611->19|612->20|612->20|612->20|613->570|613->570|613->570|613->570|613->570|613->570|615->572|615->572|615->572|616->573|616->573|616->573|617->574|617->574|617->574|618->575|618->575|618->575|619->576|619->576|619->576|620->577|620->577|620->577|621->578|621->578|621->578|622->579|622->579|622->579|623->580|623->580|623->580|624->581|624->581|624->581|625->582|625->582|625->582|626->583|626->583|626->583|627->584|627->584|627->584|628->585|628->585|628->585|629->586|629->586|629->586|630->587|630->587|630->587|783->740
                    -- GENERATED --
                */
            