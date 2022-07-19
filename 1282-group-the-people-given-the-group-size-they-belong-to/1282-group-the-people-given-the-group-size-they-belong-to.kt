class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {

        val result = mutableListOf<List<Int>>()
        val list = groupSizes.mapIndexed { index, i -> i to index }
                .sortedBy { it.first }

        var group = mutableListOf<Int>()
        for (item in list) {
            group.add(item.second)
            if (group.size == item.first) {
                result.add(group)
                group = mutableListOf<Int>()
            }
        }
        if (group.isNotEmpty())
            result.add(group)

        return result
    }
}