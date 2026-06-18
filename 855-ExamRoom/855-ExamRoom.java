// Last updated: 6/18/2026, 6:39:40 AM
1class Solution {
2    public int minMoves(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int sum=0;    
5        for(int num:nums){
6            min=Math.min(min,num);
7            sum+=num;
8        }
9        return sum-min*nums.length;
10    }
11}