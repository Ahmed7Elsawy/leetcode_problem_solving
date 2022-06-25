class Solution {
    fun reverseString(s: CharArray): Unit {
        for (i in 0..s.lastIndex / 2) {
            val x = s[i]
            s[i] = s[s.lastIndex - i]
            s[s.lastIndex - i] = x
        }
    }
}