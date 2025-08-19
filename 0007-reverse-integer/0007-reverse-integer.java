class Solution {
    public int reverse(int x) {
        int n=x;
        int rem=0;
        if(n<0)
        {
            n=n*-1;

        }
        while(n>0)
        {
            int t=n%10;
            if (rem > (Integer.MAX_VALUE - t) / 10) 
            {
                return 0;
            }
            rem=(rem*10)+t;
            n=n/10;
        }
        if(x<0)
        {
            rem=rem*-1;
        }
        return rem;
        

        
    }
}