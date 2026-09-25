// Last updated: 9/25/2026, 2:32:03 PM
class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Math.abs(nums[0]),ele=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            min=min<Math.abs(nums[i])?min:Math.abs(nums[i]);
            if(min==Math.abs(nums[i])) ele=nums[i];
        }
        return ele;
    }
}