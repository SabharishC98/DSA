// Last updated: 3/24/2026, 11:28:11 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int left=nums[0],right=0;
        for(int i:nums){
            right+=i;
            left=Math.max(left,i);
        }
        while(left<right){
            int mid=(left+right)/2;
            if(check(nums,k,mid)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    public boolean check(int[] nums,int k,int max){
        int cur=0,ans=1;
        for(int i:nums){
            if(cur+i>max){
                ans++;
                cur=i;
                if(ans>k) return false;
            }
            else cur+=i;
        }
        return ans<=k;
    }
}