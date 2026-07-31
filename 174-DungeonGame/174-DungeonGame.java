// Last updated: 8/1/2026, 12:11:26 AM
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int n = dungeon.length;
4        int m = dungeon[0].length;
5
6        int[][] dp = new int[n][m];
7
8        // Base case
9        dp[n - 1][m - 1] = Math.max(1, 1 - dungeon[n - 1][m - 1]);
10
11        // Last column
12        for (int i = n - 2; i >= 0; i--) {
13            dp[i][m - 1] = Math.max(1, dp[i + 1][m - 1] - dungeon[i][m - 1]);
14        }
15
16        // Last row
17        for (int j = m - 2; j >= 0; j--) {
18            dp[n - 1][j] = Math.max(1, dp[n - 1][j + 1] - dungeon[n - 1][j]);
19        }
20
21        // Remaining cells
22        for (int i = n - 2; i >= 0; i--) {
23            for (int j = m - 2; j >= 0; j--) {
24                int need = Math.min(dp[i + 1][j], dp[i][j + 1]);
25                dp[i][j] = Math.max(1, need - dungeon[i][j]);
26            }
27        }
28
29        return dp[0][0];
30    }
31}