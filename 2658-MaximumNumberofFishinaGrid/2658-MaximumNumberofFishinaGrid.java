// Last updated: 4/26/2026, 11:53:40 PM
1class Solution {
2    int m,n;
3    boolean[][] vis;
4    public int findMaxFish(int[][] grid) {
5        m=grid.length;
6        n=grid[0].length;
7        vis=new boolean[m][n];
8        int max=0;
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11                if(grid[i][j]!=0 && !vis[i][j]){
12                    max=Math.max(max,dfs(grid,i,j));
13                }
14            }
15        }
16        return max;
17    }
18    public int dfs(int[][] grid,int x,int y){
19        int sum=grid[x][y];
20        vis[x][y]=true;
21        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
22        for(int i[]:dir){
23            int newx=i[0]+x;
24            int newy=i[1]+y;
25            if(newx<0 || newx>=m || newy<0 || newy>=n || vis[newx][newy] || grid[newx][newy]==0) continue;
26            sum+=dfs(grid,newx,newy);
27        }
28        return sum;
29    }
30}