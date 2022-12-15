package math

import java.math.BigDecimal
import java.math.RoundingMode

fun roundSample() {
    val (x, k) = readLine()!!.split(" ").map { it.toLong() }
    val decimal = BigDecimal(x)

    var index = -1
    val ans = (0 until k).fold(decimal) { acc, _ ->
        val s = acc.setScale(index, RoundingMode.HALF_UP).toPlainString()
        index--
        BigDecimal(s)
    }
    println(ans)
}