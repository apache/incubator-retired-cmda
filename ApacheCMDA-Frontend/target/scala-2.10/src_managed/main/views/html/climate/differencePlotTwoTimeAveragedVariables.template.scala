
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
object differencePlotTwoTimeAveragedVariables extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.DiffPlotTwoTimeAveragedVar,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.DiffPlotTwoTimeAveragedVar):play.api.templates.HtmlFormat.Appendable = {
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
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*30.8*/routes/*30.14*/.Assets.at("javascripts/xmisc.js"))),format.raw/*30.48*/("""'></script>
<script type="text/javascript">
	var Response = null;
    var variable1 = "";
    var variable2 = "";
    window.onload = function() """),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
	    changeDataSource();
	    select_data1(1);
	    changeDataSource1();
	    select_data1(2);
	    changeVariableName();
	    select_var1(1);
	    changeVariableName1();
	    select_var1(2);
	    var imageUrl = $('#image').text();
	    $('#purpose').html($('#executionPurpose').text());
	    $('#Image').html('<img src="'+imageUrl+'" width=680 />');
	    $('#data_url').html($('#dataURL').text());
	    $('#Response').html($('serviceResponseText').text());
    """),format.raw/*49.5*/("""}"""),format.raw/*49.6*/("""
    function changeVariableName1()"""),format.raw/*50.35*/("""{"""),format.raw/*50.36*/("""
	    var var_string = $('#variableName2').text();
	    var x=document.getElementById("var2");
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
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/("""
    function changeVariableName()"""),format.raw/*104.34*/("""{"""),format.raw/*104.35*/("""
	    var var_string = $('#variableName1').text();
	    var x=document.getElementById("var1");
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
    """),format.raw/*157.5*/("""}"""),format.raw/*157.6*/("""
    function changeDataSource1()"""),format.raw/*158.33*/("""{"""),format.raw/*158.34*/("""
	    var dataSource = $('#source2').text();
	    dataSource = dataSource.toUpperCase();
	    var x = document.getElementById("data2");
	    if(dataSource == "NASA_MODIS" )"""),format.raw/*162.37*/("""{"""),format.raw/*162.38*/("""
	    x.options[13].selected=true;
	    """),format.raw/*164.6*/("""}"""),format.raw/*164.7*/("""
	    else if(dataSource == "NASA_AMSRE" )"""),format.raw/*165.42*/("""{"""),format.raw/*165.43*/("""
	    x.options[14].selected=true;
	    """),format.raw/*167.6*/("""}"""),format.raw/*167.7*/("""
	    else if(dataSource == "NASA_TRMM" )"""),format.raw/*168.41*/("""{"""),format.raw/*168.42*/("""
	    x.options[15].selected=true;
	    """),format.raw/*170.6*/("""}"""),format.raw/*170.7*/("""
	    else if(dataSource == "NASA_GPCP" )"""),format.raw/*171.41*/("""{"""),format.raw/*171.42*/("""
	    x.options[16].selected=true;
	    """),format.raw/*173.6*/("""}"""),format.raw/*173.7*/("""
	    else if(dataSource == "NASA_QUIKSCAT" )"""),format.raw/*174.45*/("""{"""),format.raw/*174.46*/("""
	    x.options[17].selected=true;
	    """),format.raw/*176.6*/("""}"""),format.raw/*176.7*/("""
	    else if(dataSource == "NASA_AVISO" )"""),format.raw/*177.42*/("""{"""),format.raw/*177.43*/("""
	    x.options[18].selected=true;
	    """),format.raw/*179.6*/("""}"""),format.raw/*179.7*/("""
	    else if(dataSource == "NASA_GRACE" )"""),format.raw/*180.42*/("""{"""),format.raw/*180.43*/("""
	    x.options[19].selected=true;
	    """),format.raw/*182.6*/("""}"""),format.raw/*182.7*/("""
	    else if(dataSource == "NOAA_NODC" )"""),format.raw/*183.41*/("""{"""),format.raw/*183.42*/("""
	    x.options[20].selected=true;
	    """),format.raw/*185.6*/("""}"""),format.raw/*185.7*/("""
	    else if(dataSource == "NASA_CERES" )"""),format.raw/*186.42*/("""{"""),format.raw/*186.43*/("""
	    x.options[21].selected=true;
	    """),format.raw/*188.6*/("""}"""),format.raw/*188.7*/("""
	    else if(dataSource == "NASA_AIRS" )"""),format.raw/*189.41*/("""{"""),format.raw/*189.42*/("""
	    x.options[22].selected=true;
	    """),format.raw/*191.6*/("""}"""),format.raw/*191.7*/("""
	    else if(dataSource == "NASA_MLS" )"""),format.raw/*192.40*/("""{"""),format.raw/*192.41*/("""
	    x.options[23].selected=true;
	    """),format.raw/*194.6*/("""}"""),format.raw/*194.7*/("""
	    else if(dataSource == "NASA_ARGO" )"""),format.raw/*195.41*/("""{"""),format.raw/*195.42*/("""
	    x.options[24].selected=true;
	    """),format.raw/*197.6*/("""}"""),format.raw/*197.7*/("""
	    else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*198.45*/("""{"""),format.raw/*198.46*/("""
	    x.options[0].selected=true;
	    """),format.raw/*200.6*/("""}"""),format.raw/*200.7*/("""
	    else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*201.42*/("""{"""),format.raw/*201.43*/("""
	    x.options[1].selected=true;
	    """),format.raw/*203.6*/("""}"""),format.raw/*203.7*/("""
	    else if(dataSource == "GISS_E2-H" )"""),format.raw/*204.41*/("""{"""),format.raw/*204.42*/("""
	    x.options[2].selected=true;
	    """),format.raw/*206.6*/("""}"""),format.raw/*206.7*/("""
	    else if(dataSource == "GISS_E2-R" )"""),format.raw/*207.41*/("""{"""),format.raw/*207.42*/("""
	    x.options[3].selected=true;
	    """),format.raw/*209.6*/("""}"""),format.raw/*209.7*/("""
	    else if(dataSource == "NCAR_CAM5" )"""),format.raw/*210.41*/("""{"""),format.raw/*210.42*/("""
	    x.options[4].selected=true;
	    """),format.raw/*212.6*/("""}"""),format.raw/*212.7*/("""
	    else if(dataSource == "NCC_NORESM" )"""),format.raw/*213.42*/("""{"""),format.raw/*213.43*/("""
	    x.options[5].selected=true;
	    """),format.raw/*215.6*/("""}"""),format.raw/*215.7*/("""
	    else if(dataSource == "UKMO_HADGEM2-ES" )"""),format.raw/*216.47*/("""{"""),format.raw/*216.48*/("""
	    x.options[6].selected=true;
	    """),format.raw/*218.6*/("""}"""),format.raw/*218.7*/("""
	    else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*219.44*/("""{"""),format.raw/*219.45*/("""
	    x.options[7].selected=true;
	    """),format.raw/*221.6*/("""}"""),format.raw/*221.7*/("""
	    else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*222.43*/("""{"""),format.raw/*222.44*/("""
	    x.options[8].selected=true;
	    """),format.raw/*224.6*/("""}"""),format.raw/*224.7*/("""
	    else if(dataSource == "GFDL_CM3" )"""),format.raw/*225.40*/("""{"""),format.raw/*225.41*/("""
	    x.options[9].selected=true;
	    """),format.raw/*227.6*/("""}"""),format.raw/*227.7*/("""
	    else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*228.44*/("""{"""),format.raw/*228.45*/("""
	    x.options[10].selected=true;
	    """),format.raw/*230.6*/("""}"""),format.raw/*230.7*/("""
	    else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*231.44*/("""{"""),format.raw/*231.45*/("""
	    x.options[11].selected=true;
	    """),format.raw/*233.6*/("""}"""),format.raw/*233.7*/("""
	    else if(dataSource == "UKMO_HADGEM2-A" )"""),format.raw/*234.46*/("""{"""),format.raw/*234.47*/("""
	    x.options[12].selected=true;
	    """),format.raw/*236.6*/("""}"""),format.raw/*236.7*/("""
	    else if(dataSource == "ECMWF_INTERIM" )"""),format.raw/*237.45*/("""{"""),format.raw/*237.46*/("""
	    x.options[25].selected=true;
	    """),format.raw/*239.6*/("""}"""),format.raw/*239.7*/("""
    """),format.raw/*240.5*/("""}"""),format.raw/*240.6*/("""
    function changeDataSource()"""),format.raw/*241.32*/("""{"""),format.raw/*241.33*/("""
	    var dataSource = $('#source1').text();
	    dataSource = dataSource.toUpperCase();
	    var x = document.getElementById("data1");
	    if(dataSource == "NASA_MODIS" )"""),format.raw/*245.37*/("""{"""),format.raw/*245.38*/("""
	    x.options[13].selected=true;
	    """),format.raw/*247.6*/("""}"""),format.raw/*247.7*/("""
	    else if(dataSource == "NASA_AMSRE" )"""),format.raw/*248.42*/("""{"""),format.raw/*248.43*/("""
	    x.options[14].selected=true;
	    """),format.raw/*250.6*/("""}"""),format.raw/*250.7*/("""
	    else if(dataSource == "NASA_TRMM" )"""),format.raw/*251.41*/("""{"""),format.raw/*251.42*/("""
	    x.options[15].selected=true;
	    """),format.raw/*253.6*/("""}"""),format.raw/*253.7*/("""
	    else if(dataSource == "NASA_GPCP" )"""),format.raw/*254.41*/("""{"""),format.raw/*254.42*/("""
	    x.options[16].selected=true;
	    """),format.raw/*256.6*/("""}"""),format.raw/*256.7*/("""
	    else if(dataSource == "NASA_QUIKSCAT" )"""),format.raw/*257.45*/("""{"""),format.raw/*257.46*/("""
	    x.options[17].selected=true;
	    """),format.raw/*259.6*/("""}"""),format.raw/*259.7*/("""
	    else if(dataSource == "NASA_AVISO" )"""),format.raw/*260.42*/("""{"""),format.raw/*260.43*/("""
	    x.options[18].selected=true;
	    """),format.raw/*262.6*/("""}"""),format.raw/*262.7*/("""
	    else if(dataSource == "NASA_GRACE" )"""),format.raw/*263.42*/("""{"""),format.raw/*263.43*/("""
	    x.options[19].selected=true;
	    """),format.raw/*265.6*/("""}"""),format.raw/*265.7*/("""
	    else if(dataSource == "NOAA_NODC" )"""),format.raw/*266.41*/("""{"""),format.raw/*266.42*/("""
	    x.options[20].selected=true;
	    """),format.raw/*268.6*/("""}"""),format.raw/*268.7*/("""
	    else if(dataSource == "NASA_CERES" )"""),format.raw/*269.42*/("""{"""),format.raw/*269.43*/("""
	    x.options[21].selected=true;
	    """),format.raw/*271.6*/("""}"""),format.raw/*271.7*/("""
	    else if(dataSource == "NASA_AIRS" )"""),format.raw/*272.41*/("""{"""),format.raw/*272.42*/("""
	    x.options[22].selected=true;
	    """),format.raw/*274.6*/("""}"""),format.raw/*274.7*/("""
	    else if(dataSource == "NASA_MLS" )"""),format.raw/*275.40*/("""{"""),format.raw/*275.41*/("""
	    x.options[23].selected=true;
	    """),format.raw/*277.6*/("""}"""),format.raw/*277.7*/("""
	    else if(dataSource == "NASA_ARGO" )"""),format.raw/*278.41*/("""{"""),format.raw/*278.42*/("""
	    x.options[24].selected=true;
	    """),format.raw/*280.6*/("""}"""),format.raw/*280.7*/("""
	    else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*281.45*/("""{"""),format.raw/*281.46*/("""
	    x.options[0].selected=true;
	    """),format.raw/*283.6*/("""}"""),format.raw/*283.7*/("""
	    else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*284.42*/("""{"""),format.raw/*284.43*/("""
	    x.options[1].selected=true;
	    """),format.raw/*286.6*/("""}"""),format.raw/*286.7*/("""
	    else if(dataSource == "GISS_E2-H" )"""),format.raw/*287.41*/("""{"""),format.raw/*287.42*/("""
	    x.options[2].selected=true;
	    """),format.raw/*289.6*/("""}"""),format.raw/*289.7*/("""
	    else if(dataSource == "GISS_E2-R" )"""),format.raw/*290.41*/("""{"""),format.raw/*290.42*/("""
	    x.options[3].selected=true;
	    """),format.raw/*292.6*/("""}"""),format.raw/*292.7*/("""
	    else if(dataSource == "NCAR_CAM5" )"""),format.raw/*293.41*/("""{"""),format.raw/*293.42*/("""
	    x.options[4].selected=true;
	    """),format.raw/*295.6*/("""}"""),format.raw/*295.7*/("""
	    else if(dataSource == "NCC_NORESM" )"""),format.raw/*296.42*/("""{"""),format.raw/*296.43*/("""
	    x.options[5].selected=true;
	    """),format.raw/*298.6*/("""}"""),format.raw/*298.7*/("""
	    else if(dataSource == "UKMO_HADGEM2-ES" )"""),format.raw/*299.47*/("""{"""),format.raw/*299.48*/("""
	    x.options[6].selected=true;
	    """),format.raw/*301.6*/("""}"""),format.raw/*301.7*/("""
	    else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*302.44*/("""{"""),format.raw/*302.45*/("""
	    x.options[7].selected=true;
	    """),format.raw/*304.6*/("""}"""),format.raw/*304.7*/("""
	    else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*305.43*/("""{"""),format.raw/*305.44*/("""
	    x.options[8].selected=true;
	    """),format.raw/*307.6*/("""}"""),format.raw/*307.7*/("""
	    else if(dataSource == "GFDL_CM3" )"""),format.raw/*308.40*/("""{"""),format.raw/*308.41*/("""
	    x.options[9].selected=true;
	    """),format.raw/*310.6*/("""}"""),format.raw/*310.7*/("""
	    else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*311.44*/("""{"""),format.raw/*311.45*/("""
	    x.options[10].selected=true;
	    """),format.raw/*313.6*/("""}"""),format.raw/*313.7*/("""
	    else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*314.44*/("""{"""),format.raw/*314.45*/("""
	    x.options[11].selected=true;
	    """),format.raw/*316.6*/("""}"""),format.raw/*316.7*/("""
	    else if(dataSource == "UKMO_HADGEM2-A" )"""),format.raw/*317.46*/("""{"""),format.raw/*317.47*/("""
	    x.options[12].selected=true;
	    """),format.raw/*319.6*/("""}"""),format.raw/*319.7*/("""
	    else if(dataSource == "ECMWF_INTERIM" )"""),format.raw/*320.45*/("""{"""),format.raw/*320.46*/("""
	    x.options[25].selected=true;
	    """),format.raw/*322.6*/("""}"""),format.raw/*322.7*/("""
    """),format.raw/*323.5*/("""}"""),format.raw/*323.6*/("""
    function enable_download_button()
    """),format.raw/*325.5*/("""{"""),format.raw/*325.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*328.5*/("""}"""),format.raw/*328.6*/("""
    function unset_vars1(ID)
    """),format.raw/*330.5*/("""{"""),format.raw/*330.6*/("""
      var x;
      if (ID == 1) """),format.raw/*332.20*/("""{"""),format.raw/*332.21*/("""
        x=document.getElementById("var1");
      """),format.raw/*334.7*/("""}"""),format.raw/*334.8*/("""
      else if (ID == 2) """),format.raw/*335.25*/("""{"""),format.raw/*335.26*/("""
        x=document.getElementById("var2");
      """),format.raw/*337.7*/("""}"""),format.raw/*337.8*/("""
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
      x.options[25].disabled=true;
      x.options[26].disabled=true;
      x.options[27].disabled=true;
      x.options[28].disabled=true;
      x.options[29].disabled=true;
      x.options[30].disabled=true;
      x.options[31].disabled=true;
      x.options[32].disabled=true;
    """),format.raw/*371.5*/("""}"""),format.raw/*371.6*/("""
    function disable_pres1(ID)
    """),format.raw/*373.5*/("""{"""),format.raw/*373.6*/("""
      var x;
      if (ID == 1) """),format.raw/*375.20*/("""{"""),format.raw/*375.21*/("""
        x=document.getElementById("pres1");
      """),format.raw/*377.7*/("""}"""),format.raw/*377.8*/("""
      else if (ID == 2) """),format.raw/*378.25*/("""{"""),format.raw/*378.26*/("""
        x=document.getElementById("pres2");
      """),format.raw/*380.7*/("""}"""),format.raw/*380.8*/("""
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*383.5*/("""}"""),format.raw/*383.6*/("""
    function enable_pres1(ID)
    """),format.raw/*385.5*/("""{"""),format.raw/*385.6*/("""
      var x;
      if (ID == 1) """),format.raw/*387.20*/("""{"""),format.raw/*387.21*/("""
        x=document.getElementById("pres1");
      """),format.raw/*389.7*/("""}"""),format.raw/*389.8*/("""
      else if (ID == 2) """),format.raw/*390.25*/("""{"""),format.raw/*390.26*/("""
        x=document.getElementById("pres2");
      """),format.raw/*392.7*/("""}"""),format.raw/*392.8*/("""
      x.value = "500";
      x.disabled=false;
    """),format.raw/*395.5*/("""}"""),format.raw/*395.6*/("""
    function select_var1(ID)
    """),format.raw/*397.5*/("""{"""),format.raw/*397.6*/("""
      var var_string;
      if (ID == 1) """),format.raw/*399.20*/("""{"""),format.raw/*399.21*/("""
        var_string = $("#var1").val();
      """),format.raw/*401.7*/("""}"""),format.raw/*401.8*/("""
      else if (ID == 2) """),format.raw/*402.25*/("""{"""),format.raw/*402.26*/("""
        var_string = $("#var2").val();
    """),format.raw/*404.5*/("""}"""),format.raw/*404.6*/("""
    disable_download_button();  
    if (var_string == "Total Cloud Fraction") """),format.raw/*406.47*/("""{"""),format.raw/*406.48*/(""" 
      if (ID == 1) """),format.raw/*407.20*/("""{"""),format.raw/*407.21*/("""
        variable1 = "clt";  
      """),format.raw/*409.7*/("""}"""),format.raw/*409.8*/("""
      else if (ID == 2) """),format.raw/*410.25*/("""{"""),format.raw/*410.26*/("""
        variable2 = "clt";  
      """),format.raw/*412.7*/("""}"""),format.raw/*412.8*/("""
      disable_pres1(ID);
    """),format.raw/*414.5*/("""}"""),format.raw/*414.6*/("""
     else if (var_string == "Surface Temperature") """),format.raw/*415.52*/("""{"""),format.raw/*415.53*/("""
       if (ID == 1) """),format.raw/*416.21*/("""{"""),format.raw/*416.22*/("""
         variable1 = "ts";  
       """),format.raw/*418.8*/("""}"""),format.raw/*418.9*/("""
       else if (ID == 2) """),format.raw/*419.26*/("""{"""),format.raw/*419.27*/("""
         variable2 = "ts";  
       """),format.raw/*421.8*/("""}"""),format.raw/*421.9*/("""
       disable_pres1(ID);
     """),format.raw/*423.6*/("""}"""),format.raw/*423.7*/("""
     else if (var_string == "Sea Surface Temperature") """),format.raw/*424.56*/("""{"""),format.raw/*424.57*/(""" 
       if (ID == 1) """),format.raw/*425.21*/("""{"""),format.raw/*425.22*/("""
         variable1 = "tos";  
       """),format.raw/*427.8*/("""}"""),format.raw/*427.9*/("""
       else if (ID == 2) """),format.raw/*428.26*/("""{"""),format.raw/*428.27*/("""
         variable2 = "tos";  
       """),format.raw/*430.8*/("""}"""),format.raw/*430.9*/("""
       disable_pres1(ID);
     """),format.raw/*432.6*/("""}"""),format.raw/*432.7*/("""
     else if (var_string == "Precipitation Flux") """),format.raw/*433.51*/("""{"""),format.raw/*433.52*/(""" 
       if (ID == 1) """),format.raw/*434.21*/("""{"""),format.raw/*434.22*/("""
         variable1 = "pr";  
       """),format.raw/*436.8*/("""}"""),format.raw/*436.9*/("""
       else if (ID == 2) """),format.raw/*437.26*/("""{"""),format.raw/*437.27*/("""
         variable2 = "pr";  
       """),format.raw/*439.8*/("""}"""),format.raw/*439.9*/("""
       disable_pres1(ID);
     """),format.raw/*441.6*/("""}"""),format.raw/*441.7*/("""
     else if (var_string == "Eastward Near-Surface Wind") """),format.raw/*442.59*/("""{"""),format.raw/*442.60*/(""" 
       if (ID == 1) """),format.raw/*443.21*/("""{"""),format.raw/*443.22*/("""
         variable1 = "uas";  
       """),format.raw/*445.8*/("""}"""),format.raw/*445.9*/("""
       else if (ID == 2) """),format.raw/*446.26*/("""{"""),format.raw/*446.27*/("""
         variable2 = "uas";  
       """),format.raw/*448.8*/("""}"""),format.raw/*448.9*/("""
       disable_pres1(ID);
     """),format.raw/*450.6*/("""}"""),format.raw/*450.7*/("""
     else if (var_string == "Northward Near-Surface Wind") """),format.raw/*451.60*/("""{"""),format.raw/*451.61*/("""  
       if (ID == 1) """),format.raw/*452.21*/("""{"""),format.raw/*452.22*/("""
         variable1 = "vas";  
       """),format.raw/*454.8*/("""}"""),format.raw/*454.9*/("""
       else if (ID == 2) """),format.raw/*455.26*/("""{"""),format.raw/*455.27*/("""
         variable2 = "vas";  
       """),format.raw/*457.8*/("""}"""),format.raw/*457.9*/("""
       disable_pres1(ID);
     """),format.raw/*459.6*/("""}"""),format.raw/*459.7*/("""
     else if (var_string == "Near-Surface Wind Speed") """),format.raw/*460.56*/("""{"""),format.raw/*460.57*/(""" 
       if (ID == 1) """),format.raw/*461.21*/("""{"""),format.raw/*461.22*/("""
         variable1 = "sfcWind";  
       """),format.raw/*463.8*/("""}"""),format.raw/*463.9*/("""
       else if (ID == 2) """),format.raw/*464.26*/("""{"""),format.raw/*464.27*/("""
         variable2 = "sfcWind";  
       """),format.raw/*466.8*/("""}"""),format.raw/*466.9*/("""
       disable_pres1(ID);
     """),format.raw/*468.6*/("""}"""),format.raw/*468.7*/("""
     else if (var_string == "Sea Surface Height") """),format.raw/*469.51*/("""{"""),format.raw/*469.52*/(""" 
       if (ID == 1) """),format.raw/*470.21*/("""{"""),format.raw/*470.22*/("""
         variable1 = "zos";  
       """),format.raw/*472.8*/("""}"""),format.raw/*472.9*/("""
       else if (ID == 2) """),format.raw/*473.26*/("""{"""),format.raw/*473.27*/("""
         variable2 = "zos";  
       """),format.raw/*475.8*/("""}"""),format.raw/*475.9*/("""
       disable_pres1(ID);
     """),format.raw/*477.6*/("""}"""),format.raw/*477.7*/("""
     else if (var_string == "Leaf Area Index") """),format.raw/*478.48*/("""{"""),format.raw/*478.49*/(""" 
       if (ID == 1) """),format.raw/*479.21*/("""{"""),format.raw/*479.22*/("""
         variable1 = "lai";  
       """),format.raw/*481.8*/("""}"""),format.raw/*481.9*/("""
       else if (ID == 2) """),format.raw/*482.26*/("""{"""),format.raw/*482.27*/("""
         variable2 = "lai";  
       """),format.raw/*484.8*/("""}"""),format.raw/*484.9*/("""
       disable_pres1(ID);
     """),format.raw/*486.6*/("""}"""),format.raw/*486.7*/("""
     else if (var_string == "Equivalent Water Height Over Land") """),format.raw/*487.66*/("""{"""),format.raw/*487.67*/("""
       if (ID == 1) """),format.raw/*488.21*/("""{"""),format.raw/*488.22*/("""
         variable1 = "zl";  
       """),format.raw/*490.8*/("""}"""),format.raw/*490.9*/("""
       else if (ID == 2) """),format.raw/*491.26*/("""{"""),format.raw/*491.27*/("""
         variable2 = "zl";  
       """),format.raw/*493.8*/("""}"""),format.raw/*493.9*/("""
       disable_pres1(ID);
     """),format.raw/*495.6*/("""}"""),format.raw/*495.7*/("""
     else if (var_string == "Equivalent Water Height Over Ocean") """),format.raw/*496.67*/("""{"""),format.raw/*496.68*/("""
       if (ID == 1) """),format.raw/*497.21*/("""{"""),format.raw/*497.22*/("""
         variable1 = "zo";
       """),format.raw/*499.8*/("""}"""),format.raw/*499.9*/("""
       else if (ID == 2) """),format.raw/*500.26*/("""{"""),format.raw/*500.27*/("""
         variable2 = "zo";
       """),format.raw/*502.8*/("""}"""),format.raw/*502.9*/("""
       disable_pres1(ID);
     """),format.raw/*504.6*/("""}"""),format.raw/*504.7*/("""
     else if (var_string == "Ocean Heat Content Anomaly within 700 m Depth") """),format.raw/*505.78*/("""{"""),format.raw/*505.79*/("""
       if (ID == 1) """),format.raw/*506.21*/("""{"""),format.raw/*506.22*/("""
         variable1 = "ohc700";
       """),format.raw/*508.8*/("""}"""),format.raw/*508.9*/("""
       else if (ID == 2) """),format.raw/*509.26*/("""{"""),format.raw/*509.27*/("""
         variable2 = "ohc700";
       """),format.raw/*511.8*/("""}"""),format.raw/*511.9*/("""
       disable_pres1(ID);
     """),format.raw/*513.6*/("""}"""),format.raw/*513.7*/("""
     else if (var_string == "Ocean Heat Content Anomaly within 2000 m Depth") """),format.raw/*514.79*/("""{"""),format.raw/*514.80*/("""
       if (ID == 1) """),format.raw/*515.21*/("""{"""),format.raw/*515.22*/("""
         variable1 = "ohc2000";
       """),format.raw/*517.8*/("""}"""),format.raw/*517.9*/("""
       else if (ID == 2) """),format.raw/*518.26*/("""{"""),format.raw/*518.27*/("""
         variable2 = "ohc2000";
       """),format.raw/*520.8*/("""}"""),format.raw/*520.9*/("""
       disable_pres1(ID);
     """),format.raw/*522.6*/("""}"""),format.raw/*522.7*/("""
     else if (var_string == "Surface Downwelling Longwave Radiation") """),format.raw/*523.71*/("""{"""),format.raw/*523.72*/("""
       if (ID == 1) """),format.raw/*524.21*/("""{"""),format.raw/*524.22*/("""
         variable1 = "rlds";
       """),format.raw/*526.8*/("""}"""),format.raw/*526.9*/("""
       else if (ID == 2) """),format.raw/*527.26*/("""{"""),format.raw/*527.27*/("""
         variable2 = "rlds";
       """),format.raw/*529.8*/("""}"""),format.raw/*529.9*/("""
       disable_pres1(ID);
     """),format.raw/*531.6*/("""}"""),format.raw/*531.7*/("""
     else if (var_string == "Surface Downwelling Shortwave Radiation") """),format.raw/*532.72*/("""{"""),format.raw/*532.73*/("""
       if (ID == 1) """),format.raw/*533.21*/("""{"""),format.raw/*533.22*/("""
         variable1 = "rsds";
       """),format.raw/*535.8*/("""}"""),format.raw/*535.9*/("""
       else if (ID == 2) """),format.raw/*536.26*/("""{"""),format.raw/*536.27*/("""
         variable2 = "rsds";
       """),format.raw/*538.8*/("""}"""),format.raw/*538.9*/("""
       disable_pres1(ID);
     """),format.raw/*540.6*/("""}"""),format.raw/*540.7*/("""
     else if (var_string == "Surface Upwelling Longwave Radiation") """),format.raw/*541.69*/("""{"""),format.raw/*541.70*/("""
       if (ID == 1) """),format.raw/*542.21*/("""{"""),format.raw/*542.22*/("""
         variable1 = "rlus";
       """),format.raw/*544.8*/("""}"""),format.raw/*544.9*/("""
       else if (ID == 2) """),format.raw/*545.26*/("""{"""),format.raw/*545.27*/("""
         variable2 = "rlus";
       """),format.raw/*547.8*/("""}"""),format.raw/*547.9*/("""
       disable_pres1(ID);
     """),format.raw/*549.6*/("""}"""),format.raw/*549.7*/("""
     else if (var_string == "Surface Upwelling Shortwave Radiation") """),format.raw/*550.70*/("""{"""),format.raw/*550.71*/("""
       if (ID == 1) """),format.raw/*551.21*/("""{"""),format.raw/*551.22*/("""
         variable1 = "rsus";
       """),format.raw/*553.8*/("""}"""),format.raw/*553.9*/("""
       else if (ID == 2) """),format.raw/*554.26*/("""{"""),format.raw/*554.27*/("""
         variable2 = "rsus";
       """),format.raw/*556.8*/("""}"""),format.raw/*556.9*/("""
       disable_pres1(ID);
     """),format.raw/*558.6*/("""}"""),format.raw/*558.7*/("""
     else if (var_string == "Surface Downwelling Clear-Sky Longwave Radiation") """),format.raw/*559.81*/("""{"""),format.raw/*559.82*/("""
       if (ID == 1) """),format.raw/*560.21*/("""{"""),format.raw/*560.22*/("""
         variable1 = "rldscs";
       """),format.raw/*562.8*/("""}"""),format.raw/*562.9*/("""
       else if (ID == 2) """),format.raw/*563.26*/("""{"""),format.raw/*563.27*/("""
         variable2 = "rldscs";
       """),format.raw/*565.8*/("""}"""),format.raw/*565.9*/("""
       disable_pres1(ID);
     """),format.raw/*567.6*/("""}"""),format.raw/*567.7*/("""
     else if (var_string == "Surface Downwelling Clear-Sky Shortwave Radiation") """),format.raw/*568.82*/("""{"""),format.raw/*568.83*/("""
       if (ID == 1) """),format.raw/*569.21*/("""{"""),format.raw/*569.22*/("""
         variable1 = "rsdscs";
       """),format.raw/*571.8*/("""}"""),format.raw/*571.9*/("""
       else if (ID == 2) """),format.raw/*572.26*/("""{"""),format.raw/*572.27*/("""
         variable2 = "rsdscs";
       """),format.raw/*574.8*/("""}"""),format.raw/*574.9*/("""
       disable_pres1(ID);
     """),format.raw/*576.6*/("""}"""),format.raw/*576.7*/("""
     else if (var_string == "Surface Upwelling Clear-Sky Shortwave Radiation") """),format.raw/*577.80*/("""{"""),format.raw/*577.81*/("""
       if (ID == 1) """),format.raw/*578.21*/("""{"""),format.raw/*578.22*/("""
         variable1 = "rsuscs";
       """),format.raw/*580.8*/("""}"""),format.raw/*580.9*/("""
       else if (ID == 2) """),format.raw/*581.26*/("""{"""),format.raw/*581.27*/("""
         variable2 = "rsuscs";
       """),format.raw/*583.8*/("""}"""),format.raw/*583.9*/("""
       disable_pres1(ID);
     """),format.raw/*585.6*/("""}"""),format.raw/*585.7*/("""
     else if (var_string == "TOA Incident Shortwave Radiation") """),format.raw/*586.65*/("""{"""),format.raw/*586.66*/("""
       if (ID == 1) """),format.raw/*587.21*/("""{"""),format.raw/*587.22*/("""
         variable1 = "rsdt";
       """),format.raw/*589.8*/("""}"""),format.raw/*589.9*/("""
       else if (ID == 2) """),format.raw/*590.26*/("""{"""),format.raw/*590.27*/("""
         variable2 = "rsdt";
       """),format.raw/*592.8*/("""}"""),format.raw/*592.9*/("""
       disable_pres1(ID);
     """),format.raw/*594.6*/("""}"""),format.raw/*594.7*/("""
     else if (var_string == "TOA Outgoing Clear-Sky Longwave Radiation") """),format.raw/*595.74*/("""{"""),format.raw/*595.75*/("""
       if (ID == 1) """),format.raw/*596.21*/("""{"""),format.raw/*596.22*/("""
         variable1 = "rlutcs";
       """),format.raw/*598.8*/("""}"""),format.raw/*598.9*/("""
       else if (ID == 2) """),format.raw/*599.26*/("""{"""),format.raw/*599.27*/("""
         variable2 = "rlutcs";
       """),format.raw/*601.8*/("""}"""),format.raw/*601.9*/("""
       disable_pres1(ID);
     """),format.raw/*603.6*/("""}"""),format.raw/*603.7*/("""
     else if (var_string == "TOA Outgoing Longwave Radiation") """),format.raw/*604.64*/("""{"""),format.raw/*604.65*/("""
       if (ID == 1) """),format.raw/*605.21*/("""{"""),format.raw/*605.22*/("""
         variable1 = "rlut";
       """),format.raw/*607.8*/("""}"""),format.raw/*607.9*/("""
       else if (ID == 2) """),format.raw/*608.26*/("""{"""),format.raw/*608.27*/("""
         variable2 = "rlut";
       """),format.raw/*610.8*/("""}"""),format.raw/*610.9*/("""
       disable_pres1(ID);
     """),format.raw/*612.6*/("""}"""),format.raw/*612.7*/("""
     else if (var_string == "TOA Outgoing Clear-Sky Shortwave Radiation") """),format.raw/*613.75*/("""{"""),format.raw/*613.76*/("""
       if (ID == 1) """),format.raw/*614.21*/("""{"""),format.raw/*614.22*/("""
         variable1 = "rsutcs";
       """),format.raw/*616.8*/("""}"""),format.raw/*616.9*/("""
       else if (ID == 2) """),format.raw/*617.26*/("""{"""),format.raw/*617.27*/("""
         variable2 = "rsutcs";
       """),format.raw/*619.8*/("""}"""),format.raw/*619.9*/("""
       disable_pres1(ID);
     """),format.raw/*621.6*/("""}"""),format.raw/*621.7*/("""
     else if (var_string == "TOA Outgoing Shortwave Radiation") """),format.raw/*622.65*/("""{"""),format.raw/*622.66*/("""
       if (ID == 1) """),format.raw/*623.21*/("""{"""),format.raw/*623.22*/("""
         variable1 = "rsut";
       """),format.raw/*625.8*/("""}"""),format.raw/*625.9*/("""
       else if (ID == 2) """),format.raw/*626.26*/("""{"""),format.raw/*626.27*/("""
         variable2 = "rsut";
       """),format.raw/*628.8*/("""}"""),format.raw/*628.9*/("""
       disable_pres1(ID);
     """),format.raw/*630.6*/("""}"""),format.raw/*630.7*/("""
     else if (var_string == "Air Temperature") """),format.raw/*631.48*/("""{"""),format.raw/*631.49*/("""
       if (ID == 1) """),format.raw/*632.21*/("""{"""),format.raw/*632.22*/("""
         variable1 = "ta";
       """),format.raw/*634.8*/("""}"""),format.raw/*634.9*/("""
       else if (ID == 2) """),format.raw/*635.26*/("""{"""),format.raw/*635.27*/("""
         variable2 = "ta";
       """),format.raw/*637.8*/("""}"""),format.raw/*637.9*/("""
       enable_pres1(ID);
     """),format.raw/*639.6*/("""}"""),format.raw/*639.7*/("""
     else if (var_string == "Specific Humidity") """),format.raw/*640.50*/("""{"""),format.raw/*640.51*/("""
       if (ID == 1) """),format.raw/*641.21*/("""{"""),format.raw/*641.22*/("""
         variable1 = "hus";
       """),format.raw/*643.8*/("""}"""),format.raw/*643.9*/("""
       else if (ID == 2) """),format.raw/*644.26*/("""{"""),format.raw/*644.27*/("""
         variable2 = "hus";
       """),format.raw/*646.8*/("""}"""),format.raw/*646.9*/("""
       enable_pres1(ID);
     """),format.raw/*648.6*/("""}"""),format.raw/*648.7*/("""
     else if (var_string == "Cloud Ice Water Content") """),format.raw/*649.56*/("""{"""),format.raw/*649.57*/("""
       if (ID == 1) """),format.raw/*650.21*/("""{"""),format.raw/*650.22*/("""
         variable1 = "cli";
       """),format.raw/*652.8*/("""}"""),format.raw/*652.9*/("""
       else if (ID == 2) """),format.raw/*653.26*/("""{"""),format.raw/*653.27*/("""
         variable2 = "cli";
       """),format.raw/*655.8*/("""}"""),format.raw/*655.9*/("""
       enable_pres1(ID);
     """),format.raw/*657.6*/("""}"""),format.raw/*657.7*/("""
     else if (var_string == "Cloud Liquid Water Content") """),format.raw/*658.59*/("""{"""),format.raw/*658.60*/("""
       if (ID == 1) """),format.raw/*659.21*/("""{"""),format.raw/*659.22*/("""
         variable1 = "clw";
       """),format.raw/*661.8*/("""}"""),format.raw/*661.9*/("""
       else if (ID == 2) """),format.raw/*662.26*/("""{"""),format.raw/*662.27*/("""
         variable2 = "clw";
       """),format.raw/*664.8*/("""}"""),format.raw/*664.9*/("""
       enable_pres1(ID);
     """),format.raw/*666.6*/("""}"""),format.raw/*666.7*/("""
     else if (var_string == "Ocean Temperature") """),format.raw/*667.50*/("""{"""),format.raw/*667.51*/("""
       if (ID == 1) """),format.raw/*668.21*/("""{"""),format.raw/*668.22*/("""
         variable1 = "ot";
       """),format.raw/*670.8*/("""}"""),format.raw/*670.9*/("""
       else if (ID == 2) """),format.raw/*671.26*/("""{"""),format.raw/*671.27*/("""
         variable2 = "ot";
       """),format.raw/*673.8*/("""}"""),format.raw/*673.9*/("""
       enable_pres1(ID);
     """),format.raw/*675.6*/("""}"""),format.raw/*675.7*/("""
     else if (var_string == "Ocean Salinity") """),format.raw/*676.47*/("""{"""),format.raw/*676.48*/("""
       if (ID == 1) """),format.raw/*677.21*/("""{"""),format.raw/*677.22*/("""
         variable1 = "os";
       """),format.raw/*679.8*/("""}"""),format.raw/*679.9*/("""
       else if (ID == 2) """),format.raw/*680.26*/("""{"""),format.raw/*680.27*/("""
         variable2 = "os";
       """),format.raw/*682.8*/("""}"""),format.raw/*682.9*/("""
       enable_pres1(ID);
     """),format.raw/*684.6*/("""}"""),format.raw/*684.7*/("""
     else if (var_string == "Vertical Wind Velocity") """),format.raw/*685.55*/("""{"""),format.raw/*685.56*/("""
       if (ID == 1) """),format.raw/*686.21*/("""{"""),format.raw/*686.22*/("""
         variable1 = "wap";
       """),format.raw/*688.8*/("""}"""),format.raw/*688.9*/("""
       else if (ID == 2) """),format.raw/*689.26*/("""{"""),format.raw/*689.27*/("""
         variable2 = "wap";
       """),format.raw/*691.8*/("""}"""),format.raw/*691.9*/("""
       enable_pres1(ID);
     """),format.raw/*693.6*/("""}"""),format.raw/*693.7*/("""
     else if (var_string == "Relative Humidity") """),format.raw/*694.50*/("""{"""),format.raw/*694.51*/("""
       if (ID == 1) """),format.raw/*695.21*/("""{"""),format.raw/*695.22*/("""
         variable1 = "hur";
       """),format.raw/*697.8*/("""}"""),format.raw/*697.9*/("""
       else if (ID == 2) """),format.raw/*698.26*/("""{"""),format.raw/*698.27*/("""
         variable2 = "hur";
       """),format.raw/*700.8*/("""}"""),format.raw/*700.9*/("""
       enable_pres1(ID);
     """),format.raw/*702.6*/("""}"""),format.raw/*702.7*/("""
    """),format.raw/*703.5*/("""}"""),format.raw/*703.6*/("""
    function select_data1(ID)
    """),format.raw/*705.5*/("""{"""),format.raw/*705.6*/("""
      var data_string;
      var x;
      if (ID == 1) """),format.raw/*708.20*/("""{"""),format.raw/*708.21*/("""
        data_string = $("#data1").val();
        x = document.getElementById("var1");
      """),format.raw/*711.7*/("""}"""),format.raw/*711.8*/("""
      else if (ID == 2) """),format.raw/*712.25*/("""{"""),format.raw/*712.26*/("""
        data_string = $("#data2").val();
        x = document.getElementById("var2");
      """),format.raw/*715.7*/("""}"""),format.raw/*715.8*/("""
      disable_download_button();
      if (data_string == "NASA/AMSRE") """),format.raw/*717.40*/("""{"""),format.raw/*717.41*/("""
        unset_vars1(ID); 
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
      """),format.raw/*722.7*/("""}"""),format.raw/*722.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*723.45*/("""{"""),format.raw/*723.46*/("""
        unset_vars1(ID);
        x.options[1].selected=true;
        disable_pres1(ID); 
        x.options[1].disabled=false;
        x.options[8].disabled=false;
      """),format.raw/*729.7*/("""}"""),format.raw/*729.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*730.44*/("""{"""),format.raw/*730.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*735.7*/("""}"""),format.raw/*735.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*736.44*/("""{"""),format.raw/*736.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*741.7*/("""}"""),format.raw/*741.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*742.48*/("""{"""),format.raw/*742.49*/("""
        unset_vars1(ID);
        x.options[4].selected=true;
        disable_pres1(ID); 
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
      """),format.raw/*749.7*/("""}"""),format.raw/*749.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*750.45*/("""{"""),format.raw/*750.46*/("""
        unset_vars1(ID);
        x.options[7].selected=true;
        disable_pres1(ID); 
        x.options[7].disabled=false;
      """),format.raw/*755.7*/("""}"""),format.raw/*755.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*756.45*/("""{"""),format.raw/*756.46*/("""
        unset_vars1(ID);
        x.options[9].selected=true;
        disable_pres1(ID); 
        x.options[9].disabled=false;
        x.options[10].disabled=false;
      """),format.raw/*762.7*/("""}"""),format.raw/*762.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*763.44*/("""{"""),format.raw/*763.45*/("""
        unset_vars1(ID);
        x.options[11].selected=true;
        disable_pres1(ID); 
        x.options[11].disabled=false;
        x.options[12].disabled=false;
      """),format.raw/*769.7*/("""}"""),format.raw/*769.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*770.45*/("""{"""),format.raw/*770.46*/("""
        unset_vars1(ID);
        x.options[13].selected=true;
        disable_pres1(ID); 
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
      """),format.raw/*786.7*/("""}"""),format.raw/*786.8*/("""
      else if (data_string == "NASA/AIRS") """),format.raw/*787.44*/("""{"""),format.raw/*787.45*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*793.7*/("""}"""),format.raw/*793.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*794.43*/("""{"""),format.raw/*794.44*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*800.7*/("""}"""),format.raw/*800.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*801.44*/("""{"""),format.raw/*801.45*/("""
        unset_vars1(ID);
        x.options[29].selected=true;
        enable_pres1(ID); 
        x.options[29].disabled=false;
        x.options[30].disabled=false;
      """),format.raw/*807.7*/("""}"""),format.raw/*807.8*/("""
      else if (data_string == "CCCMA/CANAM4") """),format.raw/*808.47*/("""{"""),format.raw/*808.48*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
        x.options[1].disabled=false;
        x.options[2].disabled=false;
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
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
        x.options[25].disabled=false;
        x.options[26].disabled=false;
        x.options[27].disabled=false;
        x.options[28].disabled=false;
      """),format.raw/*834.7*/("""}"""),format.raw/*834.8*/("""
      else if (data_string == "CSIRO/MK3.6") """),format.raw/*835.46*/("""{"""),format.raw/*835.47*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
        x.options[1].disabled=false;
        x.options[2].disabled=false;
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
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
        x.options[25].disabled=false;
        x.options[26].disabled=false;
        x.options[27].disabled=false;
        x.options[28].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*863.7*/("""}"""),format.raw/*863.8*/("""
      else if (data_string == "NCAR/CAM5") """),format.raw/*864.44*/("""{"""),format.raw/*864.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
        x.options[1].disabled=false;
        x.options[2].disabled=false;
        x.options[3].disabled=false;
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
        x.options[7].disabled=false;
        x.options[8].disabled=false;
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
        x.options[25].disabled=false;
        x.options[26].disabled=false;
        x.options[27].disabled=false;
        x.options[28].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*894.7*/("""}"""),format.raw/*894.8*/("""
      else if (data_string == "CCCMA/CANESM2" || data_string == "GFDL/ESM2G" ||
               data_string == "GISS/E2-H" || data_string == "GISS/E2-R" ||
               data_string == "NCC/NORESM" ||
               data_string == "UKMO/HadGEM2-ES" ||
               data_string == "GFDL/CM3" || data_string == "IPSL/CM5A-LR" ||
               data_string == "MIROC/MIROC5" || data_string == "UKMO/HadGEM2-A"
              ) """),format.raw/*901.17*/("""{"""),format.raw/*901.18*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
        x.options[1].disabled=false;
        x.options[2].disabled=false;
        x.options[3].disabled=false;
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
        x.options[7].disabled=false;
        x.options[8].disabled=false;
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
        x.options[25].disabled=false;
        x.options[26].disabled=false;
        x.options[27].disabled=false;
        x.options[28].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*932.7*/("""}"""),format.raw/*932.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*933.48*/("""{"""),format.raw/*933.49*/("""
        unset_vars1(ID);
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*940.7*/("""}"""),format.raw/*940.8*/("""
      select_var1(ID);
    """),format.raw/*942.5*/("""}"""),format.raw/*942.6*/("""
    $(document).ready(function()"""),format.raw/*943.33*/("""{"""),format.raw/*943.34*/("""
    $("#download_data").click(function(event) """),format.raw/*944.47*/("""{"""),format.raw/*944.48*/("""
      var durl = $("#data_url").val();
      window.location.assign(durl);
    """),format.raw/*947.5*/("""}"""),format.raw/*947.6*/(""");
      $("#scatterPlot2V").click(function(event) """),format.raw/*948.49*/("""{"""),format.raw/*948.50*/("""
        Response = null;
        disable_download_button();
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/diffPlot2V?";
        var d1 = $("#data1").val();
        var model1 = d1.replace("/", "_");
        model1 = model1.toLowerCase();
        var arglist = "";
        arglist = arglist.concat("model1=");
        arglist = arglist.concat(model1);
        var v1 = $("#var1").val();
        arglist = arglist.concat("&var1=");
        arglist = arglist.concat(variable1);
        var pres1 = $("#pres1").val();
        arglist = arglist.concat("&pres1=");
        arglist = arglist.concat(pres1);
        var d2 = $("#data2").val();
        var model2 = d2.replace("/", "_");
        model2 = model2.toLowerCase();
        arglist = arglist.concat("&model2=");
        arglist = arglist.concat(model2);
        var v2 = $("#var2").val();
        arglist = arglist.concat("&var2=");
        arglist = arglist.concat(variable2);
        var pres2 = $("#pres2").val();
        arglist = arglist.concat("&pres2=");
        arglist = arglist.concat(pres2);
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
        var purpose = $("#purpose").val();
        arglist = arglist.concat("&purpose=");
        arglist = arglist.concat(purpose);
        url = url + encodeURI(arglist);
        var urlTimeBounds = "http://" + window.location.hostname + ":9002/svc/two_time_bounds?";
        var arglistTB = "";
        arglistTB = arglistTB.concat("serviceType=");
        arglistTB = arglistTB.concat("2");
        arglistTB = arglistTB.concat("&source1=");
        arglistTB = arglistTB.concat(d1);
        arglistTB = arglistTB.concat("&var1=");
        arglistTB = arglistTB.concat(variable1);
        arglistTB = arglistTB.concat("&source2=");
        arglistTB = arglistTB.concat(d2);
        arglistTB = arglistTB.concat("&var2=");
        arglistTB = arglistTB.concat(variable2);
        urlTimeBounds = urlTimeBounds + encodeURI(arglistTB);
        $.ajax("""),format.raw/*1015.16*/("""{"""),format.raw/*1015.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1020.54*/("""{"""),format.raw/*1020.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1022.44*/("""{"""),format.raw/*1022.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1029.17*/("""}"""),format.raw/*1029.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb1 = data.time_bounds1;
                var bds1 = String(tb1).split(",");
                var lowerT1 = parseInt(bds1[0]);
                var upperT1 = parseInt(bds1[1]);
                var tb2 = data.time_bounds2;
                var bds2 = String(tb2).split(",");
                var lowerT2 = parseInt(bds2[0]);
                var upperT2 = parseInt(bds2[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                var lowerT, upperT;
                if (lowerT1 == 0  || upperT1 == 0)"""),format.raw/*1042.51*/("""{"""),format.raw/*1042.52*/(""" 
                  alert("We do not have data for the data-1 source and variable configuration.");
                  return;
                """),format.raw/*1045.17*/("""}"""),format.raw/*1045.18*/("""
                else if (lowerT2 == 0  || upperT2 == 0)"""),format.raw/*1046.56*/("""{"""),format.raw/*1046.57*/(""" 
                  alert("We do not have data for the data-2 source and variable configuration.");
                  return;
                """),format.raw/*1049.17*/("""}"""),format.raw/*1049.18*/("""
                else if (lowerT2 > upperT1 || lowerT1 > upperT2) """),format.raw/*1050.66*/("""{"""),format.raw/*1050.67*/(""" 
                  alert("The two data sets/vars do not have a common time range.");
                  return;
                """),format.raw/*1053.17*/("""}"""),format.raw/*1053.18*/("""
                else """),format.raw/*1054.22*/("""{"""),format.raw/*1054.23*/(""" 
                  if (lowerT1 > lowerT2) """),format.raw/*1055.42*/("""{"""),format.raw/*1055.43*/(""" 
                    lowerT = lowerT1;
                  """),format.raw/*1057.19*/("""}"""),format.raw/*1057.20*/("""
                  else """),format.raw/*1058.24*/("""{"""),format.raw/*1058.25*/("""
                    lowerT = lowerT2;
                  """),format.raw/*1060.19*/("""}"""),format.raw/*1060.20*/("""
                  if (upperT1 > upperT2) """),format.raw/*1061.42*/("""{"""),format.raw/*1061.43*/(""" 
                    upperT = upperT2;
                  """),format.raw/*1063.19*/("""}"""),format.raw/*1063.20*/("""
                  else """),format.raw/*1064.24*/("""{"""),format.raw/*1064.25*/("""
                    upperT = upperT1;
                  """),format.raw/*1066.19*/("""}"""),format.raw/*1066.20*/("""
                """),format.raw/*1067.17*/("""}"""),format.raw/*1067.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*1069.51*/("""{"""),format.raw/*1069.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*1072.17*/("""}"""),format.raw/*1072.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*1073.52*/("""{"""),format.raw/*1073.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*1076.17*/("""}"""),format.raw/*1076.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*1077.52*/("""{"""),format.raw/*1077.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*1080.17*/("""}"""),format.raw/*1080.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*1081.52*/("""{"""),format.raw/*1081.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*1084.17*/("""}"""),format.raw/*1084.18*/("""
            """),format.raw/*1085.13*/("""}"""),format.raw/*1085.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1086.59*/("""{"""),format.raw/*1086.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*1089.13*/("""}"""),format.raw/*1089.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1090.49*/("""{"""),format.raw/*1090.50*/("""
            """),format.raw/*1091.13*/("""}"""),format.raw/*1091.14*/("""
        """),format.raw/*1092.9*/("""}"""),format.raw/*1092.10*/(""");
        $.ajax("""),format.raw/*1093.16*/("""{"""),format.raw/*1093.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1098.54*/("""{"""),format.raw/*1098.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1100.44*/("""{"""),format.raw/*1100.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1107.17*/("""}"""),format.raw/*1107.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html = "<img src='"+data.url+"' width='820'/>";
                $("#Image").html(html);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*1114.13*/("""}"""),format.raw/*1114.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1115.59*/("""{"""),format.raw/*1115.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*1118.13*/("""}"""),format.raw/*1118.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1119.49*/("""{"""),format.raw/*1119.50*/("""
            """),format.raw/*1120.13*/("""}"""),format.raw/*1120.14*/("""
        """),format.raw/*1121.9*/("""}"""),format.raw/*1121.10*/(""");
      """),format.raw/*1122.7*/("""}"""),format.raw/*1122.8*/(""");
    """),format.raw/*1123.5*/("""}"""),format.raw/*1123.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.51*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*1125.2*/(""" """),_display_(Seq[Any](/*1125.4*/main("Parameters of ConfId", scripts)/*1125.41*/{_display_(Seq[Any](format.raw/*1125.42*/(""" """),_display_(Seq[Any](/*1125.44*/flash_message())),format.raw/*1125.59*/("""
<p>
<div id="source1" style="display: none;">"""),_display_(Seq[Any](/*1127.43*/parameters/*1127.53*/.getSource1())),format.raw/*1127.66*/("""</div>
<div id="variableName1" style="display: none;">"""),_display_(Seq[Any](/*1128.49*/parameters/*1128.59*/.getVaribaleName1())),format.raw/*1128.78*/("""</div>
<div id="pressureLevel1" style="display: none;">"""),_display_(Seq[Any](/*1129.50*/parameters/*1129.60*/.getPressureLevel1())),format.raw/*1129.80*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1130.50*/parameters/*1130.60*/.getStartYear())),format.raw/*1130.75*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*1131.44*/parameters/*1131.54*/.getStartLat())),format.raw/*1131.68*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*1132.44*/parameters/*1132.54*/.getStartLon())),format.raw/*1132.68*/("""</div>
<div id="source2" style="display: none;">"""),_display_(Seq[Any](/*1133.43*/parameters/*1133.53*/.getSource2())),format.raw/*1133.66*/("""</div>
<div id="variableName2" style="display: none;">"""),_display_(Seq[Any](/*1134.49*/parameters/*1134.59*/.getVaribaleName2())),format.raw/*1134.78*/("""</div>
<div id="pressureLevel2" style="display: none;">"""),_display_(Seq[Any](/*1135.50*/parameters/*1135.60*/.getPressureLevel2())),format.raw/*1135.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1136.48*/parameters/*1136.58*/.getEndYear())),format.raw/*1136.71*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*1137.42*/parameters/*1137.52*/.getEndLat())),format.raw/*1137.64*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*1138.42*/parameters/*1138.52*/.getEndLon())),format.raw/*1138.64*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*1139.52*/parameters/*1139.62*/.getExecutionPurpose())),format.raw/*1139.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*1140.41*/parameters/*1140.51*/.getImage())),format.raw/*1140.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*1141.43*/parameters/*1141.53*/.getDataUrl())),format.raw/*1141.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*1142.55*/parameters/*1142.65*/.getServiceResponse())),format.raw/*1142.86*/("""</div>
<table border="1">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Difference Plot of Two Time Averaged Variables</b><br>
				<br> This service calculates the differences between two
				specified variables and displays the lat-lon maps of the two
				variables and their differences. <br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<center>data 1</center>
		</td>
		<td colspan="2">
			<center>data 2</center>
		</td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data1" , id="data1" onchange="select_data1(1)">
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
				<optgroup label="Observation">
					<option>NASA/MODIS</option>
					<option>NASA/AMSRE</option>
					<option>NASA/TRMM</option>
					<option>NASA/GPCP</option>
					<option>NASA/QuikSCAT</option>
					<option>NASA/AVISO</option>
					<option>NASA/GRACE</option>
					<option>NOAA/NODC</option>
					<option>NASA/CERES</option>
					<option>NASA/AIRS</option>
					<option>NASA/MLS</option>
					<option>ARGO/ARGO</option>
				</optgroup>
				<optgroup label="Reanalysis">
					<option>ECMWF/interim</option>
				</optgroup>
		</select></td>
		<td>source:</td>
		<td><select name="data2" , id="data2" onchange="select_data1(2)">
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
				<optgroup label="Observation">
					<option>NASA/MODIS</option>
					<option>NASA/AMSRE</option>
					<option>NASA/TRMM</option>
					<option>NASA/GPCP</option>
					<option>NASA/QuikSCAT</option>
					<option>NASA/AVISO</option>
					<option>NASA/GRACE</option>
					<option>NOAA/NODC</option>
					<option>NASA/CERES</option>
					<option>NASA/AIRS</option>
					<option>NASA/MLS</option>
					<option>ARGO/ARGO</option>
				</optgroup>
				<optgroup label="Reanalysis">
					<option>ECMWF/interim</option>
				</optgroup>
		</select></td>
	</tr>
	<tr>
		<td>variable name:</td>
		<td><select name="var1" , id="var1" onchange="select_var1(1)">
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
				<option>Air Temperature</option>
				<option>Specific Humidity</option>
				<option>Cloud Ice Water Content</option>
				<option>Cloud Liquid Water Content</option>
				<option>Ocean Temperature</option>
				<option>Ocean Salinity</option>
				<option>Vertical Wind Velocity</option>
				<option>Relative Humidity</option>
		</select></td>
		<td>variable name:</td>
		<td><select name="var2" , id="var2" onchange="select_var1(2)">
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
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar)
		</td>
		<td><input id="pres1" value="500" alt="pressure" /></td>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar)
		</td>
		<td><input id="pres2" value="500" alt="pressure" /></td>
	</tr>
	<tr>
	</tr>
	<tr>
		<td>start year-month:</td>
		<td><input id="t0" value="""),_display_(Seq[Any](/*1327.29*/parameters/*1327.39*/.getStartYear())),format.raw/*1327.54*/(""" alt="start" /></td>
		<td>end year-month:</td>
		<td><input id="t1" value="""),_display_(Seq[Any](/*1329.29*/parameters/*1329.39*/.getEndYear())),format.raw/*1329.52*/(""" alt="end" /></td>
	</tr>
	<tr>
		<td>start lat (deg):</td>
		<td><input id="lat0" value="""),_display_(Seq[Any](/*1333.31*/parameters/*1333.41*/.getStartLat())),format.raw/*1333.55*/("""></td>
		<td>end lat (deg):</td>
		<td><input id="lat1" value="""),_display_(Seq[Any](/*1335.31*/parameters/*1335.41*/.getEndLat())),format.raw/*1335.53*/("""></td>
	</tr>
	<tr>
		<td>start lon (deg):</td>
		<td><input id="lon0" value="""),_display_(Seq[Any](/*1339.31*/parameters/*1339.41*/.getStartLon())),format.raw/*1339.55*/("""></td>
		<td>end lon (deg):</td>
		<td><input id="lon1" value="""),_display_(Seq[Any](/*1341.31*/parameters/*1341.41*/.getEndLon())),format.raw/*1341.53*/("""></td>
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
		<td colspan="2" align="center"><input id="scatterPlot2V"
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
		<td colspan="4" align="center"><textarea id="Response" cols="89"
				rows="6">Service Response Text Here</textarea></td>
	</tr>
</table>
""")))})),format.raw/*1374.2*/("""
"""))}
    }
    
    def render(parameters:metadata.DiffPlotTwoTimeAveragedVar): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.DiffPlotTwoTimeAveragedVar) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:49 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/differencePlotTwoTimeAveragedVariables.scala.html
                    HASH: 6b18532b7d67b75778111925f13a1035f6731334
                    MATRIX: 3239->1205|3382->1353|3397->1360|3482->1364|3533->1379|3548->1385|3610->1425|3672->1451|3687->1457|3748->1496|3833->1546|3848->1552|3915->1597|4120->1766|4135->1772|4191->1806|4276->1856|4291->1862|4347->1896|4520->2041|4549->2042|5039->2505|5067->2506|5130->2541|5159->2542|7022->4377|7051->4378|7114->4412|7144->4413|9010->6251|9039->6252|9101->6285|9131->6286|9332->6458|9362->6459|9430->6499|9459->6500|9530->6542|9560->6543|9628->6583|9657->6584|9727->6625|9757->6626|9825->6666|9854->6667|9924->6708|9954->6709|10022->6749|10051->6750|10125->6795|10155->6796|10223->6836|10252->6837|10323->6879|10353->6880|10421->6920|10450->6921|10521->6963|10551->6964|10619->7004|10648->7005|10718->7046|10748->7047|10816->7087|10845->7088|10916->7130|10946->7131|11014->7171|11043->7172|11113->7213|11143->7214|11211->7254|11240->7255|11309->7295|11339->7296|11407->7336|11436->7337|11506->7378|11536->7379|11604->7419|11633->7420|11707->7465|11737->7466|11804->7505|11833->7506|11904->7548|11934->7549|12001->7588|12030->7589|12100->7630|12130->7631|12197->7670|12226->7671|12296->7712|12326->7713|12393->7752|12422->7753|12492->7794|12522->7795|12589->7834|12618->7835|12689->7877|12719->7878|12786->7917|12815->7918|12891->7965|12921->7966|12988->8005|13017->8006|13090->8050|13120->8051|13187->8090|13216->8091|13288->8134|13318->8135|13385->8174|13414->8175|13483->8215|13513->8216|13580->8255|13609->8256|13682->8300|13712->8301|13780->8341|13809->8342|13882->8386|13912->8387|13980->8427|14009->8428|14084->8474|14114->8475|14182->8515|14211->8516|14285->8561|14315->8562|14383->8602|14412->8603|14445->8608|14474->8609|14535->8641|14565->8642|14766->8814|14796->8815|14864->8855|14893->8856|14964->8898|14994->8899|15062->8939|15091->8940|15161->8981|15191->8982|15259->9022|15288->9023|15358->9064|15388->9065|15456->9105|15485->9106|15559->9151|15589->9152|15657->9192|15686->9193|15757->9235|15787->9236|15855->9276|15884->9277|15955->9319|15985->9320|16053->9360|16082->9361|16152->9402|16182->9403|16250->9443|16279->9444|16350->9486|16380->9487|16448->9527|16477->9528|16547->9569|16577->9570|16645->9610|16674->9611|16743->9651|16773->9652|16841->9692|16870->9693|16940->9734|16970->9735|17038->9775|17067->9776|17141->9821|17171->9822|17238->9861|17267->9862|17338->9904|17368->9905|17435->9944|17464->9945|17534->9986|17564->9987|17631->10026|17660->10027|17730->10068|17760->10069|17827->10108|17856->10109|17926->10150|17956->10151|18023->10190|18052->10191|18123->10233|18153->10234|18220->10273|18249->10274|18325->10321|18355->10322|18422->10361|18451->10362|18524->10406|18554->10407|18621->10446|18650->10447|18722->10490|18752->10491|18819->10530|18848->10531|18917->10571|18947->10572|19014->10611|19043->10612|19116->10656|19146->10657|19214->10697|19243->10698|19316->10742|19346->10743|19414->10783|19443->10784|19518->10830|19548->10831|19616->10871|19645->10872|19719->10917|19749->10918|19817->10958|19846->10959|19879->10964|19908->10965|19979->11008|20008->11009|20119->11092|20148->11093|20210->11127|20239->11128|20301->11161|20331->11162|20409->11212|20438->11213|20492->11238|20522->11239|20600->11289|20629->11290|21807->12440|21836->12441|21900->12477|21929->12478|21991->12511|22021->12512|22100->12563|22129->12564|22183->12589|22213->12590|22292->12641|22321->12642|22400->12693|22429->12694|22492->12729|22521->12730|22583->12763|22613->12764|22692->12815|22721->12816|22775->12841|22805->12842|22884->12893|22913->12894|22993->12946|23022->12947|23084->12981|23113->12982|23184->13024|23214->13025|23288->13071|23317->13072|23371->13097|23401->13098|23473->13142|23502->13143|23611->13223|23641->13224|23691->13245|23721->13246|23785->13282|23814->13283|23868->13308|23898->13309|23962->13345|23991->13346|24049->13376|24078->13377|24159->13429|24189->13430|24239->13451|24269->13452|24334->13489|24363->13490|24418->13516|24448->13517|24513->13554|24542->13555|24602->13587|24631->13588|24716->13644|24746->13645|24797->13667|24827->13668|24893->13706|24922->13707|24977->13733|25007->13734|25073->13772|25102->13773|25162->13805|25191->13806|25271->13857|25301->13858|25352->13880|25382->13881|25447->13918|25476->13919|25531->13945|25561->13946|25626->13983|25655->13984|25715->14016|25744->14017|25832->14076|25862->14077|25913->14099|25943->14100|26009->14138|26038->14139|26093->14165|26123->14166|26189->14204|26218->14205|26278->14237|26307->14238|26396->14298|26426->14299|26478->14322|26508->14323|26574->14361|26603->14362|26658->14388|26688->14389|26754->14427|26783->14428|26843->14460|26872->14461|26957->14517|26987->14518|27038->14540|27068->14541|27138->14583|27167->14584|27222->14610|27252->14611|27322->14653|27351->14654|27411->14686|27440->14687|27520->14738|27550->14739|27601->14761|27631->14762|27697->14800|27726->14801|27781->14827|27811->14828|27877->14866|27906->14867|27966->14899|27995->14900|28072->14948|28102->14949|28153->14971|28183->14972|28249->15010|28278->15011|28333->15037|28363->15038|28429->15076|28458->15077|28518->15109|28547->15110|28642->15176|28672->15177|28722->15198|28752->15199|28817->15236|28846->15237|28901->15263|28931->15264|28996->15301|29025->15302|29085->15334|29114->15335|29210->15402|29240->15403|29290->15424|29320->15425|29383->15460|29412->15461|29467->15487|29497->15488|29560->15523|29589->15524|29649->15556|29678->15557|29785->15635|29815->15636|29865->15657|29895->15658|29962->15697|29991->15698|30046->15724|30076->15725|30143->15764|30172->15765|30232->15797|30261->15798|30369->15877|30399->15878|30449->15899|30479->15900|30547->15940|30576->15941|30631->15967|30661->15968|30729->16008|30758->16009|30818->16041|30847->16042|30947->16113|30977->16114|31027->16135|31057->16136|31122->16173|31151->16174|31206->16200|31236->16201|31301->16238|31330->16239|31390->16271|31419->16272|31520->16344|31550->16345|31600->16366|31630->16367|31695->16404|31724->16405|31779->16431|31809->16432|31874->16469|31903->16470|31963->16502|31992->16503|32090->16572|32120->16573|32170->16594|32200->16595|32265->16632|32294->16633|32349->16659|32379->16660|32444->16697|32473->16698|32533->16730|32562->16731|32661->16801|32691->16802|32741->16823|32771->16824|32836->16861|32865->16862|32920->16888|32950->16889|33015->16926|33044->16927|33104->16959|33133->16960|33243->17041|33273->17042|33323->17063|33353->17064|33420->17103|33449->17104|33504->17130|33534->17131|33601->17170|33630->17171|33690->17203|33719->17204|33830->17286|33860->17287|33910->17308|33940->17309|34007->17348|34036->17349|34091->17375|34121->17376|34188->17415|34217->17416|34277->17448|34306->17449|34415->17529|34445->17530|34495->17551|34525->17552|34592->17591|34621->17592|34676->17618|34706->17619|34773->17658|34802->17659|34862->17691|34891->17692|34985->17757|35015->17758|35065->17779|35095->17780|35160->17817|35189->17818|35244->17844|35274->17845|35339->17882|35368->17883|35428->17915|35457->17916|35560->17990|35590->17991|35640->18012|35670->18013|35737->18052|35766->18053|35821->18079|35851->18080|35918->18119|35947->18120|36007->18152|36036->18153|36129->18217|36159->18218|36209->18239|36239->18240|36304->18277|36333->18278|36388->18304|36418->18305|36483->18342|36512->18343|36572->18375|36601->18376|36705->18451|36735->18452|36785->18473|36815->18474|36882->18513|36911->18514|36966->18540|36996->18541|37063->18580|37092->18581|37152->18613|37181->18614|37275->18679|37305->18680|37355->18701|37385->18702|37450->18739|37479->18740|37534->18766|37564->18767|37629->18804|37658->18805|37718->18837|37747->18838|37824->18886|37854->18887|37904->18908|37934->18909|37997->18944|38026->18945|38081->18971|38111->18972|38174->19007|38203->19008|38262->19039|38291->19040|38370->19090|38400->19091|38450->19112|38480->19113|38544->19149|38573->19150|38628->19176|38658->19177|38722->19213|38751->19214|38810->19245|38839->19246|38924->19302|38954->19303|39004->19324|39034->19325|39098->19361|39127->19362|39182->19388|39212->19389|39276->19425|39305->19426|39364->19457|39393->19458|39481->19517|39511->19518|39561->19539|39591->19540|39655->19576|39684->19577|39739->19603|39769->19604|39833->19640|39862->19641|39921->19672|39950->19673|40029->19723|40059->19724|40109->19745|40139->19746|40202->19781|40231->19782|40286->19808|40316->19809|40379->19844|40408->19845|40467->19876|40496->19877|40572->19924|40602->19925|40652->19946|40682->19947|40745->19982|40774->19983|40829->20009|40859->20010|40922->20045|40951->20046|41010->20077|41039->20078|41123->20133|41153->20134|41203->20155|41233->20156|41297->20192|41326->20193|41381->20219|41411->20220|41475->20256|41504->20257|41563->20288|41592->20289|41671->20339|41701->20340|41751->20361|41781->20362|41845->20398|41874->20399|41929->20425|41959->20426|42023->20462|42052->20463|42111->20494|42140->20495|42173->20500|42202->20501|42265->20536|42294->20537|42379->20593|42409->20594|42530->20687|42559->20688|42613->20713|42643->20714|42764->20807|42793->20808|42895->20881|42925->20882|43087->21016|43116->21017|43190->21062|43220->21063|43418->21233|43447->21234|43520->21278|43550->21279|43711->21412|43740->21413|43813->21457|43843->21458|44004->21591|44033->21592|44110->21640|44140->21641|44375->21848|44404->21849|44478->21894|44508->21895|44669->22028|44698->22029|44772->22074|44802->22075|45001->22246|45030->22247|45103->22291|45133->22292|45334->22465|45363->22466|45437->22511|45467->22512|46048->23065|46077->23066|46150->23110|46180->23111|46380->23283|46409->23284|46481->23327|46511->23328|46711->23500|46740->23501|46813->23545|46843->23546|47043->23718|47072->23719|47148->23766|47178->23767|48132->24693|48161->24694|48236->24740|48266->24741|49296->25743|49325->25744|49398->25788|49428->25789|50531->26864|50560->26865|51015->27291|51045->27292|52186->28405|52215->28406|52292->28454|52322->28455|52559->28664|52588->28665|52644->28693|52673->28694|52735->28727|52765->28728|52841->28775|52871->28776|52979->28856|53008->28857|53088->28908|53118->28909|55996->31757|56027->31758|56222->31923|56253->31924|56360->32001|56391->32002|56720->32301|56751->32302|57394->32915|57425->32916|57597->33058|57628->33059|57714->33115|57745->33116|57917->33258|57948->33259|58044->33325|58075->33326|58233->33454|58264->33455|58316->33477|58347->33478|58420->33521|58451->33522|58539->33580|58570->33581|58624->33605|58655->33606|58742->33663|58773->33664|58845->33706|58876->33707|58964->33765|58995->33766|59049->33790|59080->33791|59167->33848|59198->33849|59245->33866|59276->33867|59409->33970|59440->33971|59635->34136|59666->34137|59748->34189|59779->34190|60016->34397|60047->34398|60129->34450|60160->34451|60397->34658|60428->34659|60510->34711|60541->34712|60842->34983|60873->34984|60916->34997|60947->34998|61037->35058|61068->35059|61177->35138|61208->35139|61288->35189|61319->35190|61362->35203|61393->35204|61431->35213|61462->35214|61510->35232|61541->35233|61726->35388|61757->35389|61864->35466|61895->35467|62224->35766|62255->35767|62600->36082|62631->36083|62721->36143|62752->36144|62889->36251|62920->36252|63000->36302|63031->36303|63074->36316|63105->36317|63143->36326|63174->36327|63212->36336|63242->36337|63278->36344|63308->36345|63364->1254|63392->1272|63458->1303|63473->1309|63535->1349|63567->36361|63606->36363|63654->36400|63695->36401|63735->36403|63774->36418|63859->36465|63880->36475|63917->36488|64010->36543|64031->36553|64074->36572|64168->36628|64189->36638|64233->36658|64327->36714|64348->36724|64387->36739|64475->36789|64496->36799|64534->36813|64622->36863|64643->36873|64681->36887|64768->36936|64789->36946|64826->36959|64919->37014|64940->37024|64983->37043|65077->37099|65098->37109|65142->37129|65234->37183|65255->37193|65292->37206|65378->37254|65399->37264|65435->37276|65521->37324|65542->37334|65578->37346|65674->37404|65695->37414|65741->37436|65826->37483|65847->37493|65882->37504|65969->37553|65990->37563|66027->37576|66126->37637|66147->37647|66192->37668|73069->44507|73090->44517|73129->44532|73243->44608|73264->44618|73301->44631|73429->44721|73450->44731|73488->44745|73589->44808|73610->44818|73646->44830|73762->44908|73783->44918|73821->44932|73922->44995|73943->45005|73979->45017|74868->45873
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|70->30|70->30|70->30|75->35|75->35|89->49|89->49|90->50|90->50|143->103|143->103|144->104|144->104|197->157|197->157|198->158|198->158|202->162|202->162|204->164|204->164|205->165|205->165|207->167|207->167|208->168|208->168|210->170|210->170|211->171|211->171|213->173|213->173|214->174|214->174|216->176|216->176|217->177|217->177|219->179|219->179|220->180|220->180|222->182|222->182|223->183|223->183|225->185|225->185|226->186|226->186|228->188|228->188|229->189|229->189|231->191|231->191|232->192|232->192|234->194|234->194|235->195|235->195|237->197|237->197|238->198|238->198|240->200|240->200|241->201|241->201|243->203|243->203|244->204|244->204|246->206|246->206|247->207|247->207|249->209|249->209|250->210|250->210|252->212|252->212|253->213|253->213|255->215|255->215|256->216|256->216|258->218|258->218|259->219|259->219|261->221|261->221|262->222|262->222|264->224|264->224|265->225|265->225|267->227|267->227|268->228|268->228|270->230|270->230|271->231|271->231|273->233|273->233|274->234|274->234|276->236|276->236|277->237|277->237|279->239|279->239|280->240|280->240|281->241|281->241|285->245|285->245|287->247|287->247|288->248|288->248|290->250|290->250|291->251|291->251|293->253|293->253|294->254|294->254|296->256|296->256|297->257|297->257|299->259|299->259|300->260|300->260|302->262|302->262|303->263|303->263|305->265|305->265|306->266|306->266|308->268|308->268|309->269|309->269|311->271|311->271|312->272|312->272|314->274|314->274|315->275|315->275|317->277|317->277|318->278|318->278|320->280|320->280|321->281|321->281|323->283|323->283|324->284|324->284|326->286|326->286|327->287|327->287|329->289|329->289|330->290|330->290|332->292|332->292|333->293|333->293|335->295|335->295|336->296|336->296|338->298|338->298|339->299|339->299|341->301|341->301|342->302|342->302|344->304|344->304|345->305|345->305|347->307|347->307|348->308|348->308|350->310|350->310|351->311|351->311|353->313|353->313|354->314|354->314|356->316|356->316|357->317|357->317|359->319|359->319|360->320|360->320|362->322|362->322|363->323|363->323|365->325|365->325|368->328|368->328|370->330|370->330|372->332|372->332|374->334|374->334|375->335|375->335|377->337|377->337|411->371|411->371|413->373|413->373|415->375|415->375|417->377|417->377|418->378|418->378|420->380|420->380|423->383|423->383|425->385|425->385|427->387|427->387|429->389|429->389|430->390|430->390|432->392|432->392|435->395|435->395|437->397|437->397|439->399|439->399|441->401|441->401|442->402|442->402|444->404|444->404|446->406|446->406|447->407|447->407|449->409|449->409|450->410|450->410|452->412|452->412|454->414|454->414|455->415|455->415|456->416|456->416|458->418|458->418|459->419|459->419|461->421|461->421|463->423|463->423|464->424|464->424|465->425|465->425|467->427|467->427|468->428|468->428|470->430|470->430|472->432|472->432|473->433|473->433|474->434|474->434|476->436|476->436|477->437|477->437|479->439|479->439|481->441|481->441|482->442|482->442|483->443|483->443|485->445|485->445|486->446|486->446|488->448|488->448|490->450|490->450|491->451|491->451|492->452|492->452|494->454|494->454|495->455|495->455|497->457|497->457|499->459|499->459|500->460|500->460|501->461|501->461|503->463|503->463|504->464|504->464|506->466|506->466|508->468|508->468|509->469|509->469|510->470|510->470|512->472|512->472|513->473|513->473|515->475|515->475|517->477|517->477|518->478|518->478|519->479|519->479|521->481|521->481|522->482|522->482|524->484|524->484|526->486|526->486|527->487|527->487|528->488|528->488|530->490|530->490|531->491|531->491|533->493|533->493|535->495|535->495|536->496|536->496|537->497|537->497|539->499|539->499|540->500|540->500|542->502|542->502|544->504|544->504|545->505|545->505|546->506|546->506|548->508|548->508|549->509|549->509|551->511|551->511|553->513|553->513|554->514|554->514|555->515|555->515|557->517|557->517|558->518|558->518|560->520|560->520|562->522|562->522|563->523|563->523|564->524|564->524|566->526|566->526|567->527|567->527|569->529|569->529|571->531|571->531|572->532|572->532|573->533|573->533|575->535|575->535|576->536|576->536|578->538|578->538|580->540|580->540|581->541|581->541|582->542|582->542|584->544|584->544|585->545|585->545|587->547|587->547|589->549|589->549|590->550|590->550|591->551|591->551|593->553|593->553|594->554|594->554|596->556|596->556|598->558|598->558|599->559|599->559|600->560|600->560|602->562|602->562|603->563|603->563|605->565|605->565|607->567|607->567|608->568|608->568|609->569|609->569|611->571|611->571|612->572|612->572|614->574|614->574|616->576|616->576|617->577|617->577|618->578|618->578|620->580|620->580|621->581|621->581|623->583|623->583|625->585|625->585|626->586|626->586|627->587|627->587|629->589|629->589|630->590|630->590|632->592|632->592|634->594|634->594|635->595|635->595|636->596|636->596|638->598|638->598|639->599|639->599|641->601|641->601|643->603|643->603|644->604|644->604|645->605|645->605|647->607|647->607|648->608|648->608|650->610|650->610|652->612|652->612|653->613|653->613|654->614|654->614|656->616|656->616|657->617|657->617|659->619|659->619|661->621|661->621|662->622|662->622|663->623|663->623|665->625|665->625|666->626|666->626|668->628|668->628|670->630|670->630|671->631|671->631|672->632|672->632|674->634|674->634|675->635|675->635|677->637|677->637|679->639|679->639|680->640|680->640|681->641|681->641|683->643|683->643|684->644|684->644|686->646|686->646|688->648|688->648|689->649|689->649|690->650|690->650|692->652|692->652|693->653|693->653|695->655|695->655|697->657|697->657|698->658|698->658|699->659|699->659|701->661|701->661|702->662|702->662|704->664|704->664|706->666|706->666|707->667|707->667|708->668|708->668|710->670|710->670|711->671|711->671|713->673|713->673|715->675|715->675|716->676|716->676|717->677|717->677|719->679|719->679|720->680|720->680|722->682|722->682|724->684|724->684|725->685|725->685|726->686|726->686|728->688|728->688|729->689|729->689|731->691|731->691|733->693|733->693|734->694|734->694|735->695|735->695|737->697|737->697|738->698|738->698|740->700|740->700|742->702|742->702|743->703|743->703|745->705|745->705|748->708|748->708|751->711|751->711|752->712|752->712|755->715|755->715|757->717|757->717|762->722|762->722|763->723|763->723|769->729|769->729|770->730|770->730|775->735|775->735|776->736|776->736|781->741|781->741|782->742|782->742|789->749|789->749|790->750|790->750|795->755|795->755|796->756|796->756|802->762|802->762|803->763|803->763|809->769|809->769|810->770|810->770|826->786|826->786|827->787|827->787|833->793|833->793|834->794|834->794|840->800|840->800|841->801|841->801|847->807|847->807|848->808|848->808|874->834|874->834|875->835|875->835|903->863|903->863|904->864|904->864|934->894|934->894|941->901|941->901|972->932|972->932|973->933|973->933|980->940|980->940|982->942|982->942|983->943|983->943|984->944|984->944|987->947|987->947|988->948|988->948|1055->1015|1055->1015|1060->1020|1060->1020|1062->1022|1062->1022|1069->1029|1069->1029|1082->1042|1082->1042|1085->1045|1085->1045|1086->1046|1086->1046|1089->1049|1089->1049|1090->1050|1090->1050|1093->1053|1093->1053|1094->1054|1094->1054|1095->1055|1095->1055|1097->1057|1097->1057|1098->1058|1098->1058|1100->1060|1100->1060|1101->1061|1101->1061|1103->1063|1103->1063|1104->1064|1104->1064|1106->1066|1106->1066|1107->1067|1107->1067|1109->1069|1109->1069|1112->1072|1112->1072|1113->1073|1113->1073|1116->1076|1116->1076|1117->1077|1117->1077|1120->1080|1120->1080|1121->1081|1121->1081|1124->1084|1124->1084|1125->1085|1125->1085|1126->1086|1126->1086|1129->1089|1129->1089|1130->1090|1130->1090|1131->1091|1131->1091|1132->1092|1132->1092|1133->1093|1133->1093|1138->1098|1138->1098|1140->1100|1140->1100|1147->1107|1147->1107|1154->1114|1154->1114|1155->1115|1155->1115|1158->1118|1158->1118|1159->1119|1159->1119|1160->1120|1160->1120|1161->1121|1161->1121|1162->1122|1162->1122|1163->1123|1163->1123|1166->18|1166->19|1167->20|1167->20|1167->20|1168->1125|1168->1125|1168->1125|1168->1125|1168->1125|1168->1125|1170->1127|1170->1127|1170->1127|1171->1128|1171->1128|1171->1128|1172->1129|1172->1129|1172->1129|1173->1130|1173->1130|1173->1130|1174->1131|1174->1131|1174->1131|1175->1132|1175->1132|1175->1132|1176->1133|1176->1133|1176->1133|1177->1134|1177->1134|1177->1134|1178->1135|1178->1135|1178->1135|1179->1136|1179->1136|1179->1136|1180->1137|1180->1137|1180->1137|1181->1138|1181->1138|1181->1138|1182->1139|1182->1139|1182->1139|1183->1140|1183->1140|1183->1140|1184->1141|1184->1141|1184->1141|1185->1142|1185->1142|1185->1142|1370->1327|1370->1327|1370->1327|1372->1329|1372->1329|1372->1329|1376->1333|1376->1333|1376->1333|1378->1335|1378->1335|1378->1335|1382->1339|1382->1339|1382->1339|1384->1341|1384->1341|1384->1341|1417->1374
                    -- GENERATED --
                */
            