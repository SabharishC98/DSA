// Last updated: 3/24/2026, 11:22:54 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int ind = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                res[ind++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                res[ind++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                res[ind++] = nums[i];
            }
        }
        return res;
    }
}