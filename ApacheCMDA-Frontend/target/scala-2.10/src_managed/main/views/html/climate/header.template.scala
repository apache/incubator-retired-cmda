
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.56*/("""' style="height: 40px; width: 220px;">&nbsp&nbsp<img
					src='"""),_display_(Seq[Any](/*30.12*/routes/*30.18*/.Assets.at("images/logo.png"))),format.raw/*30.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*40.21*/routes/*40.27*/.ClimateServiceController.climateServices())),format.raw/*40.70*/("""">Service List</a></li>
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*50.21*/routes/*50.27*/.DatasetController.datasetList())),format.raw/*50.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*51.21*/routes/*51.27*/.DatasetController.searchDataset())),format.raw/*51.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Support<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*58.22*/routes/*58.28*/.AccountController.getServiceLog)),format.raw/*58.60*/("""">Service Execution Log List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*59.22*/routes/*59.28*/.AccountController.searchServiceLog)),format.raw/*59.63*/("""">Service Execution Log Search</a></li>
						</ul>
					</li>
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*67.21*/routes/*67.27*/.ClimateServiceController.home())),format.raw/*67.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*68.21*/routes/*68.27*/.AboutusController.aboutUs())),format.raw/*68.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*69.21*/routes/*69.27*/.AboutusController.aboutProject())),format.raw/*69.60*/("""">About project</a></li>
						</ul>
					</li>
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Sep 04 16:33:49 PDT 2015
                    SOURCE: /Users/mingqi/git/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 45e3b07caa7fb52c977e5da480acb2d65ac4bc2f
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4423->2193|4438->2199|4503->2242|4789->2492|4804->2498|4858->2530|4938->2574|4953->2580|5009->2614|5279->2848|5294->2854|5348->2886|5443->2945|5458->2951|5515->2986|5802->3237|5817->3243|5871->3275|5943->3311|5958->3317|6008->3345|6084->3385|6099->3391|6154->3424
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|91->50|91->50|91->50|92->51|92->51|92->51|99->58|99->58|99->58|100->59|100->59|100->59|108->67|108->67|108->67|109->68|109->68|109->68|110->69|110->69|110->69
                    -- GENERATED --
                */
            