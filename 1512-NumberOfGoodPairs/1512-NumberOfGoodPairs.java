// Last updated: 9/25/2026, 2:36:45 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0,l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]==nums[j]) c++;
            }
        }
        return c;
    }
}