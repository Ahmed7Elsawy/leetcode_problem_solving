class Solution {
    
    
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        val visitedList = mutableSetOf<Int>()
        val resultList = mutableListOf<Int>()

        for (i in edges.indices) {
            visitedList.add(edges[i][1])
        }
        for (i in 0 until n) {
            if (!visitedList.contains(i)) {
                resultList.add(i)
            }
        }
        return resultList
    }
    
}