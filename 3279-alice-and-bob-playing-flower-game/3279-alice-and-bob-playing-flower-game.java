class Solution {
    public long flowerGame(int n, int m) {
        /*long count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if((i+j)%2!=0)
                {
                    count++;
                }
                
            }
        }
        return count;*/
        long oddn=(n+1)/2;
        long evenn=n/2;
        long oddm=(m+1)/2;
        long evenm=m/2;
        return oddn*evenm + oddm*evenn;
        
    }
}