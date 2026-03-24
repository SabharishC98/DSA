// Last updated: 3/24/2026, 11:32:10 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target) return mid;
            if(mid!=0 && target>nums[mid-1] && target<nums[mid]){
                return mid;
            }
            if(nums[mid]>target) j=mid-1;
            else i=mid+1;
        }
        return 0;
    }
}