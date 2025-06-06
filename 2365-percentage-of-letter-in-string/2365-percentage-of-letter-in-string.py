class Solution(object):
    def percentageLetter(self, s, letter):
        lst=list(s)
        count=0
        l=len(lst)
        for i in lst:
            if(i==letter):
                count=count+1
        percentage=(count*100)//l
        return percentage
        
        