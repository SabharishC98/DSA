// Last updated: 6/17/2026, 10:28:06 PM
1class Solution {
2    public char kthCharacter(long k, int[] operations) {
3        int n = operations.length;
4        int inc = 0;
5        k--;
6
7        for (int i = n - 1; i >= 0; i--) {
8            // If i >= 63, halfLen overflows long but is guaranteed > k
9            // since k < 2^n and fits in a long (k <= 10^14 < 2^63)
10            if (i < 63) {
11                long halfLen = 1L << i;
12                if (k >= halfLen) {
13                    k -= halfLen;
14                    inc += operations[i];
15                }
16            }
17            // i >= 63: halfLen > Long.MAX_VALUE > k, so k is in first half
18        }
19
20        return (char) ('a' + inc % 26);
21    }
22}