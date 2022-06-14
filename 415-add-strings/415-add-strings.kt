class Solution {
    fun addStrings(num1: String, num2: String): String {
        var index1 = num1.lastIndex
        var index2 = num2.lastIndex
        var hold = "0"
        val list = mutableListOf<String>()
        while (index1 >= 0 || index2 >= 0) {
            val n1 = if (index1 >= 0) num1[index1].toString() else "0"
            val n2 = if (index2 >= 0) num2[index2].toString() else "0"
            val result = hold.toInt() + n1.toInt() + n2.toInt()
            val res = result % 10
            hold = (result / 10).toString()
            list.add(0, res.toString())
            index1--
            index2--
        }
        if (hold != "0")
            list.add(0, hold)

        return list.joinToString("")
    }
}