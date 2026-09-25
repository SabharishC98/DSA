// Last updated: 9/25/2026, 2:31:28 PM
class Solution {
    long[][] memo;
    int m,n;
    int MOD = 1_000_000_007;
    public int countPaths(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        memo=new long[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(memo[i],-1);
        long longest=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(memo[i][j]==-1){
                    dfs(matrix,i,j);
                }
                longest = (longest + memo[i][j]) % MOD;
            }
        }
        return (int) longest;
    }
    public long dfs(int[][] matrix,int x,int y){
        if(memo[x][y]!=-1) return memo[x][y];
        memo[x][y]=1;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] i:dir){
            int newx=i[0]+x;
            int newy=i[1]+y;
            if(newx<0 || newy<0 || newx>=m || newy>=n) continue;
            if(matrix[x][y]<matrix[newx][newy]){
                if(memo[newx][newy]==-1){
                    memo[newx][newy]=dfs(matrix,newx,newy);
                }
                memo[x][y] = (memo[x][y] + memo[newx][newy]) % MOD;
            }
        }
        
        return memo[x][y];
    }
}