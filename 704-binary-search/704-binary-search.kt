class Solution {
    fun search(nums: IntArray, target: Int, start: Int = 0, end: Int = nums.lastIndex): Int {
        val avg = (start + end) / 2
        if (start > end || nums[start] > target || nums[end] < target) {
            return -1
        }

        if (nums[avg] == target) {
            return avg
        }

        if (nums[avg] > target) {
            return search(nums, target, 0, avg - 1)
        }

        return search(nums, target, avg + 1, end)
    }

}