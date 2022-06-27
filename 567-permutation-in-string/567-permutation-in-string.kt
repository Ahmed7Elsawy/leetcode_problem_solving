class Solution {
     fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val size = s1.length
        val s1Sorted = s1.toCharArray().sorted()
        val sum1 = s1.sumBy { it - 'a' }
        var sum2 = s2.substring(0, size).sumBy { it - 'a' }

        for (i in 0..s2.length - size) {

            if (i != 0) {
                val x = s2[i - 1] - 'a'
                val x2 = s2[i + size - 1] - 'a'
                sum2 -= x
                sum2 += x2
            }

            if (sum1 == sum2) {
                var isSorted = true
                val s2Sorted = s2.substring(i, i + size).toCharArray().sorted()
                for (j in 0 until size) {
                    if (s1Sorted[j] != s2Sorted[j]) {
                        isSorted = false
                        break
                    }
                }
                if (isSorted) return true
            }
        }
        return false
    }

}