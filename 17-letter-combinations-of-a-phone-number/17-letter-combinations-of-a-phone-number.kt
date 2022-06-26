class Solution {
    private val list = mutableListOf<String>()
    
    fun letterCombinations(digits: String): List<String> {
        calculate(0, digits)
        return list
    }

    private fun calculate(index: Int, digits: String, s: String = "") {

        if (index == digits.length) {
            if (s.isNotEmpty())
                list.add(s)
            return
        }
        val num = digits[index] - '2'
        var char = 'a' + num * 3
        if (num == 6 || num == 7)
            char++
        calculate(index + 1, digits, s + (char))
        calculate(index + 1, digits, s + (char + 1))
        calculate(index + 1, digits, s + (char + 2))
        if (digits[index] == '7' || digits[index] == '9')
            calculate(index + 1, digits, s + (char + 3))

    }
    
}