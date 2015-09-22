
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(javascripts: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <title>Modern Web Template</title>
    <!-- Latest compiled and minified Bootstrap CSS -->
    <link rel="stylesheet" href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*8.93*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*9.99*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.97*/("""'>
</head>
<body>

<!-- Fixed navbar -->
<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Modern Web Template</a>
        </div>
    </div>
</nav>

<div class="container-fluid">

    <div class="row">
        <div class="col-sm-12" ng-view></div>
    </div>

</div>

<footer>
    <hr/>
    <div>
        <span>&copy; YourProjectName.com 2015</span>
        </div>
    <div>
        <span app-version></span>
    </div>
</footer>

</body>

<script src='"""),_display_(/*49.15*/routes/*49.21*/.Assets.versioned("lib/angularjs/angular.js")),format.raw/*49.66*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*50.15*/routes/*50.21*/.Assets.versioned("lib/angularjs/angular-route.js")),format.raw/*50.72*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*51.15*/routes/*51.21*/.Assets.versioned("lib/angular-ui-bootstrap/ui-bootstrap-tpls.js")),format.raw/*51.87*/("""' type="text/javascript"></script>

<!-- Coffee script compiled resources (generated) -->
"""),_display_(/*54.2*/for(script <- javascripts) yield /*54.28*/ {_display_(Seq[Any](format.raw/*54.30*/("""
  """),format.raw/*55.3*/("""<script src='"""),_display_(/*55.17*/routes/*55.23*/.Assets.versioned(script)),format.raw/*55.48*/("""' type="text/javascript"></script>
""")))}),format.raw/*56.2*/("""
"""),format.raw/*57.1*/("""</html>"""))}
  }

  def render(javascripts:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(javascripts)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (javascripts) => apply(javascripts)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Sep 22 12:00:47 IST 2015
                  SOURCE: /home/scriptuit/Play/PlayProjects/modern-web-template/app/views/index.scala.html
                  HASH: 5201a53f91fb44725dd1ffdaa0e356ea95bc9a10
                  MATRIX: 510->1|624->27|651->28|888->239|902->245|974->297|1037->334|1051->340|1129->398|1208->450|1223->456|1285->497|2240->1425|2255->1431|2321->1476|2397->1525|2412->1531|2484->1582|2560->1631|2575->1637|2662->1703|2779->1794|2821->1820|2861->1822|2891->1825|2932->1839|2947->1845|2993->1870|3059->1906|3087->1907
                  LINES: 19->1|22->1|23->2|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|75->54|75->54|75->54|76->55|76->55|76->55|76->55|77->56|78->57
                  -- GENERATED --
              */
          