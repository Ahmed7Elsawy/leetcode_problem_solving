import java.util.Stack

class Solution {
    fun minRemoveToMakeValid(s: String): String {
        val stack: Stack<Char> = Stack<Char>()
        val s2 = mutableListOf<Char>()
        for (ch in s) {
            if (ch == '(') {
                stack.push('(')
                s2 += '('
            } else if (ch == ')') {
                if (stack.isNotEmpty() && stack.peek() == '(') {
                    s2 += ')'
                    stack.pop()
                }
            } else s2 += ch
        }
        while (stack.isNotEmpty()) {
            val index = s2.lastIndexOf('(')
            s2.removeAt(index)
            stack.pop()
        }
        return s2.joinToString("")
    }

}