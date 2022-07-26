class Solution {

    fun rearrangeArray(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        var positive = -1
        var negative = -1
        var index = 0
        while (index < nums.size) {
            for (i in positive + 1..nums.lastIndex) {
                if (nums[i] >= 0) {
                    positive = i
                    break
                }
            }
            for (i in negative + 1..nums.lastIndex) {
                if (nums[i] < 0) {
                    negative = i
                    break
                }
            }
            arr[index] = nums[positive]
            arr[index + 1] = nums[negative]
            index += 2

        }
        return arr
    }
}