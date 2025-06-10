class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int l1=grid.length;
        for(int i=0;i<l1;i++)
        {
            int l2=grid[i].length;
            for(int j=0;j<l2;j++)
            {
                if(grid[i][j]<0)
                {
                    count=count+1;
                }
            }
        }
        return count;
    }
}