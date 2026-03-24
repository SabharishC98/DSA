// Last updated: 3/24/2026, 11:31:26 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int l=0,r=n*m-1,mid,row,col;
        while(l<=r){
                mid=l+(r-l)/2;
                row=mid/m;
                col=mid%m;
                if(matrix[row][col]==target) return true;
                else if(matrix[row][col]>target) r=mid-1;
                else l=mid+1;
            }
        return false;
    }
}