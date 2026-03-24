// Last updated: 3/24/2026, 11:24:27 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=grid.length-1;i>=0;i--){
            int f=1;
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0){ c++; f=0;}
                else break;
            }
            if(f==1) break;
        }
        return c;
    }
}