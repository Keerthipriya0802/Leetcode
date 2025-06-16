class Solution {
    public int addDigits(int num) {
        int sum=0;
        int t=num;
        while(num>=10)
        {
            int n=num;
            sum=0;
            while(n>0){
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            num=sum;
        }
        if(t<10)
        {
            return t;
        }
        else
        {
            return sum;

        }
        
        
    }
}