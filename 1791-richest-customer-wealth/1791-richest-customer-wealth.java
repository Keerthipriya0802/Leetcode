class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int l=accounts.length;
        for(int i=0;i<l;i++)
        {
            int sum=0;
            int l2=accounts[i].length;
            for(int j=0;j<l2;j++)
            {
                sum=sum+accounts[i][j];

            }
            if(max<sum)
            {
                max=sum;
            }

        }
        return max;
        
    }
}