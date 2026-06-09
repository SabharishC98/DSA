// Last updated: 6/9/2026, 11:19:16 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
4        for(int i:nums){
5            max=Math.max(max,i);
6            min=Math.min(min,i);
7        }
8        return (max-min)*k;
9    }
10}