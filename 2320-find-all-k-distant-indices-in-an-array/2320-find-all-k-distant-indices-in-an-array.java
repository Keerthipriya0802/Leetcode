class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         List<Integer> num = new ArrayList<>();
         int l=nums.length;
         for(int i=0;i<l;i++)
         {
            for(int j=0;j<l;j++)
            {
                if(Math.abs(i-j)<=k && nums[j]==key)
                {
                    num.add(i);
                    break;
                }

            }
         }
         return num;
    }
}