// Last updated: 3/24/2026, 11:23:24 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) res[i] = nums[nums[i]];
        return res;
    }
}
