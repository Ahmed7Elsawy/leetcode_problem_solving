import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private ArrayList<Integer> maxColumns = new ArrayList<>();

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxRow = grid[i][0];
            for (int x : grid[i]) {
                if (maxRow < x)
                    maxRow = x;
            }
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) {
                    int max = -1;
                    for (int[] ints : grid) {
                        if (max < ints[j]) {
                            max = ints[j];
                        }
                    }
                    maxColumns.add(max);
                }
                sum += (Math.min(maxRow, maxColumns.get(j)) - grid[i][j]);
            }
        }
        return sum;
    }
}