class Solution {
    private val list = mutableListOf<Int>()
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        for (i in s.indices) {
            dfs(n, startPos, s, Pair(startPos[0], startPos[1]), 0, i)
        }
        return list.toIntArray()
    }

    private fun dfs(n: Int, startPos: IntArray, s: String, currentPos: Pair<Int, Int>, count: Int, index: Int) {
        if (currentPos.first < 0 || currentPos.first >= n || currentPos.second < 0 || currentPos.second >= n) {
            list.add(count - 1)
            return
        }
        if (s.length == index) {
            list.add(count)
            return
        }
        when (s[index]) {
            'U' -> dfs(n, startPos, s,
                       Pair(currentPos.first - 1, currentPos.second),count + 1, index + 1)
            'D' -> dfs(n, startPos, s,
                       Pair(currentPos.first + 1, currentPos.second), count + 1, index + 1)
            'L' -> dfs(n, startPos, s,
                       Pair(currentPos.first, currentPos.second - 1), count + 1, index + 1)
            'R' -> dfs(n, startPos, s,
                       Pair(currentPos.first, currentPos.second + 1), count + 1, index + 1)
        }
    }
}