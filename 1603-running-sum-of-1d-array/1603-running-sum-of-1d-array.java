class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            nums[i]=sum+nums[i];
            sum=nums[i];
            
        }
        return nums;
        
        
    }
}