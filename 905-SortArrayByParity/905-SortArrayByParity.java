// Last updated: 9/25/2026, 2:42:23 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
        return nums;
    }
}