// Last updated: 3/24/2026, 11:24:07 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int prev = 0;
        for (int num : arr) {
            int missing = num - prev - 1;
            if (k <= missing) {
                return prev + k;
            }
            k -= missing;
            prev = num;
        }
        return prev + k;
    }
}