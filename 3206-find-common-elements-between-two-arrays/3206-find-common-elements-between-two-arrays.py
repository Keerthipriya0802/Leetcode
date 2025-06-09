class Solution(object):
    def findIntersectionValues(self, nums1, nums2):
        count=0
        lst=[]
        for i in nums1:
            if i in nums2:
                count=count+1
        lst.append(count)
        count=0
        for i in nums2:
            if i in nums1:
                count=count+1
        lst.append(count)
        return lst



        
        
        