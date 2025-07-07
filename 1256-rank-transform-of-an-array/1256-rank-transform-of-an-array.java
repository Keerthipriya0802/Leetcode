class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
        {
            return new int[0];
        }
        int l=arr.length;
        int arr1[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        int[] unique = new int[l];
        int rank = 1;
        unique[0] = arr1[0];

        for (int i = 1; i < l; i++) 
        {
            if (arr1[i] != arr1[i - 1]) 
            {
                unique[rank] = arr1[i];
                rank++;
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < rank; j++) { 
                if (arr[i] == unique[j]) {
                    arr[i] = j + 1;
                    break;
                }
            }
        }
        return arr;
    }
}