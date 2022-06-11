class Solution {
    fun findMin(nums: IntArray): Int {
        var start = 0
        var end = nums.lastIndex
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[start] <= nums[end]) {
                return nums[start]
            }
            if (nums[mid] > nums[end]) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        return nums[0]
    }
}