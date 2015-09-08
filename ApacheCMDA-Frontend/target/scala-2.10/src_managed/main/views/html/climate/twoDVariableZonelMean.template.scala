
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
object twoDVariableZonelMean extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.TwoDVarZonalMean,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.TwoDVarZonalMean):play.api.templates.HtmlFormat.Appendable = {
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
<script
	type='text/javascript" src=""""),_display_(Seq[Any](/*32.31*/routes/*32.37*/.Assets.at("javascripts/xmisc.js"))),format.raw/*32.71*/("""'></script>
<script type="text/javascript">
    var Response = null;
    var variable = "";
    window.onload = function() """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
      changeDataSource(); 
      select_data();
      changeVariableName();
      select_var();
      var z=document.getElementById("download_data");
      z.disabled=false;
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      var selectMonths = $('#selectMonths').text();
      $('#months option:contains('+selectMonths+')').prop("""),format.raw/*46.59*/("""{"""),format.raw/*46.60*/("""selected: true"""),format.raw/*46.74*/("""}"""),format.raw/*46.75*/(""");
      select_months();
      select_monthsByPara();
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      var variableScale = $('#variableScale').text();
      if(variableScale == "0") """),format.raw/*52.32*/("""{"""),format.raw/*52.33*/("""
        $('#radioLin').prop( "checked", true );
        $('#radioLog').prop( "checked", false );
      """),format.raw/*55.7*/("""}"""),format.raw/*55.8*/("""
      else """),format.raw/*56.12*/("""{"""),format.raw/*56.13*/("""
        $('#radioLin').prop( "checked", false );
        $('#radioLog').prop( "checked", true );
      """),format.raw/*59.7*/("""}"""),format.raw/*59.8*/("""
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""
    function changeDataSource()"""),format.raw/*66.32*/("""{"""),format.raw/*66.33*/("""
    	var dataSource = $('#dataSource').text();
     	var x = document.getElementById("data");
     	if(dataSource == "NASA_MODIS" )"""),format.raw/*69.38*/("""{"""),format.raw/*69.39*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*71.7*/("""}"""),format.raw/*71.8*/("""
     	else if(dataSource == "NASA_AMSRE" )"""),format.raw/*72.43*/("""{"""),format.raw/*72.44*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*74.7*/("""}"""),format.raw/*74.8*/("""
     	else if(dataSource == "NASA_TRMM" )"""),format.raw/*75.42*/("""{"""),format.raw/*75.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*77.7*/("""}"""),format.raw/*77.8*/("""
     	else if(dataSource == "NASA_GPCP" )"""),format.raw/*78.42*/("""{"""),format.raw/*78.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*80.7*/("""}"""),format.raw/*80.8*/("""
     	else if(dataSource == "NASA_QuikSCAT" )"""),format.raw/*81.46*/("""{"""),format.raw/*81.47*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*83.7*/("""}"""),format.raw/*83.8*/("""
     	else if(dataSource == "NASA_AVISO" )"""),format.raw/*84.43*/("""{"""),format.raw/*84.44*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*86.7*/("""}"""),format.raw/*86.8*/("""
     	else if(dataSource == "NASA_GRACE" )"""),format.raw/*87.43*/("""{"""),format.raw/*87.44*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*89.7*/("""}"""),format.raw/*89.8*/("""
     	else if(dataSource == "NOAA_NODC" )"""),format.raw/*90.42*/("""{"""),format.raw/*90.43*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
     	else if(dataSource == "NASA_CERES" )"""),format.raw/*93.43*/("""{"""),format.raw/*93.44*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*95.7*/("""}"""),format.raw/*95.8*/("""
     	else if(dataSource == "CCCMA_CANESM2" )"""),format.raw/*96.46*/("""{"""),format.raw/*96.47*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""
     	else if(dataSource == "GFDL_ESM2G" )"""),format.raw/*99.43*/("""{"""),format.raw/*99.44*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*101.7*/("""}"""),format.raw/*101.8*/("""
     	else if(dataSource == "GISS_E2-H" )"""),format.raw/*102.42*/("""{"""),format.raw/*102.43*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*104.7*/("""}"""),format.raw/*104.8*/("""
     	else if(dataSource == "GISS_E2-R" )"""),format.raw/*105.42*/("""{"""),format.raw/*105.43*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*107.7*/("""}"""),format.raw/*107.8*/("""
     	else if(dataSource == "NCAR_CAM5" )"""),format.raw/*108.42*/("""{"""),format.raw/*108.43*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*110.7*/("""}"""),format.raw/*110.8*/("""
     	else if(dataSource == "NCC_NORESM" )"""),format.raw/*111.43*/("""{"""),format.raw/*111.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*113.7*/("""}"""),format.raw/*113.8*/("""
     	else if(dataSource == "UKMO_HadGEM2-ES" )"""),format.raw/*114.48*/("""{"""),format.raw/*114.49*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*116.7*/("""}"""),format.raw/*116.8*/("""
     	else if(dataSource == "CCCMA_CANAM4" )"""),format.raw/*117.45*/("""{"""),format.raw/*117.46*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*119.7*/("""}"""),format.raw/*119.8*/("""
     	else if(dataSource == "CSIRO_MK3.6" )"""),format.raw/*120.44*/("""{"""),format.raw/*120.45*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*122.7*/("""}"""),format.raw/*122.8*/("""
     	else if(dataSource == "GFDL_CM3" )"""),format.raw/*123.41*/("""{"""),format.raw/*123.42*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*125.7*/("""}"""),format.raw/*125.8*/("""
     	else if(dataSource == "IPSL_CM5A-LR" )"""),format.raw/*126.45*/("""{"""),format.raw/*126.46*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*128.7*/("""}"""),format.raw/*128.8*/("""
     	else if(dataSource == "MIROC_MIROC5" )"""),format.raw/*129.45*/("""{"""),format.raw/*129.46*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*131.7*/("""}"""),format.raw/*131.8*/("""
     	else if(dataSource == "UKMO_HADGEM2-A" )"""),format.raw/*132.47*/("""{"""),format.raw/*132.48*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*134.7*/("""}"""),format.raw/*134.8*/("""
     	else if(dataSource == "ECMWF_interim" )"""),format.raw/*135.46*/("""{"""),format.raw/*135.47*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*137.7*/("""}"""),format.raw/*137.8*/("""
    """),format.raw/*138.5*/("""}"""),format.raw/*138.6*/("""
    function changeVariableName()"""),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
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
    """),format.raw/*192.5*/("""}"""),format.raw/*192.6*/("""
    function select_monthsByPara()"""),format.raw/*193.35*/("""{"""),format.raw/*193.36*/("""
    	var monthsByPara = $('#monthsPara').text();
    	if(monthsByPara.search("jan")>-1)"""),format.raw/*195.39*/("""{"""),format.raw/*195.40*/("""
    		document.getElementById('Jan').checked = true;
    	"""),format.raw/*197.6*/("""}"""),format.raw/*197.7*/("""
    	if(monthsByPara.search("feb")>-1)"""),format.raw/*198.39*/("""{"""),format.raw/*198.40*/("""
    		document.getElementById('Feb').checked = true;
    	"""),format.raw/*200.6*/("""}"""),format.raw/*200.7*/("""
    	if(monthsByPara.search("mar")>-1)"""),format.raw/*201.39*/("""{"""),format.raw/*201.40*/("""
    		document.getElementById('Mar').checked = true;
    	"""),format.raw/*203.6*/("""}"""),format.raw/*203.7*/("""
    	if(monthsByPara.search("apr")>-1)"""),format.raw/*204.39*/("""{"""),format.raw/*204.40*/("""
    		document.getElementById('Apr').checked = true;
    	"""),format.raw/*206.6*/("""}"""),format.raw/*206.7*/("""
    	if(monthsByPara.search("may")>-1)"""),format.raw/*207.39*/("""{"""),format.raw/*207.40*/("""
    		document.getElementById('May').checked = true;
    	"""),format.raw/*209.6*/("""}"""),format.raw/*209.7*/("""
    	if(monthsByPara.search("jun")>-1)"""),format.raw/*210.39*/("""{"""),format.raw/*210.40*/("""
    		document.getElementById('Jun').checked = true;
    	"""),format.raw/*212.6*/("""}"""),format.raw/*212.7*/("""
    	if(monthsByPara.search("jul")>-1)"""),format.raw/*213.39*/("""{"""),format.raw/*213.40*/("""
    		document.getElementById('Jul').checked = true;
    	"""),format.raw/*215.6*/("""}"""),format.raw/*215.7*/("""
    	if(monthsByPara.search("aug")>-1)"""),format.raw/*216.39*/("""{"""),format.raw/*216.40*/("""
    		document.getElementById('Aug').checked = true;
    	"""),format.raw/*218.6*/("""}"""),format.raw/*218.7*/("""
    	if(monthsByPara.search("sep")>-1)"""),format.raw/*219.39*/("""{"""),format.raw/*219.40*/("""
    		document.getElementById('Sep').checked = true;
    	"""),format.raw/*221.6*/("""}"""),format.raw/*221.7*/("""
    	if(monthsByPara.search("oct")>-1)"""),format.raw/*222.39*/("""{"""),format.raw/*222.40*/("""
    		document.getElementById('Oct').checked = true;
    	"""),format.raw/*224.6*/("""}"""),format.raw/*224.7*/("""
    	if(monthsByPara.search("nov")>-1)"""),format.raw/*225.39*/("""{"""),format.raw/*225.40*/("""
    		document.getElementById('Nov').checked = true;
    	"""),format.raw/*227.6*/("""}"""),format.raw/*227.7*/("""
    	if(monthsByPara.search("dec")>-1)"""),format.raw/*228.39*/("""{"""),format.raw/*228.40*/("""
    		document.getElementById('Dec').checked = true;
    	"""),format.raw/*230.6*/("""}"""),format.raw/*230.7*/("""
    """),format.raw/*231.5*/("""}"""),format.raw/*231.6*/("""
    function disable_download_button()
    """),format.raw/*233.5*/("""{"""),format.raw/*233.6*/("""
    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""
    function enable_download_button()
    """),format.raw/*236.5*/("""{"""),format.raw/*236.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/("""
    function select_all_months()
    """),format.raw/*241.5*/("""{"""),format.raw/*241.6*/("""
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
    """),format.raw/*254.5*/("""}"""),format.raw/*254.6*/("""
    function no_month_check()
    """),format.raw/*256.5*/("""{"""),format.raw/*256.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*268.61*/("""{"""),format.raw/*268.62*/("""
           return true;
          """),format.raw/*270.11*/("""}"""),format.raw/*270.12*/("""
        else
           return false;
    """),format.raw/*273.5*/("""}"""),format.raw/*273.6*/("""
    function reset_months()
    """),format.raw/*275.5*/("""{"""),format.raw/*275.6*/("""
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
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""
    function reset_vars()
    """),format.raw/*290.5*/("""{"""),format.raw/*290.6*/("""
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
    """),format.raw/*317.5*/("""}"""),format.raw/*317.6*/("""
    function select_var()
    """),format.raw/*319.5*/("""{"""),format.raw/*319.6*/("""
      var var_string = $("#var").val();
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
    """),format.raw/*371.5*/("""}"""),format.raw/*371.6*/("""
    function select_data()
    """),format.raw/*373.5*/("""{"""),format.raw/*373.6*/("""
      var data_string = $("#data").val();
      var x=document.getElementById("var");
      reset_vars();
      if (data_string == "NASA/AMSRE") """),format.raw/*377.40*/("""{"""),format.raw/*377.41*/("""
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
      """),format.raw/*403.7*/("""}"""),format.raw/*403.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*404.45*/("""{"""),format.raw/*404.46*/("""
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
      """),format.raw/*429.7*/("""}"""),format.raw/*429.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*430.44*/("""{"""),format.raw/*430.45*/("""
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
      """),format.raw/*456.7*/("""}"""),format.raw/*456.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*457.44*/("""{"""),format.raw/*457.45*/("""
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
      """),format.raw/*483.7*/("""}"""),format.raw/*483.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*484.48*/("""{"""),format.raw/*484.49*/("""
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
      """),format.raw/*508.7*/("""}"""),format.raw/*508.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*509.45*/("""{"""),format.raw/*509.46*/("""
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
      """),format.raw/*535.7*/("""}"""),format.raw/*535.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*536.45*/("""{"""),format.raw/*536.46*/("""
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
      """),format.raw/*561.7*/("""}"""),format.raw/*561.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*562.44*/("""{"""),format.raw/*562.45*/("""
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
      """),format.raw/*587.7*/("""}"""),format.raw/*587.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*588.45*/("""{"""),format.raw/*588.46*/("""
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
      """),format.raw/*603.7*/("""}"""),format.raw/*603.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*604.48*/("""{"""),format.raw/*604.49*/("""
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
      """),format.raw/*630.7*/("""}"""),format.raw/*630.8*/("""
      else """),format.raw/*631.12*/("""{"""),format.raw/*631.13*/("""
        x.options[9].disabled=true;
        x.options[10].disabled=true;
        x.options[11].disabled=true;
        x.options[12].disabled=true;
        x.options[0].selected=true;
      """),format.raw/*637.7*/("""}"""),format.raw/*637.8*/("""
    select_var();
    """),format.raw/*639.5*/("""}"""),format.raw/*639.6*/("""
    function select_months()
    """),format.raw/*641.5*/("""{"""),format.raw/*641.6*/("""
      var s1=document.getElementById("months");
      if (s1.selectedIndex == 1) """),format.raw/*643.34*/("""{"""),format.raw/*643.35*/("""
        reset_months();
      """),format.raw/*645.7*/("""}"""),format.raw/*645.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*646.34*/("""{"""),format.raw/*646.35*/("""
        select_all_months();
      """),format.raw/*648.7*/("""}"""),format.raw/*648.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*649.34*/("""{"""),format.raw/*649.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*654.7*/("""}"""),format.raw/*654.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*655.34*/("""{"""),format.raw/*655.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*660.7*/("""}"""),format.raw/*660.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*661.34*/("""{"""),format.raw/*661.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*666.7*/("""}"""),format.raw/*666.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*667.34*/("""{"""),format.raw/*667.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*672.7*/("""}"""),format.raw/*672.8*/("""
    """),format.raw/*673.5*/("""}"""),format.raw/*673.6*/("""
    $(document).ready(function()"""),format.raw/*674.33*/("""{"""),format.raw/*674.34*/("""
      $("#download_data").click(function(event) """),format.raw/*675.49*/("""{"""),format.raw/*675.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*678.7*/("""}"""),format.raw/*678.8*/(""");
      $("#twodvarzonalmean").click(function(event) """),format.raw/*679.52*/("""{"""),format.raw/*679.53*/("""
		Response = null;
      	if (no_month_check()) """),format.raw/*681.30*/("""{"""),format.raw/*681.31*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*685.9*/("""}"""),format.raw/*685.10*/(""" 
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/twoDimZonalMean?";
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
        $.ajax("""),format.raw/*772.16*/("""{"""),format.raw/*772.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*777.54*/("""{"""),format.raw/*777.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*779.44*/("""{"""),format.raw/*779.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*786.17*/("""}"""),format.raw/*786.18*/("""
                var text = JSON.stringify(data, null, 4);
                var tb = data.time_bounds;
                var bds = String(tb).split(",");
                var lowerT = parseInt(bds[0]);
                var upperT = parseInt(bds[1]);
                var t0I = parseInt(t0);
                var t1I = parseInt(t1);
                if ( lowerT == 0 && upperT ==0 ) """),format.raw/*794.50*/("""{"""),format.raw/*794.51*/("""
                  alert("We do not have data for this source and variable configuration.");
                  return;
                """),format.raw/*797.17*/("""}"""),format.raw/*797.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*799.51*/("""{"""),format.raw/*799.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*802.17*/("""}"""),format.raw/*802.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*803.52*/("""{"""),format.raw/*803.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*806.17*/("""}"""),format.raw/*806.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*807.52*/("""{"""),format.raw/*807.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*810.17*/("""}"""),format.raw/*810.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*811.52*/("""{"""),format.raw/*811.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*814.17*/("""}"""),format.raw/*814.18*/("""
            """),format.raw/*815.13*/("""}"""),format.raw/*815.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*816.59*/("""{"""),format.raw/*816.60*/("""
				$("#Response").html("error!");
				$("#data_url").html("error!");
            """),format.raw/*819.13*/("""}"""),format.raw/*819.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*820.49*/("""{"""),format.raw/*820.50*/("""
            """),format.raw/*821.13*/("""}"""),format.raw/*821.14*/("""
        """),format.raw/*822.9*/("""}"""),format.raw/*822.10*/(""");
        $.ajax("""),format.raw/*823.16*/("""{"""),format.raw/*823.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*828.54*/("""{"""),format.raw/*828.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*830.44*/("""{"""),format.raw/*830.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*837.17*/("""}"""),format.raw/*837.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html1 = "<img src='"+data.url+"' width='680' style=‘display: block; margin: 0 auto;’/>";
                $("#Image").html(html1);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*844.13*/("""}"""),format.raw/*844.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*845.59*/("""{"""),format.raw/*845.60*/("""
		$("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*848.13*/("""}"""),format.raw/*848.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*849.49*/("""{"""),format.raw/*849.50*/("""
            """),format.raw/*850.13*/("""}"""),format.raw/*850.14*/("""
        """),format.raw/*851.9*/("""}"""),format.raw/*851.10*/(""");
      """),format.raw/*852.7*/("""}"""),format.raw/*852.8*/(""");
    """),format.raw/*853.5*/("""}"""),format.raw/*853.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.41*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*855.2*/("""

"""),_display_(Seq[Any](/*857.2*/main("Parameters of ConfId", scripts)/*857.39*/{_display_(Seq[Any](format.raw/*857.40*/(""" """),_display_(Seq[Any](/*857.42*/flash_message())),format.raw/*857.57*/("""   
	 
<p>
<div id="dataSource" style="display: none;">"""),_display_(Seq[Any](/*860.46*/parameters/*860.56*/.getDataSource())),format.raw/*860.72*/("""</div>
<div id="variableName" style="display: none;">"""),_display_(Seq[Any](/*861.48*/parameters/*861.58*/.getVariableName())),format.raw/*861.76*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*862.50*/parameters/*862.60*/.getStartYearMonth())),format.raw/*862.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*863.48*/parameters/*863.58*/.getEndYearMonth())),format.raw/*863.76*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*864.48*/parameters/*864.58*/.getSelectMonths())),format.raw/*864.76*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*865.46*/parameters/*865.56*/.getMonth())),format.raw/*865.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*866.44*/parameters/*866.54*/.getStartLat())),format.raw/*866.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*867.42*/parameters/*867.52*/.getEndLat())),format.raw/*867.64*/("""</div>
<div id="variableScale" style="display: none;">"""),_display_(Seq[Any](/*868.49*/parameters/*868.59*/.getVariableScale())),format.raw/*868.78*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*869.52*/parameters/*869.62*/.getExecutionPurpose())),format.raw/*869.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*870.41*/parameters/*870.51*/.getImage())),format.raw/*870.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*871.43*/parameters/*871.53*/.getDataURL())),format.raw/*871.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*872.55*/parameters/*872.65*/.getServiceResponseText())),format.raw/*872.90*/("""</div>
<table border="1" align="center">

<tr>
<td colspan="4">
<center>
<b>Service: 2-D Variable Zonal Mean</b> <br><br>
This service generates a graph of a 2-dimensional variable's zonal mean with time averaing. <br>
Select a data source (model or observation), a variable name, and a time range below.<br><br>
</center>
</td>
</tr>

<tr>
<td>data source:</td><td><select name="data", id="data" onchange="select_data()">
<!-- <option>NASA/obs4MIPs</option>  -->
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
</select>
</td>
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
	<td colspan="2" align="center"><input id="twodvarzonalmean"
		type="submit" value="            Run  Again            "
		style="height: 28px" /></td>
	<form>
		<td colspan="2" align="center"><input id="download_data"
			type="button" value="Download Data" style="height: 28px" /></td>
	</form>
</tr>
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
""")))})),format.raw/*1038.2*/("""
"""))}
    }
    
    def render(parameters:metadata.TwoDVarZonalMean): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.TwoDVarZonalMean) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:52 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/twoDVariableZonelMean.scala.html
                    HASH: 5875ba76fa3e08c57ea99e0df1e270c57245b957
                    MATRIX: 3212->1205|3345->1343|3360->1350|3445->1354|3496->1369|3511->1375|3573->1415|3635->1441|3650->1447|3711->1486|3796->1536|3811->1542|3878->1587|4082->1756|4097->1762|4153->1796|4239->1846|4254->1852|4310->1886|4461->2009|4490->2010|4899->2391|4928->2392|4970->2406|4999->2407|5255->2635|5284->2636|5415->2740|5443->2741|5483->2753|5512->2754|5643->2858|5671->2859|5974->3135|6002->3136|6062->3168|6091->3169|6251->3301|6280->3302|6349->3344|6377->3345|6448->3388|6477->3389|6546->3431|6574->3432|6644->3474|6673->3475|6742->3517|6770->3518|6840->3560|6869->3561|6938->3603|6966->3604|7040->3650|7069->3651|7138->3693|7166->3694|7237->3737|7266->3738|7335->3780|7363->3781|7434->3824|7463->3825|7532->3867|7560->3868|7630->3910|7659->3911|7728->3953|7756->3954|7827->3997|7856->3998|7925->4040|7953->4041|8027->4087|8056->4088|8125->4130|8153->4131|8224->4174|8253->4175|8324->4218|8353->4219|8424->4261|8454->4262|8525->4305|8554->4306|8625->4348|8655->4349|8726->4392|8755->4393|8826->4435|8856->4436|8927->4479|8956->4480|9028->4523|9058->4524|9129->4567|9158->4568|9235->4616|9265->4617|9336->4660|9365->4661|9439->4706|9469->4707|9540->4750|9569->4751|9642->4795|9672->4796|9743->4839|9772->4840|9842->4881|9872->4882|9943->4925|9972->4926|10046->4971|10076->4972|10147->5015|10176->5016|10250->5061|10280->5062|10351->5105|10380->5106|10456->5153|10486->5154|10557->5197|10586->5198|10661->5244|10691->5245|10762->5288|10791->5289|10824->5294|10853->5295|10916->5329|10946->5330|12982->7338|13011->7339|13075->7374|13105->7375|13222->7463|13252->7464|13339->7523|13368->7524|13436->7563|13466->7564|13553->7623|13582->7624|13650->7663|13680->7664|13767->7723|13796->7724|13864->7763|13894->7764|13981->7823|14010->7824|14078->7863|14108->7864|14195->7923|14224->7924|14292->7963|14322->7964|14409->8023|14438->8024|14506->8063|14536->8064|14623->8123|14652->8124|14720->8163|14750->8164|14837->8223|14866->8224|14934->8263|14964->8264|15051->8323|15080->8324|15148->8363|15178->8364|15265->8423|15294->8424|15362->8463|15392->8464|15479->8523|15508->8524|15576->8563|15606->8564|15693->8623|15722->8624|15755->8629|15784->8630|15856->8674|15885->8675|15918->8680|15947->8681|16018->8724|16047->8725|16158->8808|16187->8809|16253->8847|16282->8848|16975->9513|17004->9514|17067->9549|17096->9550|17869->10294|17899->10295|17963->10330|17993->10331|18064->10374|18093->10375|18154->10408|18183->10409|18888->11086|18917->11087|18976->11118|19005->11119|19972->12058|20001->12059|20060->12090|20089->12091|22480->14454|22509->14455|22569->14487|22598->14488|22773->14634|22803->14635|23753->15557|23782->15558|23856->15603|23886->15604|24800->16490|24829->16491|24902->16535|24932->16536|25882->17458|25911->17459|25984->17503|26014->17504|26964->18426|26993->18427|27070->18475|27100->18476|27978->19326|28007->19327|28081->19372|28111->19373|29061->20295|29090->20296|29164->20341|29194->20342|30107->21227|30136->21228|30209->21272|30239->21273|31152->22158|31181->22159|31255->22204|31285->22205|31828->22720|31857->22721|31934->22769|31964->22770|32914->23692|32943->23693|32984->23705|33014->23706|33232->23896|33261->23897|33312->23920|33341->23921|33403->23955|33432->23956|33543->24038|33573->24039|33632->24070|33661->24071|33724->24105|33754->24106|33818->24142|33847->24143|33910->24177|33940->24178|34164->24374|34193->24375|34256->24409|34286->24410|34510->24606|34539->24607|34602->24641|34632->24642|34856->24838|34885->24839|34948->24873|34978->24874|35202->25070|35231->25071|35264->25076|35293->25077|35355->25110|35385->25111|35463->25160|35493->25161|35607->25247|35636->25248|35719->25302|35749->25303|35827->25352|35857->25353|36021->25489|36051->25490|39774->29184|39804->29185|39998->29350|40028->29351|40134->29428|40164->29429|40492->29728|40522->29729|40925->30103|40955->30104|41119->30239|41149->30240|41281->30343|41311->30344|41505->30509|41535->30510|41616->30562|41646->30563|41882->30770|41912->30771|41993->30823|42023->30824|42259->31031|42289->31032|42370->31084|42400->31085|42700->31356|42730->31357|42772->31370|42802->31371|42891->31431|42921->31432|43033->31515|43063->31516|43142->31566|43172->31567|43214->31580|43244->31581|43281->31590|43311->31591|43358->31609|43388->31610|43572->31765|43602->31766|43708->31843|43738->31844|44066->32143|44096->32144|44482->32501|44512->32502|44601->32562|44631->32563|44753->32656|44783->32657|44862->32707|44892->32708|44934->32721|44964->32722|45001->32731|45031->32732|45068->32741|45097->32742|45132->32749|45161->32750|45217->1244|45245->1262|45311->1293|45326->1299|45388->1339|45419->32766|45458->32769|45505->32806|45545->32807|45584->32809|45622->32824|45715->32880|45735->32890|45774->32906|45865->32960|45885->32970|45926->32988|46019->33044|46039->33054|46082->33074|46173->33128|46193->33138|46234->33156|46325->33210|46345->33220|46386->33238|46475->33290|46495->33300|46529->33311|46616->33361|46636->33371|46673->33385|46758->33433|46778->33443|46813->33455|46905->33510|46925->33520|46967->33539|47062->33597|47082->33607|47127->33629|47211->33676|47231->33686|47265->33697|47351->33746|47371->33756|47407->33769|47505->33830|47525->33840|47573->33865|53310->39569
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|70->30|70->30|70->30|72->32|72->32|72->32|76->36|76->36|86->46|86->46|86->46|86->46|92->52|92->52|95->55|95->55|96->56|96->56|99->59|99->59|105->65|105->65|106->66|106->66|109->69|109->69|111->71|111->71|112->72|112->72|114->74|114->74|115->75|115->75|117->77|117->77|118->78|118->78|120->80|120->80|121->81|121->81|123->83|123->83|124->84|124->84|126->86|126->86|127->87|127->87|129->89|129->89|130->90|130->90|132->92|132->92|133->93|133->93|135->95|135->95|136->96|136->96|138->98|138->98|139->99|139->99|141->101|141->101|142->102|142->102|144->104|144->104|145->105|145->105|147->107|147->107|148->108|148->108|150->110|150->110|151->111|151->111|153->113|153->113|154->114|154->114|156->116|156->116|157->117|157->117|159->119|159->119|160->120|160->120|162->122|162->122|163->123|163->123|165->125|165->125|166->126|166->126|168->128|168->128|169->129|169->129|171->131|171->131|172->132|172->132|174->134|174->134|175->135|175->135|177->137|177->137|178->138|178->138|179->139|179->139|232->192|232->192|233->193|233->193|235->195|235->195|237->197|237->197|238->198|238->198|240->200|240->200|241->201|241->201|243->203|243->203|244->204|244->204|246->206|246->206|247->207|247->207|249->209|249->209|250->210|250->210|252->212|252->212|253->213|253->213|255->215|255->215|256->216|256->216|258->218|258->218|259->219|259->219|261->221|261->221|262->222|262->222|264->224|264->224|265->225|265->225|267->227|267->227|268->228|268->228|270->230|270->230|271->231|271->231|273->233|273->233|274->234|274->234|276->236|276->236|279->239|279->239|281->241|281->241|294->254|294->254|296->256|296->256|308->268|308->268|310->270|310->270|313->273|313->273|315->275|315->275|328->288|328->288|330->290|330->290|357->317|357->317|359->319|359->319|411->371|411->371|413->373|413->373|417->377|417->377|443->403|443->403|444->404|444->404|469->429|469->429|470->430|470->430|496->456|496->456|497->457|497->457|523->483|523->483|524->484|524->484|548->508|548->508|549->509|549->509|575->535|575->535|576->536|576->536|601->561|601->561|602->562|602->562|627->587|627->587|628->588|628->588|643->603|643->603|644->604|644->604|670->630|670->630|671->631|671->631|677->637|677->637|679->639|679->639|681->641|681->641|683->643|683->643|685->645|685->645|686->646|686->646|688->648|688->648|689->649|689->649|694->654|694->654|695->655|695->655|700->660|700->660|701->661|701->661|706->666|706->666|707->667|707->667|712->672|712->672|713->673|713->673|714->674|714->674|715->675|715->675|718->678|718->678|719->679|719->679|721->681|721->681|725->685|725->685|812->772|812->772|817->777|817->777|819->779|819->779|826->786|826->786|834->794|834->794|837->797|837->797|839->799|839->799|842->802|842->802|843->803|843->803|846->806|846->806|847->807|847->807|850->810|850->810|851->811|851->811|854->814|854->814|855->815|855->815|856->816|856->816|859->819|859->819|860->820|860->820|861->821|861->821|862->822|862->822|863->823|863->823|868->828|868->828|870->830|870->830|877->837|877->837|884->844|884->844|885->845|885->845|888->848|888->848|889->849|889->849|890->850|890->850|891->851|891->851|892->852|892->852|893->853|893->853|896->18|896->19|897->20|897->20|897->20|898->855|900->857|900->857|900->857|900->857|900->857|903->860|903->860|903->860|904->861|904->861|904->861|905->862|905->862|905->862|906->863|906->863|906->863|907->864|907->864|907->864|908->865|908->865|908->865|909->866|909->866|909->866|910->867|910->867|910->867|911->868|911->868|911->868|912->869|912->869|912->869|913->870|913->870|913->870|914->871|914->871|914->871|915->872|915->872|915->872|1081->1038
                    -- GENERATED --
                */
            