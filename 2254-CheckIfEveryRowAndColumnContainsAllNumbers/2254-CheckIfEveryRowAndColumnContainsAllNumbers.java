// Last updated: 3/24/2026, 11:22:56 AM
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