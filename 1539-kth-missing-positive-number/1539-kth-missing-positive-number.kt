class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var index = 0
        var k2 = k
        for (i in 1..2002) {
            if (index < arr.size && arr[index] == i) {
                index++
            } else {
                k2--
            }
            if (k2 <= 0)
                return i

        }
        return 0
    }
}