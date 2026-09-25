// Last updated: 9/25/2026, 2:32:49 PM
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int arr[]=new int[matrix.length];
            for(int j=0;j<matrix.length;j++){
                arr[matrix[i][j]-1]++;
            }
            for(int j=0;j<matrix.length;j++){
                if(arr[j]!=1) return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int arr[]=new int[matrix.length];
            for(int j=0;j<matrix.length;j++){
                arr[matrix[j][i]-1]++;
            }
            for(int j=0;j<matrix.length;j++){
                if(arr[j]!=1) return false;
            }
        }
        return true;
    }
}