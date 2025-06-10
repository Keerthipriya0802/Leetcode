class Solution {
    public int maximumCount(int[] nums) {
        int l=nums.length;
        int pos=0;
        int neg=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>0)
            {
                pos=pos+1;
            }
            else if(nums[i]<0)
            {
                neg=neg+1;
            }
        }
        if(pos>neg)
        {
            return pos;
        }
        else
        {
            return neg;
        }
        
    }
}