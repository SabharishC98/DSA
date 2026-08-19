// Last updated: 8/19/2026, 12:23:37 PM
1class Solution {
2    public long minCost(int[] nums, int[] cost) {
3        long low=0,high=0;
4        for(int i=0;i<nums.length;i++){
5            low=Math.min(low,nums[i]);
6            high=Math.max(high,nums[i]);
7        }
8
9        long ans=Long.MAX_VALUE;
10        while(low<=high){
11            long mid=low+ (high-low)/2;
12            long x=cost(mid,nums,cost);
13            long y=cost(mid+1,nums,cost);
14            ans=Math.min(ans,Math.min(x,y));
15            if(x<=y){
16                high=mid-1;
17            }else{
18                low=mid+1;
19            }
20        }
21        return ans;
22    }
23    public long cost(long m,int a[],int c[]){
24    long cost=0;
25        for(int i=0;i<a.length;i++){
26            cost+=Math.abs(m-a[i])*c[i];
27        }
28        return cost;
29    }
30}