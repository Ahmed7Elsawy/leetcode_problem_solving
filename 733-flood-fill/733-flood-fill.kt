class Solution {
    private lateinit var images: Array<IntArray>
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val oldColor = image[sr][sc]
        if (oldColor == color)
            return image
        
        images = image
        dfs(sr, sc, oldColor, color)

        return images
    }

    private fun dfs(sr: Int, sc: Int, oldColor: Int, newColor: Int) {

        if (images[sr][sc] != oldColor) return
        if (images[sr][sc] == oldColor) images[sr][sc] = newColor

        if (sr - 1 >= 0)
            dfs(sr - 1, sc, oldColor, newColor)

        if (sc - 1 >= 0)
            dfs(sr, sc - 1, oldColor, newColor)

        if (sr + 1 < images.size)
            dfs(sr + 1, sc, oldColor, newColor)

        if (sc + 1 < images[0].size)
            dfs(sr, sc + 1, oldColor, newColor)

    }

}