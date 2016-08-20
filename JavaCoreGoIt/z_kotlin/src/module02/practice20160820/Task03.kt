package module02.practice20160820

internal fun testWithdraw(bal: Double, withdraw: Double, tax: Double): Double {
    return bal - tax - withdraw
}

fun main(args: Array<String>) {
    val balance = 200.0
    val cash = 195.0
    val tax = 1.5

    val result = testWithdraw(balance, cash, tax)

    if (result>=0)
        println("GO: "+ result)
    else
        println("Oops..")

}