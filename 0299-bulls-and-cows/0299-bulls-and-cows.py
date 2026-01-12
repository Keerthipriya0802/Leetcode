class Solution(object):
    def getHint(self, secret, guess):
        bulls = 0
        cows = 0
        count_s = [0] * 10
        count_g = [0] * 10
        for i in range(len(secret)):
            s = secret[i]
            g = guess[i]
            if s == g:
                bulls += 1
            else:
                count_s[int(s)] += 1
                count_g[int(g)] += 1
        for i in range(10):
            cows += min(count_s[i] , count_g[i])
        return str(bulls) + "A" + str(cows) + "B"


        