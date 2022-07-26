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
    fun pairSum(head: ListNode?): Int {
        var head1 = head
        var max = 0
        val list = mutableListOf<Int>()
        while (head1 != null) {
            list.add(head1.`val`)
            head1 = head1.next
        }
        var start = 0
        var end = list.lastIndex
        while (end >= start) {
            if (list[start] + list[end] >= max)
                max = list[start] + list[end]
            start++
            end--
        }
        return max
    }
}