package com.github.dhirabayashi.atcoder.lib.math

// ルジャンドルの定理
// https://zenn.dev/dhirabayashi/articles/ca2ff0ad126888
fun legendre(n: Long, p: Long): Long {
    var res = 0L
    var p2 = p

    while (true) {
        val tmp = n / p2
        if(tmp == 0L) {
            break
        }
        res += tmp
        p2 *= p
    }
    return res
}