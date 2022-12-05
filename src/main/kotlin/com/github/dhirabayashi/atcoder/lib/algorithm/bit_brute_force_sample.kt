package com.github.dhirabayashi.atcoder.lib.algorithm

import kotlin.math.min

// bit全探索
// https://zenn.dev/dhirabayashi/articles/6638a52439a189
fun main() {
    val (n, m, x) = readLine()!!.split(" ").map { it.toInt() }
    val ca = List(n) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    var ans = Int.MAX_VALUE

    for(bit in 0 until (1 shl n)) {
        var sum = 0
        val aSum = IntArray(m)
        for(i in 0 until n) {
            if(bit and (1 shl i) != 0) {
                sum += ca[i][0]
                val a = ca[i].subList(1, ca[i].size)

                for(j in 0 until m) {
                    aSum[j] += a[j]
                }
            }
        }
        if(aSum.all { it >= x }) {
            ans = min(ans, sum)
        }
    }
    if(ans != Int.MAX_VALUE) {
        println(ans)
    } else {
        println(-1)
    }
}