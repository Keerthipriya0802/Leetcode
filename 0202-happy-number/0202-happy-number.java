import java.util.HashSet;
import java.util.Set;

class Solution {
    int compute(int n) {
        int res = 0;
        while (n != 0) {
            res=res+((n%10)*(n%10));
            n=n/10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        
        while (n != 1) {
            if (s.contains(n)) {
                return false;  
            }
            s.add(n);
            n = compute(n);
        }
        
        return true; 
    }
}
