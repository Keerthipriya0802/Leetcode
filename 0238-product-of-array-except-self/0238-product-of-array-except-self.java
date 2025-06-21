class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int l=nums.length;
        int p[]=new int[l];
        int s[]=new int[l];
        int r[]=new int[l];
        p[0]=1;
        for(int i=1;i<l;i++)
        {
           p[i]=p[i-1]*nums[i-1];
        }
        s[l-1]=1;
        for(int i=l-2;i>=0;i--)
        {
            s[i]=s[i+1]*nums[i+1];
        }
        for(int i=0;i<l;i++)
        {
            r[i]=p[i]*s[i];
        }
        return r;
    }
}