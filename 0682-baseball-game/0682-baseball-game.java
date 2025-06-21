class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int l = operations.length;
        int size=0;
        int val=0;
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            String op=operations[i];
            if (op.equals("+"))
             {
                size = num.size();
                val = num.get(size - 1) + num.get(size - 2);
                num.add(val);

            } 
            else if (op.equals("D")) 
            {
                size = num.size();
                val = 2*num.get(size - 1);
                num.add(val);

            } else if (op.equals("C")) {
                num.remove(num.size() - 1);

            } else {
                num.add(Integer.parseInt(op));
            } 
        }

        for (int n : num) {
            sum += n;
        }
        return sum;

    }
}