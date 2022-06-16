/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private val list = mutableListOf<Int>()
    var lastLevel = -1
    fun rightSideView(root: TreeNode?): List<Int> {

        dfs(root, 0)

        return list
    }

    private fun dfs(root: TreeNode?, level: Int = 0) {
        if (root == null)
            return

        while (level > lastLevel) {
            list.add(root.`val`)
            lastLevel = level
        }
        dfs(root.right, level + 1)
        dfs(root.left, level + 1)
    }

}
