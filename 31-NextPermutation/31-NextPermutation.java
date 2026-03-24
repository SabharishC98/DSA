// Last updated: 3/24/2026, 11:32:15 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int j=nums.length-1;j>pivot;j--){
            if(nums[j]>nums[pivot]){
                int temp=nums[pivot];
                nums[pivot]=nums[j];
                nums[j]=temp;    
                break;       
            }
        }
        reverse(nums,pivot+1,nums.length-1);
    }
    public void reverse(int[] nums,int st,int end){
        while(st<end){
            int t=nums[st];
            nums[st]=nums[end];
            nums[end]=t;
            st++;
            end--;
        }
    }
}