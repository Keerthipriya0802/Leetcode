class Solution {
    public int distributeCandies(int[] candyType) {
        int l=candyType.length;
        int diff=l/2;
        Arrays.sort(candyType);
        int unique=1;
        for(int i=1;i<l;i++)
        {
            if(candyType[i]!=candyType[i-1])
            {
                unique++;
            }
        }
        return Math.min(diff,unique);
        
    }
}