// Last updated: 9/25/2026, 2:28:44 PM
class Solution {
    public int numberOfWays(int n, int x) {
        List<Integer> powers=new ArrayList<>();
        for(int i=1;(int)Math.pow(i, x)<=n;i++){
            powers.add((int)Math.pow(i, x));
        }
        int m=powers.size();
        int MOD=(int)1e9+7;
        long[][] dp=new long[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=m;i++){
            int pw=powers.get(i-1);
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=pw){
                    dp[i][j]=(dp[i][j]+dp[i-1][j-pw])%MOD;
                }
            }
        }

        return (int)dp[m][n];
    }
}