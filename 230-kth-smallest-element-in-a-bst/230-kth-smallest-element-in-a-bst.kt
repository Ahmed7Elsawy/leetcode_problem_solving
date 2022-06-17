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
    
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        return kthSmallestNode(root, k).second?.`val` ?: 0
    }

    private fun kthSmallestNode(root: TreeNode?, k: Int, index: Int = 0): Pair<Int, TreeNode?> {

        if (root == null) {
            return index to root
        }

        var pair1: Pair<Int, TreeNode?>? = null
        if (root.left != null)
            pair1 = kthSmallestNode(root.left, k, index)

        if (pair1?.first == k) {
            return pair1
        }

        val index2 = when (pair1?.first) {
            null -> index + 1
            index -> pair1.first
            else -> pair1.first + 1
        }

        if (index2 == k) {
            return index2 to root
        }

        val nod2 = kthSmallestNode(root.right, k, index2)
        return if (root.right != null) {
            nod2
        }else index2 to root
    }


}