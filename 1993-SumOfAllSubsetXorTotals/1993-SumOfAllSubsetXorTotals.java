// Last updated: 3/24/2026, 11:23:29 AM
class Solution {
   
    public int subsetXORSum(int[] nums) {
         int ans=0;
        for(int i:nums){
            ans|=i;
        }
        return ans<<(nums.length-1);
    }
}