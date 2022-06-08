class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        return mat.mapIndexed { index, arr -> index to arr }
            .sortedBy { soldiersCount(it.second) }.map { it.first }.take(k)
            .toIntArray()
    }
    
    fun soldiersCount(arr: IntArray): Int {
        var left = 0;
        var right = arr.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2
            if (arr[mid] == 1) {
                if (mid == arr.lastIndex || mid + 1 < arr.size && arr[mid + 1] == 0) {
                    return mid + 1
                }
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return 0
    }
    
}