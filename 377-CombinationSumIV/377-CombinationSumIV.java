// Last updated: 6/11/2026, 6:05:44 AM
1class Solution {
2    public int combinationSum4(int[] nums, int target) {
3        int[] dp=new int[target+1];
4        dp[0]=1;
5
6        for(int j=1;j<=target;j++){
7            for(int num:nums){
8                if(j>=num){
9                    dp[j]+=dp[j-num];
10                }
11            }
12        }
13
14        return dp[target];
15    }
16}