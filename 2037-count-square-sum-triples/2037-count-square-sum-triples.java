class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int a=1;a<n;a++)
        {
            for(int b=1;b<n;b++)
            {
                int temp= a * a + b * b;
                int c = (int) Math.sqrt(temp);
                if (c <= n && c * c == temp) {
                    count++;
                }
            }
        }
        return count;
        
    }
}