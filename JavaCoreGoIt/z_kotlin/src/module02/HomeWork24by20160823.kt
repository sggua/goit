package module02

import java.util.*

private val ownerNames = arrayOf("Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe")
private val balances = doubleArrayOf(234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7)

private fun fund(fund: Double, name: String, balances: DoubleArray, names: Array<String>): String {
    val nameIndex = getNameIndex(names, name)
    if (nameIndex >= 0) {
        if (fund > 0) {
            return "$name " + fundBalance(balances, nameIndex, fund)
        } else {
            return "$name's balance was not funded due to incorrect fund amount ($fund)"
        }
    } else {
        return "$name not found"
    }
}

private fun getNameIndex(names: Array<String>, name: String): Int {
    for (i in names.indices) {
        if (names[i] == name) {
            return i
        }
    }
    return -1 // if not found
}

private fun fundBalance(balances: DoubleArray, index: Int, fund: Double): Double {
    balances[index] += fund
    return balances[index]
}


fun main(args: Array<String>) {
    println(Arrays.toString(ownerNames))
    println(Arrays.toString(balances))

    println(fund(50.0, "Alex", balances, ownerNames))
    println(fund(50.0, "Caren", balances, ownerNames))
    println(fund(50.0, "Daniel", balances, ownerNames))
    println(fund(-20.5, "Dude", balances, ownerNames))
    println(fund(50.0, "Hook", balances, ownerNames))

    println(Arrays.toString(balances))
}
