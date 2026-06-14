class Solution {
    public int maxProduct(int[] nums) {
        int maxp = nums[0];
        int minp = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length ; i++)
        {
            int temp = Math.max(nums[i] ,Math.max(maxp*nums[i] , minp * nums[i]));
            minp = Math.min(nums[i] , Math.min(maxp*nums[i] , minp * nums[i]));
            maxp = temp;
            res = Math.max(res , maxp);

        }
        return res;
        
        
    }
}