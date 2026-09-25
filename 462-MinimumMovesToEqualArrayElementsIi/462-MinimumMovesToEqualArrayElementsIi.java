// Last updated: 9/25/2026, 2:47:13 PM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int count=0;
        for(int i:nums){
            count+=Math.abs(i-median);
        }
        return count;
    }
}