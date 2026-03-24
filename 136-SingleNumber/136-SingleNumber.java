// Last updated: 3/24/2026, 11:30:19 AM
class Solution {
    public int singleNumber(int[] nums) {
        int uni=0;
        for(int i=0;i<nums.length;i++){
            uni^=nums[i];
        }
        return uni;
    }}