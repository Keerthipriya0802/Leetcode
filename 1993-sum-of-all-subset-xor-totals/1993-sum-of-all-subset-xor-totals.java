class Solution {
    public int subsetXORSum(int[] nums) {
        int temp = 0;
        for(int x: nums)
        {
            temp = temp | x;
        }
        return temp * (1 << (nums.length - 1));
        
    }
}