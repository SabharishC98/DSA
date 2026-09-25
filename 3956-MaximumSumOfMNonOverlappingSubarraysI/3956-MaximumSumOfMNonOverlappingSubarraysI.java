// Last updated: 9/25/2026, 2:25:14 PM
class Solution {
    long[][] dp;
    long[] prefix;
    int n,m,l,r;
    int[] nums;
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n=nums.length;
        prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        dp=new long[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=Long.MIN_VALUE;
            }
        }
        long ans=Long.MIN_VALUE;
        for(int i=0;i<=n;i++) dp[i][0]=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
            }
            for(int len=l;len<=r;len++){
                if(i>=len){
                    long subsum=prefix[i]-prefix[i-len];
                    for(int j=1;j<=m;j++){
                        if(dp[i-len][j-1]!=Long.MIN_VALUE){
                            dp[i][j]=Math.max(dp[i][j],dp[i-len][j-1]+subsum);
                        }
                    }
                }
            }
            for(int j=1;j<=m;j++) ans=Math.max(ans,dp[i][j]);
        }
        return ans;
    }
}