// Last updated: 5/28/2026, 5:41:53 PM
1class Solution {
2    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
3        boolean[][] vis=new boolean[grid.length][grid[0].length];
4        boolean[][] change=new boolean[grid.length][grid[0].length];
5        // for(int i=0;i<grid.length;i++){
6        //     for(int j=0;j<grid[0].length;j++){
7        //         if(grid[i][j]==grid[row][col] && !vis[i][j])
8                dfs(grid,grid[row][col],row,col,vis,change);
9        //     }
10        // }
11        for(int i=0;i<grid.length;i++){
12            for(int j=0;j<grid[0].length;j++){
13                if(change[i][j]){
14                    grid[i][j]=color;
15                }
16            }
17        }
18        return grid;
19    }
20    public void dfs(int[][] grid,int src,int i,int j,boolean[][] vis,boolean[][] change){
21        vis[i][j]=true;
22        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
23        boolean f=false;
24        for(int d[]:dir){
25            int r=d[0]+i;
26            int c=d[1]+j;
27            if(r>=0 && r<grid.length && c>=0 && c<grid[0].length){
28                
29                if(grid[r][c]!=src) f=true;
30                else if(!vis[r][c]) dfs(grid,src,r,c,vis,change);
31            }
32            else{
33                f=true;
34            }
35        }
36        if(f){
37            change[i][j]=true;
38        }
39    }
40}