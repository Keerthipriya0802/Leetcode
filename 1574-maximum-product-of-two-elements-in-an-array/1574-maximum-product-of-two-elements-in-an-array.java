class Solution {
    public int maxProduct(int[] nums) {
        int t=0;
        int max=0;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                temp=(nums[i]-1)*(nums[j]-1);
                if(max<temp)
                {
                    max=temp;

                }

            }

        }
        return max;
        
    }
}