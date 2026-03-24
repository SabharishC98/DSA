// Last updated: 3/24/2026, 11:29:36 AM
class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int visited[][]=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    dfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,char[][] grid,int[][] visited){
        visited[i][j]=1;
        int r=grid.length;
        int c=grid[0].length;
        if(i>0 && grid[i-1][j]=='1' && visited[i-1][j]==0) dfs(i-1,j,grid,visited);
        if(i<r-1 && grid[i+1][j]=='1' && visited[i+1][j]==0) dfs(i+1,j,grid,visited);
        if(j>0 && grid[i][j-1]=='1' && visited[i][j-1]==0) dfs(i,j-1,grid,visited);
        if(j<c-1 && grid[i][j+1]=='1' && visited[i][j+1]==0) dfs(i,j+1,grid,visited);
    }
}