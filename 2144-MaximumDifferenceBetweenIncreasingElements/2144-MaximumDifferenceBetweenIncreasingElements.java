// Last updated: 3/24/2026, 11:23:11 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i]) max=Math.max(max,nums[j]-nums[i]);}
        }
        if(max==0) return -1;
        return max;
    }
}