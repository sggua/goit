package module02.practice20160820

internal fun balancesSum(ints: IntArray): Int {
    var sum = 0
    for (anInt in ints) {
        if (anInt > 1000 && anInt < 5000) {
            sum += anInt
        }
    }
    return sum
}

internal fun getOwnerNames(balances: IntArray, names: Array<String>): Array<String?> {
    val len = balances.size
    var resCount = 0
    val result1 = arrayOfNulls<String>(len)
    for (i in 0..len - 1) {
        if (balances[i] > 1000 && balances[i] < 5000) {
            result1[resCount++] = names[i]
        }
    }

    val result2 = arrayOfNulls<String>(resCount)
    for (i in 0..resCount - 1) {
        result2[i] = result1[i]
    }

    return result2
}

fun main(args: Array<String>){

    val variable = 4
    val ownerNames = arrayOf("Alex", "Bob", "Caren", "Dude", "Eagle", "Foo", "Gine", "Hook", "Irene", "Joe")
    val balances = intArrayOf(2341, 2305, 1456, 239, 456, 5674, 347, 87653, 2345, 567)
    val balances2 = intArrayOf(20341, 205, 2456, 1239, 4056, 574, 47, 1653, 235, 5267)

/////////////////////////////////////////////////////////////
    var sum = 0
    for (i in balances.indices) {
        if (balances[i] > 1000 && balances[i] < 5000) {
            sum += balances[i]
        }
    }
    println(sum)
/////////////////////////////////////////////////////////////
    sum = 0
    for (balance in balances) {
        if (balance > 1000 && balance < 5000) {
            sum += balance
        }
    }
    println(sum)
/////////////////////////////////////////////////////////////

    println(balancesSum(balances))
    println(balancesSum(balances2))

/////////////////////////////////////////////////////////////


    for (n in getOwnerNames(balances, ownerNames)) {
        println(n)
    }


}
