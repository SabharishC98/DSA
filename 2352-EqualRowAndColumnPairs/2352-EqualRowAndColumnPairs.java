// Last updated: 9/25/2026, 2:31:20 PM
class Solution {
    public int equalPairs(int[][] grid) {
        List<String> colset=new ArrayList<>();
        List<String> rowset=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            String row="";
            for(int j=0;j<n;j++){
                row+=String.valueOf(grid[i][j]+" ");
            }
            rowset.add(row);
        }
        for(int i=0;i<n;i++){
            String col="";
            for(int j=0;j<n;j++){
                col+=String.valueOf(grid[j][i]+" ");
            }
            colset.add(col);
        }
        int c=0;
        for(String i:colset){ if(rowset.contains((i))) c+=Collections.frequency(rowset,i);
        // System.out.println(i);
        }
        return c;
    }
}