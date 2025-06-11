class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int[] r= new int[l];
        for(int i=0;i<l;i++)
        {
            int max=-1;
            for(int j=i+1;j<l;j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                }
            }
            r[i]=max;

            

        }

        return r;
        

        
    }
}