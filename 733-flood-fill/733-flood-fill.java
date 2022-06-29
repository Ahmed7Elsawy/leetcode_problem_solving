class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor == color)
            return image;
        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int color) {
        if (image[sr][sc] != oldColor) return;

        if (image[sr][sc] == oldColor)
            image[sr][sc] = color;

        if (sr - 1 >= 0)
            dfs(image,sr - 1, sc, oldColor, color);
        if (sc - 1 >= 0)
            dfs(image,sr, sc - 1, oldColor, color);

        if (sr + 1 < image.length)
            dfs(image,sr + 1, sc, oldColor, color);
        if (sc + 1 < image[0].length)
            dfs(image, sr, sc + 1, oldColor, color);
    }
}