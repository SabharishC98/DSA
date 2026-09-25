// Last updated: 9/25/2026, 2:27:17 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean f=true;
            for(int j=0;j<nums.length-1;j++){
                if((nums[j]%2==0 && nums[j+1]%2==0) || (nums[j]%2!=0 && nums[j+1]%2!=0)){
                    f=false;
                    break;
                }
            }
            return f;
    }
}