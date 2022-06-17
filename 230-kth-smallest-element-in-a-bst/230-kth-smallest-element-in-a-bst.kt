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

        val index1 = if (index == 0) 0 else index //+ 1
        var pair1: Pair<Int, TreeNode?>? = null
        if (root.left != null)
            pair1 = kthSmallestNode(root.left, k, index1)

        if (pair1?.first == k) {
            return pair1
        }

        val index2 = when (pair1?.first) {
            null -> index + 1
            index1 -> pair1.first
            else -> pair1.first + 1
        }

        if (index2 == k) {
            return index2 to root
        }

//        println("${index2}  -  ${root?.`val`}  --")

        val nod2 = kthSmallestNode(root.right, k, index2)
        return if (root.right != null) {
//            println("${nod2.first}  -  ${nod2.second?.`val`}")
            nod2
        }else index2 to root
    }


}