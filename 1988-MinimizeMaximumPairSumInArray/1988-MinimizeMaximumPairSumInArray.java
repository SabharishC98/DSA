// Last updated: 3/24/2026, 11:23:30 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int max=0;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
}
}