// Last updated: 3/24/2026, 11:28:51 AM
class Solution {
    public int missingNumber(int[] nums) {
        int m=nums[0];
        int min=nums[0],s=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>m) m=nums[i];
            if(nums[i]<min)min=nums[i];
            s+=nums[i];
        }
        int k=m*(m+1)/2;
        if(min!=0) return 0;
        if(k-s==0) return m+1;
        return k-s;
    }
}