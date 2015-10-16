
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
object serviceServiceTest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Climate Service</title>
    
    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="/assets/javascripts/parameter.js"></script>

    <!-- Bootstrap -->
    <link href="/assets/stylesheets/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<h2 class="text-center">ServiceTest</h2>

<p class="text-center col-md-8 col-md-offset-2">test10</p>

<div class="container col-md-6">
    <form>
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="col-md-2">Parameter Name</th>
                <th class="col-md-4">Value</th>
            </tr>
            </thead>
            <tbody id="dynamicTBody"><tr><td>start_time</td><td><input type="text" class="form-control" id="start_time" placeholder="200401"></td></tr></tbody>
        </table>
    </form>
    <div class="text-center">
    	<button type="submit" class="btn btn-success btn-lg" onclick="Javascript:sendValues('http://einstein.sv.cmu.edu:9002/svc/twoDimSlice3D')">Get Plot</button>
    </div>
</div>

<div class="container col-md-6">
    <form>
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Output</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <a id="serviceImgLink" href="">
                        <img src="" id="serviceImg" class="img-responsive">
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <a id="commentLink" href="">
                        <textarea class="form-control" rows="3" id="comment"></textarea>
                    </a>
                </td>
            </tr>
            <tr>
                <td>
                    <textarea class="form-control" rows="10" id="message"></textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="text-center">
            <button type="submit" class="btn btn-success btn-lg">Download Data</button>
        </div>
    </form>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/assets/javascripts/bootstrap.min.js"></script>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Oct 14 21:51:51 PDT 2015
                  SOURCE: /Users/mingqi/git/climate-service/app/views/serviceServiceTest.scala.html
                  HASH: 115d02656b4da0e5adad579f9126151b6d92c09b
                  MATRIX: 811->0
                  LINES: 29->1
                  -- GENERATED --
              */
          