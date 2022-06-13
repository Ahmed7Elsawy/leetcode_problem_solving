class Solution {
    fun longestPalindrome(s: String): Int {
        var takeOdd = false
        var count = 0
        val map = s.toCharArray().groupBy { it }.map { it to it.value.count() }

        for (i in map) {
            if (i.second > 1) {
                if (i.second % 2 == 0) {
                    count += i.second
                } else {
                    count += i.second - 1
                    if (!takeOdd) {
                        count++
                        takeOdd = true
                    }
                }
            } else if (!takeOdd) {
                count++
                takeOdd = true
            }
        }
        return count
    }
}