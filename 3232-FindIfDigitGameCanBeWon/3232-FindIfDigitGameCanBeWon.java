// Last updated: 9/25/2026, 2:26:58 PM
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