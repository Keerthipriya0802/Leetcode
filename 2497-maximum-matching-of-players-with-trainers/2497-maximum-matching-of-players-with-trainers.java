class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int l1=players.length;
        int l2=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        int i = 0;
        int j = 0; 
        while (i < l1 && j < l2) {
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
        
    }
}