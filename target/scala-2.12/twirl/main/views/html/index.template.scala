
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Casino X")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<div id="images">
    <img id="bell" src=""""),_display_(/*5.26*/routes/*5.32*/.Assets.versioned("/images/reels/bell.png")),format.raw/*5.75*/("""" style="display: none"/>
    <img id="cherry" src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.versioned("/images/reels/cherry.png")),format.raw/*6.79*/(""""/>
    <img id="lemon" src=""""),_display_(/*7.27*/routes/*7.33*/.Assets.versioned("/images/reels/lemon.png")),format.raw/*7.77*/(""""/>
    <img id="plum" src=""""),_display_(/*8.26*/routes/*8.32*/.Assets.versioned("/images/reels/plum.png")),format.raw/*8.75*/(""""/>
    <img id="redseven" src=""""),_display_(/*9.30*/routes/*9.36*/.Assets.versioned("/images/reels/redseven.png")),format.raw/*9.83*/(""""/>
    <img id="watermelon" src=""""),_display_(/*10.32*/routes/*10.38*/.Assets.versioned("/images/reels/watermelon.png")),format.raw/*10.87*/(""""/>
  </div>

  <section id="top">
  </section>
  <div id="gui">
    <div id="logo">
      <div id="overlay">
      </div>
      <div class="flexslider">
        <div class="slides">
          <img src=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("/images/logo-x.png")),format.raw/*21.67*/("""">
        </div>
      </div>
    </div>
    <div class="front-layout">
      <div class="overlay_glass"><!-- overlay --></div>
      <div class="top-space"><!-- blank space --></div>
      <div class="middle-space">
        <div class="overlay-shade"><!-- overlay for the reels--></div>
        <div class="background-shade"><!-- background for the reel stepper unit--></div>
        <div id="reels">
          <canvas id="canvas1" width="200" height="200"></canvas>
          <canvas id="canvas2" width="200" height="200"></canvas>
          <canvas id="canvas3" width="200" height="200"></canvas>
        </div>
      </div>
      <div class="bottom-space"><!-- winner paid, bet, credts and free games -->
        <div id="winner_paid" class="display_container">
          <div class="segment_display_wrap medium">
            <div id="winAmount" class="segment_display active">&nbsp;&nbsp;&nbsp;&nbsp;0</div>

          </div>
          <div class="label">
            WIN AMOUNT
          </div>
        </div>
        <div id="bet" class="display_container">
          <div class="segment_display_wrap small">
            <div id="betAmount" class="segment_display active">&nbsp;0</div>
          </div>
          <div class="label">
            BET
          </div>
        </div>
        <div id="free_games" class="display_container">
          <div class="label">
            TOTAL WINS
          </div>
          <div class="segment_display_wrap">
            <div id="totalWins" class="segment_display active">0</div>
          </div>
        </div>
        <div id="credits" class="display_container">
          <div class="label">
            CREDITS
          </div>
          <div class="segment_display_wrap">
            <div id="creditAmount" class="segment_display active">10</div>
          </div>
        </div>
      </div>
    </div>
    <div class="controlpanel">
      <a  id="stop" class="button glossy functions red" style="display:none">STOP<br />SPIN</a>
      <a id="spin_reels" class="button glossy">SPIN<br />REELS</a>
      <a id="bet_max" class="bet button glossy">BET<br />MAX</a>
      <a id="bet_one" class="bet button glossy">BET<br />ONE</a>
      <a id="add_coin" class="bet button glossy">ADD<br />COIN</a>
      <a id="stats" class="bet button glossy">STATIS<br />-TICS</a>
    </div>
  </div>

""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 28 13:36:03 IST 2017
                  SOURCE: /Users/alphx/slot-machine-web/app/views/index.scala.html
                  HASH: d50a32e4aee88ee8fb24184e49d9ef1ca1b8ce98
                  MATRIX: 955->1|1091->42|1119->45|1143->61|1182->63|1211->66|1280->109|1294->115|1357->158|1436->211|1450->217|1515->262|1571->292|1585->298|1649->342|1704->371|1718->377|1781->420|1840->453|1854->459|1921->506|1983->541|1998->547|2068->596|2299->800|2314->806|2374->845|4744->3185
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|53->21|53->21|53->21|115->83
                  -- GENERATED --
              */
          