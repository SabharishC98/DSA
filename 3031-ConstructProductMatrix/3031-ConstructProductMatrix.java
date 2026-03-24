// Last updated: 3/24/2026, 11:21:32 AM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int total = n * m;
        final int MOD = 12345;

        int[] arr = new int[total];
        int i = 0;
        for (int j = 0; j < n; j++)
            for (int k = 0; k < m; k++)
                arr[i++] = grid[j][k];

        long[] p1 = new long[total];
        long[] p2 = new long[total];
        p1[0] = 1;
        p2[total - 1] = 1;

        for (int j = 1; j < total; j++)
            p1[j] = (p1[j - 1] * (arr[j - 1] % MOD)) % MOD;

        for (int j = total - 2; j >= 0; j--)
            p2[j] = (p2[j + 1] * (arr[j + 1] % MOD)) % MOD;

        i = 0;
        for (int k = 0; k < n; k++)
            for (int j = 0; j < m; j++)
                grid[k][j] = (int)((p1[i] * p2[i++]) % MOD); 

        return grid;
    }
}