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
    private val list = mutableListOf<ListNode?>()
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var current = head
        while (current != null) {
            list.add(current)
            current = current.next
        }
        
        if (list.size - n == 0)
            return head?.next
        
        current = head
        var beforeCurrent: ListNode? = null
        for (i in 1..(list.size - n)) {
            beforeCurrent = current
            current = current?.next
        }
        beforeCurrent?.next = current?.next
        return head
    }
    
}