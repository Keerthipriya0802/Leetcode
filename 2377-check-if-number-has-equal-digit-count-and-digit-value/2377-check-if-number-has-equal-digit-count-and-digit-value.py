class Solution(object):
    def digitCount(self, num):
        lst=list(num)
        c=Counter(lst)
        l=len(lst)
        temp=0
        for i in range(0,l):
            if(c[str(i)]!=int(lst[i])):
                temp=1
                return False
        if(temp==0):
            return True


        