class Solution {
    public boolean isMonotonic(int[] nums) {
        int l=nums.length;
        boolean increase=true;
        boolean decrease=true;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
                increase=false;

            }
            if(nums[i] > nums[i+1])
            {
                decrease=false;

            }
            
        }
        return increase || decrease;
    }
}