class Solution {
    public int findClosestNumber(int[] nums) {
       int c=nums[0];
       int l=nums.length;
       for(int i=0;i<l;i++)
       {
        if(Math.abs(nums[i])<Math.abs(c)||(Math.abs(nums[i])==Math.abs(c) && nums[i]>c))
        {
            c=nums[i];
        }


       }
       return c; 
    }
}