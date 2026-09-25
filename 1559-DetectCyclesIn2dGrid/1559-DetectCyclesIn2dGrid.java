// Last updated: 9/25/2026, 2:36:33 PM
class Solution {
    boolean found=false;
    public boolean containsCycle(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j])
                dfs(grid,vis,-1,-1,i,j,grid[i][j]);
                if(found) return true;
            }
        }
        return false;
    }
    public void dfs(char[][] grid,boolean[][] vis,int prevx,int prevy,int x,int y,char ch){
        if(found) return;
        vis[x][y]=true;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] i:dir){
            int newx=x+i[0];
            int newy=y+i[1];
            if(found) return;
            if(newx<0 || newy<0 || newx>=grid.length || newy>=grid[0].length || (newx==prevx && newy==prevy) || grid[newx][newy]!=ch) continue;
        if(vis[newx][newy]){
            found=true;
            return;
        }
            dfs(grid,vis,x,y,newx,newy,ch);
        }
    }
}