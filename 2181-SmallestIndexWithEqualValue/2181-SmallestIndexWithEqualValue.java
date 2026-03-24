// Last updated: 3/24/2026, 11:23:07 AM
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]) return i;
        }
        return -1;
    }
}