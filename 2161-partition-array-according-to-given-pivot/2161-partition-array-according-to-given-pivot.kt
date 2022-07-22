class Solution {
    private val list1 = mutableListOf<Int>()
    private val list2 = mutableListOf<Int>()
    private val list3 = mutableListOf<Int>()
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        for (number in nums) {
            if (number < pivot)
                list1.add(number)
            else if (number == pivot)
                list2.add(number)
            else
                list3.add(number)
        }
        return (list1 + list2 + list3).toIntArray()
    }
}