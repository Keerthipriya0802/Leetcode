class Solution(object):
    def rob(self, nums):
        p1=0
        p2=0
        for i in nums:
            temp=p1
            p1=max(p1,p2+i)
            p2=temp
        return p1
        