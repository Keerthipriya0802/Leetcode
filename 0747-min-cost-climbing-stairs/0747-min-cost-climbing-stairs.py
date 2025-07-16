class Solution(object):
    def minCostClimbingStairs(self, cost):
        n=len(cost)
        d=[0]*(n+1)
        for i in range(2,n+1):
            d[i]=min(d[i-1]+cost[i-1],d[i-2]+cost[i-2])
        return d[n]