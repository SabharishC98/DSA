// Last updated: 9/25/2026, 2:34:05 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int s=0,ls=0;
        for(int i:nums) s+=i;
        for(int i=0;i<nums.length;i++){
            s-=nums[i];
            if(ls==s) return i;
            ls+=nums[i];
            
        }
        return -1;
    }
}