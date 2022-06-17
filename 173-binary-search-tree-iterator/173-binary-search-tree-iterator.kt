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

class BSTIterator(root: TreeNode?) {

    private var head: TreeNode?
    var index = 0
    var orderedList: MutableList<Int> = mutableListOf()

    init {
        head = root
        head?.let {
            this.orderedList = traverseInorder(it)
        }
    }

    fun next(): Int {
        return orderedList[index++]
    }

    private fun traverseInorder(node: TreeNode): MutableList<Int> {
        node.left?.let {
            traverseInorder(it)
        }

        orderedList.add(node.`val`)

        node.right?.let {
            traverseInorder(it)
        }

        return orderedList
    }

    fun hasNext(): Boolean {
        return index < orderedList.size
    }

}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * var obj = BSTIterator(root)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */