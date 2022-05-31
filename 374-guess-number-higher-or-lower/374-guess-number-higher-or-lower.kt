/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n: Int): Int {
        var min = 0
        var max = n
        while (true){
            var mid = min + (max - min) / 2
            var num = guess(mid)
            if (num == 0){
                return mid
            } else if (num == 1) {
                min = mid + 1
            } else
            {
                max = mid - 1
            } 
        }
    }

}