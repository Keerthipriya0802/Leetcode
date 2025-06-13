class Solution {
    public int countEven(int num) {
        int sum=0;
        int res=0;
        for(int i=1;i<=num;i++)
        {
            sum=0;
            int temp=i;
            while(temp>0)
            {
                int r=temp%10;
                sum=sum+r;
                temp=temp/10;
            }
            if(sum%2==0)
            {
                res=res+1;

            }
            
        }
        
        return res;
    }
}