// Last updated: 3/24/2026, 11:25:45 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
    public int check(int[] nums,int goal){
        if(goal<0) return 0;
        int i=0,j=0,sum=0,ans=0;
        while(j<nums.length){
            sum+=nums[j];
            while(i<nums.length && sum>goal){
                sum-=nums[i];
                i++;
            }
            
            ans+=j-i+1;j++;
        }
        return ans;
    }
}