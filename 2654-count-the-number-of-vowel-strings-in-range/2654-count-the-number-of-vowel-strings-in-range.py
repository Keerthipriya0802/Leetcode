class Solution(object):
    def vowelStrings(self, words, left, right):
        count=0
        for i in range(left,right+1):
            t=list(words[i])
            l=len(t)
            if((t[0]=='a'or t[0]=='e'or t[0]=='i'or t[0]=='o' or t[0]=='u') and (t[l-1]=='a'or t[l-1]=='e'or t[l-1]=='i'or t[l-1]=='o' or t[l-1]=='u')):
                count=count+1
        return count

        
        