// Last updated: 9/25/2026, 2:34:18 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) res[i] = nums[nums[i]];
        return res;
    }
}
