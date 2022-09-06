import twosum.twoSum

fun main(args: Array<String>) {

    val result = twoSum(arrayOf(5, 7, 9, 45, 90, 13, 20).toIntArray(), 33)
    print(result?.joinToString())

}