// Last updated: 3/24/2026, 11:26:00 AM
class Solution {
    public int minEatingSpeed(int[] nums, int k) {
        int left=1,right=nums[0];
        for(int i:nums){
            right=Math.max(right,i);
        }
        while(left<right){
            int mid=(left+right)/2;
            if(check(nums,k,mid)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    public boolean check(int[] piles,int h,int k){
        long hoursNeeded = 0;
        
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k;
            
            if (hoursNeeded > h) {
                return false;
            }
        }
        
        return hoursNeeded <= h;
    }
}