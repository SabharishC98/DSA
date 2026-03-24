// Last updated: 3/24/2026, 11:25:39 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return nums[i];
        }
        return 0;
    }
}