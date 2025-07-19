class Solution {
    public int maxPower(String s) {
        int l=s.length();
        char c[]=s.toCharArray();
        int maxi=1;
        int count=1;
        for(int i=0;i<l;i++)
        {
            count=1;
            for(int j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }
                else{
                    break;
                }
            }
            maxi=Math.max(maxi,count);
        }

       return maxi; 
    }
}