class Solution(object):
    def reversePrefix(self, word, ch):
        lst=list(word)
        s1=[]
        s2=[]
        l=len(lst)
        index=-1
        for i in range(0,l):
            if(lst[i]==ch):
                index=i
                break
        for i in range(0,index+1):
            s1.append(lst[i])
        for i in range(index+1,l):
            s2.append(lst[i])
        s1=s1[::-1]
        r=s1+s2
        s=''.join(r)
        return s

        

        