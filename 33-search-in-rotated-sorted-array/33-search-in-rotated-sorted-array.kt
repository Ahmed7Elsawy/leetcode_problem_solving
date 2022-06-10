class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.lastIndex
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[start] <= nums[end]) {
                if (nums[mid] >= target) {
                    end = mid - 1
                } else {
                    start = mid + 1
                }
            } else {
                if (nums[start] == target) {
                    return start
                }
                if (nums[end] == target) {
                    return end
                }
                if (nums[start] > target && nums[end] < target)
                    break

                if (nums[mid] < target) {
                    if (nums[start] <= nums[mid] || nums[end] > target) {
                        start = mid + 1
                    } else {
                        end = mid - 1
                    }
                } else if(nums[mid] > target){
                    if (nums[start] <= target || nums[end] >= nums[mid] ) {
                        end = mid -1
                    }else
                        start = mid + 1
                }
            }
        }
        return -1
    }
}