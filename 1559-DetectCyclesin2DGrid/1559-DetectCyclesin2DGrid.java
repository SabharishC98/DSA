// Last updated: 4/26/2026, 1:05:14 PM
1class Solution {
2    boolean found=false;
3    public boolean containsCycle(char[][] grid) {
4        boolean[][] vis=new boolean[grid.length][grid[0].length];
5        for(int i=0;i<grid.length;i++){
6            for(int j=0;j<grid[0].length;j++){
7                if(!vis[i][j])
8                dfs(grid,vis,-1,-1,i,j,grid[i][j]);
9                if(found) return true;
10            }
11        }
12        return false;
13    }
14    public void dfs(char[][] grid,boolean[][] vis,int prevx,int prevy,int x,int y,char ch){
15        if(found) return;
16        vis[x][y]=true;
17        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
18        for(int[] i:dir){
19            int newx=x+i[0];
20            int newy=y+i[1];
21            if(found) return;
22            if(newx<0 || newy<0 || newx>=grid.length || newy>=grid[0].length || (newx==prevx && newy==prevy) || grid[newx][newy]!=ch) continue;
23        if(vis[newx][newy]){
24            found=true;
25            return;
26        }
27            dfs(grid,vis,x,y,newx,newy,ch);
28        }
29    }
30}