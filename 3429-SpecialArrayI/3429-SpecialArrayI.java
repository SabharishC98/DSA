// Last updated: 3/24/2026, 11:21:10 AM
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