package com.github.dhirabayashi.atcoder.lib.algorithm

// 最大公約数（ユークリッドの互除法）
// https://zenn.dev/dhirabayashi/articles/ffc43f33faebed
fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) {
        a
    } else {
        gcd(b, a % b)
    }
}

// 最小公倍数
fun lcm(a: Long, b: Long): Long {
    val d = gcd(a, b)
    return a / d * b;
}