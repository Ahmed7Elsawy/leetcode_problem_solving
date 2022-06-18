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

    private val list = mutableListOf<List<Int>>()
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {

        if (root == null) return emptyList()
        sumPath(root, targetSum, 0)
        return list.ifEmpty { emptyList() }
    }

    private fun sumPath(
        root: TreeNode?,
        targetSum: Int,
        currentSum: Int,
        oldList: MutableList<Int> = mutableListOf()
    ) {
        val currentList = mutableListOf<Int>()
        currentList.addAll(oldList)

        if (root == null) return

        currentList.add(root.`val`)
        val sum = currentSum + (root.`val`)

        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                list.add(currentList)
                return
            } else {
                return
            }
        }

        if (root.left != null)
            sumPath(root.left, targetSum, sum, currentList)
        if (root.right != null)
            sumPath(root.right, targetSum, sum, currentList)
    }

}
