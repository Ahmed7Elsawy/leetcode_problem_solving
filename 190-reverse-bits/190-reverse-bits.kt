import kotlin.math.pow

class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var num = n.toUInt().toLong()
        var result: Long = 0
        for (i in 31.toLong() downTo 0) {
            val res = 2.toDouble().pow(i.toDouble()).toLong()
            if (num >= res) {
                result += 2.toDouble().pow((31.0 - i)).toLong()
                num -= res
            }
        }
        return result.toInt()
    }
}