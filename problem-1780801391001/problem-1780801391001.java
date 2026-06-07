// Last updated: 6/7/2026, 8:33:11 AM
1class Solution {
2    long[][] dp;
3    long[] prefix;
4    int n,m,l,r;
5    int[] nums;
6    public long maximumSum(int[] nums, int m, int l, int r) {
7        int n=nums.length;
8        prefix=new long[n+1];
9        for(int i=0;i<n;i++){
10            prefix[i+1]=prefix[i]+nums[i];
11        }
12        dp=new long[n+1][m+1];
13        for(int i=0;i<=n;i++){
14            for(int j=0;j<=m;j++){
15                dp[i][j]=Long.MIN_VALUE;
16            }
17        }
18        long ans=Long.MIN_VALUE;
19        for(int i=0;i<=n;i++) dp[i][0]=0;
20        for(int i=1;i<=n;i++){
21            for(int j=0;j<=m;j++){
22                dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
23            }
24            for(int len=l;len<=r;len++){
25                if(i>=len){
26                    long subsum=prefix[i]-prefix[i-len];
27                    for(int j=1;j<=m;j++){
28                        if(dp[i-len][j-1]!=Long.MIN_VALUE){
29                            dp[i][j]=Math.max(dp[i][j],dp[i-len][j-1]+subsum);
30                        }
31                    }
32                }
33            }
34            for(int j=1;j<=m;j++) ans=Math.max(ans,dp[i][j]);
35        }
36        return ans;
37    }
38}