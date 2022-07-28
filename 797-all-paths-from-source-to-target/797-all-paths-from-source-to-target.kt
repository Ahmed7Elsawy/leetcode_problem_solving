class Solution {
    private val list = mutableListOf<List<Int>>()
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        fun dfs(index: Int, currentList: List<Int>) {
            for (i in graph[index]) {
                if (i == graph.lastIndex) {
                    list.add(currentList + i)
                } else
                    dfs(i, currentList + i)
            }
        }
        
        dfs(0, listOf(0))
        return list
    }
}