// Last updated: 3/24/2026, 11:28:41 AM
class Solution {
    int max=1;
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        for(int i:dp) max=Math.max(max,i);
        return max;
    }
    
}