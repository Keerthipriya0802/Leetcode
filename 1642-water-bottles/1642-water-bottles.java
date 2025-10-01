class Solution {
    public int numWaterBottles(int nb, int ne) {
        int total = nb;
        int empty = nb;
        while(empty >= ne)
        {
            int newfull = empty/ne;
            total = total + newfull;
            empty = empty % ne +newfull;

        }
        return total;
    }
}