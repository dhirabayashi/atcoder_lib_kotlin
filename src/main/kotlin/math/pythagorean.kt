package math

import kotlin.math.abs
import kotlin.math.pow

const val eps = 1e-9

// 三平方の定理により、三点が直角三角形をなすかどうか判定する（直角かどうかの判定）
// https://zenn.dev/dhirabayashi/articles/57a9b16a5dc7f9
fun isRightAngle(a: Double, b: Double, c: Double): Boolean {
    val list = listOf(a, b, c).sorted()

    return abs(list[2].pow(2.0) - (list[0].pow(2.0) + list[1].pow(2.0))) < eps
}