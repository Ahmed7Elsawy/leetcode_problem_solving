class Solution {

    private lateinit var grid1: Array<IntArray>
    private lateinit var grid2: Array<IntArray>
    fun orangesRotting(grid: Array<IntArray>): Int {

        grid1 = grid.map { it.clone() }.toTypedArray()
        grid2 = grid.map { it.clone() }.toTypedArray()
        var count = 0
        var changed = true
        while (changed) {
            changed = false
            count++
            for (i in 0..grid.lastIndex) {
                for (j in 0..grid[0].lastIndex) {
                    if (grid2[i][j] == 1) {
                        if (i - 1 >= 0 && grid1[i - 1][j] == 2) {
                            grid2[i][j] = 2
                            changed = true
                        } else if (j - 1 >= 0 && grid1[i][j - 1] == 2) {
                            grid2[i][j] = 2
                            changed = true
                        } else if (i + 1 < grid.size && grid1[i + 1][j] == 2) {
                            grid2[i][j] = 2
                            changed = true
                        } else if (j + 1 < grid[0].size && grid1[i][j + 1] == 2) {
                            grid2[i][j] = 2
                            changed = true
                        }
                    }
                }
            }
            grid1 = grid2.map { it.clone() }.toTypedArray()
        }

        for (i in 0..grid.lastIndex)
            for (j in 0..grid[0].lastIndex)
                if (grid2[i][j] == 1) {
                    return -1
                }

        return --count
    }
}