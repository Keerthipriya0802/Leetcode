class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++)
        {
            int[] prefix = new int[accounts[i].length];
            prefix[0] = accounts[i][0];
            for(int j = 1; j < accounts[i].length; j++)
            {
                prefix[j] = prefix[j - 1] + accounts[i][j];
            }
            max = Math.max(max , prefix[prefix.length - 1]);
        }
        return max;
        
        
        
    }
}