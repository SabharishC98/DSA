// Last updated: 3/24/2026, 11:20:47 AM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        long row[]=new long[n];
        long col[]=new long[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row[i]+=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row[i]+=grid[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                col[i]+=grid[j][i];
            }
        }
        for(int i=1;i<n;i++) row[i]+=row[i-1];
        for(int i=1;i<m;i++) col[i]+=col[i-1];
        for(int i=0;i<n-1;i++){
            if(row[n-1]-row[i]==row[i]){ return true;}
        }
        for(int i=0;i<m-1;i++){
            if(col[m-1]-col[i]==col[i]) { return true;}
        }
        return false;
    }
}