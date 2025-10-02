class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = arr.length;
        int max = arr[0];
        for(int i = 0; i < l; i++)
        {
            max = Math.max(max,arr[i]);
        }
        int count = 0;
        int temp = 0;
        int missing = 0;
        for(int i = 1; ; i++)
        {
            count = 0;
            for(int j = 0; j < l; j++)
            {
                if(arr[j]==i)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                temp = temp + 1;
                missing = i;
                if(temp == k)
                {
                    return missing;
                }
            }


        }
        
    }
}