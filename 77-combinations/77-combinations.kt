class Solution {
    private val list = mutableListOf<List<Int>>()
    fun combine(n: Int, k: Int): List<List<Int>> {
        combine(n, k, 1, emptyList())
        return list
    }

    private fun combine(n: Int, k: Int, current: Int, list2: List<Int>) {
        if (list2.size == k) {
            list.add(list2)
            return
        }
        if (list2.size > k || current > n || list2.size + n - current + 1 < k) return

        combine(n, k, current + 1, list2.toMutableList().apply { add(current) })
        combine(n, k, current + 1, list2)
    }
}