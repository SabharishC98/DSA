// Last updated: 9/25/2026, 2:34:51 PM
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