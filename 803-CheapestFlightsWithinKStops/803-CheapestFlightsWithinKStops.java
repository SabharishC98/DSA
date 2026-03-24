// Last updated: 3/24/2026, 11:26:17 AM
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int []dp=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[src]=0;
        for(int i=0;i<=k;i++){
            int[] temp=dp.clone();
            for(int j[]:flights){
                int u=j[0];
                int v=j[1];
                int w=j[2];
                if(dp[u]!=Integer.MAX_VALUE && dp[u]+w<temp[v]) temp[v]=dp[u]+w;
            }
            dp=temp;
        }
        if(dp[dst]==Integer.MAX_VALUE) return -1;
        return dp[dst];
    }
}