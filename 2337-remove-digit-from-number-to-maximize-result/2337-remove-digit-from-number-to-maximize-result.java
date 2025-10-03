class Solution {
    public String removeDigit(String number, char digit) {
        String res = "";
        int l = number.length();
        for(int i = 0; i < l; i++)
        {
            if(number.charAt(i) == digit)
            {
                String temp = number.substring(0, i) + number.substring(i + 1);
                if(res.compareTo(temp) < 0)
                {
                    res = temp;
                }
            }
        }
        return res;

        
    }
}