class Solution {
    fun minPartitions(n: String): Int {
        var count = 0
        var num1 = n.map { it }
        while (num1.isNotEmpty()) {
            count++
            num1 = num1.mapNotNull { if (it == '0' || it - 1 == '0') null else it - 1 }
        }
        return count
    }
}