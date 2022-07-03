import kotlin.math.min

class Solution {

    private lateinit var myTriangle: List<MutableList<Int>>
    fun minimumTotal(triangle: List<List<Int>>): Int {
        myTriangle =
            List<MutableList<Int>>(triangle.size){ index ->  MutableList<Int>(triangle[index].size) { -1 } }

        return calculate(triangle, 0, 0)
    }

    private fun calculate(triangle: List<List<Int>>, i: Int, j: Int): Int {
        if (i >= triangle.size) return 0
        if (j >= triangle[i].size) return 100000

        if (myTriangle[i][j] != -1) return myTriangle[i][j]

        val path2 = calculate(triangle, i + 1, j)
        val path3 = calculate(triangle, i + 1, j + 1)
        myTriangle[i][j] = triangle[i][j] + min(path2, path3)
        return myTriangle[i][j]
    }

}