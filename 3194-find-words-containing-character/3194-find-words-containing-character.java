class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> list = new ArrayList<>();
        String s = String.valueOf(x);
        int l=words.length;
        for(int i=0;i<l;i++)
        {
            if(words[i].contains(s))list.add(i);
        }
        return list;
    }
}