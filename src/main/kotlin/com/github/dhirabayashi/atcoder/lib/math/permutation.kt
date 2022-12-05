package com.github.dhirabayashi.atcoder.lib.math

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
