// Last updated: 9/25/2026, 2:29:24 PM
class Solution {
    int m,n;
    boolean[][] vis;
    public int findMaxFish(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        vis=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && !vis[i][j]){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int x,int y){
        int sum=grid[x][y];
        vis[x][y]=true;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i[]:dir){
            int newx=i[0]+x;
            int newy=i[1]+y;
            if(newx<0 || newx>=m || newy<0 || newy>=n || vis[newx][newy] || grid[newx][newy]==0) continue;
            sum+=dfs(grid,newx,newy);
        }
        return sum;
    }
}