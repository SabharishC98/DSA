// Last updated: 3/24/2026, 11:31:37 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1) return 0;
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0]=1;
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1) continue;
                if(i==0 && j!=0) dp[i][j]=dp[i][j-1];
                else if(i!=0 && j==0) dp[i][j]=dp[i-1][j];
                else if(i!=0 && j!=0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}