// Last updated: 3/24/2026, 11:26:04 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}