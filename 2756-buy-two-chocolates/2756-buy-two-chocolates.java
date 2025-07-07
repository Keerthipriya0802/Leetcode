class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int l=prices.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                int s=prices[i]+prices[j];
                if(money>=s)
                {
                    return money-s;

                }
            }
        }
        return money;
        
    }
}