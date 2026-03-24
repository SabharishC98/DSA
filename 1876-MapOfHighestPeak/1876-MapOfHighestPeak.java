// Last updated: 3/24/2026, 11:23:46 AM
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        int[][] ans = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.add(new int[]{i, j});
                } else {
                    ans[i][j] = -1; 
                }
            }
        }

        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n && ans[nr][nc] == -1) {
                    ans[nr][nc] = ans[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return ans;
    }
}
