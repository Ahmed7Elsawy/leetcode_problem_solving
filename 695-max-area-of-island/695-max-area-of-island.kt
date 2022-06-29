import kotlin.math.max

class Solution {
    private var size = 0
    private val visited = mutableListOf<Pair<Int, Int>>()
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {

        for (i in 0..grid.lastIndex) {
            for (j in 0..grid[0].lastIndex) {
                val x = visited.filter { it.first == i && it.second == j }
                if (grid[i][j] == 1 && x.isEmpty()) {
                    dfs(grid, i, j, 0)
                }
            }
        }

        return size
    }

    private fun dfs(grid: Array<IntArray>, i: Int, j: Int, currentSize: Int): Int {
        if (grid[i][j] == 0) return currentSize
        val x = visited.filter { it.first == i && it.second == j }
        if (x.isNotEmpty()) return currentSize

        visited.add(i to j)
        var cs = currentSize + 1

        if (i - 1 >= 0)
            cs = max(cs, dfs(grid, i - 1, j, cs))

        if (j - 1 >= 0)
            cs = max(cs, dfs(grid, i, j - 1, cs))

        if (i + 1 < grid.size)
            cs = max(cs, dfs(grid, i + 1, j, cs))

        if (j + 1 < grid[0].size)
            cs = max(cs, dfs(grid, i, j + 1, cs))

        if (cs > size)
            size = cs

        return cs
    }
}