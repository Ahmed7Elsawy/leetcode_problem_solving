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
    private var root: TreeNode? = null

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {

        if (root1 == null && root2 == null) return null
        merge(root1, root2, null)
        return root
    }

    private fun merge(root1: TreeNode?, root2: TreeNode?, before: TreeNode?, isLeft: Boolean = true) {
        if (root1 == null && root2 == null) return

        val mergedVal = (root1?.`val` ?: 0) + (root2?.`val` ?: 0)
        val mergedNode = TreeNode(mergedVal)
        if (root == null) {
            root = mergedNode
        } else {
            if (isLeft) before?.left = mergedNode
            else before?.right = mergedNode
        }

        merge(root1?.left, root2?.left, mergedNode, true)
        merge(root1?.right, root2?.right, mergedNode, false)
    }

}