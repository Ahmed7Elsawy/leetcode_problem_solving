class MyHashMap() {
    private val map = HashMap<Int, Int>()
    
    fun put(key: Int, value: Int) {
        map[key] = value
    }
    
    fun get(key: Int): Int {
        return map[key] ?: -1
    }
    
    fun remove(key: Int) {
        map.remove(key)
    }
    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */