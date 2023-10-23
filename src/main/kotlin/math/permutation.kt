package math

import java.math.BigInteger

// 辞書順で何番目かをもとに順列を求める
// https://zenn.dev/dhirabayashi/articles/53c925d326df04
fun kthPermutation(n: Int, ik: BigInteger, factorial: List<BigInteger>): List<Int> {
    var s = (0 until n).toList()
    val l = mutableListOf<Int>()
    var k = ik
    for(i in 0 until n) {
        val a = factorial[n - 1 - i]
        val j = (k / a).toInt()
        k %= a
        l.add(s[j])
        s = s.subList(0, j) + s.subList(j+1, s.size)
    }
    return l
}
// 順列全探索
// https://zenn.dev/dhirabayashi/articles/74dbc213598999
class Permutation<T>(private val list: MutableList<T>) {
    private val queue = ArrayDeque(list)

    fun forEach(action: (MutableList<T>) -> Unit) {
        forEach(0 ,0, action)
    }

    private fun forEach(count: Int, layer: Int, action: (MutableList<T>) -> Unit) {
        if(count == list.size) {
            action(list)
            return
        }

        for(i in count until list.size) {
            val elem = queue.removeFirst()
            list[layer] = elem
            forEach(count + 1, layer + 1, action)
            queue.add(elem)
        }
    }
}
