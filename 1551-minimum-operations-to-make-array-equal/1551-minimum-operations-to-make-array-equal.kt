
class Solution {
    fun minOperations(n: Int): Int {
        var num = 0
        var mid = n / 2
        if (n % 2 == 0) mid--
        val standard = if (n % 2 == 1) mid * 2 + 1 else mid * 2 + 2
        for (i in 0..mid) {
            num += standard - (i * 2 + 1)
        }
        return num
    }
}