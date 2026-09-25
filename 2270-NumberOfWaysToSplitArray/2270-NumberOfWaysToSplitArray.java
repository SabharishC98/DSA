// Last updated: 9/25/2026, 2:31:59 PM
class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        long ls=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            sum-=nums[i];
            if(ls>=sum) c++;
        }
        return c;
    }
}