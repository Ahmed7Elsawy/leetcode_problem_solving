class MyLinkedList() {

    var head: Node? = null
    fun get(index: Int): Int {
        var current = head
        for (i in 1..index) {
            current = current?.next
        }
        return current?.value ?: -1
    }

    fun addAtHead(`val`: Int) {
        val current = Node(`val`, head)
            head = current
    }

    fun addAtTail(`val`: Int) {
        var current = head
        while (current?.next != null)
            current = current.next
        if (head == null)
            head = Node(`val`)
        else
            current?.next = Node(`val`)
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index == 0) {
            addAtHead(`val`)
        } else {
            var current = head
            for (i in 2..index) {
                current = current?.next
            }
            val newNode = Node(`val`, current?.next)
            current?.next = newNode
        }
    }

    fun deleteAtIndex(index: Int) {
        if (index == 0)
            head = head?.next
        else {
            var current = head
            for (i in 2..index) {
                current = current?.next
            }
            current?.next = current?.next?.next
        }
    }
    
}

data class Node(val value: Int, var next: Node? = null)


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */