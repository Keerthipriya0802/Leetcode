from collections import Counter
class Solution(object):
    def checkInclusion(self, s1, s2):
        l1=len(s1)
        l2=len(s2)
        if l1>l2:
            return False
        c1=Counter(s1)
        for i in range(l2-l1+1):
            temp=s2[i:i+l1]
            if Counter(temp)==c1:
                return True
        return False
        