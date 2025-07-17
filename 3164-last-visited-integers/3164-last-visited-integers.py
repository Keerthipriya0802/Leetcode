class Solution(object):
    def lastVisitedIntegers(self, nums):
        res=[]
        temp=[]
        count=0
        for i in nums:
            if i==-1:
                count=count+1
                if count<=len(temp):
                    res.append(temp[-count])
                else:
                    res.append(-1)
            else:
                temp.append(int(i))
                count=0
        return res


