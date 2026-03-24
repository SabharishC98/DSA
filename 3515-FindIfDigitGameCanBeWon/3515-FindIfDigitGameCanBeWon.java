// Last updated: 3/24/2026, 11:21:06 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int o=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9) d+=nums[i];
            else o+=nums[i];
        }
        return o!=d;
    }
}