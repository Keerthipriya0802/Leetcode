class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int count=0;
        int l=matrix.length;
        for(int i=0;i<l;i++)
        {
            int l1=matrix[i].length;
            for(int j=0;j<l1;j++)
            {
                if(target==matrix[i][j])
                {
                    count++;

                }
            
            }
        }
        if(count!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}