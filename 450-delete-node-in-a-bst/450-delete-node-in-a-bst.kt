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
    private fun TreeNode.nextLowestNode(): TreeNode = generateSequence(this.left) { it.right }.last()

    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return null

        return when (key) {
            in Int.MIN_VALUE until root.`val` -> root.apply { left = deleteNode(left, key) }
            root.`val` -> {
                root.left ?: return root.right
                root.right ?: return root.left
                val nextLowest = root.nextLowestNode()
                root.apply { `val` = nextLowest.`val`; left = deleteNode(left, nextLowest.`val`) }
            }
            else -> root.apply { right = deleteNode(right, key) }
        }
    }
}