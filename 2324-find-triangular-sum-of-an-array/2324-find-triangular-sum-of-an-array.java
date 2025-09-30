class Solution {
    public int triangularSum(int[] nums) {
        int l = nums.length;
        while(l>1)
        {
            for (int i = 0; i < l - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            l--;
        }
        return nums[0];
        
    }
}