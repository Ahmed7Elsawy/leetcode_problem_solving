class Solution {
    fun arrangeCoins(n: Int): Int {
        var current = n
        var row = 1
        while (current >= row) {
            current -= row++
        }
        return row - 1
    }
}