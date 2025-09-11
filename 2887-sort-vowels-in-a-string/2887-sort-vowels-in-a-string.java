class Solution {
    public String sortVowels(String s) {
        String vowel="aeiouAEIOU";
        List<Character> l=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if (vowel.indexOf(c) != -1) {
                l.add(c);
            }
        }
        Collections.sort(l);
        StringBuilder res=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray())
        {
            if(vowel.indexOf(c)!=-1)
            {
                res.append(l.get(i++));
            }
            else
            {
                res.append(c);
            }
        }
        return res.toString();

        
    }
}