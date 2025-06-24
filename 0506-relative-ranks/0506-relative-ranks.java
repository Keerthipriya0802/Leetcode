import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int l = score.length;
        String[] s = new String[l];
        int[] original = Arrays.copyOf(score, l);
        Arrays.sort(score);
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                if (original[i] == score[j])
                 {
                    if(j == l - 1)
                     {
                        s[i] = "Gold Medal";
                    } 
                    else if (j == l - 2) 
                    {
                        s[i] = "Silver Medal";
                    } 
                    else if (j == l - 3) 
                    {
                        s[i] = "Bronze Medal";
                    } 
                    else 
                    {
                        s[i] = String.valueOf(l - j);
                    }
                    break;
                }
            }
        }
        return s;
    }
}
