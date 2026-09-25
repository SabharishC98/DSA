// Last updated: 9/25/2026, 2:40:40 PM
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            if(!vis[i][0] && grid[i][0]==1){
                dfs(grid,i,0,vis);
            }
            if(!vis[i][m-1] && grid[i][m-1]==1){
                dfs(grid,i,m-1,vis);
            }
        }
        for(int i=0;i<m;i++){
            if(!vis[0][i] && grid[0][i]==1){
                dfs(grid,0,i,vis);
            }
            if(!vis[n-1][i] && grid[n-1][i]==1){
                dfs(grid,n-1,i,vis);
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]==1) c++;
            }
        }
        return c;
    }
    public void dfs(int[][] grid,int i,int j,boolean[][] vis){
        vis[i][j]=true;
        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] k:dir){
            int r=k[0]+i;
            int c=k[1]+j;
            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && !vis[r][c] && grid[r][c]==1){
                dfs(grid,r,c,vis);
            }
        }
    }
}