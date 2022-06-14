class MinStack() {
    private val list = mutableListOf<Int>()
    private val min = mutableListOf<Int>()

    fun push(`val`: Int) {
        list.add(`val`)
        if (min.isEmpty() || min.last() >= `val`)
            min.add(`val`)
    }

    fun pop() {
        val last = top()
        if (min.last() == last)
            min.removeAt(min.lastIndex)
        list.removeAt(list.lastIndex)

    }

    fun top(): Int {
        return list.last()
    }

    fun getMin(): Int {
        return min.last()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */