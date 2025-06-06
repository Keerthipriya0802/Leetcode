class Solution(object):
    def peakIndexInMountainArray(self, arr):
        maxi=max(arr)
        l=len(arr)
        for i in range(0,l):
            if(arr[i]==maxi):
                return i
        