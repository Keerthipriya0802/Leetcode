class Solution(object):
    def minimumSum(self, nums):
        l=len(nums)
        sums=0
        mini=float('inf')
        for i in range(0,l):
            for j in range(i+1,l):
                for k in range(j+1,l):
                    if(nums[i] < nums[j] and nums[k] < nums[j]):
                        sums=nums[i]+nums[j]+nums[k]
                        if(mini>sums):
                            mini=sums
        if(mini!=float('inf')):
            return mini
        else:
            return -1
        