// Last updated: 3/24/2026, 11:23:36 AM
class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=-1;
            else if(nums[i]>0) nums[i]=1;
            p*=nums[i];
            if(p==0) return 0;
        }
        if(p>0) return 1;
        return -1;
    }
}