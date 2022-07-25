
class Solution {
    fun processQueries(queries: IntArray, m: Int): IntArray {
        val list2 = Array(m) { it + 1 }
        println(list2.joinToString())
        val result = mutableListOf<Int>()
        for (i in queries) {
            val index = list2.indexOf(i)
            result.add(index)
            for (index in index downTo 1) {
                list2[index] = list2[index - 1]
            }
            list2[0] = i
        }
        return result.toIntArray()
    }
}