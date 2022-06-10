import kotlin.math.max
class Solution {
    fun maxDistance(nums1: IntArray, nums2: IntArray): Int {
        var result = -1
        for (i in 0..nums1.lastIndex) {
            var start = i
            var end = nums2.lastIndex
            while (start <= end) {
                val mid = (start + end) / 2
                if (nums1[i] > nums2[mid]) {
                    end = mid - 1
                } else {
                    if (mid - i >= result)
                        result = mid - i
                    start = mid + 1
                }
            }
        }
        return max(result, 0)
    }
}