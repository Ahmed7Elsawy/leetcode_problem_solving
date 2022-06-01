class Solution {
    fun singleNumber(nums: IntArray): Int {
        val sortedArray = nums.sortedBy { it }
        return sortedArray.filterIndexed { index, value -> 
            !(index > 0 && value == sortedArray[index - 1] ||
                index < sortedArray.lastIndex && value == sortedArray[index + 1]) }
        .first()
    }
}