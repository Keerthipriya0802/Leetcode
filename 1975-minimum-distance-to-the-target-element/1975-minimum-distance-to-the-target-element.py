class Solution(object):
    def getMinDistance(self, nums, target, start):
        l=len(nums)
        mini=float('inf')
        for i in range(0,l):
            if(nums[i]==target):
                t=abs(i-start)
                if(mini>t):
                    mini=t
        return mini
        