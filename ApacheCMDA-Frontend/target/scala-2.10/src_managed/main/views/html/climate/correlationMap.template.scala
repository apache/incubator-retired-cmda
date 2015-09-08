
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
object correlationMap extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.CorrelationMap,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.CorrelationMap):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/livefilter.js"))),format.raw/*23.60*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*25.8*/routes/*25.14*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*25.59*/("""'></script>
<script type="text/javascript"
	src='https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js'></script>
	<script type="text/javascript" src='"""),_display_(Seq[Any](/*28.39*/routes/*28.45*/.Assets.at("javascripts/json2.js"))),format.raw/*28.79*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*30.8*/routes/*30.14*/.Assets.at("javascripts/xmisc.js"))),format.raw/*30.48*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*32.8*/routes/*32.14*/.Assets.at("html/js2/dataList2.js"))),format.raw/*32.49*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*34.8*/routes/*34.14*/.Assets.at("html/js2/varList.js"))),format.raw/*34.47*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*36.8*/routes/*36.14*/.Assets.at("html/js2/common.js"))),format.raw/*36.46*/("""'></script>
<script type="text/javascript">
	var Response = null;
    var variable1 = "";
    var variable2 = "";
    window.onload = function() """),format.raw/*41.32*/("""{"""),format.raw/*41.33*/("""
    	put_data(1);
    	changeDataSource1();
        put_data(2);
        changeDataSource2();
        put_var(1);
        changeVariableName1();
        put_var(2);
        changeVariableName2();
        enable_download_button();
        $('#t0').val($('#startYearMonth').text());
        $('#t1').val($('#endYearMonth').text());
        if($('#pressureLevel1').text() == "-9999")"""),format.raw/*53.51*/("""{"""),format.raw/*53.52*/("""
        	disable_pres1(1);
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""else"""),format.raw/*55.14*/("""{"""),format.raw/*55.15*/("""
        	$('#pres1').val($('#pressureLevel1').text());
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
        if($('#pressureLevel2').text() == "-9999")"""),format.raw/*58.51*/("""{"""),format.raw/*58.52*/("""
        	disable_pres1(2);
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""else"""),format.raw/*60.14*/("""{"""),format.raw/*60.15*/("""
        	$('#pres2').val($('#pressureLevel2').text());
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
        $('#lat0').val($('#startLat').text());
        $('#lat1').val($('#endLat').text());
        $('#lon0').val($('#startLon').text());
        $('#lon1').val($('#endLon').text());
        $('#laggedTime').html($('#executionLaggedTime').text());
        $('#purpose').html($('#executionPurpose').text());
        $('#data_url').html($('#dataURL').text());
        $('#Response').html($('#serviceResponseText').text());
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    function disable_pres1(ID)
    """),format.raw/*73.5*/("""{"""),format.raw/*73.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""
    function enable_pres1(ID)
    """),format.raw/*80.5*/("""{"""),format.raw/*80.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.value = "500";
      x.disabled=false;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
    function changeDataSource1() """),format.raw/*86.34*/("""{"""),format.raw/*86.35*/("""
    	var dataSource = $('#dataSource1').text();
	    var x = document.getElementById("data1");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*89.37*/("""{"""),format.raw/*89.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*91.7*/("""}"""),format.raw/*91.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*92.42*/("""{"""),format.raw/*92.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*94.7*/("""}"""),format.raw/*94.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*95.42*/("""{"""),format.raw/*95.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*98.42*/("""{"""),format.raw/*98.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*100.7*/("""}"""),format.raw/*100.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*101.43*/("""{"""),format.raw/*101.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*103.7*/("""}"""),format.raw/*103.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*104.48*/("""{"""),format.raw/*104.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*106.7*/("""}"""),format.raw/*106.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*107.45*/("""{"""),format.raw/*107.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*109.7*/("""}"""),format.raw/*109.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*110.44*/("""{"""),format.raw/*110.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*112.7*/("""}"""),format.raw/*112.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*113.41*/("""{"""),format.raw/*113.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*115.7*/("""}"""),format.raw/*115.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*116.45*/("""{"""),format.raw/*116.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*118.7*/("""}"""),format.raw/*118.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*119.45*/("""{"""),format.raw/*119.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*121.7*/("""}"""),format.raw/*121.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*122.47*/("""{"""),format.raw/*122.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*124.7*/("""}"""),format.raw/*124.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*125.43*/("""{"""),format.raw/*125.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*127.7*/("""}"""),format.raw/*127.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*128.43*/("""{"""),format.raw/*128.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*130.7*/("""}"""),format.raw/*130.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*131.43*/("""{"""),format.raw/*131.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*133.7*/("""}"""),format.raw/*133.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*134.42*/("""{"""),format.raw/*134.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*136.7*/("""}"""),format.raw/*136.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*137.42*/("""{"""),format.raw/*137.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*139.7*/("""}"""),format.raw/*139.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*140.46*/("""{"""),format.raw/*140.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*142.7*/("""}"""),format.raw/*142.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*143.43*/("""{"""),format.raw/*143.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*145.7*/("""}"""),format.raw/*145.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*146.42*/("""{"""),format.raw/*146.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*148.7*/("""}"""),format.raw/*148.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*149.43*/("""{"""),format.raw/*149.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*151.7*/("""}"""),format.raw/*151.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*152.42*/("""{"""),format.raw/*152.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*154.7*/("""}"""),format.raw/*154.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*155.41*/("""{"""),format.raw/*155.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*157.7*/("""}"""),format.raw/*157.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*158.42*/("""{"""),format.raw/*158.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*160.7*/("""}"""),format.raw/*160.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*161.46*/("""{"""),format.raw/*161.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*163.7*/("""}"""),format.raw/*163.8*/("""
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/("""
    function changeDataSource2() """),format.raw/*165.34*/("""{"""),format.raw/*165.35*/("""
    	var dataSource = $('#dataSource2').text();
	    var x = document.getElementById("data2");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*168.37*/("""{"""),format.raw/*168.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*170.7*/("""}"""),format.raw/*170.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*171.42*/("""{"""),format.raw/*171.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*173.7*/("""}"""),format.raw/*173.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*174.42*/("""{"""),format.raw/*174.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*176.7*/("""}"""),format.raw/*176.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*177.42*/("""{"""),format.raw/*177.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*179.7*/("""}"""),format.raw/*179.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*180.43*/("""{"""),format.raw/*180.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*182.7*/("""}"""),format.raw/*182.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*183.48*/("""{"""),format.raw/*183.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*185.7*/("""}"""),format.raw/*185.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*186.45*/("""{"""),format.raw/*186.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*188.7*/("""}"""),format.raw/*188.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*189.44*/("""{"""),format.raw/*189.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*191.7*/("""}"""),format.raw/*191.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*192.41*/("""{"""),format.raw/*192.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*194.7*/("""}"""),format.raw/*194.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*195.45*/("""{"""),format.raw/*195.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*197.7*/("""}"""),format.raw/*197.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*198.45*/("""{"""),format.raw/*198.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*200.7*/("""}"""),format.raw/*200.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*201.47*/("""{"""),format.raw/*201.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*203.7*/("""}"""),format.raw/*203.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*204.43*/("""{"""),format.raw/*204.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*206.7*/("""}"""),format.raw/*206.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*207.43*/("""{"""),format.raw/*207.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*209.7*/("""}"""),format.raw/*209.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*210.43*/("""{"""),format.raw/*210.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*212.7*/("""}"""),format.raw/*212.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*213.42*/("""{"""),format.raw/*213.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*215.7*/("""}"""),format.raw/*215.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*216.42*/("""{"""),format.raw/*216.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*218.7*/("""}"""),format.raw/*218.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*219.46*/("""{"""),format.raw/*219.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*221.7*/("""}"""),format.raw/*221.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*222.43*/("""{"""),format.raw/*222.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*224.7*/("""}"""),format.raw/*224.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*225.42*/("""{"""),format.raw/*225.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*227.7*/("""}"""),format.raw/*227.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*228.43*/("""{"""),format.raw/*228.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*230.7*/("""}"""),format.raw/*230.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*231.42*/("""{"""),format.raw/*231.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*233.7*/("""}"""),format.raw/*233.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*234.41*/("""{"""),format.raw/*234.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*236.7*/("""}"""),format.raw/*236.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*237.42*/("""{"""),format.raw/*237.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*239.7*/("""}"""),format.raw/*239.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*240.46*/("""{"""),format.raw/*240.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*242.7*/("""}"""),format.raw/*242.8*/("""
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    function changeVariableName1()"""),format.raw/*244.35*/("""{"""),format.raw/*244.36*/("""
        var var_string = $('#variableName1').text();
        var data_string = $('#dataSource1').text();
        data_string = data_string.replace("_", "/").toUpperCase();
        var varList2 = dataList[data_string][1];  
        var x = document.getElementById("var1");
        for (var i=0; i<varList2.length; i++) """),format.raw/*250.47*/("""{"""),format.raw/*250.48*/("""
      	  var k = varList2[i];
            if (k == var_string) """),format.raw/*252.34*/("""{"""),format.raw/*252.35*/("""
            	x.options[i].selected=true;
            	break;
            """),format.raw/*255.13*/("""}"""),format.raw/*255.14*/("""
        """),format.raw/*256.9*/("""}"""),format.raw/*256.10*/("""
    """),format.raw/*257.5*/("""}"""),format.raw/*257.6*/("""
    function changeVariableName2()"""),format.raw/*258.35*/("""{"""),format.raw/*258.36*/("""
        var var_string = $('#variableName2').text();
        var data_string = $('#dataSource2').text();
        data_string = data_string.replace("_", "/").toUpperCase();
        var varList2 = dataList[data_string][1];  
        var x = document.getElementById("var2");
        for (var i=0; i<varList2.length; i++) """),format.raw/*264.47*/("""{"""),format.raw/*264.48*/("""
      	  var k = varList2[i];
            if (k == var_string) """),format.raw/*266.34*/("""{"""),format.raw/*266.35*/("""
            	x.options[i].selected=true;
            	break;
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/("""
        """),format.raw/*270.9*/("""}"""),format.raw/*270.10*/("""
    """),format.raw/*271.5*/("""}"""),format.raw/*271.6*/("""
    function disable_download_button()
    """),format.raw/*273.5*/("""{"""),format.raw/*273.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=true;
    """),format.raw/*276.5*/("""}"""),format.raw/*276.6*/("""
    function enable_download_button()
    """),format.raw/*278.5*/("""{"""),format.raw/*278.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*281.5*/("""}"""),format.raw/*281.6*/("""
    function disable_pres1(ID)
    """),format.raw/*283.5*/("""{"""),format.raw/*283.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""
    function enable_pres1(ID)
    """),format.raw/*290.5*/("""{"""),format.raw/*290.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.value = "500";
      x.disabled=false;
    """),format.raw/*295.5*/("""}"""),format.raw/*295.6*/("""
    function put_data(ID)"""),format.raw/*296.26*/("""{"""),format.raw/*296.27*/("""
      var list1=document.getElementById("data"+ID);
      for(var key in dataList) """),format.raw/*298.32*/("""{"""),format.raw/*298.33*/("""
        if (key.slice(0,5)==="group") """),format.raw/*299.39*/("""{"""),format.raw/*299.40*/("""
          var og = document.createElement("OPTGROUP");
          og.setAttribute('label', dataList[key][0]);
          list1.add(og);
        """),format.raw/*303.9*/("""}"""),format.raw/*303.10*/(""" else """),format.raw/*303.16*/("""{"""),format.raw/*303.17*/("""
          og.appendChild(new Option(key,key));
        """),format.raw/*305.9*/("""}"""),format.raw/*305.10*/("""
      """),format.raw/*306.7*/("""}"""),format.raw/*306.8*/("""
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/("""
    function put_var(ID) """),format.raw/*308.26*/("""{"""),format.raw/*308.27*/("""
      var list1=document.getElementById("var"+ID);
      for (var i=list1.length-1; i>=0; i--) """),format.raw/*310.45*/("""{"""),format.raw/*310.46*/("""
      list1.remove(i);
      """),format.raw/*312.7*/("""}"""),format.raw/*312.8*/("""
      data_string =  document.getElementById("data"+ID).value;
      var varList2 = dataList[data_string][1];  
      for (var i=0; i<varList2.length; i++) """),format.raw/*315.45*/("""{"""),format.raw/*315.46*/("""
        var k = varList2[i];
        list1.add(new Option(varList[k][0],k));
      """),format.raw/*318.7*/("""}"""),format.raw/*318.8*/("""
    """),format.raw/*319.5*/("""}"""),format.raw/*319.6*/("""
    function select_var1(ID)
    """),format.raw/*321.5*/("""{"""),format.raw/*321.6*/("""
      var var_string = $("#var"+ID).val();
      if (varList[var_string][2]===3) """),format.raw/*323.39*/("""{"""),format.raw/*323.40*/("""
        enable_pres1(ID);
      """),format.raw/*325.7*/("""}"""),format.raw/*325.8*/(""" else """),format.raw/*325.14*/("""{"""),format.raw/*325.15*/("""
        disable_pres1(ID);
      """),format.raw/*327.7*/("""}"""),format.raw/*327.8*/("""
      var var_string1 = $("#var"+1).val();
      var var_string2 = $("#var"+2).val();
      var data_string1 = $("#data"+1).val();
      var data_string2 = $("#data"+2).val();
      var sTime = Math.max( Number(dataList[data_string1][2][var_string1][0]),
                            Number(dataList[data_string2][2][var_string2][0]) );
      var eTime = Math.min( Number(dataList[data_string1][2][var_string1][1]),
                            Number(dataList[data_string2][2][var_string2][1]) );
      $("#startYear").html("start year-month: (earliest:" + sTime + ")");
      $("#endYear").html("end year-month: (latest:" + eTime + ")");
    """),format.raw/*338.5*/("""}"""),format.raw/*338.6*/("""
    $(document).ready(function()"""),format.raw/*339.33*/("""{"""),format.raw/*339.34*/("""
      $("#download_data").click(function(event) """),format.raw/*340.49*/("""{"""),format.raw/*340.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*343.7*/("""}"""),format.raw/*343.8*/(""");
      $("#correlationMap").click(function(event) """),format.raw/*344.50*/("""{"""),format.raw/*344.51*/("""
        Response = null;
        disable_download_button();
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/correlationMap?";
        var d1 = $("#data1").val();
        var model1 = d1.replace("/", "_");
        model1 = model1.toLowerCase();
        var arglist = "";
        arglist = arglist.concat("model1=");
        arglist = arglist.concat(model1);
        var variable1 = $("#var1").val();
        arglist = arglist.concat("&var1=");
        arglist = arglist.concat(variable1);
        var pres1 = $("#pres1").val();
        if (isNaN(Number(pres1))) """),format.raw/*361.35*/("""{"""),format.raw/*361.36*/(""" pres1 = "-9999"; """),format.raw/*361.54*/("""}"""),format.raw/*361.55*/("""
        arglist = arglist.concat("&pres1=");
        arglist = arglist.concat(pres1);
        var d2 = $("#data2").val();
        var model2 = d2.replace("/", "_");
        model2 = model2.toLowerCase();
        arglist = arglist.concat("&model2=");
        arglist = arglist.concat(model2);
        var variable2 = $("#var2").val();
        arglist = arglist.concat("&var2=");
        arglist = arglist.concat(variable2);
        var pres2 = $("#pres2").val();
        if (isNaN(Number(pres2))) """),format.raw/*373.35*/("""{"""),format.raw/*373.36*/(""" pres2 = "-9999"; """),format.raw/*373.54*/("""}"""),format.raw/*373.55*/("""
        arglist = arglist.concat("&pres2=");
        arglist = arglist.concat(pres2);
        var laggedTime = $("#laggedTime").val();
        arglist = arglist.concat("&laggedTime=");
        arglist = arglist.concat(laggedTime);
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
        $.ajax("""),format.raw/*416.16*/("""{"""),format.raw/*416.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*421.54*/("""{"""),format.raw/*421.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*423.44*/("""{"""),format.raw/*423.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*430.17*/("""}"""),format.raw/*430.18*/("""
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
                if (lowerT1 == 0  || upperT1 == 0)"""),format.raw/*443.51*/("""{"""),format.raw/*443.52*/(""" 
                  alert("We do not have data for the data-1 source and variable configuration.");
                  alert(urlTimeBounds);
                  return;
                """),format.raw/*447.17*/("""}"""),format.raw/*447.18*/("""
                else if (lowerT2 == 0  || upperT2 == 0)"""),format.raw/*448.56*/("""{"""),format.raw/*448.57*/(""" 
                  alert("We do not have data for the data-2 source and variable configuration.");
                  return;
                """),format.raw/*451.17*/("""}"""),format.raw/*451.18*/("""
                else if (lowerT2 > upperT1 || lowerT1 > upperT2) """),format.raw/*452.66*/("""{"""),format.raw/*452.67*/(""" 
                  alert("The two data sets/vars do not have a common time range.");
                  return;
                """),format.raw/*455.17*/("""}"""),format.raw/*455.18*/("""
                else """),format.raw/*456.22*/("""{"""),format.raw/*456.23*/(""" 
                  if (lowerT1 > lowerT2) """),format.raw/*457.42*/("""{"""),format.raw/*457.43*/(""" 
                    lowerT = lowerT1;
                  """),format.raw/*459.19*/("""}"""),format.raw/*459.20*/("""
                  else """),format.raw/*460.24*/("""{"""),format.raw/*460.25*/("""
                    lowerT = lowerT2;
                  """),format.raw/*462.19*/("""}"""),format.raw/*462.20*/("""
                  if (upperT1 > upperT2) """),format.raw/*463.42*/("""{"""),format.raw/*463.43*/(""" 
                    upperT = upperT2;
                  """),format.raw/*465.19*/("""}"""),format.raw/*465.20*/("""
                  else """),format.raw/*466.24*/("""{"""),format.raw/*466.25*/("""
                    upperT = upperT1;
                  """),format.raw/*468.19*/("""}"""),format.raw/*468.20*/("""
                """),format.raw/*469.17*/("""}"""),format.raw/*469.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*471.51*/("""{"""),format.raw/*471.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*474.17*/("""}"""),format.raw/*474.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*475.52*/("""{"""),format.raw/*475.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*478.17*/("""}"""),format.raw/*478.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*479.52*/("""{"""),format.raw/*479.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*482.17*/("""}"""),format.raw/*482.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*483.52*/("""{"""),format.raw/*483.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*486.17*/("""}"""),format.raw/*486.18*/("""
            """),format.raw/*487.13*/("""}"""),format.raw/*487.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*488.59*/("""{"""),format.raw/*488.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*491.13*/("""}"""),format.raw/*491.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*492.49*/("""{"""),format.raw/*492.50*/("""
            """),format.raw/*493.13*/("""}"""),format.raw/*493.14*/("""
        """),format.raw/*494.9*/("""}"""),format.raw/*494.10*/(""");
        $.ajax("""),format.raw/*495.16*/("""{"""),format.raw/*495.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*500.54*/("""{"""),format.raw/*500.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*502.44*/("""{"""),format.raw/*502.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    if (text.indexOf("No Data") != -1) """),format.raw/*505.56*/("""{"""),format.raw/*505.57*/("""
                      $("#Image").html("No Data");
                      $("#Response").html("No Data");
                      $("#data_url").html("No Data");
                      return;
                    """),format.raw/*510.21*/("""}"""),format.raw/*510.22*/("""
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*515.17*/("""}"""),format.raw/*515.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html = "<img src='" + data.url + "?" + new Date().getTime() + "' width='820'/>";
                $("#Image").html(html);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*522.13*/("""}"""),format.raw/*522.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*523.59*/("""{"""),format.raw/*523.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*526.13*/("""}"""),format.raw/*526.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*527.49*/("""{"""),format.raw/*527.50*/("""
            """),format.raw/*528.13*/("""}"""),format.raw/*528.14*/("""
        """),format.raw/*529.9*/("""}"""),format.raw/*529.10*/(""");
      """),format.raw/*530.7*/("""}"""),format.raw/*530.8*/(""");
    """),format.raw/*531.5*/("""}"""),format.raw/*531.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.39*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*533.2*/(""" """),_display_(Seq[Any](/*533.4*/main("Parameters of ConfId", scripts)/*533.41*/{_display_(Seq[Any](format.raw/*533.42*/(""" """),_display_(Seq[Any](/*533.44*/flash_message())),format.raw/*533.59*/("""
<p>
<div id="dataSource1" style="display: none;">"""),_display_(Seq[Any](/*535.47*/parameters/*535.57*/.getSource1())),format.raw/*535.70*/("""</div>
<div id="dataSource2" style="display: none;">"""),_display_(Seq[Any](/*536.47*/parameters/*536.57*/.getSource2())),format.raw/*536.70*/("""</div>
<div id="variableName1" style="display: none;">"""),_display_(Seq[Any](/*537.49*/parameters/*537.59*/.getVariableName1())),format.raw/*537.78*/("""</div>
<div id="variableName2" style="display: none;">"""),_display_(Seq[Any](/*538.49*/parameters/*538.59*/.getVariableName2())),format.raw/*538.78*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*539.50*/parameters/*539.60*/.getStartYear())),format.raw/*539.75*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*540.48*/parameters/*540.58*/.getEndYear())),format.raw/*540.71*/("""</div>
<div id="pressureLevel1" style="display: none;">"""),_display_(Seq[Any](/*541.50*/parameters/*541.60*/.getPressureLevel1())),format.raw/*541.80*/("""</div>
<div id="pressureLevel2" style="display: none;">"""),_display_(Seq[Any](/*542.50*/parameters/*542.60*/.getPressureLevel2())),format.raw/*542.80*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*543.44*/parameters/*543.54*/.getStartLat())),format.raw/*543.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*544.42*/parameters/*544.52*/.getEndLat())),format.raw/*544.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*545.44*/parameters/*545.54*/.getStartLon())),format.raw/*545.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*546.42*/parameters/*546.52*/.getEndLon())),format.raw/*546.64*/("""</div>
<div id="laggedT" style="display: none;">"""),_display_(Seq[Any](/*547.43*/parameters/*547.53*/.getLaggedTime())),format.raw/*547.69*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*548.52*/parameters/*548.62*/.getExecutionPurpose())),format.raw/*548.84*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*549.43*/parameters/*549.53*/.getDataURL())),format.raw/*549.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*550.55*/parameters/*550.65*/.getServiceResponseText())),format.raw/*550.90*/("""</div>
<table border="1">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Time-Lagged Correlation Map of Two Variables</b><br>
				<br> This service generates a time-lagged correlation map
				between two specified variables. <br>The two variables can be
				either a two-dimensional variable or a slice of a three-dimensional
				variable at a specific pressure level. <br> <br>
			</center>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<center>data1[t-lag]</center>
		</td>
		<td colspan="2">
			<center>data2[t]</center>
		</td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data1" , id="data1"
			onchange="put_var(1); select_var1(1)">
		</select></td>
		<td>source:</td>
		<td><select name="data2" , id="data2"
			onchange="put_var(2); select_var1(2)">
		</select></td>
	</tr>
	<tr>
		<td>variable name:</td>
		<td><select name="var1" , id="var1" onchange="select_var1(1)"></select></td>
		<td>variable name:</td>
		<td><select name="var2" , id="var2" onchange="select_var1(2)"></select></td>
	</tr>
	<tr>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar)
		</td>
		<td><input id="pres1" value=""""),_display_(Seq[Any](/*591.33*/parameters/*591.43*/.getPressureLevel1())),format.raw/*591.63*/(""""
			alt="pressure" /></td>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar)
		</td>
		<td><input id="pres2" value=""""),_display_(Seq[Any](/*596.33*/parameters/*596.43*/.getPressureLevel2())),format.raw/*596.63*/(""""
			alt="pressure" /></td>
	</tr>
	<tr>
	</tr>
	<tr>
		<td id=startYear>start year-month:</td>
		<td><input id="t0" value=""""),_display_(Seq[Any](/*603.30*/parameters/*603.40*/.getStartYear())),format.raw/*603.55*/("""" alt="start" /></td>
		<td id=endYear>end year-month:</td>
		<td><input id="t1" value=""""),_display_(Seq[Any](/*605.30*/parameters/*605.40*/.getEndYear())),format.raw/*605.53*/("""" alt="end" /></td>
	</tr>
	<tr>
		<td>start lat (deg):</td>
		<td><input id="lat0" value=""""),_display_(Seq[Any](/*609.32*/parameters/*609.42*/.getStartLat())),format.raw/*609.56*/("""" /></td>
		<td>end lat (deg):</td>
		<td><input id="lat1" value=""""),_display_(Seq[Any](/*611.32*/parameters/*611.42*/.getEndLat())),format.raw/*611.54*/("""" /></td>
	</tr>
	<tr>
		<td>start lon (deg):</td>
		<td><input id="lon0" value=""""),_display_(Seq[Any](/*615.32*/parameters/*615.42*/.getStartLon())),format.raw/*615.56*/("""" /></td>
		<td>end lon (deg):</td>
		<td><input id="lon1" value=""""),_display_(Seq[Any](/*617.32*/parameters/*617.42*/.getEndLon())),format.raw/*617.54*/("""" /></td>
	</tr>
	<tr>
		<td></td>
		<td colspan="2"><center>
				lag (month):<input id="laggedTime"
					value=""""),_display_(Seq[Any](/*623.14*/parameters/*623.24*/.getLaggedTime())),format.raw/*623.40*/("""" />
			</center></td>
		<td></td>
	</tr>
	</tr>
	<tr>
		<td colspan="1">Execution purpose</td>
		<td colspan="3">
			<form>
				<textarea name="purpose" id="purpose" rows="4" cols="50">"""),_display_(Seq[Any](/*632.63*/parameters/*632.73*/.getExecutionPurpose())),format.raw/*632.95*/("""</textarea>
			</form>
		</td>
	</tr>
	<tr>
	<tr>
		<td colspan="2" align="center"><input id="correlationMap"
			type="submit" value="            Run Again            "
			style="height: 28px" /></td>
		<form>
			<td colspan="2" align="center"><input id="download_data"
				type="button" value="Download Data" style="height: 28px" /></td>
		</form>
	</tr>
	<tr>
		<td colspan="4">
			<div id="Image">
				<img src=""""),_display_(Seq[Any](/*649.16*/parameters/*649.26*/.getImage())),format.raw/*649.37*/("""" width=680 />
			</div>
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea readonly id="data_url"
				cols="130" rows="2">"""),_display_(Seq[Any](/*655.26*/parameters/*655.36*/.getDataURL())),format.raw/*655.49*/("""</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea id="Response" cols="130"
				rows="6">"""),_display_(Seq[Any](/*659.15*/parameters/*659.25*/.getServiceResponseText())),format.raw/*659.50*/("""</textarea></td>
	</tr>
</table>
""")))})),format.raw/*662.2*/("""
"""))}
    }
    
    def render(parameters:metadata.CorrelationMap): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.CorrelationMap) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:48 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/correlationMap.scala.html
                    HASH: 1a3fe36cc930c48ccace81ae2ddf7adb68063d23
                    MATRIX: 3203->1205|3334->1341|3349->1348|3434->1352|3485->1367|3500->1373|3562->1413|3624->1439|3639->1445|3700->1484|3785->1534|3800->1540|3867->1585|4070->1752|4085->1758|4141->1792|4226->1842|4241->1848|4297->1882|4382->1932|4397->1938|4454->1973|4539->2023|4554->2029|4609->2062|4694->2112|4709->2118|4763->2150|4936->2295|4965->2296|5374->2677|5403->2678|5466->2714|5495->2715|5527->2719|5556->2720|5647->2784|5676->2785|5755->2836|5784->2837|5847->2873|5876->2874|5908->2878|5937->2879|6028->2943|6057->2944|6511->3371|6539->3372|6602->3408|6630->3409|6765->3517|6793->3518|6855->3553|6883->3554|7019->3663|7047->3664|7109->3698|7138->3699|7298->3831|7327->3832|7396->3874|7424->3875|7494->3917|7523->3918|7592->3960|7620->3961|7690->4003|7719->4004|7788->4046|7816->4047|7886->4089|7915->4090|7985->4132|8014->4133|8086->4176|8116->4177|8186->4219|8215->4220|8292->4268|8322->4269|8392->4311|8421->4312|8495->4357|8525->4358|8595->4400|8624->4401|8697->4445|8727->4446|8797->4488|8826->4489|8896->4530|8926->4531|8996->4573|9025->4574|9099->4619|9129->4620|9199->4662|9228->4663|9302->4708|9332->4709|9403->4752|9432->4753|9508->4800|9538->4801|9609->4844|9638->4845|9710->4888|9740->4889|9811->4932|9840->4933|9912->4976|9942->4977|10013->5020|10042->5021|10114->5064|10144->5065|10215->5108|10244->5109|10315->5151|10345->5152|10416->5195|10445->5196|10516->5238|10546->5239|10617->5282|10646->5283|10721->5329|10751->5330|10822->5373|10851->5374|10923->5417|10953->5418|11024->5461|11053->5462|11124->5504|11154->5505|11225->5548|11254->5549|11326->5592|11356->5593|11427->5636|11456->5637|11527->5679|11557->5680|11628->5723|11657->5724|11727->5765|11757->5766|11828->5809|11857->5810|11928->5852|11958->5853|12029->5896|12058->5897|12133->5943|12163->5944|12234->5987|12263->5988|12296->5993|12325->5994|12388->6028|12418->6029|12579->6161|12609->6162|12679->6204|12708->6205|12779->6247|12809->6248|12879->6290|12908->6291|12979->6333|13009->6334|13079->6376|13108->6377|13179->6419|13209->6420|13279->6462|13308->6463|13380->6506|13410->6507|13480->6549|13509->6550|13586->6598|13616->6599|13686->6641|13715->6642|13789->6687|13819->6688|13889->6730|13918->6731|13991->6775|14021->6776|14091->6818|14120->6819|14190->6860|14220->6861|14290->6903|14319->6904|14393->6949|14423->6950|14493->6992|14522->6993|14596->7038|14626->7039|14697->7082|14726->7083|14802->7130|14832->7131|14903->7174|14932->7175|15004->7218|15034->7219|15105->7262|15134->7263|15206->7306|15236->7307|15307->7350|15336->7351|15408->7394|15438->7395|15509->7438|15538->7439|15609->7481|15639->7482|15710->7525|15739->7526|15810->7568|15840->7569|15911->7612|15940->7613|16015->7659|16045->7660|16116->7703|16145->7704|16217->7747|16247->7748|16318->7791|16347->7792|16418->7834|16448->7835|16519->7878|16548->7879|16620->7922|16650->7923|16721->7966|16750->7967|16821->8009|16851->8010|16922->8053|16951->8054|17021->8095|17051->8096|17122->8139|17151->8140|17222->8182|17252->8183|17323->8226|17352->8227|17427->8273|17457->8274|17528->8317|17557->8318|17590->8323|17619->8324|17683->8359|17713->8360|18061->8679|18091->8680|18184->8744|18214->8745|18317->8819|18347->8820|18384->8829|18414->8830|18447->8835|18476->8836|18540->8871|18570->8872|18918->9191|18948->9192|19041->9256|19071->9257|19174->9331|19204->9332|19241->9341|19271->9342|19304->9347|19333->9348|19405->9392|19434->9393|19544->9475|19573->9476|19644->9519|19673->9520|19784->9603|19813->9604|19877->9640|19906->9641|20042->9749|20071->9750|20134->9785|20163->9786|20300->9895|20329->9896|20384->9922|20414->9923|20527->10007|20557->10008|20625->10047|20655->10048|20826->10191|20856->10192|20891->10198|20921->10199|21005->10255|21035->10256|21070->10263|21099->10264|21132->10269|21161->10270|21216->10296|21246->10297|21371->10393|21401->10394|21459->10424|21488->10425|21674->10582|21704->10583|21816->10667|21845->10668|21878->10673|21907->10674|21969->10708|21998->10709|22109->10791|22139->10792|22200->10825|22229->10826|22264->10832|22294->10833|22356->10867|22385->10868|23056->11511|23085->11512|23147->11545|23177->11546|23255->11595|23285->11596|23399->11682|23428->11683|23509->11735|23539->11736|24276->12444|24306->12445|24353->12463|24383->12464|24909->12961|24939->12962|24986->12980|25016->12981|26921->14857|26951->14858|27145->15023|27175->15024|27281->15101|27311->15102|27639->15401|27669->15402|28311->16015|28341->16016|28552->16198|28582->16199|28667->16255|28697->16256|28868->16398|28898->16399|28993->16465|29023->16466|29180->16594|29210->16595|29261->16617|29291->16618|29363->16661|29393->16662|29480->16720|29510->16721|29563->16745|29593->16746|29679->16803|29709->16804|29780->16846|29810->16847|29897->16905|29927->16906|29980->16930|30010->16931|30096->16988|30126->16989|30172->17006|30202->17007|30334->17110|30364->17111|30558->17276|30588->17277|30669->17329|30699->17330|30935->17537|30965->17538|31046->17590|31076->17591|31312->17798|31342->17799|31423->17851|31453->17852|31753->18123|31783->18124|31825->18137|31855->18138|31944->18198|31974->18199|32082->18278|32112->18279|32191->18329|32221->18330|32263->18343|32293->18344|32330->18353|32360->18354|32407->18372|32437->18373|32621->18528|32651->18529|32757->18606|32787->18607|32971->18762|33001->18763|33240->18973|33270->18974|33499->19174|33529->19175|33906->19523|33936->19524|34025->19584|34055->19585|34191->19692|34221->19693|34300->19743|34330->19744|34372->19757|34402->19758|34439->19767|34469->19768|34506->19777|34535->19778|34570->19785|34599->19786|34655->1242|34683->1260|34749->1291|34764->1297|34826->1337|34857->19802|34895->19804|34942->19841|34982->19842|35021->19844|35059->19859|35147->19910|35167->19920|35203->19933|35293->19986|35313->19996|35349->20009|35441->20064|35461->20074|35503->20093|35595->20148|35615->20158|35657->20177|35750->20233|35770->20243|35808->20258|35899->20312|35919->20322|35955->20335|36048->20391|36068->20401|36111->20421|36204->20477|36224->20487|36267->20507|36354->20557|36374->20567|36411->20581|36496->20629|36516->20639|36551->20651|36638->20701|36658->20711|36695->20725|36780->20773|36800->20783|36835->20795|36921->20844|36941->20854|36980->20870|37075->20928|37095->20938|37140->20960|37226->21009|37246->21019|37282->21032|37380->21093|37400->21103|37448->21128|38622->22265|38642->22275|38685->22295|38867->22440|38887->22450|38930->22470|39092->22595|39112->22605|39150->22620|39276->22709|39296->22719|39332->22732|39461->22824|39481->22834|39518->22848|39622->22915|39642->22925|39677->22937|39796->23019|39816->23029|39853->23043|39957->23110|39977->23120|40012->23132|40163->23246|40183->23256|40222->23272|40446->23459|40466->23469|40511->23491|40964->23907|40984->23917|41018->23928|41192->24065|41212->24075|41248->24088|41397->24200|41417->24210|41465->24235|41531->24269
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|70->30|70->30|70->30|72->32|72->32|72->32|74->34|74->34|74->34|76->36|76->36|76->36|81->41|81->41|93->53|93->53|95->55|95->55|95->55|95->55|97->57|97->57|98->58|98->58|100->60|100->60|100->60|100->60|102->62|102->62|111->71|111->71|113->73|113->73|118->78|118->78|120->80|120->80|125->85|125->85|126->86|126->86|129->89|129->89|131->91|131->91|132->92|132->92|134->94|134->94|135->95|135->95|137->97|137->97|138->98|138->98|140->100|140->100|141->101|141->101|143->103|143->103|144->104|144->104|146->106|146->106|147->107|147->107|149->109|149->109|150->110|150->110|152->112|152->112|153->113|153->113|155->115|155->115|156->116|156->116|158->118|158->118|159->119|159->119|161->121|161->121|162->122|162->122|164->124|164->124|165->125|165->125|167->127|167->127|168->128|168->128|170->130|170->130|171->131|171->131|173->133|173->133|174->134|174->134|176->136|176->136|177->137|177->137|179->139|179->139|180->140|180->140|182->142|182->142|183->143|183->143|185->145|185->145|186->146|186->146|188->148|188->148|189->149|189->149|191->151|191->151|192->152|192->152|194->154|194->154|195->155|195->155|197->157|197->157|198->158|198->158|200->160|200->160|201->161|201->161|203->163|203->163|204->164|204->164|205->165|205->165|208->168|208->168|210->170|210->170|211->171|211->171|213->173|213->173|214->174|214->174|216->176|216->176|217->177|217->177|219->179|219->179|220->180|220->180|222->182|222->182|223->183|223->183|225->185|225->185|226->186|226->186|228->188|228->188|229->189|229->189|231->191|231->191|232->192|232->192|234->194|234->194|235->195|235->195|237->197|237->197|238->198|238->198|240->200|240->200|241->201|241->201|243->203|243->203|244->204|244->204|246->206|246->206|247->207|247->207|249->209|249->209|250->210|250->210|252->212|252->212|253->213|253->213|255->215|255->215|256->216|256->216|258->218|258->218|259->219|259->219|261->221|261->221|262->222|262->222|264->224|264->224|265->225|265->225|267->227|267->227|268->228|268->228|270->230|270->230|271->231|271->231|273->233|273->233|274->234|274->234|276->236|276->236|277->237|277->237|279->239|279->239|280->240|280->240|282->242|282->242|283->243|283->243|284->244|284->244|290->250|290->250|292->252|292->252|295->255|295->255|296->256|296->256|297->257|297->257|298->258|298->258|304->264|304->264|306->266|306->266|309->269|309->269|310->270|310->270|311->271|311->271|313->273|313->273|316->276|316->276|318->278|318->278|321->281|321->281|323->283|323->283|328->288|328->288|330->290|330->290|335->295|335->295|336->296|336->296|338->298|338->298|339->299|339->299|343->303|343->303|343->303|343->303|345->305|345->305|346->306|346->306|347->307|347->307|348->308|348->308|350->310|350->310|352->312|352->312|355->315|355->315|358->318|358->318|359->319|359->319|361->321|361->321|363->323|363->323|365->325|365->325|365->325|365->325|367->327|367->327|378->338|378->338|379->339|379->339|380->340|380->340|383->343|383->343|384->344|384->344|401->361|401->361|401->361|401->361|413->373|413->373|413->373|413->373|456->416|456->416|461->421|461->421|463->423|463->423|470->430|470->430|483->443|483->443|487->447|487->447|488->448|488->448|491->451|491->451|492->452|492->452|495->455|495->455|496->456|496->456|497->457|497->457|499->459|499->459|500->460|500->460|502->462|502->462|503->463|503->463|505->465|505->465|506->466|506->466|508->468|508->468|509->469|509->469|511->471|511->471|514->474|514->474|515->475|515->475|518->478|518->478|519->479|519->479|522->482|522->482|523->483|523->483|526->486|526->486|527->487|527->487|528->488|528->488|531->491|531->491|532->492|532->492|533->493|533->493|534->494|534->494|535->495|535->495|540->500|540->500|542->502|542->502|545->505|545->505|550->510|550->510|555->515|555->515|562->522|562->522|563->523|563->523|566->526|566->526|567->527|567->527|568->528|568->528|569->529|569->529|570->530|570->530|571->531|571->531|574->18|574->19|575->20|575->20|575->20|576->533|576->533|576->533|576->533|576->533|576->533|578->535|578->535|578->535|579->536|579->536|579->536|580->537|580->537|580->537|581->538|581->538|581->538|582->539|582->539|582->539|583->540|583->540|583->540|584->541|584->541|584->541|585->542|585->542|585->542|586->543|586->543|586->543|587->544|587->544|587->544|588->545|588->545|588->545|589->546|589->546|589->546|590->547|590->547|590->547|591->548|591->548|591->548|592->549|592->549|592->549|593->550|593->550|593->550|634->591|634->591|634->591|639->596|639->596|639->596|646->603|646->603|646->603|648->605|648->605|648->605|652->609|652->609|652->609|654->611|654->611|654->611|658->615|658->615|658->615|660->617|660->617|660->617|666->623|666->623|666->623|675->632|675->632|675->632|692->649|692->649|692->649|698->655|698->655|698->655|702->659|702->659|702->659|705->662
                    -- GENERATED --
                */
            