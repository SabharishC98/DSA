// Last updated: 3/24/2026, 11:24:04 AM
class Solution {
    public int maxProductPath(int[][] grid) {
        int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;
        long[][] mindp = new long[m][n];
        long[][] maxdp = new long[m][n];

        mindp[0][0] = grid[0][0];
        maxdp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            mindp[i][0] = mindp[i-1][0] * grid[i][0];
            maxdp[i][0] = maxdp[i-1][0] * grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            mindp[0][j] = mindp[0][j-1] * grid[0][j];
            maxdp[0][j] = maxdp[0][j-1] * grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                long a = mindp[i-1][j] * grid[i][j];
                long b = maxdp[i-1][j] * grid[i][j];
                long c = mindp[i][j-1] * grid[i][j];
                long d = maxdp[i][j-1] * grid[i][j];

                mindp[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
                maxdp[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
            }
        }

        long ans = maxdp[m-1][n-1];
        return ans < 0 ? -1 : (int)(ans % MOD);
    }
}