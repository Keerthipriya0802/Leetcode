class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=nums.length;
        int arr[]=new int[l];
        int even=0;
        int odd=1;
        for(int i=0;i<l;i++)
        {
            if(nums[i]%2==0)
            {
                arr[even]=nums[i];
                even=even+2;
            }
            if(nums[i]%2!=0)
            {
                arr[odd]=nums[i];
                odd=odd+2;
            }
        }
        return arr;
        
    }
}