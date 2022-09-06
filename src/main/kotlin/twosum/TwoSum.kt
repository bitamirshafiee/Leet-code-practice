package twosum

// https://leetcode.com/problems/two-sum/

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    loop@ for (firstNumberToAdd in numbers.indices) {
        for (secondNumberToAdd in firstNumberToAdd + 1 until numbers.size) {
            val s = numbers[firstNumberToAdd] + numbers[secondNumberToAdd]
            if (s == target) {
                result.add(firstNumberToAdd)
                result.add(secondNumberToAdd)
                break@loop
            }
        }
    }
    return result.toIntArray()
}