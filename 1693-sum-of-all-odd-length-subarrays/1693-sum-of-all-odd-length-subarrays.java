class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for(int i = 0; i < l; i++)
        {
            int temp = 0;
            for(int j = i; j < l; j++)
            {
                temp = temp + arr[j];
                int l1 = j - i + 1;
                if(l1 % 2 != 0)
                {
                    sum = sum + temp;
                }
            }
        }
        return sum;
        
    }
}