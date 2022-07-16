import kotlin.math.min

class Solution {
    private val max = mutableListOf<MutableList<Int>>()
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var sum = 0
        for (i in 0..grid.lastIndex) {
            max.add(mutableListOf())
            for (j in 0..grid[0].lastIndex) {
                var maxColumn = -1
                for (x in 0..grid.lastIndex) {
                    if (grid[x][j] > maxColumn)
                        maxColumn = grid[x][j]
                }
                max[i].add(min(grid[i].max() ?: 0, maxColumn))
                sum += (max[i][j] - grid[i][j])
            }
        }
        return sum
    }
}