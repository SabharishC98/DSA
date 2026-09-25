// Last updated: 9/25/2026, 2:48:58 PM
class Solution {
    int[][] memo;
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        memo=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(memo[i],-1);
        int longest=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(memo[i][j]==-1){
                    memo[i][j]=dfs(matrix,i,j);
                }
                longest=Math.max(longest,memo[i][j]);
            }
        }
        return longest;
    }
    public int dfs(int[][] matrix,int x,int y){
        if(memo[x][y]!=-1) return memo[x][y];
        int max=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] i:dir){
            int newx=i[0]+x;
            int newy=i[1]+y;
            if(newx<0 || newy<0 || newx>=m || newy>=n) continue;
            if(matrix[x][y]<matrix[newx][newy]){
                if(memo[newx][newy]==-1){
                    memo[newx][newy]=dfs(matrix,newx,newy);
                }
                max=Math.max(max,memo[newx][newy]);
            }
        }
        return max+1;
    }
}