package com.github.dhirabayashi.atcoder.lib.math

// N進数に変換
// https://zenn.dev/dhirabayashi/articles/7ab100334504b0
fun toNRadix(target: Int, m: Int): MutableList<Int> {
    val list = mutableListOf<Int>()
    var tmp = target
    while (tmp > 0) {
        list.add(tmp % m)
        tmp = (tmp - (tmp % m)) / m
    }
    return list
}