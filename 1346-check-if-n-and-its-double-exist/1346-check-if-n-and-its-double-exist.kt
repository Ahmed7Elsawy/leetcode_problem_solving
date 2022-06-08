class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        for ((index, item) in arr.withIndex()) {
            val result = 
            arr.filterIndexed { i, value -> value == item * 2 && index != i }
            if (result.isNotEmpty())
                return true
        }
        return false
    }
}