class Solution(object):
    def threeConsecutiveOdds(self, arr):
        l = len(arr)
        for i in range(0, l - 2):
            if arr[i] % 2 == 1 and arr[i+1] % 2 == 1 and arr[i+2] % 2 == 1:
                return True
        return False
