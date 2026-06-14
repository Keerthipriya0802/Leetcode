class Solution {
    public double findMaxAverage(int[] nums, int k) {
       long w = 0;
       for(int i = 0; i < k; i++){
        w = w + nums[i];
       }
       long max = w;
       for(int i = k; i < nums.length; i++)
       {
        w = w + nums[i] - nums[i - k];
        max = Math.max(max , w);
       }
       return (double)max/k;
       
    }
}