class Solution(object):
    def unequalTriplets(self, nums):
        count=0
        l=len(nums)
        for i in range(0,l):
            for j in range(i+1,l):
                for k in range(j+1,l):
                    if nums[i]!=nums[j] and nums[i]!=nums[k] and nums[j]!=nums[k]:
                        count=count+1
        return count
