// Last updated: 3/24/2026, 11:20:54 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int abs=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            int k=Math.abs(nums[i]-nums[i+1]);
            abs=k>abs?k:abs;
        }
        return abs;
    }
}