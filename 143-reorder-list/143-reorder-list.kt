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
    fun reorderList(head: ListNode?): Unit {
        var mid = head
        var end = head?.next
        while (end?.next != null) {
            mid = mid?.next
            end = end.next?.next
        }

        var head2 = mid?.next

        var current = head2
        var current2: ListNode?
        while (current != null) {
            current2 = current.next
            current.next = head2
            head2 = current
            current = current2
        }

        mid?.next?.next = null
        mid?.next = null


        current = head
        var next1: ListNode?
        var next2: ListNode?
        current2 = head2
        while (current != null || current2 != null) {
            next1 = current?.next
            next2 = current2?.next
            current?.next = current2
            current2?.next = next1
            current = next1
            current2 = next2
        }

    }
}