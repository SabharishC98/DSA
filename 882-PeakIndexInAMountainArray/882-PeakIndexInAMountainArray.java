// Last updated: 3/24/2026, 11:26:05 AM
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid!=0 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]>nums[mid+1]) j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
}