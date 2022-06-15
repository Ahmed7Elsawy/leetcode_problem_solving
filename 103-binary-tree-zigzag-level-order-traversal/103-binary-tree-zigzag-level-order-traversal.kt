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
    
    fun zigzagLevelOrder(
        root: TreeNode?,
        list: MutableList<MutableList<Int>> = mutableListOf(mutableListOf()),
        level: Int = 0
    ): List<List<Int>> {
        if (root == null)
            return emptyList()
        if (list.size <= level) {
            list.add(mutableListOf())
        }

        root?.`val`?.let {
            if (level % 2 == 0) {
                list[level].add(it)
            } else
                list[level].add(0, it)
        }
        zigzagLevelOrder(root?.left, list, level = level + 1)
        zigzagLevelOrder(root?.right, list, level = level + 1)

        return list
    }
}
