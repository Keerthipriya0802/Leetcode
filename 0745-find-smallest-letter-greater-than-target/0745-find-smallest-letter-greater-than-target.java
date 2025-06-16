class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char max='{';
        int l=letters.length;
        for(int i=0;i<l;i++)
        {
            if(letters[i]>target && letters[i]<max)
            {
                max=letters[i];
            }
            
        }
        if (max == '{') {
            max = letters[0];
            for (int i = 1; i < l; i++) {
                if (letters[i] < max) {
                    max = letters[i];
                }
            }
        }
        return max;
    }
}