class Solution {
    fun minPartitions(n: String): Int {
        var count = 0
        var num = n
        while (num.isNotEmpty()) {
            count++
            num = num.mapNotNull { if (it == '0') null else it - 1 }.joinToString("")
            if (num.all { it == '0' })
                break
        }
        return count
    }
}