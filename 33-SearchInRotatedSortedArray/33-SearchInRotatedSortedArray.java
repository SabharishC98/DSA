// Last updated: 3/24/2026, 11:32:12 AM
class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>=nums[i]){
                if(nums[mid]>=target && target>=nums[i]){
                    j=mid-1;
                    
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[j]){
                    
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            
        }return -1;
    }
}