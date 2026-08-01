// Last updated: 8/2/2026, 12:55:02 AM
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        int[] dp=new int[nums.length];
4        int count[]=new int[nums.length];
5        Arrays.fill(count,1);
6        Arrays.fill(dp,1);
7        int max=1;
8        for(int i=1;i<nums.length;i++){
9            int cur=0,cur_count=1;
10            for(int j=i-1;j>=0;j--){
11                if(nums[j]<nums[i]){
12                    if(dp[j]+1>dp[i]){
13                        dp[i]=dp[j]+1;
14                        count[i]=count[j];
15                    } else if(dp[j]+1==dp[i]){
16                        count[i]+=count[j];
17                    }
18                }
19            }
20            max=Math.max(max,dp[i]);
21        }
22        int c=0;
23        for(int i=0;i<nums.length;i++){
24            // System.out.println(dp[i]+" "+count[i]);
25            if(dp[i]==max){
26                c+=count[i];
27            }
28        }
29        return c;
30    }
31}