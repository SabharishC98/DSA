// Last updated: 6/3/2026, 1:30:46 AM
1
2class Solution {
3    public int closedIsland(int[][] grid) {
4        int n=grid.length,m=grid[0].length;
5        boolean[][] vis=new boolean[n][m];
6        for(int i=0;i<n;i++){
7            if(!vis[i][0] && grid[i][0]==0){
8                dfs(grid,i,0,vis);
9            }
10            if(!vis[i][m-1] && grid[i][m-1]==0){
11                dfs(grid,i,m-1,vis);
12            }
13        }
14        for(int i=0;i<m;i++){
15            if(!vis[0][i] && grid[0][i]==0){
16                dfs(grid,0,i,vis);
17            }
18            if(!vis[n-1][i] && grid[n-1][i]==0){
19                dfs(grid,n-1,i,vis);
20            }
21        }
22        int c=0;
23        for(int i=0;i<n;i++){
24            for(int j=0;j<m;j++){
25                if(!vis[i][j] && grid[i][j]==0){
26                    dfs(grid,i,j,vis);
27                    c++;
28                }
29            }
30        }
31        return c;
32    }
33    public void dfs(int[][] grid,int i,int j,boolean[][] vis){
34        vis[i][j]=true;
35        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
36        for(int[] k:dir){
37            int r=k[0]+i;
38            int c=k[1]+j;
39            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && !vis[r][c] && grid[r][c]==0){
40                dfs(grid,r,c,vis);
41            }
42        }
43    }
44}