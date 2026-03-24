// Last updated: 3/24/2026, 11:20:34 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0,c=0;
        for(int i:nums) sum+=i;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>(sum-nums[i])/(nums.length-i-1)) c++;
            sum-=nums[i];
        }
        return c;
    }
}