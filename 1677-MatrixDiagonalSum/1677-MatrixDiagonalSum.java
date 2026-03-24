// Last updated: 3/24/2026, 11:24:05 AM
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
