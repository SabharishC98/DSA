// Last updated: 6/3/2026, 1:01:44 AM
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int n=grid.length,m=grid[0].length;
4        boolean[][] vis=new boolean[n][m];
5        for(int i=0;i<n;i++){
6            if(!vis[i][0] && grid[i][0]==1){
7                dfs(grid,i,0,vis);
8            }
9            if(!vis[i][m-1] && grid[i][m-1]==1){
10                dfs(grid,i,m-1,vis);
11            }
12        }
13        for(int i=0;i<m;i++){
14            if(!vis[0][i] && grid[0][i]==1){
15                dfs(grid,0,i,vis);
16            }
17            if(!vis[n-1][i] && grid[n-1][i]==1){
18                dfs(grid,n-1,i,vis);
19            }
20        }
21        int c=0;
22        for(int i=0;i<n;i++){
23            for(int j=0;j<m;j++){
24                if(!vis[i][j] && grid[i][j]==1) c++;
25            }
26        }
27        return c;
28    }
29    public void dfs(int[][] grid,int i,int j,boolean[][] vis){
30        vis[i][j]=true;
31        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
32        for(int[] k:dir){
33            int r=k[0]+i;
34            int c=k[1]+j;
35            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && !vis[r][c] && grid[r][c]==1){
36                dfs(grid,r,c,vis);
37            }
38        }
39    }
40}