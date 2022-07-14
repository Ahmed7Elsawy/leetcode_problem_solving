/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeNodes(head: ListNode?): ListNode? {
        var head2 = head
        var newHead: ListNode? = null
        var lastNode: ListNode? = null
        while (head2 != null) {
            var sum = 0
            while (head2?.`val` != null && head2.`val` != 0) {
                sum += head2.`val`
                head2 = head2.next
            }
            if (sum > 0) {
                if (newHead == null) {
                    newHead = ListNode(sum)
                    lastNode = newHead
                } else {
                    lastNode?.next = ListNode(sum)
                    lastNode = lastNode?.next
                }
            }
            head2 = head2?.next
        }
        return newHead
    }
}