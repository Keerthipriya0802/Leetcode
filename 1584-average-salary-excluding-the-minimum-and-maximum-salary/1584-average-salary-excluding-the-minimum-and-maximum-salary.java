class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int l=salary.length;
        int sum=0;
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(max<salary[i])
            {
                max=salary[i];
            }
        }
        int min=max;
        for(int i=0;i<l;i++)
        {
            if(min>salary[i])
            {
                min=salary[i];
            }
        }
        for(int i=0;i<l;i++)
        {
            if(salary[i]!=max && salary[i]!=min)
            {
                sum=sum+salary[i];
                count=count+1;
            }
        }
        return (double)sum/count;

        
    }
}