class Solution {
    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy { it }.map { it -> it.value.size to it.key }.maxBy { it.first }!!.second
    }
}