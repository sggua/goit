package module02.practice20160820

internal fun countN(arr: IntArray, n: Int): Int {
    var q = 0
    for (i in arr) if (i == n) q++
    return q
}

fun main(args: Array<String>) {
    val array = intArrayOf(13, 24, 46, 989, 42, 42, 53)
    val n = 42
    val result = countN(array, n)

    when (result) {
        0 -> println("no")
        1 -> println("yes")
        else -> println(result)
    }

}