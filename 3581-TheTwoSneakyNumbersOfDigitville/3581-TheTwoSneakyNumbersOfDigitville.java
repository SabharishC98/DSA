// Last updated: 3/24/2026, 11:21:02 AM
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