class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                for(int k=j+1;k<l;k++)
                {
                if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                {
                    count =count+1;
                }
                }
            }
        } 
        return count;       
    }
}