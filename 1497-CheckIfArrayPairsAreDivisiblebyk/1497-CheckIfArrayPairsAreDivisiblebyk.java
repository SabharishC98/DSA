// Last updated: 6/9/2026, 12:32:39 AM
1class Solution {
2    public boolean canArrange(int[] arr, int k) {
3        int[] count = new int[k];
4        for (int i : arr) {
5            count[((i % k) + k) % k]++;
6        }
7
8        // Remainder 0 must pair among themselves
9        if (count[0] % 2 != 0) return false;
10
11        // Remainder k/2 must pair among themselves (only when k is even)
12        if (k % 2 == 0 && count[k / 2] % 2 != 0) return false;
13
14        // Complementary pairs must have equal counts
15        for (int i = 1; i <= (k - 1) / 2; i++) {
16            if (count[i] != count[k - i]) return false;
17        }
18
19        return true;
20    }
21}