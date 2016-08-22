package module02

private fun withdrawResult(bal: Double, withdraw: Double, commission: Double): String {
    val commissionMoney = withdraw * commission / 100
    val result = bal - withdraw - commissionMoney
    if (result >= 0) {
        return "OK $commissionMoney $result"
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
