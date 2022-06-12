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
    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null)
            return head
        val newHead = head?.next
        var h = head
        while (h != null) {

            var h1 = h
            var h2 = h?.next
            h = h2?.next
            h1.next = h2?.next?.next ?: h2?.next
            h2?.next = h1

        }
        return newHead
    }

}