// Last updated: 9/25/2026, 2:38:15 PM
class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return n-longest(s,0,n-1,dp);
    }
    public int longest(String s,int i,int j,int[][] dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s.charAt(i)==s.charAt(j)){
            if(i==j){
                ans++;
            }
            else{
                ans+=2;
            }
        }
        if(ans!=0){
            ans+=longest(s,i+1,j-1,dp);
        }
        ans=Math.max(ans,Math.max(longest(s,i,j-1,dp),longest(s,i+1,j,dp)));
        return dp[i][j]=ans;
    }
}