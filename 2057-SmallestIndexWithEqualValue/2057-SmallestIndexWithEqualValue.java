// Last updated: 9/25/2026, 2:33:23 PM
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]) return i;
        }
        return -1;
    }
}