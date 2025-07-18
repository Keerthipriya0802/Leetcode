class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int res[]=new int[num_people];
        int g=1;
        int i=0;
        while(candies>0)
        {
            res[i % num_people] +=Math.min(candies, g);
            candies=candies-Math.min(g,candies);
            g++;
            i++;
        }
        return res;
    }
}