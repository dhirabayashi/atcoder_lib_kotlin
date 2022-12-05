package com.github.dhirabayashi.atcoder.lib.datastructure

// スパーステーブル
// https://zenn.dev/dhirabayashi/articles/31c854ad4a8c8b
class RMQSparseTable(A: IntArray) {
    var array: IntArray
    var logTable: IntArray
    var table: Array<IntArray>
    var num: Int

    init {
        num = A.size
        this.array = A.copyOf(num)


        //log_tableを前処理で作っておくことでクエリ処理時にO(1)でlogを計算できる
        logTable = IntArray(num + 1)
        for (i in 2 until num + 1) {
            logTable[i] = logTable[i shr 1] + 1
        }
        table = Array(num) { IntArray(logTable[num] + 1) }


        //table[i][2^0] = i番目の要素から長さ1の区間の最小値はA[i](A[i]自身か含まないので)
        for (i in 0 until num) {
            table[i][0] = i
        }
        var k = 1
        while (1 shl k <= num) {
            var i = 0
            while (i + (1 shl k) <= num) {
                val first = table[i][k - 1] //前部分
                val second = table[i + (1 shl k - 1)][k - 1] //後部分

                //前部分の最小値と後部分の最小値を比較して、より小さいものを採用する
                if (A[first] < A[second]) {
                    table[i][k] = first
                } else {
                    table[i][k] = second
                }
                i++
            }
            k++
        }
    }

    fun query(s: Int, t: Int): Int {
        //区間の長さ
        val d = t - s + 1
        //logの計算
        val k = logTable[d]
        return if (array[table[s][k]] < array[table[t - (1 shl k) + 1][k]]) {
            table[s][k]
        } else {
            table[t - (1 shl k) + 1][k]
        }
    }
}