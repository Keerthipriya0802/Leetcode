class Solution(object):
    def findIndices(self, nums, indexDifference, valueDifference):
        l=len(nums)
        lst=[-1,-1]
        for i in range(0,l):
            for j in range(0,l):
                if((abs(i - j) >= indexDifference) and (abs(nums[i]-nums[j])>=valueDifference)):
                    lst[0]=i
                    lst[1]=j
        return lst


        