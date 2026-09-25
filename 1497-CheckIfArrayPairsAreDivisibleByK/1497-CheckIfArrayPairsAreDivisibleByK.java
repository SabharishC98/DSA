// Last updated: 9/25/2026, 2:36:52 PM
class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for (int i : arr) {
            count[((i % k) + k) % k]++;
        }

        // Remainder 0 must pair among themselves
        if (count[0] % 2 != 0) return false;

        // Remainder k/2 must pair among themselves (only when k is even)
        if (k % 2 == 0 && count[k / 2] % 2 != 0) return false;

        // Complementary pairs must have equal counts
        for (int i = 1; i <= (k - 1) / 2; i++) {
            if (count[i] != count[k - i]) return false;
        }

        return true;
    }
}