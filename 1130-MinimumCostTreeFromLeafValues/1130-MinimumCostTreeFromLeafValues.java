// Last updated: 8/13/2026, 8:31:24 PM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int m=nums1.length,n=nums2.length;
4        int[][] dp=new int[m][n];
5        for(int[] i:dp) Arrays.fill(i,-1);
6        return maxUCL(m-1,n-1,nums1,nums2,dp);
7    }
8    public int maxUCL(int i,int j,int[] arr1,int[] arr2,int[][] dp){
9        if(i<0 || j<0) return 0;
10        if(dp[i][j]!=-1) return dp[i][j];
11        if(arr1[i]==arr2[j]){
12            return dp[i][j]=1+maxUCL(i-1,j-1,arr1,arr2,dp);
13        }
14        else{
15            int l=maxUCL(i,j-1,arr1,arr2,dp);
16            int r=maxUCL(i-1,j,arr1,arr2,dp);
17            return dp[i][j]=Math.max(l,r);
18        }
19    }
20}