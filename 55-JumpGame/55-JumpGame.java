// Last updated: 3/24/2026, 11:31:45 AM
class Solution {
    public boolean canJump(int[] nums) {
        int far=0;
        for(int i=0;i<nums.length;i++){
            if(i>far) return false;
            far=Math.max(far,i+nums[i]);
            if(far>=nums.length-1) return true;

        }
        return false;

    }
}
