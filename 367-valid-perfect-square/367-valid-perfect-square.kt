class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var start = 0
        var end = num + 1
        while (start <= end) {
            val mid= (start + end) / 2
            val square:Long = mid.toLong() * mid.toLong()
            if (square == num.toLong())
                return true
            else if (square > num)
                end = mid - 1
            else start = mid + 1
        }
        return false
    }
}