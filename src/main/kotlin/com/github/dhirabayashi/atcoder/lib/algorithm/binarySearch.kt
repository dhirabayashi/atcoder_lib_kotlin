package com.github.dhirabayashi.atcoder.lib.algorithm

import kotlin.math.abs


// 二分探索
// https://zenn.dev/dhirabayashi/articles/ca2ff0ad126888
fun binarySearch(minNg: Long, maxOk: Long, isOk: (Long) -> Boolean): Long {
    var ng = minNg
    var ok = maxOk

    while(abs(ok - ng) > 1) {
        val mid = (ok + ng) / 2
        if(isOk(mid)) {
            ok = mid
        } else {
            ng = mid
        }
    }
    return ok
}