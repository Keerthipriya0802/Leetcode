class Solution(object):
    def maxProduct(self, words):
        l=len(words)
        maxi=0
        sets=[]
        for i in words:
            sets.append(set(i))
        for i in range(0,l):
            for j in range(i+1,l):
                if(sets[i].isdisjoint(sets[j])):
                    pro=len(words[i])*len(words[j])
                    maxi=max(pro,maxi)
        return maxi


            
        