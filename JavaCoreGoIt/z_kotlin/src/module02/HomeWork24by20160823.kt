package module02

import java.util.*

private val ownerNames = arrayOf("Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe")
private val balances = doubleArrayOf(234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7)


private fun fundResult(ownerName: String, fund: Double): String {
    val resultFund = fundBalance(ownerName, fund)
    if (fund > 0) {
        if (resultFund >= 0) {
            return "$ownerName $resultFund"
        } else {
            return "$ownerName's balance probably not exists"
        }
    } else {
        return "$ownerName's balance was not funded due to incorrect fund amount ($fund)"
    }
}

private fun fundBalance(ownerName: String, fund: Double): Double {
    val nameIndex = getNameIndex(ownerName)
    if (nameIndex >= 0 && fund > 0) {
        return fundBalanceByIndex(nameIndex, fund)
    } else {
        return -1.0
    }
}

private fun getNameIndex(ownerName: String): Int {
    for (i in ownerNames.indices) {
        if (ownerNames[i] == ownerName) {
            return i
        }
    }
    return -1 // if not found
}

private fun fundBalanceByIndex(index: Int, fund: Double): Double {
    balances[index] += fund
    return balances[index]
}


fun main(args: Array<String>) {
    println(Arrays.toString(ownerNames))
    println(Arrays.toString(balances))

    println(fundResult("Alex", 50.0))
    println(fundResult("Caren", 0.0))
    println(fundResult("Daniel", 50.0))
    println(fundResult("Dude", -20.5))
    println(fundResult("Hook", 50.0))

    println(Arrays.toString(balances))
}
