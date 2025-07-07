class Solution {
    public String truncateSentence(String s, int k) {
        int l=s.length();
        String s1[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            res.append(s1[i]);
            if(i!=k-1)
            {
                res.append(" ");

            }
            

        }
        return res.toString();
        
    }
}