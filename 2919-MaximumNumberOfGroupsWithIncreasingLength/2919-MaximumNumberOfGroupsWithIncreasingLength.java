// Last updated: 3/24/2026, 11:21:35 AM
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
