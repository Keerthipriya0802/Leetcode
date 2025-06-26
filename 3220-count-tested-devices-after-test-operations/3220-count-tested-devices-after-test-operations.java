class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        int l = batteryPercentages.length;

        for (int i = 0; i < l; i++) {
            if (batteryPercentages[i] > 0) {
                count++;
                for (int j = i + 1; j < l; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }

        return count;
    }
}
