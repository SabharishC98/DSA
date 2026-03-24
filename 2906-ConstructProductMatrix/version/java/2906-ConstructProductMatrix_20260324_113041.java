// Last updated: 3/24/2026, 11:30:41 AM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        int n = grid.length, m = grid[0].length;
4        int total = n * m;
5        final int MOD = 12345;
6
7        int[] arr = new int[total];
8        int i = 0;
9        for (int j = 0; j < n; j++)
10            for (int k = 0; k < m; k++)
11                arr[i++] = grid[j][k];
12
13        long[] p1 = new long[total];
14        long[] p2 = new long[total];
15        p1[0] = 1;
16        p2[total - 1] = 1;
17
18        for (int j = 1; j < total; j++)
19            p1[j] = (p1[j - 1] * (arr[j - 1] % MOD)) % MOD;
20
21        for (int j = total - 2; j >= 0; j--)
22            p2[j] = (p2[j + 1] * (arr[j + 1] % MOD)) % MOD;
23
24        i = 0;
25        for (int k = 0; k < n; k++)
26            for (int j = 0; j < m; j++)
27                grid[k][j] = (int)((p1[i] * p2[i++]) % MOD); 
28
29        return grid;
30    }
31}