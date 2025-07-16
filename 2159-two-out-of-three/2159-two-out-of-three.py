class Solution(object):
    def twoOutOfThree(self, nums1, nums2, nums3):
        set1=set(nums1)
        set2=set(nums2)
        set3=set(nums3)
        count={}
        for i in set1:
            count[i]=count.get(i,0)+1
        for i in set2:
            count[i]=count.get(i,0)+1
        for i in set3:
            count[i]=count.get(i,0)+1
        res=[]
        for num in count:
            if count[num]>=2:
                res.append(num)
        return res
        
        