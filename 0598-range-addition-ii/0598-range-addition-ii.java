class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minA=m;
        int minB=n;
        int l=ops.length;
        for(int i=0;i<l;i++)
        {
            minA=Math.min(minA,ops[i][0]);
        }
        for(int i=0;i<l;i++)
        {
            minB=Math.min(minB,ops[i][1]);
        }
        int res=minA*minB;
        return res;
        
    }
}