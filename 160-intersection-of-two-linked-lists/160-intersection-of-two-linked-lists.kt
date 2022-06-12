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

    val set1 = hashMapOf<Int, ListNode>()
    val set2 = hashMapOf<Int, ListNode>()
    
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var current1 = headA
        var current2 = headB
        while (current1 != null || current2 != null) {
            if (current1 != null) {
                if (set2.contains(current1.`val`) && set2[current1.`val`] == current1)
                    return current1
                set1[current1.`val`] = current1
                current1 = current1.next
            }
            if (current2 != null) {
                if (set1.contains(current2.`val`) && set1[current2.`val`] == current2)
                    return current2
                set2[current2.`val`] = current2
                current2 = current2.next
            }
        }
        return null
    }

}
