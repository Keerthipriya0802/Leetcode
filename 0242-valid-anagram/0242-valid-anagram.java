class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            hm.put(ch1 , hm.getOrDefault(ch1, 0)+1);
            hm.put(ch2 , hm.getOrDefault(ch2, 0)-1);

        }
        for(int ele:hm.values()){
            if(ele != 0)
            {
                return false;
            }
        }
        return true;
        
    }
}