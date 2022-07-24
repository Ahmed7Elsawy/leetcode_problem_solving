class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var totalCount = 0
        var lastcount = 0
        for (line in bank) {
            val lineCount = line.count { it == '1' }
            if (lineCount > 0) {
                totalCount += lastcount * lineCount
                lastcount = lineCount
            }
        }
        return totalCount
    }
}