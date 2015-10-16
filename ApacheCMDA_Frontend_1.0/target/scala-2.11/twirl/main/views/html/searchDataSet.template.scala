
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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

/**/
object searchDataSet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Dataset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dataSetForm: play.data.Form[Dataset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	"""),format.raw/*6.2*/("""<script src='"""),_display_(/*6.16*/routes/*6.22*/.Assets.at("javascripts/edit_button.js")),format.raw/*6.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">
	$(function() """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/("""
	    """),format.raw/*12.6*/("""var availableDataSetNames = [
	                "AIRS Air Temperature",
					"AIRS Near-Surface Air Temperature",
					"AIRS Specific Humidity",
					"AMSRE Sea Surface Temperature",
					"ARGO Ocean Salinity",
					"ARGO Ocean Temperature",
					"AVISO Sea Surface Height",
					"CAM5 Air Temperature",
					"CAM5 Cloud Ice Water Content",
					"CAM5 Cloud Liquid Water Content",
					"CAM5 Leaf Area Index",
					"CAM5 Near-Surface Wind Speed",
					"CAM5 Precipitation Flux",
					"CAM5 Relative Humidity",
					"CAM5 Sea Surface Height",
					"CAM5 Sea Surface Temperature",
					"CAM5 Specific Humidity",
					"CAM5 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CAM5 Surface Downwelling Longwave Radiation",
					"CAM5 Surface Downwelling Shortwave Radiation",
					"CAM5 Surface Temperature",
					"CAM5 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CAM5 Surface Upwelling Longwave Radiation",
					"CAM5 Surface Upwelling Shortwave Radiation",
					"CAM5 TOA Incident Shortwave Radiation",
					"CAM5 TOA Outgoing Clear-Sky Longwave Radiation",
					"CAM5 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CAM5 TOA Outgoing Longwave Radiation",
					"CAM5 TOA Outgoing Shortwave Radiation",
					"CAM5 Total Cloud Fraction",
					"CAM5 Vertical Wind Velocity",
					"CANAM4 Air Temperature",
					"CANAM4 Cloud Ice Water Content",
					"CANAM4 Cloud Liquid Water Content",
					"CANAM4 Eastward Near-Surface Wind",
					"CANAM4 Near-Surface Air Temperature",
					"CANAM4 Near-Surface Relative Humidity",
					"CANAM4 Near-Surface Wind Speed",
					"CANAM4 Northward Near-Surface Wind",
					"CANAM4 Precipitation Flux",
					"CANAM4 Relative Humidity",
					"CANAM4 Specific Humidity",
					"CANAM4 Surface Downwelling Clear-Sky Longwave Radiation",
					"CANAM4 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CANAM4 Surface Downwelling Longwave Radiation",
					"CANAM4 Surface Downwelling Shortwave Radiation",
					"CANAM4 Surface Temperature",
					"CANAM4 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CANAM4 Surface Upwelling Longwave Radiation",
					"CANAM4 Surface Upwelling Shortwave Radiation",
					"CANAM4 TOA Incident Shortwave Radiation",
					"CANAM4 TOA Outgoing Clear-Sky Longwave Radiation",
					"CANAM4 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CANAM4 TOA Outgoing Longwave Radiation",
					"CANAM4 TOA Outgoing Shortwave Radiation",
					"CANAM4 Total Cloud Fraction",
					"CANAM4 Vertical Wind Velocity",
					"CERES Surface Downwelling Clear-Sky Longwave Radiation",
					"CERES Surface Downwelling Clear-Sky Shortwave Radiation",
					"CERES Surface Downwelling Longwave Radiation",
					"CERES Surface Downwelling Shortwave Radiation",
					"CERES Surface Upwelling Clear-Sky Shortwave Radiation",
					"CERES Surface Upwelling Longwave Radiation",
					"CERES Surface Upwelling Shortwave Radiation",
					"CERES TOA Incident Shortwave Radiation",
					"CERES TOA Outgoing Clear-Sky Longwave Radiation",
					"CERES TOA Outgoing Clear-Sky Shortwave Radiation",
					"CERES TOA Outgoing Longwave Radiation",
					"CERES TOA Outgoing Shortwave Radiation",
					"CM3 Air Temperature",
					"CM3 Cloud Ice Water Content",
					"CM3 Cloud Liquid Water Content",
					"CM3 Eastward Near-Surface Wind",
					"CM3 Near-Surface Wind Speed",
					"CM3 Northward Near-Surface Wind",
					"CM3 Precipitation Flux",
					"CM3 Relative Humidity",
					"CM3 Specific Humidity",
					"CM3 Surface Downwelling Clear-Sky Longwave Radiation",
					"CM3 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CM3 Surface Downwelling Longwave Radiation",
					"CM3 Surface Downwelling Shortwave Radiation",
					"CM3 Surface Temperature",
					"CM3 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CM3 Surface Upwelling Longwave Radiation",
					"CM3 Surface Upwelling Shortwave Radiation",
					"CM3 TOA Incident Shortwave Radiation",
					"CM3 TOA Outgoing Clear-Sky Longwave Radiation",
					"CM3 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CM3 TOA Outgoing Longwave Radiation",
					"CM3 TOA Outgoing Shortwave Radiation",
					"CM3 Total Cloud Fraction",
					"CM3 Vertical Wind Velocity",
					"CM5A-LR Air Temperature",
					"CM5A-LR Cloud Ice Water Content",
					"CM5A-LR Cloud Liquid Water Content",
					"CM5A-LR Eastward Near-Surface Wind",
					"CM5A-LR Leaf Area Index",
					"CM5A-LR Near-Surface Wind Speed",
					"CM5A-LR Northward Near-Surface Wind",
					"CM5A-LR Precipitation Flux",
					"CM5A-LR Specific Humidity",
					"CM5A-LR Surface Downwelling Clear-Sky Longwave Radiation",
					"CM5A-LR Surface Downwelling Clear-Sky Shortwave Radiation",
					"CM5A-LR Surface Downwelling Longwave Radiation",
					"CM5A-LR Surface Downwelling Shortwave Radiation",
					"CM5A-LR Surface Temperature",
					"CM5A-LR Surface Upwelling Clear-Sky Shortwave Radiation",
					"CM5A-LR Surface Upwelling Longwave Radiation",
					"CM5A-LR Surface Upwelling Shortwave Radiation",
					"CM5A-LR TOA Incident Shortwave Radiation",
					"CM5A-LR TOA Outgoing Clear-Sky Longwave Radiation",
					"CM5A-LR TOA Outgoing Clear-Sky Shortwave Radiation",
					"CM5A-LR TOA Outgoing Longwave Radiation",
					"CM5A-LR TOA Outgoing Shortwave Radiation",
					"CM5A-LR Total Cloud Fraction",
					"E2-H Air Temperature",
					"E2-H Cloud Ice Water Content",
					"E2-H Cloud Liquid Water Content",
					"E2-H Eastward Near-Surface Wind",
					"E2-H Near-Surface Wind Speed",
					"E2-H Northward Near-Surface Wind",
					"E2-H Precipitation Flux",
					"E2-H Relative Humidity",
					"E2-H Sea Surface Temperature",
					"E2-H Specific Humidity",
					"E2-H Surface Downwelling Clear-Sky Longwave Radiation",
					"E2-H Surface Downwelling Clear-Sky Shortwave Radiation",
					"E2-H Surface Downwelling Longwave Radiation",
					"E2-H Surface Downwelling Shortwave Radiation",
					"E2-H Surface Temperature",
					"E2-H Surface Upwelling Clear-Sky Shortwave Radiation",
					"E2-H Surface Upwelling Longwave Radiation",
					"E2-H Surface Upwelling Shortwave Radiation",
					"E2-H TOA Incident Shortwave Radiation",
					"E2-H TOA Outgoing Clear-Sky Longwave Radiation",
					"E2-H TOA Outgoing Clear-Sky Shortwave Radiation",
					"E2-H TOA Outgoing Longwave Radiation",
					"E2-H TOA Outgoing Shortwave Radiation",
					"E2-H Total Cloud Fraction",
					"E2-H Vertical Wind Velocity",
					"E2-R Air Temperature",
					"E2-R Cloud Ice Water Content",
					"E2-R Cloud Liquid Water Content",
					"E2-R Eastward Near-Surface Wind",
					"E2-R Near-Surface Wind Speed",
					"E2-R Northward Near-Surface Wind",
					"E2-R Precipitation Flux",
					"E2-R Relative Humidity",
					"E2-R Sea Surface Height",
					"E2-R Sea Surface Temperature",
					"E2-R Specific Humidity",
					"E2-R Surface Downwelling Clear-Sky Longwave Radiation",
					"E2-R Surface Downwelling Clear-Sky Shortwave Radiation",
					"E2-R Surface Downwelling Shortwave Radiation",
					"E2-R Surface Temperature",
					"E2-R Surface Upwelling Clear-Sky Shortwave Radiation",
					"E2-R Surface Upwelling Longwave Radiation",
					"E2-R Surface Upwelling Shortwave Radiation",
					"E2-R TOA Incident Shortwave Radiation",
					"E2-R TOA Outgoing Clear-Sky Longwave Radiation",
					"E2-R TOA Outgoing Clear-Sky Shortwave Radiation",
					"E2-R TOA Outgoing Longwave Radiation",
					"E2-R TOA Outgoing Shortwave Radiation",
					"E2-R Total Cloud Fraction",
					"E2-R Vertical Wind Velocity",
					"ESM2G Air Temperature",
					"ESM2G Cloud Ice Water Content",
					"ESM2G Cloud Liquid Water Content",
					"ESM2G Eastward Near-Surface Wind",
					"ESM2G Leaf Area Index",
					"ESM2G Near-Surface Wind Speed",
					"ESM2G Northward Near-Surface Wind",
					"ESM2G Precipitation Flux",
					"ESM2G Relative Humidity",
					"ESM2G Sea Surface Height",
					"ESM2G Sea Surface Temperature",
					"ESM2G Specific Humidity",
					"ESM2G Surface Downwelling Clear-Sky Longwave Radiation",
					"ESM2G Surface Downwelling Longwave Radiation",
					"ESM2G Surface Temperature",
					"ESM2G Surface Upwelling Longwave Radiation",
					"ESM2G TOA Incident Shortwave Radiation",
					"ESM2G TOA Outgoing Clear-Sky Longwave Radiation",
					"ESM2G TOA Outgoing Clear-Sky Shortwave Radiation",
					"ESM2G TOA Outgoing Longwave Radiation",
					"ESM2G TOA Outgoing Shortwave Radiation",
					"ESM2G Total Cloud Fraction",
					"ESM2G Vertical Wind Velocity",
					"GPCP Precipitation Flux",
					"GRACE Equivalent Water Height Over Land",
					"GRACE Equivalent Water Height Over Ocean",
					"HadGEM2-A Air Temperature",
					"HadGEM2-A Cloud Ice Water Content",
					"HadGEM2-A Cloud Liquid Water Content",
					"HadGEM2-A Eastward Near-Surface Wind",
					"HadGEM2-A Near-Surface Relative Humidity",
					"HadGEM2-A Near-Surface Wind Speed",
					"HadGEM2-A Northward Near-Surface Wind",
					"HadGEM2-A Precipitation Flux",
					"HadGEM2-A Relative Humidity",
					"HadGEM2-A Specific Humidity",
					"HadGEM2-A Surface Downwelling Clear-Sky Longwave Radiation",
					"HadGEM2-A Surface Downwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-A Surface Downwelling Longwave Radiation",
					"HadGEM2-A Surface Downwelling Shortwave Radiation",
					"HadGEM2-A Surface Temperature",
					"HadGEM2-A Surface Upwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-A Surface Upwelling Longwave Radiation",
					"HadGEM2-A Surface Upwelling Shortwave Radiation",
					"HadGEM2-A TOA Incident Shortwave Radiation",
					"HadGEM2-A TOA Outgoing Clear-Sky Longwave Radiation",
					"HadGEM2-A TOA Outgoing Clear-Sky Shortwave Radiation",
					"HadGEM2-A TOA Outgoing Longwave Radiation",
					"HadGEM2-A TOA Outgoing Shortwave Radiation",
					"HadGEM2-A Total Cloud Fraction",
					"HadGEM2-A Vertical Wind Velocity",
					"HadGEM2-ES Air Temperature",
					"HadGEM2-ES Cloud Ice Water Content",
					"HadGEM2-ES Cloud Liquid Water Content",
					"HadGEM2-ES Eastward Near-Surface Wind",
					"HadGEM2-ES Leaf Area Index",
					"HadGEM2-ES Near-Surface Wind Speed",
					"HadGEM2-ES Northward Near-Surface Wind",
					"HadGEM2-ES Precipitation Flux",
					"HadGEM2-ES Relative Humidity",
					"HadGEM2-ES Sea Surface Height",
					"HadGEM2-ES Sea Surface Temperature",
					"HadGEM2-ES Specific Humidity",
					"HadGEM2-ES Surface Downwelling Clear-Sky Longwave Radiation",
					"HadGEM2-ES Surface Downwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-ES Surface Downwelling Longwave Radiation",
					"HadGEM2-ES Surface Downwelling Shortwave Radiation",
					"HadGEM2-ES Surface Temperature",
					"HadGEM2-ES Surface Upwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-ES Surface Upwelling Longwave Radiation",
					"HadGEM2-ES Surface Upwelling Shortwave Radiation",
					"HadGEM2-ES TOA Incident Shortwave Radiation",
					"HadGEM2-ES TOA Outgoing Clear-Sky Longwave Radiation",
					"HadGEM2-ES TOA Outgoing Clear-Sky Shortwave Radiation",
					"HadGEM2-ES TOA Outgoing Longwave Radiation",
					"HadGEM2-ES TOA Outgoing Shortwave Radiation",
					"HadGEM2-ES Total Cloud Fraction",
					"HadGEM2-ES Vertical Wind Velocity",
					"MIROC5 Air Temperature", "MIROC5 Cloud Ice Water Content",
					"MIROC5 Cloud Liquid Water Content",
					"MIROC5 Eastward Near-Surface Wind",
					"MIROC5 Leaf Area Index", "MIROC5 Near-Surface Wind Speed",
					"MIROC5 Northward Near-Surface Wind",
					"MIROC5 Precipitation Flux", "MIROC5 Relative Humidity",
					"MIROC5 Specific Humidity",
					"MIROC5 Surface Downwelling Clear-Sky Longwave Radiation",
					"MIROC5 Surface Downwelling Clear-Sky Shortwave Radiation",
					"MIROC5 Surface Downwelling Longwave Radiation",
					"MIROC5 Surface Downwelling Shortwave Radiation",
					"MIROC5 Surface Temperature",
					"MIROC5 Surface Upwelling Clear-Sky Shortwave Radiation",
					"MIROC5 Surface Upwelling Longwave Radiation",
					"MIROC5 Surface Upwelling Shortwave Radiation",
					"MIROC5 TOA Incident Shortwave Radiation",
					"MIROC5 TOA Outgoing Clear-Sky Longwave Radiation",
					"MIROC5 TOA Outgoing Clear-Sky Shortwave Radiation",
					"MIROC5 TOA Outgoing Longwave Radiation",
					"MIROC5 TOA Outgoing Shortwave Radiation",
					"MIROC5 Total Cloud Fraction",
					"MIROC5 Vertical Wind Velocity", "MK3.6 Air Temperature",
					"MK3.6 Cloud Ice Water Content",
					"MK3.6 Cloud Liquid Water Content",
					"MK3.6 Eastward Near-Surface Wind",
					"MK3.6 Near-Surface Wind Speed",
					"MK3.6 Northward Near-Surface Wind",
					"MK3.6 Precipitation Flux", "MK3.6 Relative Humidity",
					"MK3.6 Specific Humidity",
					"MK3.6 Surface Downwelling Clear-Sky Longwave Radiation",
					"MK3.6 Surface Downwelling Clear-Sky Shortwave Radiation",
					"MK3.6 Surface Downwelling Longwave Radiation",
					"MK3.6 Surface Downwelling Shortwave Radiation",
					"MK3.6 Surface Temperature",
					"MK3.6 Surface Upwelling Clear-Sky Shortwave Radiation",
					"MK3.6 Surface Upwelling Longwave Radiation",
					"MK3.6 Surface Upwelling Shortwave Radiation",
					"MK3.6 TOA Incident Shortwave Radiation",
					"MK3.6 TOA Outgoing Clear-Sky Longwave Radiation",
					"MK3.6 TOA Outgoing Clear-Sky Shortwave Radiation",
					"MK3.6 TOA Outgoing Longwave Radiation",
					"MK3.6 TOA Outgoing Shortwave Radiation",
					"MK3.6 Total Cloud Fraction",
					"MK3.6 Vertical Wind Velocity", "MLS Air Temperature",
					"MLS Specific Humidity", "MODIS Leaf Area Index",
					"MODIS Total Cloud Fraction",
					"NODC Ocean Heat Content Anomaly within 2000 m Depth",
					"NODC Ocean Heat Content Anomaly within 700 m Depth",
					"NORESM Air Temperature", "NORESM Cloud Ice Water Content",
					"NORESM Cloud Liquid Water Content",
					"NORESM Eastward Near-Surface Wind",
					"NORESM Leaf Area Index",
					"NORESM Northward Near-Surface Wind",
					"NORESM Precipitation Flux", "NORESM Relative Humidity",
					"NORESM Sea Surface Height",
					"NORESM Sea Surface Temperature",
					"NORESM Specific Humidity",
					"NORESM Surface Downwelling Clear-Sky Longwave Radiation",
					"NORESM Surface Downwelling Clear-Sky Shortwave Radiation",
					"NORESM Surface Downwelling Longwave Radiation",
					"NORESM Surface Downwelling Shortwave Radiation",
					"NORESM Surface Temperature",
					"NORESM Surface Upwelling Clear-Sky Shortwave Radiation",
					"NORESM Surface Upwelling Longwave Radiation",
					"NORESM Surface Upwelling Shortwave Radiation",
					"NORESM TOA Incident Shortwave Radiation",
					"NORESM TOA Outgoing Clear-Sky Longwave Radiation",
					"NORESM TOA Outgoing Clear-Sky Shortwave Radiation",
					"NORESM TOA Outgoing Longwave Radiation",
					"NORESM TOA Outgoing Shortwave Radiation",
					"NORESM Total Cloud Fraction",
					"NORESM Vertical Wind Velocity",
					"QuikSCAT Eastward Near-Surface Wind",
					"QuikSCAT Near-Surface Wind Speed",
					"QuikSCAT Northward Near-Surface Wind",
					"TRMM Precipitation Flux",
					"interim Eastward Near-Surface Wind",
					"interim Near-Surface Wind Speed",
					"interim Northward Near-Surface Wind",
					"interim Relative Humidity",
					"interim Sea Surface Temperature",
					"interim Total Cloud Fraction",
					"interim Vertical Wind Velocity" ];
			
			var availableAgency = [ "ARGO", "CCCMA", "CSIRO", "ECMWF",
					"Flux,kg", "GFDL", "GFDL", "GISS", "IPSL", "MIROC", "NASA",
					"NASA", "NCAR", "NCC", "NOAA", "UKMO", "UKMO" ];

			var availableInstruments = [ "AIRS", "AMSRE", "ARGO", "AVISO",
					"CAM5", "CANAM4", "CERES", "CM3", "CM5A-LR", "E2-H",
					"E2-R", "ESM2G", "GPCP", "GRACE", "HadGEM2-A",
					"HadGEM2-ES", "MIROC5", "MK3.6", "MLS", "MODIS", "NODC",
					"NORESM", "QuikSCAT", "TRMM", "interim" ];

		var availablePhysicalVariable = [ "Air Temperature",
					"Cloud Ice Water Content", "Cloud Liquid Water Content",
					"Eastward Near-Surface Wind",
					"Equivalent Water Height Over Land",
					"Equivalent Water Height Over Ocean", "Leaf Area Index",
					"Near-Surface Air Temperature",
					"Near-Surface Relative Humidity",
					"Near-Surface Wind Speed", "Northward Near-Surface Wind",
					"Ocean Heat Content Anomaly within 2000 m Depth",
					"Ocean Heat Content Anomaly within 700 m Depth",
					"Ocean Salinity", "Ocean Temperature",
					"Precipitation Flux", "Precipitation", "Relative Humidity",
					"Sea Surface Height", "Sea Surface Temperature",
					"Specific Humidity",
					"Surface Downwelling Clear-Sky Longwave Radiation",
					"Surface Downwelling Clear-Sky Shortwave Radiation",
					"Surface Downwelling Longwave Radiation",
					"Surface Downwelling Shortwave Radiation",
					"Surface Temperature",
					"Surface Upwelling Clear-Sky Shortwave Radiation",
					"Surface Upwelling Longwave Radiation",
					"Surface Upwelling Shortwave Radiation",
					"TOA Incident Shortwave Radiation",
					"TOA Outgoing Clear-Sky Longwave Radiation",
					"TOA Outgoing Clear-Sky Shortwave Radiation",
					"TOA Outgoing Longwave Radiation",
					"TOA Outgoing Shortwave Radiation", "Total Cloud Fraction",
					"Vertical Wind Velocity" ];
			var availableGridDimension = [ "2D", "3D" ];
			$("#dataSetName").autocomplete("""),format.raw/*380.35*/("""{"""),format.raw/*380.36*/("""
				"""),format.raw/*381.5*/("""source : availableDataSetNames
			"""),format.raw/*382.4*/("""}"""),format.raw/*382.5*/(""");
			$("#agency").autocomplete("""),format.raw/*383.30*/("""{"""),format.raw/*383.31*/("""
				"""),format.raw/*384.5*/("""source : availableAgency
			"""),format.raw/*385.4*/("""}"""),format.raw/*385.5*/(""");
			$("#instrument").autocomplete("""),format.raw/*386.34*/("""{"""),format.raw/*386.35*/("""
				"""),format.raw/*387.5*/("""source : availableInstruments
			"""),format.raw/*388.4*/("""}"""),format.raw/*388.5*/(""");
			$("#physicalVariable").autocomplete("""),format.raw/*389.40*/("""{"""),format.raw/*389.41*/("""
				"""),format.raw/*390.5*/("""source : availablePhysicalVariable
			"""),format.raw/*391.4*/("""}"""),format.raw/*391.5*/(""");
			$("#gridDimension").autocomplete("""),format.raw/*392.37*/("""{"""),format.raw/*392.38*/("""
				"""),format.raw/*393.5*/("""source : availableGridDimension
			"""),format.raw/*394.4*/("""}"""),format.raw/*394.5*/(""");
		"""),format.raw/*395.3*/("""}"""),format.raw/*395.4*/(""");

		$(document)
				.ready(
						function() """),format.raw/*399.18*/("""{"""),format.raw/*399.19*/("""
							"""),format.raw/*400.8*/("""$("#preview")
									.click(
											function() """),format.raw/*402.23*/("""{"""),format.raw/*402.24*/("""
												"""),format.raw/*403.13*/("""var target = document
														.getElementById("show");
												if (target.style.display == "none") """),format.raw/*405.49*/("""{"""),format.raw/*405.50*/("""
													"""),format.raw/*406.14*/("""target.style.display = "block";
													$("#preview").text("Hide");
													var dataSetName = $(
															"#dataSetName")
															.val();
													var agency = $("#agency")
															.val();
													var instrument = $(
															"#instrument")
															.val();
													var physicalVariable = $(
															"#physicalVariable")
															.val();
													var gridDimension = $(
															"#gridDimension")
															.val();
													var dataSetStartTime = $(
															"#dataSetStartTime")
															.val();
													var dataSetEndTime = $(
															"#dataSetEndTime")
															.val();

													if (dataSetName != "") """),format.raw/*429.37*/("""{"""),format.raw/*429.38*/("""
														"""),format.raw/*430.15*/("""$("#content")
																.append(
																		" Dataset Name = "
																				+ dataSetName);
													"""),format.raw/*434.14*/("""}"""),format.raw/*434.15*/("""
													"""),format.raw/*435.14*/("""if (agency != ""
															&& agency != null) """),format.raw/*436.35*/("""{"""),format.raw/*436.36*/("""
														"""),format.raw/*437.15*/("""$("#content")
																.append(
																		" Agency = "
																				+ agency);
													"""),format.raw/*441.14*/("""}"""),format.raw/*441.15*/("""
													"""),format.raw/*442.14*/("""if (instrument != ""
															&& instrument != null) """),format.raw/*443.39*/("""{"""),format.raw/*443.40*/("""
														"""),format.raw/*444.15*/("""$("#content")
																.append(
																		" Instrument = "
																				+ instrument);
													"""),format.raw/*448.14*/("""}"""),format.raw/*448.15*/("""
													"""),format.raw/*449.14*/("""if (physicalVariable != ""
															&& physicalVariable != null) """),format.raw/*450.45*/("""{"""),format.raw/*450.46*/("""
														"""),format.raw/*451.15*/("""$("#content")
																.append(
																		" Physical Variable = "
																				+ physicalVariable);
													"""),format.raw/*455.14*/("""}"""),format.raw/*455.15*/("""
													"""),format.raw/*456.14*/("""if (gridDimension != ""
															&& gridDimension != null) """),format.raw/*457.42*/("""{"""),format.raw/*457.43*/("""
														"""),format.raw/*458.15*/("""$("#content")
																.append(
																		" Grid Dimension = "
																				+ gridDimension);
													"""),format.raw/*462.14*/("""}"""),format.raw/*462.15*/("""
													"""),format.raw/*463.14*/("""if (dataSetStartTime != ""
															&& dataSetStartTime != null) """),format.raw/*464.45*/("""{"""),format.raw/*464.46*/("""
														"""),format.raw/*465.15*/("""$("#content")
																.append(
																		" Dataset Start Time = "
																				+ dataSetStartTime);
													"""),format.raw/*469.14*/("""}"""),format.raw/*469.15*/("""
													"""),format.raw/*470.14*/("""if (dataSetEndTime != ""
															&& dataSetEndTime != null) """),format.raw/*471.43*/("""{"""),format.raw/*471.44*/("""
														"""),format.raw/*472.15*/("""$("#content")
																.append(
																		" Dataset End Time = "
																				+ dataSetEndTime);
													"""),format.raw/*476.14*/("""}"""),format.raw/*476.15*/("""

												"""),format.raw/*478.13*/("""}"""),format.raw/*478.14*/(""" """),format.raw/*478.15*/("""else """),format.raw/*478.20*/("""{"""),format.raw/*478.21*/("""
													"""),format.raw/*479.14*/("""$("#content").val('');
													target.style.display = "none";
													$("#preview").text(
															"Preview");
												"""),format.raw/*483.13*/("""}"""),format.raw/*483.14*/("""
											"""),format.raw/*484.12*/("""}"""),format.raw/*484.13*/(""");
						"""),format.raw/*485.7*/("""}"""),format.raw/*485.8*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*487.2*/("""

"""),_display_(/*489.2*/main("Search Dataset", scripts)/*489.33*/{_display_(Seq[Any](format.raw/*489.34*/(""" 
	 
    """),format.raw/*491.5*/("""<h1 style="margin-left:490px">Search Dataset</h1>
    """),_display_(/*492.6*/helper/*492.12*/.form(routes.DatasetController.getSearchResult())/*492.61*/ {_display_(Seq[Any](format.raw/*492.63*/("""
    	"""),format.raw/*493.6*/("""<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(/*495.8*/inputText(dataSetForm("Dataset Name"), 'class -> "form-control", 'id -> "dataSetName", '_label -> Messages("Dataset Name"), 'placeholder -> "ARGO Ocean Temperature", 'size->70)),format.raw/*495.184*/(""" 
    	"""),format.raw/*496.6*/("""</div>
    	<div class = "form-group">
    		"""),_display_(/*498.8*/inputText(dataSetForm("Agency"), 'class -> "form-control", 'id -> "agency", '_label -> Messages("Agency"), 'placeholder -> "NOAA", 'size->70)),format.raw/*498.149*/(""" 
    	"""),format.raw/*499.6*/("""</div>
    	<div class = "form-group">
    		"""),_display_(/*501.8*/inputText(dataSetForm("Instrument"), 'class -> "form-control", 'id -> "instrument", '_label -> Messages("Instrument"), 'placeholder -> "ARGO", 'size->70)),format.raw/*501.161*/(""" 
       	"""),format.raw/*502.9*/("""</div>
       	<div class = "form-group">
       		"""),_display_(/*504.11*/inputText(dataSetForm("Physical Variable"), 'class -> "form-control", 'id -> "physicalVariable", '_label -> Messages("Physical Variable"), 'placeholder -> "Ocean temperature", 'size->70)),format.raw/*504.197*/("""
	    """),format.raw/*505.6*/("""</div>
	    <div class = "form-group">
	    	"""),_display_(/*507.8*/inputText(dataSetForm("Grid Dimension"), 'class -> "form-control", 'id -> "gridDimension", '_label -> Messages("Grids Dimension"), 'placeholder -> "3D", 'size->70)),format.raw/*507.171*/("""
	    	
	    """),format.raw/*509.6*/("""</div>
	    <div class = "form-group">
	    	"""),_display_(/*511.8*/inputText(dataSetForm("Dataset Start Time"), 'class -> "form-control", 'id -> "dataSetStartTime", '_label -> Messages("Dataset Start Time"), 'placeholder -> "YYYYMM", 'size->70)),format.raw/*511.185*/("""
	    	"""),_display_(/*512.8*/inputText(dataSetForm("Dataset End Time"), 'class -> "form-control", 'id -> "dataSetEndTime", '_label -> Messages("Dataset End Time"), 'placeholder -> "YYYYMM", 'size->70)),format.raw/*512.179*/("""
	    	
	    	"""),format.raw/*514.7*/("""<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>
	    <div align="center">
	    	<button id="preview" type="button" class="btn btn-info"> Preview</button>
	    	<input class="btn" type="submit" value="Search">
	    </div>
	    </div>
	    
	    """)))}),format.raw/*524.7*/("""
	 """)))}))}
  }

  def render(dataSetForm:play.data.Form[Dataset]): play.twirl.api.HtmlFormat.Appendable = apply(dataSetForm)

  def f:((play.data.Form[Dataset]) => play.twirl.api.HtmlFormat.Appendable) = (dataSetForm) => apply(dataSetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/searchDataSet.scala.html
                  HASH: 605d86f6e43a7c594fc4d3beb1f1fbd413d2d5f0
                  MATRIX: 748->1|872->60|886->67|966->71|994->73|1034->87|1048->93|1108->133|1415->412|1444->413|1477->419|18536->17449|18566->17450|18599->17455|18661->17489|18690->17490|18751->17522|18781->17523|18814->17528|18870->17556|18899->17557|18964->17593|18994->17594|19027->17599|19088->17632|19117->17633|19188->17675|19218->17676|19251->17681|19317->17719|19346->17720|19414->17759|19444->17760|19477->17765|19540->17800|19569->17801|19602->17806|19631->17807|19707->17854|19737->17855|19773->17863|19855->17916|19885->17917|19927->17930|20065->18039|20095->18040|20138->18054|20895->18782|20925->18783|20969->18798|21123->18923|21153->18924|21196->18938|21276->18989|21306->18990|21350->19005|21493->19119|21523->19120|21566->19134|21654->19193|21684->19194|21728->19209|21879->19331|21909->19332|21952->19346|22052->19417|22082->19418|22126->19433|22290->19568|22320->19569|22363->19583|22457->19648|22487->19649|22531->19664|22689->19793|22719->19794|22762->19808|22862->19879|22892->19880|22936->19895|23101->20031|23131->20032|23174->20046|23270->20113|23300->20114|23344->20129|23505->20261|23535->20262|23578->20276|23608->20277|23638->20278|23672->20283|23702->20284|23745->20298|23913->20437|23943->20438|23984->20450|24014->20451|24051->20460|24080->20461|24134->39|24162->58|24191->20476|24221->20479|24262->20510|24302->20511|24339->20520|24421->20575|24437->20581|24496->20630|24537->20632|24571->20638|24686->20726|24885->20902|24920->20909|24993->20955|25157->21096|25192->21103|25265->21149|25441->21302|25479->21312|25559->21364|25768->21550|25802->21556|25875->21602|26061->21765|26102->21778|26175->21824|26375->22001|26410->22009|26604->22180|26646->22194|27010->22527
                  LINES: 26->1|28->5|28->5|30->5|31->6|31->6|31->6|31->6|36->11|36->11|37->12|405->380|405->380|406->381|407->382|407->382|408->383|408->383|409->384|410->385|410->385|411->386|411->386|412->387|413->388|413->388|414->389|414->389|415->390|416->391|416->391|417->392|417->392|418->393|419->394|419->394|420->395|420->395|424->399|424->399|425->400|427->402|427->402|428->403|430->405|430->405|431->406|454->429|454->429|455->430|459->434|459->434|460->435|461->436|461->436|462->437|466->441|466->441|467->442|468->443|468->443|469->444|473->448|473->448|474->449|475->450|475->450|476->451|480->455|480->455|481->456|482->457|482->457|483->458|487->462|487->462|488->463|489->464|489->464|490->465|494->469|494->469|495->470|496->471|496->471|497->472|501->476|501->476|503->478|503->478|503->478|503->478|503->478|504->479|508->483|508->483|509->484|509->484|510->485|510->485|513->1|515->4|516->487|518->489|518->489|518->489|520->491|521->492|521->492|521->492|521->492|522->493|524->495|524->495|525->496|527->498|527->498|528->499|530->501|530->501|531->502|533->504|533->504|534->505|536->507|536->507|538->509|540->511|540->511|541->512|541->512|543->514|553->524
                  -- GENERATED --
              */
          