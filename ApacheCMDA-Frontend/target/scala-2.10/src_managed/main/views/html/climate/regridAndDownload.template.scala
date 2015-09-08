
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
object regridAndDownload extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.RegridAndDownload,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.RegridAndDownload):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/livefilter.js"))),format.raw/*23.60*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*25.8*/routes/*25.14*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*25.59*/("""'></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js"></script>
<script type="
	text/javascript"
	src='"""),_display_(Seq[Any](/*29.8*/routes/*29.14*/.Assets.at("javascripts/json2.js"))),format.raw/*29.48*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*31.8*/routes/*31.14*/.Assets.at("jhtml/js/xmisc.js"))),format.raw/*31.45*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*33.8*/routes/*33.14*/.Assets.at("html/js2/varList.js"))),format.raw/*33.47*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*35.8*/routes/*35.14*/.Assets.at("html/js2/dataList2.js"))),format.raw/*35.49*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*37.8*/routes/*37.14*/.Assets.at("html/js2/common.js"))),format.raw/*37.46*/("""'></script>
<script type="text/javascript">
    var Response = null;
    var variable = "";
    window.onload = function() """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
    	put_data(1);
    	changeDataSource();
        put_var(1);
        changeVariableName();
      enable_download_button();
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      if($('#pressureLevel').text() == "-999999")"""),format.raw/*49.50*/("""{"""),format.raw/*49.51*/("""
      	disable_pres1(1);
      """),format.raw/*51.7*/("""}"""),format.raw/*51.8*/("""else"""),format.raw/*51.12*/("""{"""),format.raw/*51.13*/("""
      	$('#pres1').val($('#pressureLevel').text());
      """),format.raw/*53.7*/("""}"""),format.raw/*53.8*/("""
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#dlat').val($('#deltaLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      $('#dlon').val($('#deltaLon').text());
      $('#purpose').html($('#executionPurpose').text());
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('#serviceResponseText').text());
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
 function changeDataSource() """),format.raw/*64.30*/("""{"""),format.raw/*64.31*/("""
	    var dataSource = $('#dataSource').text();
	    var x = document.getElementById("data1");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*67.37*/("""{"""),format.raw/*67.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*69.7*/("""}"""),format.raw/*69.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*70.42*/("""{"""),format.raw/*70.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*72.7*/("""}"""),format.raw/*72.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*76.42*/("""{"""),format.raw/*76.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*79.43*/("""{"""),format.raw/*79.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*81.7*/("""}"""),format.raw/*81.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*82.48*/("""{"""),format.raw/*82.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*85.45*/("""{"""),format.raw/*85.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*88.44*/("""{"""),format.raw/*88.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*91.41*/("""{"""),format.raw/*91.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*93.7*/("""}"""),format.raw/*93.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*94.45*/("""{"""),format.raw/*94.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*96.7*/("""}"""),format.raw/*96.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*97.45*/("""{"""),format.raw/*97.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*99.7*/("""}"""),format.raw/*99.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*100.47*/("""{"""),format.raw/*100.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*102.7*/("""}"""),format.raw/*102.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*103.43*/("""{"""),format.raw/*103.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*105.7*/("""}"""),format.raw/*105.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*106.43*/("""{"""),format.raw/*106.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*108.7*/("""}"""),format.raw/*108.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*109.42*/("""{"""),format.raw/*109.43*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*111.7*/("""}"""),format.raw/*111.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*114.7*/("""}"""),format.raw/*114.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*115.46*/("""{"""),format.raw/*115.47*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*117.7*/("""}"""),format.raw/*117.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*118.43*/("""{"""),format.raw/*118.44*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*120.7*/("""}"""),format.raw/*120.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*121.43*/("""{"""),format.raw/*121.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*123.7*/("""}"""),format.raw/*123.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*124.42*/("""{"""),format.raw/*124.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*126.7*/("""}"""),format.raw/*126.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*127.43*/("""{"""),format.raw/*127.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*129.7*/("""}"""),format.raw/*129.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*130.42*/("""{"""),format.raw/*130.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*132.7*/("""}"""),format.raw/*132.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*133.41*/("""{"""),format.raw/*133.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*135.7*/("""}"""),format.raw/*135.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*136.42*/("""{"""),format.raw/*136.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*138.7*/("""}"""),format.raw/*138.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*139.46*/("""{"""),format.raw/*139.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*141.7*/("""}"""),format.raw/*141.8*/("""
      """),format.raw/*142.7*/("""}"""),format.raw/*142.8*/("""
function changeVariableName()"""),format.raw/*143.30*/("""{"""),format.raw/*143.31*/("""
      var var_string = $('#variableName').text();
      var data_string = $('#dataSource').text();
      data_string = data_string.replace("_", "/").toUpperCase();
      var varList2 = dataList[data_string][1];  
      var x = document.getElementById("var1");
      for (var i=0; i<varList2.length; i++) """),format.raw/*149.45*/("""{"""),format.raw/*149.46*/("""
    	  var k = varList2[i];
          if (k == var_string) """),format.raw/*151.32*/("""{"""),format.raw/*151.33*/("""
          	x.options[i].selected=true;
          	break;
          """),format.raw/*154.11*/("""}"""),format.raw/*154.12*/("""
      """),format.raw/*155.7*/("""}"""),format.raw/*155.8*/("""
    """),format.raw/*156.5*/("""}"""),format.raw/*156.6*/("""
function disable_download_button()
    """),format.raw/*158.5*/("""{"""),format.raw/*158.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=true;
    """),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
    function enable_download_button()
    """),format.raw/*163.5*/("""{"""),format.raw/*163.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*166.5*/("""}"""),format.raw/*166.6*/("""
    function disable_pres1(ID)
    """),format.raw/*168.5*/("""{"""),format.raw/*168.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*173.5*/("""}"""),format.raw/*173.6*/("""
    function enable_pres1(ID)
    """),format.raw/*175.5*/("""{"""),format.raw/*175.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.disabled=false;
    """),format.raw/*179.5*/("""}"""),format.raw/*179.6*/("""
    function put_data(ID)"""),format.raw/*180.26*/("""{"""),format.raw/*180.27*/("""
      var list1=document.getElementById("data"+ID);
      for(var key in dataList) """),format.raw/*182.32*/("""{"""),format.raw/*182.33*/("""
        if (key.slice(0,5)==="group") """),format.raw/*183.39*/("""{"""),format.raw/*183.40*/("""
          var og = document.createElement("OPTGROUP");
          og.setAttribute('label', dataList[key][0]);
          list1.add(og);
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/(""" else """),format.raw/*187.16*/("""{"""),format.raw/*187.17*/("""
          og.appendChild(new Option(key,key));
        """),format.raw/*189.9*/("""}"""),format.raw/*189.10*/("""
      """),format.raw/*190.7*/("""}"""),format.raw/*190.8*/("""
    """),format.raw/*191.5*/("""}"""),format.raw/*191.6*/("""
    function put_var(ID) """),format.raw/*192.26*/("""{"""),format.raw/*192.27*/("""
      var list1=document.getElementById("var"+ID);
      for (var i=list1.length-1; i>=0; i--) """),format.raw/*194.45*/("""{"""),format.raw/*194.46*/("""
      list1.remove(i);
      """),format.raw/*196.7*/("""}"""),format.raw/*196.8*/("""
      data_string =  document.getElementById("data"+ID).value;
      var varList2 = dataList[data_string][1];  
      for (var i=0; i<varList2.length; i++) """),format.raw/*199.45*/("""{"""),format.raw/*199.46*/("""
        var k = varList2[i];
        list1.add(new Option(varList[k][0],k));
      """),format.raw/*202.7*/("""}"""),format.raw/*202.8*/("""
    """),format.raw/*203.5*/("""}"""),format.raw/*203.6*/("""
    function select_var1(ID)
    """),format.raw/*205.5*/("""{"""),format.raw/*205.6*/("""
      var var_string;
      var_string = $("#var"+ID).val();
      variable = var_string;
      if (varList[var_string][2]==3) """),format.raw/*209.38*/("""{"""),format.raw/*209.39*/("""
        enable_pres1(ID);
      """),format.raw/*211.7*/("""}"""),format.raw/*211.8*/(""" else """),format.raw/*211.14*/("""{"""),format.raw/*211.15*/("""
        disable_pres1(ID);
      """),format.raw/*213.7*/("""}"""),format.raw/*213.8*/("""
    """),format.raw/*214.5*/("""}"""),format.raw/*214.6*/("""
    $(document).ready(function()"""),format.raw/*215.33*/("""{"""),format.raw/*215.34*/("""
      $("#download_data").click(function(event) """),format.raw/*216.49*/("""{"""),format.raw/*216.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*219.7*/("""}"""),format.raw/*219.8*/(""");
      $("#action1").click(function(event) """),format.raw/*220.43*/("""{"""),format.raw/*220.44*/("""
        Response = null;
        disable_download_button();
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        var url = "http://" + window.location.hostname + ":9002/svc/regridAndDownload?";
        var d1 = $("#data1").val();
        var model1 = d1.replace("/", "_");
        model1 = model1.toLowerCase();
        var arglist = "";
        arglist = arglist.concat("model=");
        arglist = arglist.concat(model1);
        var v1 = $("#var1").val();
        arglist = arglist.concat("&var=");
        arglist = arglist.concat(v1);
        var pres1 = $("#pres1").val();
        arglist = arglist.concat("&plev=");
        arglist = arglist.concat(pres1);
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
        var dlon = $("#dlon").val();
        var lat0 = $("#lat0").val();
        var lat1 = $("#lat1").val();
        var dlat = $("#dlat").val();
        var purpose = $("#purpose").val();
        arglist = arglist.concat("&lon1=");
        arglist = arglist.concat(lon0);
        arglist = arglist.concat("&lon2=");
        arglist = arglist.concat(lon1);
        arglist = arglist.concat("&dlon=");
        arglist = arglist.concat(dlon);
        arglist = arglist.concat("&lat1=");
        arglist = arglist.concat(lat0);
        arglist = arglist.concat("&lat2=");
        arglist = arglist.concat(lat1);
        arglist = arglist.concat("&dlat=");
        arglist = arglist.concat(dlat);
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
        $.ajax("""),format.raw/*277.16*/("""{"""),format.raw/*277.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*282.54*/("""{"""),format.raw/*282.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*284.44*/("""{"""),format.raw/*284.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*291.17*/("""}"""),format.raw/*291.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*299.50*/("""{"""),format.raw/*299.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*302.17*/("""}"""),format.raw/*302.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*304.51*/("""{"""),format.raw/*304.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*307.17*/("""}"""),format.raw/*307.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*308.52*/("""{"""),format.raw/*308.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*311.17*/("""}"""),format.raw/*311.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*312.52*/("""{"""),format.raw/*312.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*315.17*/("""}"""),format.raw/*315.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*316.52*/("""{"""),format.raw/*316.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*319.17*/("""}"""),format.raw/*319.18*/("""
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*321.59*/("""{"""),format.raw/*321.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*324.13*/("""}"""),format.raw/*324.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*325.49*/("""{"""),format.raw/*325.50*/("""
            """),format.raw/*326.13*/("""}"""),format.raw/*326.14*/("""
        """),format.raw/*327.9*/("""}"""),format.raw/*327.10*/(""");
        $.ajax("""),format.raw/*328.16*/("""{"""),format.raw/*328.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*333.54*/("""{"""),format.raw/*333.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*335.44*/("""{"""),format.raw/*335.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    if (text.indexOf("No Data") != -1) """),format.raw/*338.56*/("""{"""),format.raw/*338.57*/("""
                      $("#Response").html("No Data");
                      $("#data_url").html("No Data");
                      return;
                    """),format.raw/*342.21*/("""}"""),format.raw/*342.22*/("""
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*347.17*/("""}"""),format.raw/*347.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*352.13*/("""}"""),format.raw/*352.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*353.59*/("""{"""),format.raw/*353.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*356.13*/("""}"""),format.raw/*356.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*357.49*/("""{"""),format.raw/*357.50*/("""
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/("""
        """),format.raw/*359.9*/("""}"""),format.raw/*359.10*/(""");
      """),format.raw/*360.7*/("""}"""),format.raw/*360.8*/(""");
    """),format.raw/*361.5*/("""}"""),format.raw/*361.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.42*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*363.2*/(""" """),_display_(Seq[Any](/*363.4*/main("Parameters of ConfId", scripts)/*363.41*/{_display_(Seq[Any](format.raw/*363.42*/(""" """),_display_(Seq[Any](/*363.44*/flash_message())),format.raw/*363.59*/("""
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*365.46*/parameters/*365.56*/.getDataSource())),format.raw/*365.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*366.48*/parameters/*366.58*/.getVariableName())),format.raw/*366.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*367.50*/parameters/*367.60*/.getStartYearMonth())),format.raw/*367.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*368.48*/parameters/*368.58*/.getEndYearMonth())),format.raw/*368.76*/("""</div>
<div id="pressureLevel" style="display: none;">"""),_display_(Seq[Any](/*369.49*/parameters/*369.59*/.getPressureLevel())),format.raw/*369.78*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*370.44*/parameters/*370.54*/.getStartLat())),format.raw/*370.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*371.42*/parameters/*371.52*/.getEndLat())),format.raw/*371.64*/("""</div>
<div id="deltaLat" style="display: none;">"""),_display_(Seq[Any](/*372.44*/parameters/*372.54*/.getDeltaLat())),format.raw/*372.68*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*373.44*/parameters/*373.54*/.getStartLon())),format.raw/*373.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*374.42*/parameters/*374.52*/.getEndLon())),format.raw/*374.64*/("""</div>
<div id="deltaLon" style="display: none;">"""),_display_(Seq[Any](/*375.44*/parameters/*375.54*/.getDeltaLon())),format.raw/*375.68*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*376.52*/parameters/*376.62*/.getExecutionPurpose())),format.raw/*376.84*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*377.43*/parameters/*377.53*/.getDataURL())),format.raw/*377.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*378.55*/parameters/*378.65*/.getServiceResponseText())),format.raw/*378.90*/("""</div>
<table border="1" width="800" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Regrid and Download</b><br> <br> This service
				regrids a variable from a dataset according to the lat/lon/plev
				specified by the user, and mades the regridded data downloadable by
				the user. <br> <br>
			</center>
		</td>
	</tr>
	<tr>
		<td>data source:</td>
		<td><select name="data1" id="data1" onchange="put_var(1)">
		</select></td>
		<td>variable name:</td>
		<td><select name="var1" id="var1" onchange="select_var1(1)">
		</select></td>
	</tr>
	<tr>
		<td colspan=4>atmosphere pressure level (hPa), or ocean pressure
			level (dbar) <input list="plev1" id="pres1" size="50"
			value=""""),_display_(Seq[Any](/*401.12*/parameters/*401.22*/.getPressureLevel())),format.raw/*401.41*/(""""> <datalist id="plev1">
				<option value="100000,80000,50000,30000,20000,10000"></option>
				<option value="100000,30000,10000"></option>
				<option value="100000,10000"></option>
				<option value="50000,20000"></option>
			</datalist>
		</td>
	</tr>
	<tr>
		<td>start year-month: <input id="t0"
			value=""""),_display_(Seq[Any](/*411.12*/parameters/*411.22*/.getStartYearMonth())),format.raw/*411.42*/("""" alt="start" size="10" /></td>
		<td>end year-month: <input id="t1"
			value=""""),_display_(Seq[Any](/*413.12*/parameters/*413.22*/.getEndYearMonth())),format.raw/*413.40*/("""" alt="end" size="10" /></td>
		<td colspan=2></td>
	</tr>
	<tr>
		<td width="25%">start lat (deg): <input size=5 id="lat0"
			value=""""),_display_(Seq[Any](/*418.12*/parameters/*418.22*/.getStartLat())),format.raw/*418.36*/("""" /></td>
		<td width="25%">end lat (deg): <input size=5 id="lat1"
			value=""""),_display_(Seq[Any](/*420.12*/parameters/*420.22*/.getEndLat())),format.raw/*420.34*/("""" /></td>
		<td width="25%">grid size (deg): <input size=5 id="dlat"
			value=""""),_display_(Seq[Any](/*422.12*/parameters/*422.22*/.getDeltaLat())),format.raw/*422.36*/("""" /></td>
		<td></td>
	</tr>
	<tr>
		<td width="25%">start lon (deg): <input size=5 id="lon0"
			value=""""),_display_(Seq[Any](/*427.12*/parameters/*427.22*/.getStartLon())),format.raw/*427.36*/("""" /></td>
		<td width="25%">end lon (deg): <input size=5 id="lon1"
			value=""""),_display_(Seq[Any](/*429.12*/parameters/*429.22*/.getEndLon())),format.raw/*429.34*/("""" /></td>
		<td width="25%">grid size (deg): <input size=5 id="dlon"
			value=""""),_display_(Seq[Any](/*431.12*/parameters/*431.22*/.getDeltaLon())),format.raw/*431.36*/("""" /></td>
		<td></td>
	</tr>
	<tr>
		<td colspan="1">Execution purpose</td>
		<td colspan="3">
			<form>
				<textarea name="purpose" id="purpose" rows="4" cols="50">"""),_display_(Seq[Any](/*438.63*/parameters/*438.73*/.getExecutionPurpose())),format.raw/*438.95*/("""</textarea>
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input id="action1" type="submit"
			value="            Run Again            " style="height: 28px" /></td>
		<form>
			<td colspan="2" align="center"><input id="download_data"
				type="button" value="Download Data" style="height: 28px" /></td>
		</form>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea readonly id="data_url"
				cols="130" rows="2">"""),_display_(Seq[Any](/*452.26*/parameters/*452.36*/.getDataURL())),format.raw/*452.49*/("""</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea id="Response" cols="130"
				rows="6">"""),_display_(Seq[Any](/*456.15*/parameters/*456.25*/.getServiceResponseText())),format.raw/*456.50*/("""</textarea></td>
	</tr>
</table>
""")))})),format.raw/*459.2*/("""
"""))}
    }
    
    def render(parameters:metadata.RegridAndDownload): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.RegridAndDownload) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:50 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/regridAndDownload.scala.html
                    HASH: c95cdb6ed2ff0a9032c64f9d4f6046e9ada01ca3
                    MATRIX: 3209->1205|3343->1344|3358->1351|3443->1355|3494->1370|3509->1376|3571->1416|3633->1442|3648->1448|3709->1487|3794->1537|3809->1543|3876->1588|4079->1756|4094->1762|4150->1796|4235->1846|4250->1852|4303->1883|4388->1933|4403->1939|4458->1972|4543->2022|4558->2028|4615->2063|4700->2113|4715->2119|4769->2151|4920->2274|4949->2275|5248->2546|5277->2547|5336->2579|5364->2580|5396->2584|5425->2585|5511->2644|5539->2645|6004->3083|6032->3084|6090->3114|6119->3115|6278->3246|6307->3247|6376->3289|6404->3290|6474->3332|6503->3333|6572->3375|6600->3376|6670->3418|6699->3419|6768->3461|6796->3462|6866->3504|6895->3505|6964->3547|6992->3548|7063->3591|7092->3592|7161->3634|7189->3635|7265->3683|7294->3684|7363->3726|7391->3727|7464->3772|7493->3773|7562->3815|7590->3816|7662->3860|7691->3861|7760->3903|7788->3904|7857->3945|7886->3946|7955->3988|7983->3989|8056->4034|8085->4035|8154->4077|8182->4078|8255->4123|8284->4124|8354->4167|8382->4168|8458->4215|8488->4216|8559->4259|8588->4260|8660->4303|8690->4304|8761->4347|8790->4348|8862->4391|8892->4392|8963->4435|8992->4436|9063->4478|9093->4479|9164->4522|9193->4523|9264->4565|9294->4566|9365->4609|9394->4610|9469->4656|9499->4657|9570->4700|9599->4701|9671->4744|9701->4745|9772->4788|9801->4789|9873->4832|9903->4833|9974->4876|10003->4877|10074->4919|10104->4920|10175->4963|10204->4964|10276->5007|10306->5008|10377->5051|10406->5052|10477->5094|10507->5095|10578->5138|10607->5139|10677->5180|10707->5181|10778->5224|10807->5225|10878->5267|10908->5268|10979->5311|11008->5312|11083->5358|11113->5359|11184->5402|11213->5403|11248->5410|11277->5411|11336->5441|11366->5442|11700->5747|11730->5748|11819->5808|11849->5809|11946->5877|11976->5878|12011->5885|12040->5886|12073->5891|12102->5892|12170->5932|12199->5933|12309->6015|12338->6016|12409->6059|12438->6060|12549->6143|12578->6144|12642->6180|12671->6181|12807->6289|12836->6290|12899->6325|12928->6326|13042->6412|13071->6413|13126->6439|13156->6440|13269->6524|13299->6525|13367->6564|13397->6565|13568->6708|13598->6709|13633->6715|13663->6716|13747->6772|13777->6773|13812->6780|13841->6781|13874->6786|13903->6787|13958->6813|13988->6814|14113->6910|14143->6911|14201->6941|14230->6942|14416->7099|14446->7100|14558->7184|14587->7185|14620->7190|14649->7191|14711->7225|14740->7226|14897->7354|14927->7355|14988->7388|15017->7389|15052->7395|15082->7396|15144->7430|15173->7431|15206->7436|15235->7437|15297->7470|15327->7471|15405->7520|15435->7521|15549->7607|15578->7608|15652->7653|15682->7654|18117->10060|18147->10061|18341->10226|18371->10227|18477->10304|18507->10305|18835->10604|18865->10605|19268->10979|19298->10980|19462->11115|19492->11116|19624->11219|19654->11220|19848->11385|19878->11386|19959->11438|19989->11439|20225->11646|20255->11647|20336->11699|20366->11700|20602->11907|20632->11908|20713->11960|20743->11961|21043->12232|21073->12233|21115->12246|21145->12247|21234->12307|21264->12308|21372->12387|21402->12388|21481->12438|21511->12439|21553->12452|21583->12453|21620->12462|21650->12463|21697->12481|21727->12482|21911->12637|21941->12638|22047->12715|22077->12716|22261->12871|22291->12872|22479->13031|22509->13032|22738->13232|22768->13233|23004->13440|23034->13441|23123->13501|23153->13502|23289->13609|23319->13610|23398->13660|23428->13661|23470->13674|23500->13675|23537->13684|23567->13685|23604->13694|23633->13695|23668->13702|23697->13703|23753->1245|23781->1263|23847->1294|23862->1300|23924->1340|23955->13719|23993->13721|24040->13758|24080->13759|24119->13761|24157->13776|24244->13826|24264->13836|24303->13852|24394->13906|24414->13916|24455->13934|24548->13990|24568->14000|24611->14020|24702->14074|24722->14084|24763->14102|24855->14157|24875->14167|24917->14186|25004->14236|25024->14246|25061->14260|25146->14308|25166->14318|25201->14330|25288->14380|25308->14390|25345->14404|25432->14454|25452->14464|25489->14478|25574->14526|25594->14536|25629->14548|25716->14598|25736->14608|25773->14622|25868->14680|25888->14690|25933->14712|26019->14761|26039->14771|26075->14784|26173->14845|26193->14855|26241->14880|26984->15586|27004->15596|27046->15615|27395->15927|27415->15937|27458->15957|27575->16037|27595->16047|27636->16065|27808->16200|27828->16210|27865->16224|27980->16302|28000->16312|28035->16324|28152->16404|28172->16414|28209->16428|28351->16533|28371->16543|28408->16557|28523->16635|28543->16645|28578->16657|28695->16737|28715->16747|28752->16761|28956->16928|28976->16938|29021->16960|29495->17397|29515->17407|29551->17420|29700->17532|29720->17542|29768->17567|29834->17601
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|69->29|69->29|69->29|71->31|71->31|71->31|73->33|73->33|73->33|75->35|75->35|75->35|77->37|77->37|77->37|81->41|81->41|89->49|89->49|91->51|91->51|91->51|91->51|93->53|93->53|103->63|103->63|104->64|104->64|107->67|107->67|109->69|109->69|110->70|110->70|112->72|112->72|113->73|113->73|115->75|115->75|116->76|116->76|118->78|118->78|119->79|119->79|121->81|121->81|122->82|122->82|124->84|124->84|125->85|125->85|127->87|127->87|128->88|128->88|130->90|130->90|131->91|131->91|133->93|133->93|134->94|134->94|136->96|136->96|137->97|137->97|139->99|139->99|140->100|140->100|142->102|142->102|143->103|143->103|145->105|145->105|146->106|146->106|148->108|148->108|149->109|149->109|151->111|151->111|152->112|152->112|154->114|154->114|155->115|155->115|157->117|157->117|158->118|158->118|160->120|160->120|161->121|161->121|163->123|163->123|164->124|164->124|166->126|166->126|167->127|167->127|169->129|169->129|170->130|170->130|172->132|172->132|173->133|173->133|175->135|175->135|176->136|176->136|178->138|178->138|179->139|179->139|181->141|181->141|182->142|182->142|183->143|183->143|189->149|189->149|191->151|191->151|194->154|194->154|195->155|195->155|196->156|196->156|198->158|198->158|201->161|201->161|203->163|203->163|206->166|206->166|208->168|208->168|213->173|213->173|215->175|215->175|219->179|219->179|220->180|220->180|222->182|222->182|223->183|223->183|227->187|227->187|227->187|227->187|229->189|229->189|230->190|230->190|231->191|231->191|232->192|232->192|234->194|234->194|236->196|236->196|239->199|239->199|242->202|242->202|243->203|243->203|245->205|245->205|249->209|249->209|251->211|251->211|251->211|251->211|253->213|253->213|254->214|254->214|255->215|255->215|256->216|256->216|259->219|259->219|260->220|260->220|317->277|317->277|322->282|322->282|324->284|324->284|331->291|331->291|339->299|339->299|342->302|342->302|344->304|344->304|347->307|347->307|348->308|348->308|351->311|351->311|352->312|352->312|355->315|355->315|356->316|356->316|359->319|359->319|360->320|360->320|361->321|361->321|364->324|364->324|365->325|365->325|366->326|366->326|367->327|367->327|368->328|368->328|373->333|373->333|375->335|375->335|378->338|378->338|382->342|382->342|387->347|387->347|392->352|392->352|393->353|393->353|396->356|396->356|397->357|397->357|398->358|398->358|399->359|399->359|400->360|400->360|401->361|401->361|404->18|404->19|405->20|405->20|405->20|406->363|406->363|406->363|406->363|406->363|406->363|408->365|408->365|408->365|409->366|409->366|409->366|410->367|410->367|410->367|411->368|411->368|411->368|412->369|412->369|412->369|413->370|413->370|413->370|414->371|414->371|414->371|415->372|415->372|415->372|416->373|416->373|416->373|417->374|417->374|417->374|418->375|418->375|418->375|419->376|419->376|419->376|420->377|420->377|420->377|421->378|421->378|421->378|444->401|444->401|444->401|454->411|454->411|454->411|456->413|456->413|456->413|461->418|461->418|461->418|463->420|463->420|463->420|465->422|465->422|465->422|470->427|470->427|470->427|472->429|472->429|472->429|474->431|474->431|474->431|481->438|481->438|481->438|495->452|495->452|495->452|499->456|499->456|499->456|502->459
                    -- GENERATED --
                */
            