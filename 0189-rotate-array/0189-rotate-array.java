class Solution {
    public void rotate(int[] nums, int k) {
        
        int l=nums.length;
        int arr[] = new int[l];
        int n=0;
        k=k%l;
        for(int i=0;i<l;i++)
        {
            arr[i]=nums[i];
            

        }
        for(int i=l-k;i<l;i++)
        {
            nums[n++]=nums[i];
            

        }
        for(int i=0;i<l-k;i++)
        {
            nums[n++]=arr[i];
            

        }

       }
}