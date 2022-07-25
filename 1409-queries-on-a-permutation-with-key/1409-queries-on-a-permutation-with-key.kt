class Solution {
    fun processQueries(queries: IntArray, m: Int): IntArray {
        val list = MutableList(m) { it + 1 }
        val result = mutableListOf<Int>()
        for (i in queries) {
            val index = list.indexOf(i)
            result.add(index)
            list.removeAt(index)
            list.add(0, i)
        }
        return result.toIntArray()
    }
}
