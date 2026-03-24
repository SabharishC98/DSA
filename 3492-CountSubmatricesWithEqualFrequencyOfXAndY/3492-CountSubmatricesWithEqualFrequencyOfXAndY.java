// Last updated: 3/24/2026, 11:21:08 AM
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if      (grid[i][j] == 'X') arr[i][j] =  1;
                else if (grid[i][j] == 'Y') arr[i][j] = -1;
                else                        arr[i][j] =  0;
            }
        }
        
        int[][] pre  = new int[n][m];
        int[][] preX = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pre[i][j]  = arr[i][j];
                preX[i][j] = (grid[i][j] == 'X') ? 1 : 0;

                if (i > 0) { pre[i][j]  += pre[i-1][j];
                             preX[i][j] += preX[i-1][j]; }
                if (j > 0) { pre[i][j]  += pre[i][j-1];
                             preX[i][j] += preX[i][j-1]; }
                if (i > 0 && j > 0) { pre[i][j]  -= pre[i-1][j-1];
                                      preX[i][j] -= preX[i-1][j-1]; }

                if (pre[i][j] == 0 && preX[i][j] > 0) ans++;
            }
        }

        return ans;
    }
}