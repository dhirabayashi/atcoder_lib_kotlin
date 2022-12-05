package math

import kotlin.math.pow
import kotlin.math.sqrt

// 2点間の距離を求める
// https://zenn.dev/dhirabayashi/articles/57a9b16a5dc7f9
fun distance(y1: Int, x1: Int, y2: Int, x2: Int): Double {
    // 9から引くのは、本来の座標は下から上なので向きをそちらに揃えるため（不要？）
    return sqrt((x2.toDouble() - x1).pow(2.0) + ((9-y2).toDouble() - (9-y1)).pow(2.0))
}
