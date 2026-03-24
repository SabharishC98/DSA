// Last updated: 3/24/2026, 11:29:39 AM
class Solution {
    public int rob(int[] nums) {
        int a = 0, b = 0, i = 0;
        while (i < nums.length) {
            int sum = Math.max(b, nums[i] + a);
            a = b;
            b = sum;
            i++;
        }
        return b;
    }
}