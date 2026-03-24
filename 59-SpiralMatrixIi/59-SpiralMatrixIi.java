// Last updated: 3/24/2026, 11:31:41 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int len=matrix.length*matrix[0].length;
        int row=matrix.length,col=matrix[0].length,r=0,c=0,count=0;
        int k=1;
        while(count<len){
            while(c<col && count<len){
                matrix[r][c]=k;
                k++;
                c++;
                count++;
            }
            c--;
            r++;
            while(r<row && count<len){
                matrix[r][c]=k;
                k++;
                r++;
                count++;
            }
            r--;
            c--;
            while(c>=matrix[0].length-col && count<len){
                matrix[r][c]=k;
                k++;
                c--;
                count++;
            }
            c++;
            r--;
            while(r>matrix.length-row && count<len){
                matrix[r][c]=k;
                k++;
                r--;
                count++;
            }
            r++;
            c++;
            col--;
            row--;
        }
        return matrix;
    }
}