class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int l=nums.length;
        int s[]=new int[l];
        for(int i=0;i<l;i++)
        {
            sum=0;
            for(int j=0;j<=i;j++)
            {
                sum=sum+nums[j];
            }
            s[i]=sum;
        }
        return s;
        
        
    }
}