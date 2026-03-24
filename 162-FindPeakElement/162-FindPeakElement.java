// Last updated: 3/24/2026, 11:29:57 AM
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int i=0,j=nums.length-1;
        while(i<=j){
            if(i==0 && nums[i]>nums[i+1]) return i;
            if(j==nums.length-1 && nums[j]>nums[j-1]) return j;
            if(i!=0 && nums[i]>nums[i+1] && nums[i]>nums[i-1]) return i;
            if(j!=nums.length-1 && nums[j]>nums[j+1] && nums[j]>nums[j-1]) return j;
            i++;
            j--;
        }
        return -1;
    }
}