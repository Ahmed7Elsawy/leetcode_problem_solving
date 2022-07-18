class Solution {
    private var result = 0
    fun averageOfSubtree(root: TreeNode?): Int {
        sum(root)
        return result
    }

    fun sum(node: TreeNode?): Pair<Int, Int> {
        if (node == null) return 0 to 0
        val pair1 = sum(node.left)
        val pair2 = sum(node.right)

        val sum = node.`val` + pair1.first + pair2.first
        val count = 1 + pair1.second + pair2.second
        if (sum / count == node.`val`) result++
        return sum to count
    }

}