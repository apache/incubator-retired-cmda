
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
object threeDVariableZonalMean extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ThreeDVarZonalMean,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ThreeDVarZonalMean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/livefilter.js"))),format.raw/*23.60*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*25.8*/routes/*25.14*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*25.59*/("""'></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js"></script>
<script type="
	text/javascript"
	src='"""),_display_(Seq[Any](/*30.8*/routes/*30.14*/.Assets.at("javascripts/json2.js"))),format.raw/*30.48*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*32.8*/routes/*32.14*/.Assets.at("javascripts/xmisc.js"))),format.raw/*32.48*/("""'></script>
<script type="text/javascript">
	var Response = null;
    var variable = "";
    window.onload = function() """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
      changeMonths();
      changeDataSource();
      select_data();
      changeVariableName();
      select_var();
      enable_download_button();
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      $('#pres').val($('#pressureRange').text());
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
      var pressureLvlScale = $('#pressureLevelScale').text();
      if(pressureLvlScale == "0") """),format.raw/*54.35*/("""{"""),format.raw/*54.36*/("""
        $('#radioLin').prop( "checked", true );
        $('#radioLog').prop( "checked", false );
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/("""
      else """),format.raw/*58.12*/("""{"""),format.raw/*58.13*/("""
        $('#radioLin').prop( "checked", false );
        $('#radioLog').prop( "checked", true );
      """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
      var colorScale = $('#colorScale').text();
      if(colorScale == "0") """),format.raw/*63.29*/("""{"""),format.raw/*63.30*/("""
        $('#radioLin2').prop("checked", true);
        $('#radioLog2').prop("checked", false);
      """),format.raw/*66.7*/("""}"""),format.raw/*66.8*/("""
      else """),format.raw/*67.12*/("""{"""),format.raw/*67.13*/("""
        $('#radioLin2').prop("checked", false);
        $('#radioLog2').prop("checked", true);
      """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/("""
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    function disable_download_button()
    """),format.raw/*73.5*/("""{"""),format.raw/*73.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=true;
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/("""
    function enable_download_button()
    """),format.raw/*78.5*/("""{"""),format.raw/*78.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
    function changeMonths()"""),format.raw/*82.28*/("""{"""),format.raw/*82.29*/("""
      var months = $("#monthsPara").text();
      var temp = months.split(", ");
      for(i = 0;i < temp.length;i ++)"""),format.raw/*85.38*/("""{"""),format.raw/*85.39*/("""
        if(temp[i] == 'jan')"""),format.raw/*86.29*/("""{"""),format.raw/*86.30*/("""
          document.getElementById('Jan').checked = true;
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""else if(temp[i] == 'feb')"""),format.raw/*88.35*/("""{"""),format.raw/*88.36*/("""
          document.getElementById('Feb').checked = true;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""else if(temp[i] == 'mar')"""),format.raw/*90.35*/("""{"""),format.raw/*90.36*/("""
          document.getElementById('Mar').checked = true;
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""else if(temp[i] == 'apr')"""),format.raw/*92.35*/("""{"""),format.raw/*92.36*/("""
          document.getElementById('Apr').checked = true;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""else if(temp[i] == 'may')"""),format.raw/*94.35*/("""{"""),format.raw/*94.36*/("""
          document.getElementById('May').checked = true;
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""else if(temp[i] == 'jun')"""),format.raw/*96.35*/("""{"""),format.raw/*96.36*/("""
          document.getElementById('Jun').checked = true;
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""else if(temp[i] == 'jul')"""),format.raw/*98.35*/("""{"""),format.raw/*98.36*/("""
          document.getElementById('Jul').checked = true;
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/("""else if(temp[i] == 'aug')"""),format.raw/*100.35*/("""{"""),format.raw/*100.36*/("""
          document.getElementById('Aug').checked = true;
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""else if(temp[i] == 'sep')"""),format.raw/*102.35*/("""{"""),format.raw/*102.36*/("""
          document.getElementById('Sep').checked = true;
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/("""else if(temp[i] == 'oct')"""),format.raw/*104.35*/("""{"""),format.raw/*104.36*/("""
          document.getElementById('Oct').checked = true;
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/("""else if(temp[i] == 'nov')"""),format.raw/*106.35*/("""{"""),format.raw/*106.36*/("""
          document.getElementById('Nov').checked = true;
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/("""else if(temp[i] == 'dec')"""),format.raw/*108.35*/("""{"""),format.raw/*108.36*/("""
          document.getElementById('Dec').checked = true;
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""
      """),format.raw/*111.7*/("""}"""),format.raw/*111.8*/("""
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/("""
    function select_all_months()
    """),format.raw/*114.5*/("""{"""),format.raw/*114.6*/("""
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
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/("""
    function no_month_check()
    """),format.raw/*129.5*/("""{"""),format.raw/*129.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*141.61*/("""{"""),format.raw/*141.62*/("""
           return true;
          """),format.raw/*143.11*/("""}"""),format.raw/*143.12*/("""
        else
           return false;
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/("""
    function reset_months()
    """),format.raw/*148.5*/("""{"""),format.raw/*148.6*/("""
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
    """),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
    function reset_vars()
    """),format.raw/*163.5*/("""{"""),format.raw/*163.6*/("""
      var x=document.getElementById("var");
      x.options[0].disabled=false;
      x.options[1].disabled=false;
      x.options[2].disabled=false;
      x.options[3].disabled=false;
      x.options[4].disabled=false;
      x.options[5].disabled=false;
      x.options[6].disabled=false;
      x.options[7].disabled=false;
    """),format.raw/*173.5*/("""}"""),format.raw/*173.6*/("""
    function select_var()
    """),format.raw/*175.5*/("""{"""),format.raw/*175.6*/("""
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
    """),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
    function select_data()
    """),format.raw/*196.5*/("""{"""),format.raw/*196.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      disable_download_button();
      reset_vars();
      if (data_string == "NASA/AIRS") """),format.raw/*201.39*/("""{"""),format.raw/*201.40*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*209.7*/("""}"""),format.raw/*209.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*210.43*/("""{"""),format.raw/*210.44*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*218.7*/("""}"""),format.raw/*218.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*219.44*/("""{"""),format.raw/*219.45*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].selected=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*227.7*/("""}"""),format.raw/*227.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*228.48*/("""{"""),format.raw/*228.49*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].selected=true;
      """),format.raw/*236.7*/("""}"""),format.raw/*236.8*/("""
      else """),format.raw/*237.12*/("""{"""),format.raw/*237.13*/("""
        x.options[0].selected=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
      """),format.raw/*241.7*/("""}"""),format.raw/*241.8*/("""
      select_var();
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    function changeDataSource()"""),format.raw/*244.32*/("""{"""),format.raw/*244.33*/("""
      var dataSource = $('#dataSource').text();
      var x = document.getElementById("data");
      if(dataSource == "NASA_AIRS" )"""),format.raw/*247.37*/("""{"""),format.raw/*247.38*/("""
        x.options[0].selected=true;
      """),format.raw/*249.7*/("""}"""),format.raw/*249.8*/("""
      else if(dataSource == "NASA_MLS" )"""),format.raw/*250.41*/("""{"""),format.raw/*250.42*/("""
        x.options[1].selected=true;
      """),format.raw/*252.7*/("""}"""),format.raw/*252.8*/("""
      else if(dataSource == "ARGO_ARGO" )"""),format.raw/*253.42*/("""{"""),format.raw/*253.43*/("""
        x.options[2].selected=true;
      """),format.raw/*255.7*/("""}"""),format.raw/*255.8*/("""
      else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*256.46*/("""{"""),format.raw/*256.47*/("""
        x.options[3].selected=true;
      """),format.raw/*258.7*/("""}"""),format.raw/*258.8*/("""
      else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*259.43*/("""{"""),format.raw/*259.44*/("""
        x.options[4].selected=true;
      """),format.raw/*261.7*/("""}"""),format.raw/*261.8*/("""
      else if(dataSource == "GISS_E2-H" )"""),format.raw/*262.42*/("""{"""),format.raw/*262.43*/("""
        x.options[5].selected=true;
      """),format.raw/*264.7*/("""}"""),format.raw/*264.8*/("""
      else if(dataSource == "GISS_E2-R" )"""),format.raw/*265.42*/("""{"""),format.raw/*265.43*/("""
        x.options[6].selected=true;
      """),format.raw/*267.7*/("""}"""),format.raw/*267.8*/("""
      else if(dataSource == "NCAR_CAM5" )"""),format.raw/*268.42*/("""{"""),format.raw/*268.43*/("""
        x.options[7].selected=true;
      """),format.raw/*270.7*/("""}"""),format.raw/*270.8*/("""
      else if(dataSource == "NCC_NORESM" )"""),format.raw/*271.43*/("""{"""),format.raw/*271.44*/("""
        x.options[8].selected=true;
      """),format.raw/*273.7*/("""}"""),format.raw/*273.8*/("""
      else if(dataSource == "UKMO_HadGEM2-ES-A" )"""),format.raw/*274.50*/("""{"""),format.raw/*274.51*/("""
        x.options[9].selected=true;
      """),format.raw/*276.7*/("""}"""),format.raw/*276.8*/("""
      else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*277.45*/("""{"""),format.raw/*277.46*/("""
        x.options[10].selected=true;
      """),format.raw/*279.7*/("""}"""),format.raw/*279.8*/("""
      else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*280.44*/("""{"""),format.raw/*280.45*/("""
        x.options[11].selected=true;
      """),format.raw/*282.7*/("""}"""),format.raw/*282.8*/("""
      else if(dataSource == "GFDL_CM3" )"""),format.raw/*283.41*/("""{"""),format.raw/*283.42*/("""
        x.options[12].selected=true;
      """),format.raw/*285.7*/("""}"""),format.raw/*285.8*/("""
      else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*286.45*/("""{"""),format.raw/*286.46*/("""
        x.options[13].selected=true;
      """),format.raw/*288.7*/("""}"""),format.raw/*288.8*/("""
      else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*289.45*/("""{"""),format.raw/*289.46*/("""
        x.options[14].selected=true;
      """),format.raw/*291.7*/("""}"""),format.raw/*291.8*/("""
      else if(dataSource == "UKMO_HadGEM2-A" )"""),format.raw/*292.47*/("""{"""),format.raw/*292.48*/("""
        x.options[15].selected=true;
      """),format.raw/*294.7*/("""}"""),format.raw/*294.8*/("""
      else if(dataSource == "ECMWF_interim" )"""),format.raw/*295.46*/("""{"""),format.raw/*295.47*/("""
        x.options[16].selected=true;
      """),format.raw/*297.7*/("""}"""),format.raw/*297.8*/("""
    """),format.raw/*298.5*/("""}"""),format.raw/*298.6*/("""
    function changeVariableName()"""),format.raw/*299.34*/("""{"""),format.raw/*299.35*/("""
      var var_string = $('#variableName').text();
      var x = document.getElementById("var");
      if (var_string == "ta")
        x.options[0].selected=true;
        else if (var_string == "hus")
          x.options[1].selected=true;
        else if (var_string == "cli")"""),format.raw/*306.38*/("""{"""),format.raw/*306.39*/("""
          x.options[2].selected=true;
        """),format.raw/*308.9*/("""}"""),format.raw/*308.10*/("""else if (var_string == "clw")
          x.options[3].selected=true;
        else if (var_string == "ot")
          x.options[4].selected=true;
        else if (var_string == "os")
          x.options[5].selected=true;
        else if (var_string == "wap")
          x.options[6].selected=true;
        else if (var_string == "hur")
          x.options[7].selected=true;
    """),format.raw/*318.5*/("""}"""),format.raw/*318.6*/("""
    function select_months()
    """),format.raw/*320.5*/("""{"""),format.raw/*320.6*/("""
      var s1=document.getElementById("months");
      disable_download_button();
      if (s1.selectedIndex == 1) """),format.raw/*323.34*/("""{"""),format.raw/*323.35*/("""
        reset_months();
      """),format.raw/*325.7*/("""}"""),format.raw/*325.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*326.34*/("""{"""),format.raw/*326.35*/("""
        select_all_months();
      """),format.raw/*328.7*/("""}"""),format.raw/*328.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*329.34*/("""{"""),format.raw/*329.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*334.7*/("""}"""),format.raw/*334.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*335.34*/("""{"""),format.raw/*335.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*340.7*/("""}"""),format.raw/*340.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*341.34*/("""{"""),format.raw/*341.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*346.7*/("""}"""),format.raw/*346.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*347.34*/("""{"""),format.raw/*347.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*352.7*/("""}"""),format.raw/*352.8*/("""
    """),format.raw/*353.5*/("""}"""),format.raw/*353.6*/("""
    $(document).ready(function()"""),format.raw/*354.33*/("""{"""),format.raw/*354.34*/("""
      $("#download_data").click(function(event) """),format.raw/*355.49*/("""{"""),format.raw/*355.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*358.7*/("""}"""),format.raw/*358.8*/(""");
      $("#threedvarzonalmean").click(function(event) """),format.raw/*359.54*/("""{"""),format.raw/*359.55*/("""
	Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*362.31*/("""{"""),format.raw/*362.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*366.9*/("""}"""),format.raw/*366.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/threeDimZonalMean?";
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
        var lat0 = $("#lat0").val();
        var lat1 = $("#lat1").val();
        arglist = arglist.concat("&lat1=");
        arglist = arglist.concat(lat0);
        arglist = arglist.concat("&lat2=");
        arglist = arglist.concat(lat1);
        var pres = $("#pres").val();
        var splitty = pres.split(',');
        if (splitty.length != 2) """),format.raw/*395.34*/("""{"""),format.raw/*395.35*/("""
          alert("pressure level range needs to be two values separated by comma.");
          return;
        """),format.raw/*398.9*/("""}"""),format.raw/*398.10*/("""
        else """),format.raw/*399.14*/("""{"""),format.raw/*399.15*/("""
          pres1 = splitty[0];
          pres2 = splitty[1];
          if (variable == 'ot' || variable == 'os') """),format.raw/*402.53*/("""{"""),format.raw/*402.54*/("""
            pres1 = pres1 * 10000;  
            pres2 = pres2 * 10000;  
          """),format.raw/*405.11*/("""}"""),format.raw/*405.12*/("""
          else """),format.raw/*406.16*/("""{"""),format.raw/*406.17*/("""
            pres1 = pres1 * 100;  
            pres2 = pres2 * 100;  
          """),format.raw/*409.11*/("""}"""),format.raw/*409.12*/("""
        """),format.raw/*410.9*/("""}"""),format.raw/*410.10*/("""
        arglist = arglist.concat("&pres1=");
        arglist = arglist.concat(pres1);
        arglist = arglist.concat("&pres2=");
        arglist = arglist.concat(pres2);
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
        var z = document.getElementById("radioLin2").checked;
        var zval;
        if (y == true)
          yval = 0;
        else
          yval = 2;
        if (z == true)
          zval = 0;
        else
          zval = 4;
        var scale1 =  yval + zval;
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
        $.ajax("""),format.raw/*485.16*/("""{"""),format.raw/*485.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*490.54*/("""{"""),format.raw/*490.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*492.44*/("""{"""),format.raw/*492.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*499.17*/("""}"""),format.raw/*499.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*507.50*/("""{"""),format.raw/*507.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*510.17*/("""}"""),format.raw/*510.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*512.51*/("""{"""),format.raw/*512.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*515.17*/("""}"""),format.raw/*515.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*516.52*/("""{"""),format.raw/*516.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*519.17*/("""}"""),format.raw/*519.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*520.52*/("""{"""),format.raw/*520.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*523.17*/("""}"""),format.raw/*523.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*524.52*/("""{"""),format.raw/*524.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*527.17*/("""}"""),format.raw/*527.18*/("""
            """),format.raw/*528.13*/("""}"""),format.raw/*528.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*529.59*/("""{"""),format.raw/*529.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*532.13*/("""}"""),format.raw/*532.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*533.49*/("""{"""),format.raw/*533.50*/("""
            """),format.raw/*534.13*/("""}"""),format.raw/*534.14*/("""
        """),format.raw/*535.9*/("""}"""),format.raw/*535.10*/(""");
        $.ajax("""),format.raw/*536.16*/("""{"""),format.raw/*536.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*541.54*/("""{"""),format.raw/*541.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*543.44*/("""{"""),format.raw/*543.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*550.17*/("""}"""),format.raw/*550.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='680'/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*557.13*/("""}"""),format.raw/*557.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*558.59*/("""{"""),format.raw/*558.60*/("""
		$("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*561.13*/("""}"""),format.raw/*561.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*562.49*/("""{"""),format.raw/*562.50*/("""
            """),format.raw/*563.13*/("""}"""),format.raw/*563.14*/("""
        """),format.raw/*564.9*/("""}"""),format.raw/*564.10*/(""");
      """),format.raw/*565.7*/("""}"""),format.raw/*565.8*/(""");
    """),format.raw/*566.5*/("""}"""),format.raw/*566.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.43*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*568.2*/(""" """),_display_(Seq[Any](/*568.4*/main("Parameters of ConfId", scripts)/*568.41*/{_display_(Seq[Any](format.raw/*568.42*/(""" """),_display_(Seq[Any](/*568.44*/flash_message())),format.raw/*568.59*/("""
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*570.46*/parameters/*570.56*/.getDataSource())),format.raw/*570.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*571.48*/parameters/*571.58*/.getVariableName())),format.raw/*571.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*572.50*/parameters/*572.60*/.getStartYearMonth())),format.raw/*572.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*573.48*/parameters/*573.58*/.getEndYearMonth())),format.raw/*573.76*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*574.48*/parameters/*574.58*/.getSelectMonths())),format.raw/*574.76*/("""</div>
<div id="pressureRange" style="display: none;">"""),_display_(Seq[Any](/*575.49*/parameters/*575.59*/.getPressureRange())),format.raw/*575.78*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*576.46*/parameters/*576.56*/.getMonth())),format.raw/*576.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*577.44*/parameters/*577.54*/.getStartLat())),format.raw/*577.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*578.42*/parameters/*578.52*/.getEndLat())),format.raw/*578.64*/("""</div>
<div id="pressureLevelScale" style="display: none;">"""),_display_(Seq[Any](/*579.54*/parameters/*579.64*/.getPressureScale())),format.raw/*579.83*/("""</div>
<div id="colorScale" style="display: none;">"""),_display_(Seq[Any](/*580.46*/parameters/*580.56*/.getColorScale())),format.raw/*580.72*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*581.52*/parameters/*581.62*/.getExecutionPurpose())),format.raw/*581.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*582.41*/parameters/*582.51*/.getImage())),format.raw/*582.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*583.43*/parameters/*583.53*/.getDataURL())),format.raw/*583.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*584.55*/parameters/*584.65*/.getServiceResponseText())),format.raw/*584.90*/("""</div>
<table border="1" WIDTH="800" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: 3-D Variable Zonal Mean</b> <br>
				<br> This service generates a contour plot of zonal-mean
				vertical profiles of a 3-dimensional variable. <br> Select a
				data source, a variable name, a time range, and a pressure range
				below.<br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td>data source:</td>
		<td><select name="data" , id="data" onchange="select_data()">
				<optgroup label="Observation">
					<option selected="NASA/AIRS">NASA/AIRS</option>
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
				<option id="none">select none</option>
				<option id="summer">Summer:Jun-Jul-Aug</option>
				<option id="autum">Autumn:Sep-Oct-Nov</option>
				<option id="winter">Winter:Dec-Jan-Feb</option>
				<option id="spring">Spring:Mar-Apr-May</option>
		</select></td>
		<td>atmosphere pressure range (hPa) <br> or ocean pressure
			range (dbar):
		</td>
		<td><input id="pres" value="200,900" alt="pressure" /></td>
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
		<td colspan="1">pressure level scale:</td>
		<td colspan="1">
			<form>
				<input type="radio" name="scale1" value="linear" id="radioLin">linear
				<input type="radio" name="scale1" value="logarithmic" id="radioLog"
					checked>logarithmic
			</form>
		</td>
		<td colspan="1">color scale:</td>
		<td colspan="1">
			<form>
				<input type="radio" name="scale2" value="linear" id="radioLin2"
					checked>linear <input type="radio" name="scale2"
					value="logarithmic" id="radioLog2">logarithmic
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
		<td colspan="2" align="center"><input id="threedvarzonalmean"
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
""")))})),format.raw/*737.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ThreeDVarZonalMean): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ThreeDVarZonalMean) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/threeDVariableZonalMean.scala.html
                    HASH: abd7487fb8c299956fa6a71a2aea14ca83a3411e
                    MATRIX: 3216->1205|3351->1345|3366->1352|3451->1356|3502->1371|3517->1377|3579->1417|3641->1443|3656->1449|3717->1488|3802->1538|3817->1544|3884->1589|4088->1758|4103->1764|4159->1798|4244->1848|4259->1854|4315->1888|4463->2008|4492->2009|5271->2760|5300->2761|5431->2865|5459->2866|5499->2878|5528->2879|5659->2983|5687->2984|5792->3061|5821->3062|5950->3164|5978->3165|6018->3177|6047->3178|6176->3280|6204->3281|6236->3286|6264->3287|6335->3331|6363->3332|6472->3414|6500->3415|6570->3458|6598->3459|6708->3542|6736->3543|6792->3571|6821->3572|6968->3691|6997->3692|7054->3721|7083->3722|7176->3788|7205->3789|7258->3814|7287->3815|7380->3881|7409->3882|7462->3907|7491->3908|7584->3974|7613->3975|7666->4000|7695->4001|7788->4067|7817->4068|7870->4093|7899->4094|7992->4160|8021->4161|8074->4186|8103->4187|8196->4253|8225->4254|8278->4279|8307->4280|8401->4346|8431->4347|8485->4372|8515->4373|8609->4439|8639->4440|8693->4465|8723->4466|8817->4532|8847->4533|8901->4558|8931->4559|9025->4625|9055->4626|9109->4651|9139->4652|9233->4718|9263->4719|9317->4744|9347->4745|9441->4811|9471->4812|9506->4819|9535->4820|9568->4825|9597->4826|9663->4864|9692->4865|10385->5530|10414->5531|10477->5566|10506->5567|11279->6311|11309->6312|11373->6347|11403->6348|11474->6391|11503->6392|11564->6425|11593->6426|12298->7103|12327->7104|12386->7135|12415->7136|12772->7465|12801->7466|12860->7497|12889->7498|13610->8191|13639->8192|13699->8224|13728->8225|13935->8403|13965->8404|14252->8663|14281->8664|14353->8707|14383->8708|14670->8967|14699->8968|14772->9012|14802->9013|15089->9272|15118->9273|15195->9321|15225->9322|15512->9581|15541->9582|15582->9594|15612->9595|15755->9710|15784->9711|15837->9736|15866->9737|15927->9769|15957->9770|16118->9902|16148->9903|16219->9946|16248->9947|16318->9988|16348->9989|16419->10032|16448->10033|16519->10075|16549->10076|16620->10119|16649->10120|16724->10166|16754->10167|16825->10210|16854->10211|16926->10254|16956->10255|17027->10298|17056->10299|17127->10341|17157->10342|17228->10385|17257->10386|17328->10428|17358->10429|17429->10472|17458->10473|17529->10515|17559->10516|17630->10559|17659->10560|17731->10603|17761->10604|17832->10647|17861->10648|17940->10698|17970->10699|18041->10742|18070->10743|18144->10788|18174->10789|18246->10833|18275->10834|18348->10878|18378->10879|18450->10923|18479->10924|18549->10965|18579->10966|18651->11010|18680->11011|18754->11056|18784->11057|18856->11101|18885->11102|18959->11147|18989->11148|19061->11192|19090->11193|19166->11240|19196->11241|19268->11285|19297->11286|19372->11332|19402->11333|19474->11377|19503->11378|19536->11383|19565->11384|19628->11418|19658->11419|19963->11695|19993->11696|20068->11743|20098->11744|20500->12118|20529->12119|20591->12153|20620->12154|20764->12269|20794->12270|20853->12301|20882->12302|20945->12336|20975->12337|21039->12373|21068->12374|21131->12408|21161->12409|21385->12605|21414->12606|21477->12640|21507->12641|21731->12837|21760->12838|21823->12872|21853->12873|22077->13069|22106->13070|22169->13104|22199->13105|22423->13301|22452->13302|22485->13307|22514->13308|22576->13341|22606->13342|22684->13391|22714->13392|22828->13478|22857->13479|22942->13535|22972->13536|23085->13620|23115->13621|23279->13757|23309->13758|24524->14944|24554->14945|24693->15056|24723->15057|24766->15071|24796->15072|24938->15185|24968->15186|25082->15271|25112->15272|25157->15288|25187->15289|25297->15370|25327->15371|25364->15380|25394->15381|28472->18430|28502->18431|28696->18596|28726->18597|28832->18674|28862->18675|29190->18974|29220->18975|29623->19349|29653->19350|29817->19485|29847->19486|29979->19589|30009->19590|30203->19755|30233->19756|30314->19808|30344->19809|30580->20016|30610->20017|30691->20069|30721->20070|30957->20277|30987->20278|31068->20330|31098->20331|31398->20602|31428->20603|31470->20616|31500->20617|31589->20677|31619->20678|31727->20757|31757->20758|31836->20808|31866->20809|31908->20822|31938->20823|31975->20832|32005->20833|32052->20851|32082->20852|32266->21007|32296->21008|32402->21085|32432->21086|32760->21385|32790->21386|33136->21703|33166->21704|33255->21764|33285->21765|33407->21858|33437->21859|33516->21909|33546->21910|33588->21923|33618->21924|33655->21933|33685->21934|33722->21943|33751->21944|33786->21951|33815->21952|33871->1246|33899->1264|33965->1295|33980->1301|34042->1341|34073->21968|34111->21970|34158->22007|34198->22008|34237->22010|34275->22025|34362->22075|34382->22085|34421->22101|34512->22155|34532->22165|34573->22183|34666->22239|34686->22249|34729->22269|34820->22323|34840->22333|34881->22351|34972->22405|34992->22415|35033->22433|35125->22488|35145->22498|35187->22517|35276->22569|35296->22579|35330->22590|35417->22640|35437->22650|35474->22664|35559->22712|35579->22722|35614->22734|35711->22794|35731->22804|35773->22823|35862->22875|35882->22885|35921->22901|36016->22959|36036->22969|36081->22991|36165->23038|36185->23048|36219->23059|36305->23108|36325->23118|36361->23131|36459->23192|36479->23202|36527->23227|41712->28380
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|70->30|70->30|70->30|72->32|72->32|72->32|76->36|76->36|94->54|94->54|97->57|97->57|98->58|98->58|101->61|101->61|103->63|103->63|106->66|106->66|107->67|107->67|110->70|110->70|111->71|111->71|113->73|113->73|116->76|116->76|118->78|118->78|121->81|121->81|122->82|122->82|125->85|125->85|126->86|126->86|128->88|128->88|128->88|128->88|130->90|130->90|130->90|130->90|132->92|132->92|132->92|132->92|134->94|134->94|134->94|134->94|136->96|136->96|136->96|136->96|138->98|138->98|138->98|138->98|140->100|140->100|140->100|140->100|142->102|142->102|142->102|142->102|144->104|144->104|144->104|144->104|146->106|146->106|146->106|146->106|148->108|148->108|148->108|148->108|150->110|150->110|151->111|151->111|152->112|152->112|154->114|154->114|167->127|167->127|169->129|169->129|181->141|181->141|183->143|183->143|186->146|186->146|188->148|188->148|201->161|201->161|203->163|203->163|213->173|213->173|215->175|215->175|234->194|234->194|236->196|236->196|241->201|241->201|249->209|249->209|250->210|250->210|258->218|258->218|259->219|259->219|267->227|267->227|268->228|268->228|276->236|276->236|277->237|277->237|281->241|281->241|283->243|283->243|284->244|284->244|287->247|287->247|289->249|289->249|290->250|290->250|292->252|292->252|293->253|293->253|295->255|295->255|296->256|296->256|298->258|298->258|299->259|299->259|301->261|301->261|302->262|302->262|304->264|304->264|305->265|305->265|307->267|307->267|308->268|308->268|310->270|310->270|311->271|311->271|313->273|313->273|314->274|314->274|316->276|316->276|317->277|317->277|319->279|319->279|320->280|320->280|322->282|322->282|323->283|323->283|325->285|325->285|326->286|326->286|328->288|328->288|329->289|329->289|331->291|331->291|332->292|332->292|334->294|334->294|335->295|335->295|337->297|337->297|338->298|338->298|339->299|339->299|346->306|346->306|348->308|348->308|358->318|358->318|360->320|360->320|363->323|363->323|365->325|365->325|366->326|366->326|368->328|368->328|369->329|369->329|374->334|374->334|375->335|375->335|380->340|380->340|381->341|381->341|386->346|386->346|387->347|387->347|392->352|392->352|393->353|393->353|394->354|394->354|395->355|395->355|398->358|398->358|399->359|399->359|402->362|402->362|406->366|406->366|435->395|435->395|438->398|438->398|439->399|439->399|442->402|442->402|445->405|445->405|446->406|446->406|449->409|449->409|450->410|450->410|525->485|525->485|530->490|530->490|532->492|532->492|539->499|539->499|547->507|547->507|550->510|550->510|552->512|552->512|555->515|555->515|556->516|556->516|559->519|559->519|560->520|560->520|563->523|563->523|564->524|564->524|567->527|567->527|568->528|568->528|569->529|569->529|572->532|572->532|573->533|573->533|574->534|574->534|575->535|575->535|576->536|576->536|581->541|581->541|583->543|583->543|590->550|590->550|597->557|597->557|598->558|598->558|601->561|601->561|602->562|602->562|603->563|603->563|604->564|604->564|605->565|605->565|606->566|606->566|609->18|609->19|610->20|610->20|610->20|611->568|611->568|611->568|611->568|611->568|611->568|613->570|613->570|613->570|614->571|614->571|614->571|615->572|615->572|615->572|616->573|616->573|616->573|617->574|617->574|617->574|618->575|618->575|618->575|619->576|619->576|619->576|620->577|620->577|620->577|621->578|621->578|621->578|622->579|622->579|622->579|623->580|623->580|623->580|624->581|624->581|624->581|625->582|625->582|625->582|626->583|626->583|626->583|627->584|627->584|627->584|780->737
                    -- GENERATED --
                */
            