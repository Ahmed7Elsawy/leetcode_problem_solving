import kotlin.math.sqrt

class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        var left = 0
        var right = sqrt(c.toFloat()).toInt()
        while (left <= right) {
            val result = left.toLong() * left + right * right
            if (result == c.toLong()) {
                return true
            } else if (result > c) {
                right--
            } else if (result < c) {
                left++
            }
        }
        return false
    }
}