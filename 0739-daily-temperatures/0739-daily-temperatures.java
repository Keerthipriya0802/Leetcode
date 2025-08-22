class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l=temperatures.length;
        int res[]=new int[l];
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<l;i++)
        {
            int temp=temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]<temp)
            {
                int prev=stack.pop();
                res[prev]=i-prev;
                
            }
            stack.push(i);
        }
        return res;
        
        
    }
}