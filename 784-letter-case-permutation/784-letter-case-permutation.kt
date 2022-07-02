class Solution {
    private val list = mutableSetOf<String>()
//    private val list = mutableListOf<String>()
    fun letterCasePermutation(s: String): List<String> {
        list.add(s)
        permutate(s, 0)
        return list.toList()
    }

    private fun permutate(s: String, index: Int) {
        if (index >= s.length) {
            return
        }
        if (s[index].isLetter()) {
//            val s1 = s.toCharArray().apply { set(index, s[index].uppercaseChar()) }.joinToString("")
//            val s2 = s.toCharArray().apply { set(index, s[index].lowercaseChar()) }.joinToString("")
            val ch1 = s.toCharArray()
            ch1[index]= s[index].toUpperCase()
            val s1 = ch1.joinToString("")
            // val ch2 = s.toCharArray()
            ch1[index]= s[index].toLowerCase()
            val s2 = ch1.joinToString("")
            list.add(s1)
            list.add(s2)
            permutate(s1, index + 1)
            permutate(s2, index + 1)
        } else {
            permutate(s, index + 1)
        }
    }
}