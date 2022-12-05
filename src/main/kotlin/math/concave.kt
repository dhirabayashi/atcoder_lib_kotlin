package math

fun isInside(ax: Int, ay: Int, bx: Int, by: Int, cx: Int, cy: Int, tx: Int, ty: Int): Boolean {
    val abXat = (bx-ax)*(ty-ay) - (by-ay)*(tx-ax)
    val bcXbt = (cx-bx)*(ty-by) - (cy-by)*(tx-bx)
    val caXct = (ax-cx)*(ty-cy) - (ay-cy)*(tx-cx)

    if(( abXat > 0 && bcXbt > 0 && caXct > 0) || ( abXat < 0 && bcXbt < 0 && caXct < 0)) {
        return true;
    } else if(abXat * bcXbt * caXct == 0) {
        return false
    }

    return false
}

// 四角形が凹であるかどうか
// https://zenn.dev/dhirabayashi/articles/c0d5584276d011
fun isConcave(px: List<Int>, py: List<Int>): Boolean {
    for(i in 0 until 4) {
        if(isInside(px[i%4], py[i%4], px[(i+1)%4], py[(i+1)%4], px[(i+2)%4], py[(i+2)%4], px[(i+3)%4], py[(i+3)%4])) {
            return true;
        }
    }
    return false
}