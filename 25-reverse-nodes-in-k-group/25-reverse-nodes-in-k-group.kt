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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var lastHead: ListNode? = null
        var current = head
        var head2 = head
        var isFirst = true
        while (current != null) {
            var start = current
            var index = 1
            start = current
            while (index < k && current?.next != null) {
                current = current?.next
                index++
            }
            if (index < k) {
                break
            } else {
                index = 1
                var afterStart2 = start.next
                var change = start
                start.next = current?.next

                while (index < k) {
                    var afterStart = afterStart2
                    afterStart2 = afterStart2?.next
                    afterStart?.next = change
                    change = afterStart
                    index++
                }
                if (isFirst) {
                    head2 = current
                    isFirst = false
                }
                if (lastHead != null) {
                    lastHead.next = current
                }

                current = afterStart2
                lastHead = start
            }
        }
        return head2
    }
}