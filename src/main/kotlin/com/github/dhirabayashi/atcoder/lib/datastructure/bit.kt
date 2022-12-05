package com.github.dhirabayashi.atcoder.lib.datastructure

import java.math.BigInteger

// Binary Indexed Tree(Fenwick Tree, フェニック木)
// https://zenn.dev/dhirabayashi/articles/53c925d326df04
internal class BinaryIndexedTree(private val size: Int) {
    private val tree: MutableList<BigInteger> = IntArray(size+1).map { BigInteger("0") }.toMutableList()

    fun sum(ii: Int): BigInteger {
        var sum = BigInteger.ZERO
        var i = ii
        while(i > 0) {
            sum += tree[i]
            i -= i and -i
        }
        return sum
    }

    fun add(ii: Int, x: BigInteger) {
        var i = ii
        while (i <= size) {
            tree[i] += x
            i += i and -i
        }
    }
}