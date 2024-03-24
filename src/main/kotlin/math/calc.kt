package math

// 範囲の合計値を求める
fun sumOfRange(start: Long, end: Long): Long {
    return if((start + end - 1) % 2 == 0L) {
        (start + end) * ((end - start + 1) / 2)
    } else {
        val dEnd = end - 1
        (start + dEnd) * ((dEnd - start + 1) / 2) + end
    }
}
