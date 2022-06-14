class Solution {
    fun findTheWinner(n: Int, k: Int): Int {
        var lastIndex = 0
        val list = MutableList(n) { it + 1 }
        while (list.size > 1) {
            val index = (lastIndex + k - 1) % list.size
            lastIndex = (index + list.size) % list.size
            list.removeAt(index)
        }
        return list.first()
    }
}