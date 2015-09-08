
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
object conditionalSampling extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ConditionalSampling,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ConditionalSampling):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
<script src='"""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.61*/("""'></script>
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/livefilter.js"))),format.raw/*23.60*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*25.8*/routes/*25.14*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*25.59*/("""'></script>
<script type="text/javascript" src= "https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js"></script>
	<script type="
	text/javascript" src='"""),_display_(Seq[Any](/*28.25*/routes/*28.31*/.Assets.at("javascripts/json2.js"))),format.raw/*28.65*/("""'></script>
<script type="text/javascript"
	src='"""),_display_(Seq[Any](/*30.8*/routes/*30.14*/.Assets.at("javascripts/xmisc.js"))),format.raw/*30.48*/("""'></script>
<script type="text/javascript">
	var Response = null;
    var variable1 = "";
    var variable2 = "";
    window.onload = function() """),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
      select_all_months();
      changeDataSource1();
      select_data1(1);
      changeDataSource2();
      select_data1(2);
      changeVariableName1();
      select_var1(1);
      changeVariableName2();
      select_var1(2);
      var z=document.getElementById("download_data");
      z.disabled=false;
      setDefault();
      $('#pres1').val("N/A");
      $('#pres2').val("N/A");
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      var selectMonths = $('#selectMonths').text();
      $('#months option:contains('+selectMonths+')').prop("""),format.raw/*53.59*/("""{"""),format.raw/*53.60*/("""selected: true"""),format.raw/*53.74*/("""}"""),format.raw/*53.75*/(""");
      select_months();
      select_monthsByPara();
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      var x_axis = $('#div_X').text();
      if(x_axis == "0") """),format.raw/*61.25*/("""{"""),format.raw/*61.26*/("""
        $('#radioXLin').prop( "checked", true );
        $('#radioXLog').prop( "checked", false );
      """),format.raw/*64.7*/("""}"""),format.raw/*64.8*/("""
      else """),format.raw/*65.12*/("""{"""),format.raw/*65.13*/("""
        $('#radioXLin').prop( "checked", false );
        $('#radioXLog').prop( "checked", true );
      """),format.raw/*68.7*/("""}"""),format.raw/*68.8*/("""
      var y_axis = $('#div_Y').text();
      if(y_axis == "0") """),format.raw/*70.25*/("""{"""),format.raw/*70.26*/("""
          $('#radioYLin').prop( "checked", true );
          $('#radioYLog').prop( "checked", false );
        """),format.raw/*73.9*/("""}"""),format.raw/*73.10*/("""
        else """),format.raw/*74.14*/("""{"""),format.raw/*74.15*/("""
          $('#radioYLin').prop( "checked", false );
          $('#radioYLog').prop( "checked", true );
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""
      var z_axis = $('#div_Z').text();
      if(z_axis == "0") """),format.raw/*79.25*/("""{"""),format.raw/*79.26*/("""
          $('#radioZLin').prop( "checked", true );
          $('#radioZLog').prop( "checked", false );
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""
        else """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
          $('#radioZLin').prop( "checked", false );
          $('#radioZLog').prop( "checked", true );
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
      var binMin = $('#binMin').text();
      var binMax = $('#binMax').text();
      var binNum = $('#binNum').text();
      if(binMin == "-999999" && binMax == "-999999" && binNum=="-999999")"""),format.raw/*90.74*/("""{"""),format.raw/*90.75*/("""
    	  $('#radioDef').prop( "checked", true );
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""else"""),format.raw/*92.12*/("""{"""),format.raw/*92.13*/("""
    	  $('#radioCus').prop( "checked", true );
    	  $('#min1').val(binMin);
          $('#max1').val(binMax);
          $('#bins1').val(binNum);
      """),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
    function changeDataSource1()"""),format.raw/*103.33*/("""{"""),format.raw/*103.34*/("""
    	var dataSource = $('#dataSourceP').text();
     	var x = document.getElementById("data1");
     	if(dataSource == "cccma_canesm2" )"""),format.raw/*106.41*/("""{"""),format.raw/*106.42*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*108.7*/("""}"""),format.raw/*108.8*/("""
     	else if(dataSource == "gfdl_esm2g" )"""),format.raw/*109.43*/("""{"""),format.raw/*109.44*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*111.7*/("""}"""),format.raw/*111.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*114.7*/("""}"""),format.raw/*114.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*115.42*/("""{"""),format.raw/*115.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*117.7*/("""}"""),format.raw/*117.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*118.42*/("""{"""),format.raw/*118.43*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*120.7*/("""}"""),format.raw/*120.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*121.43*/("""{"""),format.raw/*121.44*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*123.7*/("""}"""),format.raw/*123.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*124.48*/("""{"""),format.raw/*124.49*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*126.7*/("""}"""),format.raw/*126.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*127.45*/("""{"""),format.raw/*127.46*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*129.7*/("""}"""),format.raw/*129.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*130.44*/("""{"""),format.raw/*130.45*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*132.7*/("""}"""),format.raw/*132.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*133.41*/("""{"""),format.raw/*133.42*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*135.7*/("""}"""),format.raw/*135.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*136.45*/("""{"""),format.raw/*136.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*138.7*/("""}"""),format.raw/*138.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*139.45*/("""{"""),format.raw/*139.46*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*141.7*/("""}"""),format.raw/*141.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*142.47*/("""{"""),format.raw/*142.48*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*144.7*/("""}"""),format.raw/*144.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*145.43*/("""{"""),format.raw/*145.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*147.7*/("""}"""),format.raw/*147.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*148.43*/("""{"""),format.raw/*148.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*150.7*/("""}"""),format.raw/*150.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*151.42*/("""{"""),format.raw/*151.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*153.7*/("""}"""),format.raw/*153.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*154.42*/("""{"""),format.raw/*154.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*156.7*/("""}"""),format.raw/*156.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*157.46*/("""{"""),format.raw/*157.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*159.7*/("""}"""),format.raw/*159.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*160.43*/("""{"""),format.raw/*160.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*162.7*/("""}"""),format.raw/*162.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*163.43*/("""{"""),format.raw/*163.44*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*165.7*/("""}"""),format.raw/*165.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*166.42*/("""{"""),format.raw/*166.43*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*168.7*/("""}"""),format.raw/*168.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*169.43*/("""{"""),format.raw/*169.44*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*171.7*/("""}"""),format.raw/*171.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*172.42*/("""{"""),format.raw/*172.43*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*174.7*/("""}"""),format.raw/*174.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*175.41*/("""{"""),format.raw/*175.42*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*177.7*/("""}"""),format.raw/*177.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*178.42*/("""{"""),format.raw/*178.43*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*180.7*/("""}"""),format.raw/*180.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*181.46*/("""{"""),format.raw/*181.47*/("""
     		x.options[25].selected=true;
     	"""),format.raw/*183.7*/("""}"""),format.raw/*183.8*/("""
    """),format.raw/*184.5*/("""}"""),format.raw/*184.6*/("""
    function changeDataSource2()"""),format.raw/*185.33*/("""{"""),format.raw/*185.34*/("""
    	var dataSource = $('#dataSourceE').text();
     	var x = document.getElementById("data2");
     	if(dataSource == "cccma_canesm2" )"""),format.raw/*188.41*/("""{"""),format.raw/*188.42*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*190.7*/("""}"""),format.raw/*190.8*/("""
     	else if(dataSource == "gfdl_esm2g" )"""),format.raw/*191.43*/("""{"""),format.raw/*191.44*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*193.7*/("""}"""),format.raw/*193.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*194.42*/("""{"""),format.raw/*194.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*196.7*/("""}"""),format.raw/*196.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*197.42*/("""{"""),format.raw/*197.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*199.7*/("""}"""),format.raw/*199.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*200.42*/("""{"""),format.raw/*200.43*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*202.7*/("""}"""),format.raw/*202.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*203.43*/("""{"""),format.raw/*203.44*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*205.7*/("""}"""),format.raw/*205.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*206.48*/("""{"""),format.raw/*206.49*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*208.7*/("""}"""),format.raw/*208.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*209.45*/("""{"""),format.raw/*209.46*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*211.7*/("""}"""),format.raw/*211.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*212.44*/("""{"""),format.raw/*212.45*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*214.7*/("""}"""),format.raw/*214.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*215.41*/("""{"""),format.raw/*215.42*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*217.7*/("""}"""),format.raw/*217.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*218.45*/("""{"""),format.raw/*218.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*220.7*/("""}"""),format.raw/*220.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*221.45*/("""{"""),format.raw/*221.46*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*223.7*/("""}"""),format.raw/*223.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*224.47*/("""{"""),format.raw/*224.48*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*226.7*/("""}"""),format.raw/*226.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*227.43*/("""{"""),format.raw/*227.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*229.7*/("""}"""),format.raw/*229.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*230.43*/("""{"""),format.raw/*230.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*232.7*/("""}"""),format.raw/*232.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*233.42*/("""{"""),format.raw/*233.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*235.7*/("""}"""),format.raw/*235.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*236.42*/("""{"""),format.raw/*236.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*238.7*/("""}"""),format.raw/*238.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*239.46*/("""{"""),format.raw/*239.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*241.7*/("""}"""),format.raw/*241.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*242.43*/("""{"""),format.raw/*242.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*244.7*/("""}"""),format.raw/*244.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*245.43*/("""{"""),format.raw/*245.44*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*247.7*/("""}"""),format.raw/*247.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*248.42*/("""{"""),format.raw/*248.43*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*250.7*/("""}"""),format.raw/*250.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*251.43*/("""{"""),format.raw/*251.44*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*253.7*/("""}"""),format.raw/*253.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*254.42*/("""{"""),format.raw/*254.43*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*256.7*/("""}"""),format.raw/*256.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*257.41*/("""{"""),format.raw/*257.42*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*259.7*/("""}"""),format.raw/*259.8*/("""
     	else if(dataSource == "nasa_argo" )"""),format.raw/*260.42*/("""{"""),format.raw/*260.43*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*262.7*/("""}"""),format.raw/*262.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*263.46*/("""{"""),format.raw/*263.47*/("""
     		x.options[25].selected=true;
     	"""),format.raw/*265.7*/("""}"""),format.raw/*265.8*/("""
    """),format.raw/*266.5*/("""}"""),format.raw/*266.6*/("""
    function changeVariableName1()"""),format.raw/*267.35*/("""{"""),format.raw/*267.36*/("""
    	var var_string = $('#variableNameP').text();
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
    """),format.raw/*320.5*/("""}"""),format.raw/*320.6*/("""
    function changeVariableName2()"""),format.raw/*321.35*/("""{"""),format.raw/*321.36*/("""
    	var var_string = $('#variableNameE').text();
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
    """),format.raw/*374.5*/("""}"""),format.raw/*374.6*/("""
    function select_monthsByPara()"""),format.raw/*375.35*/("""{"""),format.raw/*375.36*/("""
    	var monthsByPara = $('#monthsPara').text();
    	if(monthsByPara.search("jan")>-1)"""),format.raw/*377.39*/("""{"""),format.raw/*377.40*/("""
    		document.getElementById('Jan').checked = true;
    	"""),format.raw/*379.6*/("""}"""),format.raw/*379.7*/("""
    	if(monthsByPara.search("feb")>-1)"""),format.raw/*380.39*/("""{"""),format.raw/*380.40*/("""
    		document.getElementById('Feb').checked = true;
    	"""),format.raw/*382.6*/("""}"""),format.raw/*382.7*/("""
    	if(monthsByPara.search("mar")>-1)"""),format.raw/*383.39*/("""{"""),format.raw/*383.40*/("""
    		document.getElementById('Mar').checked = true;
    	"""),format.raw/*385.6*/("""}"""),format.raw/*385.7*/("""
    	if(monthsByPara.search("apr")>-1)"""),format.raw/*386.39*/("""{"""),format.raw/*386.40*/("""
    		document.getElementById('Apr').checked = true;
    	"""),format.raw/*388.6*/("""}"""),format.raw/*388.7*/("""
    	if(monthsByPara.search("may")>-1)"""),format.raw/*389.39*/("""{"""),format.raw/*389.40*/("""
    		document.getElementById('May').checked = true;
    	"""),format.raw/*391.6*/("""}"""),format.raw/*391.7*/("""
    	if(monthsByPara.search("jun")>-1)"""),format.raw/*392.39*/("""{"""),format.raw/*392.40*/("""
    		document.getElementById('Jun').checked = true;
    	"""),format.raw/*394.6*/("""}"""),format.raw/*394.7*/("""
    	if(monthsByPara.search("jul")>-1)"""),format.raw/*395.39*/("""{"""),format.raw/*395.40*/("""
    		document.getElementById('Jul').checked = true;
    	"""),format.raw/*397.6*/("""}"""),format.raw/*397.7*/("""
    	if(monthsByPara.search("aug")>-1)"""),format.raw/*398.39*/("""{"""),format.raw/*398.40*/("""
    		document.getElementById('Aug').checked = true;
    	"""),format.raw/*400.6*/("""}"""),format.raw/*400.7*/("""
    	if(monthsByPara.search("sep")>-1)"""),format.raw/*401.39*/("""{"""),format.raw/*401.40*/("""
    		document.getElementById('Sep').checked = true;
    	"""),format.raw/*403.6*/("""}"""),format.raw/*403.7*/("""
    	if(monthsByPara.search("oct")>-1)"""),format.raw/*404.39*/("""{"""),format.raw/*404.40*/("""
    		document.getElementById('Oct').checked = true;
    	"""),format.raw/*406.6*/("""}"""),format.raw/*406.7*/("""
    	if(monthsByPara.search("nov")>-1)"""),format.raw/*407.39*/("""{"""),format.raw/*407.40*/("""
    		document.getElementById('Nov').checked = true;
    	"""),format.raw/*409.6*/("""}"""),format.raw/*409.7*/("""
    	if(monthsByPara.search("dec")>-1)"""),format.raw/*410.39*/("""{"""),format.raw/*410.40*/("""
    		document.getElementById('Dec').checked = true;
    	"""),format.raw/*412.6*/("""}"""),format.raw/*412.7*/("""
    """),format.raw/*413.5*/("""}"""),format.raw/*413.6*/("""
    """),format.raw/*414.5*/("""}"""),format.raw/*414.6*/("""
    function select_all_months()
    """),format.raw/*416.5*/("""{"""),format.raw/*416.6*/("""
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
    """),format.raw/*429.5*/("""}"""),format.raw/*429.6*/("""
    function no_month_check()
    """),format.raw/*431.5*/("""{"""),format.raw/*431.6*/("""
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
           document.getElementById('Dec').checked == false) """),format.raw/*443.61*/("""{"""),format.raw/*443.62*/("""
           return true;
          """),format.raw/*445.11*/("""}"""),format.raw/*445.12*/("""
        else
           return false;
    """),format.raw/*448.5*/("""}"""),format.raw/*448.6*/("""
    function reset_months()
    """),format.raw/*450.5*/("""{"""),format.raw/*450.6*/("""
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
    """),format.raw/*463.5*/("""}"""),format.raw/*463.6*/("""
    function setDefault()
    """),format.raw/*465.5*/("""{"""),format.raw/*465.6*/("""
       x=document.getElementById("min1");
       y=document.getElementById("max1");
       z=document.getElementById("bins1");
       x.value = "N/A";
       x.disabled=true;
       y.value = "N/A";
       y.disabled=true;
       z.value = "N/A";
       z.disabled=true;
    """),format.raw/*475.5*/("""}"""),format.raw/*475.6*/("""
    function setCustomized()
    """),format.raw/*477.5*/("""{"""),format.raw/*477.6*/("""
       x=document.getElementById("min1");
       y=document.getElementById("max1");
       z=document.getElementById("bins1");
       x.value = "";
       x.disabled=false;
       y.value = "";
       y.disabled=false;
       z.value = "";
       z.disabled=false;
    """),format.raw/*487.5*/("""}"""),format.raw/*487.6*/("""
    function disable_download_button()
    """),format.raw/*489.5*/("""{"""),format.raw/*489.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*492.5*/("""}"""),format.raw/*492.6*/("""
    function enable_download_button()
    """),format.raw/*494.5*/("""{"""),format.raw/*494.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*497.5*/("""}"""),format.raw/*497.6*/("""
    function unset_vars1(ID)
    """),format.raw/*499.5*/("""{"""),format.raw/*499.6*/("""
      var x;
      if (ID == 1) """),format.raw/*501.20*/("""{"""),format.raw/*501.21*/("""
        x=document.getElementById("var1");
      """),format.raw/*503.7*/("""}"""),format.raw/*503.8*/("""
      else if (ID == 2) """),format.raw/*504.25*/("""{"""),format.raw/*504.26*/("""
        x=document.getElementById("var2");
      """),format.raw/*506.7*/("""}"""),format.raw/*506.8*/("""
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
    """),format.raw/*540.5*/("""}"""),format.raw/*540.6*/("""
    function disable_pres1(ID)
    """),format.raw/*542.5*/("""{"""),format.raw/*542.6*/("""
      var x;
      if (ID == 1) """),format.raw/*544.20*/("""{"""),format.raw/*544.21*/("""
        x=document.getElementById("pres1");
      """),format.raw/*546.7*/("""}"""),format.raw/*546.8*/("""
      else if (ID == 2) """),format.raw/*547.25*/("""{"""),format.raw/*547.26*/("""
        x=document.getElementById("pres2");
      """),format.raw/*549.7*/("""}"""),format.raw/*549.8*/("""
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*552.5*/("""}"""),format.raw/*552.6*/("""
    function enable_pres1(ID)
    """),format.raw/*554.5*/("""{"""),format.raw/*554.6*/("""
      var x;
      if (ID == 1) """),format.raw/*556.20*/("""{"""),format.raw/*556.21*/("""
        x=document.getElementById("pres1");
        x.value = "200, 900";
      """),format.raw/*559.7*/("""}"""),format.raw/*559.8*/("""
      else if (ID == 2) """),format.raw/*560.25*/("""{"""),format.raw/*560.26*/("""
        x=document.getElementById("pres2");
        x.value = "500";
      """),format.raw/*563.7*/("""}"""),format.raw/*563.8*/("""
      x.disabled=false;
    """),format.raw/*565.5*/("""}"""),format.raw/*565.6*/("""
    function select_var1(ID)
    """),format.raw/*567.5*/("""{"""),format.raw/*567.6*/("""
      var var_string;
      if (ID == 1) """),format.raw/*569.20*/("""{"""),format.raw/*569.21*/("""
        var_string = $("#var1").val();
      """),format.raw/*571.7*/("""}"""),format.raw/*571.8*/("""
      else if (ID == 2) """),format.raw/*572.25*/("""{"""),format.raw/*572.26*/("""
        var_string = $("#var2").val();
      """),format.raw/*574.7*/("""}"""),format.raw/*574.8*/("""
      disable_download_button();  
      if (var_string == "Total Cloud Fraction") """),format.raw/*576.49*/("""{"""),format.raw/*576.50*/(""" 
        if (ID == 1) """),format.raw/*577.22*/("""{"""),format.raw/*577.23*/("""
          variable1 = "clt";  
        """),format.raw/*579.9*/("""}"""),format.raw/*579.10*/("""
        else if (ID == 2) """),format.raw/*580.27*/("""{"""),format.raw/*580.28*/("""
          variable2 = "clt";  
        """),format.raw/*582.9*/("""}"""),format.raw/*582.10*/("""
        disable_pres1(ID);
      """),format.raw/*584.7*/("""}"""),format.raw/*584.8*/("""
      else if (var_string == "Surface Temperature") """),format.raw/*585.53*/("""{"""),format.raw/*585.54*/("""
        if (ID == 1) """),format.raw/*586.22*/("""{"""),format.raw/*586.23*/("""
          variable1 = "ts";  
        """),format.raw/*588.9*/("""}"""),format.raw/*588.10*/("""
        else if (ID == 2) """),format.raw/*589.27*/("""{"""),format.raw/*589.28*/("""
          variable2 = "ts";  
        """),format.raw/*591.9*/("""}"""),format.raw/*591.10*/("""
        disable_pres1(ID);
      """),format.raw/*593.7*/("""}"""),format.raw/*593.8*/("""
      else if (var_string == "Sea Surface Temperature") """),format.raw/*594.57*/("""{"""),format.raw/*594.58*/(""" 
        if (ID == 1) """),format.raw/*595.22*/("""{"""),format.raw/*595.23*/("""
          variable1 = "tos";  
        """),format.raw/*597.9*/("""}"""),format.raw/*597.10*/("""
        else if (ID == 2) """),format.raw/*598.27*/("""{"""),format.raw/*598.28*/("""
          variable2 = "tos";  
        """),format.raw/*600.9*/("""}"""),format.raw/*600.10*/("""
        disable_pres1(ID);
      """),format.raw/*602.7*/("""}"""),format.raw/*602.8*/("""
      else if (var_string == "Precipitation Flux") """),format.raw/*603.52*/("""{"""),format.raw/*603.53*/(""" 
        if (ID == 1) """),format.raw/*604.22*/("""{"""),format.raw/*604.23*/("""
          variable1 = "pr";  
        """),format.raw/*606.9*/("""}"""),format.raw/*606.10*/("""
        else if (ID == 2) """),format.raw/*607.27*/("""{"""),format.raw/*607.28*/("""
          variable2 = "pr";  
        """),format.raw/*609.9*/("""}"""),format.raw/*609.10*/("""
        disable_pres1(ID);
      """),format.raw/*611.7*/("""}"""),format.raw/*611.8*/("""
      else if (var_string == "Eastward Near-Surface Wind") """),format.raw/*612.60*/("""{"""),format.raw/*612.61*/(""" 
        if (ID == 1) """),format.raw/*613.22*/("""{"""),format.raw/*613.23*/("""
          variable1 = "uas";  
        """),format.raw/*615.9*/("""}"""),format.raw/*615.10*/("""
        else if (ID == 2) """),format.raw/*616.27*/("""{"""),format.raw/*616.28*/("""
          variable2 = "uas";  
        """),format.raw/*618.9*/("""}"""),format.raw/*618.10*/("""
        disable_pres1(ID);
      """),format.raw/*620.7*/("""}"""),format.raw/*620.8*/("""
      else if (var_string == "Northward Near-Surface Wind") """),format.raw/*621.61*/("""{"""),format.raw/*621.62*/("""  
        if (ID == 1) """),format.raw/*622.22*/("""{"""),format.raw/*622.23*/("""
          variable1 = "vas";  
        """),format.raw/*624.9*/("""}"""),format.raw/*624.10*/("""
        else if (ID == 2) """),format.raw/*625.27*/("""{"""),format.raw/*625.28*/("""
          variable2 = "vas";  
        """),format.raw/*627.9*/("""}"""),format.raw/*627.10*/("""
        disable_pres1(ID);
      """),format.raw/*629.7*/("""}"""),format.raw/*629.8*/("""
      else if (var_string == "Near-Surface Wind Speed") """),format.raw/*630.57*/("""{"""),format.raw/*630.58*/(""" 
        if (ID == 1) """),format.raw/*631.22*/("""{"""),format.raw/*631.23*/("""
          variable1 = "sfcWind";  
        """),format.raw/*633.9*/("""}"""),format.raw/*633.10*/("""
        else if (ID == 2) """),format.raw/*634.27*/("""{"""),format.raw/*634.28*/("""
          variable2 = "sfcWind";  
        """),format.raw/*636.9*/("""}"""),format.raw/*636.10*/("""
        disable_pres1(ID);
      """),format.raw/*638.7*/("""}"""),format.raw/*638.8*/("""
      else if (var_string == "Sea Surface Height") """),format.raw/*639.52*/("""{"""),format.raw/*639.53*/(""" 
        if (ID == 1) """),format.raw/*640.22*/("""{"""),format.raw/*640.23*/("""
          variable1 = "zos";  
        """),format.raw/*642.9*/("""}"""),format.raw/*642.10*/("""
        else if (ID == 2) """),format.raw/*643.27*/("""{"""),format.raw/*643.28*/("""
          variable2 = "zos";  
        """),format.raw/*645.9*/("""}"""),format.raw/*645.10*/("""
        disable_pres1(ID);
      """),format.raw/*647.7*/("""}"""),format.raw/*647.8*/("""
      else if (var_string == "Leaf Area Index") """),format.raw/*648.49*/("""{"""),format.raw/*648.50*/(""" 
        if (ID == 1) """),format.raw/*649.22*/("""{"""),format.raw/*649.23*/("""
          variable1 = "lai";  
        """),format.raw/*651.9*/("""}"""),format.raw/*651.10*/("""
        else if (ID == 2) """),format.raw/*652.27*/("""{"""),format.raw/*652.28*/("""
          variable2 = "lai";  
        """),format.raw/*654.9*/("""}"""),format.raw/*654.10*/("""
        disable_pres1(ID);
      """),format.raw/*656.7*/("""}"""),format.raw/*656.8*/("""
      else if (var_string == "Equivalent Water Height Over Land") """),format.raw/*657.67*/("""{"""),format.raw/*657.68*/("""
        if (ID == 1) """),format.raw/*658.22*/("""{"""),format.raw/*658.23*/("""
          variable1 = "zl";  
        """),format.raw/*660.9*/("""}"""),format.raw/*660.10*/("""
        else if (ID == 2) """),format.raw/*661.27*/("""{"""),format.raw/*661.28*/("""
          variable2 = "zl";  
        """),format.raw/*663.9*/("""}"""),format.raw/*663.10*/("""
        disable_pres1(ID);
      """),format.raw/*665.7*/("""}"""),format.raw/*665.8*/("""
      else if (var_string == "Equivalent Water Height Over Ocean") """),format.raw/*666.68*/("""{"""),format.raw/*666.69*/("""
        if (ID == 1) """),format.raw/*667.22*/("""{"""),format.raw/*667.23*/("""
          variable1 = "zo";
        """),format.raw/*669.9*/("""}"""),format.raw/*669.10*/("""
        else if (ID == 2) """),format.raw/*670.27*/("""{"""),format.raw/*670.28*/("""
          variable2 = "zo";
        """),format.raw/*672.9*/("""}"""),format.raw/*672.10*/("""
        disable_pres1(ID);
      """),format.raw/*674.7*/("""}"""),format.raw/*674.8*/("""
      else if (var_string == "Ocean Heat Content Anomaly within 700 m Depth") """),format.raw/*675.79*/("""{"""),format.raw/*675.80*/("""
        if (ID == 1) """),format.raw/*676.22*/("""{"""),format.raw/*676.23*/("""
          variable1 = "ohc700";
        """),format.raw/*678.9*/("""}"""),format.raw/*678.10*/("""
        else if (ID == 2) """),format.raw/*679.27*/("""{"""),format.raw/*679.28*/("""
          variable2 = "ohc700";
        """),format.raw/*681.9*/("""}"""),format.raw/*681.10*/("""
        disable_pres1(ID);
      """),format.raw/*683.7*/("""}"""),format.raw/*683.8*/("""
      else if (var_string == "Ocean Heat Content Anomaly within 2000 m Depth") """),format.raw/*684.80*/("""{"""),format.raw/*684.81*/("""
        if (ID == 1) """),format.raw/*685.22*/("""{"""),format.raw/*685.23*/("""
          variable1 = "ohc2000";
        """),format.raw/*687.9*/("""}"""),format.raw/*687.10*/("""
        else if (ID == 2) """),format.raw/*688.27*/("""{"""),format.raw/*688.28*/("""
          variable2 = "ohc2000";
        """),format.raw/*690.9*/("""}"""),format.raw/*690.10*/("""
        disable_pres1(ID);
      """),format.raw/*692.7*/("""}"""),format.raw/*692.8*/("""
      else if (var_string == "Surface Downwelling Longwave Radiation") """),format.raw/*693.72*/("""{"""),format.raw/*693.73*/("""
        if (ID == 1) """),format.raw/*694.22*/("""{"""),format.raw/*694.23*/("""
          variable1 = "rlds";
        """),format.raw/*696.9*/("""}"""),format.raw/*696.10*/("""
        else if (ID == 2) """),format.raw/*697.27*/("""{"""),format.raw/*697.28*/("""
          variable2 = "rlds";
        """),format.raw/*699.9*/("""}"""),format.raw/*699.10*/("""
        disable_pres1(ID);
      """),format.raw/*701.7*/("""}"""),format.raw/*701.8*/("""
      else if (var_string == "Surface Downwelling Shortwave Radiation") """),format.raw/*702.73*/("""{"""),format.raw/*702.74*/("""
        if (ID == 1) """),format.raw/*703.22*/("""{"""),format.raw/*703.23*/("""
          variable1 = "rsds";
        """),format.raw/*705.9*/("""}"""),format.raw/*705.10*/("""
        else if (ID == 2) """),format.raw/*706.27*/("""{"""),format.raw/*706.28*/("""
          variable2 = "rsds";
        """),format.raw/*708.9*/("""}"""),format.raw/*708.10*/("""
        disable_pres1(ID);
      """),format.raw/*710.7*/("""}"""),format.raw/*710.8*/("""
      else if (var_string == "Surface Upwelling Longwave Radiation") """),format.raw/*711.70*/("""{"""),format.raw/*711.71*/("""
        if (ID == 1) """),format.raw/*712.22*/("""{"""),format.raw/*712.23*/("""
          variable1 = "rlus";
        """),format.raw/*714.9*/("""}"""),format.raw/*714.10*/("""
        else if (ID == 2) """),format.raw/*715.27*/("""{"""),format.raw/*715.28*/("""
          variable2 = "rlus";
        """),format.raw/*717.9*/("""}"""),format.raw/*717.10*/("""
        disable_pres1(ID);
      """),format.raw/*719.7*/("""}"""),format.raw/*719.8*/("""
      else if (var_string == "Surface Upwelling Shortwave Radiation") """),format.raw/*720.71*/("""{"""),format.raw/*720.72*/("""
        if (ID == 1) """),format.raw/*721.22*/("""{"""),format.raw/*721.23*/("""
          variable1 = "rsus";
        """),format.raw/*723.9*/("""}"""),format.raw/*723.10*/("""
        else if (ID == 2) """),format.raw/*724.27*/("""{"""),format.raw/*724.28*/("""
          variable2 = "rsus";
        """),format.raw/*726.9*/("""}"""),format.raw/*726.10*/("""
        disable_pres1(ID);
      """),format.raw/*728.7*/("""}"""),format.raw/*728.8*/("""
      else if (var_string == "Surface Downwelling Clear-Sky Longwave Radiation") """),format.raw/*729.82*/("""{"""),format.raw/*729.83*/("""
        if (ID == 1) """),format.raw/*730.22*/("""{"""),format.raw/*730.23*/("""
          variable1 = "rldscs";
        """),format.raw/*732.9*/("""}"""),format.raw/*732.10*/("""
        else if (ID == 2) """),format.raw/*733.27*/("""{"""),format.raw/*733.28*/("""
          variable2 = "rldscs";
        """),format.raw/*735.9*/("""}"""),format.raw/*735.10*/("""
        disable_pres1(ID);
      """),format.raw/*737.7*/("""}"""),format.raw/*737.8*/("""
      else if (var_string == "Surface Downwelling Clear-Sky Shortwave Radiation") """),format.raw/*738.83*/("""{"""),format.raw/*738.84*/("""
        if (ID == 1) """),format.raw/*739.22*/("""{"""),format.raw/*739.23*/("""
          variable1 = "rsdscs";
        """),format.raw/*741.9*/("""}"""),format.raw/*741.10*/("""
        else if (ID == 2) """),format.raw/*742.27*/("""{"""),format.raw/*742.28*/("""
          variable2 = "rsdscs";
        """),format.raw/*744.9*/("""}"""),format.raw/*744.10*/("""
        disable_pres1(ID);
      """),format.raw/*746.7*/("""}"""),format.raw/*746.8*/("""
      else if (var_string == "Surface Upwelling Clear-Sky Shortwave Radiation") """),format.raw/*747.81*/("""{"""),format.raw/*747.82*/("""
        if (ID == 1) """),format.raw/*748.22*/("""{"""),format.raw/*748.23*/("""
          variable1 = "rsuscs";
        """),format.raw/*750.9*/("""}"""),format.raw/*750.10*/("""
        else if (ID == 2) """),format.raw/*751.27*/("""{"""),format.raw/*751.28*/("""
          variable2 = "rsuscs";
        """),format.raw/*753.9*/("""}"""),format.raw/*753.10*/("""
        disable_pres1(ID);
      """),format.raw/*755.7*/("""}"""),format.raw/*755.8*/("""
      else if (var_string == "TOA Incident Shortwave Radiation") """),format.raw/*756.66*/("""{"""),format.raw/*756.67*/("""
        if (ID == 1) """),format.raw/*757.22*/("""{"""),format.raw/*757.23*/("""
          variable1 = "rsdt";
        """),format.raw/*759.9*/("""}"""),format.raw/*759.10*/("""
        else if (ID == 2) """),format.raw/*760.27*/("""{"""),format.raw/*760.28*/("""
          variable2 = "rsdt";
        """),format.raw/*762.9*/("""}"""),format.raw/*762.10*/("""
        disable_pres1(ID);
      """),format.raw/*764.7*/("""}"""),format.raw/*764.8*/("""
      else if (var_string == "TOA Outgoing Clear-Sky Longwave Radiation") """),format.raw/*765.75*/("""{"""),format.raw/*765.76*/("""
        if (ID == 1) """),format.raw/*766.22*/("""{"""),format.raw/*766.23*/("""
          variable1 = "rlutcs";
        """),format.raw/*768.9*/("""}"""),format.raw/*768.10*/("""
        else if (ID == 2) """),format.raw/*769.27*/("""{"""),format.raw/*769.28*/("""
          variable2 = "rlutcs";
        """),format.raw/*771.9*/("""}"""),format.raw/*771.10*/("""
        disable_pres1(ID);
      """),format.raw/*773.7*/("""}"""),format.raw/*773.8*/("""
      else if (var_string == "TOA Outgoing Longwave Radiation") """),format.raw/*774.65*/("""{"""),format.raw/*774.66*/("""
        if (ID == 1) """),format.raw/*775.22*/("""{"""),format.raw/*775.23*/("""
          variable1 = "rlut";
        """),format.raw/*777.9*/("""}"""),format.raw/*777.10*/("""
        else if (ID == 2) """),format.raw/*778.27*/("""{"""),format.raw/*778.28*/("""
          variable2 = "rlut";
        """),format.raw/*780.9*/("""}"""),format.raw/*780.10*/("""
        disable_pres1(ID);
      """),format.raw/*782.7*/("""}"""),format.raw/*782.8*/("""
      else if (var_string == "TOA Outgoing Clear-Sky Shortwave Radiation") """),format.raw/*783.76*/("""{"""),format.raw/*783.77*/("""
        if (ID == 1) """),format.raw/*784.22*/("""{"""),format.raw/*784.23*/("""
          variable1 = "rsutcs";
        """),format.raw/*786.9*/("""}"""),format.raw/*786.10*/("""
        else if (ID == 2) """),format.raw/*787.27*/("""{"""),format.raw/*787.28*/("""
          variable2 = "rsutcs";
        """),format.raw/*789.9*/("""}"""),format.raw/*789.10*/("""
        disable_pres1(ID);
      """),format.raw/*791.7*/("""}"""),format.raw/*791.8*/("""
      else if (var_string == "TOA Outgoing Shortwave Radiation") """),format.raw/*792.66*/("""{"""),format.raw/*792.67*/("""
        if (ID == 1) """),format.raw/*793.22*/("""{"""),format.raw/*793.23*/("""
          variable1 = "rsut";
        """),format.raw/*795.9*/("""}"""),format.raw/*795.10*/("""
        else if (ID == 2) """),format.raw/*796.27*/("""{"""),format.raw/*796.28*/("""
          variable2 = "rsut";
        """),format.raw/*798.9*/("""}"""),format.raw/*798.10*/("""
        disable_pres1(ID);
      """),format.raw/*800.7*/("""}"""),format.raw/*800.8*/("""
      else if (var_string == "Air Temperature") """),format.raw/*801.49*/("""{"""),format.raw/*801.50*/("""
        if (ID == 1) """),format.raw/*802.22*/("""{"""),format.raw/*802.23*/("""
          variable1 = "ta";
        """),format.raw/*804.9*/("""}"""),format.raw/*804.10*/("""
        else if (ID == 2) """),format.raw/*805.27*/("""{"""),format.raw/*805.28*/("""
          variable2 = "ta";
        """),format.raw/*807.9*/("""}"""),format.raw/*807.10*/("""
        enable_pres1(ID);
      """),format.raw/*809.7*/("""}"""),format.raw/*809.8*/("""
      else if (var_string == "Specific Humidity") """),format.raw/*810.51*/("""{"""),format.raw/*810.52*/("""
        if (ID == 1) """),format.raw/*811.22*/("""{"""),format.raw/*811.23*/("""
          variable1 = "hus";
        """),format.raw/*813.9*/("""}"""),format.raw/*813.10*/("""
        else if (ID == 2) """),format.raw/*814.27*/("""{"""),format.raw/*814.28*/("""
          variable2 = "hus";
        """),format.raw/*816.9*/("""}"""),format.raw/*816.10*/("""
        enable_pres1(ID);
      """),format.raw/*818.7*/("""}"""),format.raw/*818.8*/("""
      else if (var_string == "Cloud Ice Water Content") """),format.raw/*819.57*/("""{"""),format.raw/*819.58*/("""
        if (ID == 1) """),format.raw/*820.22*/("""{"""),format.raw/*820.23*/("""
          variable1 = "cli";
        """),format.raw/*822.9*/("""}"""),format.raw/*822.10*/("""
        else if (ID == 2) """),format.raw/*823.27*/("""{"""),format.raw/*823.28*/("""
          variable2 = "cli";
        """),format.raw/*825.9*/("""}"""),format.raw/*825.10*/("""
        enable_pres1(ID);
      """),format.raw/*827.7*/("""}"""),format.raw/*827.8*/("""
      else if (var_string == "Cloud Liquid Water Content") """),format.raw/*828.60*/("""{"""),format.raw/*828.61*/("""
        if (ID == 1) """),format.raw/*829.22*/("""{"""),format.raw/*829.23*/("""
          variable1 = "clw";
        """),format.raw/*831.9*/("""}"""),format.raw/*831.10*/("""
        else if (ID == 2) """),format.raw/*832.27*/("""{"""),format.raw/*832.28*/("""
          variable2 = "clw";
        """),format.raw/*834.9*/("""}"""),format.raw/*834.10*/("""
        enable_pres1(ID);
      """),format.raw/*836.7*/("""}"""),format.raw/*836.8*/("""
      else if (var_string == "Ocean Temperature") """),format.raw/*837.51*/("""{"""),format.raw/*837.52*/("""
        if (ID == 1) """),format.raw/*838.22*/("""{"""),format.raw/*838.23*/("""
          variable1 = "ot";
        """),format.raw/*840.9*/("""}"""),format.raw/*840.10*/("""
        else if (ID == 2) """),format.raw/*841.27*/("""{"""),format.raw/*841.28*/("""
          variable2 = "ot";
        """),format.raw/*843.9*/("""}"""),format.raw/*843.10*/("""
        enable_pres1(ID);
      """),format.raw/*845.7*/("""}"""),format.raw/*845.8*/("""
      else if (var_string == "Ocean Salinity") """),format.raw/*846.48*/("""{"""),format.raw/*846.49*/("""
        if (ID == 1) """),format.raw/*847.22*/("""{"""),format.raw/*847.23*/("""
          variable1 = "os";
        """),format.raw/*849.9*/("""}"""),format.raw/*849.10*/("""
        else if (ID == 2) """),format.raw/*850.27*/("""{"""),format.raw/*850.28*/("""
          variable2 = "os";
        """),format.raw/*852.9*/("""}"""),format.raw/*852.10*/("""
        enable_pres1(ID);
      """),format.raw/*854.7*/("""}"""),format.raw/*854.8*/("""
      else if (var_string == "Vertical Wind Velocity") """),format.raw/*855.56*/("""{"""),format.raw/*855.57*/("""
        if (ID == 1) """),format.raw/*856.22*/("""{"""),format.raw/*856.23*/("""
          variable1 = "wap";
        """),format.raw/*858.9*/("""}"""),format.raw/*858.10*/("""
        else if (ID == 2) """),format.raw/*859.27*/("""{"""),format.raw/*859.28*/("""
          variable2 = "wap";
        """),format.raw/*861.9*/("""}"""),format.raw/*861.10*/("""
        enable_pres1(ID);
      """),format.raw/*863.7*/("""}"""),format.raw/*863.8*/("""
      else if (var_string == "Relative Humidity") """),format.raw/*864.51*/("""{"""),format.raw/*864.52*/("""
        if (ID == 1) """),format.raw/*865.22*/("""{"""),format.raw/*865.23*/("""
          variable1 = "hur";
        """),format.raw/*867.9*/("""}"""),format.raw/*867.10*/("""
        else if (ID == 2) """),format.raw/*868.27*/("""{"""),format.raw/*868.28*/("""
          variable2 = "hur";
        """),format.raw/*870.9*/("""}"""),format.raw/*870.10*/("""
        enable_pres1(ID);
      """),format.raw/*872.7*/("""}"""),format.raw/*872.8*/("""
    """),format.raw/*873.5*/("""}"""),format.raw/*873.6*/("""
    function select_data1(ID)
    """),format.raw/*875.5*/("""{"""),format.raw/*875.6*/("""
      var data_string;
      var x;
      if (ID == 1) """),format.raw/*878.20*/("""{"""),format.raw/*878.21*/("""
        data_string = $("#data1").val();
        x = document.getElementById("var1");
      """),format.raw/*881.7*/("""}"""),format.raw/*881.8*/("""
      else if (ID == 2) """),format.raw/*882.25*/("""{"""),format.raw/*882.26*/("""
        data_string = $("#data2").val();
        x = document.getElementById("var2");
      """),format.raw/*885.7*/("""}"""),format.raw/*885.8*/("""
      disable_download_button();
      if (data_string == "NASA/AMSRE") """),format.raw/*887.40*/("""{"""),format.raw/*887.41*/("""
        unset_vars1(ID); 
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
      """),format.raw/*892.7*/("""}"""),format.raw/*892.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*893.45*/("""{"""),format.raw/*893.46*/("""
        unset_vars1(ID);
        x.options[1].selected=true;
        disable_pres1(ID); 
        x.options[1].disabled=false;
        x.options[8].disabled=false;
      """),format.raw/*899.7*/("""}"""),format.raw/*899.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*900.44*/("""{"""),format.raw/*900.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*905.7*/("""}"""),format.raw/*905.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*906.44*/("""{"""),format.raw/*906.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*911.7*/("""}"""),format.raw/*911.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*912.48*/("""{"""),format.raw/*912.49*/("""
        unset_vars1(ID);
        x.options[4].selected=true;
        disable_pres1(ID); 
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
      """),format.raw/*919.7*/("""}"""),format.raw/*919.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*920.45*/("""{"""),format.raw/*920.46*/("""
        unset_vars1(ID);
        x.options[7].selected=true;
        disable_pres1(); 
        x.options[7].disabled=false;
      """),format.raw/*925.7*/("""}"""),format.raw/*925.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*926.45*/("""{"""),format.raw/*926.46*/("""
        unset_vars1(ID);
        x.options[9].selected=true;
        disable_pres1(ID); 
        x.options[9].disabled=false;
        x.options[10].disabled=false;
      """),format.raw/*932.7*/("""}"""),format.raw/*932.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*933.44*/("""{"""),format.raw/*933.45*/("""
        unset_vars1(ID);
        x.options[11].selected=true;
        disable_pres1(ID); 
        x.options[11].disabled=false;
        x.options[12].disabled=false;
      """),format.raw/*939.7*/("""}"""),format.raw/*939.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*940.45*/("""{"""),format.raw/*940.46*/("""
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
      """),format.raw/*956.7*/("""}"""),format.raw/*956.8*/("""
      else if (data_string == "NASA/AIRS") """),format.raw/*957.44*/("""{"""),format.raw/*957.45*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*963.7*/("""}"""),format.raw/*963.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*964.43*/("""{"""),format.raw/*964.44*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*970.7*/("""}"""),format.raw/*970.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*971.44*/("""{"""),format.raw/*971.45*/("""
        unset_vars1(ID);
        x.options[29].selected=true;
        enable_pres1(ID); 
        x.options[29].disabled=false;
        x.options[30].disabled=false;
      """),format.raw/*977.7*/("""}"""),format.raw/*977.8*/("""
      else if (data_string == "CCCMA/CANAM4") """),format.raw/*978.47*/("""{"""),format.raw/*978.48*/("""
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
      """),format.raw/*1004.7*/("""}"""),format.raw/*1004.8*/("""
      else if (data_string == "CSIRO/MK3.6") """),format.raw/*1005.46*/("""{"""),format.raw/*1005.47*/("""
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
      """),format.raw/*1033.7*/("""}"""),format.raw/*1033.8*/("""
      else if (data_string == "CCCMA/CANESM2" || data_string == "GFDL/ESM2G" ||
               data_string == "GISS/E2-H" || data_string == "GISS/E2-R" ||
               data_string == "NCAR/CAM5" || data_string == "NCC/NORESM" ||
               data_string == "UKMO/HadGEM2-ES" ||
               data_string == "GFDL/CM3" || data_string == "IPSL/CM5A-LR" ||
               data_string == "MIROC/MIROC5" || data_string == "UKMO/HadGEM2-A"
              ) """),format.raw/*1040.17*/("""{"""),format.raw/*1040.18*/("""
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
      """),format.raw/*1071.7*/("""}"""),format.raw/*1071.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*1072.48*/("""{"""),format.raw/*1072.49*/("""
        unset_vars1(ID);
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*1079.7*/("""}"""),format.raw/*1079.8*/("""
      select_var1(ID);
    """),format.raw/*1081.5*/("""}"""),format.raw/*1081.6*/("""
    function select_months()
    """),format.raw/*1083.5*/("""{"""),format.raw/*1083.6*/("""
      var s1=document.getElementById("months");
      disable_download_button();
      if (s1.selectedIndex == 1) """),format.raw/*1086.34*/("""{"""),format.raw/*1086.35*/("""
        reset_months();
      """),format.raw/*1088.7*/("""}"""),format.raw/*1088.8*/("""
      if (s1.selectedIndex == 0) """),format.raw/*1089.34*/("""{"""),format.raw/*1089.35*/("""
        select_all_months();
      """),format.raw/*1091.7*/("""}"""),format.raw/*1091.8*/("""
      if (s1.selectedIndex == 2) """),format.raw/*1092.34*/("""{"""),format.raw/*1092.35*/("""
        reset_months();
        document.getElementById('Jun').checked = true;
        document.getElementById('Jul').checked = true;
        document.getElementById('Aug').checked = true;
      """),format.raw/*1097.7*/("""}"""),format.raw/*1097.8*/("""
      if (s1.selectedIndex == 3) """),format.raw/*1098.34*/("""{"""),format.raw/*1098.35*/("""
        reset_months();
        document.getElementById('Sep').checked = true;
        document.getElementById('Oct').checked = true;
        document.getElementById('Nov').checked = true;
      """),format.raw/*1103.7*/("""}"""),format.raw/*1103.8*/("""
      if (s1.selectedIndex == 4) """),format.raw/*1104.34*/("""{"""),format.raw/*1104.35*/("""
        reset_months();
        document.getElementById('Dec').checked = true;
        document.getElementById('Jan').checked = true;
        document.getElementById('Feb').checked = true;
      """),format.raw/*1109.7*/("""}"""),format.raw/*1109.8*/("""
      if (s1.selectedIndex == 5) """),format.raw/*1110.34*/("""{"""),format.raw/*1110.35*/("""
        reset_months();
        document.getElementById('Mar').checked = true;
        document.getElementById('Apr').checked = true;
        document.getElementById('May').checked = true;
      """),format.raw/*1115.7*/("""}"""),format.raw/*1115.8*/("""
    """),format.raw/*1116.5*/("""}"""),format.raw/*1116.6*/("""
    $(document).ready(function()"""),format.raw/*1117.33*/("""{"""),format.raw/*1117.34*/("""
      $("#download_data").click(function(event) """),format.raw/*1118.49*/("""{"""),format.raw/*1118.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*1121.7*/("""}"""),format.raw/*1121.8*/(""");
      $("#conditionalSamp").click(function(event) """),format.raw/*1122.51*/("""{"""),format.raw/*1122.52*/("""
        Response = null;
        disable_download_button();
        if (no_month_check()) """),format.raw/*1125.31*/("""{"""),format.raw/*1125.32*/("""
           $("#Response").html("Error: please check at least one month.");
           $("#Image").html("");
           return;
        """),format.raw/*1129.9*/("""}"""),format.raw/*1129.10*/("""
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/conditionalSampling?";
        var d1 = $("#data1").val();
        var model1 = d1.replace("/", "_");
        model1 = model1.toLowerCase();
        var arglist = "";
        arglist = arglist.concat("model1=");
        arglist = arglist.concat(model1);
        var v1 = $("#var1").val();
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
        var pres1;
        var pres2;
        if (press_range != 'N/A') """),format.raw/*1166.35*/("""{"""),format.raw/*1166.36*/("""
          var splitty = press_range.split(",");
          if (splitty.length != 2) """),format.raw/*1168.36*/("""{"""),format.raw/*1168.37*/("""
            alert("pressure level range needs to be two values separated by comma.");
            return; 
          """),format.raw/*1171.11*/("""}"""),format.raw/*1171.12*/("""
          else """),format.raw/*1172.16*/("""{"""),format.raw/*1172.17*/("""
            pres1 = splitty[0];
            pres2 = splitty[1];
            if (variable1 == 'ot' || variable1 == 'os') """),format.raw/*1175.57*/("""{"""),format.raw/*1175.58*/("""
              pres1 = pres1 * 10000;  
              pres2 = pres2 * 10000;  
            """),format.raw/*1178.13*/("""}"""),format.raw/*1178.14*/(""" 
            else """),format.raw/*1179.18*/("""{"""),format.raw/*1179.19*/("""
              pres1 = pres1 * 100;  
              pres2 = pres2 * 100;  
            """),format.raw/*1182.13*/("""}"""),format.raw/*1182.14*/("""
          """),format.raw/*1183.11*/("""}"""),format.raw/*1183.12*/("""
        """),format.raw/*1184.9*/("""}"""),format.raw/*1184.10*/("""
        else """),format.raw/*1185.14*/("""{"""),format.raw/*1185.15*/("""
          pres1 = "-1";
          pres2 = "-1";
        """),format.raw/*1188.9*/("""}"""),format.raw/*1188.10*/("""
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
        var d2 = $("#data2").val();
        var model2 = d2.replace("/", "_");
        model2 = model2.toLowerCase();
        arglist = arglist.concat("&model2=");
        arglist = arglist.concat(model2);
        var v2 = $("#var2").val();
        arglist = arglist.concat("&var2=");
        arglist = arglist.concat(variable2);
        var plev = $("#pres2").val();
        if (plev == "N/A")
          plev = "-1";
        if (variable2 == 'ot' || variable2 == 'os') """),format.raw/*1245.53*/("""{"""),format.raw/*1245.54*/("""
          plev = plev * 10000;  
        """),format.raw/*1247.9*/("""}"""),format.raw/*1247.10*/(""" 
        else """),format.raw/*1248.14*/("""{"""),format.raw/*1248.15*/("""
          plev = plev * 100;  
        """),format.raw/*1250.9*/("""}"""),format.raw/*1250.10*/("""
        arglist = arglist.concat("&env_var_plev=");
        arglist = arglist.concat(plev);
        var binstate = document.getElementById('radioDef').checked;
        var binMin, binMax, numBins;
        if (binstate == true) """),format.raw/*1255.31*/("""{"""),format.raw/*1255.32*/(""" 
          binMin = "-1";
          binMax = "-1";
          numBins = "-1";
        """),format.raw/*1259.9*/("""}"""),format.raw/*1259.10*/("""
        else """),format.raw/*1260.14*/("""{"""),format.raw/*1260.15*/(""" 
          binMin = $("#min1").val();
          binMax = $("#max1").val();
          numBins = $("#bins1").val();
        """),format.raw/*1264.9*/("""}"""),format.raw/*1264.10*/("""
        arglist = arglist.concat("&bin_min=");
        arglist = arglist.concat(binMin);
        arglist = arglist.concat("&bin_max=");
        arglist = arglist.concat(binMax);
        arglist = arglist.concat("&bin_n=");
        arglist = arglist.concat(numBins);
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
        var purpose = $("#purpose").val();
        arglist = arglist.concat("&purpose=");
        arglist = arglist.concat(purpose);
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
        $.ajax("""),format.raw/*1311.16*/("""{"""),format.raw/*1311.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1316.54*/("""{"""),format.raw/*1316.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1318.44*/("""{"""),format.raw/*1318.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1325.17*/("""}"""),format.raw/*1325.18*/("""
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
                if (lowerT1 == 0  || upperT1 == 0)"""),format.raw/*1338.51*/("""{"""),format.raw/*1338.52*/(""" 
                  alert("We do not have data for the data-1 source and variable configuration.");
                  return;
                """),format.raw/*1341.17*/("""}"""),format.raw/*1341.18*/("""
                else if (lowerT2 == 0  || upperT2 == 0)"""),format.raw/*1342.56*/("""{"""),format.raw/*1342.57*/(""" 
                  alert("We do not have data for the data-2 source and variable configuration.");
                  return;
                """),format.raw/*1345.17*/("""}"""),format.raw/*1345.18*/("""
                else if (lowerT2 > upperT1 || lowerT1 > upperT2) """),format.raw/*1346.66*/("""{"""),format.raw/*1346.67*/(""" 
                  alert("The two data sets/vars do not have a common time range.");
                  return;
                """),format.raw/*1349.17*/("""}"""),format.raw/*1349.18*/("""
                else """),format.raw/*1350.22*/("""{"""),format.raw/*1350.23*/(""" 
                  if (lowerT1 > lowerT2) """),format.raw/*1351.42*/("""{"""),format.raw/*1351.43*/(""" 
                    lowerT = lowerT1;
                  """),format.raw/*1353.19*/("""}"""),format.raw/*1353.20*/("""
                  else """),format.raw/*1354.24*/("""{"""),format.raw/*1354.25*/("""
                    lowerT = lowerT2;
                  """),format.raw/*1356.19*/("""}"""),format.raw/*1356.20*/("""
                  if (upperT1 > upperT2) """),format.raw/*1357.42*/("""{"""),format.raw/*1357.43*/(""" 
                    upperT = upperT2;
                  """),format.raw/*1359.19*/("""}"""),format.raw/*1359.20*/("""
                  else """),format.raw/*1360.24*/("""{"""),format.raw/*1360.25*/("""
                    upperT = upperT1;
                  """),format.raw/*1362.19*/("""}"""),format.raw/*1362.20*/("""
                """),format.raw/*1363.17*/("""}"""),format.raw/*1363.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*1365.51*/("""{"""),format.raw/*1365.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*1368.17*/("""}"""),format.raw/*1368.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*1369.52*/("""{"""),format.raw/*1369.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*1372.17*/("""}"""),format.raw/*1372.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*1373.52*/("""{"""),format.raw/*1373.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*1376.17*/("""}"""),format.raw/*1376.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*1377.52*/("""{"""),format.raw/*1377.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*1380.17*/("""}"""),format.raw/*1380.18*/("""
            """),format.raw/*1381.13*/("""}"""),format.raw/*1381.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1382.59*/("""{"""),format.raw/*1382.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*1385.13*/("""}"""),format.raw/*1385.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1386.49*/("""{"""),format.raw/*1386.50*/("""
            """),format.raw/*1387.13*/("""}"""),format.raw/*1387.14*/("""
        """),format.raw/*1388.9*/("""}"""),format.raw/*1388.10*/(""");
        $.ajax("""),format.raw/*1389.16*/("""{"""),format.raw/*1389.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1394.54*/("""{"""),format.raw/*1394.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1396.44*/("""{"""),format.raw/*1396.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1403.17*/("""}"""),format.raw/*1403.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html = "<img src='"+data.url+"' width='820'/>";
                $("#Image").html(html);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*1410.13*/("""}"""),format.raw/*1410.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1411.59*/("""{"""),format.raw/*1411.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*1414.13*/("""}"""),format.raw/*1414.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1415.49*/("""{"""),format.raw/*1415.50*/("""
            """),format.raw/*1416.13*/("""}"""),format.raw/*1416.14*/("""
        """),format.raw/*1417.9*/("""}"""),format.raw/*1417.10*/(""");
      """),format.raw/*1418.7*/("""}"""),format.raw/*1418.8*/(""");
    """),format.raw/*1419.5*/("""}"""),format.raw/*1419.6*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.44*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*1421.2*/(""" """),_display_(Seq[Any](/*1421.4*/main("Parameters of ConfId", scripts)/*1421.41*/{_display_(Seq[Any](format.raw/*1421.42*/(""" """),_display_(Seq[Any](/*1421.44*/flash_message())),format.raw/*1421.59*/("""
<p>
<div id="dataSourceP" style="display: none;">"""),_display_(Seq[Any](/*1423.47*/parameters/*1423.57*/.getDataSourceP())),format.raw/*1423.74*/("""</div>
<div id="variableNameP" style="display: none;">"""),_display_(Seq[Any](/*1424.49*/parameters/*1424.59*/.getVariableNameP())),format.raw/*1424.78*/("""</div>
<div id="pressureRangeP" style="display: none;">"""),_display_(Seq[Any](/*1425.50*/parameters/*1425.60*/.getPressureRangeP())),format.raw/*1425.80*/("""</div>
<div id="dataSourceE" style="display: none;">"""),_display_(Seq[Any](/*1426.47*/parameters/*1426.57*/.getDataSourceE())),format.raw/*1426.74*/("""</div>
<div id="variableNameE" style="display: none;">"""),_display_(Seq[Any](/*1427.49*/parameters/*1427.59*/.getVariableNameE())),format.raw/*1427.78*/("""</div>
<div id="pressureRangeE" style="display: none;">"""),_display_(Seq[Any](/*1428.50*/parameters/*1428.60*/.getPressureRangeE())),format.raw/*1428.80*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1429.50*/parameters/*1429.60*/.getStartYearMonth())),format.raw/*1429.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1430.48*/parameters/*1430.58*/.getEndYearMonth())),format.raw/*1430.76*/("""</div>
<div id="selectMonths" style="display: none;">"""),_display_(Seq[Any](/*1431.48*/parameters/*1431.58*/.getSelectMonths())),format.raw/*1431.76*/("""</div>
<div id="monthsPara" style="display: none;">"""),_display_(Seq[Any](/*1432.46*/parameters/*1432.56*/.getMonth())),format.raw/*1432.67*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*1433.44*/parameters/*1433.54*/.getStartLat())),format.raw/*1433.68*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*1434.42*/parameters/*1434.52*/.getEndLat())),format.raw/*1434.64*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*1435.44*/parameters/*1435.54*/.getStartLon())),format.raw/*1435.68*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*1436.42*/parameters/*1436.52*/.getEndLon())),format.raw/*1436.64*/("""</div>
<div id="div_X" style="display: none;">"""),_display_(Seq[Any](/*1437.41*/parameters/*1437.51*/.getX())),format.raw/*1437.58*/("""</div>
<div id="div_Y" style="display: none;">"""),_display_(Seq[Any](/*1438.41*/parameters/*1438.51*/.getY())),format.raw/*1438.58*/("""</div>
<div id="div_Z" style="display: none;">"""),_display_(Seq[Any](/*1439.41*/parameters/*1439.51*/.getZ())),format.raw/*1439.58*/("""</div>
<div id="binMin" style="display: none;">"""),_display_(Seq[Any](/*1440.42*/parameters/*1440.52*/.getBin_min())),format.raw/*1440.65*/("""</div>
<div id="binMax" style="display: none;">"""),_display_(Seq[Any](/*1441.42*/parameters/*1441.52*/.getBin_max())),format.raw/*1441.65*/("""</div>
<div id="binNum" style="display: none;">"""),_display_(Seq[Any](/*1442.42*/parameters/*1442.52*/.getBin_n())),format.raw/*1442.63*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*1443.52*/parameters/*1443.62*/.getExecutionPurpose())),format.raw/*1443.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*1444.41*/parameters/*1444.51*/.getImage())),format.raw/*1444.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*1445.43*/parameters/*1445.53*/.getDataURL())),format.raw/*1445.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*1446.55*/parameters/*1446.65*/.getServiceResponseText())),format.raw/*1446.90*/("""</div>
<table border="1" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Conditional Sampling with One Variable</b><br>
				<br> This service sorts one variable by the values of another
				variable (environmental condition, e.g. SST) and displays the
				averaged value of the first variable as a function of the bin value
				of the second variable. If the first variable is a two-dimensional
				variable, the plot will be a X-Y plot. If the first variable is a
				three-dimensional variable, the plot will be a colored profile
				image. <br>
				<br>
			</center>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<center>Physical Variable (sampled variable)</center>
		</td>
		<td colspan="2">
			<center>Environmental Variable (sampling variable)</center>
		</td>
	</tr>
	<tr>
		<td>source:</td>
		<td><select name="data1" , id="data1" onchange="select_data1(1)">
				<optgroup label="Model: Historical">
					<option selected="CCCMA/CANESM2">CCCMA/CANESM2</option>
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
					<option selected="CCCMA/CANESM2">CCCMA/CANESM2</option>
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
		<td>atmosphere pressure range (hPa) <br> or ocean pressure
			range (dbar):
		</td>
		<td><input id="pres1" value="200, 900" alt="pressure" /></td>
		<td>atmosphere pressure level (hPa) <br> or ocean pressure
			level (dbar):
		</td>
		<td><input id="pres2" value="500" alt="pressure" /></td>
	</tr>
	<tr>
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
		<td colspan="1" rowspan="2">sampling variable binning
			specification:</td>
		<td colspan="3">
			<form>
				default: <input onclick="setDefault()" type="radio" name="default1"
					value="" id="radioDef" checked>
		</td>
	</tr>
	<tr>
		<td colspan="3">customized: <input onclick="setCustomized()"
			type="radio" name="default1" value="" id="radioCus"> Min: <input
			id="min1" value="" alt="" /> Max: <input id="max1" value="" alt="" />
			number of bins: <input id="bins1" value="" alt="" />
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
		<td colspan="2" align="center"><input id="conditionalSamp"
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
				cols="150" rows="2">Data URL Here</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea id="Response" cols="150"
				rows="6">Service Response Text Here</textarea></td>
	</tr>
</table>
""")))})),format.raw/*1761.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ConditionalSampling): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ConditionalSampling) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:47 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/conditionalSampling.scala.html
                    HASH: df1406a4d03b2eee6828d7ecdab0ca1939bdaf9a
                    MATRIX: 3213->1205|3349->1346|3364->1353|3449->1357|3500->1372|3515->1378|3577->1418|3639->1444|3654->1450|3715->1489|3800->1539|3815->1545|3882->1590|4087->1759|4102->1765|4158->1799|4243->1849|4258->1855|4314->1889|4487->2034|4516->2035|5138->2629|5167->2630|5209->2644|5238->2645|5560->2939|5589->2940|5722->3046|5750->3047|5790->3059|5819->3060|5952->3166|5980->3167|6072->3231|6101->3232|6240->3344|6269->3345|6311->3359|6340->3360|6479->3472|6508->3473|6600->3537|6629->3538|6768->3650|6797->3651|6839->3665|6868->3666|7007->3778|7036->3779|7258->3973|7287->3974|7368->4028|7396->4029|7428->4033|7457->4034|7638->4188|7666->4189|7999->4493|8029->4494|8195->4631|8225->4632|8295->4674|8324->4675|8396->4718|8426->4719|8496->4761|8525->4762|8596->4804|8626->4805|8696->4847|8725->4848|8796->4890|8826->4891|8896->4933|8925->4934|8996->4976|9026->4977|9096->5019|9125->5020|9197->5063|9227->5064|9297->5106|9326->5107|9403->5155|9433->5156|9503->5198|9532->5199|9606->5244|9636->5245|9706->5287|9735->5288|9808->5332|9838->5333|9908->5375|9937->5376|10007->5417|10037->5418|10107->5460|10136->5461|10210->5506|10240->5507|10311->5550|10340->5551|10414->5596|10444->5597|10515->5640|10544->5641|10620->5688|10650->5689|10721->5732|10750->5733|10822->5776|10852->5777|10923->5820|10952->5821|11024->5864|11054->5865|11125->5908|11154->5909|11225->5951|11255->5952|11326->5995|11355->5996|11426->6038|11456->6039|11527->6082|11556->6083|11631->6129|11661->6130|11732->6173|11761->6174|11833->6217|11863->6218|11934->6261|11963->6262|12035->6305|12065->6306|12136->6349|12165->6350|12236->6392|12266->6393|12337->6436|12366->6437|12438->6480|12468->6481|12539->6524|12568->6525|12639->6567|12669->6568|12740->6611|12769->6612|12839->6653|12869->6654|12940->6697|12969->6698|13040->6740|13070->6741|13141->6784|13170->6785|13245->6831|13275->6832|13346->6875|13375->6876|13408->6881|13437->6882|13499->6915|13529->6916|13695->7053|13725->7054|13795->7096|13824->7097|13896->7140|13926->7141|13996->7183|14025->7184|14096->7226|14126->7227|14196->7269|14225->7270|14296->7312|14326->7313|14396->7355|14425->7356|14496->7398|14526->7399|14596->7441|14625->7442|14697->7485|14727->7486|14797->7528|14826->7529|14903->7577|14933->7578|15003->7620|15032->7621|15106->7666|15136->7667|15206->7709|15235->7710|15308->7754|15338->7755|15408->7797|15437->7798|15507->7839|15537->7840|15607->7882|15636->7883|15710->7928|15740->7929|15811->7972|15840->7973|15914->8018|15944->8019|16015->8062|16044->8063|16120->8110|16150->8111|16221->8154|16250->8155|16322->8198|16352->8199|16423->8242|16452->8243|16524->8286|16554->8287|16625->8330|16654->8331|16725->8373|16755->8374|16826->8417|16855->8418|16926->8460|16956->8461|17027->8504|17056->8505|17131->8551|17161->8552|17232->8595|17261->8596|17333->8639|17363->8640|17434->8683|17463->8684|17535->8727|17565->8728|17636->8771|17665->8772|17736->8814|17766->8815|17837->8858|17866->8859|17938->8902|17968->8903|18039->8946|18068->8947|18139->8989|18169->8990|18240->9033|18269->9034|18339->9075|18369->9076|18440->9119|18469->9120|18540->9162|18570->9163|18641->9206|18670->9207|18745->9253|18775->9254|18846->9297|18875->9298|18908->9303|18937->9304|19001->9339|19031->9340|21069->11350|21098->11351|21162->11386|21192->11387|23230->13397|23259->13398|23323->13433|23353->13434|23470->13522|23500->13523|23587->13582|23616->13583|23684->13622|23714->13623|23801->13682|23830->13683|23898->13722|23928->13723|24015->13782|24044->13783|24112->13822|24142->13823|24229->13882|24258->13883|24326->13922|24356->13923|24443->13982|24472->13983|24540->14022|24570->14023|24657->14082|24686->14083|24754->14122|24784->14123|24871->14182|24900->14183|24968->14222|24998->14223|25085->14282|25114->14283|25182->14322|25212->14323|25299->14382|25328->14383|25396->14422|25426->14423|25513->14482|25542->14483|25610->14522|25640->14523|25727->14582|25756->14583|25824->14622|25854->14623|25941->14682|25970->14683|26003->14688|26032->14689|26065->14694|26094->14695|26160->14733|26189->14734|26882->15399|26911->15400|26974->15435|27003->15436|27776->16180|27806->16181|27870->16216|27900->16217|27971->16260|28000->16261|28061->16294|28090->16295|28795->16972|28824->16973|28883->17004|28912->17005|29216->17281|29245->17282|29307->17316|29336->17317|29634->17587|29663->17588|29735->17632|29764->17633|29875->17716|29904->17717|29975->17760|30004->17761|30115->17844|30144->17845|30206->17879|30235->17880|30297->17913|30327->17914|30405->17964|30434->17965|30488->17990|30518->17991|30596->18041|30625->18042|31803->19192|31832->19193|31896->19229|31925->19230|31987->19263|32017->19264|32096->19315|32125->19316|32179->19341|32209->19342|32288->19393|32317->19394|32396->19445|32425->19446|32488->19481|32517->19482|32579->19515|32609->19516|32718->19597|32747->19598|32801->19623|32831->19624|32935->19700|32964->19701|33021->19730|33050->19731|33112->19765|33141->19766|33212->19808|33242->19809|33316->19855|33345->19856|33399->19881|33429->19882|33503->19928|33532->19929|33645->20013|33675->20014|33727->20037|33757->20038|33825->20078|33855->20079|33911->20106|33941->20107|34009->20147|34039->20148|34101->20182|34130->20183|34212->20236|34242->20237|34293->20259|34323->20260|34390->20299|34420->20300|34476->20327|34506->20328|34573->20367|34603->20368|34665->20402|34694->20403|34780->20460|34810->20461|34862->20484|34892->20485|34960->20525|34990->20526|35046->20553|35076->20554|35144->20594|35174->20595|35236->20629|35265->20630|35346->20682|35376->20683|35428->20706|35458->20707|35525->20746|35555->20747|35611->20774|35641->20775|35708->20814|35738->20815|35800->20849|35829->20850|35918->20910|35948->20911|36000->20934|36030->20935|36098->20975|36128->20976|36184->21003|36214->21004|36282->21044|36312->21045|36374->21079|36403->21080|36493->21141|36523->21142|36576->21166|36606->21167|36674->21207|36704->21208|36760->21235|36790->21236|36858->21276|36888->21277|36950->21311|36979->21312|37065->21369|37095->21370|37147->21393|37177->21394|37249->21438|37279->21439|37335->21466|37365->21467|37437->21511|37467->21512|37529->21546|37558->21547|37639->21599|37669->21600|37721->21623|37751->21624|37819->21664|37849->21665|37905->21692|37935->21693|38003->21733|38033->21734|38095->21768|38124->21769|38202->21818|38232->21819|38284->21842|38314->21843|38382->21883|38412->21884|38468->21911|38498->21912|38566->21952|38596->21953|38658->21987|38687->21988|38783->22055|38813->22056|38864->22078|38894->22079|38961->22118|38991->22119|39047->22146|39077->22147|39144->22186|39174->22187|39236->22221|39265->22222|39362->22290|39392->22291|39443->22313|39473->22314|39538->22351|39568->22352|39624->22379|39654->22380|39719->22417|39749->22418|39811->22452|39840->22453|39948->22532|39978->22533|40029->22555|40059->22556|40128->22597|40158->22598|40214->22625|40244->22626|40313->22667|40343->22668|40405->22702|40434->22703|40543->22783|40573->22784|40624->22806|40654->22807|40724->22849|40754->22850|40810->22877|40840->22878|40910->22920|40940->22921|41002->22955|41031->22956|41132->23028|41162->23029|41213->23051|41243->23052|41310->23091|41340->23092|41396->23119|41426->23120|41493->23159|41523->23160|41585->23194|41614->23195|41716->23268|41746->23269|41797->23291|41827->23292|41894->23331|41924->23332|41980->23359|42010->23360|42077->23399|42107->23400|42169->23434|42198->23435|42297->23505|42327->23506|42378->23528|42408->23529|42475->23568|42505->23569|42561->23596|42591->23597|42658->23636|42688->23637|42750->23671|42779->23672|42879->23743|42909->23744|42960->23766|42990->23767|43057->23806|43087->23807|43143->23834|43173->23835|43240->23874|43270->23875|43332->23909|43361->23910|43472->23992|43502->23993|43553->24015|43583->24016|43652->24057|43682->24058|43738->24085|43768->24086|43837->24127|43867->24128|43929->24162|43958->24163|44070->24246|44100->24247|44151->24269|44181->24270|44250->24311|44280->24312|44336->24339|44366->24340|44435->24381|44465->24382|44527->24416|44556->24417|44666->24498|44696->24499|44747->24521|44777->24522|44846->24563|44876->24564|44932->24591|44962->24592|45031->24633|45061->24634|45123->24668|45152->24669|45247->24735|45277->24736|45328->24758|45358->24759|45425->24798|45455->24799|45511->24826|45541->24827|45608->24866|45638->24867|45700->24901|45729->24902|45833->24977|45863->24978|45914->25000|45944->25001|46013->25042|46043->25043|46099->25070|46129->25071|46198->25112|46228->25113|46290->25147|46319->25148|46413->25213|46443->25214|46494->25236|46524->25237|46591->25276|46621->25277|46677->25304|46707->25305|46774->25344|46804->25345|46866->25379|46895->25380|47000->25456|47030->25457|47081->25479|47111->25480|47180->25521|47210->25522|47266->25549|47296->25550|47365->25591|47395->25592|47457->25626|47486->25627|47581->25693|47611->25694|47662->25716|47692->25717|47759->25756|47789->25757|47845->25784|47875->25785|47942->25824|47972->25825|48034->25859|48063->25860|48141->25909|48171->25910|48222->25932|48252->25933|48317->25970|48347->25971|48403->25998|48433->25999|48498->26036|48528->26037|48589->26070|48618->26071|48698->26122|48728->26123|48779->26145|48809->26146|48875->26184|48905->26185|48961->26212|48991->26213|49057->26251|49087->26252|49148->26285|49177->26286|49263->26343|49293->26344|49344->26366|49374->26367|49440->26405|49470->26406|49526->26433|49556->26434|49622->26472|49652->26473|49713->26506|49742->26507|49831->26567|49861->26568|49912->26590|49942->26591|50008->26629|50038->26630|50094->26657|50124->26658|50190->26696|50220->26697|50281->26730|50310->26731|50390->26782|50420->26783|50471->26805|50501->26806|50566->26843|50596->26844|50652->26871|50682->26872|50747->26909|50777->26910|50838->26943|50867->26944|50944->26992|50974->26993|51025->27015|51055->27016|51120->27053|51150->27054|51206->27081|51236->27082|51301->27119|51331->27120|51392->27153|51421->27154|51506->27210|51536->27211|51587->27233|51617->27234|51683->27272|51713->27273|51769->27300|51799->27301|51865->27339|51895->27340|51956->27373|51985->27374|52065->27425|52095->27426|52146->27448|52176->27449|52242->27487|52272->27488|52328->27515|52358->27516|52424->27554|52454->27555|52515->27588|52544->27589|52577->27594|52606->27595|52669->27630|52698->27631|52783->27687|52813->27688|52934->27781|52963->27782|53017->27807|53047->27808|53168->27901|53197->27902|53299->27975|53329->27976|53491->28110|53520->28111|53594->28156|53624->28157|53822->28327|53851->28328|53924->28372|53954->28373|54115->28506|54144->28507|54217->28551|54247->28552|54408->28685|54437->28686|54514->28734|54544->28735|54779->28942|54808->28943|54882->28988|54912->28989|55071->29120|55100->29121|55174->29166|55204->29167|55403->29338|55432->29339|55505->29383|55535->29384|55736->29557|55765->29558|55839->29603|55869->29604|56450->30157|56479->30158|56552->30202|56582->30203|56782->30375|56811->30376|56883->30419|56913->30420|57113->30592|57142->30593|57215->30637|57245->30638|57445->30810|57474->30811|57550->30858|57580->30859|58535->31785|58565->31786|58641->31832|58672->31833|59703->32835|59733->32836|60219->33292|60250->33293|61392->34406|61422->34407|61500->34455|61531->34456|61769->34665|61799->34666|61856->34694|61886->34695|61949->34729|61979->34730|62124->34845|62155->34846|62215->34877|62245->34878|62309->34912|62340->34913|62405->34949|62435->34950|62499->34984|62530->34985|62755->35181|62785->35182|62849->35216|62880->35217|63105->35413|63135->35414|63199->35448|63230->35449|63455->35645|63485->35646|63549->35680|63580->35681|63805->35877|63835->35878|63869->35883|63899->35884|63962->35917|63993->35918|64072->35967|64103->35968|64218->36054|64248->36055|64331->36108|64362->36109|64483->36200|64514->36201|64679->36337|64710->36338|66222->37820|66253->37821|66367->37905|66398->37906|66546->38024|66577->38025|66623->38041|66654->38042|66805->38163|66836->38164|66957->38255|66988->38256|67037->38275|67068->38276|67185->38363|67216->38364|67257->38375|67288->38376|67326->38385|67357->38386|67401->38400|67432->38401|67518->38458|67549->38459|69963->40843|69994->40844|70065->40886|70096->40887|70141->40902|70172->40903|70241->40943|70272->40944|70530->41172|70561->41173|70676->41259|70707->41260|70751->41274|70782->41275|70934->41398|70965->41399|72848->43252|72879->43253|73074->43418|73105->43419|73212->43496|73243->43497|73572->43796|73603->43797|74246->44410|74277->44411|74449->44553|74480->44554|74566->44610|74597->44611|74769->44753|74800->44754|74896->44820|74927->44821|75085->44949|75116->44950|75168->44972|75199->44973|75272->45016|75303->45017|75391->45075|75422->45076|75476->45100|75507->45101|75594->45158|75625->45159|75697->45201|75728->45202|75816->45260|75847->45261|75901->45285|75932->45286|76019->45343|76050->45344|76097->45361|76128->45362|76261->45465|76292->45466|76487->45631|76518->45632|76600->45684|76631->45685|76868->45892|76899->45893|76981->45945|77012->45946|77249->46153|77280->46154|77362->46206|77393->46207|77694->46478|77725->46479|77768->46492|77799->46493|77889->46553|77920->46554|78029->46633|78060->46634|78140->46684|78171->46685|78214->46698|78245->46699|78283->46708|78314->46709|78362->46727|78393->46728|78578->46883|78609->46884|78716->46961|78747->46962|79076->47261|79107->47262|79452->47577|79483->47578|79573->47638|79604->47639|79741->47746|79772->47747|79852->47797|79883->47798|79926->47811|79957->47812|79995->47821|80026->47822|80064->47831|80094->47832|80130->47839|80160->47840|80216->1247|80244->1265|80310->1296|80325->1302|80387->1342|80419->47856|80458->47858|80506->47895|80547->47896|80587->47898|80626->47913|80715->47964|80736->47974|80777->47991|80870->48046|80891->48056|80934->48075|81028->48131|81049->48141|81093->48161|81184->48214|81205->48224|81246->48241|81339->48296|81360->48306|81403->48325|81497->48381|81518->48391|81562->48411|81656->48467|81677->48477|81721->48497|81813->48551|81834->48561|81876->48579|81968->48633|81989->48643|82031->48661|82121->48713|82142->48723|82177->48734|82265->48784|82286->48794|82324->48808|82410->48856|82431->48866|82467->48878|82555->48928|82576->48938|82614->48952|82700->49000|82721->49010|82757->49022|82842->49069|82863->49079|82894->49086|82979->49133|83000->49143|83031->49150|83116->49197|83137->49207|83168->49214|83254->49262|83275->49272|83312->49285|83398->49333|83419->49343|83456->49356|83542->49404|83563->49414|83598->49425|83694->49483|83715->49493|83761->49515|83846->49562|83867->49572|83902->49583|83989->49632|84010->49642|84047->49655|84146->49716|84167->49726|84216->49751|95694->61196
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|70->30|70->30|70->30|75->35|75->35|93->53|93->53|93->53|93->53|101->61|101->61|104->64|104->64|105->65|105->65|108->68|108->68|110->70|110->70|113->73|113->73|114->74|114->74|117->77|117->77|119->79|119->79|122->82|122->82|123->83|123->83|126->86|126->86|130->90|130->90|132->92|132->92|132->92|132->92|137->97|137->97|143->103|143->103|146->106|146->106|148->108|148->108|149->109|149->109|151->111|151->111|152->112|152->112|154->114|154->114|155->115|155->115|157->117|157->117|158->118|158->118|160->120|160->120|161->121|161->121|163->123|163->123|164->124|164->124|166->126|166->126|167->127|167->127|169->129|169->129|170->130|170->130|172->132|172->132|173->133|173->133|175->135|175->135|176->136|176->136|178->138|178->138|179->139|179->139|181->141|181->141|182->142|182->142|184->144|184->144|185->145|185->145|187->147|187->147|188->148|188->148|190->150|190->150|191->151|191->151|193->153|193->153|194->154|194->154|196->156|196->156|197->157|197->157|199->159|199->159|200->160|200->160|202->162|202->162|203->163|203->163|205->165|205->165|206->166|206->166|208->168|208->168|209->169|209->169|211->171|211->171|212->172|212->172|214->174|214->174|215->175|215->175|217->177|217->177|218->178|218->178|220->180|220->180|221->181|221->181|223->183|223->183|224->184|224->184|225->185|225->185|228->188|228->188|230->190|230->190|231->191|231->191|233->193|233->193|234->194|234->194|236->196|236->196|237->197|237->197|239->199|239->199|240->200|240->200|242->202|242->202|243->203|243->203|245->205|245->205|246->206|246->206|248->208|248->208|249->209|249->209|251->211|251->211|252->212|252->212|254->214|254->214|255->215|255->215|257->217|257->217|258->218|258->218|260->220|260->220|261->221|261->221|263->223|263->223|264->224|264->224|266->226|266->226|267->227|267->227|269->229|269->229|270->230|270->230|272->232|272->232|273->233|273->233|275->235|275->235|276->236|276->236|278->238|278->238|279->239|279->239|281->241|281->241|282->242|282->242|284->244|284->244|285->245|285->245|287->247|287->247|288->248|288->248|290->250|290->250|291->251|291->251|293->253|293->253|294->254|294->254|296->256|296->256|297->257|297->257|299->259|299->259|300->260|300->260|302->262|302->262|303->263|303->263|305->265|305->265|306->266|306->266|307->267|307->267|360->320|360->320|361->321|361->321|414->374|414->374|415->375|415->375|417->377|417->377|419->379|419->379|420->380|420->380|422->382|422->382|423->383|423->383|425->385|425->385|426->386|426->386|428->388|428->388|429->389|429->389|431->391|431->391|432->392|432->392|434->394|434->394|435->395|435->395|437->397|437->397|438->398|438->398|440->400|440->400|441->401|441->401|443->403|443->403|444->404|444->404|446->406|446->406|447->407|447->407|449->409|449->409|450->410|450->410|452->412|452->412|453->413|453->413|454->414|454->414|456->416|456->416|469->429|469->429|471->431|471->431|483->443|483->443|485->445|485->445|488->448|488->448|490->450|490->450|503->463|503->463|505->465|505->465|515->475|515->475|517->477|517->477|527->487|527->487|529->489|529->489|532->492|532->492|534->494|534->494|537->497|537->497|539->499|539->499|541->501|541->501|543->503|543->503|544->504|544->504|546->506|546->506|580->540|580->540|582->542|582->542|584->544|584->544|586->546|586->546|587->547|587->547|589->549|589->549|592->552|592->552|594->554|594->554|596->556|596->556|599->559|599->559|600->560|600->560|603->563|603->563|605->565|605->565|607->567|607->567|609->569|609->569|611->571|611->571|612->572|612->572|614->574|614->574|616->576|616->576|617->577|617->577|619->579|619->579|620->580|620->580|622->582|622->582|624->584|624->584|625->585|625->585|626->586|626->586|628->588|628->588|629->589|629->589|631->591|631->591|633->593|633->593|634->594|634->594|635->595|635->595|637->597|637->597|638->598|638->598|640->600|640->600|642->602|642->602|643->603|643->603|644->604|644->604|646->606|646->606|647->607|647->607|649->609|649->609|651->611|651->611|652->612|652->612|653->613|653->613|655->615|655->615|656->616|656->616|658->618|658->618|660->620|660->620|661->621|661->621|662->622|662->622|664->624|664->624|665->625|665->625|667->627|667->627|669->629|669->629|670->630|670->630|671->631|671->631|673->633|673->633|674->634|674->634|676->636|676->636|678->638|678->638|679->639|679->639|680->640|680->640|682->642|682->642|683->643|683->643|685->645|685->645|687->647|687->647|688->648|688->648|689->649|689->649|691->651|691->651|692->652|692->652|694->654|694->654|696->656|696->656|697->657|697->657|698->658|698->658|700->660|700->660|701->661|701->661|703->663|703->663|705->665|705->665|706->666|706->666|707->667|707->667|709->669|709->669|710->670|710->670|712->672|712->672|714->674|714->674|715->675|715->675|716->676|716->676|718->678|718->678|719->679|719->679|721->681|721->681|723->683|723->683|724->684|724->684|725->685|725->685|727->687|727->687|728->688|728->688|730->690|730->690|732->692|732->692|733->693|733->693|734->694|734->694|736->696|736->696|737->697|737->697|739->699|739->699|741->701|741->701|742->702|742->702|743->703|743->703|745->705|745->705|746->706|746->706|748->708|748->708|750->710|750->710|751->711|751->711|752->712|752->712|754->714|754->714|755->715|755->715|757->717|757->717|759->719|759->719|760->720|760->720|761->721|761->721|763->723|763->723|764->724|764->724|766->726|766->726|768->728|768->728|769->729|769->729|770->730|770->730|772->732|772->732|773->733|773->733|775->735|775->735|777->737|777->737|778->738|778->738|779->739|779->739|781->741|781->741|782->742|782->742|784->744|784->744|786->746|786->746|787->747|787->747|788->748|788->748|790->750|790->750|791->751|791->751|793->753|793->753|795->755|795->755|796->756|796->756|797->757|797->757|799->759|799->759|800->760|800->760|802->762|802->762|804->764|804->764|805->765|805->765|806->766|806->766|808->768|808->768|809->769|809->769|811->771|811->771|813->773|813->773|814->774|814->774|815->775|815->775|817->777|817->777|818->778|818->778|820->780|820->780|822->782|822->782|823->783|823->783|824->784|824->784|826->786|826->786|827->787|827->787|829->789|829->789|831->791|831->791|832->792|832->792|833->793|833->793|835->795|835->795|836->796|836->796|838->798|838->798|840->800|840->800|841->801|841->801|842->802|842->802|844->804|844->804|845->805|845->805|847->807|847->807|849->809|849->809|850->810|850->810|851->811|851->811|853->813|853->813|854->814|854->814|856->816|856->816|858->818|858->818|859->819|859->819|860->820|860->820|862->822|862->822|863->823|863->823|865->825|865->825|867->827|867->827|868->828|868->828|869->829|869->829|871->831|871->831|872->832|872->832|874->834|874->834|876->836|876->836|877->837|877->837|878->838|878->838|880->840|880->840|881->841|881->841|883->843|883->843|885->845|885->845|886->846|886->846|887->847|887->847|889->849|889->849|890->850|890->850|892->852|892->852|894->854|894->854|895->855|895->855|896->856|896->856|898->858|898->858|899->859|899->859|901->861|901->861|903->863|903->863|904->864|904->864|905->865|905->865|907->867|907->867|908->868|908->868|910->870|910->870|912->872|912->872|913->873|913->873|915->875|915->875|918->878|918->878|921->881|921->881|922->882|922->882|925->885|925->885|927->887|927->887|932->892|932->892|933->893|933->893|939->899|939->899|940->900|940->900|945->905|945->905|946->906|946->906|951->911|951->911|952->912|952->912|959->919|959->919|960->920|960->920|965->925|965->925|966->926|966->926|972->932|972->932|973->933|973->933|979->939|979->939|980->940|980->940|996->956|996->956|997->957|997->957|1003->963|1003->963|1004->964|1004->964|1010->970|1010->970|1011->971|1011->971|1017->977|1017->977|1018->978|1018->978|1044->1004|1044->1004|1045->1005|1045->1005|1073->1033|1073->1033|1080->1040|1080->1040|1111->1071|1111->1071|1112->1072|1112->1072|1119->1079|1119->1079|1121->1081|1121->1081|1123->1083|1123->1083|1126->1086|1126->1086|1128->1088|1128->1088|1129->1089|1129->1089|1131->1091|1131->1091|1132->1092|1132->1092|1137->1097|1137->1097|1138->1098|1138->1098|1143->1103|1143->1103|1144->1104|1144->1104|1149->1109|1149->1109|1150->1110|1150->1110|1155->1115|1155->1115|1156->1116|1156->1116|1157->1117|1157->1117|1158->1118|1158->1118|1161->1121|1161->1121|1162->1122|1162->1122|1165->1125|1165->1125|1169->1129|1169->1129|1206->1166|1206->1166|1208->1168|1208->1168|1211->1171|1211->1171|1212->1172|1212->1172|1215->1175|1215->1175|1218->1178|1218->1178|1219->1179|1219->1179|1222->1182|1222->1182|1223->1183|1223->1183|1224->1184|1224->1184|1225->1185|1225->1185|1228->1188|1228->1188|1285->1245|1285->1245|1287->1247|1287->1247|1288->1248|1288->1248|1290->1250|1290->1250|1295->1255|1295->1255|1299->1259|1299->1259|1300->1260|1300->1260|1304->1264|1304->1264|1351->1311|1351->1311|1356->1316|1356->1316|1358->1318|1358->1318|1365->1325|1365->1325|1378->1338|1378->1338|1381->1341|1381->1341|1382->1342|1382->1342|1385->1345|1385->1345|1386->1346|1386->1346|1389->1349|1389->1349|1390->1350|1390->1350|1391->1351|1391->1351|1393->1353|1393->1353|1394->1354|1394->1354|1396->1356|1396->1356|1397->1357|1397->1357|1399->1359|1399->1359|1400->1360|1400->1360|1402->1362|1402->1362|1403->1363|1403->1363|1405->1365|1405->1365|1408->1368|1408->1368|1409->1369|1409->1369|1412->1372|1412->1372|1413->1373|1413->1373|1416->1376|1416->1376|1417->1377|1417->1377|1420->1380|1420->1380|1421->1381|1421->1381|1422->1382|1422->1382|1425->1385|1425->1385|1426->1386|1426->1386|1427->1387|1427->1387|1428->1388|1428->1388|1429->1389|1429->1389|1434->1394|1434->1394|1436->1396|1436->1396|1443->1403|1443->1403|1450->1410|1450->1410|1451->1411|1451->1411|1454->1414|1454->1414|1455->1415|1455->1415|1456->1416|1456->1416|1457->1417|1457->1417|1458->1418|1458->1418|1459->1419|1459->1419|1462->18|1462->19|1463->20|1463->20|1463->20|1464->1421|1464->1421|1464->1421|1464->1421|1464->1421|1464->1421|1466->1423|1466->1423|1466->1423|1467->1424|1467->1424|1467->1424|1468->1425|1468->1425|1468->1425|1469->1426|1469->1426|1469->1426|1470->1427|1470->1427|1470->1427|1471->1428|1471->1428|1471->1428|1472->1429|1472->1429|1472->1429|1473->1430|1473->1430|1473->1430|1474->1431|1474->1431|1474->1431|1475->1432|1475->1432|1475->1432|1476->1433|1476->1433|1476->1433|1477->1434|1477->1434|1477->1434|1478->1435|1478->1435|1478->1435|1479->1436|1479->1436|1479->1436|1480->1437|1480->1437|1480->1437|1481->1438|1481->1438|1481->1438|1482->1439|1482->1439|1482->1439|1483->1440|1483->1440|1483->1440|1484->1441|1484->1441|1484->1441|1485->1442|1485->1442|1485->1442|1486->1443|1486->1443|1486->1443|1487->1444|1487->1444|1487->1444|1488->1445|1488->1445|1488->1445|1489->1446|1489->1446|1489->1446|1804->1761
                    -- GENERATED --
                */
            