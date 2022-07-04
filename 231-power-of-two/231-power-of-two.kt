import kotlin.math.pow

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 1) return true
        if (n % 2 == 1) return false
        var num = 1
        while (2.toDouble().pow(num.toDouble()) < n) {
            num++
        }
        return 2.toDouble().pow(num.toDouble()).toInt() == n
    }
}
