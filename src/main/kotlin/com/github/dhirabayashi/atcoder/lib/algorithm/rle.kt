package com.github.dhirabayashi.atcoder.lib.algorithm

// ランレングス圧縮
// https://zenn.dev/dhirabayashi/articles/88649157041a2c
fun rle(s: String): List<Pair<Char, Int>> {
    val ret = mutableListOf<Pair<Char, Int>>()

    var c = s[0]
    var count = 1

    if(s.length == 1) {
        ret.add(c to count)
    }

    for(i in 1 until s.length) {
        if(c == s[i]) {
            count++
        } else {
            ret.add(c to count)
            c = s[i]
            count = 1
        }

        if(i == s.length - 1) {
            ret.add(c to count)
        }
    }
    return ret
}