// Last updated: 9/25/2026, 2:26:38 PM
class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        int inc = 0;
        k--;

        for (int i = n - 1; i >= 0; i--) {
            // If i >= 63, halfLen overflows long but is guaranteed > k
            // since k < 2^n and fits in a long (k <= 10^14 < 2^63)
            if (i < 63) {
                long halfLen = 1L << i;
                if (k >= halfLen) {
                    k -= halfLen;
                    inc += operations[i];
                }
            }
            // i >= 63: halfLen > Long.MAX_VALUE > k, so k is in first half
        }

        return (char) ('a' + inc % 26);
    }
}