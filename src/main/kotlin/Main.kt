import twosum.twoSumCleaner

fun main(args: Array<String>) {

    val result = twoSumCleaner(arrayOf(5, 7, 9, 45, 90, 13, 20).toIntArray(), 33)
    print(result?.joinToString())

}