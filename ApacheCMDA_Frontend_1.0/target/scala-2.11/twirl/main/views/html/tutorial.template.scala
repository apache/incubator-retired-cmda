
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
object tutorial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Tutorial")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<ol class="breadcrumb">
	<li class="active">Tutorial</li>
</ol>

<iframe width="550" height="315" src="https://www.youtube.com/embed/t9tgr3I2d5g" frameborder="0" allowfullscreen></iframe>
<iframe width="550" height="315" style="margin-left: 25px" src="https://www.youtube.com/embed/tftPn4YQbVE" frameborder="0" allowfullscreen></iframe>

<p>
In these videos, we will help you learn the available web services, how to use them, and help you to design your climate analytics workflows.

<!-- <ul>
<li>Run vistrails. (python VISTRAILS_PATH/vistrails/vistrails.py)</li>
<li>Import a workflow.</li>
<li>Click the menu Packages, and then Amazon Plugin. Inside that choose the 'Go to estimator'</li>
<li>Input the notification email and click Estimate. Then you can be directed to the estimator web page.</li>
</ul> -->
</p>

""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/tutorial.scala.html
                  HASH: 8d0fabf79b79473ef6734a00747ffc192b07f62b
                  MATRIX: 801->1|825->17|864->19|894->23
                  LINES: 29->1|29->1|29->1|31->3
                  -- GENERATED --
              */
          