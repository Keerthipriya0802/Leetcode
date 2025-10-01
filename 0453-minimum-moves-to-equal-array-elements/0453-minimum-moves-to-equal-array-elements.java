class Solution {
    public int minMoves(int[] nums) {
        int l = nums.length;
        int sum = 0;
        int min = nums[0];
        for(int i =0; i < l; i++)
        {
            sum = sum + nums[i];
            min = Math.min(min , nums[i]);
        }
        return sum - (min * l);
        
    }
}