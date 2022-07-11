class Solution {
    private val list = mutableListOf<List<Int>>()
    fun subsets(nums: IntArray): List<List<Int>> {
        list.add(emptyList())
        sub(nums, listOf(), 0)
        return list
    }

    private fun sub(nums: IntArray, oldList: List<Int>, index: Int) {
        if (index >= nums.size)
            return
        val newList = oldList.toMutableList().apply { add(nums[index]) }
        list.add(newList)
        sub(nums, oldList, index + 1)
        sub(nums, newList.toList(), index + 1)
    }
}