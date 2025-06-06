class Solution(object):
    def getSneakyNumbers(self, nums):
        c=Counter(nums)
        l=len(nums)
        s=set(nums)
        lst=[]
        for i in s:
            if(c[i]==2):
                lst.append(i)
        return lst

        