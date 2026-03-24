// Last updated: 3/24/2026, 11:24:09 AM
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