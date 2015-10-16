
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
import helper._
/**/
object aboutProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main("About Project")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

   """),format.raw/*5.4*/("""<h1>About Project</h1>
   	<div class="jumbotron">
   <h3><strong>Project Overview</strong></h3>
   <p>JPL has provided a repository of web services for multi-aspect physics-based and phenomenon-oriented phenomenon-oriented climate model performance evaluation and diagnosis through the comprehensive and synergistic use of multiple observational data, reanalysis data, and model outputs.</p>
   <p>This project aims to study various hidden relationships, including semantic relationships and usage relationships, to 
   help users not only learn available datasets and web services, but also learn how to use them. Moreover, we aim to 
   facilitate Earth scientists and students in designing climate analytics workflows faster than before.</p>
   
   
</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:50 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/aboutProject.scala.html
                  HASH: 1a688c3100e898d8b5b3d4ff28005b3069bee51a
                  MATRIX: 820->19|849->40|888->42|919->47
                  LINES: 29->3|29->3|29->3|31->5
                  -- GENERATED --
              */
          