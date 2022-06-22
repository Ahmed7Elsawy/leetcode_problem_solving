import java.util.Stack

    
class Solution {
    private val list = mutableListOf<String>()
    
    fun generateParenthesis(n: Int): List<String> {
        generate(n * 2)
       
        return list
    }

    private fun generate(n: Int, s: String = "") {
        if (n == 0) {
            if (isAccept(s))
                list.add(s)
            return
        }

        if (s.isNotEmpty() && s[0] == ')') return

        generate(n - 1, "$s(")
        generate(n - 1, "$s)")
    }

    private fun isAccept(s: String): Boolean {
        val stack = Stack<Char>()
        for (i in s) {
            if (i == '(') {
                stack.push(i)
            } else if (stack.isNotEmpty() && stack.peek() == '(') {
                stack.pop()
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}
