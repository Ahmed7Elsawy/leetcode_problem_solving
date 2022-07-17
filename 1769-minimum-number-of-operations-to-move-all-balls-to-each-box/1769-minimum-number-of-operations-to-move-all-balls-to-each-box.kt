import kotlin.math.abs

class Solution {
    private lateinit var result: IntArray
    fun minOperations(boxes: String): IntArray {
        result = IntArray(boxes.length) { 0 }
        for (i in boxes.indices) {
            if (boxes[i] == '0') continue
            for (j in boxes.indices) {
                result[j] += abs(i - j)
            }
        }
        return result
    }
}