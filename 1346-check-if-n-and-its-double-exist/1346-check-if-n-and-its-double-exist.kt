class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val complement = hashMapOf<Int, Int>()
        arr.forEachIndexed { i, x -> complement[x * 2] = i }
        for ((index, item) in arr.withIndex()) {
            val result = complement.filter { it.key == item && index != it.value }
            if (result.isNotEmpty())
                return true
        }
        return false
    }
}