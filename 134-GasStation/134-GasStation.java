// Last updated: 9/25/2026, 2:52:24 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startPosition = 0;
        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalGas += balance;
            currentGas += balance;
            if (currentGas < 0) {
                startPosition = i + 1;
                currentGas = 0;
            }
        }
        return totalGas >= 0 ? startPosition : -1;

        
    }
}