class Solution {
    
    fun frequencySort(s: String): String {
        val x = s.toCharArray().groupBy { it }
            .map { it.key to it.value.size }.sortedByDescending { it.second }
        val arr = StringBuilder()
        for (i in x) {
            repeat(i.second) {
                arr.append(i.first)
            }
        }
        return arr.toString()
    }

}