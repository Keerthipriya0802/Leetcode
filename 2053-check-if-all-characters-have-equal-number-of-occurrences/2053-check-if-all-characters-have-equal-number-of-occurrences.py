class Solution(object):
    def areOccurrencesEqual(self, s):
        c=Counter(s)
        o=list(c.values())
        l=len(o)
        for i in range(0,l):
            if i + 1 < l and o[i] != o[i + 1]:
                return False
        return True
        