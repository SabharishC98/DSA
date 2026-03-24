// Last updated: 3/24/2026, 11:28:48 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return nums[i];
        }
        return -1;
    }
}