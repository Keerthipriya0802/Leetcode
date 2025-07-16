class Solution(object):
    def lastStoneWeight(self, stones):
        while len(stones)>1:
            stones.sort(reverse=True)
            f=stones.pop(0)
            s=stones.pop(0)
            if(f!=s):
                stones.append(f-s)
        if len(stones)==0:
            return 0
        else:
            return stones[0]
        
        