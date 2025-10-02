class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        int current = numExchange;

        while (empty >= current) {
            empty -= current;  
            total += 1; 
            empty += 1; 
            current += 1;
        }

        return total;
    }
}
