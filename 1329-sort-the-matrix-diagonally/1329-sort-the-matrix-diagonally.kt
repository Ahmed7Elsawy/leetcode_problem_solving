class Solution {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        for (i in 0..mat[0].lastIndex) {
            var row = 0
            var column = i
            val list = mutableListOf<Int>()
            while (column < mat[0].size && row < mat.size ) {
                list.add(mat[row][column])
                row++
                column++
            }
            row = 0
            column = i
            val sortedList = list.sortedBy { it }
            var index = 0
            while (column < mat[0].size  && row < mat.size ) {
                mat[row][column] = sortedList[index]
                index++
                row++
                column++
            }
        }

        for (j in 0..mat.lastIndex) {
            var row = j
            var column = 0
            val list = mutableListOf<Int>()
            while (column < mat[0].size && row < mat.size) {
                list.add(mat[row][column])
                row++
                column++
            }
            row = j
            column = 0
            val sortedList = list.sortedBy { it }
            var index = 0
            while (column < mat[0].size && row < mat.size) {
                mat[row][column] = sortedList[index]
                index++
                row++
                column++
            }
        }

        return mat
    }
}