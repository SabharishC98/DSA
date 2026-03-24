// Last updated: 3/24/2026, 11:27:14 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length) return mat;
        int in=0;
        int[] check=new int[r*c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                check[in++]=mat[i][j];
            }
        }
        in=0;
        int[][] ans=new int[r][c];
        int ci=0,ri=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=check[in++];
                
            }
        }
        return ans;
    }
}