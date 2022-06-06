class Solution {
    fun specialArray(nums: IntArray): Int {
        nums.sort()
        for (i in 1..100)
            for (j in 0..nums.lastIndex) {
                if (nums[j] >= i){
                    if (i == nums.size - j)
                        return i
                    else
                        break
                }
            }
        return -1
    }
}