class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int l=nums.length;
        int max=nums[0];
        for(int i=0;i<l;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        int min=nums[0];
        for(int i=0;i<l;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        for(int i=0;i<l;i++)
        {
            if(nums[i]>min && nums[i]<max)
            {
                count=count+1;
            }
        }
        return count;
        
    }
}