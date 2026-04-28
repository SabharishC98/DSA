// Last updated: 4/29/2026, 12:03:11 AM
1class Solution {
2    public int minMoves2(int[] nums) {
3        Arrays.sort(nums);
4        int median=nums[nums.length/2];
5        int count=0;
6        for(int i:nums){
7            count+=Math.abs(i-median);
8        }
9        return count;
10    }
11}