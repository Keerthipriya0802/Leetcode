class Solution {
    public int[] evenOddBit(int n) {
        String binary=Integer.toBinaryString(n);
        int l=binary.length();
        int e=0,o=0;

        for(int i=0;i<l;i++)
        {
            if(binary.charAt(l-i-1)=='1')
            {
                if(i%2==0)
                {
                    e=e+1;
                }
                else
                {
                    o=o+1;
                }


            }
        }
        int[] num = {e,o}; 
        return num;

        


        
    }
}