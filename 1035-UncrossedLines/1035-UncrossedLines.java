// Last updated: 9/25/2026, 2:40:23 PM
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[][] dp=new int[m][n];
        for(int[] i:dp) Arrays.fill(i,-1);
        return maxUCL(m-1,n-1,nums1,nums2,dp);
    }
    public int maxUCL(int i,int j,int[] arr1,int[] arr2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(arr1[i]==arr2[j]){
            return dp[i][j]=1+maxUCL(i-1,j-1,arr1,arr2,dp);
        }
        else{
            int l=maxUCL(i,j-1,arr1,arr2,dp);
            int r=maxUCL(i-1,j,arr1,arr2,dp);
            return dp[i][j]=Math.max(l,r);
        }
    }
}