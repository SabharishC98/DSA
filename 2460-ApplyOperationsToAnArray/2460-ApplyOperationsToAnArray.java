// Last updated: 9/25/2026, 2:30:41 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
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
        
        return nums;
    }
}