class Solution(object):
    def peakIndexInMountainArray(self, arr):
        l = len(arr)
        for i in range(1, l - 1):
            if arr[i - 1] < arr[i] and arr[i] > arr[i + 1]:
                return i
        