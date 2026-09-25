// Last updated: 9/25/2026, 2:36:24 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; 
            if (i != n - i - 1) sum += mat[i][n - i - 1];
        }
        return sum;
    }
}
