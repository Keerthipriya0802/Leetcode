class Solution {
    public int maximumDifference(int[] nums) {
        int temp=0;
        int max=-1;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(nums[i]<nums[j] && max<nums[j]-nums[i])
                {
                    max=nums[j]-nums[i];
                }
            }
        }
        return max;
    }
}