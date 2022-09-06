package twosum

// https://leetcode.com/problems/two-sum/

//O(n2)
fun twoSumMySolution(numbers: IntArray, target: Int): IntArray {
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

//O(n2)
fun twoSumCleaner(numbers: IntArray, target: Int): IntArray? {
    for (firstNumberToAdd in numbers.indices) {
        for (secondNumberToAdd in firstNumberToAdd + 1 until numbers.size) {
            val s = numbers[firstNumberToAdd] + numbers[secondNumberToAdd]
            if (s == target) {
                return intArrayOf(firstNumberToAdd,secondNumberToAdd)
            }
        }
    }
    return null
}

//O(n)
fun twoSum(numbers: IntArray, target: Int): IntArray? {
    val hashMap = hashMapOf<Int,Int>()
    for (index in numbers.indices){
        hashMap[numbers[index]] = index
    }
    for (index in numbers.indices){
        val complement = target - numbers[index]
        if (hashMap.containsKey(complement) && hashMap[complement] != index){
            return intArrayOf(index, hashMap.getValue(complement))
        }
    }
    return null
}

