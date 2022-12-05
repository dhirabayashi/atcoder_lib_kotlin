package math

const val mod = 1000000007

// https://zenn.dev/dhirabayashi/articles/6b34d10c5bb8ac
fun powMod(x: Long, y: Int): Long {
    var res = 1L
    repeat(y) {
        res = res * x % mod
    }
    return res
}