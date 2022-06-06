import kotlin.math.max
import kotlin.math.min

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var complement = numbers.map { target - it }
        for ((index, item) in complement.withIndex()) {
            var index2 = numbers.indexOfFirst { it == item }
            if (index2 >= 0 && index != index2) {
                return intArrayOf(min(index, index2) + 1, max(index, index2) + 1)
            }
        }
        return intArrayOf(0, 0)
    }
}