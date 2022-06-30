import kotlin.math.min

class Solution {

    private lateinit var arr: Array<IntArray>
    private lateinit var arr2: Array<IntArray>
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        arr = mat
        arr2 = Array(mat.size) { (IntArray(mat[0].size) { -1 }) }
        for (i in 0..mat.lastIndex)
            for (j in 0..mat[0].lastIndex)
                bfs(i, j, -1, -1)

        return arr
    }

    private fun bfs(i: Int, j: Int, i1: Int, j1: Int): Int {
        if (arr[i][j] == 0){
            arr2[i][j] = 0
            return 0
        }
        var m = 10000000
        if (i - 1 >= 0 && i - 1 != i1 && arr2[i - 1][j] != -1) {
            m = min(arr[i - 1][j] + 1, m)
            if (m == 1) {
                arr[i][j] = m
                arr2[i][j] = m
                return m
            }
        }
        if (j - 1 >= 0 && j - 1 != j1 && arr2[i][j - 1] != -1)
            m = min(arr[i][j - 1] + 1, m)
        if (m == 1) {
            arr[i][j] = m
            arr2[i][j] = m
            return m
        }
        if (i + 1 < arr.size && i + 1 != i1)
            m = min(bfs(i + 1, j, i, j) + 1, m)
        if (m == 1) {
            arr[i][j] = m
            arr2[i][j] = m
            return m
        }
        if (j + 1 < arr[0].size && j + 1 != j1)
            m = min(bfs(i, j + 1, i, j) + 1, m)

        arr[i][j] = m
        arr2[i][j] = m
        return m
    }
    
}
