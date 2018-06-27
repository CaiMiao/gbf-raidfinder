package walfie.gbf.raidfinder.client.util

import java.util.Date
import scala.scalajs.js

package time {
  trait Clock { def now(): Date }
  object SystemClock extends Clock { def now(): Date = new Date() }

  case class Duration(milliseconds: Long) extends AnyVal
  object Duration {
    def seconds(s: Long): Duration = Duration(s * 1000)
    def minutes(m: Long): Duration = Duration(m * 60 * 1000)
    def hours(h: Long): Duration = Duration(h * 3600 * 1000)
    def days(d: Long): Duration = Duration(d * 24 * 3600 * 1000)
  }
}


package object time {
  val MomentShortLocale: js.Dictionary[js.Any] = js.Dictionary(
    "parentLocale" -> "en", // unknown to be safe edit or not
    "relativeTime" -> js.Dictionary(
      "future" -> "%s 后",
      "past" -> "%s 前",
      "s" -> "现在",
      "ss" -> "%ss",
      "m" -> "1分钟",
      "mm" -> "%d分钟",
      "h" -> "1小时",
      "hh" -> "%d小时",
      "d" -> "1天",
      "dd" -> "%d天",
      "M" -> "1月",
      "MM" -> "%d月",
      "y" -> "1年",
      "yy" -> "%d年"
    )
  )
}

