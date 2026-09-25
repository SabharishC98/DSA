// Last updated: 9/25/2026, 2:44:55 PM
class Solution {
    int m,n;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        m=grid.length;
        n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    max=Math.max(max,dfs(grid,vis,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,boolean[][] vis,int x,int y){
        if(grid[x][y]==0){
            return 0;
        }
        int sum=1;
        vis[x][y]=true;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i[]:dir){
            int newx=i[0]+x;
            int newy=i[1]+y;
            if(newx<0 || newx>=m || newy<0 || newy>=n || vis[newx][newy]) continue;
            sum+=dfs(grid,vis,newx,newy);
        }
        return sum;
    }
}