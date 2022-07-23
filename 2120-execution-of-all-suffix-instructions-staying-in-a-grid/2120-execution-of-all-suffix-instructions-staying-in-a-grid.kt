class Solution {
    private val list = mutableListOf<Int>()
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        for (i in s.indices) {
            dfs(n, startPos, s.substring(i), Pair(startPos[0], startPos[1]), 0)
        }
        return list.toIntArray()
    }

    private fun dfs(n: Int, startPos: IntArray, s: String, currentPos: Pair<Int, Int>, count: Int) {
        if (currentPos.first < 0 || currentPos.first >= n || currentPos.second < 0 || currentPos.second >= n) {
            list.add(count - 1)
            return
        }
        if (s.isEmpty()) {
            list.add(count)
            return
        }
        when (s[0]) {
            'U' -> dfs(n, startPos, s.substring(1),
                       Pair(currentPos.first - 1, currentPos.second), count + 1)
            'D' -> dfs(n, startPos, s.substring(1),
                       Pair(currentPos.first + 1, currentPos.second), count + 1)
            'L' -> dfs(n, startPos, s.substring(1),
                       Pair(currentPos.first, currentPos.second - 1), count + 1)
            'R' -> dfs(n, startPos, s.substring(1),
                       Pair(currentPos.first, currentPos.second + 1), count + 1)
        }
    }
}