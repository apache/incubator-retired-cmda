
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
object twoDVariableTimeSeries extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.TwoDVarTimeSeries,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.TwoDVarTimeSeries):play.api.templates.HtmlFormat.Appendable = {
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
        var method =  """),_display_(Seq[Any](/*36.24*/parameters/*36.34*/.getVariableScale)),format.raw/*36.51*/(""";
    window.onload = function() """),format.raw/*37.32*/("""{"""),format.raw/*37.33*/("""
      changeDataSource();
      select_data();
      changeVariableName();
      select_var();
      disable_download_button();
    var variableScale = $('#variableScale').text();
    if(variableScale == "0") """),format.raw/*44.30*/("""{"""),format.raw/*44.31*/("""
      $('#radioLin').prop( "checked", true );
      $('#radioLog').prop( "checked", false );
    """),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""
    else """),format.raw/*48.10*/("""{"""),format.raw/*48.11*/("""
      $('#radioLin').prop( "checked", false );
      $('#radioLog').prop( "checked", true );
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""
    $('#purpose').html($('#executionPurpose').text());
    var imageUrl = $('#image').text();
    $('#Image').html('<img src="'+imageUrl+'" width=680 />');
    $('#data_url').html($('#dataURL').text());
    $('#Response').html($('serviceResponseText').text());
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
    function changeDataSource()"""),format.raw/*58.32*/("""{"""),format.raw/*58.33*/("""
    var dataSource = $('#dataSource').text();
    var x = document.getElementById("data");
    if(dataSource == "NASA_MODIS" )"""),format.raw/*61.36*/("""{"""),format.raw/*61.37*/("""
    x.options[0].selected=true;
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
    else if(dataSource == "NASA_AMSRE" )"""),format.raw/*64.41*/("""{"""),format.raw/*64.42*/("""
    x.options[1].selected=true;
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""
    else if(dataSource == "NASA_TRMM" )"""),format.raw/*67.40*/("""{"""),format.raw/*67.41*/("""
    x.options[2].selected=true;
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/("""
    else if(dataSource == "NASA_GPCP" )"""),format.raw/*70.40*/("""{"""),format.raw/*70.41*/("""
    x.options[3].selected=true;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
    else if(dataSource == "NASA_QuikSCAT" )"""),format.raw/*73.44*/("""{"""),format.raw/*73.45*/("""
    x.options[4].selected=true;
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""
    else if(dataSource == "NASA_AVISO" )"""),format.raw/*76.41*/("""{"""),format.raw/*76.42*/("""
    x.options[5].selected=true;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""
    else if(dataSource == "NASA_GRACE" )"""),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
    x.options[6].selected=true;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
    else if(dataSource == "NOAA_NODC" )"""),format.raw/*82.40*/("""{"""),format.raw/*82.41*/("""
    x.options[7].selected=true;
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""
    else if(dataSource == "NASA_CERES" )"""),format.raw/*85.41*/("""{"""),format.raw/*85.42*/("""
    x.options[8].selected=true;
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/("""
    else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*88.44*/("""{"""),format.raw/*88.45*/("""
    x.options[9].selected=true;
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""
    else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*91.41*/("""{"""),format.raw/*91.42*/("""
    x.options[10].selected=true;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""
    else if(dataSource == "GISS_E2-H" )"""),format.raw/*94.40*/("""{"""),format.raw/*94.41*/("""
    x.options[11].selected=true;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
    else if(dataSource == "GISS_E2-R" )"""),format.raw/*97.40*/("""{"""),format.raw/*97.41*/("""
    x.options[12].selected=true;
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""
    else if(dataSource == "NCAR_CAM5" )"""),format.raw/*100.40*/("""{"""),format.raw/*100.41*/("""
    x.options[13].selected=true;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""
    else if(dataSource == "NCC_NORESM" )"""),format.raw/*103.41*/("""{"""),format.raw/*103.42*/("""
    x.options[14].selected=true;
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/("""
    else if(dataSource == "UKMO_HadGEM2-ES" )"""),format.raw/*106.46*/("""{"""),format.raw/*106.47*/("""
    x.options[15].selected=true;
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
    else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*109.43*/("""{"""),format.raw/*109.44*/("""
    x.options[16].selected=true;
    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""
    else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
    x.options[17].selected=true;
    """),format.raw/*114.5*/("""}"""),format.raw/*114.6*/("""
    else if(dataSource == "GFDL_CM3" )"""),format.raw/*115.39*/("""{"""),format.raw/*115.40*/("""
    x.options[18].selected=true;
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/("""
    else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*118.43*/("""{"""),format.raw/*118.44*/("""
    x.options[19].selected=true;
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
    else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*121.43*/("""{"""),format.raw/*121.44*/("""
    x.options[20].selected=true;
    """),format.raw/*123.5*/("""}"""),format.raw/*123.6*/("""
    else if(dataSource == "UKMO_HADGEM2-A" )"""),format.raw/*124.45*/("""{"""),format.raw/*124.46*/("""
    x.options[21].selected=true;
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/("""
    else if(dataSource == "ECMWF_interim" )"""),format.raw/*127.44*/("""{"""),format.raw/*127.45*/("""
    x.options[22].selected=true;
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""
    """),format.raw/*130.5*/("""}"""),format.raw/*130.6*/("""
    function changeVariableName()"""),format.raw/*131.34*/("""{"""),format.raw/*131.35*/("""
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
    """),format.raw/*184.5*/("""}"""),format.raw/*184.6*/("""
    function disable_download_button()
    """),format.raw/*186.5*/("""{"""),format.raw/*186.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*189.5*/("""}"""),format.raw/*189.6*/("""
    function enable_download_button()
    """),format.raw/*191.5*/("""{"""),format.raw/*191.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""         
    function reset_vars()
    """),format.raw/*196.5*/("""{"""),format.raw/*196.6*/("""
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
    """),format.raw/*223.5*/("""}"""),format.raw/*223.6*/("""
    function select_var()
    """),format.raw/*225.5*/("""{"""),format.raw/*225.6*/("""
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
    """),format.raw/*278.5*/("""}"""),format.raw/*278.6*/("""
    function select_data()
    """),format.raw/*280.5*/("""{"""),format.raw/*280.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      disable_download_button();
      reset_vars();
      if (data_string == "NASA/AMSRE") """),format.raw/*285.40*/("""{"""),format.raw/*285.41*/("""
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
      """),format.raw/*311.7*/("""}"""),format.raw/*311.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*312.45*/("""{"""),format.raw/*312.46*/("""
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
      """),format.raw/*337.7*/("""}"""),format.raw/*337.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*338.44*/("""{"""),format.raw/*338.45*/("""
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
      """),format.raw/*364.7*/("""}"""),format.raw/*364.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*365.44*/("""{"""),format.raw/*365.45*/("""
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
      """),format.raw/*391.7*/("""}"""),format.raw/*391.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*392.48*/("""{"""),format.raw/*392.49*/("""
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
      """),format.raw/*416.7*/("""}"""),format.raw/*416.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*417.45*/("""{"""),format.raw/*417.46*/("""
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
      """),format.raw/*443.7*/("""}"""),format.raw/*443.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*444.45*/("""{"""),format.raw/*444.46*/("""
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
      """),format.raw/*469.7*/("""}"""),format.raw/*469.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*470.44*/("""{"""),format.raw/*470.45*/("""
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
      """),format.raw/*495.7*/("""}"""),format.raw/*495.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*496.45*/("""{"""),format.raw/*496.46*/("""
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
      """),format.raw/*511.7*/("""}"""),format.raw/*511.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*512.48*/("""{"""),format.raw/*512.49*/("""
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
      """),format.raw/*538.7*/("""}"""),format.raw/*538.8*/("""
      else """),format.raw/*539.12*/("""{"""),format.raw/*539.13*/("""
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[0].selected=true;
      """),format.raw/*545.7*/("""}"""),format.raw/*545.8*/("""
      select_var();
    """),format.raw/*547.5*/("""}"""),format.raw/*547.6*/("""
    $(document).ready(function()"""),format.raw/*548.33*/("""{"""),format.raw/*548.34*/("""
      $("#download_data").click(function(event) """),format.raw/*549.49*/("""{"""),format.raw/*549.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*552.7*/("""}"""),format.raw/*552.8*/(""");
      $("#timeSeries2D").click(function(event) """),format.raw/*553.48*/("""{"""),format.raw/*553.49*/("""
        Response = null;
        disable_download_button();
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/timeSeries2D?";
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
        arglist = arglist.concat("&scale=");
        var y = document.getElementById("radioLin").checked;
        if (y == true)
          arglist = arglist.concat('0');
        else
          arglist = arglist.concat('2');
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
        $.ajax("""),format.raw/*607.16*/("""{"""),format.raw/*607.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*612.54*/("""{"""),format.raw/*612.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*614.44*/("""{"""),format.raw/*614.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*621.17*/("""}"""),format.raw/*621.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*629.50*/("""{"""),format.raw/*629.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*632.17*/("""}"""),format.raw/*632.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*634.51*/("""{"""),format.raw/*634.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*637.17*/("""}"""),format.raw/*637.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*638.52*/("""{"""),format.raw/*638.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*641.17*/("""}"""),format.raw/*641.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*642.52*/("""{"""),format.raw/*642.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*645.17*/("""}"""),format.raw/*645.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*646.52*/("""{"""),format.raw/*646.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*649.17*/("""}"""),format.raw/*649.18*/("""
            """),format.raw/*650.13*/("""}"""),format.raw/*650.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*651.59*/("""{"""),format.raw/*651.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*654.13*/("""}"""),format.raw/*654.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*655.49*/("""{"""),format.raw/*655.50*/("""
            """),format.raw/*656.13*/("""}"""),format.raw/*656.14*/("""
        """),format.raw/*657.9*/("""}"""),format.raw/*657.10*/(""");
        $.ajax("""),format.raw/*658.16*/("""{"""),format.raw/*658.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*663.54*/("""{"""),format.raw/*663.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*665.44*/("""{"""),format.raw/*665.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*672.17*/("""}"""),format.raw/*672.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='820'/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*679.13*/("""}"""),format.raw/*679.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*680.59*/("""{"""),format.raw/*680.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*683.13*/("""}"""),format.raw/*683.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*684.49*/("""{"""),format.raw/*684.50*/("""
            """),format.raw/*685.13*/("""}"""),format.raw/*685.14*/("""
        """),format.raw/*686.9*/("""}"""),format.raw/*686.10*/(""");
      """),format.raw/*687.7*/("""}"""),format.raw/*687.8*/(""");
    """),format.raw/*688.5*/("""}"""),format.raw/*688.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.42*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*690.2*/(""" """),_display_(Seq[Any](/*690.4*/main("Parameters of ConfId", scripts)/*690.41*/{_display_(Seq[Any](format.raw/*690.42*/(""" """),_display_(Seq[Any](/*690.44*/flash_message())),format.raw/*690.59*/("""
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*692.46*/parameters/*692.56*/.getDataSource())),format.raw/*692.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*693.48*/parameters/*693.58*/.getVariableName())),format.raw/*693.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*694.50*/parameters/*694.60*/.getStartYearMonth())),format.raw/*694.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*695.48*/parameters/*695.58*/.getEndYearMonth())),format.raw/*695.76*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*696.44*/parameters/*696.54*/.getStartLat())),format.raw/*696.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*697.42*/parameters/*697.52*/.getEndLat())),format.raw/*697.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*698.44*/parameters/*698.54*/.getStartLon())),format.raw/*698.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*699.42*/parameters/*699.52*/.getEndLon())),format.raw/*699.64*/("""</div>
<div id="variableScale" style="display: none;">"""),_display_(Seq[Any](/*700.49*/parameters/*700.59*/.getVariableScale())),format.raw/*700.78*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*701.52*/parameters/*701.62*/.getExecutionPurpose())),format.raw/*701.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*702.41*/parameters/*702.51*/.getImage())),format.raw/*702.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*703.43*/parameters/*703.53*/.getDataURL())),format.raw/*703.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*704.55*/parameters/*704.65*/.getServiceResponseText())),format.raw/*704.90*/("""</div>
<table border="1" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: 2-D Variable Time Series</b><br> <br> This
				service generates a graph of a 2-dimensional variable's time series
				with monthly averaged values. <br> Select a data source (model
				or observation), a variable name, a time range, and a spatial range
				below.<br> <br>
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
		<td><input id="t0" value="""),_display_(Seq[Any](/*783.29*/parameters/*783.39*/.getStartYearMonth())),format.raw/*783.59*/("""
			alt="start" /></td>
		<td>end year-month:</td>
		<td><input id="t1" value="""),_display_(Seq[Any](/*786.29*/parameters/*786.39*/.getEndYearMonth())),format.raw/*786.57*/(""" alt="end" /></td>
	</tr>
	<tr>
		<td>start lat (deg):</td>
		<td><input id="lat0" value="""),_display_(Seq[Any](/*790.31*/parameters/*790.41*/.getStartLat())),format.raw/*790.55*/("""></td>
		<td>end lat (deg):</td>
		<td><input id="lat1" value="""),_display_(Seq[Any](/*792.31*/parameters/*792.41*/.getEndLat())),format.raw/*792.53*/("""></td>
	</tr>
	<tr>
		<td>start lon (deg):</td>
		<td><input id="lon0" value="""),_display_(Seq[Any](/*796.31*/parameters/*796.41*/.getStartLon())),format.raw/*796.55*/("""></td>
		<td>end lon (deg):</td>
		<td><input id="lon1" value="""),_display_(Seq[Any](/*798.31*/parameters/*798.41*/.getEndLon())),format.raw/*798.53*/("""></td>
	</tr>
	<tr>
		<td colspan="1">variable scale:</td>
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
		<td colspan="2" align="center"><input id="timeSeries2D"
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
""")))})),format.raw/*842.2*/("""
"""))}
    }
    
    def render(parameters:metadata.TwoDVarTimeSeries): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.TwoDVarTimeSeries) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:51 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/twoDVariableTimeSeries.scala.html
                    HASH: 6f66e95fd4f648197b4078818595806de1e6b464
                    MATRIX: 3214->1205|3348->1344|3363->1351|3448->1355|3499->1370|3514->1376|3576->1416|3638->1442|3653->1448|3714->1487|3799->1537|3814->1543|3881->1588|4085->1757|4100->1763|4156->1797|4241->1847|4256->1853|4312->1887|4460->1999|4479->2009|4518->2026|4579->2059|4608->2060|4846->2270|4875->2271|5000->2369|5028->2370|5066->2380|5095->2381|5220->2479|5248->2480|5541->2746|5569->2747|5629->2779|5658->2780|5813->2907|5842->2908|5906->2945|5934->2946|6003->2987|6032->2988|6096->3025|6124->3026|6192->3066|6221->3067|6285->3104|6313->3105|6381->3145|6410->3146|6474->3183|6502->3184|6574->3228|6603->3229|6667->3266|6695->3267|6764->3308|6793->3309|6857->3346|6885->3347|6954->3388|6983->3389|7047->3426|7075->3427|7143->3467|7172->3468|7236->3505|7264->3506|7333->3547|7362->3548|7426->3585|7454->3586|7526->3630|7555->3631|7619->3668|7647->3669|7716->3710|7745->3711|7810->3749|7838->3750|7906->3790|7935->3791|8000->3829|8028->3830|8096->3870|8125->3871|8190->3909|8218->3910|8287->3950|8317->3951|8383->3989|8412->3990|8482->4031|8512->4032|8578->4070|8607->4071|8682->4117|8712->4118|8778->4156|8807->4157|8879->4200|8909->4201|8975->4239|9004->4240|9075->4282|9105->4283|9171->4321|9200->4322|9268->4361|9298->4362|9364->4400|9393->4401|9465->4444|9495->4445|9561->4483|9590->4484|9662->4527|9692->4528|9758->4566|9787->4567|9861->4612|9891->4613|9957->4651|9986->4652|10059->4696|10089->4697|10155->4735|10184->4736|10217->4741|10246->4742|10309->4776|10339->4777|12151->6561|12180->6562|12252->6606|12281->6607|12392->6690|12421->6691|12492->6734|12521->6735|12632->6818|12661->6819|12729->6859|12758->6860|13725->7799|13754->7800|13813->7831|13842->7832|16266->10228|16295->10229|16355->10261|16384->10262|16592->10441|16622->10442|17572->11364|17601->11365|17675->11410|17705->11411|18619->12297|18648->12298|18721->12342|18751->12343|19701->13265|19730->13266|19803->13310|19833->13311|20783->14233|20812->14234|20889->14282|20919->14283|21797->15133|21826->15134|21900->15179|21930->15180|22880->16102|22909->16103|22983->16148|23013->16149|23926->17034|23955->17035|24028->17079|24058->17080|24971->17965|25000->17966|25074->18011|25104->18012|25647->18527|25676->18528|25753->18576|25783->18577|26733->19499|26762->19500|26803->19512|26833->19513|27051->19703|27080->19704|27133->19729|27162->19730|27224->19763|27254->19764|27332->19813|27362->19814|27476->19900|27505->19901|27584->19951|27614->19952|29896->22205|29926->22206|30120->22371|30150->22372|30256->22449|30286->22450|30614->22749|30644->22750|31047->23124|31077->23125|31241->23260|31271->23261|31403->23364|31433->23365|31627->23530|31657->23531|31738->23583|31768->23584|32004->23791|32034->23792|32115->23844|32145->23845|32381->24052|32411->24053|32492->24105|32522->24106|32822->24377|32852->24378|32894->24391|32924->24392|33013->24452|33043->24453|33151->24532|33181->24533|33260->24583|33290->24584|33332->24597|33362->24598|33399->24607|33429->24608|33476->24626|33506->24627|33690->24782|33720->24783|33826->24860|33856->24861|34184->25160|34214->25161|34560->25478|34590->25479|34679->25539|34709->25540|34845->25647|34875->25648|34954->25698|34984->25699|35026->25712|35056->25713|35093->25722|35123->25723|35160->25732|35189->25733|35224->25740|35253->25741|35309->1245|35337->1263|35403->1294|35418->1300|35480->1340|35511->25757|35549->25759|35596->25796|35636->25797|35675->25799|35713->25814|35800->25864|35820->25874|35859->25890|35950->25944|35970->25954|36011->25972|36104->26028|36124->26038|36167->26058|36258->26112|36278->26122|36319->26140|36406->26190|36426->26200|36463->26214|36548->26262|36568->26272|36603->26284|36690->26334|36710->26344|36747->26358|36832->26406|36852->26416|36887->26428|36979->26483|36999->26493|37041->26512|37136->26570|37156->26580|37201->26602|37285->26649|37305->26659|37339->26670|37425->26719|37445->26729|37481->26742|37579->26803|37599->26813|37647->26838|40741->29895|40761->29905|40804->29925|40920->30004|40940->30014|40981->30032|41108->30122|41128->30132|41165->30146|41265->30209|41285->30219|41320->30231|41435->30309|41455->30319|41492->30333|41592->30396|41612->30406|41647->30418|42821->31560
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|70->30|70->30|70->30|72->32|72->32|72->32|76->36|76->36|76->36|77->37|77->37|84->44|84->44|87->47|87->47|88->48|88->48|91->51|91->51|97->57|97->57|98->58|98->58|101->61|101->61|103->63|103->63|104->64|104->64|106->66|106->66|107->67|107->67|109->69|109->69|110->70|110->70|112->72|112->72|113->73|113->73|115->75|115->75|116->76|116->76|118->78|118->78|119->79|119->79|121->81|121->81|122->82|122->82|124->84|124->84|125->85|125->85|127->87|127->87|128->88|128->88|130->90|130->90|131->91|131->91|133->93|133->93|134->94|134->94|136->96|136->96|137->97|137->97|139->99|139->99|140->100|140->100|142->102|142->102|143->103|143->103|145->105|145->105|146->106|146->106|148->108|148->108|149->109|149->109|151->111|151->111|152->112|152->112|154->114|154->114|155->115|155->115|157->117|157->117|158->118|158->118|160->120|160->120|161->121|161->121|163->123|163->123|164->124|164->124|166->126|166->126|167->127|167->127|169->129|169->129|170->130|170->130|171->131|171->131|224->184|224->184|226->186|226->186|229->189|229->189|231->191|231->191|234->194|234->194|236->196|236->196|263->223|263->223|265->225|265->225|318->278|318->278|320->280|320->280|325->285|325->285|351->311|351->311|352->312|352->312|377->337|377->337|378->338|378->338|404->364|404->364|405->365|405->365|431->391|431->391|432->392|432->392|456->416|456->416|457->417|457->417|483->443|483->443|484->444|484->444|509->469|509->469|510->470|510->470|535->495|535->495|536->496|536->496|551->511|551->511|552->512|552->512|578->538|578->538|579->539|579->539|585->545|585->545|587->547|587->547|588->548|588->548|589->549|589->549|592->552|592->552|593->553|593->553|647->607|647->607|652->612|652->612|654->614|654->614|661->621|661->621|669->629|669->629|672->632|672->632|674->634|674->634|677->637|677->637|678->638|678->638|681->641|681->641|682->642|682->642|685->645|685->645|686->646|686->646|689->649|689->649|690->650|690->650|691->651|691->651|694->654|694->654|695->655|695->655|696->656|696->656|697->657|697->657|698->658|698->658|703->663|703->663|705->665|705->665|712->672|712->672|719->679|719->679|720->680|720->680|723->683|723->683|724->684|724->684|725->685|725->685|726->686|726->686|727->687|727->687|728->688|728->688|731->18|731->19|732->20|732->20|732->20|733->690|733->690|733->690|733->690|733->690|733->690|735->692|735->692|735->692|736->693|736->693|736->693|737->694|737->694|737->694|738->695|738->695|738->695|739->696|739->696|739->696|740->697|740->697|740->697|741->698|741->698|741->698|742->699|742->699|742->699|743->700|743->700|743->700|744->701|744->701|744->701|745->702|745->702|745->702|746->703|746->703|746->703|747->704|747->704|747->704|826->783|826->783|826->783|829->786|829->786|829->786|833->790|833->790|833->790|835->792|835->792|835->792|839->796|839->796|839->796|841->798|841->798|841->798|885->842
                    -- GENERATED --
                */
            