// Last updated: 3/25/2026, 8:52:07 AM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int n=grid.length,m=grid[0].length;
4        long row[]=new long[n];
5        long col[]=new long[m];
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                row[i]+=grid[i][j];
9            }
10        }
11        for(int i=0;i<n;i++){
12            for(int j=0;j<m;j++){
13                row[i]+=grid[i][j];
14            }
15        }
16        for(int i=0;i<m;i++){
17            for(int j=0;j<n;j++){
18                col[i]+=grid[j][i];
19            }
20        }
21        for(int i=1;i<n;i++) row[i]+=row[i-1];
22        for(int i=1;i<m;i++) col[i]+=col[i-1];
23        for(int i=0;i<n-1;i++){
24            if(row[n-1]-row[i]==row[i]){ return true;}
25        }
26        for(int i=0;i<m-1;i++){
27            if(col[m-1]-col[i]==col[i]) { return true;}
28        }
29        return false;
30    }
31}