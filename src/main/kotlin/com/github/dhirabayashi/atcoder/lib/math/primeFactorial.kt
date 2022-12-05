package com.github.dhirabayashi.atcoder.lib.math

// 素因数分解
// https://zenn.dev/dhirabayashi/articles/ca2ff0ad126888
fun primeFactorial(paramN: Long): List<Pair<Long, Long>> {
    val result = mutableListOf<Pair<Long, Long>>()
    var n = paramN
    var a = 2L
    while(a * a <= n) {
        if(n % a != 0L) {
            a++
            continue
        }
        var ex = 0L

        while (n % a == 0L) {
            ex++
            n /= a
        }
        result.add(a to ex)
        a++
    }
    if(n != 1L) {
        result.add(n to 1)
    }
    return result
}
