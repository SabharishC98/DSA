// Last updated: 9/25/2026, 2:45:07 PM
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int count[]=new int[nums.length];
        Arrays.fill(count,1);
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<nums.length;i++){
            int cur=0,cur_count=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    } else if(dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }
                }
            }
            max=Math.max(max,dp[i]);
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            // System.out.println(dp[i]+" "+count[i]);
            if(dp[i]==max){
                c+=count[i];
            }
        }
        return c;
    }
}