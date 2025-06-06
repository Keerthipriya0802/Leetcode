class Solution(object):
    def sortPeople(self, names, heights):
        pair=list(zip(names,heights))
        pair.sort(key=lambda x: x[1], reverse=True)
        sort=[]
        for i in pair:
            sort.append(i[0])
        return sort

        
        