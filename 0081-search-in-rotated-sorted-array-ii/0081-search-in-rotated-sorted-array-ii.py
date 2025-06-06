class Solution(object):
    def search(self, nums, target):
        s=set(nums)
        if target in s:
            return True
        else:
            return False
        