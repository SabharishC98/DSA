// Last updated: 9/25/2026, 2:39:55 PM
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        if (grid[0][0] == 1 || grid[n-1][m-1] == 1) return -1;
        if (n == 1 && m == 1) return 1;
        boolean[][] vis=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        vis[0][0]=true;
        while(!q.isEmpty()){
            int[] pos=q.poll();
            int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,1},{1,-1}};
            for(int[] i:dir){
                int r=i[0]+pos[0];
                int c=i[1]+pos[1];
                if(r>=0 && r<n && c>=0 && c<m && !vis[r][c] && grid[r][c]==0){
                    if(r==n-1 && c==m-1) return pos[2]+1;
                    q.add(new int[]{r,c,pos[2]+1});
                    vis[r][c]=true;
                }
            }
        }
        return -1;
    }
}