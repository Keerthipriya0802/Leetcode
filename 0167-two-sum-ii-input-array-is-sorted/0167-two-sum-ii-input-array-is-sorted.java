class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]={0,0};
        int l=numbers.length;
        int c=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                c=0;
                if(target==(numbers[i]+numbers[j]))
                {
                    arr[0]=i+1;
                    arr[1]=j+1;
                    c=1;
                    break;

                }
                
            }
            if(c==1)
                {
                    break;
                }
        }
        return arr;
    }
}