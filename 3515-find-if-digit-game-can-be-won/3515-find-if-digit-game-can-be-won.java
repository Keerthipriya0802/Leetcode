class Solution {
    public boolean canAliceWin(int[] nums) {
        int l=nums.length;
        int alice=0;
        int bob=0;
        int a=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>=10)
            {
                alice=alice+nums[i];

            }
            else
            {
                bob=bob+nums[i];
            }
        }
        if(alice>bob || bob>alice)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}