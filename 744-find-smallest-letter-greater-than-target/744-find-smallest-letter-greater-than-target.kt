class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        return letters.sortedBy {
          if (it <= target) 100 else it - target}.first()
    }
}