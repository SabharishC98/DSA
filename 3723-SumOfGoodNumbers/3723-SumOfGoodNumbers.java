// Last updated: 3/24/2026, 11:20:56 AM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        int n = nums.length;
         for (int i = 0; i < n; i++) {
            boolean isGood = true;

            int left = i - k;
            if (left >= 0 && nums[i] <= nums[left]) {
                isGood = false;
            }

            int right = i + k;
            if (right < n && nums[i] <= nums[right]) {
                isGood = false;
            }

            if (isGood) {
                sum += nums[i];
            }
        }
        return sum;
    }
}