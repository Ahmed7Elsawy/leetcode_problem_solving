class Solution {
    fun searchInsert(nums: IntArray, target: Int, start: Int = 0, end: Int = nums.lastIndex): Int {
        if (end <= start) {
            if (nums[start] < target) return start + 1
            return start
        }
        val mid = (start + end) / 2
        if (nums[mid] == target) return mid
        return if (nums[mid] < target) {
            searchInsert(nums, target, mid + 1, end)
        } else {
            searchInsert(nums, target, start, mid - 1)
        }


    }

}