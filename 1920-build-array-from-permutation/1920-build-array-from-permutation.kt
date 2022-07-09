class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val arr = nums.toMutableList()
        arr.forEachIndexed { index, i -> arr[index] = nums[i] }
        return arr.toIntArray()
    }
}