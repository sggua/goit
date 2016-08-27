package module02

private fun withdrawBalance(balance: Double, withdraw: Double, commission: Double): Double {
    return balance - withdraw - withdraw * commission / 100
}

private fun withdrawResult(balance: Double, withdraw: Double, commission: Double): String {
    val result = withdrawBalance(balance, withdraw, commission)
    if (result >= 0) {
        return "OK " + withdraw * commission / 100 + " " + result
    } else
        return "NO"
}


fun main(args: Array<String>) {
    var balance = 250.0
    val withdraw = 25.0
    val commission = 5.0  // in %

    println(withdrawResult(balance, withdraw, commission))

    balance = 205.0
    println(withdrawResult(balance, withdraw, commission))

    balance = 26.0
    println(withdrawResult(balance, withdraw, commission))

}
