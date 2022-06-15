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
    
    fun sortedArrayToBST(
        nums: IntArray,
        left: Int = 0,
        right: Int = nums.lastIndex
    ): TreeNode? {
        if (right < left)
            return null
        val mid = (left + right) / 2
        val head = TreeNode(nums[mid])
        head.left = sortedArrayToBST(nums, left, mid - 1)
        head.right = sortedArrayToBST(nums, mid + 1, right)
        return head
    }

}
