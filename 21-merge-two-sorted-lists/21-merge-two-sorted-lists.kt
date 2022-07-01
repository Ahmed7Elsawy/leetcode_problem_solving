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

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        var l1: ListNode? = list1
        var l2: ListNode? = list2
        var list3: ListNode? = null
        var current: ListNode? = null

        while (l1 != null && l2 != null) {
            val new: ListNode
            if (l1.`val` <= l2.`val`) {
                new = ListNode(l1.`val`)
                l1 = l1.next
            } else {
                new = ListNode(l2.`val`)
                l2 = l2.next
            }
            if (current == null) {
                current = new
                list3 = new
            } else {
                current.next = new
                current= current.next
            }
            
        }

        if (l1 == null && l2 != null) {
            current?.next = l2
        } else if (l2 == null && l1 != null) {
            current?.next = l1
        }

        return list3
    }
}