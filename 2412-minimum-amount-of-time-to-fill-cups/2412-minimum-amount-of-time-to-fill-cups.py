import math

class Solution(object):
    def fillCups(self, amount):
        return int(max(max(amount), math.ceil(sum(amount) / 2.0)))
