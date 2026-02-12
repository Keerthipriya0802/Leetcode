class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowmin = new int[rows];
        int[] colmax = new int[cols];
        for(int i = 0;i < rows; i++)
        {
            rowmin[i] = Integer.MAX_VALUE;
            for(int j = 0; j < cols; j++)
            {
                rowmin[i] = Math.min(rowmin[i] , matrix[i][j]);
            }
        }
        for(int j = 0;j < cols; j++)
        {
            colmax[j] = Integer.MIN_VALUE;
            for(int i = 0; i < rows; i++)
            {
                colmax[j] = Math.max(colmax[j] , matrix[i][j]);
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(rowmin[i] == colmax[j])
                {
                    res.add(rowmin[i]);
                }
            }
        }
        return res;
        
    }
}