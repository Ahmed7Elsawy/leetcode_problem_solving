class Solution {
    fun sortColors(nums: IntArray): Unit {
        for (i in 0..nums.lastIndex) {
            var min = i
            for (j in (i + 1)..nums.lastIndex) {
                if (nums[j] < nums[min]) {
                    min = j
                }
                if (i > 0 && nums[j] == nums[i - 1]) {
                    min = j
                    break
                }
            }
            if (min != i) {
                val temp = nums[min]
                nums[min] = nums[i]
                nums[i] = temp
            }
        }
        println(nums.joinToString())
    }
}