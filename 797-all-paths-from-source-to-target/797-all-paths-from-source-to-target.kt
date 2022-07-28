class Solution {
    private val list = mutableListOf<List<Int>>()
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        bfs(0, listOf(0), graph)
        return list
    }
    private fun bfs(index: Int, currentList: List<Int>, graph1: Array<IntArray>) {
        for (i in graph1[index]) {
            if (i == graph1.lastIndex) {
                list.add(currentList.toMutableList().apply { add(i) })
            } else
                bfs(i, currentList.toMutableList().apply { add(i) }, graph1)
        }
    }
}