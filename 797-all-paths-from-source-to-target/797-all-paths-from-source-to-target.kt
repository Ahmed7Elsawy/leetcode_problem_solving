class Solution {
    private lateinit var graph1: Array<IntArray>
    private val list = mutableListOf<List<Int>>()
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        graph1 = graph
        bfs(0, listOf(0))
        return list
    }

    private fun bfs(index: Int, currentList: List<Int>) {
        if (index == graph1.lastIndex) {
            list.add(currentList)
        }
        for (i in graph1[index]) {
            bfs(i, currentList.toMutableList().apply { add(i) })
        }
    }

}