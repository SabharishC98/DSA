// Last updated: 3/24/2026, 11:30:02 AM
class Solution {
    public int findMin(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];
    }
}