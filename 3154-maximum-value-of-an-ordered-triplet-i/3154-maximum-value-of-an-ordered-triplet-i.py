class Solution(object):
    def maximumTripletValue(self, nums):
        l=len(nums)
        maxi=0
        for i in range(0,l):
            for j in range(i+1,l):
                for k in range(j+1,l):
                    t=(nums[i] - nums[j]) * nums[k]
                    if(maxi<t):
                        maxi=t
        return maxi


        