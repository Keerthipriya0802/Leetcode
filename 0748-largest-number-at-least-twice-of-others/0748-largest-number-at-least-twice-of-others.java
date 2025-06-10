class Solution {
    public int dominantIndex(int[] nums) {
        int l=nums.length;
        int max=nums[0];
        int t=0;
        int index=0;
        for(int i=0;i<l;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                index=i;
            }
        }
        

        for(int i=0;i<l;i++)
        {
            if(i!=index && max<nums[i]*2)
            {
                return -1;
            }
        }
        return index;
        
        
    }
}