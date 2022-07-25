class Solution {
    fun processQueries(queries: IntArray, m: Int): IntArray {
        val list = MutableList(m) { it + 1 }
        val result = IntArray(queries.size)
        for ((i, item) in queries.withIndex()) {
            val index = list.indexOf(item)
            result[i] = index
            list.apply {
                removeAt(index)
                add(0, item)
            }
        }
        return result
    }
}