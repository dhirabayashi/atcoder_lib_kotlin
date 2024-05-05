package math

// エラトステネスの篩でn以下の素数一覧を生成する
// https://atcoder.jp/contests/abc250/submissions/53039093
fun eratosthenes(n: Int): List<Int> {
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for(i in 2..n) {
        if(!isPrime[i]) {
            continue
        }

        for(j in i * 2 .. n step i) {
            isPrime[j] = false
        }
    }

    return (0..n).filter { isPrime[it] }
}
