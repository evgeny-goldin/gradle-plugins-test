// http://devnet.jetbrains.net/message/5474326#5474326

import java.util.TimeZone
import java.text.SimpleDateFormat
import java.util.Date

val httpFormat = "EEE, dd MMM yyyy HH:mm:ss zzz";

fun Date.asHttpFormatString(): String {
  var sd = SimpleDateFormat(httpFormat);
  sd.setTimeZone(TimeZone.getTimeZone("GMT"));
  return sd.format(this)!!;
}
