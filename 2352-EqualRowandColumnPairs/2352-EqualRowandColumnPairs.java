// Last updated: 6/4/2026, 11:55:49 AM
1class Solution {
2    public int equalPairs(int[][] grid) {
3        List<String> colset=new ArrayList<>();
4        List<String> rowset=new ArrayList<>();
5        int n=grid.length;
6        for(int i=0;i<n;i++){
7            String row="";
8            for(int j=0;j<n;j++){
9                row+=String.valueOf(grid[i][j]+" ");
10            }
11            rowset.add(row);
12        }
13        for(int i=0;i<n;i++){
14            String col="";
15            for(int j=0;j<n;j++){
16                col+=String.valueOf(grid[j][i]+" ");
17            }
18            colset.add(col);
19        }
20        int c=0;
21        for(String i:colset){ if(rowset.contains((i))) c+=Collections.frequency(rowset,i);
22        // System.out.println(i);
23        }
24        return c;
25    }
26}