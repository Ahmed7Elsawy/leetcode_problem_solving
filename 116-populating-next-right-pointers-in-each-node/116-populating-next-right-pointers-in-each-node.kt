/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {

    private val levels = mutableListOf<Node?>()
    fun connect(root: Node?): Node? {
        dfs(root)
        return root
    }

    private fun dfs(root: Node?, level: Int = 0) {
        if (root == null) return

        if (levels.size <= level){
            root.next = null
            levels.add(level, root)
        } else {
            root.next = levels[level]
            levels[level] = root
        }
        dfs(root.right, level + 1)
        dfs(root.left, level + 1)
    }
}
