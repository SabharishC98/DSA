// Last updated: 3/24/2026, 11:25:28 AM
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = 0, fresh = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0)
            return 0;

        int dir[][] = { { 0, 1 }, { 0, -1 }, { 1,0 }, { -1, 0 } };
        while (!q.isEmpty()) {

            int size = q.size();
            boolean rotten = false;

            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int r = current[0];
                int c = current[1];

                for (int[] d : dir) {
                    int newRow = r + d[0];
                    int newCol = c + d[1];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2; 
                        fresh--;
                        q.add(new int[]{newRow, newCol});
                        rotten = true;
                    }
                }
            }
            if (rotten) {
                m++;
            }
        }
         return fresh == 0 ? m : -1;
    }

}