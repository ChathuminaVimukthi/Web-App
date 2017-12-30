
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

  """),format.raw/*5.3*/("""<div id="images">
    <img id="bell" src=""""),_display_(/*6.26*/routes/*6.32*/.Assets.versioned("/images/reels/bell.png")),format.raw/*6.75*/("""" style="display: none"/>
    <img id="cherry" src=""""),_display_(/*7.28*/routes/*7.34*/.Assets.versioned("/images/reels/cherry.png")),format.raw/*7.79*/(""""/>
    <img id="lemon" src=""""),_display_(/*8.27*/routes/*8.33*/.Assets.versioned("/images/reels/lemon.png")),format.raw/*8.77*/(""""/>
    <img id="plum" src=""""),_display_(/*9.26*/routes/*9.32*/.Assets.versioned("/images/reels/plum.png")),format.raw/*9.75*/(""""/>
    <img id="redseven" src=""""),_display_(/*10.30*/routes/*10.36*/.Assets.versioned("/images/reels/redseven.png")),format.raw/*10.83*/(""""/>
    <img id="watermelon" src=""""),_display_(/*11.32*/routes/*11.38*/.Assets.versioned("/images/reels/watermelon.png")),format.raw/*11.87*/(""""/>
  </div>

  <div id="gui">
    <div id="logo">
      <div id="overlay">
      </div>
      <div class="flexslider">
        <div class="slides">
          <img src=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("/images/logo-x.png")),format.raw/*20.67*/("""">
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

""")))}),format.raw/*82.2*/("""
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
                  DATE: Sat Dec 30 02:51:02 IST 2017
                  SOURCE: /Users/alphx/slot-machine-web/app/views/index.scala.html
                  HASH: 80d4bcca0241dcbf6958b06edeb950cf78b132fc
                  MATRIX: 955->1|1091->42|1119->45|1143->61|1182->63|1212->67|1281->110|1295->116|1358->159|1437->212|1451->218|1516->263|1572->293|1586->299|1650->343|1705->372|1719->378|1782->421|1842->454|1857->460|1925->507|1987->542|2002->548|2072->597|2269->767|2284->773|2344->812|4714->3152
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|52->20|52->20|52->20|114->82
                  -- GENERATED --
              */
          