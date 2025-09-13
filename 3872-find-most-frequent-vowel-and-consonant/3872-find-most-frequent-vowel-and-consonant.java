class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        char temp[]=s.toCharArray();
        int maxvowel=0;
        int maxconsonant=0;
        String vowel="aeiouAEIOU";
        int freq[]=new int[256];
        for (char c : temp) {
            freq[c]++;
        }
        for (char c : temp) {
            if (vowel.indexOf(c) != -1) 
            {
                maxvowel = Math.max(maxvowel, freq[c]);
            } 
            else if (Character.isLetter(c)) 
            { 
                maxconsonant = Math.max(maxconsonant, freq[c]);
            }
        }
        return maxvowel+maxconsonant;



        
    }
}