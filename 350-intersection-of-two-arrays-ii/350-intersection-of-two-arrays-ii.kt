class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val nums3 = nums2.toMutableList()
        for (i in nums1) {
            var index = nums3.indexOfFirst { item -> item == i }
            if (index >= 0) {
                result.add(i)
                nums3.removeAt(index)
            }
        }
        return result.toIntArray()
    }
}