// Last updated: 3/24/2026, 11:22:31 AM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if((i==j || i+j==grid.length-1)&& grid[i][j]==0) return false;
                if(!(i==j || i+j==grid.length-1) && grid[i][j]!=0) return false;
            }
        }
        return true;
    }
}