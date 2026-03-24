// Last updated: 3/24/2026, 11:22:09 AM
class Solution {
    public int maximumCount(int[] nums) {
        int n=0,i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(nums[i]<0)
            n++;
        }
        return Math.max(n,nums.length-i);
    }
}