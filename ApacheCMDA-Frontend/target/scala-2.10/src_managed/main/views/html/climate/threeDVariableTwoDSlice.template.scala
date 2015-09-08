
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
object threeDVariableTwoDSlice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ThreeDVar2DSlice,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ThreeDVar2DSlice):play.api.templates.HtmlFormat.Appendable = {
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
      $('#pres').val($('#pressureLevel').text());
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
      var colorScale = $('#colorScale').text();
      if(colorScale == "0") """),format.raw/*56.29*/("""{"""),format.raw/*56.30*/("""
        $('#radioLin').prop( "checked", true );
        $('#radioLog').prop( "checked", false );
      """),format.raw/*59.7*/("""}"""),format.raw/*59.8*/("""
      else """),format.raw/*60.12*/("""{"""),format.raw/*60.13*/("""
        $('#radioLin').prop( "checked", false );
        $('#radioLog').prop( "checked", true );
      """),format.raw/*63.7*/("""}"""),format.raw/*63.8*/("""
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
    function disable_download_button()
    """),format.raw/*66.5*/("""{"""),format.raw/*66.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=true;
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/("""
    function enable_download_button()
    """),format.raw/*71.5*/("""{"""),format.raw/*71.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""         
    function changeMonths()"""),format.raw/*75.28*/("""{"""),format.raw/*75.29*/("""
      var months = $("#monthsPara").text();
      var temp = months.split(", ");
      for(i = 0;i < temp.length;i ++)"""),format.raw/*78.38*/("""{"""),format.raw/*78.39*/("""
        if(temp[i] == 'jan')"""),format.raw/*79.29*/("""{"""),format.raw/*79.30*/("""
          document.getElementById('Jan').checked = true;
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""else if(temp[i] == 'feb')"""),format.raw/*81.35*/("""{"""),format.raw/*81.36*/("""
          document.getElementById('Feb').checked = true;
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""else if(temp[i] == 'mar')"""),format.raw/*83.35*/("""{"""),format.raw/*83.36*/("""
          document.getElementById('Mar').checked = true;
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/("""else if(temp[i] == 'apr')"""),format.raw/*85.35*/("""{"""),format.raw/*85.36*/("""
          document.getElementById('Apr').checked = true;
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""else if(temp[i] == 'may')"""),format.raw/*87.35*/("""{"""),format.raw/*87.36*/("""
          document.getElementById('May').checked = true;
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/("""else if(temp[i] == 'jun')"""),format.raw/*89.35*/("""{"""),format.raw/*89.36*/("""
          document.getElementById('Jun').checked = true;
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""else if(temp[i] == 'jul')"""),format.raw/*91.35*/("""{"""),format.raw/*91.36*/("""
          document.getElementById('Jul').checked = true;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""else if(temp[i] == 'aug')"""),format.raw/*93.35*/("""{"""),format.raw/*93.36*/("""
          document.getElementById('Aug').checked = true;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""else if(temp[i] == 'sep')"""),format.raw/*95.35*/("""{"""),format.raw/*95.36*/("""
          document.getElementById('Sep').checked = true;
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""else if(temp[i] == 'oct')"""),format.raw/*97.35*/("""{"""),format.raw/*97.36*/("""
          document.getElementById('Oct').checked = true;
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""else if(temp[i] == 'nov')"""),format.raw/*99.35*/("""{"""),format.raw/*99.36*/("""
          document.getElementById('Nov').checked = true;
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""else if(temp[i] == 'dec')"""),format.raw/*101.35*/("""{"""),format.raw/*101.36*/("""
          document.getElementById('Dec').checked = true;
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
      """),format.raw/*104.7*/("""}"""),format.raw/*104.8*/("""
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/("""
    function select_all_months()
    """),format.raw/*107.5*/("""{"""),format.raw/*107.6*/("""
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
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
    function no_month_check()
    """),format.raw/*122.5*/("""{"""),format.raw/*122.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*134.61*/("""{"""),format.raw/*134.62*/("""
           return true;
          """),format.raw/*136.11*/("""}"""),format.raw/*136.12*/("""
        else
           return false;
    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/("""
    function reset_months()
    """),format.raw/*141.5*/("""{"""),format.raw/*141.6*/("""
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
    """),format.raw/*154.5*/("""}"""),format.raw/*154.6*/("""
    function reset_vars()
    """),format.raw/*156.5*/("""{"""),format.raw/*156.6*/("""
      var x=document.getElementById("var");
      x.options[0].disabled=false;
      x.options[1].disabled=false;
      x.options[2].disabled=false;
      x.options[3].disabled=false;
      x.options[4].disabled=false;
      x.options[5].disabled=false;
      x.options[6].disabled=false;
      x.options[7].disabled=false;
    """),format.raw/*166.5*/("""}"""),format.raw/*166.6*/("""
    function select_var()
    """),format.raw/*168.5*/("""{"""),format.raw/*168.6*/("""
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
    """),format.raw/*187.5*/("""}"""),format.raw/*187.6*/("""
    function select_data()
    """),format.raw/*189.5*/("""{"""),format.raw/*189.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      disable_download_button();
      reset_vars();
      if (data_string == "NASA/AIRS") """),format.raw/*194.39*/("""{"""),format.raw/*194.40*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*202.7*/("""}"""),format.raw/*202.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*203.43*/("""{"""),format.raw/*203.44*/("""
        x.options[0].selected=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*211.7*/("""}"""),format.raw/*211.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*212.44*/("""{"""),format.raw/*212.45*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].selected=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
      """),format.raw/*220.7*/("""}"""),format.raw/*220.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*221.48*/("""{"""),format.raw/*221.49*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].selected=true;
      """),format.raw/*229.7*/("""}"""),format.raw/*229.8*/("""
      else """),format.raw/*230.12*/("""{"""),format.raw/*230.13*/(""" 
        x.options[0].selected=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
      """),format.raw/*234.7*/("""}"""),format.raw/*234.8*/("""
      select_var();
    """),format.raw/*236.5*/("""}"""),format.raw/*236.6*/("""
    function changeDataSource()"""),format.raw/*237.32*/("""{"""),format.raw/*237.33*/("""
      var dataSource = $('#dataSource').text();
      var x = document.getElementById("data");
      if(dataSource == "NASA_AIRS" )"""),format.raw/*240.37*/("""{"""),format.raw/*240.38*/("""
        x.options[0].selected=true;
      """),format.raw/*242.7*/("""}"""),format.raw/*242.8*/("""
      else if(dataSource == "NASA_MLS" )"""),format.raw/*243.41*/("""{"""),format.raw/*243.42*/("""
        x.options[1].selected=true;
      """),format.raw/*245.7*/("""}"""),format.raw/*245.8*/("""
      else if(dataSource == "NASA_ARGO" )"""),format.raw/*246.42*/("""{"""),format.raw/*246.43*/("""
        x.options[2].selected=true;
      """),format.raw/*248.7*/("""}"""),format.raw/*248.8*/("""
      else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*249.46*/("""{"""),format.raw/*249.47*/("""
        x.options[3].selected=true;
      """),format.raw/*251.7*/("""}"""),format.raw/*251.8*/("""
      else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*252.43*/("""{"""),format.raw/*252.44*/("""
        x.options[4].selected=true;
      """),format.raw/*254.7*/("""}"""),format.raw/*254.8*/("""
      else if(dataSource == "GISS_E2-H" )"""),format.raw/*255.42*/("""{"""),format.raw/*255.43*/("""
        x.options[5].selected=true;
      """),format.raw/*257.7*/("""}"""),format.raw/*257.8*/("""
      else if(dataSource == "GISS_E2-R" )"""),format.raw/*258.42*/("""{"""),format.raw/*258.43*/("""
        x.options[6].selected=true;
      """),format.raw/*260.7*/("""}"""),format.raw/*260.8*/("""
      else if(dataSource == "NCAR_CAM5" )"""),format.raw/*261.42*/("""{"""),format.raw/*261.43*/("""
        x.options[7].selected=true;
      """),format.raw/*263.7*/("""}"""),format.raw/*263.8*/("""
      else if(dataSource == "NCC_NORESM" )"""),format.raw/*264.43*/("""{"""),format.raw/*264.44*/("""
        x.options[8].selected=true;
      """),format.raw/*266.7*/("""}"""),format.raw/*266.8*/("""
      else if(dataSource == "UKMO_HadGEM2-ES-A" )"""),format.raw/*267.50*/("""{"""),format.raw/*267.51*/("""
        x.options[9].selected=true;
      """),format.raw/*269.7*/("""}"""),format.raw/*269.8*/("""
      else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*270.45*/("""{"""),format.raw/*270.46*/("""
        x.options[10].selected=true;
      """),format.raw/*272.7*/("""}"""),format.raw/*272.8*/("""
      else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*273.44*/("""{"""),format.raw/*273.45*/("""
        x.options[11].selected=true;
      """),format.raw/*275.7*/("""}"""),format.raw/*275.8*/("""
      else if(dataSource == "GFDL_CM3" )"""),format.raw/*276.41*/("""{"""),format.raw/*276.42*/("""
        x.options[12].selected=true;
      """),format.raw/*278.7*/("""}"""),format.raw/*278.8*/("""
      else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*279.45*/("""{"""),format.raw/*279.46*/("""
        x.options[13].selected=true;
      """),format.raw/*281.7*/("""}"""),format.raw/*281.8*/("""
      else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*282.45*/("""{"""),format.raw/*282.46*/("""
        x.options[14].selected=true;
      """),format.raw/*284.7*/("""}"""),format.raw/*284.8*/("""
      else if(dataSource == "UKMO_HadGEM2-A" )"""),format.raw/*285.47*/("""{"""),format.raw/*285.48*/("""
        x.options[15].selected=true;
      """),format.raw/*287.7*/("""}"""),format.raw/*287.8*/("""
      else if(dataSource == "ECMWF_interim" )"""),format.raw/*288.46*/("""{"""),format.raw/*288.47*/("""
        x.options[16].selected=true;
      """),format.raw/*290.7*/("""}"""),format.raw/*290.8*/("""
    """),format.raw/*291.5*/("""}"""),format.raw/*291.6*/("""
    function changeVariableName()"""),format.raw/*292.34*/("""{"""),format.raw/*292.35*/("""
      var var_string = $('#variableName').text();
      var x = document.getElementById("var");
      if (var_string == "ta")
        x.options[0].selected=true;
        else if (var_string == "hus")
          x.options[1].selected=true;
        else if (var_string == "cli")"""),format.raw/*299.38*/("""{"""),format.raw/*299.39*/("""
          x.options[2].selected=true;
        """),format.raw/*301.9*/("""}"""),format.raw/*301.10*/("""else if (var_string == "clw")
          x.options[3].selected=true;
        else if (var_string == "ot")
          x.options[4].selected=true;
        else if (var_string == "os")
          x.options[5].selected=true;
        else if (var_string == "wap")
          x.options[6].selected=true;
        else if (var_string == "hur")
          x.options[7].selected=true;
    """),format.raw/*311.5*/("""}"""),format.raw/*311.6*/("""
    function select_months()
    """),format.raw/*313.5*/("""{"""),format.raw/*313.6*/("""
      var s1=document.getElementById("months");
      disable_download_button();
      if (s1.selectedIndex == 1) """),format.raw/*316.34*/("""{"""),format.raw/*316.35*/("""
        reset_months();
      """),format.raw/*318.7*/("""}"""),format.raw/*318.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*319.34*/("""{"""),format.raw/*319.35*/("""
        select_all_months();
      """),format.raw/*321.7*/("""}"""),format.raw/*321.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*322.34*/("""{"""),format.raw/*322.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*327.7*/("""}"""),format.raw/*327.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*328.34*/("""{"""),format.raw/*328.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*333.7*/("""}"""),format.raw/*333.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*334.34*/("""{"""),format.raw/*334.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*339.7*/("""}"""),format.raw/*339.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*340.34*/("""{"""),format.raw/*340.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*345.7*/("""}"""),format.raw/*345.8*/("""
    """),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""
    $(document).ready(function()"""),format.raw/*347.33*/("""{"""),format.raw/*347.34*/("""
      $("#download_data").click(function(event) """),format.raw/*348.49*/("""{"""),format.raw/*348.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*351.7*/("""}"""),format.raw/*351.8*/(""");
      $("#twodvarmap").click(function(event) """),format.raw/*352.46*/("""{"""),format.raw/*352.47*/("""
	Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*355.31*/("""{"""),format.raw/*355.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*359.9*/("""}"""),format.raw/*359.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/twoDimSlice3D?";
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
        var pres = $("#pres").val();
        if (variable == 'ot' || variable == 'os')
          pres = pres * 10000;  
        else
          pres = pres * 100;  
        arglist = arglist.concat("&pr=");
        arglist = arglist.concat(pres);
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
        var z = document.getElementById("radioLin").checked;
        if (z == true)
          arglist = arglist.concat('0');
        else
          arglist = arglist.concat('4');
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
        $.ajax("""),format.raw/*459.16*/("""{"""),format.raw/*459.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*464.54*/("""{"""),format.raw/*464.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*466.44*/("""{"""),format.raw/*466.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*473.17*/("""}"""),format.raw/*473.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*481.50*/("""{"""),format.raw/*481.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*484.17*/("""}"""),format.raw/*484.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*486.51*/("""{"""),format.raw/*486.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*489.17*/("""}"""),format.raw/*489.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*490.52*/("""{"""),format.raw/*490.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*493.17*/("""}"""),format.raw/*493.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*494.52*/("""{"""),format.raw/*494.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*497.17*/("""}"""),format.raw/*497.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*498.52*/("""{"""),format.raw/*498.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*501.17*/("""}"""),format.raw/*501.18*/("""
            """),format.raw/*502.13*/("""}"""),format.raw/*502.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*503.59*/("""{"""),format.raw/*503.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*506.13*/("""}"""),format.raw/*506.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*507.49*/("""{"""),format.raw/*507.50*/("""
            """),format.raw/*508.13*/("""}"""),format.raw/*508.14*/("""
        """),format.raw/*509.9*/("""}"""),format.raw/*509.10*/(""");
        $.ajax("""),format.raw/*510.16*/("""{"""),format.raw/*510.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*515.54*/("""{"""),format.raw/*515.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*517.44*/("""{"""),format.raw/*517.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*524.17*/("""}"""),format.raw/*524.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='680'/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*531.13*/("""}"""),format.raw/*531.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*532.59*/("""{"""),format.raw/*532.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*535.13*/("""}"""),format.raw/*535.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*536.49*/("""{"""),format.raw/*536.50*/("""
            """),format.raw/*537.13*/("""}"""),format.raw/*537.14*/("""
        """),format.raw/*538.9*/("""}"""),format.raw/*538.10*/(""");
      """),format.raw/*539.7*/("""}"""),format.raw/*539.8*/(""");
    """),format.raw/*540.5*/("""}"""),format.raw/*540.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.41*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*542.2*/(""" """),_display_(Seq[Any](/*542.4*/main("Parameters of ConfId", scripts)/*542.41*/{_display_(Seq[Any](format.raw/*542.42*/(""" """),_display_(Seq[Any](/*542.44*/flash_message())),format.raw/*542.59*/("""
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*544.46*/parameters/*544.56*/.getDataSource())),format.raw/*544.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*545.48*/parameters/*545.58*/.getVariableName())),format.raw/*545.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*546.50*/parameters/*546.60*/.getStartYearMonth())),format.raw/*546.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*547.48*/parameters/*547.58*/.getEndYearMonth())),format.raw/*547.76*/("""</div>
<div id="pressureLevel" style="display: none;">"""),_display_(Seq[Any](/*548.49*/parameters/*548.59*/.getPressureLevel())),format.raw/*548.78*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*549.48*/parameters/*549.58*/.getSelectMonths())),format.raw/*549.76*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*550.46*/parameters/*550.56*/.getMonth())),format.raw/*550.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*551.44*/parameters/*551.54*/.getStartLat())),format.raw/*551.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*552.42*/parameters/*552.52*/.getEndLat())),format.raw/*552.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*553.44*/parameters/*553.54*/.getStartLon())),format.raw/*553.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*554.42*/parameters/*554.52*/.getEndLon())),format.raw/*554.64*/("""</div>
<div id="colorScale" style="display: none;">"""),_display_(Seq[Any](/*555.46*/parameters/*555.56*/.getColorScale())),format.raw/*555.72*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*556.52*/parameters/*556.62*/.getExecutionPurpose())),format.raw/*556.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*557.41*/parameters/*557.51*/.getImage())),format.raw/*557.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*558.43*/parameters/*558.53*/.getDataURL())),format.raw/*558.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*559.55*/parameters/*559.65*/.getServiceResponseText())),format.raw/*559.90*/("""</div>
<table border="1" width="800" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: 3-D Variable 2-D Slice</b><br>
				<br> This service generates a slice map of a 3-dimensional
				variable at a selected pressure level. <br> Select a data
				source, a variable name, a time range, a spatial range, and a
				pressure level below.<br>
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
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar)
		</td>
		<td><input id="pres" value="500" alt="pressure" /></td>
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
		<td colspan="1">color scale:</td>
		<td colspan="3">
			<form>
				<input type="radio" name="scale1" value="linear" id="radioLin"
					checked>linear <input type="radio" name="scale1"
					value="logarithmic" id="radioLog">logarithmic
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
		<td colspan="2" align="center"><input id="twodvarmap"
			type="submit" value="            Run Again            "
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
""")))})),format.raw/*711.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ThreeDVar2DSlice): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ThreeDVar2DSlice) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/threeDVariableTwoDSlice.scala.html
                    HASH: 2a9ec4d9f5794c47d9ea5d13c36c3ca725dc247d
                    MATRIX: 3214->1205|3347->1343|3362->1350|3447->1354|3498->1369|3513->1375|3575->1415|3637->1441|3652->1447|3713->1486|3798->1536|3813->1542|3880->1587|4084->1756|4099->1762|4155->1796|4240->1846|4255->1852|4311->1886|4460->2007|4489->2008|5336->2827|5365->2828|5496->2932|5524->2933|5564->2945|5593->2946|5724->3050|5752->3051|5784->3056|5812->3057|5883->3101|5911->3102|6020->3184|6048->3185|6118->3228|6146->3229|6256->3312|6284->3313|6349->3350|6378->3351|6525->3470|6554->3471|6611->3500|6640->3501|6733->3567|6762->3568|6815->3593|6844->3594|6937->3660|6966->3661|7019->3686|7048->3687|7141->3753|7170->3754|7223->3779|7252->3780|7345->3846|7374->3847|7427->3872|7456->3873|7549->3939|7578->3940|7631->3965|7660->3966|7753->4032|7782->4033|7835->4058|7864->4059|7957->4125|7986->4126|8039->4151|8068->4152|8161->4218|8190->4219|8243->4244|8272->4245|8365->4311|8394->4312|8447->4337|8476->4338|8569->4404|8598->4405|8651->4430|8680->4431|8774->4497|8804->4498|8858->4523|8888->4524|8982->4590|9012->4591|9047->4598|9076->4599|9109->4604|9138->4605|9204->4643|9233->4644|9926->5309|9955->5310|10018->5345|10047->5346|10820->6090|10850->6091|10914->6126|10944->6127|11015->6170|11044->6171|11105->6204|11134->6205|11839->6882|11868->6883|11927->6914|11956->6915|12313->7244|12342->7245|12401->7276|12430->7277|13151->7970|13180->7971|13240->8003|13269->8004|13476->8182|13506->8183|13793->8442|13822->8443|13894->8486|13924->8487|14211->8746|14240->8747|14313->8791|14343->8792|14630->9051|14659->9052|14736->9100|14766->9101|15053->9360|15082->9361|15123->9373|15153->9374|15297->9490|15326->9491|15379->9516|15408->9517|15469->9549|15499->9550|15660->9682|15690->9683|15761->9726|15790->9727|15860->9768|15890->9769|15961->9812|15990->9813|16061->9855|16091->9856|16162->9899|16191->9900|16266->9946|16296->9947|16367->9990|16396->9991|16468->10034|16498->10035|16569->10078|16598->10079|16669->10121|16699->10122|16770->10165|16799->10166|16870->10208|16900->10209|16971->10252|17000->10253|17071->10295|17101->10296|17172->10339|17201->10340|17273->10383|17303->10384|17374->10427|17403->10428|17482->10478|17512->10479|17583->10522|17612->10523|17686->10568|17716->10569|17788->10613|17817->10614|17890->10658|17920->10659|17992->10703|18021->10704|18091->10745|18121->10746|18193->10790|18222->10791|18296->10836|18326->10837|18398->10881|18427->10882|18501->10927|18531->10928|18603->10972|18632->10973|18708->11020|18738->11021|18810->11065|18839->11066|18914->11112|18944->11113|19016->11157|19045->11158|19078->11163|19107->11164|19170->11198|19200->11199|19505->11475|19535->11476|19610->11523|19640->11524|20042->11898|20071->11899|20133->11933|20162->11934|20306->12049|20336->12050|20395->12081|20424->12082|20487->12116|20517->12117|20581->12153|20610->12154|20673->12188|20703->12189|20927->12385|20956->12386|21019->12420|21049->12421|21273->12617|21302->12618|21365->12652|21395->12653|21619->12849|21648->12850|21711->12884|21741->12885|21965->13081|21994->13082|22027->13087|22056->13088|22118->13121|22148->13122|22226->13171|22256->13172|22370->13258|22399->13259|22476->13307|22506->13308|22619->13392|22649->13393|22813->13529|22843->13530|27051->17709|27081->17710|27275->17875|27305->17876|27411->17953|27441->17954|27769->18253|27799->18254|28202->18628|28232->18629|28396->18764|28426->18765|28558->18868|28588->18869|28782->19034|28812->19035|28893->19087|28923->19088|29159->19295|29189->19296|29270->19348|29300->19349|29536->19556|29566->19557|29647->19609|29677->19610|29977->19881|30007->19882|30049->19895|30079->19896|30168->19956|30198->19957|30306->20036|30336->20037|30415->20087|30445->20088|30487->20101|30517->20102|30554->20111|30584->20112|30631->20130|30661->20131|30845->20286|30875->20287|30981->20364|31011->20365|31339->20664|31369->20665|31715->20982|31745->20983|31834->21043|31864->21044|31972->21123|32002->21124|32081->21174|32111->21175|32153->21188|32183->21189|32220->21198|32250->21199|32287->21208|32316->21209|32351->21216|32380->21217|32436->1244|32464->1262|32530->1293|32545->1299|32607->1339|32638->21233|32676->21235|32723->21272|32763->21273|32802->21275|32840->21290|32927->21340|32947->21350|32986->21366|33077->21420|33097->21430|33138->21448|33231->21504|33251->21514|33294->21534|33385->21588|33405->21598|33446->21616|33538->21671|33558->21681|33600->21700|33691->21754|33711->21764|33752->21782|33841->21834|33861->21844|33895->21855|33982->21905|34002->21915|34039->21929|34124->21977|34144->21987|34179->21999|34266->22049|34286->22059|34323->22073|34408->22121|34428->22131|34463->22143|34552->22195|34572->22205|34611->22221|34706->22279|34726->22289|34771->22311|34855->22358|34875->22368|34909->22379|34995->22428|35015->22438|35051->22451|35149->22512|35169->22522|35217->22547|40298->27596
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|70->30|70->30|70->30|72->32|72->32|72->32|76->36|76->36|96->56|96->56|99->59|99->59|100->60|100->60|103->63|103->63|104->64|104->64|106->66|106->66|109->69|109->69|111->71|111->71|114->74|114->74|115->75|115->75|118->78|118->78|119->79|119->79|121->81|121->81|121->81|121->81|123->83|123->83|123->83|123->83|125->85|125->85|125->85|125->85|127->87|127->87|127->87|127->87|129->89|129->89|129->89|129->89|131->91|131->91|131->91|131->91|133->93|133->93|133->93|133->93|135->95|135->95|135->95|135->95|137->97|137->97|137->97|137->97|139->99|139->99|139->99|139->99|141->101|141->101|141->101|141->101|143->103|143->103|144->104|144->104|145->105|145->105|147->107|147->107|160->120|160->120|162->122|162->122|174->134|174->134|176->136|176->136|179->139|179->139|181->141|181->141|194->154|194->154|196->156|196->156|206->166|206->166|208->168|208->168|227->187|227->187|229->189|229->189|234->194|234->194|242->202|242->202|243->203|243->203|251->211|251->211|252->212|252->212|260->220|260->220|261->221|261->221|269->229|269->229|270->230|270->230|274->234|274->234|276->236|276->236|277->237|277->237|280->240|280->240|282->242|282->242|283->243|283->243|285->245|285->245|286->246|286->246|288->248|288->248|289->249|289->249|291->251|291->251|292->252|292->252|294->254|294->254|295->255|295->255|297->257|297->257|298->258|298->258|300->260|300->260|301->261|301->261|303->263|303->263|304->264|304->264|306->266|306->266|307->267|307->267|309->269|309->269|310->270|310->270|312->272|312->272|313->273|313->273|315->275|315->275|316->276|316->276|318->278|318->278|319->279|319->279|321->281|321->281|322->282|322->282|324->284|324->284|325->285|325->285|327->287|327->287|328->288|328->288|330->290|330->290|331->291|331->291|332->292|332->292|339->299|339->299|341->301|341->301|351->311|351->311|353->313|353->313|356->316|356->316|358->318|358->318|359->319|359->319|361->321|361->321|362->322|362->322|367->327|367->327|368->328|368->328|373->333|373->333|374->334|374->334|379->339|379->339|380->340|380->340|385->345|385->345|386->346|386->346|387->347|387->347|388->348|388->348|391->351|391->351|392->352|392->352|395->355|395->355|399->359|399->359|499->459|499->459|504->464|504->464|506->466|506->466|513->473|513->473|521->481|521->481|524->484|524->484|526->486|526->486|529->489|529->489|530->490|530->490|533->493|533->493|534->494|534->494|537->497|537->497|538->498|538->498|541->501|541->501|542->502|542->502|543->503|543->503|546->506|546->506|547->507|547->507|548->508|548->508|549->509|549->509|550->510|550->510|555->515|555->515|557->517|557->517|564->524|564->524|571->531|571->531|572->532|572->532|575->535|575->535|576->536|576->536|577->537|577->537|578->538|578->538|579->539|579->539|580->540|580->540|583->18|583->19|584->20|584->20|584->20|585->542|585->542|585->542|585->542|585->542|585->542|587->544|587->544|587->544|588->545|588->545|588->545|589->546|589->546|589->546|590->547|590->547|590->547|591->548|591->548|591->548|592->549|592->549|592->549|593->550|593->550|593->550|594->551|594->551|594->551|595->552|595->552|595->552|596->553|596->553|596->553|597->554|597->554|597->554|598->555|598->555|598->555|599->556|599->556|599->556|600->557|600->557|600->557|601->558|601->558|601->558|602->559|602->559|602->559|754->711
                    -- GENERATED --
                */
            