package algorithm

/**
 * bit全探索<br>
 * https://atcoder.jp/contests/abc264/submissions/52410391
 *
 * @param n 探索対象の要素数
 * @param action 実行する処理
 */
fun bitmask(n: Int, action: (List<Boolean>) -> Unit) {
    val limit = 1 shl n
    for(i in 0 until limit) {
        val bits = i.toString(2).padStart(n, '0')
        action(bits.map { it == '1' })
    }
}
