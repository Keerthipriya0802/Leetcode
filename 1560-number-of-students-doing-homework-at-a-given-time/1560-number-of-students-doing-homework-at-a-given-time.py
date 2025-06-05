class Solution(object):
    def busyStudent(self, startTime, endTime, queryTime):
        count=0
        l=len(startTime)
        for i in range(0,l):
            if(startTime[i]<=queryTime and endTime[i]>=queryTime):
                count=count+1
        return count
        
        