class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxs = nums[0];
        int cmax = 0;
        int mins = nums[0];
        int cmin = 0;
        for(int num: nums)
        {
            cmax = Math.max(num , cmax + num);
            maxs = Math.max(cmax , maxs);
            cmin = Math.min(num , cmin + num);
            mins = Math.min(cmin , mins);
            total = total + num;
        }
        if(maxs < 0)
        {
            return maxs;
        }
        return Math.max(maxs , total - mins);

        
    }
}