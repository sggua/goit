package module02

import java.util.*

private val ownerNames = arrayOf("Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gone", "Hook", "Irene", "Joe")
private val balances = doubleArrayOf(234.1, 230.5, 145.6, 51.0, 45.6, 567.4, 34.7, 876.53, 234.5, 56.7)
private val commission = 5.0  // %

private fun withdraw(
        withdraw: Double, name: String, balances: DoubleArray, names: Array<String>, commission: Double): String {

    val nameIndex = getNameIndex(names, name)
    if (nameIndex >= 0) {
        val balance = balances[nameIndex]
        val withdrawTestResult = withdrawCheck(balance, withdraw, commission)

        if (withdrawTestResult >= 0) {
            val sumOfWithdraw = balance - withdrawTestResult
            balances[nameIndex] = withdrawTestResult
            return "$name $sumOfWithdraw " + balances[nameIndex]
        } else {
            return "$name NO"
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

private fun withdrawCheck(balance: Double, withdraw: Double, commission: Double): Double {
    val commissionMoney = withdraw * commission / 100
    return balance - withdraw - commissionMoney
}


fun main(args: Array<String>) {
    println(Arrays.toString(ownerNames))
    println(Arrays.toString(balances))

    println(withdraw(50.0, "Alex", balances, ownerNames, commission))
    println(withdraw(50.0, "Caren", balances, ownerNames, commission))
    println(withdraw(50.0, "Daniel", balances, ownerNames, commission))
    println(withdraw(50.0, "Dude", balances, ownerNames, commission))
    println(withdraw(50.0, "Hook", balances, ownerNames, commission))

    println(Arrays.toString(balances))
}
