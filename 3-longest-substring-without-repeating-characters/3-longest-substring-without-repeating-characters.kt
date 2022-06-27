class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length <= 1) return s.length
        var max = 0
        for (i in 0..s.lastIndex) {
            val set = hashSetOf<Char>()
            for (ch in i..s.lastIndex) {
                if (ch == s.lastIndex) {
                    if (set.contains(s[ch]) && set.size > max) max = set.size
                    else if (!set.contains(s[ch]) && set.size + 1 > max) max = set.size + 1
                } else if (set.contains(s[ch])) {
                    if (set.size > max) max = set.size
                    set.clear()
                    set.add(s[ch])
                    break
                }
                set.add(s[ch])
            }
        }
        return max
    }
}