import kotlin.math.max

class Solution {
    lateinit var list: MutableList<Int>
    
    fun rob(nums: IntArray): Int {
        list = MutableList(nums.size + 1) { -1 }
        return calculate(nums, 0)
    }
    
    private fun calculate(nums: IntArray, index: Int): Int {
        if (index >= nums.size) return 0
        if (list[index] != -1) return list[index]
        val sum1 = calculate(nums, index + 2) + nums[index]
        val sum2 = calculate(nums, index + 1)
        list[index] = max(sum1, sum2)
        return list[index]
    }
}