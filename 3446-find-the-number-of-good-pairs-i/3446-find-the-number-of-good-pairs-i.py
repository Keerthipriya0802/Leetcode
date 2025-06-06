class Solution(object):
    def numberOfPairs(self, nums1, nums2, k):
        count=0
        n=len(nums1)
        m=len(nums2)
        for i in range(0,n):
            for j in range(0,m):
                if(nums1[i]%(nums2[j]*k)==0):
                    count=count+1
        return count
        