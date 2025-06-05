class Solution(object):
    def arithmeticTriplets(self, nums, diff):
        count=0
        l=len(nums)
        for i in range(0,l):
            for j in range(i+1,l):
                for k in range(j+1,l):
                    if(nums[j] - nums[i] == diff and nums[k] - nums[j] == diff):
                        count=count+1
        return count
        