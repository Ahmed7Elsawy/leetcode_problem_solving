class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.size
        while (true) {
            val mid = (start + end) / 2
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                return mid
            }
            if (arr[mid - 1] > arr[mid]) {
                end = mid
            }
            if (arr[mid + 1] > arr[mid]) {
                start = mid
            }
        }
    }
}