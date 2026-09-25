// Last updated: 9/25/2026, 2:28:33 PM
class Solution {
    public int maxIncreasingGroups(List<Integer> usageLimits) {
        Collections.sort(usageLimits);
        long available = 0;
        int ans = 1;  

        for (int limit : usageLimits) {
            available += limit;
            if (available >= (long)ans * (ans + 1) / 2) {
                ans++;
            }
        }
        return ans - 1;
    }
}
