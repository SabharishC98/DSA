// Last updated: 9/25/2026, 2:42:34 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int f=0,flag=0;
        for(int i=1;i<nums.length;i++){
            if(flag==0 && nums[i]==nums[i-1]){ 
                continue;
            }
            if(flag==0 && nums[i]>nums[i-1]){
                flag=1;
                f=1;
            }
            else if(flag==0 && nums[i]<nums[i-1]){ f=0;flag=1;}
            if(f==0 && nums[i]>nums[i-1]) return false;
            if(f==1 && nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}