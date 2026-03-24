// Last updated: 3/24/2026, 11:28:34 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        // int[][] dp=new int[coins.length+1][amount+1];
        // for(int i=1;i<=amount;i++) dp[0][i]=amount+1;
        // for(int i=1;i<=coins.length;i++){
        //     for(int j=0;j<=amount;j++){
        //         if(j==0){ dp[i][j]=0; continue;}
        //         if(coins[i-1]>j){
        //             dp[i][j]=dp[i-1][j];
        //         }
        //         else{
        //             dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
        //         }
        //     }
        // }
        // if(dp[coins.length][amount]==amount+1) return -1;
        // return dp[coins.length][amount];

        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i) dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        if(dp[amount]==amount+1) return -1;
        return dp[amount];
    }
}