class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            int t=0;
            while(nums[i]>0)
            {
                int r=nums[i]%10;
                t=t+1;
                nums[i]=nums[i]/10;

            }
            if(t%2==0)
            {
                count=count+1;
            }
        }
        return count;
    }
}