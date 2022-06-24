class Solution {
    
    fun moveZeroes(nums: IntArray): Unit {
        val list = nums.filter { it != 0 }
        for (i in 0..list.lastIndex) {
            nums[i] = list[i]
        }
        for (i in list.size..nums.lastIndex) {
            nums[i] = 0
        }
        println(nums.joinToString())
    }
    
}
