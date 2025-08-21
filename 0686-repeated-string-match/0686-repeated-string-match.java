class Solution {
    public int repeatedStringMatch(String a, String b) {
        String r=a;
        int count=1;
        while (r.length()<b.length())
        {
            r=r+a;
            count=count+1;
        }
        if (r.contains(b))
        {
            return count;
        }
        r=r+a;
        count=count+1;
        if (r.contains(b))
        {
            return count;
        }
        return -1;
        

        
    }
}