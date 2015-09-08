
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
object conditionalSampling2Var extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ConditionalSampling2Var,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ConditionalSampling2Var):play.api.templates.HtmlFormat.Appendable = {
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
    var naValue = "-999999";
    window.onload = function() """),format.raw/*42.32*/("""{"""),format.raw/*42.33*/("""
      put_data(1);
      changeDataSource1();
      put_data(2);
      changeDataSource2();
      put_data(3);
      changeDataSource3();
      put_var(1);
      changeVariableName1();
      put_var(2);
      changeVariableName2();
      put_var(3);
      changeVariableName3();
      time_range3();
      fillMonth();
      enable_download_button();
      disable_pres(1);
      disable_pres(2);
      disable_pres(3);
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      var enviVariableChoose1 = $('#enChoose1');
      if(enviVariableChoose1 == "0")"""),format.raw/*64.37*/("""{"""),format.raw/*64.38*/("""
    	  $('#radioDef1').prop("checked", true);
    	  $('#radioCus1').prop("checked", false);
      """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/("""else"""),format.raw/*67.12*/("""{"""),format.raw/*67.13*/("""
    	  $('#radioDef1').prop("checked", false);
    	  $('#radioCus1').prop("checked", true);
      """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/("""
      var enviVariableChoose2 = $('#enChoose2');
      if(enviVariableChoose2 == "0")"""),format.raw/*72.37*/("""{"""),format.raw/*72.38*/("""
    	  $('#radioDef2').prop("checked", true);
    	  $('#radioCus2').prop("checked", false);
      """),format.raw/*75.7*/("""}"""),format.raw/*75.8*/("""else"""),format.raw/*75.12*/("""{"""),format.raw/*75.13*/("""
    	  $('#radioDef2').prop("checked", false);
    	  $('#radioCus2').prop("checked", true);
      """),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
      var selectMonths = $('#selectMonths').text();
      $('#months option:contains('+selectMonths+')').prop("""),format.raw/*80.59*/("""{"""),format.raw/*80.60*/("""selected: true"""),format.raw/*80.74*/("""}"""),format.raw/*80.75*/(""");
      select_monthsByPara();
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      var x_axis = $('#div_X').text();
      if(x_axis == "0") """),format.raw/*87.25*/("""{"""),format.raw/*87.26*/("""
        $('#radioXLin').prop( "checked", true );
        $('#radioXLog').prop( "checked", false );
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""
      else """),format.raw/*91.12*/("""{"""),format.raw/*91.13*/("""
        $('#radioXLin').prop( "checked", false );
        $('#radioXLog').prop( "checked", true );
      """),format.raw/*94.7*/("""}"""),format.raw/*94.8*/("""
      var y_axis = $('#div_Y').text();
      if(y_axis == "0") """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
          $('#radioYLin').prop( "checked", true );
          $('#radioYLog').prop( "checked", false );
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""
        else """),format.raw/*100.14*/("""{"""),format.raw/*100.15*/("""
          $('#radioYLin').prop( "checked", false );
          $('#radioYLog').prop( "checked", true );
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/("""
      var z_axis = $('#div_Z').text();
      if(z_axis == "0") """),format.raw/*105.25*/("""{"""),format.raw/*105.26*/("""
          $('#radioZLin').prop( "checked", true );
          $('#radioZLog').prop( "checked", false );
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/("""
        else """),format.raw/*109.14*/("""{"""),format.raw/*109.15*/("""
          $('#radioZLin').prop( "checked", false );
          $('#radioZLog').prop( "checked", true );
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
      var binMin1 = $('#binMin1').text();
      var binMax1 = $('#binMax1').text();
      var binNum1 = $('#binNum1').text();
      if(binMin1 == "-999999" && binMax1 == "-999999" && binNum1=="-999999")"""),format.raw/*116.77*/("""{"""),format.raw/*116.78*/("""
    	  $('#radioDef1').prop( "checked", true );
    	  setDefault(1);
      """),format.raw/*119.7*/("""}"""),format.raw/*119.8*/("""else"""),format.raw/*119.12*/("""{"""),format.raw/*119.13*/("""
    	  $('#radioCus1').prop( "checked", true );
    	  $('#min1').val(binMin1);
          $('#max1').val(binMax1);
          $('#bins1').val(binNum1);
      """),format.raw/*124.7*/("""}"""),format.raw/*124.8*/("""
      var binMin2 = $('#binMin2').text();
      var binMax2 = $('#binMax2').text();
      var binNum2 = $('#binNum2').text();
      if(binMin2 == "-999999" && binMax2 == "-999999" && binNum2=="-999999")"""),format.raw/*128.77*/("""{"""),format.raw/*128.78*/("""
    	  $('#radioDef2').prop( "checked", true );
    	  setDefault(2);
      """),format.raw/*131.7*/("""}"""),format.raw/*131.8*/("""else"""),format.raw/*131.12*/("""{"""),format.raw/*131.13*/("""
    	  $('#radioCus2').prop( "checked", true );
    	  $('#min2').val(binMin2);
          $('#max2').val(binMax2);
          $('#bins2').val(binNum2);
      """),format.raw/*136.7*/("""}"""),format.raw/*136.8*/("""
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/("""
    function put_data(ID)"""),format.raw/*143.26*/("""{"""),format.raw/*143.27*/("""
        var list1=document.getElementById("data"+ID);
        for(var key in dataList) """),format.raw/*145.34*/("""{"""),format.raw/*145.35*/("""
          if (key.slice(0,5)==="group") """),format.raw/*146.41*/("""{"""),format.raw/*146.42*/("""
            var og = document.createElement("OPTGROUP");
            og.setAttribute('label', dataList[key][0]);
            list1.add(og);
          """),format.raw/*150.11*/("""}"""),format.raw/*150.12*/(""" else """),format.raw/*150.18*/("""{"""),format.raw/*150.19*/("""
            og.appendChild(new Option(key,key));
          """),format.raw/*152.11*/("""}"""),format.raw/*152.12*/("""
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""
      """),format.raw/*154.7*/("""}"""),format.raw/*154.8*/("""
      function put_var(ID) """),format.raw/*155.28*/("""{"""),format.raw/*155.29*/("""
        var list1=document.getElementById("var"+ID);
        for (var i=list1.length-1; i>=0; i--) """),format.raw/*157.47*/("""{"""),format.raw/*157.48*/("""
        list1.remove(i);
        """),format.raw/*159.9*/("""}"""),format.raw/*159.10*/("""
        data_string =  document.getElementById("data"+ID).value;
        var varList2 = dataList[data_string][1];  
        for (var i=0; i<varList2.length; i++) """),format.raw/*162.47*/("""{"""),format.raw/*162.48*/("""
          var k = varList2[i];
          list1.add(new Option(varList[k][0],k));
        """),format.raw/*165.9*/("""}"""),format.raw/*165.10*/("""
      """),format.raw/*166.7*/("""}"""),format.raw/*166.8*/("""
    function select_monthsByPara()"""),format.raw/*167.35*/("""{"""),format.raw/*167.36*/("""
      	var monthsByPara = $('#monthsPara').text();
      	console.log("HERE!!!!!!"+monthsByPara);
      	if(monthsByPara.search("jan")>-1)"""),format.raw/*170.41*/("""{"""),format.raw/*170.42*/("""
      		document.getElementById('Jan').checked = true;
      	"""),format.raw/*172.8*/("""}"""),format.raw/*172.9*/("""
      	if(monthsByPara.search("feb")>-1)"""),format.raw/*173.41*/("""{"""),format.raw/*173.42*/("""
      		document.getElementById('Feb').checked = true;
      		console.log("Feb!");
      	"""),format.raw/*176.8*/("""}"""),format.raw/*176.9*/("""
      	if(monthsByPara.search("mar")>-1)"""),format.raw/*177.41*/("""{"""),format.raw/*177.42*/("""
      		document.getElementById('Mar').checked = true;
      	"""),format.raw/*179.8*/("""}"""),format.raw/*179.9*/("""
      	if(monthsByPara.search("apr")>-1)"""),format.raw/*180.41*/("""{"""),format.raw/*180.42*/("""
      		document.getElementById('Apr').checked = true;
      	"""),format.raw/*182.8*/("""}"""),format.raw/*182.9*/("""
      	if(monthsByPara.search("may")>-1)"""),format.raw/*183.41*/("""{"""),format.raw/*183.42*/("""
      		document.getElementById('May').checked = true;
      	"""),format.raw/*185.8*/("""}"""),format.raw/*185.9*/("""
      	if(monthsByPara.search("jun")>-1)"""),format.raw/*186.41*/("""{"""),format.raw/*186.42*/("""
      		document.getElementById('Jun').checked = true;
      	"""),format.raw/*188.8*/("""}"""),format.raw/*188.9*/("""
      	if(monthsByPara.search("jul")>-1)"""),format.raw/*189.41*/("""{"""),format.raw/*189.42*/("""
      		document.getElementById('Jul').checked = true;
      	"""),format.raw/*191.8*/("""}"""),format.raw/*191.9*/("""
      	if(monthsByPara.search("aug")>-1)"""),format.raw/*192.41*/("""{"""),format.raw/*192.42*/("""
      		document.getElementById('Aug').checked = true;
      	"""),format.raw/*194.8*/("""}"""),format.raw/*194.9*/("""
      	if(monthsByPara.search("sep")>-1)"""),format.raw/*195.41*/("""{"""),format.raw/*195.42*/("""
      		document.getElementById('Sep').checked = true;
      	"""),format.raw/*197.8*/("""}"""),format.raw/*197.9*/("""
      	if(monthsByPara.search("oct")>-1)"""),format.raw/*198.41*/("""{"""),format.raw/*198.42*/("""
      		document.getElementById('Oct').checked = true;
      	"""),format.raw/*200.8*/("""}"""),format.raw/*200.9*/("""
      	if(monthsByPara.search("nov")>-1)"""),format.raw/*201.41*/("""{"""),format.raw/*201.42*/("""
      		document.getElementById('Nov').checked = true;
      	"""),format.raw/*203.8*/("""}"""),format.raw/*203.9*/("""
      	if(monthsByPara.search("dec")>-1)"""),format.raw/*204.41*/("""{"""),format.raw/*204.42*/("""
      		document.getElementById('Dec').checked = true;
      	"""),format.raw/*206.8*/("""}"""),format.raw/*206.9*/("""
      """),format.raw/*207.7*/("""}"""),format.raw/*207.8*/("""
    function disable_pres(ID)
    """),format.raw/*209.5*/("""{"""),format.raw/*209.6*/("""
      var x;
      var var1 = $("#var"+ID).val();
      x=document.getElementById("pres"+ID);
      if(x.value == "-999999,-999999" && ID == 1)"""),format.raw/*213.50*/("""{"""),format.raw/*213.51*/("""
    	  x.value = "N/A";
          x.disabled=true;
      """),format.raw/*216.7*/("""}"""),format.raw/*216.8*/("""else if(x.value == "-999999" && (ID == 2 || ID == 3))"""),format.raw/*216.61*/("""{"""),format.raw/*216.62*/("""
    	  x.value = "N/A";
          x.disabled=true;
      """),format.raw/*219.7*/("""}"""),format.raw/*219.8*/("""else"""),format.raw/*219.12*/("""{"""),format.raw/*219.13*/("""
    	  if(ID == 1)"""),format.raw/*220.19*/("""{"""),format.raw/*220.20*/("""
	    	  	var split12 = x.value.split(",");
	   	        var temp1 = split12[0];
	   	        var temp2 = split12[1];
	   	        if ( var1 == 'ot' || var1 == 'os') """),format.raw/*224.49*/("""{"""),format.raw/*224.50*/("""
	   	          temp1 = temp1 / 10000;  
	   	          temp2 = temp2 / 10000;  
	   	        """),format.raw/*227.14*/("""}"""),format.raw/*227.15*/(""" 
	   	        else """),format.raw/*228.19*/("""{"""),format.raw/*228.20*/("""
	   	          temp1 = temp1 / 100;  
	   	          temp2 = temp2 / 100;  
	   	        """),format.raw/*231.14*/("""}"""),format.raw/*231.15*/("""
	   	        x.value = temp1 + "," + temp2;
    	  """),format.raw/*233.8*/("""}"""),format.raw/*233.9*/("""
    	  else"""),format.raw/*234.12*/("""{"""),format.raw/*234.13*/("""
    		  if ( var1 == 'ot' || var1 == 'os') """),format.raw/*235.44*/("""{"""),format.raw/*235.45*/("""
	   	          x.value = x.value / 10000;  
	   	        """),format.raw/*237.14*/("""}"""),format.raw/*237.15*/(""" 
	   	        else """),format.raw/*238.19*/("""{"""),format.raw/*238.20*/("""
	   	        	x.value = x.value / 100;  
	   	        """),format.raw/*240.14*/("""}"""),format.raw/*240.15*/("""
    	  """),format.raw/*241.8*/("""}"""),format.raw/*241.9*/("""
      """),format.raw/*242.7*/("""}"""),format.raw/*242.8*/("""
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    function enable_pres1(ID)
    """),format.raw/*245.5*/("""{"""),format.raw/*245.6*/("""
      var x;
      x=document.getElementById("pres"+ID);
      x.disabled=false;
    """),format.raw/*249.5*/("""}"""),format.raw/*249.6*/("""
    function changeDataSource1() """),format.raw/*250.34*/("""{"""),format.raw/*250.35*/("""
    	var dataSource = $('#dataSourceP').text();
	    var x = document.getElementById("data1");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*253.37*/("""{"""),format.raw/*253.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*255.7*/("""}"""),format.raw/*255.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*256.42*/("""{"""),format.raw/*256.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*258.7*/("""}"""),format.raw/*258.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*259.42*/("""{"""),format.raw/*259.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*261.7*/("""}"""),format.raw/*261.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*262.42*/("""{"""),format.raw/*262.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*264.7*/("""}"""),format.raw/*264.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*265.43*/("""{"""),format.raw/*265.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*267.7*/("""}"""),format.raw/*267.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*268.48*/("""{"""),format.raw/*268.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*270.7*/("""}"""),format.raw/*270.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*271.45*/("""{"""),format.raw/*271.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*273.7*/("""}"""),format.raw/*273.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*274.44*/("""{"""),format.raw/*274.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*276.7*/("""}"""),format.raw/*276.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*277.41*/("""{"""),format.raw/*277.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*279.7*/("""}"""),format.raw/*279.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*280.45*/("""{"""),format.raw/*280.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*282.7*/("""}"""),format.raw/*282.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*283.45*/("""{"""),format.raw/*283.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*285.7*/("""}"""),format.raw/*285.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*286.47*/("""{"""),format.raw/*286.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*288.7*/("""}"""),format.raw/*288.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*289.43*/("""{"""),format.raw/*289.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*291.7*/("""}"""),format.raw/*291.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*292.43*/("""{"""),format.raw/*292.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*294.7*/("""}"""),format.raw/*294.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*295.43*/("""{"""),format.raw/*295.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*297.7*/("""}"""),format.raw/*297.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*298.42*/("""{"""),format.raw/*298.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*300.7*/("""}"""),format.raw/*300.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*301.42*/("""{"""),format.raw/*301.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*303.7*/("""}"""),format.raw/*303.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*304.46*/("""{"""),format.raw/*304.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*306.7*/("""}"""),format.raw/*306.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*307.43*/("""{"""),format.raw/*307.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*309.7*/("""}"""),format.raw/*309.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*310.42*/("""{"""),format.raw/*310.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*312.7*/("""}"""),format.raw/*312.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*313.43*/("""{"""),format.raw/*313.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*315.7*/("""}"""),format.raw/*315.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*316.42*/("""{"""),format.raw/*316.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*318.7*/("""}"""),format.raw/*318.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*319.41*/("""{"""),format.raw/*319.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*321.7*/("""}"""),format.raw/*321.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*322.42*/("""{"""),format.raw/*322.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*324.7*/("""}"""),format.raw/*324.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*325.46*/("""{"""),format.raw/*325.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*327.7*/("""}"""),format.raw/*327.8*/("""
    """),format.raw/*328.5*/("""}"""),format.raw/*328.6*/("""
    function changeDataSource2() """),format.raw/*329.34*/("""{"""),format.raw/*329.35*/("""
    	var dataSource = $('#dataSourceE1').text();
	    var x = document.getElementById("data2");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*332.37*/("""{"""),format.raw/*332.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*334.7*/("""}"""),format.raw/*334.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*335.42*/("""{"""),format.raw/*335.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*337.7*/("""}"""),format.raw/*337.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*338.42*/("""{"""),format.raw/*338.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*340.7*/("""}"""),format.raw/*340.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*341.42*/("""{"""),format.raw/*341.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*343.7*/("""}"""),format.raw/*343.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*344.43*/("""{"""),format.raw/*344.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*346.7*/("""}"""),format.raw/*346.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*347.48*/("""{"""),format.raw/*347.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*349.7*/("""}"""),format.raw/*349.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*350.45*/("""{"""),format.raw/*350.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*352.7*/("""}"""),format.raw/*352.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*353.44*/("""{"""),format.raw/*353.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*355.7*/("""}"""),format.raw/*355.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*356.41*/("""{"""),format.raw/*356.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*358.7*/("""}"""),format.raw/*358.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*359.45*/("""{"""),format.raw/*359.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*361.7*/("""}"""),format.raw/*361.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*362.45*/("""{"""),format.raw/*362.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*364.7*/("""}"""),format.raw/*364.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*365.47*/("""{"""),format.raw/*365.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*367.7*/("""}"""),format.raw/*367.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*368.43*/("""{"""),format.raw/*368.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*370.7*/("""}"""),format.raw/*370.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*371.43*/("""{"""),format.raw/*371.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*373.7*/("""}"""),format.raw/*373.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*374.43*/("""{"""),format.raw/*374.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*376.7*/("""}"""),format.raw/*376.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*377.42*/("""{"""),format.raw/*377.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*379.7*/("""}"""),format.raw/*379.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*380.42*/("""{"""),format.raw/*380.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*382.7*/("""}"""),format.raw/*382.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*383.46*/("""{"""),format.raw/*383.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*385.7*/("""}"""),format.raw/*385.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*386.43*/("""{"""),format.raw/*386.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*388.7*/("""}"""),format.raw/*388.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*389.42*/("""{"""),format.raw/*389.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*391.7*/("""}"""),format.raw/*391.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*392.43*/("""{"""),format.raw/*392.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*394.7*/("""}"""),format.raw/*394.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*395.42*/("""{"""),format.raw/*395.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*397.7*/("""}"""),format.raw/*397.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*398.41*/("""{"""),format.raw/*398.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*400.7*/("""}"""),format.raw/*400.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*401.42*/("""{"""),format.raw/*401.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*403.7*/("""}"""),format.raw/*403.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*404.46*/("""{"""),format.raw/*404.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*406.7*/("""}"""),format.raw/*406.8*/("""
    """),format.raw/*407.5*/("""}"""),format.raw/*407.6*/("""
    function changeDataSource3() """),format.raw/*408.34*/("""{"""),format.raw/*408.35*/("""
    	var dataSource = $('#dataSourceE2').text();
	    var x = document.getElementById("data3");
	    if(dataSource == "gfdl_esm2g" )"""),format.raw/*411.37*/("""{"""),format.raw/*411.38*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*413.7*/("""}"""),format.raw/*413.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*414.42*/("""{"""),format.raw/*414.43*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*416.7*/("""}"""),format.raw/*416.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*417.42*/("""{"""),format.raw/*417.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*419.7*/("""}"""),format.raw/*419.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*420.42*/("""{"""),format.raw/*420.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*422.7*/("""}"""),format.raw/*422.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*423.43*/("""{"""),format.raw/*423.44*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*425.7*/("""}"""),format.raw/*425.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*426.48*/("""{"""),format.raw/*426.49*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*428.7*/("""}"""),format.raw/*428.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*429.45*/("""{"""),format.raw/*429.46*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*431.7*/("""}"""),format.raw/*431.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*432.44*/("""{"""),format.raw/*432.45*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*434.7*/("""}"""),format.raw/*434.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*435.41*/("""{"""),format.raw/*435.42*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*437.7*/("""}"""),format.raw/*437.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*438.45*/("""{"""),format.raw/*438.46*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*440.7*/("""}"""),format.raw/*440.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*441.45*/("""{"""),format.raw/*441.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*443.7*/("""}"""),format.raw/*443.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*444.47*/("""{"""),format.raw/*444.48*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*446.7*/("""}"""),format.raw/*446.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*447.43*/("""{"""),format.raw/*447.44*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*449.7*/("""}"""),format.raw/*449.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*450.43*/("""{"""),format.raw/*450.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*452.7*/("""}"""),format.raw/*452.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*453.43*/("""{"""),format.raw/*453.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*455.7*/("""}"""),format.raw/*455.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*456.42*/("""{"""),format.raw/*456.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*458.7*/("""}"""),format.raw/*458.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*459.42*/("""{"""),format.raw/*459.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*461.7*/("""}"""),format.raw/*461.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*462.46*/("""{"""),format.raw/*462.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*464.7*/("""}"""),format.raw/*464.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*465.43*/("""{"""),format.raw/*465.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*467.7*/("""}"""),format.raw/*467.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*468.42*/("""{"""),format.raw/*468.43*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*470.7*/("""}"""),format.raw/*470.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*471.43*/("""{"""),format.raw/*471.44*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*473.7*/("""}"""),format.raw/*473.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*474.42*/("""{"""),format.raw/*474.43*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*476.7*/("""}"""),format.raw/*476.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*477.41*/("""{"""),format.raw/*477.42*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*479.7*/("""}"""),format.raw/*479.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*480.42*/("""{"""),format.raw/*480.43*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*482.7*/("""}"""),format.raw/*482.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*483.46*/("""{"""),format.raw/*483.47*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*485.7*/("""}"""),format.raw/*485.8*/("""
    """),format.raw/*486.5*/("""}"""),format.raw/*486.6*/("""
    function changeVariableName1()"""),format.raw/*487.35*/("""{"""),format.raw/*487.36*/("""
        var var_string = $('#variableNameP').text();
        var data_string = $('#dataSourceP').text();
        data_string = data_string.replace("_", "/").toUpperCase();
        var varList2 = dataList[data_string][1];  
        var x = document.getElementById("var1");
        for (var i=0; i<varList2.length; i++) """),format.raw/*493.47*/("""{"""),format.raw/*493.48*/("""
      	  var k = varList2[i];
            if (k == var_string) """),format.raw/*495.34*/("""{"""),format.raw/*495.35*/("""
            	x.options[i].selected=true;
            	break;
            """),format.raw/*498.13*/("""}"""),format.raw/*498.14*/("""
        """),format.raw/*499.9*/("""}"""),format.raw/*499.10*/("""
    """),format.raw/*500.5*/("""}"""),format.raw/*500.6*/("""
    function changeVariableName2()"""),format.raw/*501.35*/("""{"""),format.raw/*501.36*/("""
        var var_string = $('#variableNameE1').text();
        var data_string = $('#dataSourceE1').text();
        data_string = data_string.replace("_", "/").toUpperCase();
        var varList2 = dataList[data_string][1];  
        var x = document.getElementById("var2");
        for (var i=0; i<varList2.length; i++) """),format.raw/*507.47*/("""{"""),format.raw/*507.48*/("""
      	  var k = varList2[i];
            if (k == var_string) """),format.raw/*509.34*/("""{"""),format.raw/*509.35*/("""
            	x.options[i].selected=true;
            	break;
            """),format.raw/*512.13*/("""}"""),format.raw/*512.14*/("""
        """),format.raw/*513.9*/("""}"""),format.raw/*513.10*/("""
    """),format.raw/*514.5*/("""}"""),format.raw/*514.6*/("""
    function changeVariableName3()"""),format.raw/*515.35*/("""{"""),format.raw/*515.36*/("""
        var var_string = $('#variableNameE2').text();
        var data_string = $('#dataSourceE2').text();
        data_string = data_string.replace("_", "/").toUpperCase();
        var varList2 = dataList[data_string][1];  
        var x = document.getElementById("var3");
        for (var i=0; i<varList2.length; i++) """),format.raw/*521.47*/("""{"""),format.raw/*521.48*/("""
      	  var k = varList2[i];
            if (k == var_string) """),format.raw/*523.34*/("""{"""),format.raw/*523.35*/("""
            	x.options[i].selected=true;
            	break;
            """),format.raw/*526.13*/("""}"""),format.raw/*526.14*/("""
        """),format.raw/*527.9*/("""}"""),format.raw/*527.10*/("""
    """),format.raw/*528.5*/("""}"""),format.raw/*528.6*/("""
    function select_all_months()
    """),format.raw/*530.5*/("""{"""),format.raw/*530.6*/("""
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
    """),format.raw/*543.5*/("""}"""),format.raw/*543.6*/("""
    function no_month_check()
    """),format.raw/*545.5*/("""{"""),format.raw/*545.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*557.61*/("""{"""),format.raw/*557.62*/("""
           return true;
          """),format.raw/*559.11*/("""}"""),format.raw/*559.12*/("""
        else
           return false;
    """),format.raw/*562.5*/("""}"""),format.raw/*562.6*/("""
    function reset_months()
    """),format.raw/*564.5*/("""{"""),format.raw/*564.6*/("""
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
    """),format.raw/*577.5*/("""}"""),format.raw/*577.6*/("""
    function setDefault(ID)
    """),format.raw/*579.5*/("""{"""),format.raw/*579.6*/("""
       var x=document.getElementById("min"+ID);
       var y=document.getElementById("max"+ID);
       var z=document.getElementById("bins"+ID);
       x.value = "N/A";
       x.disabled=true;
       y.value = "N/A";
       y.disabled=true;
       z.value = "N/A";
       z.disabled=true;
    """),format.raw/*589.5*/("""}"""),format.raw/*589.6*/("""
    function setCustomized(ID)
    """),format.raw/*591.5*/("""{"""),format.raw/*591.6*/("""
       var x=document.getElementById("min"+ID);
       var y=document.getElementById("max"+ID);
       var z=document.getElementById("bins"+ID);
       x.value = "";
       x.disabled=false;
       y.value = "";
       y.disabled=false;
       z.value = "";
       z.disabled=false;
    """),format.raw/*601.5*/("""}"""),format.raw/*601.6*/("""
    function getMonthStr() """),format.raw/*602.28*/("""{"""),format.raw/*602.29*/("""
            var month_str = "";
            for (var i=0; i<monthList.length; i++) """),format.raw/*604.52*/("""{"""),format.raw/*604.53*/("""
              var mm = document.getElementById(monthList[i]);
              if (mm.checked == true) """),format.raw/*606.39*/("""{"""),format.raw/*606.40*/("""
                month_str += ","+(i+1);
              """),format.raw/*608.15*/("""}"""),format.raw/*608.16*/("""
            """),format.raw/*609.13*/("""}"""),format.raw/*609.14*/("""
            month_str = month_str.substr(1);
            return month_str;
    """),format.raw/*612.5*/("""}"""),format.raw/*612.6*/("""
    $(document).ready(function()"""),format.raw/*613.33*/("""{"""),format.raw/*613.34*/("""
      $("#download_data").click(function(event) """),format.raw/*614.49*/("""{"""),format.raw/*614.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*617.7*/("""}"""),format.raw/*617.8*/(""");
      $("#conditionalSamp").click(function(event) """),format.raw/*618.51*/("""{"""),format.raw/*618.52*/("""
        Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*621.31*/("""{"""),format.raw/*621.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*625.9*/("""}"""),format.raw/*625.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/conditionalSampling2Var?";
        var d1 = $("#data1").val();
        var model1 = d1.replace("/", "_");
        model1 = model1.toLowerCase();
        var arglist = "";
        arglist = arglist.concat("model1=");
        arglist = arglist.concat(model1);
        var variable1 = $("#var1").val();
        arglist = arglist.concat("&var1=");
        arglist = arglist.concat(variable1);
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
        var press_range = $("#pres1").val();
        var pres12 = parse_pres(press_range);
        var pres1;
        var pres2;
        if (pres12 === naValue) """),format.raw/*663.33*/("""{"""),format.raw/*663.34*/("""
          pres1 = naValue;
          pres2 = naValue;
        """),format.raw/*666.9*/("""}"""),format.raw/*666.10*/(""" else """),format.raw/*666.16*/("""{"""),format.raw/*666.17*/("""
          split12 = pres12.split(",");
          if (split12.length != 2) """),format.raw/*668.36*/("""{"""),format.raw/*668.37*/("""
            alert("pressure level range needs to be two values separated by comma.");
            return; 
          """),format.raw/*671.11*/("""}"""),format.raw/*671.12*/(""" else """),format.raw/*671.18*/("""{"""),format.raw/*671.19*/("""
            pres1 = split12[0];
            pres2 = split12[1];
            if (variable1 == 'ot' || variable1 == 'os') """),format.raw/*674.57*/("""{"""),format.raw/*674.58*/("""
              pres1 = pres1 * 10000;  
              pres2 = pres2 * 10000;  
            """),format.raw/*677.13*/("""}"""),format.raw/*677.14*/(""" 
            else """),format.raw/*678.18*/("""{"""),format.raw/*678.19*/("""
              pres1 = pres1 * 100;  
              pres2 = pres2 * 100;  
            """),format.raw/*681.13*/("""}"""),format.raw/*681.14*/("""
          """),format.raw/*682.11*/("""}"""),format.raw/*682.12*/("""
        """),format.raw/*683.9*/("""}"""),format.raw/*683.10*/("""
        arglist = arglist.concat("&pres1=");
        arglist = arglist.concat(pres1);
        arglist = arglist.concat("&pres2=");
        arglist = arglist.concat(pres2);
        var month_str = getMonthStr();
        arglist = arglist.concat("&months=");
        arglist = arglist.concat(month_str);
        var d2 = $("#data2").val();
        var model2 = d2.replace("/", "_");
        model2 = model2.toLowerCase();
        arglist = arglist.concat("&model2=");
        arglist = arglist.concat(model2);
        var variable2 = $("#var2").val();
        arglist = arglist.concat("&var2=");
        arglist = arglist.concat(variable2);
        var d3 = $("#data3").val();
        var model3 = d3.replace("/", "_");
        model3 = model3.toLowerCase();
        arglist = arglist.concat("&model3=");
        arglist = arglist.concat(model3);
        var variable3 = $("#var3").val();
        arglist = arglist.concat("&var3=");
        arglist = arglist.concat(variable3);
        var plev1 = $("#pres2").val();
        plev1 = parse_pres(plev1);
        if (plev1>0) """),format.raw/*709.22*/("""{"""),format.raw/*709.23*/("""
          if (variable2 == 'ot' || variable2 == 'os') """),format.raw/*710.55*/("""{"""),format.raw/*710.56*/("""
            plev1 = plev1 * 10000;  
          """),format.raw/*712.11*/("""}"""),format.raw/*712.12*/(""" 
          else """),format.raw/*713.16*/("""{"""),format.raw/*713.17*/("""
            plev1 = plev1 * 100;  
          """),format.raw/*715.11*/("""}"""),format.raw/*715.12*/("""
        """),format.raw/*716.9*/("""}"""),format.raw/*716.10*/("""
        arglist = arglist.concat("&env_var_plev1=");
        arglist = arglist.concat(plev1);
        var plev2 = $("#pres3").val();
        plev2 = parse_pres(plev2);
        if (plev2>0) """),format.raw/*721.22*/("""{"""),format.raw/*721.23*/("""
          if (variable3 == 'ot' || variable3 == 'os') """),format.raw/*722.55*/("""{"""),format.raw/*722.56*/("""
            plev2 = plev2 * 10000;  
          """),format.raw/*724.11*/("""}"""),format.raw/*724.12*/(""" 
          else """),format.raw/*725.16*/("""{"""),format.raw/*725.17*/("""
            plev2 = plev2 * 100;  
          """),format.raw/*727.11*/("""}"""),format.raw/*727.12*/("""
        """),format.raw/*728.9*/("""}"""),format.raw/*728.10*/("""
        arglist = arglist.concat("&env_var_plev2=");
        arglist = arglist.concat(plev2);
        var binstate1 = document.getElementById('radioDef1').checked;
        var binMin1, binMax1, numBins1;
        if (binstate1 == true) """),format.raw/*733.32*/("""{"""),format.raw/*733.33*/(""" 
          binMin1 = naValue;
          binMax1 = naValue;
          numBins1 = naValue;
        """),format.raw/*737.9*/("""}"""),format.raw/*737.10*/("""
        else """),format.raw/*738.14*/("""{"""),format.raw/*738.15*/(""" 
          binMin1 = $("#min1").val();
          binMax1 = $("#max1").val();
          numBins1 = $("#bins1").val();
        """),format.raw/*742.9*/("""}"""),format.raw/*742.10*/("""
        arglist = arglist.concat("&bin_min1=");
        arglist = arglist.concat(binMin1);
        arglist = arglist.concat("&bin_max1=");
        arglist = arglist.concat(binMax1);
        arglist = arglist.concat("&bin_n1=");
        arglist = arglist.concat(numBins1);
        var binstate2 = document.getElementById('radioDef2').checked;
        var binMin2, binMax2, numBins2;
        if (binstate2 == true) """),format.raw/*751.32*/("""{"""),format.raw/*751.33*/(""" 
          binMin2 = naValue;
          binMax2 = naValue;
          numBins2 = naValue;
        """),format.raw/*755.9*/("""}"""),format.raw/*755.10*/("""
        else """),format.raw/*756.14*/("""{"""),format.raw/*756.15*/(""" 
          binMin2 = $("#min2").val();
          binMax2 = $("#max2").val();
          numBins2 = $("#bins2").val();
        """),format.raw/*760.9*/("""}"""),format.raw/*760.10*/("""
        arglist = arglist.concat("&bin_min2=");
        arglist = arglist.concat(binMin2);
        arglist = arglist.concat("&bin_max2=");
        arglist = arglist.concat(binMax2);
        arglist = arglist.concat("&bin_n2=");
        arglist = arglist.concat(numBins2);
        var xstate = document.getElementById('radioXLin').checked;
        var xvalue;
        if (xstate == true)
          xvalue = 0;
        else
          xvalue = 1;
        var ystate = document.getElementById('radioYLin').checked;
        var yvalue;
        if (ystate == true)
          yvalue = 0;
        else
          yvalue = 1;
        var zstate = document.getElementById('radioZLin').checked;
        var zvalue;
        if (zstate == true)
          zvalue = 0;
        else
          zvalue = 1;
        var dispOpt;
        dispOpt = xvalue*1 + yvalue*2 + zvalue*4;
        var dispOptString = dispOpt.toString();
        arglist = arglist.concat("&displayOpt=");
        arglist = arglist.concat(dispOptString);
        url = url + encodeURI(arglist);
        var urlTimeBounds = "http://" + window.location.hostname + ":9002/svc/two_time_bounds?";
        var arglistTB = "";
        arglistTB = arglistTB.concat("serviceType=");
        arglistTB = arglistTB.concat("1");
        arglistTB = arglistTB.concat("&source1=");
        arglistTB = arglistTB.concat(d1);
        arglistTB = arglistTB.concat("&var1=");
        arglistTB = arglistTB.concat(variable1);
        arglistTB = arglistTB.concat("&source2=");
        arglistTB = arglistTB.concat(d2);
        arglistTB = arglistTB.concat("&var2=");
        arglistTB = arglistTB.concat(variable2);
        urlTimeBounds = urlTimeBounds + encodeURI(arglistTB);
        $.ajax("""),format.raw/*804.16*/("""{"""),format.raw/*804.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*809.54*/("""{"""),format.raw/*809.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*811.44*/("""{"""),format.raw/*811.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*818.17*/("""}"""),format.raw/*818.18*/("""
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
                if (lowerT1 == 0  || upperT1 == 0)"""),format.raw/*831.51*/("""{"""),format.raw/*831.52*/(""" 
                  alert("We do not have data for the data-1 source and variable configuration.");
                  return;
                """),format.raw/*834.17*/("""}"""),format.raw/*834.18*/("""
                else if (lowerT2 == 0  || upperT2 == 0)"""),format.raw/*835.56*/("""{"""),format.raw/*835.57*/(""" 
                  alert("We do not have data for the data-2 source and variable configuration.");
                  return;
                """),format.raw/*838.17*/("""}"""),format.raw/*838.18*/("""
                else if (lowerT2 > upperT1 || lowerT1 > upperT2) """),format.raw/*839.66*/("""{"""),format.raw/*839.67*/(""" 
                  alert("The two data sets/vars do not have a common time range.");
                  return;
                """),format.raw/*842.17*/("""}"""),format.raw/*842.18*/("""
                else """),format.raw/*843.22*/("""{"""),format.raw/*843.23*/(""" 
                  if (lowerT1 > lowerT2) """),format.raw/*844.42*/("""{"""),format.raw/*844.43*/(""" 
                    lowerT = lowerT1;
                  """),format.raw/*846.19*/("""}"""),format.raw/*846.20*/("""
                  else """),format.raw/*847.24*/("""{"""),format.raw/*847.25*/("""
                    lowerT = lowerT2;
                  """),format.raw/*849.19*/("""}"""),format.raw/*849.20*/("""
                  if (upperT1 > upperT2) """),format.raw/*850.42*/("""{"""),format.raw/*850.43*/(""" 
                    upperT = upperT2;
                  """),format.raw/*852.19*/("""}"""),format.raw/*852.20*/("""
                  else """),format.raw/*853.24*/("""{"""),format.raw/*853.25*/("""
                    upperT = upperT1;
                  """),format.raw/*855.19*/("""}"""),format.raw/*855.20*/("""
                """),format.raw/*856.17*/("""}"""),format.raw/*856.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*858.51*/("""{"""),format.raw/*858.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*861.17*/("""}"""),format.raw/*861.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*862.52*/("""{"""),format.raw/*862.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*865.17*/("""}"""),format.raw/*865.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*866.52*/("""{"""),format.raw/*866.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*869.17*/("""}"""),format.raw/*869.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*870.52*/("""{"""),format.raw/*870.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*873.17*/("""}"""),format.raw/*873.18*/("""
            """),format.raw/*874.13*/("""}"""),format.raw/*874.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*875.59*/("""{"""),format.raw/*875.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*878.13*/("""}"""),format.raw/*878.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*879.49*/("""{"""),format.raw/*879.50*/("""
            """),format.raw/*880.13*/("""}"""),format.raw/*880.14*/("""
        """),format.raw/*881.9*/("""}"""),format.raw/*881.10*/(""");
        $.ajax("""),format.raw/*882.16*/("""{"""),format.raw/*882.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*887.54*/("""{"""),format.raw/*887.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*889.44*/("""{"""),format.raw/*889.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*896.17*/("""}"""),format.raw/*896.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html = "<img src='"+data.url+"' width='820'/>";
                $("#Image").html(html);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*903.13*/("""}"""),format.raw/*903.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*904.59*/("""{"""),format.raw/*904.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*907.13*/("""}"""),format.raw/*907.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*908.49*/("""{"""),format.raw/*908.50*/("""
            """),format.raw/*909.13*/("""}"""),format.raw/*909.14*/("""
        """),format.raw/*910.9*/("""}"""),format.raw/*910.10*/(""");
      """),format.raw/*911.7*/("""}"""),format.raw/*911.8*/(""");
    """),format.raw/*912.5*/("""}"""),format.raw/*912.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.48*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*914.2*/(""" """),_display_(Seq[Any](/*914.4*/main("Parameters of ConfId", scripts)/*914.41*/{_display_(Seq[Any](format.raw/*914.42*/(""" """),_display_(Seq[Any](/*914.44*/flash_message())),format.raw/*914.59*/("""
<p>
<div id="dataSourceP" style="display: none;">"""),_display_(Seq[Any](/*916.47*/parameters/*916.57*/.getDataSourceP())),format.raw/*916.74*/("""</div>
<div id="dataSourceE1" style="display: none;">"""),_display_(Seq[Any](/*917.48*/parameters/*917.58*/.getDataSourceE1())),format.raw/*917.76*/("""</div>
<div id="dataSourceE2" style="display: none;">"""),_display_(Seq[Any](/*918.48*/parameters/*918.58*/.getDataSourceE2())),format.raw/*918.76*/("""</div>
<div id="variableNameP" style="display: none;">"""),_display_(Seq[Any](/*919.49*/parameters/*919.59*/.getVariableNameP())),format.raw/*919.78*/("""</div>
<div id="variableNameE1" style="display: none;">"""),_display_(Seq[Any](/*920.50*/parameters/*920.60*/.getVariableNameE1())),format.raw/*920.80*/("""</div>
<div id="variableNameE2" style="display: none;">"""),_display_(Seq[Any](/*921.50*/parameters/*921.60*/.getVariableNameE2())),format.raw/*921.80*/("""</div>
<div id="pressureRange1" style="display: none;">"""),_display_(Seq[Any](/*922.50*/parameters/*922.60*/.getPressureRange1())),format.raw/*922.80*/("""</div>
<div id="pressureRange2" style="display: none;">"""),_display_(Seq[Any](/*923.50*/parameters/*923.60*/.getPressureRange2())),format.raw/*923.80*/("""</div>
<div id="env_var_plev1" style="display: none;">"""),_display_(Seq[Any](/*924.49*/parameters/*924.59*/.getEnableVarPlev1())),format.raw/*924.79*/("""</div>
<div id="env_var_plev2" style="display: none;">"""),_display_(Seq[Any](/*925.49*/parameters/*925.59*/.getEnableVarPlev2())),format.raw/*925.79*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*926.50*/parameters/*926.60*/.getStartYearMonth())),format.raw/*926.80*/("""</div>
<div id="enChoose1" style="display: none;">"""),_display_(Seq[Any](/*927.45*/parameters/*927.55*/.getCustomized1)),format.raw/*927.70*/("""</div>
<div id="enChoose2" style="display: none;">"""),_display_(Seq[Any](/*928.45*/parameters/*928.55*/.getCustomized2)),format.raw/*928.70*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*929.48*/parameters/*929.58*/.getEndYearMonth())),format.raw/*929.76*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*930.48*/parameters/*930.58*/.getSelectMonths())),format.raw/*930.76*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*931.46*/parameters/*931.56*/.getMonth())),format.raw/*931.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*932.44*/parameters/*932.54*/.getStartLat())),format.raw/*932.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*933.42*/parameters/*933.52*/.getEndLat())),format.raw/*933.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*934.44*/parameters/*934.54*/.getStartLon())),format.raw/*934.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*935.42*/parameters/*935.52*/.getEndLon())),format.raw/*935.64*/("""</div>
<div id="div_X" style="display: none;">"""),_display_(Seq[Any](/*936.41*/parameters/*936.51*/.getX())),format.raw/*936.58*/("""</div>
<div id="div_Y" style="display: none;">"""),_display_(Seq[Any](/*937.41*/parameters/*937.51*/.getY())),format.raw/*937.58*/("""</div>
<div id="div_Z" style="display: none;">"""),_display_(Seq[Any](/*938.41*/parameters/*938.51*/.getZ())),format.raw/*938.58*/("""</div>
<div id="binMin1" style="display: none;">"""),_display_(Seq[Any](/*939.43*/parameters/*939.53*/.getBin_min1())),format.raw/*939.67*/("""</div>
<div id="binMax1" style="display: none;">"""),_display_(Seq[Any](/*940.43*/parameters/*940.53*/.getBin_max1())),format.raw/*940.67*/("""</div>
<div id="binNum1" style="display: none;">"""),_display_(Seq[Any](/*941.43*/parameters/*941.53*/.getBin_n1())),format.raw/*941.65*/("""</div>
<div id="binMin2" style="display: none;">"""),_display_(Seq[Any](/*942.43*/parameters/*942.53*/.getBin_min2())),format.raw/*942.67*/("""</div>
<div id="binMax2" style="display: none;">"""),_display_(Seq[Any](/*943.43*/parameters/*943.53*/.getBin_max2())),format.raw/*943.67*/("""</div>
<div id="binNum2" style="display: none;">"""),_display_(Seq[Any](/*944.43*/parameters/*944.53*/.getBin_n2())),format.raw/*944.65*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*945.52*/parameters/*945.62*/.getExecutionPurpose())),format.raw/*945.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*946.41*/parameters/*946.51*/.getImage())),format.raw/*946.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*947.43*/parameters/*947.53*/.getDataURL())),format.raw/*947.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*948.55*/parameters/*948.65*/.getServiceResponseText())),format.raw/*948.90*/("""</div>
<table border="1">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Conditional Sampling with Two Variables</b><br>
				<br> This service sorts one variable called sampled variable by
				the values of two variables called sampling variables and displays
				the averaged value of the sampled variable in color as a function of
				the bin value of the two sampling variables in X-Y axis. There are
				overlaid contours which show the number of samples in each of the
				two sampling variable bin.<br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<center>Physical Variable (sampled variable)</center>
		</td>
		<td colspan="2" rowspan="4"></td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data1" , id="data1"
			onchange="put_var(1); time_range3()"></select></td>
	</tr>
	<tr>
		<td>variable name:</td>
		<td><select name="var1" , id="var1"
			onchange="select_var(1); time_range3()">
		</select></td>
	</tr>
	<td>atmosphere pressure range (hPa) <br> or ocean pressure
		range (dbar):
	</td>
	<td><input id="pres1"
		value=""""),_display_(Seq[Any](/*985.11*/{parameters.getPressureRange1()+','+parameters.getPressureRange2()})),format.raw/*985.78*/(""""
		alt="pressure" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<center>Environmental Variable 1 (sampling variable)</center>
		</td>
		<td colspan="2" rowspan="6"></td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data2" , id="data2"
			onchange="put_var(2); time_range3()"></select></td>
	</tr>
	<tr>
		<td>variable name:</td>
		<td><select name="var2" , id="var2"
			onchange="select_var(2); time_range3()">
		</select></td>
	</tr>
	<tr>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar):
		</td>
		<td><input id="pres2" value=""""),_display_(Seq[Any](/*1009.33*/parameters/*1009.43*/.getEnableVarPlev1())),format.raw/*1009.63*/(""""
			alt="pressure" /></td>
	</tr>
	<tr>
		<td colspan="2">sampling variable binning specification:
			<form>
				default: <input onclick="setDefault(1)" type="radio" name="default1"
					value="" id="radioDef1" checked> customized: <input
					onclick="setCustomized(1)" type="radio" name="default1" value=""
					id="radioCus1">
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<form>
				Min: <input id="min1" value=""""),_display_(Seq[Any](/*1025.35*/parameters/*1025.45*/.getBin_min1())),format.raw/*1025.59*/("""" alt=""
					size=3 /> Max: <input id="max1" value=""""),_display_(Seq[Any](/*1026.46*/parameters/*1026.56*/.getBin_max1())),format.raw/*1026.70*/(""""
					alt="" size=3 /> number of bins: <input id="bins1"
					value=""""),_display_(Seq[Any](/*1028.14*/parameters/*1028.24*/.getBin_n1())),format.raw/*1028.36*/("""" alt="" size=3 />
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<center>Environmental Variable 2 (sampling variable)</center>
		</td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data3" , id="data3"
			onchange="put_var(3); time_range3()"></select></td>
	</tr>
	<tr>
		<td>variable name:</td>
		<td><select name="var3" , id="var3"
			onchange="select_var(3); time_range3()">
		</select></td>
	</tr>
	<tr>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar):
		</td>
		<td><input id="pres3" value=""""),_display_(Seq[Any](/*1052.33*/parameters/*1052.43*/.getEnableVarPlev2())),format.raw/*1052.63*/(""""
			alt="pressure" /></td>
	</tr>
	<tr>
		<td colspan="2">sampling variable binning specification:
			<form>
				default: <input onclick="setDefault(2)" type="radio" name="default2"
					value="" id="radioDef2" checked> customized: <input
					onclick="setCustomized(2)" type="radio" name="default2" value=""
					id="radioCus2">
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<form>
				Min: <input id="min2" value=""""),_display_(Seq[Any](/*1068.35*/parameters/*1068.45*/.getBin_min2())),format.raw/*1068.59*/("""" alt=""
					size=3 /> Max: <input id="max2" value=""""),_display_(Seq[Any](/*1069.46*/parameters/*1069.56*/.getBin_max2())),format.raw/*1069.70*/(""""
					alt="" size=3 /> number of bins: <input id="bins2"
					value=""""),_display_(Seq[Any](/*1071.14*/parameters/*1071.24*/.getBin_n2())),format.raw/*1071.36*/("""" alt="" size=3 />
			</form>
		</td>
	</tr>
	<tr>
		<td id=startYear>start year-month:</td>
		<td><input id="t0" value=""""),_display_(Seq[Any](/*1077.30*/parameters/*1077.40*/.getStartYearMonth())),format.raw/*1077.60*/(""""
			alt="start" /></td>
		<td id=endYear>end year-month:</td>
		<td><input id="t1" value=""""),_display_(Seq[Any](/*1080.30*/parameters/*1080.40*/.getEndYearMonth())),format.raw/*1080.58*/(""""
			alt="end" /></td>
	</tr>
	<tr>
		<td id="monthSelect0"></td>
		<td id="monthSelect" colspan="3"></td>
	</tr>
	<tr>
		<td>start lat (deg):</td>
		<td><input id="lat0" value=""""),_display_(Seq[Any](/*1089.32*/parameters/*1089.42*/.getStartLat())),format.raw/*1089.56*/("""" /></td>
		<td>end lat (deg):</td>
		<td><input id="lat1" value=""""),_display_(Seq[Any](/*1091.32*/parameters/*1091.42*/.getEndLat())),format.raw/*1091.54*/("""" /></td>
	</tr>
	<tr>
		<td>start lon (deg):</td>
		<td><input id="lon0" value=""""),_display_(Seq[Any](/*1095.32*/parameters/*1095.42*/.getStartLon())),format.raw/*1095.56*/("""" /></td>
		<td>end lon (deg):</td>
		<td><input id="lon1" value=""""),_display_(Seq[Any](/*1097.32*/parameters/*1097.42*/.getEndLon())),format.raw/*1097.54*/("""" /></td>
	</tr>
	<tr>
		<td colspan="1" rowspan="3">display option:</td>
		<td colspan="3">
			<form>
				X-axis (sampling variable) scale: <input type="radio" name="scale1"
					value="linear" id="radioXLin" checked>linear <input
					type="radio" name="scale1" value="logarithmic" id="radioXLog">logarithmic
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="3">
			<form>
				Y-axis (sampled variable or pressure) scale: <input type="radio"
					name="scale1" value="linear" id="radioYLin" checked>linear
				<input type="radio" name="scale1" value="logarithmic" id="radioYLog">logarithmic
			</form>
	</tr>
	<tr>
		<td colspan="3">
			<form>
				Z-axis (color) scale: <input type="radio" name="scale1"
					value="linear" id="radioZLin" checked>linear <input
					type="radio" name="scale1" value="logarithmic" id="radioZLog">logarithmic
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input id="conditionalSamp"
			type="submit" value="            Get  Plot            "
			style="height: 28px" /></td>
		<form>
			<td colspan="2" align="center"><input id="download_data"
				type="button" value="Download Data" style="height: 28px" /></td>
		</form>
	</tr>
	<tr>
		<td colspan="4">
			<div id="Image">
				<img src=""""),_display_(Seq[Any](/*1138.16*/parameters/*1138.26*/.getImage())),format.raw/*1138.37*/("""" width=680 />
			</div>
		</td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea readonly id="data_url"
				cols="130" rows="2">"""),_display_(Seq[Any](/*1144.26*/parameters/*1144.36*/.getDataURL())),format.raw/*1144.49*/("""</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea id="Response" cols="130"
				rows="6">"""),_display_(Seq[Any](/*1148.15*/parameters/*1148.25*/.getServiceResponseText())),format.raw/*1148.50*/("""</textarea></td>
	</tr>
</table>
""")))})),format.raw/*1151.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ConditionalSampling2Var): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ConditionalSampling2Var) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:48 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/conditionalSampling2Var.scala.html
                    HASH: dd9836586f39a3d343e3ad84a373a1f9015f0fff
                    MATRIX: 3221->1205|3361->1350|3376->1357|3461->1361|3512->1376|3527->1382|3589->1422|3651->1448|3666->1454|3727->1493|3812->1543|3827->1549|3894->1594|4098->1762|4113->1768|4169->1802|4254->1852|4269->1858|4325->1892|4410->1942|4425->1948|4482->1983|4567->2033|4582->2039|4637->2072|4722->2122|4737->2128|4791->2160|4995->2336|5024->2337|5654->2939|5683->2940|5810->3040|5838->3041|5870->3045|5899->3046|6026->3146|6054->3147|6168->3233|6197->3234|6324->3334|6352->3335|6384->3339|6413->3340|6540->3440|6568->3441|6707->3552|6736->3553|6778->3567|6807->3568|7106->3839|7135->3840|7268->3946|7296->3947|7336->3959|7365->3960|7498->4066|7526->4067|7618->4131|7647->4132|7786->4244|7815->4245|7858->4259|7888->4260|8028->4372|8058->4373|8151->4437|8181->4438|8321->4550|8351->4551|8394->4565|8424->4566|8564->4678|8594->4679|8826->4882|8856->4883|8961->4960|8990->4961|9023->4965|9053->4966|9239->5124|9268->5125|9500->5328|9530->5329|9635->5406|9664->5407|9697->5411|9727->5412|9913->5570|9942->5571|10246->5847|10275->5848|10330->5874|10360->5875|10477->5963|10507->5964|10577->6005|10607->6006|10787->6157|10817->6158|10852->6164|10882->6165|10971->6225|11001->6226|11038->6235|11068->6236|11103->6243|11132->6244|11189->6272|11219->6273|11348->6373|11378->6374|11440->6408|11470->6409|11662->6572|11692->6573|11810->6663|11840->6664|11875->6671|11904->6672|11968->6707|11998->6708|12166->6847|12196->6848|12287->6911|12316->6912|12386->6953|12416->6954|12536->7046|12565->7047|12635->7088|12665->7089|12756->7152|12785->7153|12855->7194|12885->7195|12976->7258|13005->7259|13075->7300|13105->7301|13196->7364|13225->7365|13295->7406|13325->7407|13416->7470|13445->7471|13515->7512|13545->7513|13636->7576|13665->7577|13735->7618|13765->7619|13856->7682|13885->7683|13955->7724|13985->7725|14076->7788|14105->7789|14175->7830|14205->7831|14296->7894|14325->7895|14395->7936|14425->7937|14516->8000|14545->8001|14615->8042|14645->8043|14736->8106|14765->8107|14800->8114|14829->8115|14892->8150|14921->8151|15094->8295|15124->8296|15210->8354|15239->8355|15321->8408|15351->8409|15437->8467|15466->8468|15499->8472|15529->8473|15577->8492|15607->8493|15802->8659|15832->8660|15955->8754|15985->8755|16034->8775|16064->8776|16183->8866|16213->8867|16293->8919|16322->8920|16363->8932|16393->8933|16466->8977|16496->8978|16583->9036|16613->9037|16662->9057|16692->9058|16776->9113|16806->9114|16842->9122|16871->9123|16906->9130|16935->9131|16968->9136|16997->9137|17060->9172|17089->9173|17203->9259|17232->9260|17295->9294|17325->9295|17486->9427|17516->9428|17586->9470|17615->9471|17686->9513|17716->9514|17786->9556|17815->9557|17886->9599|17916->9600|17986->9642|18015->9643|18086->9685|18116->9686|18186->9728|18215->9729|18287->9772|18317->9773|18387->9815|18416->9816|18493->9864|18523->9865|18593->9907|18622->9908|18696->9953|18726->9954|18796->9996|18825->9997|18898->10041|18928->10042|18998->10084|19027->10085|19097->10126|19127->10127|19197->10169|19226->10170|19300->10215|19330->10216|19400->10258|19429->10259|19503->10304|19533->10305|19604->10348|19633->10349|19709->10396|19739->10397|19810->10440|19839->10441|19911->10484|19941->10485|20012->10528|20041->10529|20113->10572|20143->10573|20214->10616|20243->10617|20315->10660|20345->10661|20416->10704|20445->10705|20516->10747|20546->10748|20617->10791|20646->10792|20717->10834|20747->10835|20818->10878|20847->10879|20922->10925|20952->10926|21023->10969|21052->10970|21124->11013|21154->11014|21225->11057|21254->11058|21325->11100|21355->11101|21426->11144|21455->11145|21527->11188|21557->11189|21628->11232|21657->11233|21728->11275|21758->11276|21829->11319|21858->11320|21928->11361|21958->11362|22029->11405|22058->11406|22129->11448|22159->11449|22230->11492|22259->11493|22334->11539|22364->11540|22435->11583|22464->11584|22497->11589|22526->11590|22589->11624|22619->11625|22781->11758|22811->11759|22881->11801|22910->11802|22981->11844|23011->11845|23081->11887|23110->11888|23181->11930|23211->11931|23281->11973|23310->11974|23381->12016|23411->12017|23481->12059|23510->12060|23582->12103|23612->12104|23682->12146|23711->12147|23788->12195|23818->12196|23888->12238|23917->12239|23991->12284|24021->12285|24091->12327|24120->12328|24193->12372|24223->12373|24293->12415|24322->12416|24392->12457|24422->12458|24492->12500|24521->12501|24595->12546|24625->12547|24695->12589|24724->12590|24798->12635|24828->12636|24899->12679|24928->12680|25004->12727|25034->12728|25105->12771|25134->12772|25206->12815|25236->12816|25307->12859|25336->12860|25408->12903|25438->12904|25509->12947|25538->12948|25610->12991|25640->12992|25711->13035|25740->13036|25811->13078|25841->13079|25912->13122|25941->13123|26012->13165|26042->13166|26113->13209|26142->13210|26217->13256|26247->13257|26318->13300|26347->13301|26419->13344|26449->13345|26520->13388|26549->13389|26620->13431|26650->13432|26721->13475|26750->13476|26822->13519|26852->13520|26923->13563|26952->13564|27023->13606|27053->13607|27124->13650|27153->13651|27223->13692|27253->13693|27324->13736|27353->13737|27424->13779|27454->13780|27525->13823|27554->13824|27629->13870|27659->13871|27730->13914|27759->13915|27792->13920|27821->13921|27884->13955|27914->13956|28076->14089|28106->14090|28176->14132|28205->14133|28276->14175|28306->14176|28376->14218|28405->14219|28476->14261|28506->14262|28576->14304|28605->14305|28676->14347|28706->14348|28776->14390|28805->14391|28877->14434|28907->14435|28977->14477|29006->14478|29083->14526|29113->14527|29183->14569|29212->14570|29286->14615|29316->14616|29386->14658|29415->14659|29488->14703|29518->14704|29588->14746|29617->14747|29687->14788|29717->14789|29787->14831|29816->14832|29890->14877|29920->14878|29990->14920|30019->14921|30093->14966|30123->14967|30194->15010|30223->15011|30299->15058|30329->15059|30400->15102|30429->15103|30501->15146|30531->15147|30602->15190|30631->15191|30703->15234|30733->15235|30804->15278|30833->15279|30905->15322|30935->15323|31006->15366|31035->15367|31106->15409|31136->15410|31207->15453|31236->15454|31307->15496|31337->15497|31408->15540|31437->15541|31512->15587|31542->15588|31613->15631|31642->15632|31714->15675|31744->15676|31815->15719|31844->15720|31915->15762|31945->15763|32016->15806|32045->15807|32117->15850|32147->15851|32218->15894|32247->15895|32318->15937|32348->15938|32419->15981|32448->15982|32518->16023|32548->16024|32619->16067|32648->16068|32719->16110|32749->16111|32820->16154|32849->16155|32924->16201|32954->16202|33025->16245|33054->16246|33087->16251|33116->16252|33180->16287|33210->16288|33558->16607|33588->16608|33681->16672|33711->16673|33814->16747|33844->16748|33881->16757|33911->16758|33944->16763|33973->16764|34037->16799|34067->16800|34417->17121|34447->17122|34540->17186|34570->17187|34673->17261|34703->17262|34740->17271|34770->17272|34803->17277|34832->17278|34896->17313|34926->17314|35276->17635|35306->17636|35399->17700|35429->17701|35532->17775|35562->17776|35599->17785|35629->17786|35662->17791|35691->17792|35757->17830|35786->17831|36479->18496|36508->18497|36571->18532|36600->18533|37373->19277|37403->19278|37467->19313|37497->19314|37568->19357|37597->19358|37658->19391|37687->19392|38392->20069|38421->20070|38482->20103|38511->20104|38833->20398|38862->20399|38926->20435|38955->20436|39271->20724|39300->20725|39357->20753|39387->20754|39500->20838|39530->20839|39660->20940|39690->20941|39774->20996|39804->20997|39846->21010|39876->21011|39984->21091|40013->21092|40075->21125|40105->21126|40183->21175|40213->21176|40327->21262|40356->21263|40438->21316|40468->21317|40588->21408|40618->21409|40782->21545|40812->21546|42378->23083|42408->23084|42499->23147|42529->23148|42564->23154|42594->23155|42698->23230|42728->23231|42875->23349|42905->23350|42940->23356|42970->23357|43120->23478|43150->23479|43270->23570|43300->23571|43348->23590|43378->23591|43494->23678|43524->23679|43564->23690|43594->23691|43631->23700|43661->23701|44762->24773|44792->24774|44876->24829|44906->24830|44983->24878|45013->24879|45059->24896|45089->24897|45164->24943|45194->24944|45231->24953|45261->24954|45480->25144|45510->25145|45594->25200|45624->25201|45701->25249|45731->25250|45777->25267|45807->25268|45882->25314|45912->25315|45949->25324|45979->25325|46244->25561|46274->25562|46400->25660|46430->25661|46473->25675|46503->25676|46657->25802|46687->25803|47130->26217|47160->26218|47286->26316|47316->26317|47359->26331|47389->26332|47543->26458|47573->26459|49328->28185|49358->28186|49552->28351|49582->28352|49688->28429|49718->28430|50046->28729|50076->28730|50718->29343|50748->29344|50919->29486|50949->29487|51034->29543|51064->29544|51235->29686|51265->29687|51360->29753|51390->29754|51547->29882|51577->29883|51628->29905|51658->29906|51730->29949|51760->29950|51847->30008|51877->30009|51930->30033|51960->30034|52046->30091|52076->30092|52147->30134|52177->30135|52264->30193|52294->30194|52347->30218|52377->30219|52463->30276|52493->30277|52539->30294|52569->30295|52701->30398|52731->30399|52925->30564|52955->30565|53036->30617|53066->30618|53302->30825|53332->30826|53413->30878|53443->30879|53679->31086|53709->31087|53790->31139|53820->31140|54120->31411|54150->31412|54192->31425|54222->31426|54311->31486|54341->31487|54449->31566|54479->31567|54558->31617|54588->31618|54630->31631|54660->31632|54697->31641|54727->31642|54774->31660|54804->31661|54988->31816|55018->31817|55124->31894|55154->31895|55482->32194|55512->32195|55856->32510|55886->32511|55975->32571|56005->32572|56141->32679|56171->32680|56250->32730|56280->32731|56322->32744|56352->32745|56389->32754|56419->32755|56456->32764|56485->32765|56520->32772|56549->32773|56605->1251|56633->1269|56699->1300|56714->1306|56776->1346|56807->32789|56845->32791|56892->32828|56932->32829|56971->32831|57009->32846|57097->32897|57117->32907|57157->32924|57248->32978|57268->32988|57309->33006|57400->33060|57420->33070|57461->33088|57553->33143|57573->33153|57615->33172|57708->33228|57728->33238|57771->33258|57864->33314|57884->33324|57927->33344|58020->33400|58040->33410|58083->33430|58176->33486|58196->33496|58239->33516|58331->33571|58351->33581|58394->33601|58486->33656|58506->33666|58549->33686|58642->33742|58662->33752|58705->33772|58793->33823|58813->33833|58851->33848|58939->33899|58959->33909|58997->33924|59088->33978|59108->33988|59149->34006|59240->34060|59260->34070|59301->34088|59390->34140|59410->34150|59444->34161|59531->34211|59551->34221|59588->34235|59673->34283|59693->34293|59728->34305|59815->34355|59835->34365|59872->34379|59957->34427|59977->34437|60012->34449|60096->34496|60116->34506|60146->34513|60230->34560|60250->34570|60280->34577|60364->34624|60384->34634|60414->34641|60500->34690|60520->34700|60557->34714|60643->34763|60663->34773|60700->34787|60786->34836|60806->34846|60841->34858|60927->34907|60947->34917|60984->34931|61070->34980|61090->34990|61127->35004|61213->35053|61233->35063|61268->35075|61363->35133|61383->35143|61428->35165|61512->35212|61532->35222|61566->35233|61652->35282|61672->35292|61708->35305|61806->35366|61826->35376|61874->35401|62977->36467|63067->36534|63669->37098|63690->37108|63734->37128|64198->37554|64219->37564|64257->37578|64349->37632|64370->37642|64408->37656|64517->37727|64538->37737|64574->37749|65151->38288|65172->38298|65216->38318|65680->38744|65701->38754|65739->38768|65831->38822|65852->38832|65890->38846|65999->38917|66020->38927|66056->38939|66216->39061|66237->39071|66281->39091|66411->39183|66432->39193|66474->39211|66691->39390|66712->39400|66750->39414|66855->39481|66876->39491|66912->39503|67032->39585|67053->39595|67091->39609|67196->39676|67217->39686|67253->39698|68529->40936|68550->40946|68585->40957|68760->41094|68781->41104|68818->41117|68968->41229|68989->41239|69038->41264|69105->41298
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|70->30|70->30|70->30|72->32|72->32|72->32|74->34|74->34|74->34|76->36|76->36|76->36|82->42|82->42|104->64|104->64|107->67|107->67|107->67|107->67|110->70|110->70|112->72|112->72|115->75|115->75|115->75|115->75|118->78|118->78|120->80|120->80|120->80|120->80|127->87|127->87|130->90|130->90|131->91|131->91|134->94|134->94|136->96|136->96|139->99|139->99|140->100|140->100|143->103|143->103|145->105|145->105|148->108|148->108|149->109|149->109|152->112|152->112|156->116|156->116|159->119|159->119|159->119|159->119|164->124|164->124|168->128|168->128|171->131|171->131|171->131|171->131|176->136|176->136|182->142|182->142|183->143|183->143|185->145|185->145|186->146|186->146|190->150|190->150|190->150|190->150|192->152|192->152|193->153|193->153|194->154|194->154|195->155|195->155|197->157|197->157|199->159|199->159|202->162|202->162|205->165|205->165|206->166|206->166|207->167|207->167|210->170|210->170|212->172|212->172|213->173|213->173|216->176|216->176|217->177|217->177|219->179|219->179|220->180|220->180|222->182|222->182|223->183|223->183|225->185|225->185|226->186|226->186|228->188|228->188|229->189|229->189|231->191|231->191|232->192|232->192|234->194|234->194|235->195|235->195|237->197|237->197|238->198|238->198|240->200|240->200|241->201|241->201|243->203|243->203|244->204|244->204|246->206|246->206|247->207|247->207|249->209|249->209|253->213|253->213|256->216|256->216|256->216|256->216|259->219|259->219|259->219|259->219|260->220|260->220|264->224|264->224|267->227|267->227|268->228|268->228|271->231|271->231|273->233|273->233|274->234|274->234|275->235|275->235|277->237|277->237|278->238|278->238|280->240|280->240|281->241|281->241|282->242|282->242|283->243|283->243|285->245|285->245|289->249|289->249|290->250|290->250|293->253|293->253|295->255|295->255|296->256|296->256|298->258|298->258|299->259|299->259|301->261|301->261|302->262|302->262|304->264|304->264|305->265|305->265|307->267|307->267|308->268|308->268|310->270|310->270|311->271|311->271|313->273|313->273|314->274|314->274|316->276|316->276|317->277|317->277|319->279|319->279|320->280|320->280|322->282|322->282|323->283|323->283|325->285|325->285|326->286|326->286|328->288|328->288|329->289|329->289|331->291|331->291|332->292|332->292|334->294|334->294|335->295|335->295|337->297|337->297|338->298|338->298|340->300|340->300|341->301|341->301|343->303|343->303|344->304|344->304|346->306|346->306|347->307|347->307|349->309|349->309|350->310|350->310|352->312|352->312|353->313|353->313|355->315|355->315|356->316|356->316|358->318|358->318|359->319|359->319|361->321|361->321|362->322|362->322|364->324|364->324|365->325|365->325|367->327|367->327|368->328|368->328|369->329|369->329|372->332|372->332|374->334|374->334|375->335|375->335|377->337|377->337|378->338|378->338|380->340|380->340|381->341|381->341|383->343|383->343|384->344|384->344|386->346|386->346|387->347|387->347|389->349|389->349|390->350|390->350|392->352|392->352|393->353|393->353|395->355|395->355|396->356|396->356|398->358|398->358|399->359|399->359|401->361|401->361|402->362|402->362|404->364|404->364|405->365|405->365|407->367|407->367|408->368|408->368|410->370|410->370|411->371|411->371|413->373|413->373|414->374|414->374|416->376|416->376|417->377|417->377|419->379|419->379|420->380|420->380|422->382|422->382|423->383|423->383|425->385|425->385|426->386|426->386|428->388|428->388|429->389|429->389|431->391|431->391|432->392|432->392|434->394|434->394|435->395|435->395|437->397|437->397|438->398|438->398|440->400|440->400|441->401|441->401|443->403|443->403|444->404|444->404|446->406|446->406|447->407|447->407|448->408|448->408|451->411|451->411|453->413|453->413|454->414|454->414|456->416|456->416|457->417|457->417|459->419|459->419|460->420|460->420|462->422|462->422|463->423|463->423|465->425|465->425|466->426|466->426|468->428|468->428|469->429|469->429|471->431|471->431|472->432|472->432|474->434|474->434|475->435|475->435|477->437|477->437|478->438|478->438|480->440|480->440|481->441|481->441|483->443|483->443|484->444|484->444|486->446|486->446|487->447|487->447|489->449|489->449|490->450|490->450|492->452|492->452|493->453|493->453|495->455|495->455|496->456|496->456|498->458|498->458|499->459|499->459|501->461|501->461|502->462|502->462|504->464|504->464|505->465|505->465|507->467|507->467|508->468|508->468|510->470|510->470|511->471|511->471|513->473|513->473|514->474|514->474|516->476|516->476|517->477|517->477|519->479|519->479|520->480|520->480|522->482|522->482|523->483|523->483|525->485|525->485|526->486|526->486|527->487|527->487|533->493|533->493|535->495|535->495|538->498|538->498|539->499|539->499|540->500|540->500|541->501|541->501|547->507|547->507|549->509|549->509|552->512|552->512|553->513|553->513|554->514|554->514|555->515|555->515|561->521|561->521|563->523|563->523|566->526|566->526|567->527|567->527|568->528|568->528|570->530|570->530|583->543|583->543|585->545|585->545|597->557|597->557|599->559|599->559|602->562|602->562|604->564|604->564|617->577|617->577|619->579|619->579|629->589|629->589|631->591|631->591|641->601|641->601|642->602|642->602|644->604|644->604|646->606|646->606|648->608|648->608|649->609|649->609|652->612|652->612|653->613|653->613|654->614|654->614|657->617|657->617|658->618|658->618|661->621|661->621|665->625|665->625|703->663|703->663|706->666|706->666|706->666|706->666|708->668|708->668|711->671|711->671|711->671|711->671|714->674|714->674|717->677|717->677|718->678|718->678|721->681|721->681|722->682|722->682|723->683|723->683|749->709|749->709|750->710|750->710|752->712|752->712|753->713|753->713|755->715|755->715|756->716|756->716|761->721|761->721|762->722|762->722|764->724|764->724|765->725|765->725|767->727|767->727|768->728|768->728|773->733|773->733|777->737|777->737|778->738|778->738|782->742|782->742|791->751|791->751|795->755|795->755|796->756|796->756|800->760|800->760|844->804|844->804|849->809|849->809|851->811|851->811|858->818|858->818|871->831|871->831|874->834|874->834|875->835|875->835|878->838|878->838|879->839|879->839|882->842|882->842|883->843|883->843|884->844|884->844|886->846|886->846|887->847|887->847|889->849|889->849|890->850|890->850|892->852|892->852|893->853|893->853|895->855|895->855|896->856|896->856|898->858|898->858|901->861|901->861|902->862|902->862|905->865|905->865|906->866|906->866|909->869|909->869|910->870|910->870|913->873|913->873|914->874|914->874|915->875|915->875|918->878|918->878|919->879|919->879|920->880|920->880|921->881|921->881|922->882|922->882|927->887|927->887|929->889|929->889|936->896|936->896|943->903|943->903|944->904|944->904|947->907|947->907|948->908|948->908|949->909|949->909|950->910|950->910|951->911|951->911|952->912|952->912|955->18|955->19|956->20|956->20|956->20|957->914|957->914|957->914|957->914|957->914|957->914|959->916|959->916|959->916|960->917|960->917|960->917|961->918|961->918|961->918|962->919|962->919|962->919|963->920|963->920|963->920|964->921|964->921|964->921|965->922|965->922|965->922|966->923|966->923|966->923|967->924|967->924|967->924|968->925|968->925|968->925|969->926|969->926|969->926|970->927|970->927|970->927|971->928|971->928|971->928|972->929|972->929|972->929|973->930|973->930|973->930|974->931|974->931|974->931|975->932|975->932|975->932|976->933|976->933|976->933|977->934|977->934|977->934|978->935|978->935|978->935|979->936|979->936|979->936|980->937|980->937|980->937|981->938|981->938|981->938|982->939|982->939|982->939|983->940|983->940|983->940|984->941|984->941|984->941|985->942|985->942|985->942|986->943|986->943|986->943|987->944|987->944|987->944|988->945|988->945|988->945|989->946|989->946|989->946|990->947|990->947|990->947|991->948|991->948|991->948|1028->985|1028->985|1052->1009|1052->1009|1052->1009|1068->1025|1068->1025|1068->1025|1069->1026|1069->1026|1069->1026|1071->1028|1071->1028|1071->1028|1095->1052|1095->1052|1095->1052|1111->1068|1111->1068|1111->1068|1112->1069|1112->1069|1112->1069|1114->1071|1114->1071|1114->1071|1120->1077|1120->1077|1120->1077|1123->1080|1123->1080|1123->1080|1132->1089|1132->1089|1132->1089|1134->1091|1134->1091|1134->1091|1138->1095|1138->1095|1138->1095|1140->1097|1140->1097|1140->1097|1181->1138|1181->1138|1181->1138|1187->1144|1187->1144|1187->1144|1191->1148|1191->1148|1191->1148|1194->1151
                    -- GENERATED --
                */
            