// Last updated: 6/4/2026, 11:57:05 AM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int i = 0, zeros = 0, max = 0;
4
5        for (int j = 0; j < nums.length; j++) {
6            if (nums[j] == 0) zeros++;
7            while (zeros > 1) {
8                if (nums[i] == 0) zeros--;
9                i++;
10            }
11
12            max = Math.max(max, j - i);
13        }
14
15        return max;
16    }
17}