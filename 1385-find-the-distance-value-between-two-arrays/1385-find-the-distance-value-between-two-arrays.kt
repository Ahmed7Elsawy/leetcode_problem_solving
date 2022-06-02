import kotlin.math.abs

class Solution {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        var count = 0
        for (i in 0..arr1.lastIndex) {
            var flag = true
            for (j in 0..arr2.lastIndex) {
                if (abs(arr1[i] - arr2[j]) <= d) {
                    flag = false
                    break
                }
            }
            if (flag)
                count++
        }
        return count
    }
}