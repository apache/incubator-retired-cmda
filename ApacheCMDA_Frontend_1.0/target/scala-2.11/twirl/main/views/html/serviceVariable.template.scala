
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
object serviceVariable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

<h2 class="text-center">Variable</h2>

<p class="text-center col-md-8 col-md-offset-2">This service is for testing</p>

<div class="container col-md-6">
    <form>
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th class="col-md-2">Parameter Name</th>
                <th class="col-md-4">Value</th>
            </tr>
            </thead>
            <tbody id="dynamicTBody"><tr><td>model</td><td><select class="form-control"><option selected="">NASA_AIRS</option><option>NASA_MLS</option></select></td></tr><tr><td>var</td><td><select class="form-control"><option selected="">ta</option></select></td></tr><tr><td>start_time</td><td><input type="text" class="form-control" id="start_time" placeholder="200401"></td></tr><tr><td>end_time</td><td><input type="text" class="form-control" id="end_time" placeholder="200412"></td></tr><tr><td>months</td><td><label class="checkbox-inline"><input type="checkbox" id="months0" value="1" checked="">1</label><label class="checkbox-inline"><input type="checkbox" id="months1" value="2" checked="">2</label><label class="checkbox-inline"><input type="checkbox" id="months2" value="3" checked="">3</label><label class="checkbox-inline"><input type="checkbox" id="months3" value="4" checked="">4</label><label class="checkbox-inline"><input type="checkbox" id="months4" value="5" checked="">5</label><label class="checkbox-inline"><input type="checkbox" id="months5" value="6" checked="">6</label><label class="checkbox-inline"><input type="checkbox" id="months6" value="7" checked="">7</label><label class="checkbox-inline"><input type="checkbox" id="months7" value="8" checked="">8</label><label class="checkbox-inline"><input type="checkbox" id="months8" value="9" checked="">9</label><label class="checkbox-inline"><input type="checkbox" id="months9" value="10" checked="">10</label><label class="checkbox-inline"><input type="checkbox" id="months10" value="11" checked="">11</label><label class="checkbox-inline"><input type="checkbox" id="months11" value="12" checked="">12</label></td></tr><tr><td>pr</td><td><input type="text" class="form-control" id="pr" placeholder="500"></td></tr><tr><td>lat1</td><td><input type="text" class="form-control" id="lat1" placeholder="-90"></td></tr><tr><td>lat2</td><td><input type="text" class="form-control" id="lat2" placeholder="90"></td></tr><tr><td>lon1</td><td><input type="text" class="form-control" id="lon1" placeholder="0"></td></tr><tr><td>lon2</td><td><input type="text" class="form-control" id="lon2" placeholder="360"></td></tr><tr><td>scale</td><td><label class="radio-inline"><input type="radio" id="scale0" value="0" name="scale&quot;" checked="">0</label><label class="radio-inline"><input type="radio" id="scale1" value="1" name="scale&quot;">1</label></td></tr><tr><td>purpose</td><td><textarea class="form-control" rows="5" id="purpose"></textarea></td></tr></tbody>
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
                  SOURCE: /Users/mingqi/git/climate-service/app/views/serviceVariable.scala.html
                  HASH: 20b58f613d25a8ec0e39478f8ac7dcca4b58ba48
                  MATRIX: 808->0
                  LINES: 29->1
                  -- GENERATED --
              */
          