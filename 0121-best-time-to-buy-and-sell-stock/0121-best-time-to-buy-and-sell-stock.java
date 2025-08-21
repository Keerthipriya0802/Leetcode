class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else
            {
                int pro=prices[i]-min;
                if(max<pro)
                {
                    max=pro;
                }
            }
        }
        return max;
        
        
    }
}