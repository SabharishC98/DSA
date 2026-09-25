// Last updated: 9/25/2026, 2:36:59 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, zeros = 0, max = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) zeros++;
            while (zeros > 1) {
                if (nums[i] == 0) zeros--;
                i++;
            }

            max = Math.max(max, j - i);
        }

        return max;
    }
}