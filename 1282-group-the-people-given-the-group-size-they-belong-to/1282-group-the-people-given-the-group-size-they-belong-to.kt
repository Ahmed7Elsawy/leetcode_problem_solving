class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {

        val result = mutableListOf<List<Int>>()
        val list = groupSizes.mapIndexed { index, i -> i to index }
                .sortedBy { it.first }

        val group = mutableListOf<Int>()
        for (item in list) {
            group.add(item.second)
            if (group.size == item.first) {
                result.add(group.toList())
                group.clear()
            }
        }
        if (group.isNotEmpty())
            result.add(group.toList())

        return result
    }
}