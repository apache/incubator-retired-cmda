
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
object twoDVariableMap extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.TwoDVarMap,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.TwoDVarMap):play.api.templates.HtmlFormat.Appendable = {
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
      var z=document.getElementById("download_data");
      z.disabled=false;
      changeDataSource();
      select_data();
      changeVariableName();
      select_var();
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      var selectMonths = $('#selectMonths').text();
      $('#months option:contains('+selectMonths+')').prop("""),format.raw/*46.59*/("""{"""),format.raw/*46.60*/("""selected: true"""),format.raw/*46.74*/("""}"""),format.raw/*46.75*/(""");
      select_months();
      select_monthsByPara();
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      var variableScale = $('#variableScale').text();
      if(variableScale == "0") """),format.raw/*54.32*/("""{"""),format.raw/*54.33*/("""
        $('#radioLin').prop( "checked", true );
        $('#radioLog').prop( "checked", false );
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/("""
      else """),format.raw/*58.12*/("""{"""),format.raw/*58.13*/("""
        $('#radioLin').prop( "checked", false );
        $('#radioLog').prop( "checked", true );
      """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/("""
    function changeDataSource()"""),format.raw/*68.32*/("""{"""),format.raw/*68.33*/("""
    	var dataSource = $('#dataSource').text();
     	var x = document.getElementById("data");
     	if(dataSource == "NASA_MODIS" )"""),format.raw/*71.38*/("""{"""),format.raw/*71.39*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*73.7*/("""}"""),format.raw/*73.8*/("""
     	else if(dataSource == "NASA_AMSRE" )"""),format.raw/*74.43*/("""{"""),format.raw/*74.44*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*76.7*/("""}"""),format.raw/*76.8*/("""
     	else if(dataSource == "NASA_TRMM" )"""),format.raw/*77.42*/("""{"""),format.raw/*77.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*79.7*/("""}"""),format.raw/*79.8*/("""
     	else if(dataSource == "NASA_GPCP" )"""),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*82.7*/("""}"""),format.raw/*82.8*/("""
     	else if(dataSource == "NASA_QuikSCAT" )"""),format.raw/*83.46*/("""{"""),format.raw/*83.47*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""
     	else if(dataSource == "NASA_AVISO" )"""),format.raw/*86.43*/("""{"""),format.raw/*86.44*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*88.7*/("""}"""),format.raw/*88.8*/("""
     	else if(dataSource == "NASA_GRACE" )"""),format.raw/*89.43*/("""{"""),format.raw/*89.44*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""
     	else if(dataSource == "NOAA_NODC" )"""),format.raw/*92.42*/("""{"""),format.raw/*92.43*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*94.7*/("""}"""),format.raw/*94.8*/("""
     	else if(dataSource == "NASA_CERES" )"""),format.raw/*95.43*/("""{"""),format.raw/*95.44*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
     	else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*98.46*/("""{"""),format.raw/*98.47*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*100.7*/("""}"""),format.raw/*100.8*/("""
     	else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*101.43*/("""{"""),format.raw/*101.44*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*103.7*/("""}"""),format.raw/*103.8*/("""
     	else if(dataSource == "GISS_E2-H" )"""),format.raw/*104.42*/("""{"""),format.raw/*104.43*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*106.7*/("""}"""),format.raw/*106.8*/("""
     	else if(dataSource == "GISS_E2-R" )"""),format.raw/*107.42*/("""{"""),format.raw/*107.43*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*109.7*/("""}"""),format.raw/*109.8*/("""
     	else if(dataSource == "NCAR_CAM5" )"""),format.raw/*110.42*/("""{"""),format.raw/*110.43*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*112.7*/("""}"""),format.raw/*112.8*/("""
     	else if(dataSource == "NCC_NORESM" )"""),format.raw/*113.43*/("""{"""),format.raw/*113.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*115.7*/("""}"""),format.raw/*115.8*/("""
     	else if(dataSource == "UKMO_HadGEM2-ES" )"""),format.raw/*116.48*/("""{"""),format.raw/*116.49*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*118.7*/("""}"""),format.raw/*118.8*/("""
     	else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*119.45*/("""{"""),format.raw/*119.46*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*121.7*/("""}"""),format.raw/*121.8*/("""
     	else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*122.44*/("""{"""),format.raw/*122.45*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*124.7*/("""}"""),format.raw/*124.8*/("""
     	else if(dataSource == "GFDL_CM3" )"""),format.raw/*125.41*/("""{"""),format.raw/*125.42*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*127.7*/("""}"""),format.raw/*127.8*/("""
     	else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*128.45*/("""{"""),format.raw/*128.46*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*130.7*/("""}"""),format.raw/*130.8*/("""
     	else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*131.45*/("""{"""),format.raw/*131.46*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*133.7*/("""}"""),format.raw/*133.8*/("""
     	else if(dataSource == "UKMO_HADGEM2-A" )"""),format.raw/*134.47*/("""{"""),format.raw/*134.48*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*136.7*/("""}"""),format.raw/*136.8*/("""
     	else if(dataSource == "ECMWF_interim" )"""),format.raw/*137.46*/("""{"""),format.raw/*137.47*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*139.7*/("""}"""),format.raw/*139.8*/("""
    """),format.raw/*140.5*/("""}"""),format.raw/*140.6*/("""
    function changeVariableName()"""),format.raw/*141.34*/("""{"""),format.raw/*141.35*/("""
    	var var_string = $('#variableName').text();
     	var x=document.getElementById("var");
     	if (var_string == "clt")
     		x.options[1].selected=true;
        else if (var_string == "ts")
        	x.options[2].selected=true;
        else if (var_string == "tos")
        	x.options[3].selected=true;
        else if (var_string == "pr")
        	x.options[0].selected=true;
        else if (var_string == "uas")
        	x.options[4].selected=true;
        else if (var_string == "vas")
        	x.options[5].selected=true;
        else if (var_string == "sfcWind")
        	x.options[6].selected=true;
        else if (var_string == "zos")
        	x.options[7].selected=true;
        else if (var_string == "lai")
        	x.options[8].selected=true;
        else if (var_string == "zl")
        	x.options[9].selected=true;
        else if (var_string == "zo")
        	x.options[10].selected=true;
        else if (var_string == "ohc700")
        	x.options[11].selected=true;
        else if (var_string == "ohc2000")
        	x.options[12].selected=true;
        else if (var_string == "rlds")
        	x.options[13].selected=true;
        else if (var_string == "rsds")
        	x.options[14].selected=true;
        else if (var_string == "rlus")
        	x.options[15].selected=true;
        else if (var_string == "rsus")
        	x.options[16].selected=true;
        else if (var_string == "rldscs")
        	x.options[17].selected=true;
        else if (var_string == "rsdscs")
        	x.options[18].selected=true;
        else if (var_string == "rsuscs")
        	x.options[19].selected=true;
        else if (var_string == "rsdt")
        	x.options[20].selected=true;
        else if (var_string == "rlutcs")
        	x.options[21].selected=true;
        else if (var_string == "rlut")
        	x.options[22].selected=true;
        else if (var_string == "rsutcs")
        	x.options[23].selected=true;
        else if (var_string == "rsut")
        	x.options[24].selected=true;
    """),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
    function select_monthsByPara()"""),format.raw/*195.35*/("""{"""),format.raw/*195.36*/("""
    	var monthsByPara = $('#monthsPara').text();
    	if(monthsByPara.search("jan")>-1)"""),format.raw/*197.39*/("""{"""),format.raw/*197.40*/("""
    		document.getElementById('Jan').checked = true;
    	"""),format.raw/*199.6*/("""}"""),format.raw/*199.7*/("""
    	if(monthsByPara.search("feb")>-1)"""),format.raw/*200.39*/("""{"""),format.raw/*200.40*/("""
    		document.getElementById('Feb').checked = true;
    	"""),format.raw/*202.6*/("""}"""),format.raw/*202.7*/("""
    	if(monthsByPara.search("mar")>-1)"""),format.raw/*203.39*/("""{"""),format.raw/*203.40*/("""
    		document.getElementById('Mar').checked = true;
    	"""),format.raw/*205.6*/("""}"""),format.raw/*205.7*/("""
    	if(monthsByPara.search("apr")>-1)"""),format.raw/*206.39*/("""{"""),format.raw/*206.40*/("""
    		document.getElementById('Apr').checked = true;
    	"""),format.raw/*208.6*/("""}"""),format.raw/*208.7*/("""
    	if(monthsByPara.search("may")>-1)"""),format.raw/*209.39*/("""{"""),format.raw/*209.40*/("""
    		document.getElementById('May').checked = true;
    	"""),format.raw/*211.6*/("""}"""),format.raw/*211.7*/("""
    	if(monthsByPara.search("jun")>-1)"""),format.raw/*212.39*/("""{"""),format.raw/*212.40*/("""
    		document.getElementById('Jun').checked = true;
    	"""),format.raw/*214.6*/("""}"""),format.raw/*214.7*/("""
    	if(monthsByPara.search("jul")>-1)"""),format.raw/*215.39*/("""{"""),format.raw/*215.40*/("""
    		document.getElementById('Jul').checked = true;
    	"""),format.raw/*217.6*/("""}"""),format.raw/*217.7*/("""
    	if(monthsByPara.search("aug")>-1)"""),format.raw/*218.39*/("""{"""),format.raw/*218.40*/("""
    		document.getElementById('Aug').checked = true;
    	"""),format.raw/*220.6*/("""}"""),format.raw/*220.7*/("""
    	if(monthsByPara.search("sep")>-1)"""),format.raw/*221.39*/("""{"""),format.raw/*221.40*/("""
    		document.getElementById('Sep').checked = true;
    	"""),format.raw/*223.6*/("""}"""),format.raw/*223.7*/("""
    	if(monthsByPara.search("oct")>-1)"""),format.raw/*224.39*/("""{"""),format.raw/*224.40*/("""
    		document.getElementById('Oct').checked = true;
    	"""),format.raw/*226.6*/("""}"""),format.raw/*226.7*/("""
    	if(monthsByPara.search("nov")>-1)"""),format.raw/*227.39*/("""{"""),format.raw/*227.40*/("""
    		document.getElementById('Nov').checked = true;
    	"""),format.raw/*229.6*/("""}"""),format.raw/*229.7*/("""
    	if(monthsByPara.search("dec")>-1)"""),format.raw/*230.39*/("""{"""),format.raw/*230.40*/("""
    		document.getElementById('Dec').checked = true;
    	"""),format.raw/*232.6*/("""}"""),format.raw/*232.7*/("""
    """),format.raw/*233.5*/("""}"""),format.raw/*233.6*/("""
    function disable_download_button()
    """),format.raw/*235.5*/("""{"""),format.raw/*235.6*/("""
      var x=document.getElementById("download_data");
      x.disabled = false;
    """),format.raw/*238.5*/("""}"""),format.raw/*238.6*/("""
    function enable_download_button()
    """),format.raw/*240.5*/("""{"""),format.raw/*240.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    function select_all_months()
    """),format.raw/*245.5*/("""{"""),format.raw/*245.6*/("""
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
    """),format.raw/*258.5*/("""}"""),format.raw/*258.6*/("""
    function no_month_check()
    """),format.raw/*260.5*/("""{"""),format.raw/*260.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*272.61*/("""{"""),format.raw/*272.62*/("""
           return true;
          """),format.raw/*274.11*/("""}"""),format.raw/*274.12*/("""
        else
           return false;
    """),format.raw/*277.5*/("""}"""),format.raw/*277.6*/("""
    function reset_months()
    """),format.raw/*279.5*/("""{"""),format.raw/*279.6*/("""
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
    """),format.raw/*292.5*/("""}"""),format.raw/*292.6*/("""
    function reset_vars()
    """),format.raw/*294.5*/("""{"""),format.raw/*294.6*/("""
      var x=document.getElementById("var");
      x.options[0].disabled=false;
      x.options[1].disabled=false;
      x.options[2].disabled=false;
      x.options[3].disabled=false;
      x.options[4].disabled=false;
      x.options[5].disabled=false;
      x.options[6].disabled=false;
      x.options[7].disabled=false;
      x.options[8].disabled=false;
      x.options[9].disabled=false;
      x.options[10].disabled=false;
      x.options[11].disabled=false;
      x.options[12].disabled=false;
      x.options[13].disabled=false;
      x.options[14].disabled=false;
      x.options[15].disabled=false;
      x.options[16].disabled=false;
      x.options[17].disabled=false;
      x.options[18].disabled=false;
      x.options[19].disabled=false;
      x.options[20].disabled=false;
      x.options[21].disabled=false;
      x.options[22].disabled=false;
      x.options[23].disabled=false;
      x.options[24].disabled=false;
    """),format.raw/*321.5*/("""}"""),format.raw/*321.6*/("""
    function select_var()
    """),format.raw/*323.5*/("""{"""),format.raw/*323.6*/("""
      var var_string = $("#var").val();
      disable_download_button();
      if (var_string == "Total Cloud Fraction")
        variable = "clt";
      else if (var_string == "Surface Temperature")
        variable = "ts";
      else if (var_string == "Sea Surface Temperature")
        variable = "tos";
      else if (var_string == "Precipitation Flux")
        variable = "pr";
      else if (var_string == "Eastward Near-Surface Wind")
        variable = "uas";
      else if (var_string == "Northward Near-Surface Wind")
        variable = "vas";
      else if (var_string == "Near-Surface Wind Speed")
        variable = "sfcWind";
      else if (var_string == "Sea Surface Height")
        variable = "zos";
      else if (var_string == "Leaf Area Index")
        variable = "lai";
      else if (var_string == "Equivalent Water Height Over Land")
        variable = "zl";
      else if (var_string == "Equivalent Water Height Over Ocean")
        variable = "zo";
      else if (var_string == "Ocean Heat Content Anomaly within 700 m Depth")
        variable = "ohc700";
      else if (var_string == "Ocean Heat Content Anomaly within 2000 m Depth")
        variable = "ohc2000";
      else if (var_string == "Surface Downwelling Longwave Radiation")
        variable = "rlds";
      else if (var_string == "Surface Downwelling Shortwave Radiation")
        variable = "rsds";
      else if (var_string == "Surface Upwelling Longwave Radiation")
        variable = "rlus";
      else if (var_string == "Surface Upwelling Shortwave Radiation")
        variable = "rsus";
      else if (var_string == "Surface Downwelling Clear-Sky Longwave Radiation")
        variable = "rldscs";
      else if (var_string == "Surface Downwelling Clear-Sky Shortwave Radiation")
        variable = "rsdscs";
      else if (var_string == "Surface Upwelling Clear-Sky Shortwave Radiation")
        variable = "rsuscs";
      else if (var_string == "TOA Incident Shortwave Radiation")
        variable = "rsdt";
      else if (var_string == "TOA Outgoing Clear-Sky Longwave Radiation")
        variable = "rlutcs";
      else if (var_string == "TOA Outgoing Longwave Radiation")
        variable = "rlut";
      else if (var_string == "TOA Outgoing Clear-Sky Shortwave Radiation")
        variable = "rsutcs";
      else if (var_string == "TOA Outgoing Shortwave Radiation")
        variable = "rsut";
    """),format.raw/*376.5*/("""}"""),format.raw/*376.6*/("""
    function select_data()
    """),format.raw/*378.5*/("""{"""),format.raw/*378.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      disable_download_button();
      reset_vars();
      if (data_string == "NASA/AMSRE") """),format.raw/*383.40*/("""{"""),format.raw/*383.41*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[3].selected=true;
      """),format.raw/*409.7*/("""}"""),format.raw/*409.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*410.45*/("""{"""),format.raw/*410.46*/("""
        x.options[0].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[1].selected=true;
      """),format.raw/*435.7*/("""}"""),format.raw/*435.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*436.44*/("""{"""),format.raw/*436.45*/("""
        x.options[0].selected=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
      """),format.raw/*462.7*/("""}"""),format.raw/*462.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*463.44*/("""{"""),format.raw/*463.45*/("""
        x.options[0].selected=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
      """),format.raw/*489.7*/("""}"""),format.raw/*489.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*490.48*/("""{"""),format.raw/*490.49*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[4].selected=true;
      """),format.raw/*514.7*/("""}"""),format.raw/*514.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*515.45*/("""{"""),format.raw/*515.46*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[7].selected=true;
      """),format.raw/*541.7*/("""}"""),format.raw/*541.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*542.45*/("""{"""),format.raw/*542.46*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[9].selected=true;
      """),format.raw/*567.7*/("""}"""),format.raw/*567.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*568.44*/("""{"""),format.raw/*568.45*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[11].selected=true;
      """),format.raw/*593.7*/("""}"""),format.raw/*593.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*594.45*/("""{"""),format.raw/*594.46*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[3].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].selected=true;
      """),format.raw/*609.7*/("""}"""),format.raw/*609.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*610.48*/("""{"""),format.raw/*610.49*/("""
        x.options[0].disabled=true;
        x.options[1].disabled=true;
        x.options[2].disabled=true;
        x.options[4].disabled=true;
        x.options[5].disabled=true;
        x.options[6].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[13].disabled=true;
        x.options[14].disabled=true;
        x.options[15].disabled=true;
        x.options[16].disabled=true;
        x.options[17].disabled=true;
        x.options[18].disabled=true;
        x.options[19].disabled=true;
        x.options[20].disabled=true;
        x.options[21].disabled=true;
        x.options[22].disabled=true;
        x.options[23].disabled=true;
        x.options[24].disabled=true;
        x.options[3].selected=true;
      """),format.raw/*636.7*/("""}"""),format.raw/*636.8*/("""
      else if (data_string == "CCCMA/CANAM4" || data_string == "CSIRO/MK3.6") """),format.raw/*637.79*/("""{"""),format.raw/*637.80*/("""
        x.options[3].disabled=true;
        x.options[7].disabled=true;
        x.options[8].disabled=true;
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[0].selected=true;
      """),format.raw/*646.7*/("""}"""),format.raw/*646.8*/("""
      else """),format.raw/*647.12*/("""{"""),format.raw/*647.13*/("""
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[0].selected=true;
      """),format.raw/*653.7*/("""}"""),format.raw/*653.8*/("""
      select_var();
    """),format.raw/*655.5*/("""}"""),format.raw/*655.6*/("""
    function select_months()
    """),format.raw/*657.5*/("""{"""),format.raw/*657.6*/("""
      var s1=document.getElementById("months");
      disable_download_button();
      if (s1.selectedIndex == 1) """),format.raw/*660.34*/("""{"""),format.raw/*660.35*/("""
        reset_months();
      """),format.raw/*662.7*/("""}"""),format.raw/*662.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*663.34*/("""{"""),format.raw/*663.35*/("""
        select_all_months();
      """),format.raw/*665.7*/("""}"""),format.raw/*665.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*666.34*/("""{"""),format.raw/*666.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*671.7*/("""}"""),format.raw/*671.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*672.34*/("""{"""),format.raw/*672.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*677.7*/("""}"""),format.raw/*677.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*678.34*/("""{"""),format.raw/*678.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*683.7*/("""}"""),format.raw/*683.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*684.34*/("""{"""),format.raw/*684.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*689.7*/("""}"""),format.raw/*689.8*/("""
    """),format.raw/*690.5*/("""}"""),format.raw/*690.6*/("""
    $(document).ready(function()"""),format.raw/*691.33*/("""{"""),format.raw/*691.34*/("""
      $("#download_data").click(function(event) """),format.raw/*692.49*/("""{"""),format.raw/*692.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*695.7*/("""}"""),format.raw/*695.8*/(""");
      $("#twodvarmap").click(function(event) """),format.raw/*696.46*/("""{"""),format.raw/*696.47*/("""
	Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*699.31*/("""{"""),format.raw/*699.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*703.9*/("""}"""),format.raw/*703.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/twoDimMap?";
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
        $.ajax("""),format.raw/*796.16*/("""{"""),format.raw/*796.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*801.54*/("""{"""),format.raw/*801.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*803.44*/("""{"""),format.raw/*803.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*810.17*/("""}"""),format.raw/*810.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*818.50*/("""{"""),format.raw/*818.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*821.17*/("""}"""),format.raw/*821.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*823.51*/("""{"""),format.raw/*823.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*826.17*/("""}"""),format.raw/*826.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*827.52*/("""{"""),format.raw/*827.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*830.17*/("""}"""),format.raw/*830.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*831.52*/("""{"""),format.raw/*831.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*834.17*/("""}"""),format.raw/*834.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*835.52*/("""{"""),format.raw/*835.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*838.17*/("""}"""),format.raw/*838.18*/("""
            """),format.raw/*839.13*/("""}"""),format.raw/*839.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*840.59*/("""{"""),format.raw/*840.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*843.13*/("""}"""),format.raw/*843.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*844.49*/("""{"""),format.raw/*844.50*/("""
            """),format.raw/*845.13*/("""}"""),format.raw/*845.14*/("""
        """),format.raw/*846.9*/("""}"""),format.raw/*846.10*/(""");
        $.ajax("""),format.raw/*847.16*/("""{"""),format.raw/*847.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*852.54*/("""{"""),format.raw/*852.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*854.44*/("""{"""),format.raw/*854.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*861.17*/("""}"""),format.raw/*861.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='680'/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*868.13*/("""}"""),format.raw/*868.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*869.59*/("""{"""),format.raw/*869.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*872.13*/("""}"""),format.raw/*872.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*873.49*/("""{"""),format.raw/*873.50*/("""
            """),format.raw/*874.13*/("""}"""),format.raw/*874.14*/("""
        """),format.raw/*875.9*/("""}"""),format.raw/*875.10*/(""");
      """),format.raw/*876.7*/("""}"""),format.raw/*876.8*/(""");
    """),format.raw/*877.5*/("""}"""),format.raw/*877.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.35*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*879.2*/(""" """),_display_(Seq[Any](/*879.4*/main("Service 12", scripts)/*879.31*/{_display_(Seq[Any](format.raw/*879.32*/(""" """),_display_(Seq[Any](/*879.34*/flash_message())),format.raw/*879.49*/("""
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*881.46*/parameters/*881.56*/.getDataSource())),format.raw/*881.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*882.48*/parameters/*882.58*/.getVariableName())),format.raw/*882.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*883.50*/parameters/*883.60*/.getStartYearMonth())),format.raw/*883.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*884.48*/parameters/*884.58*/.getEndYearMonth())),format.raw/*884.76*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*885.48*/parameters/*885.58*/.getSelectMonths())),format.raw/*885.76*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*886.46*/parameters/*886.56*/.getMonth())),format.raw/*886.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*887.44*/parameters/*887.54*/.getStartLat())),format.raw/*887.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*888.42*/parameters/*888.52*/.getEndLat())),format.raw/*888.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*889.44*/parameters/*889.54*/.getStartLon())),format.raw/*889.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*890.42*/parameters/*890.52*/.getEndLon())),format.raw/*890.64*/("""</div>
<div id="variableScale" style="display: none;">"""),_display_(Seq[Any](/*891.49*/parameters/*891.59*/.getVariableScale())),format.raw/*891.78*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*892.52*/parameters/*892.62*/.getExecutionPurpose())),format.raw/*892.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*893.41*/parameters/*893.51*/.getImage())),format.raw/*893.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*894.43*/parameters/*894.53*/.getDataURL())),format.raw/*894.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*895.55*/parameters/*895.65*/.getServiceResponseText())),format.raw/*895.90*/("""</div>
<table border="1" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: 2-D Variable Map</b> <br> <br> This service
				generates a map of a 2-dimensional variable with time averaging and
				spatial subsetting. <br> Select a data source (model or
				observation), a variable name, a time range, and a spatial range
				(lat-lon box) below.<br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td>data source:</td>
		<td><select name="data" , id="data" onchange="select_data()">
				<optgroup label="Observation">
					<option selected="NASA/MODIS">NASA/MODIS</option>
					<option>NASA/AMSRE</option>
					<option>NASA/TRMM</option>
					<option>NASA/GPCP</option>
					<option>NASA/QuikSCAT</option>
					<option>NASA/AVISO</option>
					<option>NASA/GRACE</option>
					<option>NOAA/NODC</option>
					<option>NASA/CERES</option>
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
				<option>Precipitation Flux</option>
				<option>Total Cloud Fraction</option>
				<option>Surface Temperature</option>
				<option>Sea Surface Temperature</option>
				<option>Eastward Near-Surface Wind</option>
				<option>Northward Near-Surface Wind</option>
				<option>Near-Surface Wind Speed</option>
				<option>Sea Surface Height</option>
				<option>Leaf Area Index</option>
				<option>Equivalent Water Height Over Land</option>
				<option>Equivalent Water Height Over Ocean</option>
				<option>Ocean Heat Content Anomaly within 700 m Depth</option>
				<option>Ocean Heat Content Anomaly within 2000 m Depth</option>
				<option>Surface Downwelling Longwave Radiation</option>
				<option>Surface Downwelling Shortwave Radiation</option>
				<option>Surface Upwelling Longwave Radiation</option>
				<option>Surface Upwelling Shortwave Radiation</option>
				<option>Surface Downwelling Clear-Sky Longwave Radiation</option>
				<option>Surface Downwelling Clear-Sky Shortwave Radiation</option>
				<option>Surface Upwelling Clear-Sky Shortwave Radiation</option>
				<option>TOA Incident Shortwave Radiation</option>
				<option>TOA Outgoing Longwave Radiation</option>
				<option>TOA Outgoing Shortwave Radiation</option>
				<option>TOA Outgoing Clear-Sky Longwave Radiation</option>
				<option>TOA Outgoing Clear-Sky Shortwave Radiation</option>
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
		<td></td>
		<td>
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
""")))})),format.raw/*1068.2*/("""
"""))}
    }
    
    def render(parameters:metadata.TwoDVarMap): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.TwoDVarMap) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/twoDVariableMap.scala.html
                    HASH: a9bd11a9ad2b9f971694e8895cf3a8a976f8f3c9
                    MATRIX: 3200->1205|3327->1337|3342->1344|3427->1348|3478->1363|3493->1369|3555->1409|3617->1435|3632->1441|3693->1480|3778->1530|3793->1536|3860->1581|4064->1750|4079->1756|4135->1790|4220->1840|4235->1846|4291->1880|4439->2000|4468->2001|4876->2381|4905->2382|4947->2396|4976->2397|5320->2713|5349->2714|5480->2818|5508->2819|5548->2831|5577->2832|5708->2936|5736->2937|6039->3213|6067->3214|6127->3246|6156->3247|6316->3379|6345->3380|6414->3422|6442->3423|6513->3466|6542->3467|6611->3509|6639->3510|6709->3552|6738->3553|6807->3595|6835->3596|6905->3638|6934->3639|7003->3681|7031->3682|7105->3728|7134->3729|7203->3771|7231->3772|7302->3815|7331->3816|7400->3858|7428->3859|7499->3902|7528->3903|7597->3945|7625->3946|7695->3988|7724->3989|7793->4031|7821->4032|7892->4075|7921->4076|7990->4118|8018->4119|8092->4165|8121->4166|8191->4208|8220->4209|8292->4252|8322->4253|8393->4296|8422->4297|8493->4339|8523->4340|8594->4383|8623->4384|8694->4426|8724->4427|8795->4470|8824->4471|8895->4513|8925->4514|8996->4557|9025->4558|9097->4601|9127->4602|9198->4645|9227->4646|9304->4694|9334->4695|9405->4738|9434->4739|9508->4784|9538->4785|9609->4828|9638->4829|9711->4873|9741->4874|9812->4917|9841->4918|9911->4959|9941->4960|10012->5003|10041->5004|10115->5049|10145->5050|10216->5093|10245->5094|10319->5139|10349->5140|10420->5183|10449->5184|10525->5231|10555->5232|10626->5275|10655->5276|10730->5322|10760->5323|10831->5366|10860->5367|10893->5372|10922->5373|10985->5407|11015->5408|13051->7416|13080->7417|13144->7452|13174->7453|13291->7541|13321->7542|13408->7601|13437->7602|13505->7641|13535->7642|13622->7701|13651->7702|13719->7741|13749->7742|13836->7801|13865->7802|13933->7841|13963->7842|14050->7901|14079->7902|14147->7941|14177->7942|14264->8001|14293->8002|14361->8041|14391->8042|14478->8101|14507->8102|14575->8141|14605->8142|14692->8201|14721->8202|14789->8241|14819->8242|14906->8301|14935->8302|15003->8341|15033->8342|15120->8401|15149->8402|15217->8441|15247->8442|15334->8501|15363->8502|15431->8541|15461->8542|15548->8601|15577->8602|15645->8641|15675->8642|15762->8701|15791->8702|15824->8707|15853->8708|15925->8752|15954->8753|16067->8838|16096->8839|16167->8882|16196->8883|16307->8966|16336->8967|16402->9005|16431->9006|17124->9671|17153->9672|17216->9707|17245->9708|18018->10452|18048->10453|18112->10488|18142->10489|18213->10532|18242->10533|18303->10566|18332->10567|19037->11244|19066->11245|19125->11276|19154->11277|20121->12216|20150->12217|20209->12248|20238->12249|22662->14645|22691->14646|22751->14678|22780->14679|22988->14858|23018->14859|23968->15781|23997->15782|24071->15827|24101->15828|25015->16714|25044->16715|25117->16759|25147->16760|26097->17682|26126->17683|26199->17727|26229->17728|27179->18650|27208->18651|27285->18699|27315->18700|28193->19550|28222->19551|28296->19596|28326->19597|29276->20519|29305->20520|29379->20565|29409->20566|30322->21451|30351->21452|30424->21496|30454->21497|31367->22382|31396->22383|31470->22428|31500->22429|32043->22944|32072->22945|32149->22993|32179->22994|33129->23916|33158->23917|33266->23996|33296->23997|33622->24295|33651->24296|33692->24308|33722->24309|33940->24499|33969->24500|34022->24525|34051->24526|34113->24560|34142->24561|34286->24676|34316->24677|34375->24708|34404->24709|34467->24743|34497->24744|34561->24780|34590->24781|34653->24815|34683->24816|34907->25012|34936->25013|34999->25047|35029->25048|35253->25244|35282->25245|35345->25279|35375->25280|35599->25476|35628->25477|35691->25511|35721->25512|35945->25708|35974->25709|36007->25714|36036->25715|36098->25748|36128->25749|36206->25798|36236->25799|36350->25885|36379->25886|36456->25934|36486->25935|36599->26019|36629->26020|36793->26156|36823->26157|40781->30086|40811->30087|41005->30252|41035->30253|41141->30330|41171->30331|41499->30630|41529->30631|41932->31005|41962->31006|42126->31141|42156->31142|42288->31245|42318->31246|42512->31411|42542->31412|42623->31464|42653->31465|42889->31672|42919->31673|43000->31725|43030->31726|43266->31933|43296->31934|43377->31986|43407->31987|43707->32258|43737->32259|43779->32272|43809->32273|43898->32333|43928->32334|44036->32413|44066->32414|44145->32464|44175->32465|44217->32478|44247->32479|44284->32488|44314->32489|44361->32507|44391->32508|44575->32663|44605->32664|44711->32741|44741->32742|45069->33041|45099->33042|45445->33359|45475->33360|45564->33420|45594->33421|45702->33500|45732->33501|45811->33551|45841->33552|45883->33565|45913->33566|45950->33575|45980->33576|46017->33585|46046->33586|46081->33593|46110->33594|46166->1238|46194->1256|46260->1287|46275->1293|46337->1333|46368->33610|46406->33612|46443->33639|46483->33640|46522->33642|46560->33657|46647->33707|46667->33717|46706->33733|46797->33787|46817->33797|46858->33815|46951->33871|46971->33881|47014->33901|47105->33955|47125->33965|47166->33983|47257->34037|47277->34047|47318->34065|47407->34117|47427->34127|47461->34138|47548->34188|47568->34198|47605->34212|47690->34260|47710->34270|47745->34282|47832->34332|47852->34342|47889->34356|47974->34404|47994->34414|48029->34426|48121->34481|48141->34491|48183->34510|48278->34568|48298->34578|48343->34600|48427->34647|48447->34657|48481->34668|48567->34717|48587->34727|48623->34740|48721->34801|48741->34811|48789->34836|55003->41017
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|70->30|70->30|70->30|72->32|72->32|72->32|76->36|76->36|86->46|86->46|86->46|86->46|94->54|94->54|97->57|97->57|98->58|98->58|101->61|101->61|107->67|107->67|108->68|108->68|111->71|111->71|113->73|113->73|114->74|114->74|116->76|116->76|117->77|117->77|119->79|119->79|120->80|120->80|122->82|122->82|123->83|123->83|125->85|125->85|126->86|126->86|128->88|128->88|129->89|129->89|131->91|131->91|132->92|132->92|134->94|134->94|135->95|135->95|137->97|137->97|138->98|138->98|140->100|140->100|141->101|141->101|143->103|143->103|144->104|144->104|146->106|146->106|147->107|147->107|149->109|149->109|150->110|150->110|152->112|152->112|153->113|153->113|155->115|155->115|156->116|156->116|158->118|158->118|159->119|159->119|161->121|161->121|162->122|162->122|164->124|164->124|165->125|165->125|167->127|167->127|168->128|168->128|170->130|170->130|171->131|171->131|173->133|173->133|174->134|174->134|176->136|176->136|177->137|177->137|179->139|179->139|180->140|180->140|181->141|181->141|234->194|234->194|235->195|235->195|237->197|237->197|239->199|239->199|240->200|240->200|242->202|242->202|243->203|243->203|245->205|245->205|246->206|246->206|248->208|248->208|249->209|249->209|251->211|251->211|252->212|252->212|254->214|254->214|255->215|255->215|257->217|257->217|258->218|258->218|260->220|260->220|261->221|261->221|263->223|263->223|264->224|264->224|266->226|266->226|267->227|267->227|269->229|269->229|270->230|270->230|272->232|272->232|273->233|273->233|275->235|275->235|278->238|278->238|280->240|280->240|283->243|283->243|285->245|285->245|298->258|298->258|300->260|300->260|312->272|312->272|314->274|314->274|317->277|317->277|319->279|319->279|332->292|332->292|334->294|334->294|361->321|361->321|363->323|363->323|416->376|416->376|418->378|418->378|423->383|423->383|449->409|449->409|450->410|450->410|475->435|475->435|476->436|476->436|502->462|502->462|503->463|503->463|529->489|529->489|530->490|530->490|554->514|554->514|555->515|555->515|581->541|581->541|582->542|582->542|607->567|607->567|608->568|608->568|633->593|633->593|634->594|634->594|649->609|649->609|650->610|650->610|676->636|676->636|677->637|677->637|686->646|686->646|687->647|687->647|693->653|693->653|695->655|695->655|697->657|697->657|700->660|700->660|702->662|702->662|703->663|703->663|705->665|705->665|706->666|706->666|711->671|711->671|712->672|712->672|717->677|717->677|718->678|718->678|723->683|723->683|724->684|724->684|729->689|729->689|730->690|730->690|731->691|731->691|732->692|732->692|735->695|735->695|736->696|736->696|739->699|739->699|743->703|743->703|836->796|836->796|841->801|841->801|843->803|843->803|850->810|850->810|858->818|858->818|861->821|861->821|863->823|863->823|866->826|866->826|867->827|867->827|870->830|870->830|871->831|871->831|874->834|874->834|875->835|875->835|878->838|878->838|879->839|879->839|880->840|880->840|883->843|883->843|884->844|884->844|885->845|885->845|886->846|886->846|887->847|887->847|892->852|892->852|894->854|894->854|901->861|901->861|908->868|908->868|909->869|909->869|912->872|912->872|913->873|913->873|914->874|914->874|915->875|915->875|916->876|916->876|917->877|917->877|920->18|920->19|921->20|921->20|921->20|922->879|922->879|922->879|922->879|922->879|922->879|924->881|924->881|924->881|925->882|925->882|925->882|926->883|926->883|926->883|927->884|927->884|927->884|928->885|928->885|928->885|929->886|929->886|929->886|930->887|930->887|930->887|931->888|931->888|931->888|932->889|932->889|932->889|933->890|933->890|933->890|934->891|934->891|934->891|935->892|935->892|935->892|936->893|936->893|936->893|937->894|937->894|937->894|938->895|938->895|938->895|1111->1068
                    -- GENERATED --
                */
            