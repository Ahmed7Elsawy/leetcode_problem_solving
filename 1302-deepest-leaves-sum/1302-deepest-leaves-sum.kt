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
    private val arr = mutableListOf<Int>()
    fun deepestLeavesSum(root: TreeNode?): Int {
        if (root == null) return 0
        sum(root, 0)
        return arr.last()
    }

    private fun sum(root: TreeNode, level: Int) {
        if (level >= arr.size) {
            arr.add(root.`val`)
        } else if (level == arr.lastIndex) {
            arr[level] = arr[level] + root.`val`
        }
        root.left?.let { sum(it, level + 1) }
        root.right?.let { sum(it, level + 1) }
    }
}