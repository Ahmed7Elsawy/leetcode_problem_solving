class Solution {

    private val visited = mutableListOf<Int>()
    
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        dfs(rooms)
        for (i in 0..rooms.lastIndex) {
            if (!visited.contains(i))
                return false
        }
        return true
    }

    private fun dfs(rooms: List<List<Int>>, index: Int = 0) {
        if (visited.contains(index)) return
        visited.add(index)
        for (i in rooms[index])
            dfs(rooms, i)
    }
    
}