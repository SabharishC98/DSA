// Last updated: 6/11/2026, 5:14:30 AM
1class Solution {
2    public int numSquares(int n) {
3        List<Integer> squares=new ArrayList<>();
4        for(int i=1;i*i<=n;i++) {
5            squares.add(i*i);
6        }
7
8        int m=squares.size();
9        int[][] dp=new int[m+1][n+1];
10
11        for(int j=1;j<=n;j++) {
12            dp[0][j]=Integer.MAX_VALUE/2;
13        }
14
15        for(int i=1;i<=m;i++) {
16            int sq=squares.get(i-1);
17            for(int j=1;j<= n;j++) {
18                dp[i][j]=dp[i-1][j];
19                if(j>=sq && dp[i][j-sq]!=Integer.MAX_VALUE/2) {
20                    dp[i][j]=Math.min(dp[i][j],dp[i][j-sq]+1);
21                }
22            }
23        }
24
25        return dp[m][n];
26    }
27}