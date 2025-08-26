class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles)
                .max()
                .orElseThrow();
        int left=1,right=max;
        while(left<right)
        {
            int speed=(left+right)/2;
            int totalHrs=0;
            for(int pile:piles)
            {
                totalHrs+=pile/speed+(pile%speed!=0?1:0);
                if(totalHrs>h)
                {
                    break;
                }

            }
            if(totalHrs<=h)
            {
                right=speed;
            }
            else
            {
                left=speed+1;
            }
        }
        return left;
        
    }
}