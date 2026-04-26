// Last updated: 4/26/2026, 4:08:07 PM
1class Solution {
2    int m,n;
3    public int maxAreaOfIsland(int[][] grid) {
4        int max=0;
5        m=grid.length;
6        n=grid[0].length;
7        boolean[][] vis=new boolean[m][n];
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(!vis[i][j] && grid[i][j]==1){
11                    max=Math.max(max,dfs(grid,vis,i,j));
12                }
13            }
14        }
15        return max;
16    }
17    public int dfs(int[][] grid,boolean[][] vis,int x,int y){
18        if(grid[x][y]==0){
19            return 0;
20        }
21        int sum=1;
22        vis[x][y]=true;
23        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
24        for(int i[]:dir){
25            int newx=i[0]+x;
26            int newy=i[1]+y;
27            if(newx<0 || newx>=m || newy<0 || newy>=n || vis[newx][newy]) continue;
28            sum+=dfs(grid,vis,newx,newy);
29        }
30        return sum;
31    }
32}