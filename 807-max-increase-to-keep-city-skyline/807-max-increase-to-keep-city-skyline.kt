import kotlin.math.min

class Solution {
    private val maxColumns = mutableListOf<Int>()
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var sum = 0
        for (i in 0..grid.lastIndex) {
            val maxRow = grid[i].max() ?: 0
            for (j in 0..grid[0].lastIndex) {
                if (i == 0) {
                    var maxColumn = -1
                    for (x in 0..grid.lastIndex) {
                        if (grid[x][j] > maxColumn)
                            maxColumn = grid[x][j]
                    }
                    maxColumns.add(maxColumn)
                }
                sum += (min(maxRow, maxColumns[j]) - grid[i][j])
            }
        }
        return sum
    }
}