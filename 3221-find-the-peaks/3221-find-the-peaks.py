class Solution(object):
    def findPeaks(self, mountain):
        l = len(mountain)
        lst = []
        for i in range(1, l - 1):
            if mountain[i - 1] < mountain[i] and mountain[i] > mountain[i + 1]:
                lst.append(i)
        return lst
