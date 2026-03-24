// Last updated: 3/24/2026, 11:26:40 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            s-=nums[i];
            if(s==ls) return i;
            ls+=nums[i];
        }
        return -1;
    }
}