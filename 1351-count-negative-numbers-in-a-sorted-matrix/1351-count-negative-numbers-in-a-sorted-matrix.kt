class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var sum = 0
        for (arr in grid) {
            var left = 0
            var right = arr.lastIndex
            while (right >= left) {
                val mid = (left + right) / 2
                if (arr[mid] < 0) {
                    if (mid == 0 || (mid > 0 && arr[mid - 1] >= 0)) {
                        sum += arr.size - mid
                        break
                    } else {
                        right = mid - 1
                    }
                } else {
                    left = mid + 1
                }
            }
        }

        return sum
    }
}