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
    
       fun deleteDuplicates(head: ListNode?): ListNode? {
        var head1 = head
        var current = head1
        var lastUnique = head1
        while (current != null) {
            while (current != null && current.`val` == current.next?.`val`) {
                current = current.next
            }

            val beforeCurrent = current
            current = current?.next
            if (lastUnique == head1 && lastUnique?.`val` == beforeCurrent?.`val` 
                && lastUnique != beforeCurrent ) {
                head1 = current
                lastUnique = current
            } else if (lastUnique?.next == beforeCurrent){
                lastUnique = beforeCurrent
            } else  {
                lastUnique?.next = current
            } 
        }
        return head1
    }

    
    
}