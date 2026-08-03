// Last updated: 8/4/2026, 12:17:47 AM
1class Solution {
2    public int climbStairs(int n, int[] costs) {
3        if(n<2){
4            return costs[0]+1;
5        }
6        int[] dp=new int[n+1];
7        dp[1]=costs[0]+1;
8        dp[2]=costs[1]+Math.min(dp[0]+4,dp[1]+1);
9        for(int i=3;i<=n;i++){
10            dp[i]=costs[i-1]+Math.min(dp[i-3]+9,Math.min(dp[i-2]+4,dp[i-1]+1));
11        }
12        return dp[n];
13    }
14}