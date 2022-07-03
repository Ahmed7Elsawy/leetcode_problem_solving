class Solution {
    lateinit var list: MutableList<Int>
    fun climbStairs(n: Int): Int {
        list = MutableList(n + 1) { -1 }
        calculate(n)
        return list[n]
    }

    private fun calculate(n: Int): Int {
        if (n == 0) {
            return 1
        }
        if (n < 0) return 0
        if (list[n] != -1) return list[n]
        var c = calculate(n - 1)
        c += calculate(n - 2)
        list[n] = c
        return list[n]
    }
}
