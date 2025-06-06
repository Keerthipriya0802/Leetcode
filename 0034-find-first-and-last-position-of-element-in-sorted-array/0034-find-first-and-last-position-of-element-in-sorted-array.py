class Solution(object):
    def searchRange(self, nums, target):
        lst=[-1,-1]
        l=len(nums)
        for i in range(0,l):
            if(nums[i]==target):
                if(lst[0]==-1):
                    lst[0]=i
                lst[1]=i
        return lst

        