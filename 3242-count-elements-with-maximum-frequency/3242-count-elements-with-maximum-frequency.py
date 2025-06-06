class Solution(object):
    def maxFrequencyElements(self, nums):
        freq = Counter(nums)
        maxi = max(freq.values())
        total = 0
        for v in freq.values():
            if v == maxi:
                total = total + v
        return total
