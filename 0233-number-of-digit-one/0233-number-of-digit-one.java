class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long x = 1;
        while(x <= n)
        {
            long div = x * 10;
            count += (n / div) * x;
            count += Math.min(Math.max(n % div - x + 1, 0), x);
            x = x * 10;
        }
        return count;
        
    }
}