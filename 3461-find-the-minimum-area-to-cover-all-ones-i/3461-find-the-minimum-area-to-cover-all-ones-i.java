class Solution {
    public int minimumArea(int[][] grid) {
        int maxrow = Integer.MIN_VALUE;
        int minrow = Integer.MAX_VALUE;
        int maxcol = Integer.MIN_VALUE;
        int mincol = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxrow = Math.max(maxrow, i);
                    minrow = Math.min(minrow, i);
                    maxcol = Math.max(maxcol, j);
                    mincol = Math.min(mincol, j);
                }
            }
        }
        if (maxrow == Integer.MIN_VALUE) {
            return 0;
        }
        int height = maxrow - minrow + 1;
        int width = maxcol - mincol + 1;
        return height * width;
    }
}
