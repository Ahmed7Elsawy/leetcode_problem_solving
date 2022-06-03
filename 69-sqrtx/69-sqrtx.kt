class Solution {
    fun mySqrt(x: Int): Int {
        var start = 0
        var end = x 
        val x1 = x.toLong()
        var value = 0
        while (start <= end) {
            val mid = ((start + end.toLong()) / 2).toInt()
            val square = mid.toLong() * mid
            if (square == x1) {
                value = mid
                break
            } else if (square > x1) {
                end = mid - 1
                value = mid - 1
            } else //if (square < x)
            {
                start = mid + 1
                value = mid
            }
        }

        return value
    }
}