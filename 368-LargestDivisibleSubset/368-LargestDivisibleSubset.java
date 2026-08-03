// Last updated: 8/3/2026, 10:58:51 AM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int[] dp=new int[n];
6        int[] parent=new int[n];
7        Arrays.fill(dp, 1);
8        int maxLen=1;
9        int lastIndex=0;
10        for(int i=0;i<n;i++){
11            parent[i]=i;
12            for(int j=0;j<i;j++){
13                if(nums[i]%nums[j]==0 && dp[j]+1>dp[i]) {
14                    dp[i]=dp[j]+1;
15                    parent[i]=j;
16                }
17            }
18            if(dp[i]>maxLen) {
19                maxLen=dp[i];
20                lastIndex=i;
21            }
22        }
23        List<Integer> ans = new ArrayList<>();
24        while(parent[lastIndex]!=lastIndex) {
25            ans.add(nums[lastIndex]);
26            lastIndex=parent[lastIndex];
27        }
28        ans.add(nums[lastIndex]);
29        Collections.reverse(ans);
30        return ans;
31    }
32}