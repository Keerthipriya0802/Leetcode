class Solution(object):
    def minElement(self, nums):
        lst=[]
        for i in nums:
            sum=0
            while(i>0):
                t=i%10
                sum=sum+t
                i=i/10
            lst.append(sum)
        return min(lst)

            
        