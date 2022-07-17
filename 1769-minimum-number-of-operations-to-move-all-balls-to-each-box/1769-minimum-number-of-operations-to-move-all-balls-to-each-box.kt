import kotlin.math.abs

class Solution {
    private lateinit var result: IntArray
    fun minOperations(boxes: String): IntArray {
        result = IntArray(boxes.length) { 0 }

        for (i in boxes.indices) {
            for (j in boxes.indices) {
                if (boxes[j] == '1') {
                    result[i] += abs(i - j)
                }
            }
        }
        return result
    }
}