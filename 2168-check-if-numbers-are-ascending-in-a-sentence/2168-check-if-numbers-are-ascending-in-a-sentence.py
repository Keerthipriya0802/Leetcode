class Solution(object):
    def areNumbersAscending(self, s):
        digit=re.findall(r'\d+', s)
        nums = list(map(int, digit))
        l=len(nums)
        for i in range(1, l):
            if nums[i] <= nums[i - 1]:
                return False
        return True
            

        