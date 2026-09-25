// Last updated: 9/25/2026, 2:34:33 PM
class Solution {
   
    public int subsetXORSum(int[] nums) {
         int ans=0;
        for(int i:nums){
            ans|=i;
        }
        return ans<<(nums.length-1);
    }
}