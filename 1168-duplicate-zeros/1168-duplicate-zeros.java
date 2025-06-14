class Solution {
    public void duplicateZeros(int[] arr) {
        int l=arr.length;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<l;i++)
        {

            if(arr[i]==0)
            {
                num.add(arr[i]);
                num.add(arr[i]);


            }
            else
            {
                num.add(arr[i]);
            }
        }
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            arr[i] = num.get(i);
        }
        


        
    }
}