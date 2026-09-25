// Last updated: 9/25/2026, 2:28:06 PM
class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long reach = 0;   
        int added = 0;
        int i = 0;

        while (reach < target) {
            if (i < coins.length && coins[i] <= reach + 1) {
                reach += coins[i];
                i++;
            } else {
                reach += reach + 1;
                added++;
            }
        }

        return added;
    }
}
