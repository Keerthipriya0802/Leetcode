class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        double max=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int d1=dimensions[i][0];
            int d2=dimensions[i][1];
            double t=Math.sqrt((d1*d1)+(d2*d2));
            int area=d1*d2;
            if(max<t || (t== max && area > ans))
            {
                max=t;
                ans=area;
            }

        }
        return ans;
        
    }
}