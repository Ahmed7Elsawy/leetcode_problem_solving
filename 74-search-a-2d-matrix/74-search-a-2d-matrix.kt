class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var startArr = 0
        var endArr = matrix.lastIndex
        while (startArr <= endArr) {
            val mid = (startArr + endArr) / 2
            if (matrix[mid][0] <= target 
                && matrix[mid][matrix[mid].lastIndex] >= target) {
                for (i in matrix[mid]) {
                    if (i == target)
                        return true
                }
                return false
            }
            if (matrix[mid][0] > target) {
                endArr = mid - 1
            } else if (matrix[mid][0] < target) {
                startArr = mid + 1
            } else break
        }
        return false
    }
}