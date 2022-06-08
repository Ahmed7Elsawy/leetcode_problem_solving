class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val complement = arr.map { it * 2 }
        for ((index, item) in arr.withIndex()) {
            val result = complement.filterIndexed { i, it -> it == item && index != i }
            if (result.isNotEmpty())
                return true
        }
        return false
    }
}