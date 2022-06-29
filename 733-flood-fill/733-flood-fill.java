class Solution {
    int[][] images;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];
        if (oldColor == color)
            return image;

        images = image;
        dfs(sr, sc, oldColor, color);

        return images;
    }

    private void dfs(int sr, int sc, int oldColor, int color) {
        if (images[sr][sc] != oldColor) return;

        if (images[sr][sc] == oldColor)
            images[sr][sc] = color;

        if (sr - 1 >= 0)
            dfs(sr - 1, sc, oldColor, color);
        if (sc - 1 >= 0)
            dfs(sr, sc - 1, oldColor, color);

        if (sr + 1 < images.length)
            dfs(sr + 1, sc, oldColor, color);
        if (sc + 1 < images[0].length)
            dfs(sr, sc + 1, oldColor, color);
    }
}