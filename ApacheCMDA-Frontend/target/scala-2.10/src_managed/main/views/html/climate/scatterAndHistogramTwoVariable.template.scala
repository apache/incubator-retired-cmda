
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
object scatterAndHistogramTwoVariable extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[metadata.ScatterHistogramTwoVar,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(parameters: metadata.ScatterHistogramTwoVar):play.api.templates.HtmlFormat.Appendable = {
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
<script type="text/javascript" src=""""),_display_(Seq[Any](/*29.38*/routes/*29.44*/.Assets.at("javascripts/xmisc.js"))),format.raw/*29.78*/(""""></script>
<script type="text/javascript">
	var Response = null;
    var variable1 = "";
    var variable2 = "";
    window.onload = function() """),format.raw/*34.32*/("""{"""),format.raw/*34.33*/("""
      changeDataSource();
      select_data1(1);
      changeDataSource2();
      select_data1(2);
      changeVariableName();
      select_var1(1);
      changeVariableName2();
      select_var1(2); 
      disable_pres1(1);
      disable_pres1(2);
      $('#t0').val($('#startYearMonth').text());
      $('#t1').val($('#endYearMonth').text());
      $('#lat0').val($('#startLat').text());
      $('#lat1').val($('#endLat').text());
      $('#lon0').val($('#startLon').text());
      $('#lon1').val($('#endLon').text());
      $('#nSample').val($('#samples').text());
      $('#purpose').html($('#executionPurpose').text());
      var imageUrl = $('#image').text();
      $('#Image').html('<img src="'+imageUrl+'" width=680 />');
      $('#data_url').html($('#dataURL').text());
      $('#Response').html($('serviceResponseText').text());
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
    function changeDataSource()"""),format.raw/*58.32*/("""{"""),format.raw/*58.33*/("""
    	var dataSource = $('#source1').text();
     	var x = document.getElementById("data1");
     	if(dataSource == "cccma_canesm2" )"""),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""
     		x.options[0].selected=true;
     	"""),format.raw/*63.7*/("""}"""),format.raw/*63.8*/("""
     	else if(dataSource == "gfdl_esm2g" )"""),format.raw/*64.43*/("""{"""),format.raw/*64.44*/("""
     		x.options[1].selected=true;
     	"""),format.raw/*66.7*/("""}"""),format.raw/*66.8*/("""
     	else if(dataSource == "giss_e2-h" )"""),format.raw/*67.42*/("""{"""),format.raw/*67.43*/("""
     		x.options[2].selected=true;
     	"""),format.raw/*69.7*/("""}"""),format.raw/*69.8*/("""
     	else if(dataSource == "giss_e2-r" )"""),format.raw/*70.42*/("""{"""),format.raw/*70.43*/("""
     		x.options[3].selected=true;
     	"""),format.raw/*72.7*/("""}"""),format.raw/*72.8*/("""
     	else if(dataSource == "ncar_cam5" )"""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
     		x.options[4].selected=true;
     	"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/("""
     	else if(dataSource == "ncc_noresm" )"""),format.raw/*76.43*/("""{"""),format.raw/*76.44*/("""
     		x.options[5].selected=true;
     	"""),format.raw/*78.7*/("""}"""),format.raw/*78.8*/("""
     	else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*79.48*/("""{"""),format.raw/*79.49*/("""
     		x.options[6].selected=true;
     	"""),format.raw/*81.7*/("""}"""),format.raw/*81.8*/("""
     	else if(dataSource == "cccma_canam4" )"""),format.raw/*82.45*/("""{"""),format.raw/*82.46*/("""
     		x.options[7].selected=true;
     	"""),format.raw/*84.7*/("""}"""),format.raw/*84.8*/("""
     	else if(dataSource == "csiro_mk3.6" )"""),format.raw/*85.44*/("""{"""),format.raw/*85.45*/("""
     		x.options[8].selected=true;
     	"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/("""
     	else if(dataSource == "gfdl_cm3" )"""),format.raw/*88.41*/("""{"""),format.raw/*88.42*/("""
     		x.options[9].selected=true;
     	"""),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""
     	else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*91.45*/("""{"""),format.raw/*91.46*/("""
     		x.options[10].selected=true;
     	"""),format.raw/*93.7*/("""}"""),format.raw/*93.8*/("""
     	else if(dataSource == "miroc_miroc5" )"""),format.raw/*94.45*/("""{"""),format.raw/*94.46*/("""
     		x.options[11].selected=true;
     	"""),format.raw/*96.7*/("""}"""),format.raw/*96.8*/("""
     	else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*97.47*/("""{"""),format.raw/*97.48*/("""
     		x.options[12].selected=true;
     	"""),format.raw/*99.7*/("""}"""),format.raw/*99.8*/("""
     	else if(dataSource == "nasa_modis" )"""),format.raw/*100.43*/("""{"""),format.raw/*100.44*/("""
     		x.options[13].selected=true;
     	"""),format.raw/*102.7*/("""}"""),format.raw/*102.8*/("""
     	else if(dataSource == "nasa_amsre" )"""),format.raw/*103.43*/("""{"""),format.raw/*103.44*/("""
     		x.options[14].selected=true;
     	"""),format.raw/*105.7*/("""}"""),format.raw/*105.8*/("""
     	else if(dataSource == "nasa_trmm" )"""),format.raw/*106.42*/("""{"""),format.raw/*106.43*/("""
     		x.options[15].selected=true;
     	"""),format.raw/*108.7*/("""}"""),format.raw/*108.8*/("""
     	else if(dataSource == "nasa_gpcp" )"""),format.raw/*109.42*/("""{"""),format.raw/*109.43*/("""
     		x.options[16].selected=true;
     	"""),format.raw/*111.7*/("""}"""),format.raw/*111.8*/("""
     	else if(dataSource == "nasa_quikscat" )"""),format.raw/*112.46*/("""{"""),format.raw/*112.47*/("""
     		x.options[17].selected=true;
     	"""),format.raw/*114.7*/("""}"""),format.raw/*114.8*/("""
     	else if(dataSource == "nasa_aviso" )"""),format.raw/*115.43*/("""{"""),format.raw/*115.44*/("""
     		x.options[18].selected=true;
     	"""),format.raw/*117.7*/("""}"""),format.raw/*117.8*/("""
     	else if(dataSource == "nasa_grace" )"""),format.raw/*118.43*/("""{"""),format.raw/*118.44*/("""
     		x.options[19].selected=true;
     	"""),format.raw/*120.7*/("""}"""),format.raw/*120.8*/("""
     	else if(dataSource == "noaa_nodc" )"""),format.raw/*121.42*/("""{"""),format.raw/*121.43*/("""
     		x.options[20].selected=true;
     	"""),format.raw/*123.7*/("""}"""),format.raw/*123.8*/("""
     	else if(dataSource == "nasa_ceres" )"""),format.raw/*124.43*/("""{"""),format.raw/*124.44*/("""
     		x.options[21].selected=true;
     	"""),format.raw/*126.7*/("""}"""),format.raw/*126.8*/("""
     	else if(dataSource == "nasa_airs" )"""),format.raw/*127.42*/("""{"""),format.raw/*127.43*/("""
     		x.options[22].selected=true;
     	"""),format.raw/*129.7*/("""}"""),format.raw/*129.8*/("""
     	else if(dataSource == "nasa_mls" )"""),format.raw/*130.41*/("""{"""),format.raw/*130.42*/("""
     		x.options[23].selected=true;
     	"""),format.raw/*132.7*/("""}"""),format.raw/*132.8*/("""
     	else if(dataSource == "argo_agro" )"""),format.raw/*133.42*/("""{"""),format.raw/*133.43*/("""
     		x.options[24].selected=true;
     	"""),format.raw/*135.7*/("""}"""),format.raw/*135.8*/("""
     	else if(dataSource == "ecmwf_interim" )"""),format.raw/*136.46*/("""{"""),format.raw/*136.47*/("""
     		x.options[25].selected=true;
     	"""),format.raw/*138.7*/("""}"""),format.raw/*138.8*/("""
    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/("""
    function changeDataSource2()"""),format.raw/*140.33*/("""{"""),format.raw/*140.34*/("""
    	var dataSource = $('#source2').text();
     	var x = document.getElementById("data2");
     	if(dataSource == "cccma_canesm2" )"""),format.raw/*143.41*/("""{"""),format.raw/*143.42*/("""
        x.options[0].selected=true;
      """),format.raw/*145.7*/("""}"""),format.raw/*145.8*/("""
      else if(dataSource == "gfdl_esm2g" )"""),format.raw/*146.43*/("""{"""),format.raw/*146.44*/("""
        x.options[1].selected=true;
      """),format.raw/*148.7*/("""}"""),format.raw/*148.8*/("""
      else if(dataSource == "giss_e2-h" )"""),format.raw/*149.42*/("""{"""),format.raw/*149.43*/("""
        x.options[2].selected=true;
      """),format.raw/*151.7*/("""}"""),format.raw/*151.8*/("""
      else if(dataSource == "giss_e2-r" )"""),format.raw/*152.42*/("""{"""),format.raw/*152.43*/("""
        x.options[3].selected=true;
      """),format.raw/*154.7*/("""}"""),format.raw/*154.8*/("""
      else if(dataSource == "ncar_cam5" )"""),format.raw/*155.42*/("""{"""),format.raw/*155.43*/("""
        x.options[4].selected=true;
      """),format.raw/*157.7*/("""}"""),format.raw/*157.8*/("""
      else if(dataSource == "ncc_noresm" )"""),format.raw/*158.43*/("""{"""),format.raw/*158.44*/("""
        x.options[5].selected=true;
      """),format.raw/*160.7*/("""}"""),format.raw/*160.8*/("""
      else if(dataSource == "ukmo_hadgem2-es" )"""),format.raw/*161.48*/("""{"""),format.raw/*161.49*/("""
        x.options[6].selected=true;
      """),format.raw/*163.7*/("""}"""),format.raw/*163.8*/("""
      else if(dataSource == "cccma_canam4" )"""),format.raw/*164.45*/("""{"""),format.raw/*164.46*/("""
        x.options[7].selected=true;
      """),format.raw/*166.7*/("""}"""),format.raw/*166.8*/("""
      else if(dataSource == "csiro_mk3.6" )"""),format.raw/*167.44*/("""{"""),format.raw/*167.45*/("""
        x.options[8].selected=true;
      """),format.raw/*169.7*/("""}"""),format.raw/*169.8*/("""
      else if(dataSource == "gfdl_cm3" )"""),format.raw/*170.41*/("""{"""),format.raw/*170.42*/("""
        x.options[9].selected=true;
      """),format.raw/*172.7*/("""}"""),format.raw/*172.8*/("""
      else if(dataSource == "ipsl_cm5a-lr" )"""),format.raw/*173.45*/("""{"""),format.raw/*173.46*/("""
        x.options[10].selected=true;
      """),format.raw/*175.7*/("""}"""),format.raw/*175.8*/("""
      else if(dataSource == "miroc_miroc5" )"""),format.raw/*176.45*/("""{"""),format.raw/*176.46*/("""
        x.options[11].selected=true;
      """),format.raw/*178.7*/("""}"""),format.raw/*178.8*/("""
      else if(dataSource == "ukmo_hadgem2-a" )"""),format.raw/*179.47*/("""{"""),format.raw/*179.48*/("""
        x.options[12].selected=true;
      """),format.raw/*181.7*/("""}"""),format.raw/*181.8*/("""
      else if(dataSource == "nasa_modis" )"""),format.raw/*182.43*/("""{"""),format.raw/*182.44*/("""
        x.options[13].selected=true;
      """),format.raw/*184.7*/("""}"""),format.raw/*184.8*/("""
      else if(dataSource == "nasa_amsre" )"""),format.raw/*185.43*/("""{"""),format.raw/*185.44*/("""
        x.options[14].selected=true;
      """),format.raw/*187.7*/("""}"""),format.raw/*187.8*/("""
      else if(dataSource == "nasa_trmm" )"""),format.raw/*188.42*/("""{"""),format.raw/*188.43*/("""
        x.options[15].selected=true;
      """),format.raw/*190.7*/("""}"""),format.raw/*190.8*/("""
      else if(dataSource == "nasa_gpcp" )"""),format.raw/*191.42*/("""{"""),format.raw/*191.43*/("""
        x.options[16].selected=true;
      """),format.raw/*193.7*/("""}"""),format.raw/*193.8*/("""
      else if(dataSource == "nasa_quikscat" )"""),format.raw/*194.46*/("""{"""),format.raw/*194.47*/("""
        x.options[17].selected=true;
      """),format.raw/*196.7*/("""}"""),format.raw/*196.8*/("""
      else if(dataSource == "nasa_aviso" )"""),format.raw/*197.43*/("""{"""),format.raw/*197.44*/("""
        x.options[18].selected=true;
      """),format.raw/*199.7*/("""}"""),format.raw/*199.8*/("""
      else if(dataSource == "nasa_grace" )"""),format.raw/*200.43*/("""{"""),format.raw/*200.44*/("""
        x.options[19].selected=true;
      """),format.raw/*202.7*/("""}"""),format.raw/*202.8*/("""
      else if(dataSource == "noaa_nodc" )"""),format.raw/*203.42*/("""{"""),format.raw/*203.43*/("""
        x.options[20].selected=true;
      """),format.raw/*205.7*/("""}"""),format.raw/*205.8*/("""
      else if(dataSource == "nasa_ceres" )"""),format.raw/*206.43*/("""{"""),format.raw/*206.44*/("""
        x.options[21].selected=true;
      """),format.raw/*208.7*/("""}"""),format.raw/*208.8*/("""
      else if(dataSource == "nasa_airs" )"""),format.raw/*209.42*/("""{"""),format.raw/*209.43*/("""
        x.options[22].selected=true;
      """),format.raw/*211.7*/("""}"""),format.raw/*211.8*/("""
      else if(dataSource == "nasa_mls" )"""),format.raw/*212.41*/("""{"""),format.raw/*212.42*/("""
        x.options[23].selected=true;
      """),format.raw/*214.7*/("""}"""),format.raw/*214.8*/("""
      else if(dataSource == "argo_agro" )"""),format.raw/*215.42*/("""{"""),format.raw/*215.43*/("""
        x.options[24].selected=true;
      """),format.raw/*217.7*/("""}"""),format.raw/*217.8*/("""
      else if(dataSource == "ecmwf_interim" )"""),format.raw/*218.46*/("""{"""),format.raw/*218.47*/("""
        x.options[25].selected=true;
      """),format.raw/*220.7*/("""}"""),format.raw/*220.8*/("""
    """),format.raw/*221.5*/("""}"""),format.raw/*221.6*/("""
    function changeVariableName()"""),format.raw/*222.34*/("""{"""),format.raw/*222.35*/("""
    	var var_string = $('#variableName1').text();
     	var x = document.getElementById("var1");
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
    """),format.raw/*275.5*/("""}"""),format.raw/*275.6*/("""
    function changeVariableName2()"""),format.raw/*276.35*/("""{"""),format.raw/*276.36*/("""
    	var var_string = $('#variableName2').text();
     	var x = document.getElementById("var2");
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
    """),format.raw/*329.5*/("""}"""),format.raw/*329.6*/("""
    function disable_download_button()
    """),format.raw/*331.5*/("""{"""),format.raw/*331.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*334.5*/("""}"""),format.raw/*334.6*/("""
    function enable_download_button()
    """),format.raw/*336.5*/("""{"""),format.raw/*336.6*/("""
      var x=document.getElementById("download_data");
      x.disabled=false;
    """),format.raw/*339.5*/("""}"""),format.raw/*339.6*/("""
    function unset_vars1(ID)
    """),format.raw/*341.5*/("""{"""),format.raw/*341.6*/("""
      var x;
      if (ID == 1) """),format.raw/*343.20*/("""{"""),format.raw/*343.21*/("""
        x=document.getElementById("var1");
      """),format.raw/*345.7*/("""}"""),format.raw/*345.8*/("""
      else if (ID == 2) """),format.raw/*346.25*/("""{"""),format.raw/*346.26*/("""
        x=document.getElementById("var2");
      """),format.raw/*348.7*/("""}"""),format.raw/*348.8*/("""
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
    """),format.raw/*382.5*/("""}"""),format.raw/*382.6*/("""
    function disable_pres1(ID)
    """),format.raw/*384.5*/("""{"""),format.raw/*384.6*/("""
      var x;
      if (ID == 1) """),format.raw/*386.20*/("""{"""),format.raw/*386.21*/("""
        x=document.getElementById("pres1");
      """),format.raw/*388.7*/("""}"""),format.raw/*388.8*/("""
      else if (ID == 2) """),format.raw/*389.25*/("""{"""),format.raw/*389.26*/("""
        x=document.getElementById("pres2");
      """),format.raw/*391.7*/("""}"""),format.raw/*391.8*/("""
      x.value = "N/A";
      x.disabled=true;
    """),format.raw/*394.5*/("""}"""),format.raw/*394.6*/("""
    function enable_pres1(ID)
    """),format.raw/*396.5*/("""{"""),format.raw/*396.6*/("""
      var x;
      if (ID == 1) """),format.raw/*398.20*/("""{"""),format.raw/*398.21*/("""
        x=document.getElementById("pres1");
      """),format.raw/*400.7*/("""}"""),format.raw/*400.8*/("""
      else if (ID == 2) """),format.raw/*401.25*/("""{"""),format.raw/*401.26*/("""
        x=document.getElementById("pres2");
      """),format.raw/*403.7*/("""}"""),format.raw/*403.8*/("""
      x.disabled=false;
    """),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""
    function select_var1(ID)
    """),format.raw/*407.5*/("""{"""),format.raw/*407.6*/("""
      var var_string;
      if (ID == 1) """),format.raw/*409.20*/("""{"""),format.raw/*409.21*/("""
        var_string = $("#var1").val();
      """),format.raw/*411.7*/("""}"""),format.raw/*411.8*/("""
      else if (ID == 2) """),format.raw/*412.25*/("""{"""),format.raw/*412.26*/("""
        var_string = $("#var2").val();
      """),format.raw/*414.7*/("""}"""),format.raw/*414.8*/("""
      disable_download_button();  
      if (var_string == "Total Cloud Fraction") """),format.raw/*416.49*/("""{"""),format.raw/*416.50*/(""" 
        if (ID == 1) """),format.raw/*417.22*/("""{"""),format.raw/*417.23*/("""
          variable1 = "clt";  
        """),format.raw/*419.9*/("""}"""),format.raw/*419.10*/("""
        else if (ID == 2) """),format.raw/*420.27*/("""{"""),format.raw/*420.28*/("""
          variable2 = "clt";  
        """),format.raw/*422.9*/("""}"""),format.raw/*422.10*/("""
        disable_pres1(ID);
      """),format.raw/*424.7*/("""}"""),format.raw/*424.8*/("""
      else if (var_string == "Surface Temperature") """),format.raw/*425.53*/("""{"""),format.raw/*425.54*/("""
        if (ID == 1) """),format.raw/*426.22*/("""{"""),format.raw/*426.23*/("""
          variable1 = "ts";  
        """),format.raw/*428.9*/("""}"""),format.raw/*428.10*/("""
        else if (ID == 2) """),format.raw/*429.27*/("""{"""),format.raw/*429.28*/("""
          variable2 = "ts";  
        """),format.raw/*431.9*/("""}"""),format.raw/*431.10*/("""
        disable_pres1(ID);
      """),format.raw/*433.7*/("""}"""),format.raw/*433.8*/("""
      else if (var_string == "Sea Surface Temperature") """),format.raw/*434.57*/("""{"""),format.raw/*434.58*/(""" 
        if (ID == 1) """),format.raw/*435.22*/("""{"""),format.raw/*435.23*/("""
          variable1 = "tos";  
        """),format.raw/*437.9*/("""}"""),format.raw/*437.10*/("""
        else if (ID == 2) """),format.raw/*438.27*/("""{"""),format.raw/*438.28*/("""
          variable2 = "tos";  
        """),format.raw/*440.9*/("""}"""),format.raw/*440.10*/("""
        disable_pres1(ID);
      """),format.raw/*442.7*/("""}"""),format.raw/*442.8*/("""
      else if (var_string == "Precipitation Flux") """),format.raw/*443.52*/("""{"""),format.raw/*443.53*/(""" 
        if (ID == 1) """),format.raw/*444.22*/("""{"""),format.raw/*444.23*/("""
          variable1 = "pr";  
        """),format.raw/*446.9*/("""}"""),format.raw/*446.10*/("""
        else if (ID == 2) """),format.raw/*447.27*/("""{"""),format.raw/*447.28*/("""
          variable2 = "pr";  
        """),format.raw/*449.9*/("""}"""),format.raw/*449.10*/("""
        disable_pres1(ID);
      """),format.raw/*451.7*/("""}"""),format.raw/*451.8*/("""
      else if (var_string == "Eastward Near-Surface Wind") """),format.raw/*452.60*/("""{"""),format.raw/*452.61*/(""" 
        if (ID == 1) """),format.raw/*453.22*/("""{"""),format.raw/*453.23*/("""
          variable1 = "uas";  
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/("""
        else if (ID == 2) """),format.raw/*456.27*/("""{"""),format.raw/*456.28*/("""
          variable2 = "uas";  
        """),format.raw/*458.9*/("""}"""),format.raw/*458.10*/("""
        disable_pres1(ID);
      """),format.raw/*460.7*/("""}"""),format.raw/*460.8*/("""
      else if (var_string == "Northward Near-Surface Wind") """),format.raw/*461.61*/("""{"""),format.raw/*461.62*/("""  
        if (ID == 1) """),format.raw/*462.22*/("""{"""),format.raw/*462.23*/("""
          variable1 = "vas";  
        """),format.raw/*464.9*/("""}"""),format.raw/*464.10*/("""
        else if (ID == 2) """),format.raw/*465.27*/("""{"""),format.raw/*465.28*/("""
          variable2 = "vas";  
        """),format.raw/*467.9*/("""}"""),format.raw/*467.10*/("""
        disable_pres1(ID);
      """),format.raw/*469.7*/("""}"""),format.raw/*469.8*/("""
      else if (var_string == "Near-Surface Wind Speed") """),format.raw/*470.57*/("""{"""),format.raw/*470.58*/(""" 
        if (ID == 1) """),format.raw/*471.22*/("""{"""),format.raw/*471.23*/("""
          variable1 = "sfcWind";  
        """),format.raw/*473.9*/("""}"""),format.raw/*473.10*/("""
        else if (ID == 2) """),format.raw/*474.27*/("""{"""),format.raw/*474.28*/("""
          variable2 = "sfcWind";  
        """),format.raw/*476.9*/("""}"""),format.raw/*476.10*/("""
        disable_pres1(ID);
      """),format.raw/*478.7*/("""}"""),format.raw/*478.8*/("""
      else if (var_string == "Sea Surface Height") """),format.raw/*479.52*/("""{"""),format.raw/*479.53*/(""" 
        if (ID == 1) """),format.raw/*480.22*/("""{"""),format.raw/*480.23*/("""
          variable1 = "zos";  
        """),format.raw/*482.9*/("""}"""),format.raw/*482.10*/("""
        else if (ID == 2) """),format.raw/*483.27*/("""{"""),format.raw/*483.28*/("""
          variable2 = "zos";  
        """),format.raw/*485.9*/("""}"""),format.raw/*485.10*/("""
        disable_pres1(ID);
      """),format.raw/*487.7*/("""}"""),format.raw/*487.8*/("""
      else if (var_string == "Leaf Area Index") """),format.raw/*488.49*/("""{"""),format.raw/*488.50*/(""" 
        if (ID == 1) """),format.raw/*489.22*/("""{"""),format.raw/*489.23*/("""
          variable1 = "lai";  
        """),format.raw/*491.9*/("""}"""),format.raw/*491.10*/("""
        else if (ID == 2) """),format.raw/*492.27*/("""{"""),format.raw/*492.28*/("""
          variable2 = "lai";  
        """),format.raw/*494.9*/("""}"""),format.raw/*494.10*/("""
        disable_pres1(ID);
      """),format.raw/*496.7*/("""}"""),format.raw/*496.8*/("""
      else if (var_string == "Equivalent Water Height Over Land") """),format.raw/*497.67*/("""{"""),format.raw/*497.68*/("""
        if (ID == 1) """),format.raw/*498.22*/("""{"""),format.raw/*498.23*/("""
          variable1 = "zl";  
        """),format.raw/*500.9*/("""}"""),format.raw/*500.10*/("""
        else if (ID == 2) """),format.raw/*501.27*/("""{"""),format.raw/*501.28*/("""
          variable2 = "zl";  
        """),format.raw/*503.9*/("""}"""),format.raw/*503.10*/("""
        disable_pres1(ID);
      """),format.raw/*505.7*/("""}"""),format.raw/*505.8*/("""
      else if (var_string == "Equivalent Water Height Over Ocean") """),format.raw/*506.68*/("""{"""),format.raw/*506.69*/("""
        if (ID == 1) """),format.raw/*507.22*/("""{"""),format.raw/*507.23*/("""
          variable1 = "zo";
        """),format.raw/*509.9*/("""}"""),format.raw/*509.10*/("""
        else if (ID == 2) """),format.raw/*510.27*/("""{"""),format.raw/*510.28*/("""
          variable2 = "zo";
        """),format.raw/*512.9*/("""}"""),format.raw/*512.10*/("""
        disable_pres1(ID);
      """),format.raw/*514.7*/("""}"""),format.raw/*514.8*/("""
      else if (var_string == "Ocean Heat Content Anomaly within 700 m Depth") """),format.raw/*515.79*/("""{"""),format.raw/*515.80*/("""
        if (ID == 1) """),format.raw/*516.22*/("""{"""),format.raw/*516.23*/("""
          variable1 = "ohc700";
        """),format.raw/*518.9*/("""}"""),format.raw/*518.10*/("""
        else if (ID == 2) """),format.raw/*519.27*/("""{"""),format.raw/*519.28*/("""
          variable2 = "ohc700";
        """),format.raw/*521.9*/("""}"""),format.raw/*521.10*/("""
        disable_pres1(ID);
      """),format.raw/*523.7*/("""}"""),format.raw/*523.8*/("""
      else if (var_string == "Ocean Heat Content Anomaly within 2000 m Depth") """),format.raw/*524.80*/("""{"""),format.raw/*524.81*/("""
        if (ID == 1) """),format.raw/*525.22*/("""{"""),format.raw/*525.23*/("""
          variable1 = "ohc2000";
        """),format.raw/*527.9*/("""}"""),format.raw/*527.10*/("""
        else if (ID == 2) """),format.raw/*528.27*/("""{"""),format.raw/*528.28*/("""
          variable2 = "ohc2000";
        """),format.raw/*530.9*/("""}"""),format.raw/*530.10*/("""
        disable_pres1(ID);
      """),format.raw/*532.7*/("""}"""),format.raw/*532.8*/("""
      else if (var_string == "Surface Downwelling Longwave Radiation") """),format.raw/*533.72*/("""{"""),format.raw/*533.73*/("""
        if (ID == 1) """),format.raw/*534.22*/("""{"""),format.raw/*534.23*/("""
          variable1 = "rlds";
        """),format.raw/*536.9*/("""}"""),format.raw/*536.10*/("""
        else if (ID == 2) """),format.raw/*537.27*/("""{"""),format.raw/*537.28*/("""
          variable2 = "rlds";
        """),format.raw/*539.9*/("""}"""),format.raw/*539.10*/("""
        disable_pres1(ID);
      """),format.raw/*541.7*/("""}"""),format.raw/*541.8*/("""
      else if (var_string == "Surface Downwelling Shortwave Radiation") """),format.raw/*542.73*/("""{"""),format.raw/*542.74*/("""
        if (ID == 1) """),format.raw/*543.22*/("""{"""),format.raw/*543.23*/("""
          variable1 = "rsds";
        """),format.raw/*545.9*/("""}"""),format.raw/*545.10*/("""
        else if (ID == 2) """),format.raw/*546.27*/("""{"""),format.raw/*546.28*/("""
          variable2 = "rsds";
        """),format.raw/*548.9*/("""}"""),format.raw/*548.10*/("""
        disable_pres1(ID);
      """),format.raw/*550.7*/("""}"""),format.raw/*550.8*/("""
      else if (var_string == "Surface Upwelling Longwave Radiation") """),format.raw/*551.70*/("""{"""),format.raw/*551.71*/("""
        if (ID == 1) """),format.raw/*552.22*/("""{"""),format.raw/*552.23*/("""
          variable1 = "rlus";
        """),format.raw/*554.9*/("""}"""),format.raw/*554.10*/("""
        else if (ID == 2) """),format.raw/*555.27*/("""{"""),format.raw/*555.28*/("""
          variable2 = "rlus";
        """),format.raw/*557.9*/("""}"""),format.raw/*557.10*/("""
        disable_pres1(ID);
      """),format.raw/*559.7*/("""}"""),format.raw/*559.8*/("""
      else if (var_string == "Surface Upwelling Shortwave Radiation") """),format.raw/*560.71*/("""{"""),format.raw/*560.72*/("""
        if (ID == 1) """),format.raw/*561.22*/("""{"""),format.raw/*561.23*/("""
          variable1 = "rsus";
        """),format.raw/*563.9*/("""}"""),format.raw/*563.10*/("""
        else if (ID == 2) """),format.raw/*564.27*/("""{"""),format.raw/*564.28*/("""
          variable2 = "rsus";
        """),format.raw/*566.9*/("""}"""),format.raw/*566.10*/("""
        disable_pres1(ID);
      """),format.raw/*568.7*/("""}"""),format.raw/*568.8*/("""
      else if (var_string == "Surface Downwelling Clear-Sky Longwave Radiation") """),format.raw/*569.82*/("""{"""),format.raw/*569.83*/("""
        if (ID == 1) """),format.raw/*570.22*/("""{"""),format.raw/*570.23*/("""
          variable1 = "rldscs";
        """),format.raw/*572.9*/("""}"""),format.raw/*572.10*/("""
        else if (ID == 2) """),format.raw/*573.27*/("""{"""),format.raw/*573.28*/("""
          variable2 = "rldscs";
        """),format.raw/*575.9*/("""}"""),format.raw/*575.10*/("""
        disable_pres1(ID);
      """),format.raw/*577.7*/("""}"""),format.raw/*577.8*/("""
      else if (var_string == "Surface Downwelling Clear-Sky Shortwave Radiation") """),format.raw/*578.83*/("""{"""),format.raw/*578.84*/("""
        if (ID == 1) """),format.raw/*579.22*/("""{"""),format.raw/*579.23*/("""
          variable1 = "rsdscs";
        """),format.raw/*581.9*/("""}"""),format.raw/*581.10*/("""
        else if (ID == 2) """),format.raw/*582.27*/("""{"""),format.raw/*582.28*/("""
          variable2 = "rsdscs";
        """),format.raw/*584.9*/("""}"""),format.raw/*584.10*/("""
        disable_pres1(ID);
      """),format.raw/*586.7*/("""}"""),format.raw/*586.8*/("""
      else if (var_string == "Surface Upwelling Clear-Sky Shortwave Radiation") """),format.raw/*587.81*/("""{"""),format.raw/*587.82*/("""
        if (ID == 1) """),format.raw/*588.22*/("""{"""),format.raw/*588.23*/("""
          variable1 = "rsuscs";
        """),format.raw/*590.9*/("""}"""),format.raw/*590.10*/("""
        else if (ID == 2) """),format.raw/*591.27*/("""{"""),format.raw/*591.28*/("""
          variable2 = "rsuscs";
        """),format.raw/*593.9*/("""}"""),format.raw/*593.10*/("""
        disable_pres1(ID);
      """),format.raw/*595.7*/("""}"""),format.raw/*595.8*/("""
      else if (var_string == "TOA Incident Shortwave Radiation") """),format.raw/*596.66*/("""{"""),format.raw/*596.67*/("""
        if (ID == 1) """),format.raw/*597.22*/("""{"""),format.raw/*597.23*/("""
          variable1 = "rsdt";
        """),format.raw/*599.9*/("""}"""),format.raw/*599.10*/("""
        else if (ID == 2) """),format.raw/*600.27*/("""{"""),format.raw/*600.28*/("""
          variable2 = "rsdt";
        """),format.raw/*602.9*/("""}"""),format.raw/*602.10*/("""
        disable_pres1(ID);
      """),format.raw/*604.7*/("""}"""),format.raw/*604.8*/("""
      else if (var_string == "TOA Outgoing Clear-Sky Longwave Radiation") """),format.raw/*605.75*/("""{"""),format.raw/*605.76*/("""
        if (ID == 1) """),format.raw/*606.22*/("""{"""),format.raw/*606.23*/("""
          variable1 = "rlutcs";
        """),format.raw/*608.9*/("""}"""),format.raw/*608.10*/("""
        else if (ID == 2) """),format.raw/*609.27*/("""{"""),format.raw/*609.28*/("""
          variable2 = "rlutcs";
        """),format.raw/*611.9*/("""}"""),format.raw/*611.10*/("""
        disable_pres1(ID);
      """),format.raw/*613.7*/("""}"""),format.raw/*613.8*/("""
      else if (var_string == "TOA Outgoing Longwave Radiation") """),format.raw/*614.65*/("""{"""),format.raw/*614.66*/("""
        if (ID == 1) """),format.raw/*615.22*/("""{"""),format.raw/*615.23*/("""
          variable1 = "rlut";
        """),format.raw/*617.9*/("""}"""),format.raw/*617.10*/("""
        else if (ID == 2) """),format.raw/*618.27*/("""{"""),format.raw/*618.28*/("""
          variable2 = "rlut";
        """),format.raw/*620.9*/("""}"""),format.raw/*620.10*/("""
        disable_pres1(ID);
      """),format.raw/*622.7*/("""}"""),format.raw/*622.8*/("""
      else if (var_string == "TOA Outgoing Clear-Sky Shortwave Radiation") """),format.raw/*623.76*/("""{"""),format.raw/*623.77*/("""
        if (ID == 1) """),format.raw/*624.22*/("""{"""),format.raw/*624.23*/("""
          variable1 = "rsutcs";
        """),format.raw/*626.9*/("""}"""),format.raw/*626.10*/("""
        else if (ID == 2) """),format.raw/*627.27*/("""{"""),format.raw/*627.28*/("""
          variable2 = "rsutcs";
        """),format.raw/*629.9*/("""}"""),format.raw/*629.10*/("""
        disable_pres1(ID);
      """),format.raw/*631.7*/("""}"""),format.raw/*631.8*/("""
      else if (var_string == "TOA Outgoing Shortwave Radiation") """),format.raw/*632.66*/("""{"""),format.raw/*632.67*/("""
        if (ID == 1) """),format.raw/*633.22*/("""{"""),format.raw/*633.23*/("""
          variable1 = "rsut";
        """),format.raw/*635.9*/("""}"""),format.raw/*635.10*/("""
        else if (ID == 2) """),format.raw/*636.27*/("""{"""),format.raw/*636.28*/("""
          variable2 = "rsut";
        """),format.raw/*638.9*/("""}"""),format.raw/*638.10*/("""
        disable_pres1(ID);
      """),format.raw/*640.7*/("""}"""),format.raw/*640.8*/("""
      else if (var_string == "Air Temperature") """),format.raw/*641.49*/("""{"""),format.raw/*641.50*/("""
        if (ID == 1) """),format.raw/*642.22*/("""{"""),format.raw/*642.23*/("""
          variable1 = "ta";
        """),format.raw/*644.9*/("""}"""),format.raw/*644.10*/("""
        else if (ID == 2) """),format.raw/*645.27*/("""{"""),format.raw/*645.28*/("""
          variable2 = "ta";
        """),format.raw/*647.9*/("""}"""),format.raw/*647.10*/("""
        enable_pres1(ID);
      """),format.raw/*649.7*/("""}"""),format.raw/*649.8*/("""
      else if (var_string == "Specific Humidity") """),format.raw/*650.51*/("""{"""),format.raw/*650.52*/("""
        if (ID == 1) """),format.raw/*651.22*/("""{"""),format.raw/*651.23*/("""
          variable1 = "hus";
        """),format.raw/*653.9*/("""}"""),format.raw/*653.10*/("""
        else if (ID == 2) """),format.raw/*654.27*/("""{"""),format.raw/*654.28*/("""
          variable2 = "hus";
        """),format.raw/*656.9*/("""}"""),format.raw/*656.10*/("""
        enable_pres1(ID);
      """),format.raw/*658.7*/("""}"""),format.raw/*658.8*/("""
      else if (var_string == "Cloud Ice Water Content") """),format.raw/*659.57*/("""{"""),format.raw/*659.58*/("""
        if (ID == 1) """),format.raw/*660.22*/("""{"""),format.raw/*660.23*/("""
          variable1 = "cli";
        """),format.raw/*662.9*/("""}"""),format.raw/*662.10*/("""
        else if (ID == 2) """),format.raw/*663.27*/("""{"""),format.raw/*663.28*/("""
          variable2 = "cli";
        """),format.raw/*665.9*/("""}"""),format.raw/*665.10*/("""
        enable_pres1(ID);
      """),format.raw/*667.7*/("""}"""),format.raw/*667.8*/("""
      else if (var_string == "Cloud Liquid Water Content") """),format.raw/*668.60*/("""{"""),format.raw/*668.61*/("""
        if (ID == 1) """),format.raw/*669.22*/("""{"""),format.raw/*669.23*/("""
          variable1 = "clw";
        """),format.raw/*671.9*/("""}"""),format.raw/*671.10*/("""
        else if (ID == 2) """),format.raw/*672.27*/("""{"""),format.raw/*672.28*/("""
          variable2 = "clw";
        """),format.raw/*674.9*/("""}"""),format.raw/*674.10*/("""
        enable_pres1(ID);
      """),format.raw/*676.7*/("""}"""),format.raw/*676.8*/("""
      else if (var_string == "Ocean Temperature") """),format.raw/*677.51*/("""{"""),format.raw/*677.52*/("""
        if (ID == 1) """),format.raw/*678.22*/("""{"""),format.raw/*678.23*/("""
          variable1 = "ot";
        """),format.raw/*680.9*/("""}"""),format.raw/*680.10*/("""
        else if (ID == 2) """),format.raw/*681.27*/("""{"""),format.raw/*681.28*/("""
          variable2 = "ot";
        """),format.raw/*683.9*/("""}"""),format.raw/*683.10*/("""
        enable_pres1(ID);
      """),format.raw/*685.7*/("""}"""),format.raw/*685.8*/("""
      else if (var_string == "Ocean Salinity") """),format.raw/*686.48*/("""{"""),format.raw/*686.49*/("""
        if (ID == 1) """),format.raw/*687.22*/("""{"""),format.raw/*687.23*/("""
          variable1 = "os";
        """),format.raw/*689.9*/("""}"""),format.raw/*689.10*/("""
        else if (ID == 2) """),format.raw/*690.27*/("""{"""),format.raw/*690.28*/("""
          variable2 = "os";
        """),format.raw/*692.9*/("""}"""),format.raw/*692.10*/("""
        enable_pres1(ID);
      """),format.raw/*694.7*/("""}"""),format.raw/*694.8*/("""
      else if (var_string == "Vertical Wind Velocity") """),format.raw/*695.56*/("""{"""),format.raw/*695.57*/("""
        if (ID == 1) """),format.raw/*696.22*/("""{"""),format.raw/*696.23*/("""
          variable1 = "wap";
        """),format.raw/*698.9*/("""}"""),format.raw/*698.10*/("""
        else if (ID == 2) """),format.raw/*699.27*/("""{"""),format.raw/*699.28*/("""
          variable2 = "wap";
        """),format.raw/*701.9*/("""}"""),format.raw/*701.10*/("""
        enable_pres1(ID);
      """),format.raw/*703.7*/("""}"""),format.raw/*703.8*/("""
      else if (var_string == "Relative Humidity") """),format.raw/*704.51*/("""{"""),format.raw/*704.52*/("""
        if (ID == 1) """),format.raw/*705.22*/("""{"""),format.raw/*705.23*/("""
          variable1 = "hur";
        """),format.raw/*707.9*/("""}"""),format.raw/*707.10*/("""
        else if (ID == 2) """),format.raw/*708.27*/("""{"""),format.raw/*708.28*/("""
          variable2 = "hur";
        """),format.raw/*710.9*/("""}"""),format.raw/*710.10*/("""
        enable_pres1(ID);
      """),format.raw/*712.7*/("""}"""),format.raw/*712.8*/("""
    """),format.raw/*713.5*/("""}"""),format.raw/*713.6*/("""
    function select_data1(ID)
    """),format.raw/*715.5*/("""{"""),format.raw/*715.6*/("""
      var data_string;
      var x;
      if (ID == 1) """),format.raw/*718.20*/("""{"""),format.raw/*718.21*/("""
        data_string = $("#data1").val();
        x = document.getElementById("var1");
      """),format.raw/*721.7*/("""}"""),format.raw/*721.8*/("""
      else if (ID == 2) """),format.raw/*722.25*/("""{"""),format.raw/*722.26*/("""
        data_string = $("#data2").val();
        x = document.getElementById("var2");
      """),format.raw/*725.7*/("""}"""),format.raw/*725.8*/("""
      disable_download_button();
      if (data_string == "NASA/AMSRE") """),format.raw/*727.40*/("""{"""),format.raw/*727.41*/("""
        unset_vars1(ID); 
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
      """),format.raw/*732.7*/("""}"""),format.raw/*732.8*/("""
      else if (data_string == "NASA/MODIS") """),format.raw/*733.45*/("""{"""),format.raw/*733.46*/("""
        unset_vars1(ID);
        x.options[1].selected=true;
        disable_pres1(ID); 
        x.options[1].disabled=false;
        x.options[8].disabled=false;
      """),format.raw/*739.7*/("""}"""),format.raw/*739.8*/("""
      else if (data_string == "NASA/TRMM") """),format.raw/*740.44*/("""{"""),format.raw/*740.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*745.7*/("""}"""),format.raw/*745.8*/("""
      else if (data_string == "NASA/GPCP") """),format.raw/*746.44*/("""{"""),format.raw/*746.45*/("""
        unset_vars1(ID);
        x.options[0].selected=true;
        disable_pres1(ID); 
        x.options[0].disabled=false;
      """),format.raw/*751.7*/("""}"""),format.raw/*751.8*/("""
      else if (data_string == "NASA/QuikSCAT") """),format.raw/*752.48*/("""{"""),format.raw/*752.49*/("""
        unset_vars1(ID);
        x.options[4].selected=true;
        disable_pres1(ID); 
        x.options[4].disabled=false;
        x.options[5].disabled=false;
        x.options[6].disabled=false;
      """),format.raw/*759.7*/("""}"""),format.raw/*759.8*/("""
      else if (data_string == "NASA/AVISO") """),format.raw/*760.45*/("""{"""),format.raw/*760.46*/("""
        unset_vars1(ID);
        x.options[7].selected=true;
        disable_pres1(ID); 
        x.options[7].disabled=false;
      """),format.raw/*765.7*/("""}"""),format.raw/*765.8*/("""
      else if (data_string == "NASA/GRACE") """),format.raw/*766.45*/("""{"""),format.raw/*766.46*/("""
        unset_vars1(ID);
        x.options[9].selected=true;
        disable_pres1(ID); 
        x.options[9].disabled=false;
        x.options[10].disabled=false;
      """),format.raw/*772.7*/("""}"""),format.raw/*772.8*/("""
      else if (data_string == "NOAA/NODC") """),format.raw/*773.44*/("""{"""),format.raw/*773.45*/("""
        unset_vars1(ID);
        x.options[11].selected=true;
        disable_pres1(ID); 
        x.options[11].disabled=false;
        x.options[12].disabled=false;
      """),format.raw/*779.7*/("""}"""),format.raw/*779.8*/("""
      else if (data_string == "NASA/CERES") """),format.raw/*780.45*/("""{"""),format.raw/*780.46*/("""
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
      """),format.raw/*796.7*/("""}"""),format.raw/*796.8*/("""
      else if (data_string == "NASA/AIRS") """),format.raw/*797.44*/("""{"""),format.raw/*797.45*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*803.7*/("""}"""),format.raw/*803.8*/("""
      else if (data_string == "NASA/MLS") """),format.raw/*804.43*/("""{"""),format.raw/*804.44*/("""
        unset_vars1(ID);
        x.options[25].selected=true;
        enable_pres1(ID); 
        x.options[25].disabled=false;
        x.options[26].disabled=false;
      """),format.raw/*810.7*/("""}"""),format.raw/*810.8*/("""
      else if (data_string == "ARGO/ARGO") """),format.raw/*811.44*/("""{"""),format.raw/*811.45*/("""
        unset_vars1(ID);
        x.options[29].selected=true;
        enable_pres1(ID); 
        x.options[29].disabled=false;
        x.options[30].disabled=false;
      """),format.raw/*817.7*/("""}"""),format.raw/*817.8*/("""
      else if (data_string == "CCCMA/CANAM4") """),format.raw/*818.47*/("""{"""),format.raw/*818.48*/("""
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
      """),format.raw/*844.7*/("""}"""),format.raw/*844.8*/("""
      else if (data_string == "CSIRO/MK3.6") """),format.raw/*845.46*/("""{"""),format.raw/*845.47*/("""
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
      """),format.raw/*873.7*/("""}"""),format.raw/*873.8*/("""
      else if (data_string == "NCAR/CAM5") """),format.raw/*874.44*/("""{"""),format.raw/*874.45*/("""
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
      """),format.raw/*904.7*/("""}"""),format.raw/*904.8*/("""
      else if (data_string == "CCCMA/CANESM2" || data_string == "GFDL/ESM2G" ||
               data_string == "GISS/E2-H" || data_string == "GISS/E2-R" ||
               data_string == "NCC/NORESM" ||
               data_string == "UKMO/HadGEM2-ES" ||
               data_string == "GFDL/CM3" || data_string == "IPSL/CM5A-LR" ||
               data_string == "MIROC/MIROC5" || data_string == "UKMO/HadGEM2-A"
              ) """),format.raw/*911.17*/("""{"""),format.raw/*911.18*/("""
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
      """),format.raw/*942.7*/("""}"""),format.raw/*942.8*/("""
      else if (data_string == "ECMWF/interim") """),format.raw/*943.48*/("""{"""),format.raw/*943.49*/("""
        unset_vars1(ID);
        x.options[3].selected=true;
        disable_pres1(ID); 
        x.options[3].disabled=false;
        x.options[31].disabled=false;
        x.options[32].disabled=false;
      """),format.raw/*950.7*/("""}"""),format.raw/*950.8*/("""
      select_var1(ID);
    """),format.raw/*952.5*/("""}"""),format.raw/*952.6*/("""
    $(document).ready(function()"""),format.raw/*953.33*/("""{"""),format.raw/*953.34*/("""
      $("#download_data").click(function(event) """),format.raw/*954.49*/("""{"""),format.raw/*954.50*/("""
        var durl = $("#data_url").val();
        window.location.assign(durl);
      """),format.raw/*957.7*/("""}"""),format.raw/*957.8*/(""");
      $("#scatterPlot2V").click(function(event) """),format.raw/*958.49*/("""{"""),format.raw/*958.50*/("""
        Response = null;
        disable_download_button();
        $("#Response").html("Calculating ...");
        $("#data_url").html("Calculating ...");
        $("#Image").html("");
        var url = "http://" + window.location.hostname + ":9002/svc/scatterPlot2V?";
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
        var nSample = $("#nSample").val();
        arglist = arglist.concat("&nSample=");
        arglist = arglist.concat(nSample);
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
        $.ajax("""),format.raw/*1028.16*/("""{"""),format.raw/*1028.17*/("""
            type: "GET",
            url: urlTimeBounds,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1033.54*/("""{"""),format.raw/*1033.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1035.44*/("""{"""),format.raw/*1035.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1042.17*/("""}"""),format.raw/*1042.18*/("""
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
                if (lowerT1 == 0  || upperT1 == 0)"""),format.raw/*1055.51*/("""{"""),format.raw/*1055.52*/(""" 
                  alert("We do not have data for the data-1 source and variable configuration.");
                  return;
                """),format.raw/*1058.17*/("""}"""),format.raw/*1058.18*/("""
                else if (lowerT2 == 0  || upperT2 == 0)"""),format.raw/*1059.56*/("""{"""),format.raw/*1059.57*/(""" 
                  alert("We do not have data for the data-2 source and variable configuration.");
                  return;
                """),format.raw/*1062.17*/("""}"""),format.raw/*1062.18*/("""
                else if (lowerT2 > upperT1 || lowerT1 > upperT2) """),format.raw/*1063.66*/("""{"""),format.raw/*1063.67*/(""" 
                  alert("The two data sets/vars do not have a common time range.");
                  return;
                """),format.raw/*1066.17*/("""}"""),format.raw/*1066.18*/("""
                else """),format.raw/*1067.22*/("""{"""),format.raw/*1067.23*/(""" 
                  if (lowerT1 > lowerT2) """),format.raw/*1068.42*/("""{"""),format.raw/*1068.43*/(""" 
                    lowerT = lowerT1;
                  """),format.raw/*1070.19*/("""}"""),format.raw/*1070.20*/("""
                  else """),format.raw/*1071.24*/("""{"""),format.raw/*1071.25*/("""
                    lowerT = lowerT2;
                  """),format.raw/*1073.19*/("""}"""),format.raw/*1073.20*/("""
                  if (upperT1 > upperT2) """),format.raw/*1074.42*/("""{"""),format.raw/*1074.43*/(""" 
                    upperT = upperT2;
                  """),format.raw/*1076.19*/("""}"""),format.raw/*1076.20*/("""
                  else """),format.raw/*1077.24*/("""{"""),format.raw/*1077.25*/("""
                    upperT = upperT1;
                  """),format.raw/*1079.19*/("""}"""),format.raw/*1079.20*/("""
                """),format.raw/*1080.17*/("""}"""),format.raw/*1080.18*/("""
                if (t0I < lowerT && t1I < lowerT ||
                    t0I > upperT && t1I > upperT) """),format.raw/*1082.51*/("""{"""),format.raw/*1082.52*/("""
                  alert("We do not have data that span your time range. Try the range inside ["+lowerT+", "+upperT+"].");
                  return;
                """),format.raw/*1085.17*/("""}"""),format.raw/*1085.18*/("""
                if (t0I < lowerT && t1I <= upperT) """),format.raw/*1086.52*/("""{"""),format.raw/*1086.53*/("""
                  alert("Your start year-month is out of bound. It has to be in or later than " + lowerT +
                        ". We will use the range ["+lowerT+", "+t1I+"] for you.");
                """),format.raw/*1089.17*/("""}"""),format.raw/*1089.18*/("""
                if (t1I > upperT && t0I >= lowerT) """),format.raw/*1090.52*/("""{"""),format.raw/*1090.53*/("""
                  alert("Your end year-month is out of bound. It has to be in or earlier than " + upperT +
                        ". We will use the range ["+t0I+", "+upperT+"] for you.");
                """),format.raw/*1093.17*/("""}"""),format.raw/*1093.18*/("""
                if (t0I < lowerT && t1I > upperT ) """),format.raw/*1094.52*/("""{"""),format.raw/*1094.53*/("""
                  alert("Both of your start and end year-months are out of bounds. They have to be in or earlier than " + upperT +
                        ", and in or later than " + lowerT + ". We will use the range ["+lowerT+", "+upperT+"] for you.");
                """),format.raw/*1097.17*/("""}"""),format.raw/*1097.18*/("""
            """),format.raw/*1098.13*/("""}"""),format.raw/*1098.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1099.59*/("""{"""),format.raw/*1099.60*/("""
		$("#Response").html("error!");
		$("#data_url").html("error!");
            """),format.raw/*1102.13*/("""}"""),format.raw/*1102.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1103.49*/("""{"""),format.raw/*1103.50*/("""
            """),format.raw/*1104.13*/("""}"""),format.raw/*1104.14*/("""
        """),format.raw/*1105.9*/("""}"""),format.raw/*1105.10*/(""");
        $.ajax("""),format.raw/*1106.16*/("""{"""),format.raw/*1106.17*/("""
            type: "GET",
            url: url,
            dataType: "json",
            data: null,
            success: function(data, textStatus, xhr) """),format.raw/*1111.54*/("""{"""),format.raw/*1111.55*/("""
                Response = data;
                if (data.success == false) """),format.raw/*1113.44*/("""{"""),format.raw/*1113.45*/("""
                    Response = null;
                    var text = JSON.stringify(data, null, 4);
                    if (text.indexOf("No Data") != -1) """),format.raw/*1116.56*/("""{"""),format.raw/*1116.57*/("""
                      $("#Image").html("No Data");
                      $("#Response").html("No Data");
                      $("#data_url").html("No Data");
                      return;
                    """),format.raw/*1121.21*/("""}"""),format.raw/*1121.22*/("""
                    text = "Error in backend: <br>" + text; 
                    $("#Response").html(text);
                    $("#data_url").html(text);
                    return;
                """),format.raw/*1126.17*/("""}"""),format.raw/*1126.18*/("""
                var text = JSON.stringify(data, null, 4);
                $("#Response").html(text);
                var html = "<img src='"+data.url+"' width='820'/>";
                $("#Image").html(html);
                $("#data_url").html(data.dataUrl);
                enable_download_button();
            """),format.raw/*1133.13*/("""}"""),format.raw/*1133.14*/(""",
            error: function(xhr, textStatus, errorThrown) """),format.raw/*1134.59*/("""{"""),format.raw/*1134.60*/("""
                $("#Response").html("error!");
                $("#data_url").html("error!");
            """),format.raw/*1137.13*/("""}"""),format.raw/*1137.14*/(""",
            complete: function(xhr, textStatus) """),format.raw/*1138.49*/("""{"""),format.raw/*1138.50*/("""
            """),format.raw/*1139.13*/("""}"""),format.raw/*1139.14*/("""
        """),format.raw/*1140.9*/("""}"""),format.raw/*1140.10*/(""");
      """),format.raw/*1141.7*/("""}"""),format.raw/*1141.8*/(""");
    """),format.raw/*1142.5*/("""}"""),format.raw/*1142.6*/(""");
    </script>
""")))};
Seq[Any](format.raw/*18.47*/(""" """),format.raw/*19.1*/("""<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/livefitler.css"))),format.raw/*20.55*/("""'>
"""),format.raw/*1144.2*/(""" """),_display_(Seq[Any](/*1144.4*/main("Service 19", scripts)/*1144.31*/{_display_(Seq[Any](format.raw/*1144.32*/(""" """),_display_(Seq[Any](/*1144.34*/flash_message())),format.raw/*1144.49*/("""
<p>
<div id="source1" style="display: none;">"""),_display_(Seq[Any](/*1146.43*/parameters/*1146.53*/.getSource1())),format.raw/*1146.66*/("""</div>
<div id="variableName1" style="display: none;">"""),_display_(Seq[Any](/*1147.49*/parameters/*1147.59*/.getVaribaleName1())),format.raw/*1147.78*/("""</div>
<div id="pressureLevel1" style="display: none;">"""),_display_(Seq[Any](/*1148.50*/parameters/*1148.60*/.getPressureLevel1())),format.raw/*1148.80*/("""</div>
<div id="startYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1149.50*/parameters/*1149.60*/.getStartYear())),format.raw/*1149.75*/("""</div>
<div id="startLat" style="display: none;">"""),_display_(Seq[Any](/*1150.44*/parameters/*1150.54*/.getStartLat())),format.raw/*1150.68*/("""</div>
<div id="startLon" style="display: none;">"""),_display_(Seq[Any](/*1151.44*/parameters/*1151.54*/.getStartLon())),format.raw/*1151.68*/("""</div>
<div id="source2" style="display: none;">"""),_display_(Seq[Any](/*1152.43*/parameters/*1152.53*/.getSource2())),format.raw/*1152.66*/("""</div>
<div id="variableName2" style="display: none;">"""),_display_(Seq[Any](/*1153.49*/parameters/*1153.59*/.getVaribaleName2())),format.raw/*1153.78*/("""</div>
<div id="pressureLevel2" style="display: none;">"""),_display_(Seq[Any](/*1154.50*/parameters/*1154.60*/.getPressureLevel2())),format.raw/*1154.80*/("""</div>
<div id="endYearMonth" style="display: none;">"""),_display_(Seq[Any](/*1155.48*/parameters/*1155.58*/.getEndYear())),format.raw/*1155.71*/("""</div>
<div id="endLat" style="display: none;">"""),_display_(Seq[Any](/*1156.42*/parameters/*1156.52*/.getEndLat())),format.raw/*1156.64*/("""</div>
<div id="endLon" style="display: none;">"""),_display_(Seq[Any](/*1157.42*/parameters/*1157.52*/.getEndLon())),format.raw/*1157.64*/("""</div>
<div id="samples" style="display: none;">"""),_display_(Seq[Any](/*1158.43*/parameters/*1158.53*/.getSamples())),format.raw/*1158.66*/("""</div>
<div id="executionPurpose" style="display: none;">"""),_display_(Seq[Any](/*1159.52*/parameters/*1159.62*/.getExecutionPurpose())),format.raw/*1159.84*/("""</div>
<div id="image" style="display: none;">"""),_display_(Seq[Any](/*1160.41*/parameters/*1160.51*/.getImage())),format.raw/*1160.62*/("""</div>
<div id="dataURL" style="display: none;">"""),_display_(Seq[Any](/*1161.43*/parameters/*1161.53*/.getDataUrl())),format.raw/*1161.66*/("""</div>
<div id="serviceResponseText" style="display: none;">"""),_display_(Seq[Any](/*1162.55*/parameters/*1162.65*/.getServiceResponse())),format.raw/*1162.86*/("""</div>
<table border="1" align="center">
	<tr>
		<td colspan="4">
			<center>
				<b>Service: Scatter and Histogram Plot of Two Variables</b><br>
				<br> This service generates a scatter plot between two
				specified variables and the histograms of the two variables, and
				calculates the correlation of the two variables. The two variables
				can be either a two-dimensional variable or a slice of a
				three-dimensional variable at a specific pressure level. The number
				of samples used for this analysis should be specified. <br>
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
		<td><input id="t0" value="2004-01" alt="start" /></td>
		<td>end year-month:</td>
		<td><input id="t1" value="2004-12" alt="end" /></td>
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
		<td>number of samples:</td>
		<td><input id="nSample" value="500" /></td>
	</tr>
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
				cols="130" rows="2">Data URL Here</textarea></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><textarea id="Response" cols="130"
				rows="6">Service Response Text Here</textarea></td>
	</tr>
</table>
""")))})),format.raw/*1402.2*/("""
"""))}
    }
    
    def render(parameters:metadata.ScatterHistogramTwoVar): play.api.templates.HtmlFormat.Appendable = apply(parameters)
    
    def f:((metadata.ScatterHistogramTwoVar) => play.api.templates.HtmlFormat.Appendable) = (parameters) => apply(parameters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:50 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/scatterAndHistogramTwoVariable.scala.html
                    HASH: d50e3f88db34cb3dda1a5ba67541c3397385a793
                    MATRIX: 3227->1205|3366->1349|3381->1356|3466->1360|3517->1375|3532->1381|3594->1421|3656->1447|3671->1453|3732->1492|3817->1542|3832->1548|3899->1593|4103->1761|4118->1767|4174->1801|4259->1850|4274->1856|4330->1890|4503->2035|4532->2036|5403->2880|5431->2881|5491->2913|5520->2914|5681->3047|5710->3048|5779->3090|5807->3091|5878->3134|5907->3135|5976->3177|6004->3178|6074->3220|6103->3221|6172->3263|6200->3264|6270->3306|6299->3307|6368->3349|6396->3350|6466->3392|6495->3393|6564->3435|6592->3436|6663->3479|6692->3480|6761->3522|6789->3523|6865->3571|6894->3572|6963->3614|6991->3615|7064->3660|7093->3661|7162->3703|7190->3704|7262->3748|7291->3749|7360->3791|7388->3792|7457->3833|7486->3834|7555->3876|7583->3877|7656->3922|7685->3923|7755->3966|7783->3967|7856->4012|7885->4013|7955->4056|7983->4057|8058->4104|8087->4105|8157->4148|8185->4149|8257->4192|8287->4193|8358->4236|8387->4237|8459->4280|8489->4281|8560->4324|8589->4325|8660->4367|8690->4368|8761->4411|8790->4412|8861->4454|8891->4455|8962->4498|8991->4499|9066->4545|9096->4546|9167->4589|9196->4590|9268->4633|9298->4634|9369->4677|9398->4678|9470->4721|9500->4722|9571->4765|9600->4766|9671->4808|9701->4809|9772->4852|9801->4853|9873->4896|9903->4897|9974->4940|10003->4941|10074->4983|10104->4984|10175->5027|10204->5028|10274->5069|10304->5070|10375->5113|10404->5114|10475->5156|10505->5157|10576->5200|10605->5201|10680->5247|10710->5248|10781->5291|10810->5292|10843->5297|10872->5298|10934->5331|10964->5332|11126->5465|11156->5466|11227->5509|11256->5510|11328->5553|11358->5554|11429->5597|11458->5598|11529->5640|11559->5641|11630->5684|11659->5685|11730->5727|11760->5728|11831->5771|11860->5772|11931->5814|11961->5815|12032->5858|12061->5859|12133->5902|12163->5903|12234->5946|12263->5947|12340->5995|12370->5996|12441->6039|12470->6040|12544->6085|12574->6086|12645->6129|12674->6130|12747->6174|12777->6175|12848->6218|12877->6219|12947->6260|12977->6261|13048->6304|13077->6305|13151->6350|13181->6351|13253->6395|13282->6396|13356->6441|13386->6442|13458->6486|13487->6487|13563->6534|13593->6535|13665->6579|13694->6580|13766->6623|13796->6624|13868->6668|13897->6669|13969->6712|13999->6713|14071->6757|14100->6758|14171->6800|14201->6801|14273->6845|14302->6846|14373->6888|14403->6889|14475->6933|14504->6934|14579->6980|14609->6981|14681->7025|14710->7026|14782->7069|14812->7070|14884->7114|14913->7115|14985->7158|15015->7159|15087->7203|15116->7204|15187->7246|15217->7247|15289->7291|15318->7292|15390->7335|15420->7336|15492->7380|15521->7381|15592->7423|15622->7424|15694->7468|15723->7469|15793->7510|15823->7511|15895->7555|15924->7556|15995->7598|16025->7599|16097->7643|16126->7644|16201->7690|16231->7691|16303->7735|16332->7736|16365->7741|16394->7742|16457->7776|16487->7777|18527->9789|18556->9790|18620->9825|18650->9826|20690->11838|20719->11839|20791->11883|20820->11884|20931->11967|20960->11968|21031->12011|21060->12012|21171->12095|21200->12096|21262->12130|21291->12131|21353->12164|21383->12165|21461->12215|21490->12216|21544->12241|21574->12242|21652->12292|21681->12293|22859->13443|22888->13444|22952->13480|22981->13481|23043->13514|23073->13515|23152->13566|23181->13567|23235->13592|23265->13593|23344->13644|23373->13645|23452->13696|23481->13697|23544->13732|23573->13733|23635->13766|23665->13767|23744->13818|23773->13819|23827->13844|23857->13845|23936->13896|23965->13897|24022->13926|24051->13927|24113->13961|24142->13962|24213->14004|24243->14005|24317->14051|24346->14052|24400->14077|24430->14078|24504->14124|24533->14125|24646->14209|24676->14210|24728->14233|24758->14234|24826->14274|24856->14275|24912->14302|24942->14303|25010->14343|25040->14344|25102->14378|25131->14379|25213->14432|25243->14433|25294->14455|25324->14456|25391->14495|25421->14496|25477->14523|25507->14524|25574->14563|25604->14564|25666->14598|25695->14599|25781->14656|25811->14657|25863->14680|25893->14681|25961->14721|25991->14722|26047->14749|26077->14750|26145->14790|26175->14791|26237->14825|26266->14826|26347->14878|26377->14879|26429->14902|26459->14903|26526->14942|26556->14943|26612->14970|26642->14971|26709->15010|26739->15011|26801->15045|26830->15046|26919->15106|26949->15107|27001->15130|27031->15131|27099->15171|27129->15172|27185->15199|27215->15200|27283->15240|27313->15241|27375->15275|27404->15276|27494->15337|27524->15338|27577->15362|27607->15363|27675->15403|27705->15404|27761->15431|27791->15432|27859->15472|27889->15473|27951->15507|27980->15508|28066->15565|28096->15566|28148->15589|28178->15590|28250->15634|28280->15635|28336->15662|28366->15663|28438->15707|28468->15708|28530->15742|28559->15743|28640->15795|28670->15796|28722->15819|28752->15820|28820->15860|28850->15861|28906->15888|28936->15889|29004->15929|29034->15930|29096->15964|29125->15965|29203->16014|29233->16015|29285->16038|29315->16039|29383->16079|29413->16080|29469->16107|29499->16108|29567->16148|29597->16149|29659->16183|29688->16184|29784->16251|29814->16252|29865->16274|29895->16275|29962->16314|29992->16315|30048->16342|30078->16343|30145->16382|30175->16383|30237->16417|30266->16418|30363->16486|30393->16487|30444->16509|30474->16510|30539->16547|30569->16548|30625->16575|30655->16576|30720->16613|30750->16614|30812->16648|30841->16649|30949->16728|30979->16729|31030->16751|31060->16752|31129->16793|31159->16794|31215->16821|31245->16822|31314->16863|31344->16864|31406->16898|31435->16899|31544->16979|31574->16980|31625->17002|31655->17003|31725->17045|31755->17046|31811->17073|31841->17074|31911->17116|31941->17117|32003->17151|32032->17152|32133->17224|32163->17225|32214->17247|32244->17248|32311->17287|32341->17288|32397->17315|32427->17316|32494->17355|32524->17356|32586->17390|32615->17391|32717->17464|32747->17465|32798->17487|32828->17488|32895->17527|32925->17528|32981->17555|33011->17556|33078->17595|33108->17596|33170->17630|33199->17631|33298->17701|33328->17702|33379->17724|33409->17725|33476->17764|33506->17765|33562->17792|33592->17793|33659->17832|33689->17833|33751->17867|33780->17868|33880->17939|33910->17940|33961->17962|33991->17963|34058->18002|34088->18003|34144->18030|34174->18031|34241->18070|34271->18071|34333->18105|34362->18106|34473->18188|34503->18189|34554->18211|34584->18212|34653->18253|34683->18254|34739->18281|34769->18282|34838->18323|34868->18324|34930->18358|34959->18359|35071->18442|35101->18443|35152->18465|35182->18466|35251->18507|35281->18508|35337->18535|35367->18536|35436->18577|35466->18578|35528->18612|35557->18613|35667->18694|35697->18695|35748->18717|35778->18718|35847->18759|35877->18760|35933->18787|35963->18788|36032->18829|36062->18830|36124->18864|36153->18865|36248->18931|36278->18932|36329->18954|36359->18955|36426->18994|36456->18995|36512->19022|36542->19023|36609->19062|36639->19063|36701->19097|36730->19098|36834->19173|36864->19174|36915->19196|36945->19197|37014->19238|37044->19239|37100->19266|37130->19267|37199->19308|37229->19309|37291->19343|37320->19344|37414->19409|37444->19410|37495->19432|37525->19433|37592->19472|37622->19473|37678->19500|37708->19501|37775->19540|37805->19541|37867->19575|37896->19576|38001->19652|38031->19653|38082->19675|38112->19676|38181->19717|38211->19718|38267->19745|38297->19746|38366->19787|38396->19788|38458->19822|38487->19823|38582->19889|38612->19890|38663->19912|38693->19913|38760->19952|38790->19953|38846->19980|38876->19981|38943->20020|38973->20021|39035->20055|39064->20056|39142->20105|39172->20106|39223->20128|39253->20129|39318->20166|39348->20167|39404->20194|39434->20195|39499->20232|39529->20233|39590->20266|39619->20267|39699->20318|39729->20319|39780->20341|39810->20342|39876->20380|39906->20381|39962->20408|39992->20409|40058->20447|40088->20448|40149->20481|40178->20482|40264->20539|40294->20540|40345->20562|40375->20563|40441->20601|40471->20602|40527->20629|40557->20630|40623->20668|40653->20669|40714->20702|40743->20703|40832->20763|40862->20764|40913->20786|40943->20787|41009->20825|41039->20826|41095->20853|41125->20854|41191->20892|41221->20893|41282->20926|41311->20927|41391->20978|41421->20979|41472->21001|41502->21002|41567->21039|41597->21040|41653->21067|41683->21068|41748->21105|41778->21106|41839->21139|41868->21140|41945->21188|41975->21189|42026->21211|42056->21212|42121->21249|42151->21250|42207->21277|42237->21278|42302->21315|42332->21316|42393->21349|42422->21350|42507->21406|42537->21407|42588->21429|42618->21430|42684->21468|42714->21469|42770->21496|42800->21497|42866->21535|42896->21536|42957->21569|42986->21570|43066->21621|43096->21622|43147->21644|43177->21645|43243->21683|43273->21684|43329->21711|43359->21712|43425->21750|43455->21751|43516->21784|43545->21785|43578->21790|43607->21791|43670->21826|43699->21827|43784->21883|43814->21884|43935->21977|43964->21978|44018->22003|44048->22004|44169->22097|44198->22098|44300->22171|44330->22172|44492->22306|44521->22307|44595->22352|44625->22353|44823->22523|44852->22524|44925->22568|44955->22569|45116->22702|45145->22703|45218->22747|45248->22748|45409->22881|45438->22882|45515->22930|45545->22931|45780->23138|45809->23139|45883->23184|45913->23185|46074->23318|46103->23319|46177->23364|46207->23365|46406->23536|46435->23537|46508->23581|46538->23582|46739->23755|46768->23756|46842->23801|46872->23802|47453->24355|47482->24356|47555->24400|47585->24401|47785->24573|47814->24574|47886->24617|47916->24618|48116->24790|48145->24791|48218->24835|48248->24836|48448->25008|48477->25009|48553->25056|48583->25057|49537->25983|49566->25984|49641->26030|49671->26031|50701->27033|50730->27034|50803->27078|50833->27079|51936->28154|51965->28155|52420->28581|52450->28582|53591->29695|53620->29696|53697->29744|53727->29745|53964->29954|53993->29955|54049->29983|54078->29984|54140->30017|54170->30018|54248->30067|54278->30068|54392->30154|54421->30155|54501->30206|54531->30207|57545->33191|57576->33192|57771->33357|57802->33358|57909->33435|57940->33436|58269->33735|58300->33736|58943->34349|58974->34350|59146->34492|59177->34493|59263->34549|59294->34550|59466->34692|59497->34693|59593->34759|59624->34760|59782->34888|59813->34889|59865->34911|59896->34912|59969->34955|60000->34956|60088->35014|60119->35015|60173->35039|60204->35040|60291->35097|60322->35098|60394->35140|60425->35141|60513->35199|60544->35200|60598->35224|60629->35225|60716->35282|60747->35283|60794->35300|60825->35301|60958->35404|60989->35405|61184->35570|61215->35571|61297->35623|61328->35624|61565->35831|61596->35832|61678->35884|61709->35885|61946->36092|61977->36093|62059->36145|62090->36146|62391->36417|62422->36418|62465->36431|62496->36432|62586->36492|62617->36493|62726->36572|62757->36573|62837->36623|62868->36624|62911->36637|62942->36638|62980->36647|63011->36648|63059->36666|63090->36667|63275->36822|63306->36823|63413->36900|63444->36901|63629->37056|63660->37057|63900->37267|63931->37268|64161->37468|64192->37469|64537->37784|64568->37785|64658->37845|64689->37846|64826->37953|64857->37954|64937->38004|64968->38005|65011->38018|65042->38019|65080->38028|65111->38029|65149->38038|65179->38039|65215->38046|65245->38047|65303->1250|65331->1268|65397->1299|65412->1305|65474->1345|65506->38065|65545->38067|65583->38094|65624->38095|65664->38097|65703->38112|65788->38159|65809->38169|65846->38182|65939->38237|65960->38247|66003->38266|66097->38322|66118->38332|66162->38352|66256->38408|66277->38418|66316->38433|66404->38483|66425->38493|66463->38507|66551->38557|66572->38567|66610->38581|66697->38630|66718->38640|66755->38653|66848->38708|66869->38718|66912->38737|67006->38793|67027->38803|67071->38823|67163->38877|67184->38887|67221->38900|67307->38948|67328->38958|67364->38970|67450->39018|67471->39028|67507->39040|67594->39089|67615->39099|67652->39112|67748->39170|67769->39180|67815->39202|67900->39249|67921->39259|67956->39270|68043->39319|68064->39329|68101->39342|68200->39403|68221->39413|68266->39434|76788->47923
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|63->23|63->23|63->23|65->25|65->25|65->25|68->28|68->28|68->28|69->29|69->29|69->29|74->34|74->34|97->57|97->57|98->58|98->58|101->61|101->61|103->63|103->63|104->64|104->64|106->66|106->66|107->67|107->67|109->69|109->69|110->70|110->70|112->72|112->72|113->73|113->73|115->75|115->75|116->76|116->76|118->78|118->78|119->79|119->79|121->81|121->81|122->82|122->82|124->84|124->84|125->85|125->85|127->87|127->87|128->88|128->88|130->90|130->90|131->91|131->91|133->93|133->93|134->94|134->94|136->96|136->96|137->97|137->97|139->99|139->99|140->100|140->100|142->102|142->102|143->103|143->103|145->105|145->105|146->106|146->106|148->108|148->108|149->109|149->109|151->111|151->111|152->112|152->112|154->114|154->114|155->115|155->115|157->117|157->117|158->118|158->118|160->120|160->120|161->121|161->121|163->123|163->123|164->124|164->124|166->126|166->126|167->127|167->127|169->129|169->129|170->130|170->130|172->132|172->132|173->133|173->133|175->135|175->135|176->136|176->136|178->138|178->138|179->139|179->139|180->140|180->140|183->143|183->143|185->145|185->145|186->146|186->146|188->148|188->148|189->149|189->149|191->151|191->151|192->152|192->152|194->154|194->154|195->155|195->155|197->157|197->157|198->158|198->158|200->160|200->160|201->161|201->161|203->163|203->163|204->164|204->164|206->166|206->166|207->167|207->167|209->169|209->169|210->170|210->170|212->172|212->172|213->173|213->173|215->175|215->175|216->176|216->176|218->178|218->178|219->179|219->179|221->181|221->181|222->182|222->182|224->184|224->184|225->185|225->185|227->187|227->187|228->188|228->188|230->190|230->190|231->191|231->191|233->193|233->193|234->194|234->194|236->196|236->196|237->197|237->197|239->199|239->199|240->200|240->200|242->202|242->202|243->203|243->203|245->205|245->205|246->206|246->206|248->208|248->208|249->209|249->209|251->211|251->211|252->212|252->212|254->214|254->214|255->215|255->215|257->217|257->217|258->218|258->218|260->220|260->220|261->221|261->221|262->222|262->222|315->275|315->275|316->276|316->276|369->329|369->329|371->331|371->331|374->334|374->334|376->336|376->336|379->339|379->339|381->341|381->341|383->343|383->343|385->345|385->345|386->346|386->346|388->348|388->348|422->382|422->382|424->384|424->384|426->386|426->386|428->388|428->388|429->389|429->389|431->391|431->391|434->394|434->394|436->396|436->396|438->398|438->398|440->400|440->400|441->401|441->401|443->403|443->403|445->405|445->405|447->407|447->407|449->409|449->409|451->411|451->411|452->412|452->412|454->414|454->414|456->416|456->416|457->417|457->417|459->419|459->419|460->420|460->420|462->422|462->422|464->424|464->424|465->425|465->425|466->426|466->426|468->428|468->428|469->429|469->429|471->431|471->431|473->433|473->433|474->434|474->434|475->435|475->435|477->437|477->437|478->438|478->438|480->440|480->440|482->442|482->442|483->443|483->443|484->444|484->444|486->446|486->446|487->447|487->447|489->449|489->449|491->451|491->451|492->452|492->452|493->453|493->453|495->455|495->455|496->456|496->456|498->458|498->458|500->460|500->460|501->461|501->461|502->462|502->462|504->464|504->464|505->465|505->465|507->467|507->467|509->469|509->469|510->470|510->470|511->471|511->471|513->473|513->473|514->474|514->474|516->476|516->476|518->478|518->478|519->479|519->479|520->480|520->480|522->482|522->482|523->483|523->483|525->485|525->485|527->487|527->487|528->488|528->488|529->489|529->489|531->491|531->491|532->492|532->492|534->494|534->494|536->496|536->496|537->497|537->497|538->498|538->498|540->500|540->500|541->501|541->501|543->503|543->503|545->505|545->505|546->506|546->506|547->507|547->507|549->509|549->509|550->510|550->510|552->512|552->512|554->514|554->514|555->515|555->515|556->516|556->516|558->518|558->518|559->519|559->519|561->521|561->521|563->523|563->523|564->524|564->524|565->525|565->525|567->527|567->527|568->528|568->528|570->530|570->530|572->532|572->532|573->533|573->533|574->534|574->534|576->536|576->536|577->537|577->537|579->539|579->539|581->541|581->541|582->542|582->542|583->543|583->543|585->545|585->545|586->546|586->546|588->548|588->548|590->550|590->550|591->551|591->551|592->552|592->552|594->554|594->554|595->555|595->555|597->557|597->557|599->559|599->559|600->560|600->560|601->561|601->561|603->563|603->563|604->564|604->564|606->566|606->566|608->568|608->568|609->569|609->569|610->570|610->570|612->572|612->572|613->573|613->573|615->575|615->575|617->577|617->577|618->578|618->578|619->579|619->579|621->581|621->581|622->582|622->582|624->584|624->584|626->586|626->586|627->587|627->587|628->588|628->588|630->590|630->590|631->591|631->591|633->593|633->593|635->595|635->595|636->596|636->596|637->597|637->597|639->599|639->599|640->600|640->600|642->602|642->602|644->604|644->604|645->605|645->605|646->606|646->606|648->608|648->608|649->609|649->609|651->611|651->611|653->613|653->613|654->614|654->614|655->615|655->615|657->617|657->617|658->618|658->618|660->620|660->620|662->622|662->622|663->623|663->623|664->624|664->624|666->626|666->626|667->627|667->627|669->629|669->629|671->631|671->631|672->632|672->632|673->633|673->633|675->635|675->635|676->636|676->636|678->638|678->638|680->640|680->640|681->641|681->641|682->642|682->642|684->644|684->644|685->645|685->645|687->647|687->647|689->649|689->649|690->650|690->650|691->651|691->651|693->653|693->653|694->654|694->654|696->656|696->656|698->658|698->658|699->659|699->659|700->660|700->660|702->662|702->662|703->663|703->663|705->665|705->665|707->667|707->667|708->668|708->668|709->669|709->669|711->671|711->671|712->672|712->672|714->674|714->674|716->676|716->676|717->677|717->677|718->678|718->678|720->680|720->680|721->681|721->681|723->683|723->683|725->685|725->685|726->686|726->686|727->687|727->687|729->689|729->689|730->690|730->690|732->692|732->692|734->694|734->694|735->695|735->695|736->696|736->696|738->698|738->698|739->699|739->699|741->701|741->701|743->703|743->703|744->704|744->704|745->705|745->705|747->707|747->707|748->708|748->708|750->710|750->710|752->712|752->712|753->713|753->713|755->715|755->715|758->718|758->718|761->721|761->721|762->722|762->722|765->725|765->725|767->727|767->727|772->732|772->732|773->733|773->733|779->739|779->739|780->740|780->740|785->745|785->745|786->746|786->746|791->751|791->751|792->752|792->752|799->759|799->759|800->760|800->760|805->765|805->765|806->766|806->766|812->772|812->772|813->773|813->773|819->779|819->779|820->780|820->780|836->796|836->796|837->797|837->797|843->803|843->803|844->804|844->804|850->810|850->810|851->811|851->811|857->817|857->817|858->818|858->818|884->844|884->844|885->845|885->845|913->873|913->873|914->874|914->874|944->904|944->904|951->911|951->911|982->942|982->942|983->943|983->943|990->950|990->950|992->952|992->952|993->953|993->953|994->954|994->954|997->957|997->957|998->958|998->958|1068->1028|1068->1028|1073->1033|1073->1033|1075->1035|1075->1035|1082->1042|1082->1042|1095->1055|1095->1055|1098->1058|1098->1058|1099->1059|1099->1059|1102->1062|1102->1062|1103->1063|1103->1063|1106->1066|1106->1066|1107->1067|1107->1067|1108->1068|1108->1068|1110->1070|1110->1070|1111->1071|1111->1071|1113->1073|1113->1073|1114->1074|1114->1074|1116->1076|1116->1076|1117->1077|1117->1077|1119->1079|1119->1079|1120->1080|1120->1080|1122->1082|1122->1082|1125->1085|1125->1085|1126->1086|1126->1086|1129->1089|1129->1089|1130->1090|1130->1090|1133->1093|1133->1093|1134->1094|1134->1094|1137->1097|1137->1097|1138->1098|1138->1098|1139->1099|1139->1099|1142->1102|1142->1102|1143->1103|1143->1103|1144->1104|1144->1104|1145->1105|1145->1105|1146->1106|1146->1106|1151->1111|1151->1111|1153->1113|1153->1113|1156->1116|1156->1116|1161->1121|1161->1121|1166->1126|1166->1126|1173->1133|1173->1133|1174->1134|1174->1134|1177->1137|1177->1137|1178->1138|1178->1138|1179->1139|1179->1139|1180->1140|1180->1140|1181->1141|1181->1141|1182->1142|1182->1142|1185->18|1185->19|1186->20|1186->20|1186->20|1187->1144|1187->1144|1187->1144|1187->1144|1187->1144|1187->1144|1189->1146|1189->1146|1189->1146|1190->1147|1190->1147|1190->1147|1191->1148|1191->1148|1191->1148|1192->1149|1192->1149|1192->1149|1193->1150|1193->1150|1193->1150|1194->1151|1194->1151|1194->1151|1195->1152|1195->1152|1195->1152|1196->1153|1196->1153|1196->1153|1197->1154|1197->1154|1197->1154|1198->1155|1198->1155|1198->1155|1199->1156|1199->1156|1199->1156|1200->1157|1200->1157|1200->1157|1201->1158|1201->1158|1201->1158|1202->1159|1202->1159|1202->1159|1203->1160|1203->1160|1203->1160|1204->1161|1204->1161|1204->1161|1205->1162|1205->1162|1205->1162|1445->1402
                    -- GENERATED --
                */
            