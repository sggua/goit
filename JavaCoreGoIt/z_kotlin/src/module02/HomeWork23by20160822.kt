package module02

import java.util.*

private val ownerNames = arrayOf("Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe")
private val balances = doubleArrayOf(234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7)
private val commission = 5.0  // %

private fun withdrawResult(ownerName: String, withdrawal: Double): String {
    val withdrawTestResult = withdrawBalance(ownerName, withdrawal)
    if (withdrawTestResult >= 0) {
        val nameIndex = getNameIndex(ownerNames, ownerName)
        balances[nameIndex] = withdrawTestResult
        return ownerName + " " + withdrawal + " " + balances[nameIndex]
    } else {
        return ownerName + " NO"
    }
}

private fun withdrawBalance(ownerName: String, withdrawal: Double): Double {
    val nameIndex = getNameIndex(ownerNames, ownerName)
    if (nameIndex >= 0) {
        val balance = balances[nameIndex]
        return withdrawCheck(balance, withdrawal)
    } else {
        return -1.0
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

private fun withdrawCheck(balance: Double, withdrawal: Double): Double {
    val commissionMoney = withdrawal * commission / 100
    return balance - withdrawal - commissionMoney
}


fun main(args: Array<String>) {
    println(Arrays.toString(ownerNames))
    println(Arrays.toString(balances))

    println(withdrawResult("Alex", 50.0))
    println(withdrawResult("Caren", 50.0))
    println(withdrawResult("Daniel", 50.0)) // not exist in ownerNames
    println(withdrawResult("Dude", 50.0))
    println(withdrawResult("Hook", 50.0))

    println(Arrays.toString(balances))
}
