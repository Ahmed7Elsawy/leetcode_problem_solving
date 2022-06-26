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
    fun middleNode(head: ListNode?): ListNode? {
        var newHead = head
        var preMid: ListNode? = null
        while (newHead?.next != null) {
            preMid = if (preMid == null) head else preMid.next
            newHead = newHead.next?.next
        }
        // val mid = preMid?.next
        val mid = if (preMid?.next != null) preMid.next else head
        preMid?.next = null
        return mid
    }
}