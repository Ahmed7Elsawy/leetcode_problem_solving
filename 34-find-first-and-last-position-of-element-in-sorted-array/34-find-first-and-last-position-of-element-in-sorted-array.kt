class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.lastIndex
        var index = -1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] == target) {
                index = mid
                break
            } else if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        var start = index
        var end = index
        while (start >= 0 && start <= nums.lastIndex && nums[start] == target) start--
        while (end <= nums.lastIndex && end >= 0 && nums[end] == target) end++
        return if (start == end)
            intArrayOf(-1, -1)
        else
            intArrayOf(++start, --end)
    }
}