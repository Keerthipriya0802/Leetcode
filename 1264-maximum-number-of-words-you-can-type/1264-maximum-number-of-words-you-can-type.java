class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] word = text.split(" ");
        int count=0;
        for (String w : word) {  
            boolean temp = true;   
            for (char ch : brokenLetters.toCharArray()) {
                if (w.contains(String.valueOf(ch))) {
                    temp = false; 
                    break;
                }
            }
            if (temp) {
                count++;  
            }
        }
        return count;
        
    }
}