import kotlin.math.pow

class Solution {
    // you need treat n as an unsigned value
   fun hammingWeight(n: Int): Int {
        var count = 0
        var num = n.toUInt().toLong()
        for (i in 32.toLong() downTo 0) {
            val res = 2.toDouble().pow(i.toDouble()).toLong()
            if (num >= res) {
                num -= res.toLong()
                count++
                if (num == 0.toLong())
                    break
            }

        }
        return count
    }
   
}