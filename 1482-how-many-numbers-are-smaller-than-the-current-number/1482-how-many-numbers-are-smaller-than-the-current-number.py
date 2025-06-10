class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        l=len(nums)
        lst=[]
        for i in range(0,l):
            count=0
            for j in range(0,l):
                if(i!=j and nums[i]>nums[j]):
                    count=count+1
            lst.append(count)
        return lst
                
        