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
    var last = 0
    fun bstToGst(root: TreeNode?): TreeNode? {
        root?.let { dfs(root) }
        return root
    }

    fun dfs(root: TreeNode) {
        root.right?.let { dfs(it) }
        root.`val` += last
        last = root.`val`
        root.left?.let { dfs(it) }
    }
}