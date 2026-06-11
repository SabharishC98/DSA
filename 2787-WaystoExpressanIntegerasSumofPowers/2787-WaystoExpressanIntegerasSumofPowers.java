// Last updated: 6/11/2026, 5:45:52 AM
1class Solution {
2    public int numberOfWays(int n, int x) {
3        List<Integer> powers=new ArrayList<>();
4        for(int i=1;(int)Math.pow(i, x)<=n;i++){
5            powers.add((int)Math.pow(i, x));
6        }
7        int m=powers.size();
8        int MOD=(int)1e9+7;
9        long[][] dp=new long[m+1][n+1];
10
11        for(int i=0;i<=m;i++){
12            dp[i][0]=1;
13        }
14        for(int i=1;i<=m;i++){
15            int pw=powers.get(i-1);
16            for(int j=1;j<=n;j++){
17                dp[i][j]=dp[i-1][j];
18                if(j>=pw){
19                    dp[i][j]=(dp[i][j]+dp[i-1][j-pw])%MOD;
20                }
21            }
22        }
23
24        return (int)dp[m][n];
25    }
26}