class Solution(object):
    def search(self, nums, target):
        l=len(nums)
        for i in range(0,l):
            if(target==nums[i]):
                return i
        return -1
        