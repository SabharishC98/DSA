// Last updated: 3/24/2026, 11:28:49 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
        }
        i++;

    }
}
}