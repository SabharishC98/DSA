// Last updated: 3/24/2026, 11:22:34 AM
class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        int arr[]=new int[nums.length/2];
        int f=0,index=0;
        for(int i=0;i<nums.length;i+=2){
            if(f==0){
            arr[index++]=Math.min(nums[i],nums[i+1]);
            f=1;}
            else{
                arr[index++]=Math.max(nums[i],nums[i+1]);
            f=0;
            }
        }
        return minMaxGame(arr);
    }
}