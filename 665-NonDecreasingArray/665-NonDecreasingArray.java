// Last updated: 9/25/2026, 2:45:20 PM
class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]>nums[i+1]){
                c++;
                if(c>1) return false;
                if(i==0 || nums[i-1]<=nums[i+1]){
                    nums[i]=nums[i+1];
                }
                else{
                    nums[i+1]=nums[i];
                }
            }
        }
        return true;
    }
}