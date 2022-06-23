class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val list = MutableList<Int>(nums.size) { 0 }
        for (i in 0..nums.lastIndex) {
            list[(i + k) % nums.size] = nums[i]
        }
        for (i in 0..nums.lastIndex) {
            nums[i] = list[i]
        }
    }
}