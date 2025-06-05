class Solution(object):
    def findTheDistanceValue(self, arr1, arr2, d):
        count=0
        l1=len(arr1)
        l2=len(arr2)
        for i in range(0,l1):
            temp = 0
            for j in range(0,l2):
                if(abs(arr1[i]-arr2[j])<=d):
                    temp += 1
            if temp == 0:
                count += 1                
        return count
        