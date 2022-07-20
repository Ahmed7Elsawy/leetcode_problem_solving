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
    var sum = 0
    fun sumEvenGrandparent(root: TreeNode?): Int {
        root?.let {
            calculate(it, grandParent = false, parent = false)
        }
        return sum
    }

    private fun calculate(root: TreeNode, grandParent: Boolean, parent: Boolean) {
        if (grandParent) {
            sum += root.`val`
        }
        root.left?.let {
            calculate(it, parent, root.`val` % 2 == 0)
        }
        root.right?.let {
            calculate(it, parent, root.`val` % 2 == 0)
        }
    }

}