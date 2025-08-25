class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int l=costs.length;
        int sum=0,count=0;
        for(int i=0;i<l;i++)
        {
            sum=sum+costs[i];
            if(sum<=coins)
            {
                count++;
            }
            else if(sum>=coins)
            {
                break;
            }
        }
        return count;
        
    }
}