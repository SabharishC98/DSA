// Last updated: 3/24/2026, 11:27:43 AM
class Solution {
    int c=0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num: nums) sum+=num;
        target = target < 0 ? -1*target : target;
        if((sum+target)%2 == 1) return 0;
        back(nums,target,0);
        return c;
    }
    public void back(int[] nums,int target,int st){
        if(st==nums.length && target==0){
            c++;
            return;
        }
        if(st==nums.length) return;
        back(nums,target-nums[st],st+1);
        back(nums,target+nums[st],st+1);
    }
}