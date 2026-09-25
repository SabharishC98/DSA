// Last updated: 9/25/2026, 2:25:30 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
        if(n<2){
            return costs[0]+1;
        }
        int[] dp=new int[n+1];
        dp[1]=costs[0]+1;
        dp[2]=costs[1]+Math.min(dp[0]+4,dp[1]+1);
        for(int i=3;i<=n;i++){
            dp[i]=costs[i-1]+Math.min(dp[i-3]+9,Math.min(dp[i-2]+4,dp[i-1]+1));
        }
        return dp[n];
    }
}