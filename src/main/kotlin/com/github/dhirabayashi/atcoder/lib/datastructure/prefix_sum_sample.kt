package com.github.dhirabayashi.atcoder.lib.datastructure

// https://zenn.dev/dhirabayashi/articles/557bbf51c35edf
fun main() {
    val a = readLine()!!.split(" ")
    // 累積和
    val s = mutableListOf(0L)
    a.forEach {
        s.add(s[s.size - 1] + it.toLong())
    }
}