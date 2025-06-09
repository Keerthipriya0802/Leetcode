class Solution {
    public int subtractProductAndSum(int n) {
        int num=n;
        int sum=0;
        int pro=1;
        while(num>0)
        {
            int t=num%10;
            sum=sum+t;
            pro=pro*t;
            num=num/10;
        }
        return pro-sum;
        
    }
}