// Last updated: 9/25/2026, 2:32:41 PM
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