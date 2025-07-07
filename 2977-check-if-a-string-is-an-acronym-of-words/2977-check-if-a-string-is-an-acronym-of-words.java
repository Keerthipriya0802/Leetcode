class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int l=words.size();
        StringBuilder res=new StringBuilder();
        char s1;
        for(int i=0;i<l;i++)
        {
            s1=words.get(i).charAt(0);
            res.append(s1);

        }
        if(res.toString().equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}