// Last updated: 9/25/2026, 2:26:43 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int i=0;
        while(i<nums.length){
            int ind=nums[i];
            if(nums[i]!=nums[ind]){
                int t=nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
            }
            else{
                i++;
            }
        }
        int k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i) arr[k++]=nums[i];
        }
        return arr;
    
    }
}