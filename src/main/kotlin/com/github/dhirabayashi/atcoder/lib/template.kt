fun readString() = readLine()!!
fun readStrings() = readString().split(" ")
fun readInt() = readString().toInt()
fun readInts() = readStrings().map { it.toInt() }
fun readLong() = readString().toLong()
fun readLongs() = readStrings().map { it.toLong() }
fun readDouble() = readString().toDouble()
fun readDoubles() = readStrings().map { it.toDouble() }

operator fun String.times(n: Int): String {
    val sb = StringBuilder()
    repeat(n) {
        sb.append(this)
    }
    return sb.toString()
}

fun main() {

}