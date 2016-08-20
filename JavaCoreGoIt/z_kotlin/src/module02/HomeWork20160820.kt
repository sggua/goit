package module02

    internal fun getSum(nums: IntArray): Int {
        var sum = 0
        for (num in nums) sum+=num
        return sum
    }

    internal fun getMin(nums: IntArray): Int {
        var min = 0
        for (num in nums) if (num < min) min = num
        return min
    }

    internal fun getMax(nums: IntArray): Int {
        var max = 0
        for (num in nums) if (num > max) max = num
        return max
    }

    internal fun getMaxPositive(nums: IntArray): Int {
        var maxPos = 0
        for (num in nums) if (num > 0 && num > maxPos) maxPos = num
        return maxPos
    }

    internal fun getMult(nums: IntArray): Int {
        var mult = 1
        for (num in nums) mult *= num
        return mult
    }

    internal fun getModFirstByLast(nums: IntArray): Int {
        return nums[0] % nums[nums.size - 1]
    }


fun main(args: Array<String>) {
        val numbers = intArrayOf(-21, 4, -5, -6, 7, 1, 17, -12, 11, 6)
        println("sum: " + getSum(numbers))
        println("min: " + getMin(numbers))
        println("max: " + getMax(numbers))
        println("maxPositive: " + getMaxPositive(numbers))
        println("mult: " + getMult(numbers))
        println("mod: " + getModFirstByLast(numbers))

}
