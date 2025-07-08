class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] freq = new int[100];
        int count = 0;

        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);
            count += freq[key];
            freq[key]++;
        }

        return count;
    }
}
