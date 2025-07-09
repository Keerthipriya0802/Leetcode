class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int max=0;
        for(int i:gain)
        {
            a=a+i;
            max=Math.max(max,a);

        }
        return max;
        
    }
}