class Solution {
    fun partitionLabels(s: String): List<Int> {
        var arr = mutableListOf<Int>()
        var index = 0
        while (index < s.length) {
            val ch = s[index]
            var lastIndex = s.lastIndexOf(ch)
            if (index == lastIndex) {
                index++
                arr.add(1)
            } else {
                var index2 = index + 1
                while (index2 < lastIndex) {
                    val last = s.lastIndexOf(s[index2])
                    if (last > lastIndex)
                        lastIndex = last
                    index2++
                }
                arr.add(index2 - index + 1)
                index = index2 + 1
            }
        }
        return arr
    }
}