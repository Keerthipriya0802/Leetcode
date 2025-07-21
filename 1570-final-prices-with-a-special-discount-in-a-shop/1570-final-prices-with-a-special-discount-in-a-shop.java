class Solution {
    public int[] finalPrices(int[] prices) {
        int l=prices.length;
        int res[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int dis=0;
            for(int j=i+1;j<l;j++)
            {
                if(prices[j]<=prices[i])
                {
                    dis=prices[j];
                    break;
                }

            }
            res[i]=prices[i]-dis;
        }
        return res;
        
    }
}