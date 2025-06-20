class Solution {
    public int finalValueAfterOperations(String[] operations) {
        char ch1='-';
        char ch2='+';
        int num=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].contains("++"))
            {
                num=num+1;
            }
            else
            {
                num=num-1;
            }
        }
        return num;

    }
}