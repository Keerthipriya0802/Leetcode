class Solution(object):
    def findLucky(self, arr):
        freq=Counter(arr)
        lst=[]
        for i in arr:
            if freq[i]==i:
                lst.append(i)
        if not lst:
            return -1
        else:
            return max(lst)

