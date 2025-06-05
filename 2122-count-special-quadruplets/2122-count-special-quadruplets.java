class Solution {
    public int countQuadruplets(int[] nums) {
        int l=nums.length;
        int count=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                for(int k=j+1;k<l;k++)
                {
                    for(int d=k+1;d<l;d++)
                    {
                        if(nums[i]+nums[j]+nums[k]==nums[d])
                        {
                           count=count+1;
                        }
                    }
                }
            }
        }
        return count;
        
    }
}