class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int n = gas.length;
        int ans = 0;
        int gain = 0;
        for(int i = 0; i < n; i++)
        {
            totalcost = totalcost + gas[i] - cost[i];
            gain = gain + gas[i] - cost[i];
            if(gain < 0)
            {
                ans = i + 1;
                gain = 0;
            }
            
        }
        return totalcost >= 0 ? ans : -1;

    }
}