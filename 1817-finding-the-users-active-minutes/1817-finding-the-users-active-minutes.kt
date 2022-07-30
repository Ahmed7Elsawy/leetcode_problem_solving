class Solution {
    fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
        val result = IntArray(k) { 0 }
        val map = mutableMapOf<Int, MutableSet<Int>>()
        for (i in logs) {
            if (map[i[0]] != null)
                map[i[0]]?.add(i[1])
            else
                map[i[0]] = mutableSetOf(i[1])
        }
        for (i in map) {
            result[i.value.size - 1]++
        }
        return result
    }
}