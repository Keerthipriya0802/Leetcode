class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        int l=words.size();
        List<String> res= new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            String temp[]=words.get(i).split("\\"+separator);
            int l1=temp.length;
            for(int j=0;j<l1;j++)
            {
                if (!temp[j].isEmpty()) {
                    res.add(temp[j]);
                }
            }

        }
        return res;
        
    }
}