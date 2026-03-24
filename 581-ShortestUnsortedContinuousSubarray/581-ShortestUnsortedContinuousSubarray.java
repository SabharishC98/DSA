// Last updated: 3/24/2026, 11:27:08 AM
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i];
        Arrays.sort(arr);
        int i=0,j=nums.length-1;
        for(;i<nums.length;i++){
            if(nums[i]!=arr[i]) break;
        }
        if(i==nums.length) return 0;
        for(;j>=0;j--) if(nums[j]!=arr[j]) break;
        

        return j-i+1;
    }
}