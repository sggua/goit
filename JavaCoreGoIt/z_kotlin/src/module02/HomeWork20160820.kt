package module02

private fun getSum(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

private fun getSum(numbers: DoubleArray): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    return sum
}

private fun getMin(numbers: IntArray): Int {
    var min = numbers[0]
    for (num in numbers) {
        if (num < min) {
            min = num
        }
    }
    return min
}

private fun getMin(numbers: DoubleArray): Double {
    var min = numbers[0]
    for (num in numbers) {
        if (num < min) {
            min = num
        }
    }
    return min
}

private fun getMax(numbers: IntArray): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

private fun getMax(numbers: DoubleArray): Double {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

private fun getSecondLargest(numbers: IntArray): Int {
    val max = getMax(numbers)
    var secondMax = Integer.MIN_VALUE
    for (num in numbers) {
        if (num > secondMax && num < max) {
            secondMax = num
        }
    }
    return secondMax
}

private fun getSecondLargest(numbers: DoubleArray): Double {
    val max = getMax(numbers)
    var secondMax = java.lang.Double.MIN_VALUE
    for (num in numbers) {
        if (num > secondMax && num < max) {
            secondMax = num
        }
    }
    return secondMax
}

private fun getMaxPositive(numbers: IntArray): Int {
    var maxPos = -1
    for (num in numbers) {
        if (num > 0 && num > maxPos) {
            maxPos = num
        }
    }
    return maxPos
}

private fun getMaxPositive(numbers: DoubleArray): Double {
    var maxPos = -1.0
    for (num in numbers) {
        if (num > 0 && num > maxPos) {
            maxPos = num
        }
    }
    return maxPos
}

private fun getMultiplied(numbers: IntArray): Int {
    var multiplied = 1
    for (num in numbers) {
        multiplied *= num
    }
    return multiplied
}

private fun getMultiplied(numbers: DoubleArray): Double {
    var multiplied = 1.0
    for (num in numbers) {
        multiplied *= num
    }
    return multiplied
}

private fun getModFirstByLast(numbers: IntArray): Int {
    return numbers[0] % numbers[numbers.size - 1]
}

private fun getModFirstByLast(numbers: DoubleArray): Double {
    return numbers[0] % numbers[numbers.size - 1]
}


fun main(args: Array<String>) {
    val numbersInt = intArrayOf(21, -4, 5, -6, 7, -1, 17, 1, 11, 6)
    val numbersDouble = doubleArrayOf(2.1, -0.4, 5.7, -3.6, 7.6, -1.0, 17.3, 0.1, 11.9, 6.3)
    println("INTEGER PART")
    println("sum: " + getSum(numbersInt))
    println("min: " + getMin(numbersInt))
    println("max: " + getMax(numbersInt))
    println("maxPositive: " + getMaxPositive(numbersInt))
    println("multiplied: " + getMultiplied(numbersInt))
    println("mod: " + getModFirstByLast(numbersInt))
    println("secondLargest: " + getSecondLargest(numbersInt))
    println("\nDOUBLE PART")
    println("sum: " + getSum(numbersDouble))
    println("min: " + getMin(numbersDouble))
    println("max: " + getMax(numbersDouble))
    println("maxPositive: " + getMaxPositive(numbersDouble))
    println("multiplied: " + getMultiplied(numbersDouble))
    println("mod: " + getModFirstByLast(numbersDouble))
    println("secondLargest: " + getSecondLargest(numbersDouble))

}
