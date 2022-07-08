class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val list = nums.toMutableList()
        list.addAll(nums.toMutableList())
        return list.toIntArray()
    }
}