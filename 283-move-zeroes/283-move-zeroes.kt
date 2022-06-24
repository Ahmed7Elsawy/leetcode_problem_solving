class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastIndex = nums.lastIndex
        var i = 0
        while (i < lastIndex) {
            if (nums[i] != 0) i++
            else {
                for (j in i until lastIndex) {
                    nums[j] = nums[j + 1]
                }
                nums[lastIndex] = 0
                lastIndex--
            }
        }
    }
}

